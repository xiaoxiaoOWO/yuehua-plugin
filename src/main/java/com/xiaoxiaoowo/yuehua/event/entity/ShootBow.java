package com.xiaoxiaoowo.yuehua.event.entity;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.PetData;
import com.xiaoxiaoowo.yuehua.data.slot.SlotWithOneActiveSkill;
import com.xiaoxiaoowo.yuehua.display.utils.ParticleUtils;
import com.xiaoxiaoowo.yuehua.items.other.Other;
import com.xiaoxiaoowo.yuehua.jineng.DoJiNeng;
import com.xiaoxiaoowo.yuehua.system.handleMonsters.DoMonsterShoot;
import com.xiaoxiaoowo.yuehua.system.handlePets.DoPetShoot;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.Component;
import org.bukkit.Particle;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;


public final class ShootBow implements Listener {

    private static final ItemStack ARROW = Other.ARROW.clone();

    @EventHandler
    public void onShootBow(EntityShootBowEvent e) {
        LivingEntity livingEntity = e.getEntity();
        if (livingEntity.getType() == EntityType.PLAYER) {

            Player player = (Player) livingEntity;
            GongData data = (GongData) Yuehua.playerData.get(player.getUniqueId());
            if (!data.canShoot) {
                SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你被缴械了，无法射箭"));
                e.setCancelled(true);
                return;
            }
            data.noAct = GetEntity.world.getGameTime() + 1;


            Arrow arrowEntity = (Arrow) e.getProjectile();
            arrowEntity.setCritical(false);
            double arrow = data.arrow;

            long time;
            if (data.isBow) {
                time = GetEntity.world.getGameTime() - data.time_pulling;
            } else {
                time = data.time_charging;
                data.time_charging = GetEntity.world.getGameTime();
            }


            if (data.branch != 1) {
                //未进阶，簌霖
            } else {
            }

            arrowEntity.setDamage(arrow);

            //不能再拾取
            arrowEntity.setPickupStatus(Arrow.PickupStatus.DISALLOWED);


            PlayerInventory playerInventory = player.getInventory();
            if (data.arrow_count > 0) {
                data.arrow_count--;
                playerInventory.addItem(ARROW);
            }



            //箭的速度
            Vector speed = arrowEntity.getVelocity();
            Vector direction = speed.clone().normalize();


            double force = e.getForce();
            if (force < 2.99) {
                //非满弦箭，只可能是弓
                //附灵一，蓄力所需时间减少
                double timeNeed = (1 - data.arrow_no_cost) * 20;
                if (time >= timeNeed - 0.01) {
                    //附灵变满弦
                    arrowEntity.setVelocity(direction.multiply(3));
                    arrowEntity.addScoreboardTag("fullforce");
                }

            } else {
                //满弦箭
                //附灵二，加强满弦初速度
                double speedMultiplier = 1 + data.arrow_pierce;
                arrowEntity.setVelocity(speed.multiply(speedMultiplier));
                arrowEntity.addScoreboardTag("fullforce");
            }


            doArrowParticle(arrowEntity, data.shootWithParticle);



            if (!data.canJiNeng) {
                return;
            }


            //玩家是否下蹲
            if (!player.isSneaking()) {
                return;
            }

//            if (data.slot0 instanceof SlotWithTwoActiveSkill slotWithTwoActiveSkill) {
//                if (slotWithTwoActiveSkill.cd_active2 < GetEntity.world.getGameTime()) {
//                    switch (slotWithTwoActiveSkill.id) {
//
//                    }
//                }
//            }

            SlotWithOneActiveSkill slotWithOneActiveSkill = data.slot0;
            if (slotWithOneActiveSkill.cd_active > GetEntity.world.getGameTime()) {
                return;
            }


            DoJiNeng.doJiNengProjectile(slotWithOneActiveSkill.id, data, arrowEntity);


        } else {
            if (livingEntity.getScoreboardTags().contains("p")) {
                PetData petData = Yuehua.petData.get(livingEntity.getUniqueId());
                for (String id : petData.shootObservers) {
                    DoPetShoot.doShoot(id, petData, (Arrow) e.getProjectile());
                }
                return;

            }

            MonsterData monsterData = Yuehua.monsterData.get(livingEntity.getUniqueId());
            for (String id : monsterData.shootObservers) {
                DoMonsterShoot.doShoot(id, monsterData, (Arrow) e.getProjectile());
            }
        }
    }

    public static void doArrowParticle(Arrow arrow, String id) {
        switch (id) {
            case "heiTieNu" -> new BukkitRunnable() {
                @Override
                public void run() {
                    if(arrow.isDead()){
                        this.cancel();
                        return;
                    }
                    ParticleUtils.onePoint(arrow.getLocation(), Particle.END_ROD,0,0,0,100);
                }
            }.runTaskTimerAsynchronously(Yuehua.instance,0,2);

            case "hongLinNu" -> new BukkitRunnable() {
                @Override
                public void run() {
                    if(arrow.isDead()){
                        this.cancel();
                        return;
                    }
                    ParticleUtils.onePoint(arrow.getLocation(), Particle.FLAME,0,0,0,100);
                }
            }.runTaskTimerAsynchronously(Yuehua.instance,0,2);

            case "jiaoLongNu" -> new BukkitRunnable() {
                @Override
                public void run() {
                    if(arrow.isDead()){
                        this.cancel();
                        return;
                    }
                    ParticleUtils.onePoint(arrow.getLocation(), Particle.RAIN,0,0,0,100);
                }
            }.runTaskTimerAsynchronously(Yuehua.instance,0,2);

            case null, default -> {

            }
        }
    }

}
