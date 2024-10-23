package com.xiaoxiaoowo.yuehua.event.entity;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.persistence.PersistentDataType;


public final class PotionSpLash implements Listener {
    @EventHandler
    public void onPotionSpLash(PotionSplashEvent e) {
        ThrownPotion thrownPotion = e.getPotion();
        if (thrownPotion.getShooter() instanceof Player player) {
            Data data = Yuehua.playerData.get(player.getUniqueId());
            if (data.job != 3) {
                e.setCancelled(true);
                SendInformation.sendMes(Component.text("§e[游戏机制]§4只有炼丹师可以使用喷溅型丹药"),player);
                return;
            }
            DanData danData = (DanData) data;
            switch (thrownPotion.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING)){

            }
        }
    }
}
