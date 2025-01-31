package com.xiaoxiaoowo.yuehua.system;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoCuredObserver;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoHuDunObserver;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public final class Cure {

    public static void curePlayer(double amout, Player player) {
        Data data = Yuehua.playerData.get(player.getUniqueId());
        double shengji = data.shengji;
        amout = amout * shengji;
        for (String observer : data.curedObservers) {
            amout = amout * DoCuredObserver.doCured(observer, data);
        }
        double hp = player.getHealth();
        amout += hp;
        double max_hp = player.getAttribute(Attribute.MAX_HEALTH).getValue();
        amout = Math.min(max_hp, amout);
        player.setHealth(amout);
    }


    public static void curePlayer(double amout, Data data) {
        Player player = data.player;
        double shengji = data.shengji;
        amout = amout * shengji;
        for (String observer : data.curedObservers) {
            amout = amout * DoCuredObserver.doCured(observer, data);
        }
        double hp = player.getHealth();
        amout += hp;
        double max_hp = player.getAttribute(Attribute.MAX_HEALTH).getValue();
        amout = Math.min(max_hp, amout);
        player.setHealth(amout);
    }

    public static void curePlayer(double amout, ArrayList<Player> players) {
        for (Player player : players) {
            Data data = Yuehua.playerData.get(player.getUniqueId());
            double shengji = data.shengji;
            amout = amout * shengji;
            for (String observer : data.curedObservers) {
                amout = amout * DoCuredObserver.doCured(observer, data);
            }
            double hp = player.getHealth();
            amout += hp;
            double max_hp = player.getAttribute(Attribute.MAX_HEALTH).getValue();
            amout = Math.min(max_hp, amout);
            player.setHealth(amout);
        }
    }

    public static void shouhuPlayer(double amout, Player player) {
        Data data = Yuehua.playerData.get(player.getUniqueId());
        for (String observer : data.getHuDunObservers) {
            amout = amout * DoHuDunObserver.doHuDun(observer, data);
        }
        double shouhu = data.shouhu;
        //获取玩家现存的伤害吸收数值
        double shouhu_hp = player.getAbsorptionAmount();
        double shouhu_max = Math.min(shouhu_hp + amout, shouhu);
        player.setAbsorptionAmount(shouhu_max);
    }

    public static void shouhuPlayer(double amout,Data data) {
        Player player = data.player;
        for (String observer : data.getHuDunObservers) {
            amout = amout * DoHuDunObserver.doHuDun(observer, data);
        }
        double shouhu = data.shouhu;
        //获取玩家现存的伤害吸收数值
        double shouhu_hp = player.getAbsorptionAmount();
        double shouhu_max = Math.min(shouhu_hp + amout, shouhu);
        player.setAbsorptionAmount(shouhu_max);

    }

    public static void shouhuPlayer(double amout, ArrayList<Player> players) {
        for (Player player : players) {
            Data data = Yuehua.playerData.get(player.getUniqueId());
            for (String observer : data.getHuDunObservers) {
                amout = amout * DoHuDunObserver.doHuDun(observer, data);
            }
            double shouhu = data.shouhu;
            //获取玩家现存的伤害吸收数值
            double shouhu_hp = player.getAbsorptionAmount();
            double shouhu_max = Math.min(shouhu_hp + amout, shouhu);
            player.setAbsorptionAmount(shouhu_max);
        }


    }

    public static void cureMonster(double amout, ArrayList<Mob> mobs) {
        for (Mob mob : mobs) {
            //取数据
            double shengji = Yuehua.monsterData.get(mob.getUniqueId()).shengji;
            double hp = mob.getHealth();
            amout = amout * shengji + hp;
            double max_hp = mob.getAttribute(Attribute.MAX_HEALTH).getValue();
            amout = Math.min(max_hp, amout);
            mob.setHealth(amout);
        }
    }

    public static void cureMonster(double amout, Mob mob) {

        //取数据
        double shengji = Yuehua.monsterData.get(mob.getUniqueId()).shengji;
        double hp = mob.getHealth();
        amout = amout * shengji + hp;
        double max_hp = mob.getAttribute(Attribute.MAX_HEALTH).getValue();
        amout = Math.min(max_hp, amout);
        mob.setHealth(amout);
    }

}
