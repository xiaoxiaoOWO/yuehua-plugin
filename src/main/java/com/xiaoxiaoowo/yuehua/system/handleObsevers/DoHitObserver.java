package com.xiaoxiaoowo.yuehua.system.handleObsevers;

import com.xiaoxiaoowo.yuehua.data.GongData;
import org.bukkit.entity.Mob;

public final class DoHitObserver {
    public static double doHit(String id, GongData data, Mob monster) {
        switch (id) {
            default -> {
                return 1.0;
            }
        }
    }

}
