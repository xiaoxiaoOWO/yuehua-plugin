package com.xiaoxiaoowo.yuehua.event.entity;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoAttackedObserver;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;


public final class Damage implements Listener {

    @EventHandler
    public void onDamage(EntityDamageEvent e) {
        Entity damagee = e.getEntity();
        if (damagee.getType() == EntityType.PLAYER) {
            Player player = (Player) damagee;
            Data data = Yuehua.playerData.get(damagee.getUniqueId());
            if (data == null) {
                return;
            }


            double max_hp = player.getHealth();
            switch (e.getCause()) {


                case VOID, STARVATION, KILL, WORLD_BORDER -> player.setHealth(0);

                case FALL -> {
                    double damage = e.getDamage();
                    if (damage < 3) {
                        e.setCancelled(true);
                        return;
                    }

                    double percent = damage * 0.05;
                    double shuailuomian = data.shuailuomian;

                    for (String observer : data.attackedObservers) {
                        percent = percent * DoAttackedObserver.doAttacked(observer, data, null, max_hp * percent * (1 - shuailuomian));
                    }

                    e.setDamage(Math.max(2, max_hp * percent * (1.0 - shuailuomian)));
                }

                //火焰伤害
                case FIRE, FIRE_TICK, LAVA, HOT_FLOOR, CAMPFIRE -> {
                    double percent = 0.1;
                    double huomian = data.huomian;


                    for (String observer : data.attackedObservers) {
                        percent = percent * DoAttackedObserver.doAttacked(observer, data, null, max_hp * percent * (1.0 - huomian));
                    }
                    e.setDamage(Math.max(2, max_hp * percent * (1.0 - huomian)));
                }


                case DROWNING,CONTACT -> {
                    double percent = 0.1;

                    for (String observer : data.attackedObservers) {
                        percent = percent * DoAttackedObserver.doAttacked(observer, data, null, max_hp * percent);
                    }

                    e.setDamage(Math.max(2, max_hp * percent));
                }

                case FREEZE -> {
                    double percent = 0.1;
                    double bingmian = data.bingmian;


                    for (String observer : data.attackedObservers) {
                        percent = percent * DoAttackedObserver.doAttacked(observer, data, null, max_hp * percent * (1.0 - bingmian));
                    }

                    e.setDamage(Math.max(2, max_hp * percent * (1.0 - bingmian)));
                }

                case POISON, WITHER -> {
                    double percent = 0.1;
                    double dumian = data.dumian;


                    for (String observer : data.attackedObservers) {
                        percent = percent * DoAttackedObserver.doAttacked(observer, data, null,  max_hp * percent * (1.0 - dumian));
                    }

                    e.setDamage(Math.max(2, max_hp * percent * (1.0 - dumian)));
                }


            }
        }
    }
}
