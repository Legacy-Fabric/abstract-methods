package net.legacyfabric.mixin.client.bossbar;

import net.minecraft.entity.boss.BossBar;
import net.minecraft.entity.boss.BossBarProvider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(BossBar.class)
public class BossBarMixin {
    /**
     * @author blucobalt
     * @reason overwrite the method that causes the "abstractmethoderror crash" to do nothing
     */
    @Overwrite
    public static void update(BossBarProvider provider, boolean bl) {}
}
