package tcfplayz.chemicals.register;

public class Registry {

    public static void init() {
        BlockRegistry registry1 = new BlockRegistry();
        ItemRegistry registry2 = new ItemRegistry();
        MobRegistry registry3 = new MobRegistry();
        registry1.register();
        registry2.register();
        // registry3.register();
    }

}
