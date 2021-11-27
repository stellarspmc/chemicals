package tcfplayz.chemicals.utils;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

import tcfplayz.chemicals.ChemicalsInit;
import tcfplayz.chemicals.elements.ElementZero;
import tcfplayz.chemicals.elements.Helium;
import tcfplayz.chemicals.elements.Hydrogen;
import tcfplayz.chemicals.elements.Lithium;

import static tcfplayz.chemicals.ChemicalsInit.elements;


public abstract class Elements extends Item {

    public Elements() {
        super(new FabricItemSettings().maxCount(64).group(ChemicalsInit.chemical));
    }

    public static String turnNumberToName(int index) {
        switch (index) {
            case 0:
                return "elementzero";
            case 1:
                return "hydrogen";
            case 2:
                return "helium";
            default:
                return "not_implemented";
        }
    }

    public static void initElements() {
        elements.add(0, new ElementZero());
        elements.add(1, new Hydrogen());
        elements.add(2, new Helium());
        elements.add(3, new Lithium());
        //elements.add(index, new Class());
    }

}
