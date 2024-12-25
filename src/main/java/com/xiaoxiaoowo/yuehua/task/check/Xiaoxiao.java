package com.xiaoxiaoowo.yuehua.task.check;

import com.destroystokyo.paper.Title;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public final class Xiaoxiao extends BukkitRunnable {
    public static Title title = new Title("请在60s内回答验证问题！",null,5,40,5);

    Player player;
    Data data;

    public Xiaoxiao(Data data) {
        this.data = data;
        this.player = data.player;
    }

    @Override
    public void run() {
        if (!player.isConnected() || player == null) {
            this.cancel();
            return;
        }
        if (data.checkState != 5) {
            this.cancel();
            return;
        }
        player.sendTitle(title);
        SendInformation.sendMes(player, Component.text("§6[防挂机刷材料验证]§e月华的总制作人是?(答案：/c xiaoxiaoOWO)"));
    }
}
