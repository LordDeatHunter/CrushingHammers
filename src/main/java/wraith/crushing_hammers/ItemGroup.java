package wraith.crushing_hammers;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ItemGroup {
    public static final net.minecraft.item.ItemGroup HAMMERS = FabricItemGroupBuilder.create(new Identifier(CrushingHammers.MOD_ID, "hammers")).icon(() -> new ItemStack(ItemRegistry.ITEMS.get("diamond_hammer"))).build();
    public static final net.minecraft.item.ItemGroup ITEMS = FabricItemGroupBuilder.create(new Identifier(CrushingHammers.MOD_ID, "items")).icon(() -> new ItemStack(ItemRegistry.ITEMS.get("red_stained_glass_sabre"))).build();
    public static final net.minecraft.item.ItemGroup BLOCKS = FabricItemGroupBuilder.create(new Identifier(CrushingHammers.MOD_ID, "blocks")).icon(() -> new ItemStack(ItemRegistry.ITEMS.get("granite_cobblestone"))).build();
}
