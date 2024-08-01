package com.xiaoxiaoowo.yuehua.event.entity;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoCuredObserver;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;

public final class RegainHealth implements Listener {
    @EventHandler
    public void onRegainHealth(EntityRegainHealthEvent e) {
        Entity entity = e.getEntity();
        if (entity instanceof Player) {
            Data data = Yuehua.playerData.get(entity.getUniqueId());
            double shengji = data.shengji;
            e.setAmount(e.getAmount() * shengji);

            for (String observer : data.curedObservers) {
                DoCuredObserver.doCured(observer, data);
            }
        } else {
            if (!entity.getScoreboardTags().contains("m")) {
                return;
            }
            MonsterData data = Yuehua.monsterData.get(entity.getUniqueId());
            double shengji = data.shengji;
            e.setAmount(e.getAmount() * shengji);
        }
    }
}
