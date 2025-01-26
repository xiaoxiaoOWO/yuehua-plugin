package com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.tanyun;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.display.utils.ParticleUtils;
import com.xiaoxiaoowo.yuehua.system.Buff;
import com.xiaoxiaoowo.yuehua.system.Cure;
import com.xiaoxiaoowo.yuehua.system.Damage;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public final class HuTouZhanJinQiang {
    public static final String id = "huTouZhanJinQiang";
    public static final Vector zero = new Vector(0, 0, 0);

    public static void skill1(ZhanData zhanData, double multiplier) {
        zhanData.slot0.cd_active = GetEntity.world.getGameTime() + (long) (20 * 20 * zhanData.real_cool);
        Player player = zhanData.player;
        if (zhanData.fuben >= 1 && zhanData.fuben <= 1000) {
            SendInformation.sendMes(player, Component.text("§e[游戏机制]§4此技能在这里无法使用"));
            return;
        }

        double damage = zhanData.attack * 7 * multiplier;

        Vector direction = player.getEyeLocation().getDirection();
        Vector speed = direction.setY(0).normalize().multiply(6);

        Location start = player.getLocation();

        new BukkitRunnable() {
            int count = 0;

            @Override
            public void run() {
                player.setVelocity(speed);
                count++;

                if (count == 5) {
                    this.cancel();
                    player.setVelocity(zero);

                    Scheduler.syncLater(() -> {

                        Location end = player.getLocation();
                        int huyiCount = 0;
                        for (Mob mob : GetEntity.getLineMonster(start.toVector(), end.toVector(), 1.5)) {
                            MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
                            Damage.damageMonster(zhanData, damage, monsterData);
                            ParticleUtils.atMonster(mob, Particle.SWEEP_ATTACK);
                            Buff.deHujia(monsterData, 10 * 20, 0.25, id);
                            Buff.deFakang(monsterData, 10 * 20, 0.25, id);
                            huyiCount++;
                        }

                        huyiCount = Math.min(huyiCount, 8);
                        Cure.curePlayer((0.0125 * player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() + 15) * huyiCount, zhanData);

                        double damageHuYi = zhanData.attack * 3 * huyiCount;
                        double deAttack = 50 * huyiCount;

                        for (Entity entity : GetEntity.getMonsters(end, 5, 5, 5)) {
                            Mob mob = (Mob) entity;
                            MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
                            Damage.damageMonster(zhanData, damageHuYi, monsterData);
                            ParticleUtils.atMonster(mob, Particle.SONIC_BOOM);
                            Buff.deAttack(monsterData, 9 * 20, deAttack);
                        }


                        PlaySound.huxiao(player);
                        SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[虎啸]§a发动"));


                    }, 2);

                }
            }
        }.runTaskTimer(Yuehua.instance, 0, 1);


    }
}