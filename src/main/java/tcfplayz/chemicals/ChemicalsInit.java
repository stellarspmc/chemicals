package tcfplayz.chemicals;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.minecraft.item.*;
import net.minecraft.util.Identifier;

import tcfplayz.chemicals.blocks.*;
import tcfplayz.chemicals.elements.*;
import tcfplayz.chemicals.items.salt.Salt;

public class ChemicalsInit implements ModInitializer {

    public static final String modid = "chemicals";

    public static final ItemGroup chemical = FabricItemGroupBuilder.build(
            new Identifier(modid, "chemicals"),
            () -> new ItemStack(new Hydrogen()));

    @Override
    public void onInitialize() {
        // use reflections to register all elements

    }
}
