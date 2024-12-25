package com.xiaoxiaoowo.yuehua.system.handleObsevers;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import org.bukkit.World;

public final class DoCuredObserver {
    private static final World world = GetEntity.world;

    public static double doCured(String id, Data data) {
        switch (id) {
            default -> {
                return 1.0d;
            }
        }
    }

}
