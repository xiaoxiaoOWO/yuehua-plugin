package com.xiaoxiaoowo.yuehua.event.entity;

import com.destroystokyo.paper.event.entity.EntityAddToWorldEvent;
import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.display.utils.ParticleUtils;
import com.xiaoxiaoowo.yuehua.system.Buff;
import com.xiaoxiaoowo.yuehua.system.Cure;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.Color;
import org.bukkit.Particle;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;
import java.util.Set;


public final class AddToWorld implements Listener {
    public static final PotionEffect linyouduzhu = new PotionEffect(PotionEffectType.POISON, 5 * 20, 0);
    public static final Random random = new Random();

    public static final Particle.DustOptions greenDust = new Particle.DustOptions(Color.GREEN, 2);

    @EventHandler
    public void onAddToWorld(EntityAddToWorldEvent e) {
        Entity entity = e.getEntity();
        Set<String> tags = entity.getScoreboardTags();
        if (!tags.contains("m")) {
            return;
        }
        Mob mob = (Mob) entity;
        mob.setAware(true);

        PersistentDataContainer pdc = mob.getPersistentDataContainer();
        switch (pdc.get(DataContainer.id, PersistentDataType.STRING)) {
            case "renou" ->
                    Yuehua.monsterData.put(mob.getUniqueId(), new MonsterData(0, 0, 0, 0, 0, 0, 10, 1, "renou", mob));
            case "renou2" ->
                    Yuehua.monsterData.put(mob.getUniqueId(), new MonsterData(0, 3.0, 0, 3.0, 0, 0, 10, 1, "renou2", mob));
            case "renou3" ->
                    Yuehua.monsterData.put(mob.getUniqueId(), new MonsterData(0, 10.0, 0, 10.0, 0, 0, 10, 1, "renou3", mob));

            case "template" ->
                    Yuehua.monsterData.put(mob.getUniqueId(), new MonsterData(0, 1.0, 0, 0, 0, 0, 0, 1, "template", mob));
            case "shooter" ->
                    Yuehua.monsterData.put(mob.getUniqueId(), new MonsterData(2, 0, 0, 0, 0, 0, 0, 1, "shooter", mob));


            case "eastKulou" ->
                    Yuehua.monsterData.put(mob.getUniqueId(), new MonsterData(3, 0, 0, 0, 0, 0, 0, 1, "eastKulou", mob));
            case "eastZhizhu" -> {
                MonsterData monsterData = new MonsterData(6, 0, 0, 0, 0, 0, 0, 1, "eastZhizhu", mob);
                monsterData.attackedObservers.add("spider");
                Yuehua.monsterData.put(mob.getUniqueId(), monsterData);
            }

            case "eastJiangshi" ->
                    Yuehua.monsterData.put(mob.getUniqueId(), new MonsterData(4, 0, 0, 0, 0, 0, 0, 1, "eastJiangshi", mob));


            case "eastZhizhuJinyin" -> {
                MonsterData monsterData = new MonsterData(30, 0.1, 0, 0.05, 0, 0, 0, 1, "eastZhizhuJinyin", mob);
                monsterData.attackedObservers.add("spider");
                Yuehua.monsterData.put(mob.getUniqueId(), monsterData);

            }

            case "eastDuFeng" -> {

                MonsterData monsterData = new MonsterData(20, 0.1, 0, 0.05, 0, 0, 0, 1, "eastDuFeng", mob);
                monsterData.attackObservers.add("bee");
                Bee bee = (Bee) mob;
                bee.setAnger(Integer.MAX_VALUE);
                Player player = GetEntity.getNearestPlayer(bee.getLocation(), 12, 12, 12);
                bee.setTarget(player);
                Yuehua.monsterData.put(mob.getUniqueId(), monsterData);
            }
            case "eastkugugongjianshou" ->
                    Yuehua.monsterData.put(mob.getUniqueId(), new MonsterData(20, 0.0, 0, 0, 0, 0, 0, 1, "eastkugugongjianshou", mob));
            case "eastjiangshijinyin" ->
                    Yuehua.monsterData.put(mob.getUniqueId(), new MonsterData(25, 0.2, 0, 0.1, 0, 0, 0, 1, "eastjiangshijinyin", mob));

            case "shanshenshooter" ->
                    Yuehua.monsterData.put(mob.getUniqueId(), new MonsterData(25, 0, 0, 0, 0, 0, 0, 1, "shanshenshooter", mob));

            case "shanshenspider" -> {
                Yuehua.monsterData.put(mob.getUniqueId(), new MonsterData(35, 0.15, 0, 0.075, 0, 0, 0, 1, "shanshenspider", mob));
                Player player = GetEntity.getNearestPlayer(mob.getLocation(), 12, 12, 12);
                mob.setTarget(player);
            }


            case "shanshenzombie" ->
                    Yuehua.monsterData.put(mob.getUniqueId(), new MonsterData(30, 0.25, 0, 0.125, 0, 0, 0, 1, "shanshenzombie", mob));

            case "yaojindufeng" -> {
                MonsterData monsterData = new MonsterData(25, 0.1, 0, 0.05, 0, 0, 0, 1, "yaojindufeng", mob);
                monsterData.attackObservers.add("bee");
                Bee bee = (Bee) mob;
                bee.setAnger(Integer.MAX_VALUE);
                Player player = GetEntity.getNearestPlayer(bee.getLocation(), 12, 12, 12);
                bee.setTarget(player);
                Yuehua.monsterData.put(mob.getUniqueId(), monsterData);
            }

            case "yaojinshooter" ->
                    Yuehua.monsterData.put(mob.getUniqueId(), new MonsterData(30, 0, 0, 0, 0, 0, 0, 1, "yaojinshooter", mob));

            case "yaojingpanda" -> {
                MonsterData monsterData = new MonsterData(40, 0.35, 0, 0.175, 0, 0, 0, 1, "yaojingpanda", mob);
                Panda panda = (Panda) mob;
                panda.setAggressive(true);
                Player player = GetEntity.getNearestPlayer(panda.getLocation(), 12, 12, 12);
                panda.setTarget(player);
                Yuehua.monsterData.put(mob.getUniqueId(), monsterData);
            }

            case "zhizhunvwang" -> {
                MonsterData monsterData = new MonsterData(40, 0.25, 0, 0.125, 0, 0, 0, 1, "zhizhunvwang", mob);
                monsterData.attackObservers.add("zhizhunvwang");
                monsterData.attackedObservers.add("spider");
                Yuehua.monsterData.put(mob.getUniqueId(), monsterData);
            }

            case "linyouduzhu" -> {
                MonsterData monsterData = new MonsterData(60, 0.35, 0, 0.175, 0, 0, 0, 1, "linyouduzhu", mob);
                monsterData.attackedObservers.add("spider");
                int taskId = Scheduler.syncTimerWithId(() -> {
                    Player player = monsterData.lastAttacker;
                    if (player == null) {
                        return;
                    }
                    Data data = Yuehua.playerData.get(player.getUniqueId());
                    if (GetEntity.mydistance(player.getLocation(), mob.getLocation()) < 405) {
                        ParticleUtils.line(mob.getEyeLocation().toVector(), player.getEyeLocation().toVector(), Particle.DUST, 0, greenDust);
                    }

                    Buff.poison(data, 5 * 20, 0);
                    monsterData.lastAttacker = null;


                    SendInformation.sendMes(player, Component.text("§e[怪物技能]§b林幽毒蛛向你吐出大量毒液使你中毒"));
                }, 20 * random.nextLong(3, 7), 20 * random.nextLong(15, 25));

                monsterData.taskIds.add(taskId);
                Yuehua.monsterData.put(mob.getUniqueId(), monsterData);
            }

            case "jianxiguimei" -> {
                MonsterData monsterData = new MonsterData(50, 0.4, 0, 0.2, 0, 0, 0, 1, "jianxiguimei", mob);
                int taskId = Scheduler.syncTimerWithId(() -> {
                    if (mob.isDead()) {
                        return;
                    }
                    Cure.cureMonster(100, mob);
                    ParticleUtils.atMonster(mob, Particle.HEART);
                    for (Entity entity1 : GetEntity.getPlayers(mob.getLocation(), 5, 5, 5)) {
                        Player player = (Player) entity1;
                        SendInformation.sendMes(player, Component.text("§e[怪物技能]§b涧溪鬼魅汲取山泉，生命回复了"));
                    }
                }, 20 * random.nextLong(3, 7), 20 * random.nextLong(7, 13));
                monsterData.taskIds.add(taskId);
                Yuehua.monsterData.put(mob.getUniqueId(), monsterData);
            }

            case "wushi" ->
                    Yuehua.monsterData.put(mob.getUniqueId(), new MonsterData(150, 0.7, 0, 0.35, 0, 0, 0, 1, "wushi", mob));
            case "wushishooter" ->
                    Yuehua.monsterData.put(mob.getUniqueId(), new MonsterData(100, 0.5, 0, 0.25, 0, 0, 0, 1, "wushishooter", mob));
        }
    }
}

