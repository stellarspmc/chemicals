package tcfplayz.chemicals.elements;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import tcfplayz.chemicals.utils.Elements;

public class Helium extends Elements {
    public Helium() {
        super();
    }

    public static int getIndex() {
        return 2;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        player.getAbilities().allowFlying = true;
        player.sendAbilitiesUpdate();
        try {
            wait(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        player.getAbilities().allowFlying = false;
        player.sendAbilitiesUpdate();
        player.getInventory().removeStack(player.getInventory().selectedSlot);
        return TypedActionResult.success(player.getStackInHand(hand));
    }

}
