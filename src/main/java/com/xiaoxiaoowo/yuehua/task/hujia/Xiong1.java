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
    long latest;

    public Xiong1(Data data,long latest) {
        this.data = data;
        this.player = data.player;
        this.latest = latest;
    }


    @Override
    public void run() {
        if ((!player.isConnected()) || (!data.slot38.id.equals("xiong1"))) {
            return;
        }

        if((long)(data.extraData.get("xiong1")) != latest){
            return;
        }


        data.updateHujiaAdd(0.05);
        data.updateFakangAdd(0.05);
        if(!data.noinfor){
            SendInformation.sendMes(player, Component.text("§e[被动技]§6[坚韧]§a触发"));
        }

        if(!data.nosound){
            PlaySound.SmithingTableUse(player);
        }


        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            data.updateHujiaAdd(-0.05);
            data.updateFakangAdd(-0.05);
        }, 5 * 20);

        Scheduler.syncLater(
                new Xiong1(data,latest)
                , (long) (30 * 20 * data.real_cool));
    }
}
