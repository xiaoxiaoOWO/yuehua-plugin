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

                switch (data.killEastSkeletonConut) {
                    case 100 -> AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_100, 5);
                    case 200 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_200, 10);
                    }
                    case 500 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_500, 15);
                    }
                    case 1000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_1000, 20);
                    }
                    case 2000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_2000, 30);
                    }
                    case 5000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_2000, 30);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkulou_5000, 50);
                    }
                }
            }

            case "eastZhizhu" -> {
                data.killEastSpiderCount++;
                Player player = data.player;

                switch (data.killEastSpiderCount) {
                    case 100 -> AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_100, 5);
                    case 200 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_200, 10);
                    }
                    case 500 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_500, 15);
                    }
                    case 1000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_1000, 20);
                    }
                    case 2000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_2000, 30);
                    }
                    case 5000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_2000, 30);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhu_5000, 50);
                    }
                }
            }

            case "eastJiangshi" -> {
                data.killEastZombieCount++;
                Player player = data.player;

                switch (data.killEastZombieCount) {
                    case 100 -> AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_100, 5);
                    case 200 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_200, 10);
                    }
                    case 500 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_500, 15);
                    }
                    case 1000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_1000, 20);
                    }
                    case 2000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_2000, 30);
                    }
                    case 5000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_2000, 30);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshi_5000, 50);
                    }
                }
            }

            case "eastZhizhuJinyin" -> {
                data.killEastSpiderEliteCount++;
                Player player = data.player;

                switch (data.killEastSpiderEliteCount) {
                    case 100 -> AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_100, 5);
                    case 200 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_200, 10);
                    }
                    case 500 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_500, 15);
                    }
                    case 1000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_1000, 20);
                    }
                    case 2000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_2000, 30);
                    }
                    case 5000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_2000, 30);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastzhizhujinyin_5000, 50);
                    }
                }
            }

            case "eastDuFeng" -> {
                data.killEastPoisonFlyCount++;
                Player player = data.player;

                switch (data.killEastPoisonFlyCount) {
                    case 100 -> AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_100, 5);
                    case 200 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_200, 10);
                    }
                    case 500 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_500, 15);
                    }
                    case 1000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_1000, 20);
                    }
                    case 2000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_2000, 30);
                    }
                    case 5000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_2000, 30);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastdufeng_5000, 50);
                    }
                }
            }

            case "eastkugugongjianshou" -> {
                data.killEastArrowSkeletonCount++;
                Player player = data.player;

                switch (data.killEastArrowSkeletonCount) {
                    case 100 -> AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_100, 5);
                    case 200 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_200, 10);
                    }
                    case 500 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_500, 15);
                    }
                    case 1000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_1000, 20);
                    }
                    case 2000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_2000, 30);
                    }
                    case 5000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_2000, 30);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastkugugongjianshou_5000, 50);
                    }
                }
            }

            case "eastjiangshijinyin" -> {
                data.killEastZombieEliteCount++;
                Player player = data.player;

                switch (data.killEastZombieEliteCount) {
                    case 100 -> AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_100, 5);
                    case 200 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_200, 10);
                    }
                    case 500 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_500, 15);
                    }
                    case 1000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_1000, 20);
                    }
                    case 2000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_2000, 30);
                    }
                    case 5000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_2000, 30);
                        AdvancementSet.giveAdv(player, AdvancementSet.eastjiangshijinyin_5000, 50);
                    }
                }
            }

            case "shanshenshooter" -> {
                data.killEastArrowSkeletonMountainCount++;
                Player player = data.player;

                switch (data.killEastArrowSkeletonMountainCount) {
                    case 100 -> AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_100, 5);
                    case 200 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_200, 10);
                    }
                    case 500 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_500, 15);
                    }
                    case 1000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_1000, 20);
                    }
                    case 2000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_2000, 30);
                    }
                    case 5000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_2000, 30);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenshooter_5000, 50);
                    }
                }
            }

            case "shanshenspider" -> {
                data.killEastSpiderMountainCount++;
                Player player = data.player;

                switch (data.killEastSpiderMountainCount) {
                    case 100 -> AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_100, 5);
                    case 200 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_200, 10);
                    }
                    case 500 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_500, 15);
                    }
                    case 1000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_1000, 20);
                    }
                    case 2000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_2000, 30);
                    }
                    case 5000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_2000, 30);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenspider_5000, 50);
                    }
                }
            }

            case "shanshenzombie" -> {
                data.killEastZombieMountainCount++;
                Player player = data.player;

                switch (data.killEastZombieMountainCount) {
                    case 100 -> AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_100, 5);
                    case 200 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_200, 10);
                    }
                    case 500 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_500, 15);
                    }
                    case 1000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_1000, 20);
                    }
                    case 2000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_2000, 30);
                    }
                    case 5000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_2000, 30);
                        AdvancementSet.giveAdv(player, AdvancementSet.shanshenzombie_5000, 50);
                    }
                }
            }

            case "yaojindufeng" -> {
                data.killEastPoisonFlyMountainCount++;
                Player player = data.player;

                switch (data.killEastPoisonFlyMountainCount) {
                    case 100 -> AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_100, 5);
                    case 200 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_200, 10);
                    }
                    case 500 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_500, 15);
                    }
                    case 1000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_1000, 20);
                    }
                    case 2000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_2000, 30);
                    }
                    case 5000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_2000, 30);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojindufeng_5000, 50);
                    }
                }
            }

            case "yaojinshooter" -> {
                data.killEastArrowSkeletonSHENMUCount++;
                Player player = data.player;

                switch (data.killEastArrowSkeletonSHENMUCount) {
                    case 100 -> AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_100, 5);
                    case 200 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_200, 10);
                    }
                    case 500 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_500, 15);
                    }
                    case 1000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_1000, 20);
                    }
                    case 2000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_2000, 30);
                    }
                    case 5000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_2000, 30);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojinshooter_5000, 50);
                    }
                }
            }

            case "yaojingpanda" -> {
                data.killEastPandaMountainCount++;
                Player player = data.player;

                switch (data.killEastPandaMountainCount) {
                    case 100 -> AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_100, 5);
                    case 200 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_200, 10);
                    }
                    case 500 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_500, 15);
                    }
                    case 1000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_1000, 20);
                    }
                    case 2000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_2000, 30);
                    }
                    case 5000 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_100, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_200, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_500, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_1000, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_2000, 30);
                        AdvancementSet.giveAdv(player, AdvancementSet.yaojingpanda_5000, 50);
                    }
                }
            }

            case "zhizhunvwang" -> {
                data.killEastSpiderQueenMountainCount++;
                Player player = data.player;

                switch (data.killEastSpiderQueenMountainCount) {
                    case 10 -> AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_10, 5);
                    case 20 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_10, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_20, 10);
                    }
                    case 50 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_10, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_20, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_50, 15);
                    }
                    case 100 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_10, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_20, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_50, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_100, 20);
                    }
                    case 200 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_10, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_20, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_50, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_100, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_200, 30);
                    }
                    case 500 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_10, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_20, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_50, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_100, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_200, 30);
                        AdvancementSet.giveAdv(player, AdvancementSet.zhizhunvwang_500, 50);
                    }
                }
            }

            case "jianxiguimei" -> {
                data.killEastWaterGhostMountainCount++;
                Player player = data.player;

                switch (data.killEastWaterGhostMountainCount) {
                    case 10 -> AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_10, 5);
                    case 20 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_10, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_20, 10);
                    }
                    case 50 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_10, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_20, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_50, 15);
                    }
                    case 100 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_10, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_20, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_50, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_100, 20);
                    }
                    case 200 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_10, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_20, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_50, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_100, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_200, 30);
                    }
                    case 500 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_10, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_20, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_50, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_100, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_200, 30);
                        AdvancementSet.giveAdv(player, AdvancementSet.jianxiguimei_500, 50);
                    }
                }
            }

            case "linyouduzhu" -> {
                data.killEastPoisonSpiderMountainCount++;
                Player player = data.player;

                switch (data.killEastPoisonSpiderMountainCount) {
                    case 10 -> AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_10, 5);
                    case 20 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_10, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_20, 10);
                    }
                    case 50 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_10, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_20, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_50, 15);
                    }
                    case 100 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_10, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_20, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_50, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_100, 20);
                    }
                    case 200 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_10, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_20, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_50, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_100, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_200, 30);
                    }
                    case 500 -> {
                        AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_10, 5);
                        AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_20, 10);
                        AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_50, 15);
                        AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_100, 20);
                        AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_200, 30);
                        AdvancementSet.giveAdv(player, AdvancementSet.linyouduzhu_500, 50);
                    }
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
