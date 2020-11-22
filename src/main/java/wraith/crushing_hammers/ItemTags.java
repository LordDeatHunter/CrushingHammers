package wraith.crushing_hammers;

import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ItemTags {
    public static Tag<Item> HAMMERS = TagRegistry.item(new Identifier("c", "hammers"));
}
