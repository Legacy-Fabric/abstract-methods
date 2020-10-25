package io.github.legacyfabric.mixin.client.bossbar;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

@Mixin(WitherEntity.class)
public class WitherEntityMixin extends MobEntity {
    public WitherEntityMixin(World world) {
        super(world);
    }

    public float f_() {
        return this.getMaxHealth();
    }
    public float method_8397() {
        return this.getMaxHealth();
    }
}
