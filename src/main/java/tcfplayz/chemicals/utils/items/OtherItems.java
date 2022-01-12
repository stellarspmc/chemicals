package tcfplayz.chemicals.utils.items;

import net.minecraft.item.Item;
import tcfplayz.chemicals.ChemicalsInit;

public abstract class OtherItems extends Item {
    public OtherItems() {
        super(new Settings().group(ChemicalsInit.others).maxCount(16));
    }

    public abstract String getID();

}
