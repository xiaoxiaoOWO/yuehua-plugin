package com.xiaoxiaoowo.yuehua.system.handleMonsters;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import org.bukkit.Location;

public final class DoMonsterAttack {
    public static double doMonsterAttack(String id, Data data, MonsterData monsterData) {
        switch (id) {
            default -> {
                return 1.0d;
            }
        }
    }

    public static void doMonsterAttack(String id, Location location, MonsterData monsterData) {
        switch (id) {
        }
    }
}
