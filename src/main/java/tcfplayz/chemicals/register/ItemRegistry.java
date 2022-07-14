package tcfplayz.chemicals.register;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tcfplayz.chemicals.items.elements.*;
import tcfplayz.chemicals.items.molecules.*;
import tcfplayz.chemicals.items.others.tools.chemistry.*;
import tcfplayz.misc.utils.items.*;

import static tcfplayz.chemicals.ChemicalsInit.MODID;

public class ItemRegistry {

    public void register() {
        registerElements(new Hydrogen());
        registerElements(new Helium());
        registerElements(new Lithium());
        registerElements(new Beryllium());
        registerElements(new Boron());
        registerElements(new Carbon());
        registerElements(new Nitrogen());
        registerElements(new Oxygen());
        registerElements(new Uranium());
        registerMolecules(new DHMO());
        /* TODO: implement functions
        registerElements(new Fluorine());
        registerElements(new Neon());
        registerElements(new Sodium());
        registerElements(new Magnesium());
        registerElements(new Aluminium());
        registerElements(new Silicon());
        registerElements(new Phosphorus());
        registerElements(new Sulfur());
        registerElements(new Chlorine());
        registerElements(new Argon());
        registerElements(new Potassium());
        registerElements(new Calcium());
        registerElements(new Scandium());
        registerElements(new Titanium());
        registerElements(new Vanadium());
        registerElements(new Chromium());
        registerElements(new Manganese());
        registerElements(new Iron());
        registerElements(new Cobalt());
        registerElements(new Nickel());
        */
    }
    private void registerElements(Elements element) {
        Registry.register(Registry.ITEM, new Identifier(MODID, element.getID()), element);
    }

    private void registerOtherItems(MiscItems misc) {
        Registry.register(Registry.ITEM, new Identifier(MODID, misc.getID()), misc);
    }

    private void registerMolecules(Molecules molecules) {
        Registry.register(Registry.ITEM, new Identifier(MODID, molecules.getID()), molecules);
    }

}
