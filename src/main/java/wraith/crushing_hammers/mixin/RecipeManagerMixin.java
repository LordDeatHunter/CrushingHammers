package wraith.crushing_hammers.mixin;

import com.google.gson.JsonElement;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import wraith.crushing_hammers.recipe.RecipesGenerator;

import java.util.Map;

@Mixin(RecipeManager.class)
public class RecipeManagerMixin {

    @Inject(method = "apply", at = @At("HEAD"))
    public void apply(Map<Identifier, JsonElement> map, ResourceManager resourceManager, Profiler profiler, CallbackInfo ci) {
        for (Identifier id : RecipesGenerator.RECIPES.keySet()) {
            map.put(id, RecipesGenerator.RECIPES.get(id));
        }
    }

}
