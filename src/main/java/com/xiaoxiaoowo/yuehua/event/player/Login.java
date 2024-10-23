package com.xiaoxiaoowo.yuehua.event.player;

import com.xiaoxiaoowo.yuehua.Yuehua;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

import java.util.UUID;

public final class Login implements Listener {
    @EventHandler
    public void onLogin(PlayerLoginEvent e){
        Player player = e.getPlayer();
        UUID uuid = player.getUniqueId();
        Long time = Yuehua.timeLastIn.get(uuid);
        if (time == null) {
            return;
        }
        long timeNow = System.currentTimeMillis();
        if (timeNow - (time + 1000 * 120) <= 0) {
            e.disallow(PlayerLoginEvent.Result.KICK_OTHER,Component.text("§c两分钟内仅允许登录一次！"));
        }



    }
}
