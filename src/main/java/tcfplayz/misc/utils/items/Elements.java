package tcfplayz.misc.utils.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

import tcfplayz.chemicals.ChemicalsInit;

public abstract class Elements extends Item {

    public Elements() {
        super(new FabricItemSettings().maxCount(64).group(ChemicalsInit.CHEMICALS));
    }

    public abstract String getID();
}
