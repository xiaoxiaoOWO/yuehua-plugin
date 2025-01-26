package com.xiaoxiaoowo.yuehua.jineng.zhan.biweapon;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.display.utils.DisPlayUtils;
import com.xiaoxiaoowo.yuehua.display.utils.ParticleUtils;
import com.xiaoxiaoowo.yuehua.items.zhuangbei.BiWeapon;
import com.xiaoxiaoowo.yuehua.system.Damage;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.FluidCollisionMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;
import org.joml.Vector3f;

import java.util.HashSet;
import java.util.Set;

public final class JinRuiFeiRen {
    public static final String id = "jinRuiFeiRen";
    public static final BlockData redStone = Bukkit.createBlockData(Material.REDSTONE_BLOCK);

    public static void skill1(ZhanData zhanData, double multiplier) {
        zhanData.slot1.cd_active = GetEntity.world.getGameTime() + 40L;
        Player player = zhanData.player;


        Location eyeLoc = player.getEyeLocation();
        Vector direction = eyeLoc.getDirection();

        //寻找终点
        RayTraceResult rayTraceResult = player.rayTraceBlocks(16, FluidCollisionMode.NEVER);
        Vector end;
        if (rayTraceResult != null) {
            end = rayTraceResult.getHitPosition();
        } else {
            end = eyeLoc.toVector().add(direction.clone().multiply(16));
        }

        float distance = (float) eyeLoc.toVector().distance(end);

        int count;
        if (distance > 12) {
            count = 4;
        } else if (distance > 8) {
            count = 3;
        } else if (distance > 4) {
            count = 2;
        } else {
            count = 1;
        }
        int time = count * 2;
        float interval = distance / count;

        Vector eyeVector = eyeLoc.toVector();
        double damage = zhanData.attack * 0.5 * multiplier;
        Set<Mob> mobs = new HashSet<>();
        for (int i = 0; i < count; i++) {
            Vector thisStart = eyeVector.clone().add(direction.clone().multiply(interval * i));
            Vector thisEnd = eyeVector.clone().add(direction.clone().multiply(interval * (i + 1)));
            Scheduler.syncLater(() -> {
                for (Mob mob : GetEntity.getLineMonster(thisStart, thisEnd, 0.5)) {
                    if(mobs.contains(mob)){
                        continue;
                    }
                    mobs.add(mob);
                    MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
                    Damage.damageMonster(zhanData, damage, monsterData);
                    ParticleUtils.atMonsterBlock(mob, redStone);
                }
            }, (long) ((i + 0.5) * 2 + 2));
        }

        ItemDisplay itemDisplay = DisPlayUtils.displayJian(eyeLoc, BiWeapon.JINRUIFEIREN, new Vector3f(1.5f), distance, time, -0.55);
        Scheduler.syncLater(() -> {
            if (!itemDisplay.isDead()) {
                itemDisplay.remove();
            }
        }, time + 3);


        PlaySound.entityShoot(player);
        SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[飞刃]§a发动"));

    }
}
