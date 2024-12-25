package com.xiaoxiaoowo.yuehua.data;

import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;

import java.util.*;

public final class MonsterData {
    public double attack;
    public double attack_score;
    public double attack_add;

    public double hujia;
    public double hujia_score;
    public double hujia_add;


    public double pojia;
    public double pojia_score;
    public double pojia_add;

    public double fakang;
    public double fakang_score;
    public double fakang_add;

    public double pofa;
    public double pofa_score;
    public double pofa_add;

    public double gedang;
    public double gedang_score;
    public double gedang_add;

    public double renxing;
    public double renxing_score;
    public double renxing_add;

    public double shengji;
    public double shengji_score;
    public double shengji_add;

    public Map<String,Object> extraData;
    public ArrayList<Integer> taskIds;

    public Set<String> wuliAttackedObservers;
    public Set<String> mofaAttackedObservers;
    public Set<String> attackedObservers;
    public Set<String> killedObservers;
    public Set<String> attackObservers;
    public Set<String> shootObservers;

    public String id;
    public Mob monster;
    public Player lastAttacker;

    public MonsterData(double attack, double hujia, double pojia,double fakang,double pofa, double gedang, double renxing, double shengji, String id, Mob monster) {
        this.attack = attack;
        this.hujia = hujia;
        this.pojia = pojia;
        this.fakang = fakang;
        this.pofa = pofa;
        this.gedang = gedang;
        this.renxing = renxing;
        this.shengji = shengji;
        this.id = id;
        this.monster = monster;
        lastAttacker = null;

        this.attack_score = attack;
        this.hujia_score = hujia;
        this.pojia_score = pojia;
        this.fakang_score = fakang;
        this.pofa_score = pofa;
        this.gedang_score = gedang;
        this.renxing_score = renxing;
        this.shengji_score = shengji;

        attack_add = 0.0;
        hujia_add = 0.0;
        pojia_add = 0.0;
        fakang_add = 0.0;
        pofa_add = 0.0;
        gedang_add = 0.0;
        renxing_add = 0.0;
        shengji_add = 0.0;

        taskIds = new ArrayList<>(5);
        extraData = new HashMap<>(5);

        wuliAttackedObservers = new HashSet<>(5);
        mofaAttackedObservers = new HashSet<>(5);
        attackedObservers = new HashSet<>(5);
        killedObservers = new HashSet<>(5);
        attackObservers = new HashSet<>(5);
        shootObservers = new HashSet<>(5);

    }

    public void updateAttack(double attack) {
        attack_add += attack;
        this.attack = Math.max(0.0, attack_score + attack_add);
    }

    public void updateHujia(double hujia) {
        hujia_add += hujia;
        this.hujia = Math.max(0.0, hujia_score + hujia_add);
    }

    public void updatePojia(double pojia) {
        pojia_add += pojia;
        this.pojia = Math.max(0.0, pojia_score + pojia_add);
    }

    public void updateFakang(double fakang) {
        fakang_add += fakang;
        this.fakang = Math.max(0.0, fakang_score + fakang_add);
    }

    public void updatePofa(double pofa) {
        pofa_add += pofa;
        this.pofa = Math.max(0.0, pofa_score + pofa_add);
    }

    public void updateGedang(double gedang) {
        gedang_add += gedang;
        this.gedang = Math.max(0.0, gedang_score + gedang_add);
    }

    public void updateRenxing(double renxing) {
        renxing_add += renxing;
        this.renxing = Math.max(0.0, renxing_score + renxing_add);
    }

    public void updateShengji(double shengji) {
        shengji_add += shengji;
        this.shengji = Math.max(0.0, shengji_score + shengji_add);
    }






}
