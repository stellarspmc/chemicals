package tcfplayz.chemicals.register;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tcfplayz.chemicals.ChemicalsInit;
import tcfplayz.chemicals.blocks.AtomCollider;
import tcfplayz.misc.utils.blocks.Blocks;

import static tcfplayz.chemicals.ChemicalsInit.modid;

public class BlockRegistry {

    public void register() {
        registerBlock(new AtomCollider());
    }

    private void registerBlock(Blocks block) {
        Registry.register(Registry.BLOCK, new Identifier(modid, block.getID()), block);
        Registry.register(Registry.ITEM, new Identifier(modid, block.getID()), new BlockItem(block, new FabricItemSettings().group(ChemicalsInit.chemical)));
    }

}