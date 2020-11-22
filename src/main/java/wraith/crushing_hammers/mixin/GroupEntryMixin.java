package wraith.crushing_hammers.mixin;

import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.entry.GroupEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(GroupEntry.class)
public interface GroupEntryMixin {

    @Invoker("<init>")
    static GroupEntry newInstance(LootPoolEntry[] lootPoolEntrys, LootCondition[] lootConditions){
        throw new UnsupportedOperationException("mixin not transformed");
    }

}
