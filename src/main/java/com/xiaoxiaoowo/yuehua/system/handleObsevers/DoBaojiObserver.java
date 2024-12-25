package com.xiaoxiaoowo.yuehua.system.handleObsevers;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import org.bukkit.World;
import org.bukkit.entity.Mob;

public final class DoBaojiObserver {
    private static final World world = GetEntity.world;

    public static double doBaoji(String id, Data data, MonsterData monsterData) {
        switch (id) {

            default -> {
                return 1.0d;
            }
        }
    }
}
