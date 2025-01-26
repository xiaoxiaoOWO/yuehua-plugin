package com.xiaoxiaoowo.yuehua.task.other;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.system.Damage;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Mob;
import org.bukkit.scheduler.BukkitRunnable;

public final class ContinueRangeDamage extends BukkitRunnable {
    int num;
    double damage;
    Data data;
    Location center;
    double range;

    public ContinueRangeDamage(int num, Data data, double damage, Location center, double range) {
        this.num = num;
        this.data = data;
        this.damage = damage;
        this.center = center;
        this.range = range;
    }

    @Override
    public void run() {
        if (num == 0) {
            this.cancel();
            return;
        }

        if (!data.player.isConnected()) {
            this.cancel();
            return;
        }

        for (Entity entity : GetEntity.getMonsters(center, range, range, range)) {
            MonsterData monsterData = Yuehua.monsterData.get(entity.getUniqueId());
            Damage.damageMonster(data, damage, monsterData);
        }

        num--;
    }
}
