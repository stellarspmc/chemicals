package tcfplayz.chemicals;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;
import tcfplayz.chemicals.blocks.AtomCollider;
import tcfplayz.chemicals.elements.Hydrogen;
import tcfplayz.chemicals.utils.ChemicalTable;
import tcfplayz.chemicals.utils.Elements;

import java.util.ArrayList;

public class ChemicalsInit implements ModInitializer {

    public static ArrayList<ChemicalTable> tables = new ArrayList<>();
    public static ArrayList<Elements> elements = new ArrayList<>();
    int numberRightNow;
    public static final String modid = "chemicals";

    public static final ItemGroup chemical = FabricItemGroupBuilder.build(
            new Identifier(modid, "chemicals"),
            () -> new ItemStack(new Hydrogen()));
    public static final ItemGroup chemistryitems = FabricItemGroupBuilder.build(
            new Identifier(modid, "chemistryitems"),
            () -> new ItemStack(new AtomCollider()));

    @Override
    public void onInitialize() {
        Elements.initElements();
        ChemicalTable.initTables();
        elements.forEach(item ->{
            Registry.register(Registry.ITEM, new Identifier(modid, Elements.turnNumberToName(numberRightNow)), item);
            numberRightNow++;
        });
        numberRightNow = 0;
        tables.forEach(block ->{
            Registry.register(Registry.BLOCK, new Identifier(modid, ChemicalTable.turnNumberToName(numberRightNow)), block);
            Registry.register(Registry.ITEM, new Identifier(modid, ChemicalTable.turnNumberToName(numberRightNow)), new BlockItem(block, new FabricItemSettings().group(ChemicalsInit.chemistryitems)));
            numberRightNow++;
        });
    }
}
