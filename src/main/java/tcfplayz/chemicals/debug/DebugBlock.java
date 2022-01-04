package tcfplayz.chemicals.debug;

import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class DebugBlock extends Block {
    public DebugBlock() {
        super(Block.Settings.of(Material.METAL).strength(3.0F, 3.0F));
    }
}
