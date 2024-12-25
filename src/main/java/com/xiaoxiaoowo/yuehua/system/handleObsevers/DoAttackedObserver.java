package com.xiaoxiaoowo.yuehua.system.handleObsevers;

import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.slot.special.BeiDouMieShen;
import com.xiaoxiaoowo.yuehua.jineng.gong.weapon.juji.BeiDouMieShenGong;
import com.xiaoxiaoowo.yuehua.system.Cure;
import com.xiaoxiaoowo.yuehua.system.Damage;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;

public final class DoAttackedObserver {
    private static final World world = GetEntity.world;

    public static double doAttacked(String id, Data data, Mob monster, double damage) {
        switch (id) {
            case "tou1" -> {
                return doTou1(data);
            }

            case "zhanTou2" -> {
                return doZhanTou2345(data, 2, monster);
            }

            case "zhanTou3" -> {
                return doZhanTou2345(data, 3, monster);
            }

            case "zhanTou4" -> {
                return doZhanTou2345(data, 4, monster);
            }

            case "zhanTou5" -> {
                return doZhanTou2345(data, 5, monster);
            }

            case "gongTou2" -> {
                return doGongTou2345(data, 2, monster);
            }

            case "gongTou3" -> {
                return doGongTou2345(data, 3, monster);
            }

            case "gongTou4" -> {
                return doGongTou2345(data, 4, monster);
            }

            case "gongTou5" -> {
                return doGongTou2345(data, 5, monster);
            }

            case "danTou2" -> {
                return doDanTou2345(data, 2, monster);
            }

            case "danTou3" -> {
                return doDanTou2345(data, 3, monster);
            }

            case "danTou4" -> {
                return doDanTou2345(data, 4, monster);
            }

            case "danTou5" -> {
                return doDanTou2345(data, 5, monster);
            }

            case "zhanXiong2", "gongXiong2", "danXiong2" -> {
                return doXiong2345(data, 2, monster, damage);
            }

            case "zhanXiong3", "gongXiong3", "danXiong3" -> {
                return doXiong2345(data, 3, monster, damage);
            }

            case "zhanXiong4", "gongXiong4", "danXiong4" -> {
                return doXiong2345(data, 4, monster, damage);
            }

            case "zhanXiong5", "gongXiong5", "danXiong5" -> {
                return doXiong2345(data, 5, monster, damage);
            }


            default -> {
                return 1.0d;
            }
        }
    }

    public static double doAttackedWuLi(String id, Data data, Mob monster) {
        switch (id) {
            case "beidou6" -> {
                return doBeiDou6Wuli(data);
            }

            case "tuyuansu" -> {
                return doTu(data);
            }

            default -> {
                return 1.0d;
            }
        }
    }

    public static double doAttackedMoFa(String id, Data data, Mob monster) {
        switch (id) {
            case "beidou6" -> {
                return doBeiDou6Mofa(data);
            }

            default -> {
                return 1.0d;
            }
        }
    }

    public static double doTu(Data data) {
        data.wuliAttackedObservers.remove("tuyuansu");

        return 0.0d;
    }

    public static double doTou1(Data data) {
        Player player = data.player;
        if (data.slot39.cd_passive < world.getGameTime()) {
            data.slot39.cd_passive = world.getGameTime() + (long) (20 * 10L * data.real_cool);
            Cure.curePlayer(2.0, data);
            if (!data.noinfor) {
                SendInformation.sendMes(player, Component.text("§e[被动技]§6[守御]§a触发"));
            }
            if (!data.nosound) {
                PlaySound.zhiliao(player);
            }

        }
        return 1.0d;
    }

    public static double doZhanTou2345(Data data, int level, Mob monster) {
        Player player = data.player;
        if (data.slot39.cd_passive < world.getGameTime()) {
            data.slot39.cd_passive = world.getGameTime() + (long) (20 * 20L * data.real_cool);
            int base = 6;
            int value = base * (1 << (level - 1));
            data.updateAttackAdd(value);
            double damage = data.attack * (0.5 * level + 1);
            if (monster != null) {
                Damage.damageMonster(data, damage, monster);
            }

            if (!data.noinfor) {
                SendInformation.sendMes(player, Component.text("§e[被动技]§6[守中藏锋]§a触发"));
            }

            if (!data.nosound) {
                PlaySound.entityVillagerWorkMason(player);
            }

            Scheduler.syncLater(() -> {
                if ((!player.isConnected())) {
                    return;
                }
                data.updateAttackAdd(-value);
            }, 5 * 20);

        }
        return 1.0d;
    }

    public static double doXiong2345(Data data, int level, Mob monster, double damage) {
        double decrease = 0.02 * level + 0.06;
        Player player = data.player;
        double maxHp = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
        if (damage > (0.1 * maxHp)) {
            double cd_decrease_s = 0.1 * level + 0.3;
            long cd_decrease = (long) (cd_decrease_s * 20);
            switch (data.job) {
                case 1, 2 -> {
                    data.slot0.cd_active -= cd_decrease;
                    if (!data.noinfor) {
                        SendInformation.sendMes(player, Component.text("§e[游戏机制]§6主武器主动技能一cd减少§b" + cd_decrease_s + "s"));
                    }



                }

                case 3 -> {
                    DanData danData = (DanData) data;
                    danData.cd_jin -= cd_decrease;
                    if (!data.noinfor) {
                        SendInformation.sendMes(player, Component.text("§e[游戏机制]§6金元素阵法cd减少§b" + cd_decrease_s + "s"));
                    }
                }
            }

        }

        return 1.0d - decrease;
    }

    public static double doGongTou2345(Data data, int level, Mob monster) {
        Player player = data.player;
        if (data.slot39.cd_passive < world.getGameTime()) {
            data.slot39.cd_passive = world.getGameTime() + (long) (20 * 20L * data.real_cool);
            int value = 2 << (level - 1);
            GongData gongData = (GongData) data;
            gongData.updateArrowAdd(value);
            double damage = gongData.arrow * (1.5 * level + 3);
            if (monster != null) {
                Damage.damageMonster(data, damage, monster);
            }
            if (!data.noinfor) {
                SendInformation.sendMes(player, Component.text("§e[被动技]§6[守中藏锋]§a触发"));
            }

            if (!data.nosound) {
                PlaySound.entityVillagerWorkMason(player);
            }

            Scheduler.syncLater(() -> {
                if ((!player.isConnected())) {
                    return;
                }
                gongData.updateArrowAdd(-value);
            }, 5 * 20);

        }
        return 1.0d;
    }

    public static double doDanTou2345(Data data, int level, Mob monster) {
        Player player = data.player;
        if (data.slot39.cd_passive < world.getGameTime()) {
            data.slot39.cd_passive = world.getGameTime() + (long) (20 * 20L * data.real_cool);
            int value = 2 << (level - 1);
            DanData danData = (DanData) data;
            danData.updateZhenfaAdd(value);
            double damage = danData.zhenfa * (1.5 * level + 3);
            if (monster != null) {
                Damage.damageMonster(data, damage, monster);
            }
            if (!data.noinfor) {
                SendInformation.sendMes(player, Component.text("§e[被动技]§6[守中藏锋]§a触发"));
            }

            if (!data.nosound) {
                PlaySound.entityVillagerWorkMason(player);
            }

            Scheduler.syncLater(() -> {
                if ((!player.isConnected())) {
                    return;
                }
                danData.updateZhenfaAdd(-value);
            }, 5 * 20);

        }
        return 1.0d;
    }

    public static double doBeiDou6Wuli(Data data) {
        if (!data.slot0.id.equals(BeiDouMieShenGong.id)) {
            return 1.0d;
        }
        BeiDouMieShen beiDouMieShen = (BeiDouMieShen) data.slot0;
        Player player = data.player;
        Location pLoc = player.getLocation();
        Location starLoc = beiDouMieShen.loc6;
        if (GetEntity.mydistance(pLoc, starLoc) > 64) {
            return 1.0d;
        }
        return 0.5d;
    }

    public static double doBeiDou6Mofa(Data data) {
        if (!data.slot0.id.equals(BeiDouMieShenGong.id)) {
            return 1.0d;
        }
        BeiDouMieShen beiDouMieShen = (BeiDouMieShen) data.slot0;
        Player player = data.player;
        Location pLoc = player.getLocation();
        Location starLoc = beiDouMieShen.loc6;
        if (GetEntity.mydistance(pLoc, starLoc) > 64) {
            return 1.0d;
        }
        return 0.75d;
    }
}
