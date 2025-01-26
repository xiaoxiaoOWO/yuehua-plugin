package com.xiaoxiaoowo.yuehua.jineng.dan.zhenfa;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.display.utils.DisPlayUtils;
import com.xiaoxiaoowo.yuehua.display.utils.ParticleUtils;
import com.xiaoxiaoowo.yuehua.system.Damage;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public final class Jin {
    public static final Particle.DustOptions dustOptions = new Particle.DustOptions(Color.WHITE, 2);

    public static void putong(DanData danData, double multiplier) {
        Player player = danData.player;
        PlaySound.jin(player);

        Entity entity = player.getTargetEntity(16);
        if (entity == null) {
            Location eyeloc = player.getEyeLocation();
            ArrayList<Mob> entites = GetEntity.getRayMonster(eyeloc, 8, 0.5);
            double distance = Double.MAX_VALUE;

            for (Mob mob : entites) {
                double distanceSp = GetEntity.mydistance(mob.getLocation(), eyeloc);
                if (distanceSp < distance) {
                    distance = distanceSp;
                    entity = mob;
                }
            }

        }


        if (entity == null) {
            return;
        }
        double damage = danData.zhenfa * 3 * multiplier;

        MonsterData monsterData = Yuehua.monsterData.get(entity.getUniqueId());
        Damage.damageMonster(danData, damage, monsterData);
        ParticleUtils.atMonsterDust(monsterData.monster,dustOptions);

        if (!danData.noinforDan) {
            SendInformation.sendActionBar(player, Component.text("§e[阵法]§6[蚀骨刺]§a发动"));
        }


    }

    public static void jinlian(DanData danData, double multiplier) {

    }

    public static void nongsuo(DanData danData, double multiplier) {

    }

}
