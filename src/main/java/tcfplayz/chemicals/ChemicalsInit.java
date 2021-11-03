package tcfplayz.chemicals;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;
import tcfplayz.chemicals.utils.Elements;

import java.util.ArrayList;

public class ChemicalsInit implements ModInitializer {

    public static ArrayList<Elements> elements = new ArrayList<>();
    int numberRightNow;
    public static final String modid = "chemicals";

    public static final ItemGroup chemical = FabricItemGroupBuilder.build(
            new Identifier(modid, "chemicals"),
            () -> new ItemStack(Blocks.COBBLESTONE));

    @Override
    public void onInitialize() {
        Elements.initElements();
        elements.forEach(item ->{
            Registry.register(Registry.ITEM, new Identifier(modid, Elements.turnNumberToName(numberRightNow)), item);
            numberRightNow++;
        });

    }
}
