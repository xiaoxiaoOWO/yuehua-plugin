package com.xiaoxiaoowo.yuehua.event.entity;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.slot.SlotWithOneActiveSkill;
import com.xiaoxiaoowo.yuehua.data.slot.SlotWithTwoActiveSkill;
import com.xiaoxiaoowo.yuehua.itemstack.other.Other;
import com.xiaoxiaoowo.yuehua.system.DoJiNeng;
import com.xiaoxiaoowo.yuehua.system.handleMonsters.DoMonsterShoot;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoDeath;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoJiNengObservers;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.inventory.ItemStack;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public final class ShootBow implements Listener {

    private static final Random random = new Random();

    private static final ItemStack ARROW = Other.ARROW.clone();



    @EventHandler
    public void onShootBow(EntityShootBowEvent e) {
        LivingEntity livingEntity = e.getEntity();
        if (livingEntity.getType() == EntityType.PLAYER) {

            Player player = (Player) livingEntity;
            GongData data = (GongData) Yuehua.playerData.get(player.getUniqueId());
            if (!data.canShoot) {
                SendInformation.sendMes(Component.text("§e[游戏机制]§4你被缴械了，无法射箭"), player);
                e.setCancelled(true);
                return;
            }

            data.readyBow = false;

            Arrow arrowEntity = (Arrow) e.getProjectile();
            arrowEntity.setCritical(false);
            double arrow = data.arrow;

            if (data.branch != 1) {
                //未进阶，簌霖

            } else {
                //长虹
                long time;

                if (data.isBow) {
                    time = GetEntity.world.getGameTime() - data.time_pulling;
                } else {
                    time = data.time_charging;
                    data.time_charging = GetEntity.world.getGameTime();
                }

            }

            arrowEntity.setDamage(arrow);


            if (random.nextDouble() < data.arrow_no_cost) {
                SendInformation.sendMes(Component.text("§e[游戏机制]§b[箭矢不消耗]§a触发"), player);
                player.getInventory().addItem(ARROW);
            }

            if (random.nextDouble() < data.arrow_pierce) {
                SendInformation.sendMes(Component.text("§e[游戏机制]§b[穿透箭]§a触发"), player);
                arrowEntity.setPierceLevel(127);
            }

            if (!data.canJiNeng) {
                return;
            }

            if(data.slot0 instanceof SlotWithTwoActiveSkill slotWithTwoActiveSkill){
                if(slotWithTwoActiveSkill.cd_active2 < GetEntity.world.getGameTime()){
                    Location location = player.getLocation();
                    double dxpitch = location.getPitch() - data.startPitch;
                    double dxyaw = location.getYaw() - data.startYaw;

                    if(dxpitch < -75){
                        DoJiNeng.doUpHeadShoot(slotWithTwoActiveSkill.id, data);
                        return;
                    }

                    if(dxpitch > 75){
                        DoJiNeng.doDownHeadShoot(slotWithTwoActiveSkill.id,data);
                        return;
                    }

                    if(dxyaw > 150 || dxyaw < -150){
                        DoJiNeng.doRorateShoot(slotWithTwoActiveSkill.id,data);
                        return;
                    }
                }
            }

            //玩家是否下蹲
            if (!player.isSneaking()) {
                return;
            }

            SlotWithOneActiveSkill slotWithOneActiveSkill = data.slot0;
            if (slotWithOneActiveSkill.cd_active > GetEntity.world.getGameTime()) {
                return;
            }


            DoJiNeng.doJiNengProjectile(slotWithOneActiveSkill.id, data, arrowEntity);


        }else {
            MonsterData monsterData = Yuehua.monsterData.get(livingEntity.getUniqueId());
            for (String id : monsterData.shootObservers) {
                DoMonsterShoot.doShoot(id, monsterData, (Arrow) e.getProjectile());
            }
        }
    }

}
