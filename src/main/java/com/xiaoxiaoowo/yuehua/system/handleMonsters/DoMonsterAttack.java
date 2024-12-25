package com.xiaoxiaoowo.yuehua.system.handleMonsters;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.PetData;
import com.xiaoxiaoowo.yuehua.system.Buff;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import org.bukkit.Location;
import org.bukkit.entity.Bee;
import org.bukkit.entity.Player;

public final class DoMonsterAttack {
    public static double doMonsterAttack(String id, Data data, MonsterData monsterData) {
        switch (id) {
            case "bee" -> {
                doBee(monsterData);
                return 1.0d;
            }

            case "zhizhunvwang" -> {
                doZhiZhuNvWang(data);
                return 1.0d;
            }

            default -> {
                return 1.0d;
            }
        }
    }

    public static void doMonsterAttack(String id, Location location, MonsterData monsterData) {
        switch (id) {
        }
    }

    public static double doMonsterAttack(String id, PetData petData, MonsterData monsterData) {
        switch (id) {
            case "bee" -> {
                doBee(monsterData);
                return 1.0d;
            }



            default -> {
                return 1.0d;
            }
        }
    }

    public static void doZhiZhuNvWang(Data data) {
        Buff.zhusi(data, 3 * 20);
    }

    public static void doBee(MonsterData monsterData) {
        Bee bee = (Bee) monsterData.monster;
        Scheduler.syncLater(() -> {
            bee.setHasStung(false);
            bee.setAnger(Integer.MAX_VALUE);

            Player player = GetEntity.getNearestPlayer(bee.getLocation(), 8, 8, 8);
            if (player == null) {
                bee.setTarget(monsterData.lastAttacker);
            } else {
                bee.setTarget(player);
            }

        }, 1);

    }
}
