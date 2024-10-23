package com.xiaoxiaoowo.yuehua.data;

import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;

import java.util.*;

public final class MonsterData {
    public double attack;
    public double hujia;
    public double pojia;
    public double fakang;
    public double pofa;
    public double gedang;
    public double renxing;
    public double shengji;
    public Mob monster;

    public Map<String,Object> extraData;

    public ArrayList<Integer> taskIds;

    public Set<String> wuliAttackedObservers;
    public Set<String> mofaAttackedObservers;
    public Set<String> attackedObservers;
    public Set<String> killedObservers;
    public Set<String> attackObservers;
    public Set<String> shootObservers;

    public String id;

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
        this.taskIds = new ArrayList<>(5);
        this.monster = monster;
        lastAttacker = null;
        extraData = new HashMap<>(5);

        wuliAttackedObservers = new HashSet<>(5);
        mofaAttackedObservers = new HashSet<>(5);
        attackedObservers = new HashSet<>(5);
        killedObservers = new HashSet<>(5);
        attackObservers = new HashSet<>(5);
        shootObservers = new HashSet<>(5);

        wuliAttackedObservers.add(id);
        mofaAttackedObservers.add(id);
        attackedObservers.add(id);
        attackObservers.add(id);
        shootObservers.add(id);
    }

    public void updateAttack(double attack) {
        this.attack += attack;
        this.attack = Math.max(0.0, this.attack);
    }

    public void updateHujia(double hujia) {
        this.hujia += hujia;
        this.hujia = Math.max(0.0, this.hujia);
    }

    public void updatePojia(double pojia) {
        this.pojia += pojia;
        this.pojia = Math.max(0.0, this.pojia);
    }

    public void updateFakang(double fakang) {
        this.fakang += fakang;
        this.fakang = Math.max(0.0, this.fakang);
    }

    public void updatePofa(double pofa) {
        this.pofa += pofa;
        this.pofa = Math.max(0.0, this.pofa);
    }

    public void updateGedang(double gedang) {
        this.gedang += gedang;
        this.gedang = Math.max(0.0, this.gedang);
    }

    public void updateRenxing(double renxing) {
        this.renxing += renxing;
        this.renxing = Math.max(0.0, this.renxing);
    }

    public void updateShengji(double shengji) {
        this.shengji += shengji;
        this.shengji = Math.max(0.0, this.shengji);
    }




}
