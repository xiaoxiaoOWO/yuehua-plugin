package com.xiaoxiaoowo.yuehua.task.regainAttribute;

import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;

import java.util.Map;


public final class RegainPofa implements Runnable {
    MonsterData monsterData;
    double count;
    String id;

    public RegainPofa(MonsterData monsterData, double count, String id) {
        this.monsterData = monsterData;
        this.count = count;
        this.id = id;
    }

    @Override
    public void run() {
        long timeNow = GetEntity.world.getGameTime();
        Map<String, Object> extraData = monsterData.extraData;
        long timeEnd = (long) extraData.get(id);
        if (timeEnd > timeNow) {
            return;
        }
        monsterData.updatePofa(count);
    }
}
