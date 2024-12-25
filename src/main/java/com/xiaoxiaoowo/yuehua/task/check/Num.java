package com.xiaoxiaoowo.yuehua.task.check;

import com.destroystokyo.paper.Title;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public final class Num extends BukkitRunnable {
    public static Title title = new Title("请在60s内回答验证问题！",null,5,40,5);

    Player player;
    Data data;
    int num;

    public Num(Data data, int num) {
        this.data = data;
        this.player = data.player;
        this.num = num;
    }

    @Override
    public void run() {
        if (!player.isConnected() || player == null) {
            this.cancel();
            return;
        }
        if (data.checkState != 1) {
            this.cancel();
            return;
        }

        player.sendTitle(title);
        SendInformation.sendMes(player, Component.text("§6[防挂机刷材料验证]§e请输入§b/c " + num));

    }
}
