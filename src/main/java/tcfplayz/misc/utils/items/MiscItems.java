package tcfplayz.misc.utils.items;

import net.minecraft.item.Item;
import tcfplayz.chemicals.ChemicalsInit;

public abstract class MiscItems extends Item {
    public MiscItems() {
        super(new Settings().group(ChemicalsInit.CHEMICALS).maxCount(16));
    }

    public abstract String getID();

}
