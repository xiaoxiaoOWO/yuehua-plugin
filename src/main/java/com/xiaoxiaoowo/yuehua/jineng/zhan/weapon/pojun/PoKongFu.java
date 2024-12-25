package com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.pojun;

import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;

public final class PoKongFu {
    private static final String id = "poKongFu";

    public static void skill1(ZhanData zhanData, double multiplier) {
        zhanData.slot0.cd_active = GetEntity.world.getGameTime() + (long) (20 * 20 * zhanData.real_cool);
        Player player = zhanData.player;
        zhanData.attackObservers.add(id);
        Scheduler.syncLater(() -> zhanData.attackObservers.remove(id), 4 * 20);
        PlaySound.zishuijinBreak(player);
        SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[割裂]§a发动"));
    }
}
