package com.xiaoxiaoowo.yuehua.system.handleMonsters;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.PetData;
import com.xiaoxiaoowo.yuehua.system.Buff;
import com.xiaoxiaoowo.yuehua.system.Cure;
import com.xiaoxiaoowo.yuehua.system.Damage;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;

public final class DoMonsterWuLiAttacked {
    public static double doWuLiAttacked(String id, MonsterData monsterData, Data data) {
        switch (id) {

            case "poKongFu" -> {
                return doPoKongFu(monsterData);
            }

            case "sanBaoYuRuYi-fo" -> {
                return doSanBaoFo(data);
            }

            case "sanBaoYuRuYi-fa" -> {
                return doSanBaoFa(data);
            }

            case "sanBaoYuRuYi-seng" -> {
                return doSanBaoSeng(data);
            }

            default -> {
                return 1.0d;
            }
        }
    }


    public static double doWuLiAttacked(String id, MonsterData monsterData, PetData petData) {
        switch (id) {
            default -> {
                return 1.0d;
            }
        }
    }

    public static double doPoKongFu(MonsterData monsterData) {
        Buff.deHujia(monsterData, 30, 0.1);
        return 1.0d;
    }

    public static double doSanBaoFo(Data data) {
        if (!data.slot0.id.equals("sanBaoYuRuYi")) {
            return 1.0d;
        }

        Player player = data.player;
        for (Entity entity : GetEntity.getMonsters(player.getLocation(), 4, 4, 4)) {
            Mob mob = (Mob) entity;
            double damage = data.attack;
            Damage.damageMonster(data, damage, mob);
        }
        return 1.0d;
    }

    public static double doSanBaoFa(Data data) {
        if (!data.slot0.id.equals("sanBaoYuRuYi")) {
            return 1.0d;
        }
        Player player = data.player;
        Cure.curePlayer(0.0025 * player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() + 5, data);
        return 1.0d;
    }

    public static double doSanBaoSeng(Data data) {
        if (!data.slot0.id.equals("sanBaoYuRuYi")) {
            return 1.0d;
        }
        Player player = data.player;
        player.setFoodLevel(player.getFoodLevel() + 1);
        return 1.0d;
    }
}
