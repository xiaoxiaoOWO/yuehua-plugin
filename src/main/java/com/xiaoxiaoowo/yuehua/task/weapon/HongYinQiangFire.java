package com.xiaoxiaoowo.yuehua.task.weapon;


import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.display.utils.ParticleUtils;
import com.xiaoxiaoowo.yuehua.system.Buff;
import com.xiaoxiaoowo.yuehua.system.Damage;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import org.bukkit.Particle;
import org.bukkit.entity.Mob;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;


public final class HongYinQiangFire extends BukkitRunnable {
    int num;
    double damage;
    Data data;
    Vector start;
    Vector end;


    public HongYinQiangFire(Data data, double damage, Vector start, Vector end) {
        this.num = 3;
        this.data = data;
        this.damage = damage;
        this.start = start;
        this.end = end;
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

        for (Mob mob : GetEntity.getLineMonster(start, end, 0.5)) {
            MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
            Damage.damageMonster(data, damage, monsterData);
            ParticleUtils.atMonster(mob, Particle.FLAME);
            Buff.deFakang(monsterData, 20 * 3, 0.1);
        }

        num--;
    }
}
