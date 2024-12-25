package com.xiaoxiaoowo.yuehua.task.regainAttribute;

import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.system.Buff;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import org.bukkit.entity.Mob;

import java.util.Map;

public final class XuanYun implements Runnable {
    MonsterData monsterData;
    Mob mob;

    public XuanYun(MonsterData monsterData) {
        this.monsterData = monsterData;
        this.mob = monsterData.monster;
    }

    @Override
    public void run() {
        long timeNow = GetEntity.world.getGameTime();
        Map<String, Object> extraData = monsterData.extraData;
        long timeEnd = (long) extraData.get(Buff.NOWARE);
        if (timeEnd > timeNow) {
            return;
        }
        mob.setAware(true);


    }
}
