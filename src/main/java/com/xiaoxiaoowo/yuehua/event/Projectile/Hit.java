package com.xiaoxiaoowo.yuehua.event.Projectile;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.system.handleMonsters.DoMonsterAttack;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoPlayerProjectile;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

import java.util.Set;

public final class Hit implements Listener {
    //处理弹射物击中方块事件
    @EventHandler
    public void onHit(ProjectileHitEvent e) {
        Block block = e.getHitBlock();
        if (block == null) {
            return;
        }
        Projectile projectile = e.getEntity();
        Entity entity = (Entity) projectile.getShooter();
        if (entity == null) {
            return;
        }
        Set<String> tags = projectile.getScoreboardTags();

        if (entity.getType() == EntityType.PLAYER) {
            GongData gongData = (GongData) Yuehua.playerData.get(entity.getUniqueId());
            for (String tag : tags) {
                DoPlayerProjectile.doProjectile(tag, gongData, block.getLocation());
            }
        } else {
            for (String tag : tags) {
                DoMonsterAttack.doMonsterAttack(tag, block.getLocation(), Yuehua.monsterData.get(entity.getUniqueId()));
            }
        }


    }
}
