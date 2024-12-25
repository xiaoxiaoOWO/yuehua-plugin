package com.xiaoxiaoowo.yuehua.jineng.dan.zhenfa;

import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;

public final class Tu {
    public static void putong(DanData danData, double multiplier) {
        Player player = danData.player;
        PlaySound.tu(player);

        danData.wuliAttackedObservers.add("tuyuansu");
        Scheduler.syncLater(() -> danData.wuliAttackedObservers.remove("tuyuansu"), 4 * 20);

        if(!danData.noinforDan){
            SendInformation.sendActionBar(player, Component.text("§e[阵法]§6[厚土御]§a发动"));
        }
    }

    public static void jinlian(DanData danData, double multiplier) {

    }

    public static void nongsuo(DanData danData, double multiplier) {

    }
}
