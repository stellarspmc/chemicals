package tcfplayz.chemicals.elements;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import tcfplayz.chemicals.utils.Elements;

public class Hydrogen extends Elements {
    public Hydrogen() {
        super();
    }

    public static int getIndex() {
        return 1;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        world.createExplosion(player, player.getX(), player.getY(), player.getZ(), 15, true, Explosion.DestructionType.DESTROY);
        player.getInventory().removeStack(player.getInventory().selectedSlot);
        return TypedActionResult.success(player.getStackInHand(hand));
    }

}
