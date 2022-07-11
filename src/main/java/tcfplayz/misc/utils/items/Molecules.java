package tcfplayz.misc.utils.items;

import net.minecraft.item.Item;
import tcfplayz.chemicals.ChemicalsInit;

public abstract class Molecules extends Item {
    public Molecules() {
        super(new Item.Settings().maxCount(16).group(ChemicalsInit.chemical));
    }

    abstract public String getID();

}
