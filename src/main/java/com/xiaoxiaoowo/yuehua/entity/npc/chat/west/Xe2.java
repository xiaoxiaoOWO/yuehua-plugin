package com.xiaoxiaoowo.yuehua.entity.npc.chat.west;

import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.entity.Cow;

public final class Xe2 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, -846, 134, -139, 0, 0);
        Cow cow = GetEntity.world.spawn(location, Cow.class, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setInvulnerable(true);
            it.customName(Component.translatable("pl.npc.name.xe2"));
            it.setCustomNameVisible(true);
        });
    }
}

