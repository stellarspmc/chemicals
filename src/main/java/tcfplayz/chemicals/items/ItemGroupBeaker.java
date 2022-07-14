package tcfplayz.chemicals.items;

import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class ItemGroupBeaker extends Item {
    public ItemGroupBeaker() {
        super(new Settings().rarity(Rarity.EPIC));
    }
}
