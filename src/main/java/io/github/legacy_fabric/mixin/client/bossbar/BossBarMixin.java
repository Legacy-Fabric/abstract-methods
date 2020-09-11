package io.github.legacy_fabric.mixin.client.bossbar;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.entity.boss.BossBarProvider;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
@Mixin(BossBar.class)
public class BossBarMixin {
    @Shadow
    public static float field_4188;
    @Shadow
    public static int field_4189;
    @Shadow
    public static String field_4190;
    @Shadow
    public static boolean field_4191;

    /**
     * @author BoogieMonster1O1
     * @reason Fixes some important bug
     */
    @Overwrite
    public static void method_3301(BossBarProvider provider, boolean bl) {
        field_4188 = ((LivingEntity) provider).getHealth() / ((LivingEntity)provider).getMaxHealth();
        field_4189 = 100;
        field_4190 = provider.title().asFormattedString();
        field_4191 = bl;
    }
}
