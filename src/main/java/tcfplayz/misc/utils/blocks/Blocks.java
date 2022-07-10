package tcfplayz.misc.utils.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Material;

public abstract class Blocks extends Block {
    public Blocks() {
        super(Block.Settings.of(Material.METAL).requiresTool().hardness(4f));
    }

    public abstract String getID();

}
