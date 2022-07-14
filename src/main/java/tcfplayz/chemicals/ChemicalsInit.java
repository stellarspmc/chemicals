package tcfplayz.chemicals;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.minecraft.item.*;
import net.minecraft.util.Identifier;

import tcfplayz.chemicals.items.ItemGroupBeaker;
import tcfplayz.chemicals.items.elements.*;
import tcfplayz.chemicals.register.Registry;

public class ChemicalsInit implements ModInitializer {

    public static final String modid = "chemicals";

    public static final ItemGroup chemical = FabricItemGroupBuilder.create(new Identifier(modid, "chemicals"))
            .icon(() -> new ItemStack(new ItemGroupBeaker()))
            .build();

    @Override
    public void onInitialize() {
        Registry.init();
    }
}
