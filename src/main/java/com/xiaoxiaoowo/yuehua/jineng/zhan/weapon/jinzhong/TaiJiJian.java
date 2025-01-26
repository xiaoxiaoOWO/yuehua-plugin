package com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.jinzhong;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.display.utils.ParticleUtils;
import com.xiaoxiaoowo.yuehua.system.Cure;
import com.xiaoxiaoowo.yuehua.system.Damage;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.Color;
import org.bukkit.Particle;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public final class TaiJiJian {
    public static final String id = "taiJiJian";
    public static final Particle.DustOptions whiteDust = new Particle.DustOptions(Color.WHITE, 2);
    public static final Particle.DustOptions blackDust = new Particle.DustOptions(Color.BLACK, 2);

    public static void skill1(ZhanData zhanData, double multiplier) {
        zhanData.slot0.cd_active = GetEntity.world.getGameTime() + (long) (20 * 20 * zhanData.real_cool);
        //获取是白天还是夜晚
        boolean isDay = GetEntity.world.isDayTime();

        Player player = zhanData.player;
        double damage = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() * 1.5 * multiplier;
        for (Entity entity : GetEntity.getMonsters(player.getLocation(), 7, 7, 7)) {
            MonsterData monsterData = Yuehua.monsterData.get(entity.getUniqueId());
            Damage.damageMonster(zhanData, damage, monsterData);
            if (isDay) {
                ParticleUtils.atMonsterDust(monsterData.monster, whiteDust);
                Scheduler.syncLater(() -> {
                    if (entity.isDead()) {
                        Cure.curePlayer(player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() * 0.025 + 15, zhanData);
                    }
                }, 2 * 20);
            } else {
                ParticleUtils.atMonsterDust(monsterData.monster, blackDust);
                Scheduler.syncLater(() -> {
                    if (!entity.isDead()) {
                        Damage.damageMonster(zhanData, damage, monsterData);
                    }
                }, 2 * 20);
            }
        }


        PlaySound.zishuijinBreak(player);
        SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[太极]§a发动"));
    }
}
