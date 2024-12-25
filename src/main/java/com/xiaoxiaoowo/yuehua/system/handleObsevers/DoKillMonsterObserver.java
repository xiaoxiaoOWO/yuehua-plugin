package com.xiaoxiaoowo.yuehua.system.handleObsevers;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.task.check.*;
import com.xiaoxiaoowo.yuehua.utils.AdvancementSet;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.time.Duration;
import java.util.Random;

public final class DoKillMonsterObserver {
    public static final Random random = new Random();

    public static void doKill(String id, Data data, MonsterData monsterData) {
        switch (id) {
            case "check" -> doCheck(data);
            case "count" -> doCount(data, monsterData);
        }
    }

    public static void doCount(Data data, MonsterData monsterData) {
        switch (monsterData.id) {
            case "eastKulou" -> {
                data.killEastSkeletonConut++;
                Player player = data.player;
                if (data.killEastSkeletonConut > 100) {
                    AdvancementSet.giveAdv(player, AdvancementSet.eastkulou, 10);
                }
                if (data.killEastSkeletonConut > 1000) {
                    AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_final, 30);
                }

            }
            case "eastZhizhu" -> {
                data.killEastSpiderCount++;
                Player player = data.player;
                if (data.killEastSpiderCount > 100) {
                    AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu, 10);
                }
                if (data.killEastSpiderCount > 1000) {
                    AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_final, 30);
                }
            }
            case "eastJiangshi" -> {
                data.killEastZombieCount++;
                Player player = data.player;
                if (data.killEastZombieCount > 100) {
                    AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi, 10);
                }
                if (data.killEastZombieCount > 1000) {
                    AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_final, 30);
                }
            }
            case "eastZhizhuJinyin" -> {
                data.killEastSpiderEliteCount++;
                Player player = data.player;
                if (data.killEastSpiderEliteCount > 100) {
                    AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin, 10);
                }
                if (data.killEastSpiderEliteCount > 1000) {
                    AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_final, 30);
                }
            }
            case "eastDuFeng" -> {
                data.killEastPoisonFlyCount++;
                Player player = data.player;
                if (data.killEastPoisonFlyCount > 100) {
                    AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng, 10);
                }
                if (data.killEastPoisonFlyCount > 1000) {
                    AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_final, 30);
                }
            }
            case "eastkugugongjianshou" -> {
                data.killEastArrowSkeletonCount++;
                Player player = data.player;
                if (data.killEastArrowSkeletonCount > 100) {
                    AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou, 10);
                }
                if (data.killEastArrowSkeletonCount > 1000) {
                    AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_final, 30);
                }
            }
            case "eastjiangshijinyin" -> {
                data.killEastZombieEliteCount++;
                Player player = data.player;
                if (data.killEastZombieEliteCount > 100) {
                    AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin, 10);
                }
                if (data.killEastZombieEliteCount > 1000) {
                    AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_final, 30);
                }
            }
            case "shanshenshooter" -> {
                data.killEastArrowSkeletonMountainCount++;
                Player player = data.player;
                if (data.killEastArrowSkeletonMountainCount > 100) {
                    AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter, 10);
                }
                if (data.killEastArrowSkeletonMountainCount > 1000) {
                    AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_final, 30);
                }
            }
            case "shanshenspider" -> {
                data.killEastSpiderMountainCount++;
                Player player = data.player;
                if (data.killEastSpiderMountainCount > 100) {
                    AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider, 10);
                }
                if (data.killEastSpiderMountainCount > 1000) {
                    AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_final, 30);
                }
            }
            case "shanshenzombie" -> {
                data.killEastZombieMountainCount++;
                Player player = data.player;
                if (data.killEastZombieMountainCount > 100) {
                    AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie, 10);
                }
                if (data.killEastZombieMountainCount > 1000) {
                    AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_final, 30);
                }
            }
            case "yaojindufeng" -> {
                data.killEastPoisonFlyMountainCount++;
                Player player = data.player;
                if (data.killEastPoisonFlyMountainCount > 100) {
                    AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng, 10);
                }
                if (data.killEastPoisonFlyMountainCount > 1000) {
                    AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_final, 30);
                }
            }
            case "yaojinshooter" -> {
                data.killEastArrowSkeletonSHENMUCount++;
                Player player = data.player;
                if (data.killEastArrowSkeletonSHENMUCount > 100) {
                    AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter, 10);
                }
                if (data.killEastArrowSkeletonSHENMUCount > 1000) {
                    AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_final, 30);
                }
            }
            case "yaojingpanda" -> {
                data.killEastPandaMountainCount++;
                Player player = data.player;
                if (data.killEastPandaMountainCount > 100) {
                    AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda, 10);
                }
                if (data.killEastPandaMountainCount > 1000) {
                    AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_final, 30);
                }
            }
            case "zhizhunvwang" -> {
                data.killEastSpiderQueenMountainCount++;
                Player player = data.player;
                if (data.killEastSpiderQueenMountainCount > 50) {
                    AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang, 10);
                }
                if (data.killEastSpiderQueenMountainCount > 500) {
                    AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_final, 30);
                }
            }
            case "jianxiguimei" -> {
                data.killEastWaterGhostMountainCount++;
                Player player = data.player;
                if (data.killEastWaterGhostMountainCount > 50) {
                    AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei, 10);
                }
                if (data.killEastWaterGhostMountainCount > 500) {
                    AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_final, 30);
                }
            }
            case "linyouduzhu" -> {
                data.killEastPoisonSpiderMountainCount++;
                Player player = data.player;
                if (data.killEastPoisonSpiderMountainCount > 50) {
                    AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu, 10);
                }
                if (data.killEastPoisonSpiderMountainCount > 500) {
                    AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_final, 30);
                }
            }
        }
    }

    public static void doCheck(Data data) {
        data.nextCheckCount--;
        if (data.nextCheckCount <= 0) {
            if (data.fuben != 0) {
                data.nextCheckCount = random.nextInt(50, 500);
                return;
            }


            Player player = data.player;
            Location locBefore = data.checkLoc;
            if (locBefore == null) {
                locBefore = player.getLocation();
            }
            Location locNow = player.getLocation();

            double distanceSquare = GetEntity.mydistance(locBefore, locNow);
            int distance = (int) Math.sqrt(distanceSquare);

            int randomBase = random.nextInt(50, 500);
            int distanceAdd = Math.min(500, distance * 50);

            data.nextCheckCount = randomBase + distanceAdd;
            data.checkLoc = locNow;

            data.checkState = random.nextInt(1, 7);


            switch (data.checkState) {
                case 1 -> {
                    int randomNum = random.nextInt(1, 9999);
                    new Num(data, randomNum).runTaskTimerAsynchronously(Yuehua.instance, 0, 20 * 10);
                    data.extraData.put("checkNum", randomNum);
                }

                case 2 -> new DayOfWeek(data).runTaskTimerAsynchronously(Yuehua.instance, 0, 20 * 10);

                case 3 -> new Month(data).runTaskTimerAsynchronously(Yuehua.instance, 0, 20 * 10);

                case 4 -> new Year(data).runTaskTimerAsynchronously(Yuehua.instance, 0, 20 * 10);

                case 5 -> new Xiaoxiao(data).runTaskTimerAsynchronously(Yuehua.instance, 0, 20 * 10);

                case 6 -> new Fulong(data).runTaskTimerAsynchronously(Yuehua.instance, 0, 20 * 10);
            }

            Scheduler.syncLater(() -> {
                if (player.isConnected()) {
                    if (data.checkState != 0) {
                        PersistentDataContainer pdc = player.getPersistentDataContainer();
                        int guajiCount = pdc.get(DataContainer.guajiCount, PersistentDataType.INTEGER) + 1;
                        pdc.set(DataContainer.guajiCount, PersistentDataType.INTEGER, guajiCount);

                        int time = 6 * guajiCount * guajiCount;

                        player.ban("疑似挂机刷物品！", Duration.ofHours(time), null);
                    }
                }
            }, 20 * 60);
        }
    }
}
