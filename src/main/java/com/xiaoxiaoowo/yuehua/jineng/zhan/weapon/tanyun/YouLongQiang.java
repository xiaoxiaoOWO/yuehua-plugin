package com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.tanyun;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.display.utils.DisPlayUtils;
import com.xiaoxiaoowo.yuehua.system.Damage;
import com.xiaoxiaoowo.yuehua.task.weapon.YouLong;
import com.xiaoxiaoowo.yuehua.task.weapon.YouLongShui;
import com.xiaoxiaoowo.yuehua.utils.*;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.BlockDisplay;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.joml.Vector3f;

public final class YouLongQiang {
    public static final String id = "youLongQiang";

    public static final PotionEffect feiyu3 = new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 5 * 20, 2);
    public static final PotionEffect waterBreathing = new PotionEffect(PotionEffectType.WATER_BREATHING, 5 * 20, 0);

    public static void skill1(ZhanData zhanData, double multiplier) {
        zhanData.slot0.cd_active = GetEntity.world.getGameTime() + (long) (20 * 20 * zhanData.real_cool);
        Player player = zhanData.player;
        Location start = player.getLocation();
        Location end = player.isInWater() ? MoveEntity.dash(zhanData, 12) : MoveEntity.dash(zhanData, 6);
        if(end == null){
            SendInformation.sendMes(player, Component.text("§e[游戏机制]§4此技能在这里无法使用"));
            return;
        }
        double damage = zhanData.attack * 6 * multiplier;

        for (Mob mob : GetEntity.getLineMonster(start.toVector(), end.toVector(), 1.0)) {
            MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
            Damage.damageMonster(zhanData, damage, monsterData);
        }

        if (end.getBlock().getType() == Material.WATER) {
            new YouLong(zhanData).runTaskTimer(Yuehua.instance, 20, 20);
            player.setRemainingAir(300);
            player.addPotionEffect(feiyu3);
            player.addPotionEffect(waterBreathing);
        } else {
            new YouLongShui(zhanData, end).runTaskTimer(Yuehua.instance, 20, 20);
            BlockDisplay blockDisplay = DisPlayUtils.displayBlockWithoutAngel(end.add(-1.5,0, -1.5), Bukkit.createBlockData(Material.LIGHT_BLUE_STAINED_GLASS), new Vector3f(3, 1, 3));
            Scheduler.syncLater(blockDisplay::remove, 5 * 20 + 5);
        }


        PlaySound.playerSwim(player);
        SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[游龙]§a发动"));

    }
}
