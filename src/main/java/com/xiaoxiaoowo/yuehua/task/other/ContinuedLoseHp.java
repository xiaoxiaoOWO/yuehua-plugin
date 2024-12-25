package com.xiaoxiaoowo.yuehua.task.other;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.system.Damage;
import org.bukkit.scheduler.BukkitRunnable;

public final class ContinuedLoseHp extends BukkitRunnable {
    int num;
    MonsterData monsterData;
    Data data;
    double damage;
    boolean isPlayerAttack;


    public ContinuedLoseHp(int num, MonsterData monsterData, Data data, double damage, boolean isPlayerAttack) {
        this.num = num;
        this.monsterData = monsterData;
        this.data = data;
        this.damage = damage;
        this.isPlayerAttack = isPlayerAttack;
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

        if (monsterData.monster.isDead()) {
            this.cancel();
            return;
        }


        if (isPlayerAttack) {
            Damage.damageMonster(data, damage, monsterData);
        } else {
            Damage.damagePlayer(data, damage, monsterData);
        }


        num--;
    }
}
