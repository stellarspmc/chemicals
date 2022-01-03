package tcfplayz.chemicals;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.reflections.Reflections;

import tcfplayz.chemicals.blocks.AtomCollider;
import tcfplayz.chemicals.elements.Hydrogen;
import tcfplayz.chemicals.utils.ChemicalBlocks;
import tcfplayz.chemicals.utils.Elements;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Set;

public class ChemicalsInit implements ModInitializer {

    public static final String modid = "chemicals";

    public static final ItemGroup chemical = FabricItemGroupBuilder.build(
            new Identifier(modid, "chemicals"),
            () -> new ItemStack(new Hydrogen()));
    public static final ItemGroup chemistryitems = FabricItemGroupBuilder.build(
            new Identifier(modid, "chemistryitems"),
            () -> new ItemStack(new AtomCollider()));

    @Override
    public void onInitialize() {
        Reflections reflections = new Reflections("tcfplayz.chemicals");
        Set<Class<? extends Elements>> classelement = reflections.getSubTypesOf(Elements.class);
        for (Class<? extends Elements> clazz : classelement) {
            try {
                Registry.register(Registry.ITEM, new Identifier(modid, clazz.getDeclaredConstructor().newInstance().getID()), clazz.getDeclaredConstructor().newInstance());
            } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        Set<Class<? extends ChemicalBlocks>> classblock = reflections.getSubTypesOf(ChemicalBlocks.class);
        for (Class<? extends ChemicalBlocks> clazz : classblock) {
            try {
                Identifier id = new Identifier(modid, clazz.getDeclaredConstructor().newInstance().getID());
                Registry.register(Registry.BLOCK, id, clazz.getDeclaredConstructor().newInstance());
                Registry.register(Registry.ITEM, id, new BlockItem(clazz.getDeclaredConstructor().newInstance(), new FabricItemSettings().group(ChemicalsInit.chemistryitems)));
            } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
