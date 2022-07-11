package tcfplayz.misc.mobs.boss.amongus;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class AmongusBoss extends PathAwareEntity {
    protected AmongusBoss(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
}
