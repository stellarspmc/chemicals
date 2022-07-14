package tcfplayz.chemicals.blocks.crafts;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import tcfplayz.misc.utils.blocks.Blocks;


public class TableChest extends Blocks {

    @Override
    public String getID() {
        return "chem_table_chest";
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            // player.getInventory().getMainHandStack()
        }

        return ActionResult.SUCCESS;
    }

}
