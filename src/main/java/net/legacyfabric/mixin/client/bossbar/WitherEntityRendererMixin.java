package net.legacyfabric.mixin.client.bossbar;

import net.minecraft.client.render.entity.WitherEntityRenderer;
import net.minecraft.entity.boss.WitherEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.minecraft.entity.boss.BossBar.*;

@Mixin(WitherEntityRenderer.class)
public class WitherEntityRendererMixin {
    @Inject(method = "render", at = @At("TAIL"))
    private void render(WitherEntity wither, double d, double e, double f, float g, float h, CallbackInfo ci) {
        bossHealth = wither.getHealth() / wither.getMaxHealth();
        field_4189 = 100;
        bossName = wither.getName().asFormattedString();
        field_4191 = true;
    }
}
