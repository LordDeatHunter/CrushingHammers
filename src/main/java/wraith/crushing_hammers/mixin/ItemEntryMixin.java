package wraith.crushing_hammers.mixin;

import net.minecraft.item.Item;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.LootFunction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(ItemEntry.class)
public interface ItemEntryMixin {

    @Invoker("<init>")
    static ItemEntry newInstance(Item item, int weight, int quality, LootCondition[] conditions, LootFunction[] functions){
        throw new UnsupportedOperationException("mixin not transformed");
    }

}
