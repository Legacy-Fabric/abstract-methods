package io.github.legacy_fabric.mixin.client.bossbar;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.entity.boss.BossBarProvider;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
@Mixin(EnderDragonEntity.class)
public abstract class EnderDragonEntityMixin extends MobEntity implements BossBarProvider {
    public EnderDragonEntityMixin(World world) {
        super(world);
    }

    @Override
    public float getMaxHealth() {
        return super.getMaxHealth();
    }
}
