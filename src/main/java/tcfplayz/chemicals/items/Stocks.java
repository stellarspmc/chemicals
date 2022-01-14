package tcfplayz.chemicals.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import tcfplayz.chemicals.utils.items.OtherItems;

public class Stocks extends OtherItems {
    @Override
    public String getID() {
        return "stocks";
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity plr, Hand hand) {
        // get player nbt tag
        plr.setStackInHand(hand, new ItemStack(this));
        return TypedActionResult.success(plr.getStackInHand(hand));
    }
}
