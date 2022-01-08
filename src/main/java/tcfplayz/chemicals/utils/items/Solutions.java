package tcfplayz.chemicals.utils.items;

import net.minecraft.item.Item;
import tcfplayz.chemicals.ChemicalsInit;

public abstract class Solutions extends Item {
    public Solutions() {
        super(new Item.Settings().maxCount(16).group(ChemicalsInit.chemical));
    }

    abstract public String getID();

}
