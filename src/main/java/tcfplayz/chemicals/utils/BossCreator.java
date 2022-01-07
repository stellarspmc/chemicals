package tcfplayz.chemicals.utils;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public abstract class BossCreator extends PathAwareEntity {
    protected BossCreator(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    abstract public String getID();
}
