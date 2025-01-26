package com.xiaoxiaoowo.yuehua.task.yiqi;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.Cure;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import org.bukkit.entity.Player;

public final class LAOZHANSHIDUNPAI implements Runnable {
    Data data;
    Player player;
    long latest;

    public LAOZHANSHIDUNPAI(Data data, long latest) {
        this.data = data;
        this.player = data.player;
        this.latest = latest;
    }

    @Override
    public void run() {
        if ((!player.isConnected()) || (!data.slot40.id.equals("laoZhanShiDunPai"))) {
            return;
        }

        if ((long) (data.extraData.get("laoZhanShiDunPai")) != latest) {
            return;
        }

        Cure.shouhuPlayer(16, data);

        Scheduler.syncLater(new LAOZHANSHIDUNPAI(data, latest), (long) (20 * 20 * data.real_cool));


    }
}
