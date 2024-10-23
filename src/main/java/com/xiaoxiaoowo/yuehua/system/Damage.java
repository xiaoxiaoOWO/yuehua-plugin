package com.xiaoxiaoowo.yuehua.system;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.system.handleMonsters.DoMonsterAttackedObserver;
import com.xiaoxiaoowo.yuehua.system.handleMonsters.DoMonsterMoFaAttacked;
import com.xiaoxiaoowo.yuehua.system.handleMonsters.DoMonsterWuLiAttacked;
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

        double damage2 = damage - gedang;

        damage2 = damage2 * (1.0 - y);

        for(String observer : monsterData.mofaAttackedObservers) {
            damage2 = damage2 * DoMonsterMoFaAttacked.doMoFaAttacked(observer,monsterData,data);
        }

        for(String observer: monsterData.attackedObservers){
            damage2 = damage2 * DoMonsterAttackedObserver.doAttacked(observer,monsterData,data);
        }

        mob.damage(damage2);
    }


    public static void damage(Data data, int damage, ArrayList<Mob> mobs) {
        Player player = data.player;
        for (Mob mob : mobs) {
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

            double damage2 = damage - gedang;

            damage2 = damage2 * (1.0 - y);

            for(String observer : monsterData.mofaAttackedObservers) {
                damage2 = damage2 * DoMonsterMoFaAttacked.doMoFaAttacked(observer,monsterData,data);
            }

            for(String observer: monsterData.attackedObservers){
                damage2 = damage2 * DoMonsterAttackedObserver.doAttacked(observer,monsterData,data);
            }

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
        double damage2 = damage - gedang;

        damage2 = damage2 * (1.0 - y);

        for(String observer : monsterData.wuliAttackedObservers) {
            damage2 = damage2 * DoMonsterWuLiAttacked.doWuLiAttacked(observer,monsterData,data);
        }

        for(String observer: monsterData.attackedObservers){
            damage2 = damage2 * DoMonsterAttackedObserver.doAttacked(observer,monsterData,data);
        }

        mob.damage(damage2);
    }

    public static void damageWuli(Data data, int damage,ArrayList<Mob> mobs) {
        Player player = data.player;
        for (Mob mob : mobs) {
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
            double damage2 = damage - gedang;

            damage2 = damage2 * (1.0 - y);

            for(String observer : monsterData.wuliAttackedObservers) {
                damage2 = damage2 * DoMonsterWuLiAttacked.doWuLiAttacked(observer,monsterData,data);
            }

            for(String observer: monsterData.attackedObservers){
                damage2 = damage2 * DoMonsterAttackedObserver.doAttacked(observer,monsterData,data);
            }

            mob.damage(damage2);
        }
    }


    public static void damage(Player player, double damage,MonsterData monsterData) {
        //取数据
        Data data = Yuehua.playerData.get(player.getUniqueId());

        Mob mob = monsterData.monster;

        data.lastAttacker = mob;

        double fakang = data.fakang;
        double gedang = data.gedang;
        double x = Math.max(0.0, fakang - monsterData.pofa);
        double y = Math.min(0.8, x);

        double damage2 = damage - gedang;
        damage2 = damage2 * (1.0 - y);

        for (String observer : data.fashuAttackedObservers) {
            damage2 = damage2 * DoAttackedObserver.doAttackedMoFa(observer,data,mob);
        }

        for (String observer : data.attackedObservers) {
            damage2 = damage2 * DoAttackedObserver.doAttacked(observer,data,mob);
        }

        //伤害
        player.damage(damage2);

    }


    public static void damage(double damage, ArrayList<Player> players,MonsterData monsterData) {
        for (Player player : players) {
            //取数据
            Data data = Yuehua.playerData.get(player.getUniqueId());

            Mob mob = monsterData.monster;

            data.lastAttacker = mob;

            double fakang = data.fakang;
            double gedang = data.gedang;
            double x = Math.max(0.0, fakang - monsterData.pofa);
            double y = Math.min(0.8, x);

            double damage2 = damage - gedang;
            damage2 = damage2 * (1.0 - y);

            for (String observer : data.fashuAttackedObservers) {
                damage2 = damage2 * DoAttackedObserver.doAttackedMoFa(observer,data,mob);
            }

            for (String observer : data.attackedObservers) {
                damage2 = damage2 * DoAttackedObserver.doAttacked(observer,data,mob);
            }

            //伤害
            player.damage(damage2);
        }
    }


}
