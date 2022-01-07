package tcfplayz.chemicals;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.reflections.Reflections;
import tcfplayz.chemicals.blocks.AtomCollider;
import tcfplayz.chemicals.elements.Hydrogen;
import tcfplayz.chemicals.utils.Blocks;
import tcfplayz.chemicals.utils.BossCreator;
import tcfplayz.chemicals.utils.Elements;

import java.lang.reflect.Constructor;
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

    @Override
    public void onInitialize() {
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
        Reflections reflections2 = new Reflections("tcfplayz.mobs");
        Set<Class<? extends Blocks>> classblock = reflections.getSubTypesOf(Blocks.class);
        for (Class<? extends Blocks> clazz : classblock) {
            try {
                Blocks blocks = clazz.getDeclaredConstructor().newInstance();
                Identifier id = new Identifier(modid, blocks.getID());
                Registry.register(Registry.BLOCK, id, blocks);
                Registry.register(Registry.ITEM, id, new BlockItem(blocks, new FabricItemSettings().group(ChemicalsInit.chemistryitems)));
                System.out.println("registered " + blocks.getID());
            } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        /* Set<Class<? extends BossCreator>> classblock2 = reflections.getSubTypesOf(BossCreator.class);
        for (Class<? extends BossCreator> clazz : classblock2) {
            try {
                Constructor<? extends BossCreator> entity = clazz.getDeclaredConstructor();
                BossCreator e = clazz.getDeclaredConstructor().newInstance();
                final EntityType<BossCreator> CUBE = Registry.register(
                        Registry.ENTITY_TYPE,
                        new Identifier("entitytesting", "cube"),
                        FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, e).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
                );
                Identifier id = new Identifier(modid, blocks.getID());

                System.out.println("registered " + blocks.getID());
            } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        } */
    }
}
