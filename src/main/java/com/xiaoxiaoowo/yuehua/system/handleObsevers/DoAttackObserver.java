package com.xiaoxiaoowo.yuehua.system.handleObsevers;

import com.xiaoxiaoowo.yuehua.data.Data;
import org.bukkit.entity.Mob;

public final class DoAttackObserver {
    public static double doAttack(String id , Data data, Mob monster){
        switch (id){
            default -> {
                return 1.0d;
            }
        }
    }
}
