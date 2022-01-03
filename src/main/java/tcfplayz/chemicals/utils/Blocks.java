package tcfplayz.chemicals.utils;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractCauldronBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public abstract class Blocks extends Block {
    public Blocks() {
        super(Block.Settings.of(Material.METAL).requiresTool().hardness(4f));
    }

    public abstract String getID();

}
