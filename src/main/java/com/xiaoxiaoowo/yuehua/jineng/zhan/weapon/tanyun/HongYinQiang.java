package com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.tanyun;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.display.utils.DisPlayUtils;
import com.xiaoxiaoowo.yuehua.task.weapon.HongYinQiangFire;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.BlockDisplay;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;
import org.joml.Vector3f;


public final class HongYinQiang {
    public static final String id = "hongYinQiang";
    public static final Vector zero = new Vector(0, 0, 0);

    public static void skill1(ZhanData zhanData, double multiplier) {
        zhanData.slot0.cd_active = GetEntity.world.getGameTime() + (long) (20 * 20 * zhanData.real_cool);
        Player player = zhanData.player;

        if (zhanData.fuben >= 1 && zhanData.fuben <= 1000) {
            SendInformation.sendMes(player, Component.text("§e[游戏机制]§4此技能在这里无法使用"));
            return;
        }

        double damage = zhanData.attack * 2 * multiplier;
        Vector direction = player.getEyeLocation().getDirection();
        Vector speed = direction.clone().setY(0).normalize().multiply(3);

        Location start = player.getLocation();


        if (player.isInWater()) {
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
                            PlaySound.entityBlazeShoot(player);
                            SendInformation.sendMes(player, Component.text("§e[主动技]§6[浮行]§a发动"));
                        }, 2);
                    }
                }


            }.runTaskTimer(Yuehua.instance, 0, 1);
        } else {
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
                            if (player.isInWater()) {
                                PlaySound.entityBlazeShoot(player);
                                SendInformation.sendMes(player, Component.text("§e[主动技]§6[浮行]§a发动"));
                                return;
                            }
                            Location end = player.getLocation();
                            new HongYinQiangFire(zhanData, damage, start.toVector(), end.toVector()).runTaskTimer(Yuehua.instance, 20, 20);

                            double length = start.distance(end);
                            int count = (int) length;
                            for (int i = 0; i < count; i++) {
                                Vector directionNew = direction.setY(0).normalize();
                                Location thisStart = start.clone().add(directionNew.clone().multiply(i));
                                Vector thisEnd = start.toVector().add(directionNew.clone().multiply(i + 1));
                                BlockDisplay blockDisplay = DisPlayUtils.displayBlockCommmon(thisStart, thisEnd, Bukkit.createBlockData(Material.FIRE), new Vector3f(1, 1, 1));
                                Scheduler.syncLater(blockDisplay::remove, 3 * 20 + 5);
                            }


                            PlaySound.entityBlazeShoot(player);
                            SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[浮行]§a发动"));
                        }, 2);

                    }
                }
            }.runTaskTimer(Yuehua.instance, 0, 1);
        }


    }
}