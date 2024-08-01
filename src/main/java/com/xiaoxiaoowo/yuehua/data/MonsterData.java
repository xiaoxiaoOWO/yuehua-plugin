package com.xiaoxiaoowo.yuehua.data;

import org.bukkit.entity.Player;

import java.util.ArrayList;

public final class MonsterData {
    public double attack;
    public double hujia;
    public double fakang;
    public double gedang;
    public double renxing;
    public double shengji;

    public ArrayList<Integer> taskIds;


    public String id;

    public Player lastAttacker;

    public MonsterData(double attack, double hujia, double fakang, double gedang, double renxing, double shengji, String id) {
        this.attack = attack;
        this.hujia = hujia;
        this.fakang = fakang;
        this.gedang = gedang;
        this.renxing = renxing;
        this.shengji = shengji;
        this.id = id;
        this.taskIds = new ArrayList<>(5);
        lastAttacker = null;
    }

    public void updateAttack(double attack) {
        this.attack += attack;
        this.attack = Math.max(0.0, this.attack);
    }

    public void updateHujia(double hujia) {
        this.hujia += hujia;
        this.hujia = Math.max(0.0, this.hujia);
    }

    public void updateFakang(double fakang) {
        this.fakang += fakang;
        this.fakang = Math.max(0.0, this.fakang);
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
