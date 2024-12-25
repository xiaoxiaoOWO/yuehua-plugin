package com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.jinzhong;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.system.Buff;
import com.xiaoxiaoowo.yuehua.system.Damage;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public final class QinTongJian {
    public static final String id = "qinTongJian";

    public static void skill1(ZhanData zhanData, double multiplier) {
        zhanData.slot0.cd_active = GetEntity.world.getGameTime() + (long) (20 * 20 * zhanData.real_cool);
        Player player = zhanData.player;
        double damage = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() * multiplier;
        for (Entity entity : GetEntity.getMonsters(player.getLocation(), 5, 5, 5)) {
            MonsterData monsterData = Yuehua.monsterData.get(entity.getUniqueId());
            Damage.damageMonster(zhanData, damage, monsterData);
            Buff.jianSu(monsterData, 5 * 20, 0);
        }

        PlaySound.itemMaceSmashGround(player);
        SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[震荡]§a发动"));

    }
}
