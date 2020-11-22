package wraith.crushing_hammers.mixin;

import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.entry.SequenceEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(SequenceEntry.class)
public interface SequenceEntryMixin {

    @Invoker("<init>")
    static SequenceEntry newInstance(LootPoolEntry[] lootPoolEntrys, LootCondition[] lootConditions){
        throw new UnsupportedOperationException("mixin not transformed");
    }

}
