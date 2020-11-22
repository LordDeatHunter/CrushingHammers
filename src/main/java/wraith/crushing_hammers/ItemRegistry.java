package wraith.crushing_hammers;

import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;

public class ItemRegistry {
    public static HashMap<String, Item> ITEMS = new HashMap<String, Item>(){{
        put("wooden_hammer", new HammerTool(ToolMaterials.WOOD, 0, -3f, new Item.Settings().group(ItemGroup.HAMMERS)));
        put("stone_hammer", new HammerTool(ToolMaterials.STONE, 1, -3f, new Item.Settings().group(ItemGroup.HAMMERS)));
        put("iron_hammer", new HammerTool(ToolMaterials.IRON, 2, -3f, new Item.Settings().group(ItemGroup.HAMMERS)));
        put("golden_hammer", new HammerTool(ToolMaterials.GOLD, 0, -3f, new Item.Settings().group(ItemGroup.HAMMERS)));
        put("diamond_hammer", new HammerTool(ToolMaterials.DIAMOND, 3, -3f, new Item.Settings().group(ItemGroup.HAMMERS)));
        put("netherite_hammer", new HammerTool(ToolMaterials.NETHERITE, 4, -3f, new Item.Settings().group(ItemGroup.HAMMERS)));

        put("andesite_bricks", new BlockItem(BlockRegistry.BLOCKS.get("andesite_bricks"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("andesite_cobblestone", new BlockItem(BlockRegistry.BLOCKS.get("andesite_cobblestone"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("andesite_gravel", new BlockItem(BlockRegistry.BLOCKS.get("andesite_gravel"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("andesite_sand", new BlockItem(BlockRegistry.BLOCKS.get("andesite_sand"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("granite_bricks", new BlockItem(BlockRegistry.BLOCKS.get("granite_bricks"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("granite_cobblestone", new BlockItem(BlockRegistry.BLOCKS.get("granite_cobblestone"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("granite_gravel", new BlockItem(BlockRegistry.BLOCKS.get("granite_gravel"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("granite_sand", new BlockItem(BlockRegistry.BLOCKS.get("granite_sand"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("diorite_bricks", new BlockItem(BlockRegistry.BLOCKS.get("diorite_bricks"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("diorite_cobblestone", new BlockItem(BlockRegistry.BLOCKS.get("diorite_cobblestone"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("diorite_gravel", new BlockItem(BlockRegistry.BLOCKS.get("diorite_gravel"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("diorite_sand", new BlockItem(BlockRegistry.BLOCKS.get("diorite_sand"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("netherrack_cobblestone", new BlockItem(BlockRegistry.BLOCKS.get("netherrack_cobblestone"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("netherrack_gravel", new BlockItem(BlockRegistry.BLOCKS.get("netherrack_gravel"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("netherrack_sand", new BlockItem(BlockRegistry.BLOCKS.get("netherrack_sand"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("andesite_brick_slab", new BlockItem(BlockRegistry.BLOCKS.get("andesite_brick_slab"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("granite_brick_slab", new BlockItem(BlockRegistry.BLOCKS.get("granite_brick_slab"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("diorite_brick_slab", new BlockItem(BlockRegistry.BLOCKS.get("diorite_brick_slab"), new Item.Settings().group(ItemGroup.BLOCKS)));

        put("red_concrete_cobblestone", new BlockItem(BlockRegistry.BLOCKS.get("red_concrete_cobblestone"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("green_concrete_cobblestone", new BlockItem(BlockRegistry.BLOCKS.get("green_concrete_cobblestone"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("lime_concrete_cobblestone", new BlockItem(BlockRegistry.BLOCKS.get("lime_concrete_cobblestone"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("yellow_concrete_cobblestone", new BlockItem(BlockRegistry.BLOCKS.get("yellow_concrete_cobblestone"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("orange_concrete_cobblestone", new BlockItem(BlockRegistry.BLOCKS.get("orange_concrete_cobblestone"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("blue_concrete_cobblestone", new BlockItem(BlockRegistry.BLOCKS.get("blue_concrete_cobblestone"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("cyan_concrete_cobblestone", new BlockItem(BlockRegistry.BLOCKS.get("cyan_concrete_cobblestone"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("light_blue_concrete_cobblestone", new BlockItem(BlockRegistry.BLOCKS.get("light_blue_concrete_cobblestone"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("light_gray_concrete_cobblestone", new BlockItem(BlockRegistry.BLOCKS.get("light_gray_concrete_cobblestone"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("gray_concrete_cobblestone", new BlockItem(BlockRegistry.BLOCKS.get("gray_concrete_cobblestone"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("black_concrete_cobblestone", new BlockItem(BlockRegistry.BLOCKS.get("black_concrete_cobblestone"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("white_concrete_cobblestone", new BlockItem(BlockRegistry.BLOCKS.get("white_concrete_cobblestone"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("brown_concrete_cobblestone", new BlockItem(BlockRegistry.BLOCKS.get("brown_concrete_cobblestone"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("magenta_concrete_cobblestone", new BlockItem(BlockRegistry.BLOCKS.get("magenta_concrete_cobblestone"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("purple_concrete_cobblestone", new BlockItem(BlockRegistry.BLOCKS.get("purple_concrete_cobblestone"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("pink_concrete_cobblestone", new BlockItem(BlockRegistry.BLOCKS.get("pink_concrete_cobblestone"), new Item.Settings().group(ItemGroup.BLOCKS)));

        put("end_gravel", new BlockItem(BlockRegistry.BLOCKS.get("end_gravel"), new Item.Settings().group(ItemGroup.BLOCKS)));
        put("end_sand", new BlockItem(BlockRegistry.BLOCKS.get("end_sand"), new Item.Settings().group(ItemGroup.BLOCKS)));

        put("gold_chunk", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("iron_chunk", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("obsidian_chunk", new Item(new Item.Settings().group(ItemGroup.ITEMS)));

        put("glass_pile", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("glass_shard", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("glass_sabre", new SwordItem(CustomToolMaterial.GLASS, 3, -1.8F, new Item.Settings().group(ItemGroup.ITEMS)));

        put("red_stained_glass_pile", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("red_stained_glass_shard", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("red_stained_glass_sabre", new SwordItem(CustomToolMaterial.GLASS, 3, -1.8F, new Item.Settings().group(ItemGroup.ITEMS)));
        put("orange_stained_glass_pile", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("orange_stained_glass_shard", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("orange_stained_glass_sabre", new SwordItem(CustomToolMaterial.GLASS, 3, -1.8F, new Item.Settings().group(ItemGroup.ITEMS)));
        put("yellow_stained_glass_pile", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("yellow_stained_glass_shard", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("yellow_stained_glass_sabre", new SwordItem(CustomToolMaterial.GLASS, 3, -1.8F, new Item.Settings().group(ItemGroup.ITEMS)));
        put("green_stained_glass_pile", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("green_stained_glass_shard", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("green_stained_glass_sabre", new SwordItem(CustomToolMaterial.GLASS, 3, -1.8F, new Item.Settings().group(ItemGroup.ITEMS)));
        put("lime_stained_glass_pile", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("lime_stained_glass_shard", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("lime_stained_glass_sabre", new SwordItem(CustomToolMaterial.GLASS, 3, -1.8F, new Item.Settings().group(ItemGroup.ITEMS)));
        put("blue_stained_glass_pile", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("blue_stained_glass_shard", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("blue_stained_glass_sabre", new SwordItem(CustomToolMaterial.GLASS, 3, -1.8F, new Item.Settings().group(ItemGroup.ITEMS)));
        put("light_blue_stained_glass_pile", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("light_blue_stained_glass_shard", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("light_blue_stained_glass_sabre", new SwordItem(CustomToolMaterial.GLASS, 3, -1.8F, new Item.Settings().group(ItemGroup.ITEMS)));
        put("cyan_stained_glass_pile", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("cyan_stained_glass_shard", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("cyan_stained_glass_sabre", new SwordItem(CustomToolMaterial.GLASS, 3, -1.8F, new Item.Settings().group(ItemGroup.ITEMS)));
        put("purple_stained_glass_pile", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("purple_stained_glass_shard", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("purple_stained_glass_sabre", new SwordItem(CustomToolMaterial.GLASS, 3, -1.8F, new Item.Settings().group(ItemGroup.ITEMS)));
        put("magenta_stained_glass_pile", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("magenta_stained_glass_shard", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("magenta_stained_glass_sabre", new SwordItem(CustomToolMaterial.GLASS, 3, -1.8F, new Item.Settings().group(ItemGroup.ITEMS)));
        put("pink_stained_glass_pile", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("pink_stained_glass_shard", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("pink_stained_glass_sabre", new SwordItem(CustomToolMaterial.GLASS, 3, -1.8F, new Item.Settings().group(ItemGroup.ITEMS)));
        put("brown_stained_glass_pile", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("brown_stained_glass_shard", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("brown_stained_glass_sabre", new SwordItem(CustomToolMaterial.GLASS, 3, -1.8F, new Item.Settings().group(ItemGroup.ITEMS)));
        put("white_stained_glass_pile", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("white_stained_glass_shard", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("white_stained_glass_sabre", new SwordItem(CustomToolMaterial.GLASS, 3, -1.8F, new Item.Settings().group(ItemGroup.ITEMS)));
        put("gray_stained_glass_pile", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("gray_stained_glass_shard", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("gray_stained_glass_sabre", new SwordItem(CustomToolMaterial.GLASS, 3, -1.8F, new Item.Settings().group(ItemGroup.ITEMS)));
        put("light_gray_stained_glass_pile", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("light_gray_stained_glass_shard", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("light_gray_stained_glass_sabre", new SwordItem(CustomToolMaterial.GLASS, 3, -1.8F, new Item.Settings().group(ItemGroup.ITEMS)));
        put("black_stained_glass_pile", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("black_stained_glass_shard", new Item(new Item.Settings().group(ItemGroup.ITEMS)));
        put("black_stained_glass_sabre", new SwordItem(CustomToolMaterial.GLASS, 3, -1.8F, new Item.Settings().group(ItemGroup.ITEMS)));
    }};

    public static int registerItems(){
        for (String itemID : ITEMS.keySet()){
            Registry.register(Registry.ITEM, new Identifier(CrushingHammers.MOD_ID, itemID), ITEMS.get(itemID));
        }
        HashMap<String, Item> items = new HashMap<String, Item>(){{
            put("andesite_brick_stairs", new BlockItem(BlockRegistry.BLOCKS.get("andesite_brick_stairs"), new Item.Settings().group(ItemGroup.BLOCKS)));
            put("diorite_brick_stairs", new BlockItem(BlockRegistry.BLOCKS.get("diorite_brick_stairs"), new Item.Settings().group(ItemGroup.BLOCKS)));
            put("granite_brick_stairs", new BlockItem(BlockRegistry.BLOCKS.get("granite_brick_stairs"), new Item.Settings().group(ItemGroup.BLOCKS)));
        }};
        for (String itemID : items.keySet()){
            Registry.register(Registry.ITEM, new Identifier(CrushingHammers.MOD_ID, itemID), items.get(itemID));
        }
        ITEMS.putAll(items);
        return ITEMS.size();
    }
}
