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

public class AtomCollider extends ChemicalBlocks {
    @Override
    public String getID() {
        return "atom_collider";
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        int f = 16;
        return Stream.of(VoxelShapes.combine(VoxelShapes.combine(VoxelShapes.cuboid(0, 0, 0, 4/f, 5/f, 4/f),
                VoxelShapes.combine(VoxelShapes.cuboid(12, 0, 0, 16, 5, 4),
                VoxelShapes.combine(VoxelShapes.cuboid(0, 0, 12, 4, 5, 16),
                VoxelShapes.cuboid(12, 0, 12, 16, 5, 16), BooleanBiFunction.OR), BooleanBiFunction.OR), BooleanBiFunction.OR),
                VoxelShapes.cuboid(0, 5, 0, 16, 16, 16),  BooleanBiFunction.OR)).reduce((v1, v2) -> VoxelShapes.combine(v1, v2, BooleanBiFunction.OR)).get();
    }
}
