package com.xiaoxiaoowo.yuehua.system;

import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.task.hujia.Xie1;
import com.xiaoxiaoowo.yuehua.task.hujia.Xie2345;
import com.xiaoxiaoowo.yuehua.task.hujia.Xiong1;
import com.xiaoxiaoowo.yuehua.task.hujia.Xiong2345;
import com.xiaoxiaoowo.yuehua.task.yiqi.LAOZHANSHIDUNPAI;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;

public final class Init {
    public static void initZhan(ZhanData data, String id) {
        switch (id) {
            case "tou1", "zhanTou2", "zhanTou3", "zhanTou4", "zhanTou5" -> data.attackedObservers.add(id);
            case "xiong1" -> {
                long time = GetEntity.world.getGameTime();
                Scheduler.syncLater(new Xiong1(data, time), (long) (30 * 20 * data.real_cool));
                data.extraData.put(id, time);

            }
            case "tui1", "zhanTui2", "zhanTui3", "zhanTui4", "zhanTui5" -> data.jiNengObservers.add(id);
            case "xie1" -> {
                long time = GetEntity.world.getGameTime();
                Scheduler.syncLater(new Xie1(data, time), (long) (40 * 20 * data.real_cool));
                data.extraData.put(id, time);
            }

            case "zhanXie2", "zhanXie3", "zhanXie4", "zhanXie5" -> {
                long time = GetEntity.world.getGameTime();
                Scheduler.syncLater(new Xie2345(data, time, id), (long) (60 * 20 * data.real_cool));
                data.extraData.put(id, time);
            }

            case "zhanXiong2", "zhanXiong3", "zhanXiong4", "zhanXiong5" -> {
                long time = GetEntity.world.getGameTime();
                Scheduler.syncLater(new Xiong2345(data, time, id), (long) (50 * 20 * data.real_cool));
                data.extraData.put(id, time);
            }

            case "laoZhanShiDunPai" -> {
                long time = GetEntity.world.getGameTime();
                Scheduler.syncLater(new LAOZHANSHIDUNPAI(data, time), (long) (20 * 20 * data.real_cool));
                data.extraData.put(id, time);
            }

        }
    }

    public static void deInitZhan(ZhanData data, String id) {
        switch (id) {
            case "tou1", "zhanTou2", "zhanTou3", "zhanTou4", "zhanTou5" -> data.attackedObservers.remove(id);
            case "xiong1", "xie1", "zhanXie2", "zhanXie3", "zhanXie4", "zhanXie5", "zhanXiong2", "zhanXiong3",
                 "zhanXiong4", "zhanXiong5", "laoZhanShiDunPai" -> data.extraData.remove(id);
            case "tui1", "zhanTui2", "zhanTui3", "zhanTui4", "zhanTui5" -> data.jiNengObservers.remove(id);

        }
    }

    public static void initGong(GongData data, String id) {
        switch (id) {
            case "tou1", "gongTou2", "gongTou3", "gongTou4", "gongTou5" -> data.attackedObservers.add(id);
            case "xiong1" -> {
                long time = GetEntity.world.getGameTime();
                Scheduler.syncLater(new Xiong1(data, time), (long) (30 * 20 * data.real_cool));
                data.extraData.put(id, time);

            }
            case "tui1", "gongTui2", "gongTui3", "gongTui4", "gongTui5" -> data.jiNengObservers.add(id);
            case "xie1" -> {
                long time = GetEntity.world.getGameTime();
                Scheduler.syncLater(new Xie1(data, time), (long) (40 * 20 * data.real_cool));
                data.extraData.put(id, time);
            }

            case "gongXie2", "gongXie3", "gongXie4", "gongXie5" -> {
                long time = GetEntity.world.getGameTime();
                Scheduler.syncLater(new Xie2345(data, time, id), (long) (60 * 20 * data.real_cool));
                data.extraData.put(id, time);
            }

            case "gongXiong2", "gongXiong3", "gongXiong4", "gongXiong5" -> {
                long time = GetEntity.world.getGameTime();
                Scheduler.syncLater(new Xiong2345(data, time, id), (long) (50 * 20 * data.real_cool));
                data.extraData.put(id, time);
            }

            case "laoLieHuJianDai" -> data.hitObservers.add(id);

        }
    }

    public static void deInitGong(GongData data, String id) {
        switch (id) {
            case "tou1", "gongTou2", "gongTou3", "gongTou4", "gongTou5" -> data.attackedObservers.remove(id);
            case "xiong1", "xie1", "gongXie2", "gongXie3", "gongXie4", "gongXie5", "gongXiong2", "gongXiong3",
                 "gongXiong4", "gongXiong5" -> data.extraData.remove(id);
            case "tui1", "gongTui2", "gongTui3", "gongTui4", "gongTui5" -> data.jiNengObservers.remove(id);

            case "laoLieHuJianDai" -> data.hitObservers.remove(id);

        }
    }

    public static void initDan(DanData data, String id) {
        switch (id) {
            case "heiTieGuo","qinTongGuo","lianDanLu","suoHunLu","qiShaDing","hunYuanShenDing" -> data.zhenfaObservers.add(id);

            case "tou1", "danTou2", "danTou3", "danTou4", "danTou5" -> data.attackedObservers.add(id);
            case "xiong1" -> {
                long time = GetEntity.world.getGameTime();
                Scheduler.syncLater(new Xiong1(data, time), (long) (30 * 20 * data.real_cool));
                data.extraData.put(id, time);

            }
            case "tui1", "danTui2", "danTui3", "danTui4", "danTui5" -> {
                data.jiNengObservers.add(id);
                data.zhenfaObservers.add(id);
            }
            case "xie1" -> {
                long time = GetEntity.world.getGameTime();
                Scheduler.syncLater(new Xie1(data, time), (long) (40 * 20 * data.real_cool));
                data.extraData.put(id, time);
            }

            case "danXie2", "danXie3", "danXie4", "danXie5" -> {
                long time = GetEntity.world.getGameTime();
                Scheduler.syncLater(new Xie2345(data, time, id), (long) (60 * 20 * data.real_cool));
                data.extraData.put(id, time);
            }

            case "danXiong2", "danXiong3", "danXiong4", "danXiong5" -> {
                long time = GetEntity.world.getGameTime();
                Scheduler.syncLater(new Xiong2345(data, time, id), (long) (50 * 20 * data.real_cool));
                data.extraData.put(id, time);
            }

        }
    }

    public static void deInitDan(DanData data, String id) {
        switch (id) {
            case "heiTieGuo","qinTongGuo","lianDanLu","suoHunLu","qiShaDing","hunYuanShenDing" -> data.zhenfaObservers.remove(id);
            case "tou1", "danTou2", "danTou3", "danTou4", "danTou5" -> data.attackedObservers.remove(id);
            case "xiong1", "xie1", "danXie2", "danXie3", "danXie4", "danXie5", "danXiong2", "danXiong3", "danXiong4",
                 "danXiong5" -> data.extraData.remove(id);
            case "tui1", "danTui2", "danTui3", "danTui4", "danTui5" -> {
                data.jiNengObservers.remove(id);
                data.zhenfaObservers.remove(id);
            }

        }
    }

    public static void initAll(Data data, String id) {
        switch (id) {

        }
    }

    public static void deInitAll(Data data, String id) {
        switch (id) {

        }
    }

    public static void initAllEnderChest(Data data, String id) {
        switch (id) {

        }
    }

    public static void deInitAllEnderChest(Data data, String id) {
        switch (id) {

        }
    }
}
