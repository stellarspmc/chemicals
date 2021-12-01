package tcfplayz.chemicals.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import tcfplayz.chemicals.utils.ChemicalBlocks;

import java.util.stream.Stream;

public class BunsenBurner extends ChemicalBlocks {
    @Override
    public String getID() {
        return "bunsen_burner";
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return Stream.of(VoxelShapes.combine(VoxelShapes.cuboid(3, 3, 3, 13, 4, 13), VoxelShapes.combine(VoxelShapes.cuboid(2, 1, 2, 14, 3, 14), VoxelShapes.combine(VoxelShapes.cuboid(1, 1, 1, 15, 2, 15),  VoxelShapes.cuboid(0, 0, 0, 16, 1, 16), BooleanBiFunction.OR), BooleanBiFunction.OR), BooleanBiFunction.OR),  VoxelShapes.cuboid(6, 8, 7, 0, 10, 9),  VoxelShapes.cuboid(6, 1, 6, 10, 16, 10)).reduce((v1, v2) -> VoxelShapes.combine(v1, v2, BooleanBiFunction.OR)).get();
    }

}
