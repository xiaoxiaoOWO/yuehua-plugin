package com.xiaoxiaoowo.yuehua.system.handleObsevers;

import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.slot.special.BeiDouMieShen;
import com.xiaoxiaoowo.yuehua.jineng.gong.weapon.juji.BeiDouMieShenGong;
import com.xiaoxiaoowo.yuehua.system.Buff;
import com.xiaoxiaoowo.yuehua.system.Cure;
import com.xiaoxiaoowo.yuehua.system.Damage;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class DoHitObserver {
    private static final World world = GetEntity.world;
    public static final PotionEffect BeiDou = new PotionEffect(PotionEffectType.SPEED, 20 * 10, 4);

    public static double doHit(String id, GongData data, MonsterData monsterData) {
        switch (id) {
            case "beidou1" -> {
                return doBeiDou1(data);
            }

            case "beidou2" -> {
                return doBeiDou2(data, monsterData);
            }

            case "beidou3" -> {
                return doBeiDou3(data, monsterData);
            }

            case "beidou4" -> {
                return doBeiDou4(data, monsterData);
            }

            case "beidou5" -> {
                return doBeiDou5(data);
            }

            case "beidou7" -> {
                return doBeiDou7(data);
            }

            case "hongLinNu" -> {
                return doHongLinNu(data, monsterData);
            }

            case "jiaoLongNu" -> {
                return doJiaoLongNu(monsterData);
            }

            case "hongLuanGong" -> {
                return doHongLuanGong(data, monsterData);
            }

            case "laoLieHuJianDai" -> {
                return 1.15d;
            }


            default -> {
                return 1.0;
            }
        }
    }

    public static double doHongLuanGong(GongData data, MonsterData monsterData) {
        double damage = (double) data.extraData.get("hongLuanGongAttack");
        Damage.damageMonster(data, damage, monsterData);
        return 1.0d;
    }

    public static double doBeiDou1(GongData data) {
        if (!data.slot0.id.equals(BeiDouMieShenGong.id)) {
            return 1.0d;
        }
        BeiDouMieShen beiDouMieShen = (BeiDouMieShen) data.slot0;
        Player player = data.player;
        Location pLoc = player.getLocation();
        Location starLoc = beiDouMieShen.loc1;
        if (GetEntity.mydistance(pLoc, starLoc) > 64) {
            return 1.0d;
        }

        return 1.7d;
    }

    public static double doBeiDou2(GongData data, MonsterData monsterData) {
        if (!data.slot0.id.equals(BeiDouMieShenGong.id)) {
            return 1.0d;
        }
        BeiDouMieShen beiDouMieShen = (BeiDouMieShen) data.slot0;
        Player player = data.player;
        Location pLoc = player.getLocation();
        Location starLoc = beiDouMieShen.loc2;
        if (GetEntity.mydistance(pLoc, starLoc) > 64) {
            return 1.0d;
        }


        Buff.deHujia(monsterData, 2 * 20, 0.3);
        Buff.deFakang(monsterData, 2 * 20, 0.3);
        return 1.0d;
    }

    public static double doBeiDou3(GongData data, MonsterData monsterData) {
        if (!data.slot0.id.equals(BeiDouMieShenGong.id)) {
            return 1.0d;
        }
        BeiDouMieShen beiDouMieShen = (BeiDouMieShen) data.slot0;
        Player player = data.player;
        Location pLoc = player.getLocation();
        Location starLoc = beiDouMieShen.loc3;
        if (GetEntity.mydistance(pLoc, starLoc) > 64) {
            return 1.0d;
        }


        Buff.xuanYun(monsterData, 2 * 20);
        return 1.0d;
    }

    public static double doBeiDou4(GongData data, MonsterData monsterData) {
        if (!data.slot0.id.equals(BeiDouMieShenGong.id)) {
            return 1.0d;
        }
        BeiDouMieShen beiDouMieShen = (BeiDouMieShen) data.slot0;
        Player player = data.player;
        Location pLoc = player.getLocation();
        Location starLoc = beiDouMieShen.loc4;
        if (GetEntity.mydistance(pLoc, starLoc) > 64) {
            return 1.0d;
        }


        Mob mob = monsterData.monster;
        double hpNow = mob.getHealth();
        double damage = Math.min(2000, hpNow * 0.1);
        Damage.damageMonster(data, damage, monsterData);

        return 1.0d;
    }

    public static double doBeiDou5(GongData data) {
        if (!data.slot0.id.equals(BeiDouMieShenGong.id)) {
            return 1.0d;
        }
        BeiDouMieShen beiDouMieShen = (BeiDouMieShen) data.slot0;
        Player player = data.player;
        Location pLoc = player.getLocation();
        Location starLoc = beiDouMieShen.loc5;
        if (GetEntity.mydistance(pLoc, starLoc) > 64) {
            return 1.0d;
        }

        double amount = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() * 0.01 + 10;
        Cure.curePlayer(amount, data);

        return 1.0d;
    }


    public static double doBeiDou7(GongData data) {
        if (!data.slot0.id.equals(BeiDouMieShenGong.id)) {
            return 1.0d;
        }
        BeiDouMieShen beiDouMieShen = (BeiDouMieShen) data.slot0;
        Player player = data.player;
        Location pLoc = player.getLocation();
        Location starLoc = beiDouMieShen.loc7;
        if (GetEntity.mydistance(pLoc, starLoc) > 64) {
            return 1.0d;
        }
        player.addPotionEffect(BeiDou);

        return 1.0d;
    }

    public static double doHongLinNu(GongData data, MonsterData monsterData) {
        double damage = data.arrow * 2.5;
        Damage.damageMonster(data, damage, monsterData);
        Buff.deFakang(monsterData, 2 * 20, 0.1);
        return 1.0d;
    }

    public static double doJiaoLongNu(MonsterData monsterData) {
        Buff.deHujia(monsterData, 2 * 20, 0.15);
        return 1.9d;
    }
}
