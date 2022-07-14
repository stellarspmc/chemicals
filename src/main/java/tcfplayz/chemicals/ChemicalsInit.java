package tcfplayz.chemicals;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.minecraft.item.*;
import net.minecraft.util.Identifier;

import tcfplayz.chemicals.items.others.tools.chemistry.Beaker;
import tcfplayz.chemicals.register.Registry;

public class ChemicalsInit implements ModInitializer {

    private static final Item BEAKER = new Beaker();
    public static final String MODID = "chemicals";

    public static final ItemGroup CHEMICALS = FabricItemGroupBuilder.build(
            new Identifier(MODID, "chemicals"),
            () -> new ItemStack(BEAKER));

    @Override
    public void onInitialize() {
        Registry.init();
        net.minecraft.util.registry.Registry.register(net.minecraft.util.registry.Registry.ITEM, new Identifier(MODID, "beaker"), BEAKER);
    }
}
