package wraith.crushing_hammers;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class HammerTool extends PickaxeItem {

    public HammerTool(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

}
