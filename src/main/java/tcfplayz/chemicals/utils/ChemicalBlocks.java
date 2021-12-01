package tcfplayz.chemicals.utils;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import tcfplayz.chemicals.blocks.AtomCollider;
import tcfplayz.chemicals.blocks.AtomSeparator;
import tcfplayz.chemicals.blocks.MaterialReadder;
import tcfplayz.chemicals.blocks.MaterialReducer;

import static tcfplayz.chemicals.ChemicalsInit.*;

public abstract class ChemicalBlocks extends Block {
    public ChemicalBlocks() {
        super(Block.Settings.of(Material.REPAIR_STATION).requiresTool().hardness(4f));
    }

    public abstract String getID();

}
