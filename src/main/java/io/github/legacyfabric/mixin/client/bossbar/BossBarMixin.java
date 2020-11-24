package io.github.legacyfabric.mixin.client.bossbar;

import net.minecraft.entity.boss.BossBar;
import net.minecraft.entity.boss.BossBarProvider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(BossBar.class)
public class BossBarMixin {
    /**
     * @author blucobalt
     * @reason hacky fix
     */
    @Overwrite
    public static void method_3301(BossBarProvider provider, boolean bl) {}
}
