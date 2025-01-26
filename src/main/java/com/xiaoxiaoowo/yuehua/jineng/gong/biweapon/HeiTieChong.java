package com.xiaoxiaoowo.yuehua.jineng.gong.biweapon;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.slot.special.Chong;
import com.xiaoxiaoowo.yuehua.display.utils.ParticleUtils;
import com.xiaoxiaoowo.yuehua.system.Damage;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.*;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;

public final class HeiTieChong {
    public static final String id = "heiTieChong";
    public static final BlockData redStone = Bukkit.createBlockData(Material.REDSTONE_BLOCK);


    public static void skill1(GongData gongData, double multiplier) {
        Player player = gongData.player;

        Chong chong = (Chong) gongData.slot1;
        if (chong.count == 0) {
            SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4法力弹已耗尽！"));
            return;
        }
        chong.count--;

        Location eyeLoc = player.getEyeLocation();
        Vector direction = eyeLoc.getDirection();

        RayTraceResult rayTraceResult = GetEntity.world.rayTrace(eyeLoc, direction, 16, FluidCollisionMode.NEVER,
                true, 0.5, it -> it.getScoreboardTags().contains("m"));

        Location hitPos;

        if (rayTraceResult == null) {
            hitPos = eyeLoc.clone().add(direction.multiply(16));
        } else {
            Vector hisVec = rayTraceResult.getHitPosition();
            hitPos = new Location(GetEntity.world, hisVec.getX(), hisVec.getY(), hisVec.getZ());
        }

        Scheduler.async(() -> GetEntity.world.spawnParticle(Particle.EXPLOSION, hitPos, 100, 1, 1, 1, 0));

        double damage = gongData.arrow * 25 * multiplier;

        for (Entity entity : GetEntity.getMonsters(hitPos, 3, 3, 3)) {
            MonsterData monsterData = Yuehua.monsterData.get(entity.getUniqueId());
            Damage.damageMonster(gongData, damage, monsterData);
            ParticleUtils.atMonsterBlock(monsterData.monster, redStone);
        }


        PlaySound.explode(player);
        SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[重弹]§a发动"));

    }

    public static void skill2(GongData gongData, double multiplier) {
        Player player = gongData.player;
        Chong chong = (Chong) gongData.slot1;
        chong.cd_active2 = GetEntity.world.getGameTime() + (long) (20 * 30);
        if (chong.count == chong.maxCount) {
            SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4可存储的法力弹数已经达到最大值！"));
            return;
        }


        String id = chong.id;
        new BukkitRunnable() {
            int count = 0;

            @Override
            public void run() {
                if (!player.isConnected()) {
                    this.cancel();
                    return;
                }
                //不允许换第二个格子
                if (!gongData.slot1.id.equals(id)) {
                    this.cancel();
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4装填失败！"));
                    return;
                }
                //不允许手持别的格子
                if (player.getInventory().getHeldItemSlot() != 1) {
                    this.cancel();
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4装填失败！"));
                    return;
                }
                count++;
                if (count == 80) {
                    this.cancel();
                    chong.count++;
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§a成功装入一发法力弹！目前法力弹数：§b" + chong.count));
                }
            }
        }.runTaskTimer(Yuehua.instance, 0, 1);

        PlaySound.load(player);
        SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[装填]§a发动"));
    }
}
