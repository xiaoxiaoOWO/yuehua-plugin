package com.xiaoxiaoowo.yuehua.entity.other;

import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Location;


public final class Pig {
    public static void spawn(Location location) {
        GetEntity.world.spawn(location, org.bukkit.entity.Pig.class, false, it -> {
                    //静音
                    it.setSilent(true);
                    //NOAI
                    it.setAI(false);
                    //不自然移除
                    it.setRemoveWhenFarAway(false);
                    it.setInvulnerable(true);
                    //通用实体属性
                    //名称
                    it.customName(Component.text("小猪猪").color(NamedTextColor.AQUA));
                    it.setCustomNameVisible(true);
                }
        );
    }
}
