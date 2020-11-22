package wraith.crushing_hammers;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;

public class BlockRegistry {

    public static HashMap<String, Block> BLOCKS = new HashMap<String, Block>(){{
        put("andesite_bricks", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));
        put("andesite_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));
        put("andesite_gravel", new GravelBlock(FabricBlockSettings.of(Material.AGGREGATE).breakByTool(FabricToolTags.SHOVELS).strength(0.6f).sounds(BlockSoundGroup.GRAVEL)));
        put("andesite_sand", new SandBlock(5446684, FabricBlockSettings.of(Material.AGGREGATE).breakByTool(FabricToolTags.SHOVELS).strength(0.5f).sounds(BlockSoundGroup.SAND)));

        put("granite_bricks", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));
        put("granite_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));
        put("granite_gravel", new GravelBlock(FabricBlockSettings.of(Material.AGGREGATE).breakByTool(FabricToolTags.SHOVELS).strength(0.6f).sounds(BlockSoundGroup.GRAVEL)));
        put("granite_sand", new SandBlock(5446684, FabricBlockSettings.of(Material.AGGREGATE).breakByTool(FabricToolTags.SHOVELS).strength(0.5f).sounds(BlockSoundGroup.SAND)));

        put("diorite_bricks", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));
        put("diorite_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));
        put("diorite_gravel", new GravelBlock(FabricBlockSettings.of(Material.AGGREGATE).breakByTool(FabricToolTags.SHOVELS).strength(0.6f).sounds(BlockSoundGroup.GRAVEL)));
        put("diorite_sand", new SandBlock(5446684, FabricBlockSettings.of(Material.AGGREGATE).breakByTool(FabricToolTags.SHOVELS).strength(0.5f).sounds(BlockSoundGroup.SAND)));

        put("netherrack_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(0.4f).sounds(BlockSoundGroup.NETHERRACK)));
        put("netherrack_gravel", new GravelBlock(FabricBlockSettings.of(Material.AGGREGATE).breakByTool(FabricToolTags.SHOVELS).strength(0.6f).sounds(BlockSoundGroup.GRAVEL)));
        put("netherrack_sand", new SandBlock(5446684, FabricBlockSettings.of(Material.AGGREGATE).breakByTool(FabricToolTags.SHOVELS).strength(0.5f).sounds(BlockSoundGroup.SAND)));

        put("red_concrete_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));
        put("green_concrete_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));
        put("lime_concrete_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));
        put("yellow_concrete_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));
        put("orange_concrete_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));
        put("blue_concrete_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));
        put("cyan_concrete_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));
        put("light_blue_concrete_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));
        put("light_gray_concrete_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));
        put("gray_concrete_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));
        put("black_concrete_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));
        put("white_concrete_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));
        put("brown_concrete_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));
        put("magenta_concrete_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));
        put("purple_concrete_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));
        put("pink_concrete_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).strength(1.5f, 6f).sounds(BlockSoundGroup.STONE)));

        put("end_gravel", new GravelBlock(FabricBlockSettings.of(Material.AGGREGATE).breakByTool(FabricToolTags.SHOVELS).strength(0.6f).sounds(BlockSoundGroup.GRAVEL)));
        put("end_sand", new SandBlock(5446684, FabricBlockSettings.of(Material.AGGREGATE).breakByTool(FabricToolTags.SHOVELS).strength(0.5f).sounds(BlockSoundGroup.SAND)));

        put("andesite_brick_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F)));
        put("diorite_brick_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F)));
        put("granite_brick_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F)));
    }};

    public static int registerBlocks(){
        for (String blockID : BLOCKS.keySet()){
            Registry.register(Registry.BLOCK, new Identifier(CrushingHammers.MOD_ID, blockID), BLOCKS.get(blockID));
        }
        HashMap<String, Block> blocks = new HashMap<String, Block>(){{
            put("andesite_brick_stairs", new CustomStairsBlock(BLOCKS.get("andesite_bricks").getDefaultState(), FabricBlockSettings.copyOf(BLOCKS.get("andesite_bricks"))));
            put("diorite_brick_stairs", new CustomStairsBlock(BLOCKS.get("diorite_bricks").getDefaultState(), FabricBlockSettings.copyOf(BLOCKS.get("andesite_bricks"))));
            put("granite_brick_stairs", new CustomStairsBlock(BLOCKS.get("granite_bricks").getDefaultState(), FabricBlockSettings.copyOf(BLOCKS.get("andesite_bricks"))));
        }};
        for (String blockID : blocks.keySet()){
            Registry.register(Registry.BLOCK, new Identifier(CrushingHammers.MOD_ID, blockID), blocks.get(blockID));
        }
        BLOCKS.putAll(blocks);

        return BLOCKS.size();
    }

}
