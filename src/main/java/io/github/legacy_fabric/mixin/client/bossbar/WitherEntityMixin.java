package io.github.legacy_fabric.mixin.client.bossbar;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.entity.boss.BossBarProvider;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
@Mixin(WitherEntity.class)
public abstract class WitherEntityMixin extends MobEntity implements BossBarProvider {
    public WitherEntityMixin(World world) {
        super(world);
    }

    @Override
    public float method_7143() {
        return this.getMaxHealth();
    }
}
