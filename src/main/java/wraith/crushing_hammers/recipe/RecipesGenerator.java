package wraith.crushing_hammers.recipe;

import com.google.gson.JsonObject;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;

public class RecipesGenerator {

    public static HashMap<String, ShapedRecipeMaterials> SHAPED_RECIPES = new HashMap<>();
    public static HashMap<String, SmithingRecipeMaterials> SMITHING_RECIPES = new HashMap<>();

    public static HashMap<Identifier, JsonObject> RECIPES = new HashMap<>();


    public static void createShapedRecipes() {
        SMITHING_RECIPES.put("netherite_hammer", new SmithingRecipeMaterials(new Identifier(wraith.crushing_hammers.CrushingHammers.MOD_ID, "diamond_hammer"), Registry.ITEM.getId(Items.NETHERITE_INGOT), "item", "item", new Identifier(wraith.crushing_hammers.CrushingHammers.MOD_ID, "netherite_hammer")));

        SHAPED_RECIPES.put("wooden_hammer", new ShapedRecipeMaterials(new Identifier("planks"), Registry.ITEM.getId(Items.STICK), "tag", "item", new Identifier(wraith.crushing_hammers.CrushingHammers.MOD_ID, "wooden_hammer")));
        SHAPED_RECIPES.put("stone_hammer", new ShapedRecipeMaterials(Registry.ITEM.getId(Items.COBBLESTONE), Registry.ITEM.getId(Items.STICK), "item", "item", new Identifier(wraith.crushing_hammers.CrushingHammers.MOD_ID, "stone_hammer")));
        SHAPED_RECIPES.put("iron_hammer", new ShapedRecipeMaterials(Registry.ITEM.getId(Items.IRON_INGOT), Registry.ITEM.getId(Items.STICK), "item", "item", new Identifier(wraith.crushing_hammers.CrushingHammers.MOD_ID, "iron_hammer")));
        SHAPED_RECIPES.put("golden_hammer", new ShapedRecipeMaterials(Registry.ITEM.getId(Items.GOLD_INGOT), Registry.ITEM.getId(Items.STICK), "item", "item", new Identifier(wraith.crushing_hammers.CrushingHammers.MOD_ID, "golden_hammer")));
        SHAPED_RECIPES.put("diamond_hammer", new ShapedRecipeMaterials(Registry.ITEM.getId(Items.DIAMOND), Registry.ITEM.getId(Items.STICK), "item", "item", new Identifier(wraith.crushing_hammers.CrushingHammers.MOD_ID, "diamond_hammer")));
    }

    public static void addRecipes() {
        for (String key : SHAPED_RECIPES.keySet()) {
            ShapedRecipeMaterials material = SHAPED_RECIPES.get(key);
            RECIPES.put(new Identifier(wraith.crushing_hammers.CrushingHammers.MOD_ID, key), ShapedRecipeGenerator.generateHammerJson(material.headItem, material.handleItem, material.headType, material.handleType, material.output));
        }
        for (String key : SMITHING_RECIPES.keySet()) {
            SmithingRecipeMaterials material = SMITHING_RECIPES.get(key);
            RECIPES.put(new Identifier(wraith.crushing_hammers.CrushingHammers.MOD_ID, key), ShapedRecipeGenerator.generateSmithingJson(material.baseItem, material.additionItem, material.baseType, material.additionType, material.output));
        }
    }
}
