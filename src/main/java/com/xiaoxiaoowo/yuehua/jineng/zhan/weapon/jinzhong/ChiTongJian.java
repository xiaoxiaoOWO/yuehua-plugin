package com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.jinzhong;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.system.Damage;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;

import java.util.Set;

public final class ChiTongJian {
    public static final String id = "chiTongJian";

    public static void skill1(ZhanData zhanData, double multiplier) {
        zhanData.slot0.cd_active = GetEntity.world.getGameTime() + (long) (20 * 20 * zhanData.real_cool);
        Player player = zhanData.player;
        double damage = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() * 1.25 * multiplier;
        for (Entity entity : GetEntity.getMonsters(player.getLocation(), 6, 6, 6)) {
            MonsterData monsterData = Yuehua.monsterData.get(entity.getUniqueId());
            Damage.damageMonster(zhanData, damage, monsterData);
            Set<String> tags = entity.getScoreboardTags();
            if (tags.contains(id)) {
                Mob mob = (Mob) entity;
                double damage2 = mob.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() * 0.4 * multiplier;
                damage2 = Math.min(1000, damage2);
                Damage.damageMonster(zhanData, damage2, monsterData);
            } else {
                tags.add(id);
            }
        }

        PlaySound.entityBlazeShoot(player);
        SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[魔焰]§a发动"));

    }
}
