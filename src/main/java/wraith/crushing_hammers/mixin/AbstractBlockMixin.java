package wraith.crushing_hammers.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import wraith.crushing_hammers.HammerDrop;
import wraith.crushing_hammers.ItemTags;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Mixin(AbstractBlock.class)
public abstract class AbstractBlockMixin {

    @Shadow public abstract Identifier getLootTableId();

    @Inject(at = @At("HEAD"), method = "getDroppedStacks", cancellable = true)
    public void cancelDrops(BlockState state, LootContext.Builder builder, CallbackInfoReturnable<List<ItemStack>> ci) {

        String id = Registry.BLOCK.getId(state.getBlock()).toString();


        ItemStack tool = builder.get(LootContextParameters.TOOL).copy();

        if (ItemTags.HAMMERS.contains(builder.get(LootContextParameters.TOOL).getItem())) {
            Identifier tableID = getLootTableId();
            if (HammerDrop.BREAK_RESULT.containsKey(id)) {
                ci.setReturnValue(HammerDrop.getDrops(id, tool));
                ci.cancel();
            }
            else if (tableID == LootTables.EMPTY) {
                ci.setReturnValue(Collections.emptyList());
                ci.cancel();
            }
            else if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, tool) > 0) {
                ItemStack toolNoSilk = tool.copy();
                Map<Enchantment, Integer> map = EnchantmentHelper.get(toolNoSilk);
                map.remove(Enchantments.SILK_TOUCH);
                EnchantmentHelper.set(map, toolNoSilk);

                LootContext lootContext = builder
                        .parameter(LootContextParameters.BLOCK_STATE, state)
                        .parameter(LootContextParameters.TOOL, toolNoSilk)
                        .build(LootContextTypes.BLOCK);

                ServerWorld serverWorld = lootContext.getWorld();
                LootTable lootTable = serverWorld.getServer().getLootManager().getTable(tableID);

                ci.setReturnValue(lootTable.generateLoot(lootContext));
                ci.cancel();
            }
        }

    }

}
