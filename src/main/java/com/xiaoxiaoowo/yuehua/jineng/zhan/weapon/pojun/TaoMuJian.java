package com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.pojun;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.system.Buff;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;

public final class TaoMuJian {
    private static final String id = "taoMuJian";


    public static void skill1(ZhanData zhanData, double multiplier) {
        zhanData.slot0.cd_active = GetEntity.world.getGameTime() + (long) (20 * 20 * zhanData.real_cool);
        Player player = zhanData.player;
        zhanData.attackObservers.add(id);
        Scheduler.syncLater(()-> zhanData.attackObservers.remove(id),4*20);

        for (Entity entity : GetEntity.getMonsters(player.getLocation(), 4, 4, 4)) {
            Mob mob = (Mob) entity;
            MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
            Buff.xuanYun(monsterData, 2 * 20);
        }
        SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[镇神]§a发动"));
        PlaySound.zishuijinBreak(player);
    }
}
