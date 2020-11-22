package wraith.crushing_hammers;

import java.util.ArrayList;

public class DropResult {
    public int chance;
    public ArrayList<SingleHammerDrop> drops;
    public boolean repeat;

    public DropResult(int chance, ArrayList<SingleHammerDrop> drops, boolean repeat) {
        this.chance = chance;
        this.drops = drops;
        this.repeat = repeat;
    }
}
