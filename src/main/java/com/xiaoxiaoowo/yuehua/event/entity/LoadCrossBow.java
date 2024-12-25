package com.xiaoxiaoowo.yuehua.event.entity;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import io.papermc.paper.event.entity.EntityLoadCrossbowEvent;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.PlayerInventory;


public final class LoadCrossBow implements Listener {


    @EventHandler
    public void onLoadCrossBow(EntityLoadCrossbowEvent e) {
        LivingEntity livingEntity = e.getEntity();
        if (livingEntity.getType() == EntityType.PLAYER) {
            Player player = (Player) livingEntity;
            GongData gongData = (GongData) Yuehua.playerData.get(player.getUniqueId());
            PlayerInventory inventory = player.getInventory();

            //判断是否在第一格
            if (inventory.getHeldItemSlot() == 0) {
                if(gongData.branch == 1){
                    gongData.time_charging = GetEntity.world.getGameTime() - gongData.time_charging;
                }
                gongData.noAct = GetEntity.world.getGameTime() + 1;

            } else {
                e.setCancelled(true);
                Scheduler.async(() -> player.sendMessage(
                        Component.text("§e[游戏机制]§4只能用一号位使用弩哦")
                ));
            }

        }
    }
}
