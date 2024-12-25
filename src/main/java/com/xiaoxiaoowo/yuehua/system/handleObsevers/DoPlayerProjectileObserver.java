package com.xiaoxiaoowo.yuehua.system.handleObsevers;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.slot.special.BeiDouMieShen;
import com.xiaoxiaoowo.yuehua.display.utils.DisPlayUtils;
import com.xiaoxiaoowo.yuehua.items.Skill;
import com.xiaoxiaoowo.yuehua.jineng.gong.weapon.juji.BeiDouMieShenGong;
import com.xiaoxiaoowo.yuehua.jineng.gong.weapon.juji.QinTongGong;
import com.xiaoxiaoowo.yuehua.jineng.gong.weapon.juji.YanTieGong;
import com.xiaoxiaoowo.yuehua.system.Buff;
import com.xiaoxiaoowo.yuehua.system.Cure;
import com.xiaoxiaoowo.yuehua.system.Damage;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.task.weapon.SheTian;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Transformation;
import org.joml.Vector3f;

import java.util.Map;
import java.util.Set;

public final class DoPlayerProjectileObserver {
    private static final World world = GetEntity.world;
    public static final PotionEffect TIANQIONG = new PotionEffect(PotionEffectType.SPEED, 20 * 5, 2);
    public static final PotionEffect SHETIAN = new PotionEffect(PotionEffectType.SPEED, 20 * 9, 4);

    public static void doProjectile(String id, GongData data, Mob monster) {
        switch (id) {
            case "tengMuGong" -> doTengMuGong(data, monster);
            case "qinTongGong" -> doQinTong(data, monster);
            case "yanTieGong" -> doYanTie(data, monster);
            case "zhongChuiGong" -> doZhongChui(data, monster);
            case "beiDouMieShenGong" -> doBeiDou(data, monster);
        }
    }

    public static void doProjectile(String id, GongData data, Location location) {
        switch (id) {
            case "zhongChuiGong" -> doZhongChui(data, location);
            case "beiDouMieShenGong" -> doBeiDou(data, location);

        }
    }

    public static void doProjectile(String id, Player shooted, PersistentDataContainer pdc) {
        switch (id) {
            case "fuRongGong" -> doFuRong(shooted);
            case "hongLuanGong" -> doHongLuan(shooted, pdc);
            case "tianQiongGong" -> doTianQiong(shooted);
            case "sheTianZhuiYueGong" -> doSheTian(shooted);
        }

    }

    public static void doFuRong(Player player) {
        double amount = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() * 0.2 + 10;
        Cure.curePlayer(amount, player);
    }

    public static void doSheTian(Player player) {
        double amount = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() * 0.2 + 270;
        Cure.curePlayer(amount, player);

        Data data = Yuehua.playerData.get(player.getUniqueId());
        Map<String, Object> extraData = data.extraData;

        if (GetEntity.world.isClearWeather()) {
            SendInformation.sendMes(player, Component.text("§6[飞廉祝福]"));
            player.addPotionEffect(SHETIAN);

            long timeEnd = (long) extraData.getOrDefault("shetianfeilian", 0L);
            long timeNow = GetEntity.world.getGameTime();
            long thisTimeEnd = timeNow - 1 + 9 * 20;
            extraData.put("shetianfeilian", thisTimeEnd);

            if (timeEnd <= timeNow) {
                //只有之前的结束了才加属性
                data.updateHujiaAdd(0.5);
                data.updatejianmianAdd(999);
                data.updatesanchajimianAdd(999);
                switch (data.job) {
                    case 1 -> data.updateAttackMul(0.3);
                    case 2 -> {
                        GongData gongData = (GongData) data;
                        gongData.updateArrowMul(0.3);
                    }
                    case 3 -> {
                        DanData danData = (DanData) data;
                        danData.updateZhenfaMul(0.3);
                    }
                }
            }

            Scheduler.syncLater(() -> {
                if ((!player.isConnected())) {
                    return;
                }
                long timeNowIn = GetEntity.world.getGameTime();
                long timeEndIn = (long) extraData.get("shetianfeilian");
                if (timeEndIn > timeNowIn) {
                    return;
                }

                data.updateHujiaAdd(-0.5);
                data.updatejianmianAdd(-999);
                data.updatesanchajimianAdd(-999);
                switch (data.job) {
                    case 1 -> data.updateAttackMul(-0.3);
                    case 2 -> {
                        GongData gongData = (GongData) data;
                        gongData.updateArrowMul(-0.3);
                    }
                    case 3 -> {
                        DanData danData = (DanData) data;
                        danData.updateZhenfaMul(-0.3);
                    }
                }

            }, 20 * 9);


        } else {
            SendInformation.sendMes(player, Component.text("§6[萍翳祝福]"));

            long timeEnd = (long) extraData.getOrDefault("shetianpinyi", 0L);
            long timeNow = GetEntity.world.getGameTime();
            long thisTimeEnd = timeNow - 1 + 9 * 20;
            extraData.put("shetianpinyi", thisTimeEnd);

            if (timeEnd <= timeNow) {
                //只有之前的结束了才加属性
                new SheTian(data).runTaskTimer(Yuehua.instance, 0, 1);
                data.updateHujiaAdd(0.5);
                data.updateFakangAdd(1);
                data.updateShengjiAdd(0.5);
                switch (data.job) {
                    case 1 -> data.updateAttackMul(0.3);
                    case 2 -> {
                        GongData gongData = (GongData) data;
                        gongData.updateArrowMul(0.3);
                    }
                    case 3 -> {
                        DanData danData = (DanData) data;
                        danData.updateZhenfaMul(0.3);
                    }
                }
            }

            Scheduler.syncLater(() -> {
                if ((!player.isConnected())) {
                    return;
                }
                long timeNowIn = GetEntity.world.getGameTime();
                long timeEndIn = (long) extraData.get("shetianpinyi");
                if (timeEndIn > timeNowIn) {
                    return;
                }

                data.updateHujiaAdd(-0.5);
                data.updateFakangAdd(-1);
                data.updateShengjiAdd(-0.5);
                switch (data.job) {
                    case 1 -> data.updateAttackMul(-0.3);
                    case 2 -> {
                        GongData gongData = (GongData) data;
                        gongData.updateArrowMul(-0.3);
                    }
                    case 3 -> {
                        DanData danData = (DanData) data;
                        danData.updateZhenfaMul(-0.3);
                    }
                }

            }, 20 * 9);
        }

    }

    public static void doTianQiong(Player player) {
        double amount = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() * 0.2 + 90;
        Cure.curePlayer(amount, player);
        Data data = Yuehua.playerData.get(player.getUniqueId());
        SendInformation.sendMes(player, Component.text("§6[天琼强化]"));

        Map<String, Object> extraData = data.extraData;
        long timeEnd = (long) extraData.getOrDefault("tianQiong", 0L);
        long timeNow = GetEntity.world.getGameTime();
        long thisTimeEnd = timeNow - 1 + 5 * 20;
        extraData.put("tianQiong", thisTimeEnd);
        player.addPotionEffect(TIANQIONG);

        if (timeEnd <= timeNow) {
            //只有之前的结束了才加属性
            data.updateHujiaAdd(0.4);
            data.updateFakangAdd(0.4);
            switch (data.job) {
                case 1 -> data.updateAttackMul(0.2);
                case 2 -> {
                    GongData gongData = (GongData) data;
                    gongData.updateArrowMul(0.2);
                }
                case 3 -> {
                    DanData danData = (DanData) data;
                    danData.updateZhenfaMul(0.2);
                }
            }
        }

        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            long timeNowIn = GetEntity.world.getGameTime();
            long timeEndIn = (long) extraData.get("tianQiong");
            if (timeEndIn > timeNowIn) {
                return;
            }
            data.updateHujiaAdd(-0.4);
            data.updateFakangAdd(-0.4);
            switch (data.job) {
                case 1 -> data.updateAttackMul(-0.2);
                case 2 -> {
                    GongData gongData = (GongData) data;
                    gongData.updateArrowMul(-0.2);
                }
                case 3 -> {
                    DanData danData = (DanData) data;
                    danData.updateZhenfaMul(-0.2);
                }
            }

        }, 20 * 5);

    }

    public static void doHongLuan(Player player, PersistentDataContainer persistentDataContainer) {
        double amount = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() * 0.2 + 30;
        double attack = persistentDataContainer.get(DataContainer.attack, PersistentDataType.DOUBLE);

        Data data = Yuehua.playerData.get(player.getUniqueId());
        switch (data.job) {
            case 1 -> {
                SendInformation.sendMes(player, Component.text("§6[红鸾附体]"));
                data.extraData.put("hongLuanGongAttack", attack);
                long timeNow = GetEntity.world.getGameTime();
                data.extraData.put("hongLuanGong", timeNow - 1 + 20 * 5);
                data.attackObservers.add("hongLuanGong");
                Scheduler.syncLater(() -> {
                    if ((!player.isConnected())) {
                        return;
                    }
                    long timeNowIn = GetEntity.world.getGameTime();
                    long timeEndIn = (long) data.extraData.get("hongLuanGong");
                    if (timeEndIn > timeNowIn) {
                        return;
                    }
                    data.attackObservers.remove("hongLuanGong");
                }, 20 * 5);
            }

            case 2 -> {
                SendInformation.sendMes(player, Component.text("§6[红鸾附体]"));
                data.extraData.put("hongLuanGongAttack", attack);
                long timeNow = GetEntity.world.getGameTime();
                data.extraData.put("hongLuanGong", timeNow - 1 + 20 * 5);
                GongData gongData = (GongData) data;
                gongData.hitObservers.add("hongLuanGong");
                Scheduler.syncLater(() -> {
                    if ((!player.isConnected())) {
                        return;
                    }
                    long timeNowIn = GetEntity.world.getGameTime();
                    long timeEndIn = (long) data.extraData.get("hongLuanGong");
                    if (timeEndIn > timeNowIn) {
                        return;
                    }
                    gongData.hitObservers.remove("hongLuanGong");
                }, 20 * 5);
            }
        }

        Cure.curePlayer(amount, player);
    }

    public static void doTengMuGong(GongData data, Mob mob) {
        double damage = data.arrow * 12;
        MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
        Damage.damageMonster(data, damage, monsterData);
        Buff.jianSu(monsterData, 5 * 20, 0);
    }

    public static void doQinTong(GongData data, Mob mob) {
        double damage = data.arrow * 15;
        MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
        Damage.damageMonster(data, damage, monsterData);
        Buff.deHujia(monsterData, 5 * 20, 0.2, QinTongGong.id);
    }

    public static void doYanTie(GongData data, Mob mob) {
        double damage = data.arrow * 18;
        MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
        Damage.damageMonster(data, damage, monsterData);
        Set<String> tags = mob.getScoreboardTags();
        if (tags.contains(YanTieGong.id)) {
            double damage2 = mob.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() * 0.4;
            damage2 = Math.min(1000, damage2);
            Damage.damageMonster(data, damage2, monsterData);
        } else {
            tags.add(YanTieGong.id);
        }
    }

    public static void doZhongChui(GongData data, Mob mob) {
        double damage = data.arrow * 21;
        MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
        Damage.damageMonster(data, damage, monsterData);
        doZhongChui(data, mob.getLocation().add(0, -1, 0));
    }

    public static void doZhongChui(GongData data, Location location) {
        double damage = data.arrow * 6;
        Location endLoc = location.clone();

        location.setPitch(0);
        location.setYaw(data.player.getEyeLocation().getYaw());
        location.setY(location.getY() + 8.5);
        ItemDisplay itemDisplay = DisPlayUtils.displayCommon(location, Skill.CHUI_ZI, new Vector3f(3, 3, 3));
        Scheduler.asyncLater(() -> {
            itemDisplay.setInterpolationDelay(0);
            itemDisplay.setInterpolationDuration(4);

            Transformation transformation = itemDisplay.getTransformation();
            transformation.getTranslation().set(0, -6, 0);
            itemDisplay.setTransformation(transformation);
        }, 2);

        Scheduler.syncLater(itemDisplay::remove, 4 + 12);

        Scheduler.syncLater(() -> {
            for (Entity entity : GetEntity.getMonsters(endLoc, 5, 5, 5)) {
                MonsterData monsterData = Yuehua.monsterData.get(entity.getUniqueId());
                Damage.damageMonster(data, damage, monsterData);
                Buff.deHujia(monsterData, 5 * 20, 0.2);
                Buff.xuanYun(monsterData, 2 * 20);
            }
        }, 6);

    }

    public static void doBeiDou(GongData gongData, Mob mob) {
        double damage = gongData.arrow * 24;
        MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
        Damage.damageMonster(gongData, damage, monsterData);

        Set<String> tags = mob.getScoreboardTags();

        if (tags.contains("mieshen")) {
            tags.remove("mieshen");
            double maxHp = mob.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
            double hp = mob.getHealth();
            double lostHp = maxHp - hp;
            double damage2 = Math.min(10000, 0.4 * lostHp);
            Damage.damageMonster(gongData, damage2, monsterData);

        } else {
            tags.add("mieshen");
            long timeNow = GetEntity.world.getGameTime();
            monsterData.extraData.put("mieshen", timeNow);
            int id = Scheduler.syncLaterWithId(() -> {
                if (tags.contains("mieshen")) {
                    if (timeNow == (long) monsterData.extraData.get("mieshen")) {
                        double maxHp = mob.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
                        double hp = mob.getHealth();
                        double lostHp = maxHp - hp;
                        double damage2 = Math.min(10000, 0.4 * lostHp);
                        Damage.damageMonster(gongData, damage2, monsterData);
                        tags.remove("mieshen");
                    }
                }
            }, 10 * 20);

            monsterData.taskIds.add(id);
        }
    }

    public static void doBeiDou(GongData gongData, Location location) {
        if (!gongData.slot0.id.equals(BeiDouMieShenGong.id)) {
            return;
        }

        location.setPitch(0);
        location.setYaw(gongData.player.getEyeLocation().getYaw());
        ItemDisplay itemDisplay = DisPlayUtils.displayCommon(location.clone().add(0, 1.2, 0), Skill.STAR, new Vector3f(5, 5, 5));
        Scheduler.syncLater(itemDisplay::remove, 5 + 20 * 10);
        int index = GetEntity.random.nextInt(7);
        Player player = gongData.player;

        switch (index) {
            case 0 -> {
                gongData.hitObservers.add("beidou1");
                long timeNow = GetEntity.world.getGameTime();
                gongData.extraData.put("beidou1", timeNow);

                Scheduler.syncLater(() -> {
                    if (timeNow == (long) gongData.extraData.get("beidou1")) {
                        gongData.hitObservers.remove("beidou1");
                    }
                }, 10 * 20);

                BeiDouMieShen beiDouMieShen = (BeiDouMieShen) gongData.slot0;
                beiDouMieShen.loc1 = location;
                SendInformation.sendMes(player, Component.text("§e[七星]§6[天枢]§a召唤"));
            }

            case 1 -> {
                gongData.hitObservers.add("beidou2");
                long timeNow = GetEntity.world.getGameTime();
                gongData.extraData.put("beidou2", timeNow);

                Scheduler.syncLater(() -> {
                    if (timeNow == (long) gongData.extraData.get("beidou2")) {
                        gongData.hitObservers.remove("beidou2");
                    }
                }, 10 * 20);
                BeiDouMieShen beiDouMieShen = (BeiDouMieShen) gongData.slot0;
                beiDouMieShen.loc2 = location;
                SendInformation.sendMes(player, Component.text("§e[七星]§6[天璇]§a召唤"));
            }

            case 2 -> {
                gongData.hitObservers.add("beidou3");
                long timeNow = GetEntity.world.getGameTime();
                gongData.extraData.put("beidou3", timeNow);

                Scheduler.syncLater(() -> {
                    if (timeNow == (long) gongData.extraData.get("beidou3")) {
                        gongData.hitObservers.remove("beidou3");
                    }
                }, 10 * 20);
                BeiDouMieShen beiDouMieShen = (BeiDouMieShen) gongData.slot0;
                beiDouMieShen.loc3 = location;
                SendInformation.sendMes(player, Component.text("§e[七星]§6[天玑]§a召唤"));
            }

            case 3 -> {
                gongData.hitObservers.add("beidou4");
                long timeNow = GetEntity.world.getGameTime();
                gongData.extraData.put("beidou4", timeNow);

                Scheduler.syncLater(() -> {
                    if (timeNow == (long) gongData.extraData.get("beidou4")) {
                        gongData.hitObservers.remove("beidou4");
                    }
                }, 10 * 20);
                BeiDouMieShen beiDouMieShen = (BeiDouMieShen) gongData.slot0;
                beiDouMieShen.loc4 = location;
                SendInformation.sendMes(player, Component.text("§e[七星]§6[天权]§a召唤"));
            }

            case 4 -> {
                gongData.hitObservers.add("beidou5");
                long timeNow = GetEntity.world.getGameTime();
                gongData.extraData.put("beidou5", timeNow);

                Scheduler.syncLater(() -> {
                    if (timeNow == (long) gongData.extraData.get("beidou5")) {
                        gongData.hitObservers.remove("beidou5");
                    }
                }, 10 * 20);
                BeiDouMieShen beiDouMieShen = (BeiDouMieShen) gongData.slot0;
                beiDouMieShen.loc5 = location;
                SendInformation.sendMes(player, Component.text("§e[七星]§6[玉衡]§a召唤"));
            }

            case 5 -> {
                gongData.wuliAttackedObservers.add("beidou6");
                gongData.fashuAttackedObservers.add("beidou6");
                long timeNow = GetEntity.world.getGameTime();
                gongData.extraData.put("beidou6", timeNow);

                Scheduler.syncLater(() -> {
                    if (timeNow == (long) gongData.extraData.get("beidou6")) {
                        gongData.wuliAttackedObservers.remove("beidou6");
                        gongData.fashuAttackedObservers.remove("beidou6");
                    }
                }, 10 * 20);

                BeiDouMieShen beiDouMieShen = (BeiDouMieShen) gongData.slot0;
                beiDouMieShen.loc6 = location;
                SendInformation.sendMes(player, Component.text("§e[七星]§6[开阳]§a召唤"));
            }

            case 6 -> {
                gongData.hitObservers.add("beidou7");
                long timeNow = GetEntity.world.getGameTime();
                gongData.extraData.put("beidou7", timeNow);

                Scheduler.syncLater(() -> {
                    if (timeNow == (long) gongData.extraData.get("beidou7")) {
                        gongData.hitObservers.remove("beidou7");
                    }
                }, 10 * 20);
                BeiDouMieShen beiDouMieShen = (BeiDouMieShen) gongData.slot0;
                beiDouMieShen.loc7 = location;
                SendInformation.sendMes(player, Component.text("§e[七星]§6[摇光]§a召唤"));
            }

        }


    }

}
