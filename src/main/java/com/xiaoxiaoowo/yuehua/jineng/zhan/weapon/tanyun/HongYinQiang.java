package com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.tanyun;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.display.utils.DisPlayUtils;
import com.xiaoxiaoowo.yuehua.task.weapon.HongYinQiangFire;
import com.xiaoxiaoowo.yuehua.utils.*;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.BlockDisplay;
import org.bukkit.entity.Player;
import org.joml.Vector3f;


public final class HongYinQiang {
    public static final String id = "hongYinQiang";

    public static void skill1(ZhanData zhanData, double multiplier) {
        zhanData.slot0.cd_active = GetEntity.world.getGameTime() + (long) (20 * 20 * zhanData.real_cool);
        Player player = zhanData.player;

        Location start = player.getLocation();
        Location end = MoveEntity.dash(zhanData, 6);
        if(end == null){
            SendInformation.sendMes(player, Component.text("§e[游戏机制]§4此技能在这里无法使用"));
            return;
        }

        double length = start.clone().subtract(end).length();

        if (start.getBlock().isLiquid() || end.getBlock().isLiquid()) {
            PlaySound.entityBlazeShoot(player);
            SendInformation.sendMes(player, Component.text("§e[主动技]§6[浮行]§a发动"));
            return;
        }

        double damage = zhanData.attack * 2 * multiplier;
        new HongYinQiangFire(zhanData, damage, start.toVector(), end.toVector()).runTaskTimer(Yuehua.instance, 20, 20);

        BlockDisplay blockDisplay = DisPlayUtils.displayBlockCommmon(start, end.toVector(), Bukkit.createBlockData(Material.FIRE), new Vector3f(1, 1, (float) length));
        Scheduler.syncLater(blockDisplay::remove, 3 * 20 + 5);

        PlaySound.entityBlazeShoot(player);
        SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[浮行]§a发动"));

    }
}
