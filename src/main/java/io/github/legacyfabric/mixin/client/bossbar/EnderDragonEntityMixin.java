package io.github.legacyfabric.mixin.client.bossbar;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

@Mixin(EnderDragonEntity.class)
public class EnderDragonEntityMixin extends MobEntity {
    public EnderDragonEntityMixin(World world) {
        super(world);
    }

    public float f_() {
        return this.getMaxHealth();
    }
}
