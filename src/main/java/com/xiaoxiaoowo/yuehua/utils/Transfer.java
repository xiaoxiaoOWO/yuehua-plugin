package com.xiaoxiaoowo.yuehua.utils;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.task.player.DisplayHp;
import org.bukkit.entity.Player;

public final class Transfer {

    public static void transferData(Data data) {
        Scheduler.async(() -> {
            int snowBlind = data.snowBlind;
            int yezi = data.yezi;
            int zhusi = data.zhusi;
            int soul = data.soul;

            String transfer = String.format("%d;%d;%d;%d", yezi, snowBlind, zhusi, soul);
            MySocket.sendDataToFabricClient(data, transfer);
        });
    }

    public static void transferAttribute(Data data) {
        Scheduler.async(() -> {
            int job = data.job;
            double baoji = data.baoji;
            double baojixiaoguo = data.baojixiaoguo;
            double cool_reduce = data.cool_reduce;
            double hujia = data.hujia;
            double pojia = data.pojia;
            double fakang = data.fakang;
            double pofa = data.pofa;
            double gedang = data.gedang;
            double shouhu = data.shouhu;
            double renxing = data.renxing;
            double shengji = data.shengji;

            switch (job) {
                case 0, 1 -> {
                    double attack = data.attack;
                    String transfer = String.format("%d;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f",
                            job, attack, baoji * 100, baojixiaoguo * 100, cool_reduce * 100,
                            hujia * 100, pojia * 100, fakang * 100, pofa * 100,
                            gedang, shouhu, renxing * 100, shengji * 100);
                    MySocket.sendDataToFabricClient(data, transfer);
                }


                case 2 -> {
                    double arrow = ((GongData) data).arrow;
                    String transfer = String.format("%d;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f",
                            job, arrow, baoji * 100, baojixiaoguo * 100, cool_reduce * 100,
                            hujia * 100, pojia * 100, fakang * 100, pofa * 100,
                            gedang, shouhu, renxing * 100, shengji * 100);
                    MySocket.sendDataToFabricClient(data, transfer);
                }
                case 3 -> {
                    double zhenfa = ((DanData) data).zhenfa;
                    String transfer = String.format("%d;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f",
                            job, zhenfa, baoji * 100, baojixiaoguo * 100, cool_reduce * 100,
                            hujia * 100, pojia * 100, fakang * 100, pofa * 100,
                            gedang, shouhu, renxing * 100, shengji * 100);
                    MySocket.sendDataToFabricClient(data, transfer);
                }
            }


        });
    }

    public static void transferMonsterData(Player player) {
        new DisplayHp(player).runTaskTimerAsynchronously(Yuehua.instance, 100, 5);
    }


}


































