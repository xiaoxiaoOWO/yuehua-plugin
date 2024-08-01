package com.xiaoxiaoowo.yuehua.event.entity;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.slot.SlotWithOneActiveSkill;
import com.xiaoxiaoowo.yuehua.itemstack.other.Other;
import com.xiaoxiaoowo.yuehua.system.DoJiNeng;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoBaojiObserver;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoJiNengObservers;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public final class ShootBow implements Listener {

    private static final Random random = new Random();

    @EventHandler
    public void onShootBow(EntityShootBowEvent e) {
        LivingEntity livingEntity = e.getEntity();
        if (livingEntity.getType() == EntityType.PLAYER) {


            Player player = (Player) livingEntity;
            GongData data = (GongData) Yuehua.playerData.get(player.getUniqueId());
            if (!data.canShoot) {
                Yuehua.sendMes(Component.text("§e[游戏机制]§4你被缴械了，无法射箭"), player);
                e.setCancelled(true);
                return;
            }

            data.readyBow = false;

            Arrow arrowEntity = (Arrow) e.getProjectile();
            arrowEntity.setCritical(false);


            double arrow = data.arrow;
            double baoji = data.baoji;
            double baojixiaoguo = data.baojixiaoguo;


            if (data.branch != 1) {
                //未进阶，簌霖
                //取基本数据
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


            //判断是否暴击
            if (random.nextDouble() < baoji) {
                arrow = arrow * baojixiaoguo;
                Yuehua.sendMes(Component.text("§e[游戏机制]§b[暴击]§a触发"), player);
                for (String observer : data.baoJiObservers) {
                    DoBaojiObserver.doBaoji(observer, data);
                }
            }
            arrowEntity.setDamage(arrow);


            if (random.nextDouble() < data.arrow_no_cost && data.arrow_no_cost < 0.9) {
                Yuehua.sendMes(Component.text("§e[游戏机制]§b[箭矢不消耗]§a触发"), player);
                ItemStack ARROW = Other.ARROW.clone();
                ARROW.setAmount(1);
                player.getInventory().addItem(ARROW);
            }

            if (random.nextDouble() < data.arrow_pierce) {
                Yuehua.sendMes(Component.text("§e[游戏机制]§b[穿透箭]§a触发"), player);
                arrowEntity.setPierceLevel(127);
            }

            //玩家是否下蹲
            if (!player.isSneaking()) {
                return;
            }

            SlotWithOneActiveSkill slotWithOneActiveSkill = data.slot0;
            if (slotWithOneActiveSkill.cd_active > GetEntity.world.getGameTime()) {
                return;
            }

            if (!data.canJiNeng) {
                return;
            }

            DoJiNeng.doJiNengGong(slotWithOneActiveSkill.id, data);
            for (String observer : data.jiNengObservers) {
                DoJiNengObservers.doJiNeng(observer, data);
            }


        } else {
            MonsterData monsterData = Yuehua.monsterData.get(livingEntity.getUniqueId());
            Arrow arrowEntity = (Arrow) e.getProjectile();
            arrowEntity.setDamage(monsterData.attack);
            arrowEntity.addScoreboardTag(monsterData.id);

        }
    }

}
