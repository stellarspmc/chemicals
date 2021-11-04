package tcfplayz.chemicals.utils;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import tcfplayz.chemicals.blocks.AtomCollider;
import tcfplayz.chemicals.blocks.AtomSeparator;
import tcfplayz.chemicals.blocks.MaterialReadder;
import tcfplayz.chemicals.blocks.MaterialReducer;

import static tcfplayz.chemicals.ChemicalsInit.*;

public class ChemicalTable extends Block {
    public ChemicalTable() {
        super(Block.Settings.of(Material.REPAIR_STATION).hardness(4.0f));
    }

    public static String turnNumberToName(int index) {
        switch (index) {
            case 0:
                return "atom_collider";
            case 1:
                return "atom_separator";
            case 2:
                return "material_reducer";
            case 3:
                return "material_readder";
            default:
                return "not_implemented";
        }
    }

    public static void initTables() {
        tables.add(0, new AtomCollider());
        tables.add(1, new AtomSeparator());
        tables.add(2, new MaterialReducer());
        tables.add(3, new MaterialReadder());
        //tables.add(index, new Class());
    }

}
