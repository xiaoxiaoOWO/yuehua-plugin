package com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.tanyun;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.system.Buff;
import com.xiaoxiaoowo.yuehua.system.Cure;
import com.xiaoxiaoowo.yuehua.system.Damage;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.MoveEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;

public final class HuTouZhanJinQiang {
    public static final String id = "huTouZhanJinQiang";

    public static void skill1(ZhanData zhanData, double multiplier) {
        zhanData.slot0.cd_active = GetEntity.world.getGameTime() + (long) (20 * 20 * zhanData.real_cool);
        Player player = zhanData.player;

        Location start = player.getLocation();
        Location end = MoveEntity.dash(zhanData, 12);
        if (end == null) {
            SendInformation.sendMes(player, Component.text("§e[游戏机制]§4此技能在这里无法使用"));
            return;
        }

        double damage = zhanData.attack * 7 * multiplier;

        int count = 0;


        for (Mob mob : GetEntity.getLineMonster(start.toVector(), end.toVector(), 1.5)) {
            MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
            Damage.damageMonster(zhanData, damage, monsterData);
            Buff.deHujia(monsterData, 10 * 20, 0.25, id);
            Buff.deFakang(monsterData, 10 * 20, 0.25, id);
            count++;
        }

        count = Math.min(count, 8);
        Cure.curePlayer((0.0125 * player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() + 15) * count, zhanData);

        double damageHuYi = zhanData.attack * 3 * count;
        double deAttack = 50 * count;

        for (Entity entity : GetEntity.getMonsters(end, 5, 5, 5)) {
            Mob mob = (Mob) entity;
            MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
            Damage.damageMonster(zhanData, damageHuYi, monsterData);
            Buff.deAttack(monsterData, 10 * 20, deAttack);
        }


        PlaySound.huxiao(player);
        SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[虎啸]§a发动"));

    }
}
