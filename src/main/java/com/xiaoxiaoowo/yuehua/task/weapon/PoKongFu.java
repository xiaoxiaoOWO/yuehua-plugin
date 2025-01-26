package com.xiaoxiaoowo.yuehua.task.weapon;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.display.utils.ParticleUtils;
import com.xiaoxiaoowo.yuehua.system.Damage;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.data.BlockData;
import org.bukkit.scheduler.BukkitRunnable;

public final class PoKongFu extends BukkitRunnable {
    int num;
    MonsterData monsterData;
    Data data;
    double damage;

    public static final BlockData bedRock = Bukkit.createBlockData(Material.REDSTONE_BLOCK);

    public PoKongFu(int num, MonsterData monsterData, Data data, double damage) {
        this.num = num;
        this.monsterData = monsterData;
        this.data = data;
        this.damage = damage;
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

        Damage.damageMonster(data, damage, monsterData);
        ParticleUtils.atMonsterBlock(monsterData.monster, bedRock);


        num--;
    }
}
