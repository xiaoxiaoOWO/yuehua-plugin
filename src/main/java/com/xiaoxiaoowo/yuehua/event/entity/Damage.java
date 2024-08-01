package com.xiaoxiaoowo.yuehua.event.entity;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoAttackedObserver;
import org.bukkit.attribute.Attribute;
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
            if(data == null){
                return;
            }

            double max_hp = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
            switch (e.getCause()) {
                //仙人掌
                case CONTACT -> {
                    double percent = 0.1;
                    e.setDamage(max_hp * percent);
                    for (String observer : data.attackedObservers) {
                        DoAttackedObserver.doAttacked(observer, data,null);
                    }
                }


                case VOID, STARVATION -> player.setHealth(0);

                case FALL -> {
                    double percent = e.getDamage() * 0.05;
                    double shuailuomian = data.shuailuomian;
                    e.setDamage(max_hp * percent * (1.0 - shuailuomian));

                    for (String observer : data.attackedObservers) {
                        DoAttackedObserver.doAttacked(observer, data,null);
                    }
                }

                //火焰伤害
                case FIRE, FIRE_TICK, LAVA, HOT_FLOOR -> {
                    double percent = 0.1;
                    double huomian = data.huomian;
                    e.setDamage(max_hp * percent * (1.0 - huomian));

                    for (String observer : data.attackedObservers) {
                        DoAttackedObserver.doAttacked(observer, data,null);
                    }
                }


                case DROWNING -> {
                    double percent = 0.1;
                    e.setDamage(max_hp * percent);

                    for (String observer : data.attackedObservers) {
                        DoAttackedObserver.doAttacked(observer, data,null);
                    }
                }

                case FREEZE -> {
                    double percent = 0.1;
                    double bingmian = data.bingmian;
                    e.setDamage(max_hp * percent * (1.0 - bingmian));

                    for (String observer : data.attackedObservers) {
                        DoAttackedObserver.doAttacked(observer, data,null);
                    }
                }

                case POISON, WITHER -> {
                    double percent = 0.1;
                    double dumian = data.dumian;
                    e.setDamage(max_hp * percent * (1.0 - dumian));

                    for (String observer : data.attackedObservers) {
                        DoAttackedObserver.doAttacked(observer, data,null);
                    }
                }


            }
        }
    }
}
