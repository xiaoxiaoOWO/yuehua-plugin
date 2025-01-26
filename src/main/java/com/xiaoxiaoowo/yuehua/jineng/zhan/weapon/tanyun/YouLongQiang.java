package com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.tanyun;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.display.utils.DisPlayUtils;
import com.xiaoxiaoowo.yuehua.display.utils.ParticleUtils;
import com.xiaoxiaoowo.yuehua.system.Damage;
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
import org.bukkit.entity.BlockDisplay;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;
import org.joml.Vector3f;

public final class YouLongQiang {
    public static final String id = "youLongQiang";
    public static final Vector zero = new Vector(0, 0, 0);
    public static final PotionEffect feiyu3 = new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 5 * 20, 2);
    public static final PotionEffect waterBreathing = new PotionEffect(PotionEffectType.WATER_BREATHING, 5 * 20, 0);

    public static void skill1(ZhanData zhanData, double multiplier) {
        zhanData.slot0.cd_active = GetEntity.world.getGameTime() + (long) (20 * 20 * zhanData.real_cool);
        Player player = zhanData.player;

        if (zhanData.fuben >= 1 && zhanData.fuben <= 1000) {
            SendInformation.sendMes(player, Component.text("§e[游戏机制]§4此技能在这里无法使用"));
            return;
        }
        double damage = zhanData.attack * 6 * multiplier;

        Vector direction = player.getEyeLocation().getDirection();
        Vector speed = player.isUnderWater() ? direction.setY(0).normalize().multiply(6) : direction.setY(0).normalize().multiply(3);

        Location start = player.getLocation();

        new BukkitRunnable() {
            int count = 0;

            @Override
            public void run() {
                player.setVelocity(speed);
                count++;

                if (count == 4) {
                    this.cancel();
                    player.setVelocity(zero);

                    Scheduler.syncLater(() -> {

                        Location end = player.getLocation();
                        for (Mob mob : GetEntity.getLineMonster(start.toVector(), end.toVector(), 1.0)) {
                            MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
                            Damage.damageMonster(zhanData, damage, monsterData);
                            ParticleUtils.atMonster(mob, Particle.SWEEP_ATTACK);
                        }

                        if (end.getBlock().getType() == Material.WATER) {
                            new YouLong(zhanData).runTaskTimer(Yuehua.instance, 20, 20);
                            player.setRemainingAir(300);
                            player.addPotionEffect(feiyu3);
                            player.addPotionEffect(waterBreathing);
                        } else {
                            new YouLongShui(zhanData, end).runTaskTimer(Yuehua.instance, 20, 20);
                            BlockDisplay blockDisplay = DisPlayUtils.displayBlockWithoutAngel(end.add(-1.5, 0, -1.5), Bukkit.createBlockData(Material.LIGHT_BLUE_STAINED_GLASS), new Vector3f(3, 1, 3));
                            Scheduler.syncLater(blockDisplay::remove, 5 * 20 + 5);
                        }


                        PlaySound.playerSwim(player);
                        SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[游龙]§a发动"));


                    }, 2);

                }
            }
        }.runTaskTimer(Yuehua.instance, 0, 1);


    }
}