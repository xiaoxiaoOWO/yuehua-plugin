package com.xiaoxiaoowo.yuehua.utils;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.system.handleMonsters.DoMonsterAttackedObserver;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoAttackedObserver;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public final class Damage {
    public static void damage(Data data, int damage, Mob mob) {
        Player player = data.player;

        //仇恨
        if (mob.getTarget() == null) {
            mob.setTarget(player);
        }
        MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());

        monsterData.lastAttacker = player;

        //取数据
        double fakang = monsterData.fakang;
        double gedang = monsterData.gedang;
        double x = Math.max(0.0, fakang - data.pofa);
        double y = Math.min(1.0, x);
        double damage2 = damage * (1.0 - y);
        damage2 -= gedang;

        DoMonsterAttackedObserver.doAttacked(monsterData.id,data);

        mob.damage(damage2);
    }


    public static void damage(Data data, int damage, ArrayList<Mob> mobs) {
        for (Mob mob : mobs) {
            Player player = data.player;

            //仇恨
            if (mob.getTarget() == null) {
                mob.setTarget(player);
            }
            MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());

            monsterData.lastAttacker = player;

            //取数据
            double fakang = monsterData.fakang;
            double gedang = monsterData.gedang;
            double x = Math.max(0.0, fakang - data.pofa);
            double y = Math.min(1.0, x);
            double damage2 = damage * (1.0 - y);
            damage2 -= gedang;

            DoMonsterAttackedObserver.doAttacked(monsterData.id,data);

            mob.damage(damage2);
        }
    }

    public static void damageWuli(Data data, int damage, Mob mob) {
        Player player = data.player;
        //仇恨
        if (mob.getTarget() == null) {
            mob.setTarget(player);
        }
        MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());

        monsterData.lastAttacker = player;

        //取数据
        double hujia = monsterData.hujia;
        double gedang = monsterData.gedang;
        double x = Math.max(0.0, hujia - data.pojia);
        double y = Math.min(1.0, x);
        double damage2 = damage * (1.0 - y);
        damage2 -= gedang;

        DoMonsterAttackedObserver.doAttacked(monsterData.id,data);

        mob.damage(damage2);
    }

    public static void damageWuli(Data data, int damage,ArrayList<Mob> mobs) {
        for (Mob mob : mobs) {
            Player player = data.player;
            //仇恨
            if (mob.getTarget() == null) {
                mob.setTarget(player);
            }
            MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());

            monsterData.lastAttacker = player;

            //取数据
            double hujia = monsterData.hujia;
            double gedang = monsterData.gedang;
            double x = Math.max(0.0, hujia - data.pojia);
            double y = Math.min(1.0, x);
            double damage2 = damage * (1.0 - y);
            damage2 -= gedang;

            DoMonsterAttackedObserver.doAttacked(monsterData.id,data);

            mob.damage(damage2);
        }
    }


    public static void damage(Player player, double damage) {
        //取数据
        Data data = Yuehua.playerData.get(player.getUniqueId());

        double fakang = data.fakang;
        double gedang = data.gedang;

        double damage2 = damage * (1.0 - fakang);
        damage2 -= gedang;
        //伤害
        player.damage(damage2);

        for (String observer : data.attackedObservers) {
            DoAttackedObserver.doAttacked(observer,data,null);
        }
    }


    public static void damage(double damage, ArrayList<Player> players) {
        for (Player player : players) {
            //取数据
            Data data = Yuehua.playerData.get(player.getUniqueId());

            double fakang = data.fakang;
            double gedang = data.gedang;


            double damage2 = damage * (1.0 - fakang);
            damage2 -= gedang;

            //伤害
            player.damage(damage2);

            for (String observer : data.attackedObservers) {
                DoAttackedObserver.doAttacked(observer,data,null);
            }
        }
    }


}
