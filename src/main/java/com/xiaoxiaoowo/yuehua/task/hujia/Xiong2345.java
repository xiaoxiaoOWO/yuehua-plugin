package com.xiaoxiaoowo.yuehua.task.hujia;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;

public final class Xiong2345 implements Runnable {
    Data data;
    Player player;
    long latest;
    String id;

    public Xiong2345(Data data, long latest, String id) {
        this.data = data;
        this.player = data.player;
        this.latest = latest;
        this.id = id;
    }

    @Override
    public void run() {
        if ((!player.isConnected()) || (!data.slot38.id.equals(id))) {
            return;
        }

        if ((long) (data.extraData.get(id)) != latest) {
            return;
        }

        data.attackedObservers.add(id);

        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            data.attackedObservers.remove(id);
        }, 5 * 20);

        if(!data.noinfor){
            SendInformation.sendMes(player, Component.text("§e[被动技]§6[守御回武]§a触发"));
        }

        if(!data.nosound){
            PlaySound.SmithingTableUse(player);
        }


        Scheduler.syncLater(new Xiong2345(data, latest, id), (long) (50 * 20 * data.real_cool));
    }
}
