package wraith.crushing_hammers.mixin;

import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(LootTable.Builder.class)
public interface LootTableAccessor {

    @Accessor("pools")
    void setPools(List<LootPool> pools);

    @Accessor("pools")
    List<LootPool> getPools();
}
