package wraith.crushing_hammers;

import net.minecraft.item.Item;

public class SingleHammerDrop {
    public Item item;
    public int min;
    public int max;
    public boolean fortune;

    public SingleHammerDrop(Item item, boolean fortune, int min, int max) {
        this.item = item;
        this.fortune = fortune;
        this.min = min;
        this.max = max;
    }

}
