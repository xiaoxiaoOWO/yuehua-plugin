package com.xiaoxiaoowo.yuehua.jineng.gong.weapon.youxia;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.display.utils.DisPlayUtils;
import com.xiaoxiaoowo.yuehua.display.utils.ParticleUtils;
import com.xiaoxiaoowo.yuehua.task.weapon.YouLong;
import com.xiaoxiaoowo.yuehua.task.weapon.YouLongShui;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.BlockDisplay;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.joml.Vector3f;

public final class JiaoLongNu {
    public static final String id = "jiaoLongNu";
    public static final PotionEffect feiyu3 = new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 5 * 20, 2);
    public static final PotionEffect waterBreathing = new PotionEffect(PotionEffectType.WATER_BREATHING, 5 * 20, 0);

    public static void skill1(GongData gongData, double multiplier, Arrow arrow) {
        gongData.slot0.cd_active = GetEntity.world.getGameTime() + (long) (20 * 20 * gongData.real_cool);
        Player player = gongData.player;
        gongData.hitObservers.add(id);
        gongData.shootWithParticle = id;
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            gongData.shootWithParticle = null;
            gongData.hitObservers.remove(id);
        }, 6 * 20);

        Location ploc = player.getLocation();

        if(ploc.getBlock().getType() == Material.WATER){
            new YouLong(gongData).runTaskTimer(Yuehua.instance, 20, 20);
            player.setRemainingAir(300);
            player.addPotionEffect(feiyu3);
            player.addPotionEffect(waterBreathing);
        }else {
            new YouLongShui(gongData, ploc).runTaskTimer(Yuehua.instance, 20, 20);
            BlockDisplay blockDisplay = DisPlayUtils.displayBlockWithoutAngel(ploc.add(-1.5,0, -1.5), Bukkit.createBlockData(Material.LIGHT_BLUE_STAINED_GLASS), new Vector3f(3, 1, 3));
            Scheduler.syncLater(blockDisplay::remove, 5 * 20 + 5);
        }

        PlaySound.playerSwim(player);
        SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[蛟龙出海]§a发动"));

        new BukkitRunnable() {
            @Override
            public void run() {
                if(arrow.isDead()){
                    this.cancel();
                    return;
                }
                ParticleUtils.onePoint(arrow.getLocation(), Particle.RAIN,0,0,0,100);
            }
        }.runTaskTimerAsynchronously(Yuehua.instance,0,2);
    }
}
