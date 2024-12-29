package com.deadcomedian.spice.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class BeastEntity extends HostileEntity {
    public BeastEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }
    @Override
    protected void initGoals() {

        this.goalSelector.add(1, new SwimGoal(this));
        this.goalSelector.add(4, new WanderAroundFarGoal(this, 2D));
        this.goalSelector.add(5, new LookAtEntityGoal(this, PlayerEntity.class, 4f));
        this.goalSelector.add(6, new LookAroundGoal(this));

    }


    public static DefaultAttributeContainer.Builder createKeeperAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 10)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 0.5)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 10f)
                .add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, 0f);
    }
}
