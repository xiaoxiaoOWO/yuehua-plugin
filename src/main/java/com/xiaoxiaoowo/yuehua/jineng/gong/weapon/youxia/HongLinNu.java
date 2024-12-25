package com.xiaoxiaoowo.yuehua.jineng.gong.weapon.youxia;

import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;

public final class HongLinNu {
    public static final String id = "hongLinNu";

    public static void skill1(GongData gongData, double multiplier) {
        gongData.slot0.cd_active = GetEntity.world.getGameTime() + (long) (20 * 20 * gongData.real_cool);
        Player player = gongData.player;
        gongData.hitObservers.add(id);
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            gongData.hitObservers.remove(id);
        }, 6 * 20);

        PlaySound.zishuijinBreak(player);
        SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[灼炎]§a发动"));
    }
}
