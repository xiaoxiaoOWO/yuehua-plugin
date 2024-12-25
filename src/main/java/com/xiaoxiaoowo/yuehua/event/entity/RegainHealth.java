package com.xiaoxiaoowo.yuehua.event.entity;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoCuredObserver;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;

public final class RegainHealth implements Listener {
    @EventHandler
    public void onRegainHealth(EntityRegainHealthEvent e) {
        Entity entity = e.getEntity();
        if (entity instanceof Player player) {
            switch (e.getRegainReason()) {
                case MAGIC, MAGIC_REGEN, SATIATED -> {
                    Data data = Yuehua.playerData.get(player.getUniqueId());
                    if (data == null) {
                        return;
                    }
                    double shengji = data.shengji;
                    double amount = 1 + player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() * 0.005;
                    for (String observer : data.curedObservers) {
                        amount = amount * DoCuredObserver.doCured(observer, data);
                    }

                    e.setAmount(amount * shengji);
                }
            }
        }
    }
}
