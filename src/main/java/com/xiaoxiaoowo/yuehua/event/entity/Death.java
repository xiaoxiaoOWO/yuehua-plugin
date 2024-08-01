package com.xiaoxiaoowo.yuehua.event.entity;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.itemstack.other.Food;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.Inventory;

import java.util.Random;

public final class Death implements Listener {
    private static final Random random = new Random();

    @EventHandler
    public void onDeath(EntityDeathEvent e) {
        LivingEntity entity = e.getEntity();
        if (entity.getScoreboardTags().contains("m")) {
            //给予战利品,经验
            MonsterData monsterData = Yuehua.monsterData.get(entity.getUniqueId());
            Player player = monsterData.lastAttacker;
            if (player == null || !player.isOnline()) {
                return;
            }

            Inventory inventory = player.getInventory();
            switch (monsterData.id) {
                case "test" -> inventory.addItem(Food.baoZi);
            }
        }
    }
}
