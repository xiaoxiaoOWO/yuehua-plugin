package com.xiaoxiaoowo.yuehua.event.entity;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.itemstack.other.Food;
import com.xiaoxiaoowo.yuehua.system.handleMonsters.DoDeath;
import com.xiaoxiaoowo.yuehua.utils.MyLootTable;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.Inventory;

import java.util.HashMap;
import java.util.Random;

public final class Death implements Listener {
    private static final Random random = new Random();

    private static final HashMap<String, MyLootTable> lootTable = new HashMap<>(){

    };

    @EventHandler
    public void onDeath(EntityDeathEvent e) {
        LivingEntity entity = e.getEntity();
        if (entity.getScoreboardTags().contains("m")) {

            // 怪物死亡监听器
            MonsterData monsterData = Yuehua.monsterData.get(entity.getUniqueId());

            // 怪物掉落
            Player player = monsterData.lastAttacker;

            for (String observer : monsterData.killedObservers){
                DoDeath.doDeath(observer, monsterData,player);
            }

            if (player == null || !player.isOnline()) {
                return;
            }
            lootTable.get(monsterData.id).give(player);

        }
    }
}
