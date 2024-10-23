package com.xiaoxiaoowo.yuehua.task.hujia;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;

public final class Xiong1 implements Runnable {
    Player player;
    Data data;

    public Xiong1(Data data) {
        this.data = data;
        this.player = data.player;
    }


    @Override
    public void run() {
        if ((!player.isConnected()) || (!data.slot38.id.equals("xiong1"))) {
            return;
        }
        data.updateHujiaAdd(0.05);
        data.updateFakangAdd(0.05);
        SendInformation.sendMes(Component.text("§e[被动技]§6[坚韧]§a触发"), player);
        PlaySound.SmithingTableUse(player);

        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            data.updateHujiaAdd(-0.05);
            data.updateFakangAdd(-0.05);
        }, 5 * 20);

        Scheduler.syncLater(
                new Xiong1(data)
                , (long) (30 * 20 * data.real_cool));
    }
}
