package tcfplayz.chemicals.blocks;


import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import tcfplayz.misc.utils.blocks.Blocks;

import java.util.stream.Stream;

public class BunsenBurner extends Blocks {

    public String getID() {
        return "bunsen_burner";
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        float f = 16.0F;
        return Stream.of(VoxelShapes.combine(VoxelShapes.cuboid(3/f, 3/f, 3/f, 13/f, 4/f, 13/f),
                VoxelShapes.combine(VoxelShapes.cuboid(2/f, 1/f, 2/f, 14/f, 3/f, 14/f),
                VoxelShapes.combine(VoxelShapes.cuboid(1/f, 1/f, 1/f, 15/f, 2/f, 15/f),
                VoxelShapes.cuboid(0/f, 0/f, 0/f, 16/f, 1/f, 16/f), BooleanBiFunction.OR), BooleanBiFunction.OR), BooleanBiFunction.OR),
                VoxelShapes.cuboid(0/f, 8/f, 7/f, 6/f, 10/f, 9/f),
                VoxelShapes.cuboid(6/f, 1/f, 6/f, 10/f, 16/f, 10/f)).reduce((v1, v2) -> VoxelShapes.combine(v1, v2, BooleanBiFunction.OR)).get();
    }

}
