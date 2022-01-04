package tcfplayz.chemicals;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.reflections.Reflections;
import tcfplayz.chemicals.blocks.AtomCollider;
import tcfplayz.chemicals.debug.DebugBlock;
import tcfplayz.chemicals.elements.Hydrogen;
import tcfplayz.chemicals.utils.Blocks;
import tcfplayz.chemicals.utils.Elements;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

public class ChemicalsInit implements ModInitializer {

    public static final String modid = "chemicals";

    public static final ItemGroup chemical = FabricItemGroupBuilder.build(
            new Identifier(modid, "chemicals"),
            () -> new ItemStack(new Hydrogen()));
    public static final ItemGroup chemistryitems = FabricItemGroupBuilder.build(
            new Identifier(modid, "chemistryitems"),
            () -> new ItemStack(new AtomCollider()));
    public static final ItemGroup debug = FabricItemGroupBuilder.build(
            new Identifier(modid, "debug"),
            () -> new ItemStack(new DebugBlock()));

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier(modid, "among_us"), new DebugBlock());
        Registry.register(Registry.ITEM, new Identifier(modid, "among_us"), new BlockItem(new DebugBlock(), new Item.Settings().group(debug)));
        Reflections reflections = new Reflections("tcfplayz.chemicals");
        Set<Class<? extends Elements>> classelement = reflections.getSubTypesOf(Elements.class);
        for (Class<? extends Elements> clazz : classelement) {
            try {
                Registry.register(Registry.ITEM, new Identifier(modid, clazz.getDeclaredConstructor().newInstance().getID()), clazz.getDeclaredConstructor().newInstance());
                System.out.println("registered " + clazz.getDeclaredConstructor().newInstance().getID());
            } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        Set<Class<? extends Blocks>> classblock = reflections.getSubTypesOf(Blocks.class);
        for (Class<? extends Blocks> clazz : classblock) {
            try {
                Identifier id = new Identifier(modid, clazz.getDeclaredConstructor().newInstance().getID());
                Registry.register(Registry.BLOCK, id, clazz.getDeclaredConstructor().newInstance());
                Registry.register(Registry.ITEM, id, new BlockItem(clazz.getDeclaredConstructor().newInstance(), new FabricItemSettings().group(ChemicalsInit.chemistryitems)));
                System.out.println("registered " + clazz.getDeclaredConstructor().newInstance().getID());
            } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
