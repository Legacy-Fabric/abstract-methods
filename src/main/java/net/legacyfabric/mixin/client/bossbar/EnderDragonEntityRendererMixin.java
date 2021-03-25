package net.legacyfabric.mixin.client.bossbar;

import net.minecraft.client.render.entity.EnderDragonEntityRenderer;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.minecraft.entity.boss.BossBar.*;

@Mixin(EnderDragonEntityRenderer.class)
public class EnderDragonEntityRendererMixin {
    @Inject(method = "render", at = @At("TAIL"))
    private void render(EnderDragonEntity dragon, double d, double e, double f, float g, float h, CallbackInfo ci) {
        bossHealth = dragon.getHealth() / dragon.getMaxHealth();
        field_4189 = 100;
        bossName = dragon.getName().asFormattedString();
        field_4191 = true;
    }
}
