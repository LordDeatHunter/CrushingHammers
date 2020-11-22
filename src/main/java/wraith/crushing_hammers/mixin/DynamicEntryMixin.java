package wraith.crushing_hammers.mixin;

import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.entry.DynamicEntry;
import net.minecraft.loot.function.LootFunction;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(DynamicEntry.class)
public interface DynamicEntryMixin {

    @Invoker("<init>")
    static DynamicEntry newInstance(Identifier name, int weight, int quality, LootCondition[] conditions, LootFunction[] functions){
        throw new UnsupportedOperationException("mixin not transformed");
    }

}
