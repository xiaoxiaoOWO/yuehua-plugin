package com.xiaoxiaoowo.yuehua.event.Projectile;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.system.handleMonsters.DoMonsterAttack;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoPlayerProjectileObserver;
import com.xiaoxiaoowo.yuehua.system.handlePets.DoPetAttack;
import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.Set;

public final class Hit implements Listener {
    //处理弹射物击中方块事件
    @EventHandler
    public void onHit(ProjectileHitEvent e) {
        Entity shooted = e.getHitEntity();
        if (shooted != null) {
            //击中实体
            Projectile projectile = e.getEntity();
            if (projectile.getType() == EntityType.POTION) {
                return;
            }
            Entity shooter = (Entity) projectile.getShooter();
            if (shooter == null) {
                //灵箭
                if (shooted.getType() == EntityType.PLAYER) {
                    PersistentDataContainer pdc = projectile.getPersistentDataContainer();
                    if (pdc.has(DataContainer.id)) {
                        String id = pdc.get(DataContainer.id, PersistentDataType.STRING);
                        DoPlayerProjectileObserver.doProjectile(id, (Player) shooted, pdc);
                    }
                    e.setCancelled(true);
                    projectile.remove();
                    return;
                }
                e.setCancelled(true);
                projectile.remove();
                return;
            }
            Set<String> shootedtags = shooted.getScoreboardTags();
            Set<String> shooterTags = shooter.getScoreboardTags();
            if (shootedtags.contains("m")) {
                if (shooterTags.contains("m")) {
                    e.setCancelled(true);
                }
            } else {
                if (shooterTags.contains("p") || shooter.getType() == EntityType.PLAYER) {
                    e.setCancelled(true);
                }
            }
            return;
        }
        //击中方块
        Block block = e.getHitBlock();
        Projectile projectile = e.getEntity();
        Entity shooter = (Entity) projectile.getShooter();
        if (shooter == null) {
            //灵箭
            PersistentDataContainer pdc = projectile.getPersistentDataContainer();
            if (pdc.has(DataContainer.id)) {
                String id = pdc.get(DataContainer.id, PersistentDataType.STRING);
                String playerName = pdc.get(DataContainer.shooter, PersistentDataType.STRING);
                Player player = Bukkit.getPlayer(playerName);
                if (player == null) {
                    e.setCancelled(true);
                    projectile.remove();
                    return;
                }
                DoPlayerProjectileObserver.doProjectile(id, player, pdc);
                e.setCancelled(true);
                projectile.remove();
                return;
            }
            e.setCancelled(true);
            projectile.remove();
            return;
        }
        Set<String> tags = projectile.getScoreboardTags();

        if (shooter.getType() == EntityType.PLAYER) {
            GongData gongData = (GongData) Yuehua.playerData.get(shooter.getUniqueId());
            for (String tag : tags) {
                DoPlayerProjectileObserver.doProjectile(tag, gongData, block.getLocation());
            }
        } else {

            if (shooter.getScoreboardTags().contains("p")) {
                for (String tag : tags) {
                    DoPetAttack.doPetAttack(tag, block.getLocation(), Yuehua.petData.get(shooter.getUniqueId()));
                }
                return;
            }

            for (String tag : tags) {
                DoMonsterAttack.doMonsterAttack(tag, block.getLocation(), Yuehua.monsterData.get(shooter.getUniqueId()));
            }
        }


    }
}
