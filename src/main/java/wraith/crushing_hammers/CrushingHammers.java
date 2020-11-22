package wraith.crushing_hammers;

import com.google.gson.JsonObject;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import wraith.crushing_hammers.recipe.RecipesGenerator;

public class CrushingHammers implements ModInitializer {

    public static final String MOD_ID = "crushing_hammers";
    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        LOGGER.info("Loading [Harvest Hammers]");

        RecipesGenerator.createShapedRecipes();

        LOGGER.info("Loaded " + BlockRegistry.registerBlocks() + " Blocks.");
        LOGGER.info("Loaded " + ItemRegistry.registerItems() + " Items.");


        JsonObject json = Config.loadConfig();
        if (!json.has("regenerate_deleted_files") || json.get("regenerate_deleted_files").getAsBoolean()) {
            HammerDrop.saveHammerBreaking(json.has("replace_old_files_when_regenerating") && json.get("replace_old_files_when_regenerating").getAsBoolean());
        }
        LOGGER.info("Loaded " + HammerDrop.loadHammerBreaking() + " Recipes.");


        RecipesGenerator.addRecipes();

        LOGGER.info("[Crushing Hammers] has successfully been loaded!");

    }

}
