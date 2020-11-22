package wraith.crushing_hammers;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class HammerDrop {

    public String source;
    public int dropMin;
    public int dropMax;
    public ArrayList<DropResult> result;

    public HammerDrop(String source, int dropMin, int dropMax, ArrayList<DropResult> result){
        this.source = source;
        this.dropMin = dropMin;
        this.dropMax = dropMax;
        this.result = result;
    }

    public static HashMap<String, HammerDrop> BREAK_RESULT = new HashMap<>();

    public static void saveHammerBreaking(boolean overwrite) {
        Utils.getFilesInJar("configs/", overwrite);
    }

    public static int loadHammerBreaking() {
        File[] files = Config.getFiles("config/crushing_hammers/recipes/");
        if (files == null) {
            return 0;
        }

        for(File file : files) {
            JsonObject json = Config.getJsonObject(Config.readFile(file));

            try {
                String source = json.get("source").getAsString();
                int dropMin = json.get("drop_min").getAsInt();
                int dropMax = json.get("drop_max").getAsInt();

                ArrayList<DropResult> drops = new ArrayList<>();
                for (JsonElement result : json.get("result").getAsJsonArray()) {
                    JsonObject entry = result.getAsJsonObject();
                    int chance = entry.get("chance").getAsInt();
                    boolean repeat = entry.get("repeat").getAsBoolean();
                    ArrayList<SingleHammerDrop> singleDrops = new ArrayList<>();
                    for (JsonElement drop : entry.get("drops").getAsJsonArray()) {
                        JsonObject obj = drop.getAsJsonObject();
                        singleDrops.add(new SingleHammerDrop(
                                Registry.ITEM.get(new Identifier(obj.get("item").getAsString())),
                                obj.get("fortune").getAsBoolean(),
                                obj.get("min").getAsInt(),
                                obj.get("max").getAsInt())
                        );
                    }
                    drops.add(new DropResult(chance, singleDrops, repeat));
                }
                BREAK_RESULT.put(source, new HammerDrop(source, dropMin, dropMax, drops));
            }
            catch(Exception e) {
                System.out.println("Found error with file '" + file.getName() + "'");
            }
        }
        return BREAK_RESULT.size();
    }

    public static List<ItemStack> getDrops(String block, ItemStack tool) {
        List<ItemStack> loot = new ArrayList<>();

        int dropAmount = Utils.getRandomIntInRange(BREAK_RESULT.get(block).dropMin, BREAK_RESULT.get(block).dropMax);
        System.out.println("DROP " + dropAmount);

        HashSet<Integer> indexes = new HashSet<>();
        int totalDrops = 0;

        for (int i = 0; i < BREAK_RESULT.get(block).result.size() && totalDrops < dropAmount; ++i) {
            DropResult drop = BREAK_RESULT.get(block).result.get(i);
            if (drop.chance < 100) {
                continue;
            }

            indexes.add(i);

            fillItems(drop.drops, loot, tool);
            ++totalDrops;
        }

        while(totalDrops < dropAmount) {
            int i = 0;
            while (indexes.contains(i)) {
                i = Utils.getRandomInt(BREAK_RESULT.get(block).result.size());
            }

            DropResult drop = BREAK_RESULT.get(block).result.get(i);

            int chance = drop.chance;
            if (Utils.getRandomIntInRange(0, 100) > chance) {
                continue;
            }
            if (!drop.repeat) {
                indexes.add(i);
            }

            fillItems(drop.drops, loot, tool);
            ++totalDrops;
        }

        return loot;
    }

    private static void fillItems(ArrayList<SingleHammerDrop> drops, List<ItemStack> items, ItemStack tool) {
        for (SingleHammerDrop singleDrop : drops) {
            int amount = Utils.getRandomIntInRange(singleDrop.min, singleDrop.max);
            int fortune = EnchantmentHelper.getLevel(Enchantments.FORTUNE, tool);
            if (fortune > 0){
                amount = Utils.fortunify(amount, fortune);
            }
            items.add(new ItemStack(singleDrop.item, amount));
        }
    }

}
