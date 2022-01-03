package tcfplayz.chemicals.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class MaterialReducer extends Block {

    public MaterialReducer(Settings settings) {
        super((Block.Settings.of(Material.METAL).requiresTool().hardness(4f)));
    }

    public String getID() {
        return "material_reducer";
    }
}
