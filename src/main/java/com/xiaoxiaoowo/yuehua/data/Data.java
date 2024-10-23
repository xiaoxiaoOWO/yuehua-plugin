package com.xiaoxiaoowo.yuehua.data;


import com.xiaoxiaoowo.yuehua.data.slot.EnderChestSlot;
import com.xiaoxiaoowo.yuehua.data.slot.Slot;
import com.xiaoxiaoowo.yuehua.data.slot.SlotBuilder;
import com.xiaoxiaoowo.yuehua.data.slot.SlotWithOneActiveSkill;
import com.xiaoxiaoowo.yuehua.system.Act;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Data {
    public Player player;

    public Set<Integer> taskIds;

    public Set<String> deathObservers;
    public Set<String> jiNengObservers;
    public Set<String> attackObservers;
    public Set<String> baoJiObservers;

    public Set<String> wuliAttackedObservers;
    public Set<String> fashuAttackedObservers;
    public Set<String> attackedObservers;

    public Set<String> curedObservers;
    public Set<String> getHuDunObservers;

    public Map<String, Object> extraData;

    public Mob lastAttacker;

    //打开容器时设置为true
    public boolean open = false;

    public boolean canAttack = true;
    public boolean canJiNeng = true;

    public int snowBlind = 0;
    public int yezi = 0;
    public int zhusi = 0;
    public int soul = 0;

    public int mustBaoji = 0;

    //时效性的属性存储于这里，玩家退出后将会消失，为了避免对正常游戏造成影响，尽量少使用长时效的BUFF
    public double attack;
    public double attack_score;
    public double attack_mul;


    public double baoji;
    public double baoji_score;
    public double baoji_add;


    public double baojixiaoguo;
    public double baojixiaoguo_score;
    public double baojixiaoguo_add;

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

    public double shouhu;
    public double shouhu_score;
    public double shouhu_add;

    public double renxing;
    public double renxing_score;
    public double renxing_add;

    public double shengji;
    public double shengji_score;
    public double shengji_add;

    public double cool_reduce;
    public double cool_reduce_score;
    public double cool_reduce_add;
    public double cool_reduce_unlimited;
    public double real_cool;

    public int branch;
    public int job;
    public int race;

    //特殊免伤系列
    public double dumian;
    public double huomian;
    public double bingmian;
    public double jianmian;
    public double shuailuomian;
    public double sanchajimian;

    public double dumian_score;
    public double huomian_score;
    public double bingmian_score;
    public double jianmian_score;
    public double shuailuomian_score;
    public double sanchajimian_score;


    public int money;
    public int jinCount;
    public int muCount;
    public int shuiCount;
    public int huoCount;
    public int tuCount;

    public int refinedJinCount;
    public int refinedMuCount;
    public int refinedShuiCount;
    public int refinedHuoCount;
    public int refinedTuCount;

    public int concentratedJinCount;
    public int concentratedMuCount;
    public int concentratedShuiCount;
    public int concentratedHuoCount;
    public int concentratedTuCount;


    public SlotWithOneActiveSkill slot0;
    public SlotWithOneActiveSkill slot1;
    public SlotWithOneActiveSkill slot2;
    public Slot slot36;
    public Slot slot37;
    public Slot slot38;
    public Slot slot39;
    public Slot slot40;

    public SlotWithOneActiveSkill slot8;


    public EnderChestSlot eSlot0;
    public EnderChestSlot eSlot1;
    public EnderChestSlot eSlot2;
    public EnderChestSlot eSlot3;
    public EnderChestSlot eSlot4;
    public EnderChestSlot eSlot5;
    public EnderChestSlot eSlot6;
    public EnderChestSlot eSlot7;


    //乾坤袋
    public Inventory inventory1;
    public Inventory inventory2;
    public Inventory inventory3;
    public Inventory inventory4;
    public Inventory inventory5;
    public Inventory inventory6;
    public Inventory inventory7;
    public Inventory inventory8;
    public Inventory inventory9;
    public Inventory inventory10;
    public Inventory inventory11;
    public Inventory inventory12;
    public Inventory inventory13;
    public Inventory inventory14;
    public Inventory inventory15;
    public Inventory inventory16;
    public Inventory inventory17;
    public Inventory inventory18;

    //饰品槽
    public Inventory shipinBar;

    public Data() {
    }


    public Data(Player player) {

        this.player = player;

        taskIds = new HashSet<>(20);

        deathObservers = new HashSet<>(4);

        jiNengObservers = new HashSet<>(10);

        baoJiObservers = new HashSet<>(5);

        attackObservers = new HashSet<>(10);

        wuliAttackedObservers = new HashSet<>(10);
        fashuAttackedObservers = new HashSet<>(10);
        attackedObservers = new HashSet<>(20);

        curedObservers = new HashSet<>(5);

        getHuDunObservers = new HashSet<>(5);

        extraData = new HashMap<>(20);


        PersistentDataContainer pdc = player.getPersistentDataContainer();
        //数据
        attack_score = pdc.get(DataContainer.attack, PersistentDataType.DOUBLE);
        baoji_score = pdc.get(DataContainer.baoji, PersistentDataType.DOUBLE);
        baojixiaoguo_score = pdc.get(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE);
        hujia_score = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        pojia_score = pdc.get(DataContainer.pojia, PersistentDataType.DOUBLE);
        gedang_score = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
        shouhu_score = pdc.get(DataContainer.shouhu, PersistentDataType.DOUBLE);
        fakang_score = pdc.get(DataContainer.fakang, PersistentDataType.DOUBLE);
        pofa_score = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
        renxing_score = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
        shengji_score = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);

        cool_reduce_score = pdc.get(DataContainer.cool_reduce, PersistentDataType.DOUBLE);
        cool_reduce_unlimited = pdc.get(DataContainer.cool_reduce_unlimited, PersistentDataType.DOUBLE);

        job = pdc.get(DataContainer.job, PersistentDataType.INTEGER);
        branch = pdc.get(DataContainer.branch, PersistentDataType.INTEGER);
        race = pdc.get(DataContainer.race, PersistentDataType.INTEGER);


        money = pdc.get(DataContainer.money, PersistentDataType.INTEGER);
        jinCount = pdc.get(DataContainer.JinCount, PersistentDataType.INTEGER);
        muCount = pdc.get(DataContainer.MuCount, PersistentDataType.INTEGER);
        shuiCount = pdc.get(DataContainer.ShuiCount, PersistentDataType.INTEGER);
        huoCount = pdc.get(DataContainer.HuoCount, PersistentDataType.INTEGER);
        tuCount = pdc.get(DataContainer.TuCount, PersistentDataType.INTEGER);
        refinedJinCount = pdc.get(DataContainer.RefinedJinCount, PersistentDataType.INTEGER);
        refinedMuCount = pdc.get(DataContainer.RefinedMuCount, PersistentDataType.INTEGER);
        refinedShuiCount = pdc.get(DataContainer.RefinedShuiCount, PersistentDataType.INTEGER);
        refinedHuoCount = pdc.get(DataContainer.RefinedHuoCount, PersistentDataType.INTEGER);
        refinedTuCount = pdc.get(DataContainer.RefinedTuCount, PersistentDataType.INTEGER);
        concentratedJinCount = pdc.get(DataContainer.ConcentratedJinCount, PersistentDataType.INTEGER);
        concentratedMuCount = pdc.get(DataContainer.ConcentratedMuCount, PersistentDataType.INTEGER);
        concentratedShuiCount = pdc.get(DataContainer.ConcentratedShuiCount, PersistentDataType.INTEGER);
        concentratedHuoCount = pdc.get(DataContainer.ConcentratedHuoCount, PersistentDataType.INTEGER);
        concentratedTuCount = pdc.get(DataContainer.ConcentratedTuCount, PersistentDataType.INTEGER);


        dumian_score = pdc.get(DataContainer.dumian, PersistentDataType.DOUBLE);
        huomian_score = pdc.get(DataContainer.huomian, PersistentDataType.DOUBLE);
        bingmian_score = pdc.get(DataContainer.bingmian, PersistentDataType.DOUBLE);
        jianmian_score = pdc.get(DataContainer.jianmian, PersistentDataType.DOUBLE);
        shuailuomian_score = pdc.get(DataContainer.shuailuomian, PersistentDataType.DOUBLE);
        sanchajimian_score = pdc.get(DataContainer.sanchajimian, PersistentDataType.DOUBLE);


        String slot8Id = pdc.get(DataContainer.slot8, PersistentDataType.STRING);
        String eSlot0Id = pdc.get(DataContainer.eslot0, PersistentDataType.STRING);
        String eSlot1Id = pdc.get(DataContainer.eslot1, PersistentDataType.STRING);
        String eSlot2Id = pdc.get(DataContainer.eslot2, PersistentDataType.STRING);
        String eSlot3Id = pdc.get(DataContainer.eslot3, PersistentDataType.STRING);
        String eSlot4Id = pdc.get(DataContainer.eslot4, PersistentDataType.STRING);
        String eSlot5Id = pdc.get(DataContainer.eslot5, PersistentDataType.STRING);
        String eSlot6Id = pdc.get(DataContainer.eslot6, PersistentDataType.STRING);
        String eSlot7Id = pdc.get(DataContainer.eslot7, PersistentDataType.STRING);

        String slot0ID = pdc.get(DataContainer.slot0, PersistentDataType.STRING);
        String slot1ID = pdc.get(DataContainer.slot1, PersistentDataType.STRING);
        String slot2ID = pdc.get(DataContainer.slot2, PersistentDataType.STRING);
        String slot36ID = pdc.get(DataContainer.slot36, PersistentDataType.STRING);
        String slot37ID = pdc.get(DataContainer.slot37, PersistentDataType.STRING);
        String slot38ID = pdc.get(DataContainer.slot38, PersistentDataType.STRING);
        String slot39ID = pdc.get(DataContainer.slot39, PersistentDataType.STRING);
        String slot40ID = pdc.get(DataContainer.slot40, PersistentDataType.STRING);


        //其它数据
        attack_mul = 1.0;

        baoji_add = 0.0;

        baojixiaoguo_add = 0.0;

        hujia_add = 0.0;

        pojia_add = 0.0;

        gedang_add = 0.0;


        shouhu_add = 0.0;


        fakang_add = 0.0;


        pofa_add = 0.0;

        renxing_add = 0.0;

        shengji_add = 0.0;

        cool_reduce_add = 0.0;

        real_cool = 1.0;

        updateAttack();
        updateBaoji();
        updateBaojixiaoguo();
        updateHujia();
        updatePojia();
        updateGedang();
        updateFakang();
        updatePofa();
        updateCoolReduce();
        updateRenxing();
        updateShengji();
        updateDumian();
        updateHuomian();
        updateBingmian();
        updateJianmian();
        updateShuailuomian();
        updateSanchajimian();

        //初始化slot
        slot8 = SlotBuilder.slot8Builder(slot8Id, real_cool);
        eSlot0 = SlotBuilder.enderChestSlotBuilder(eSlot0Id, real_cool);
        eSlot1 = SlotBuilder.enderChestSlotBuilder(eSlot1Id, real_cool);
        eSlot2 = SlotBuilder.enderChestSlotBuilder(eSlot2Id, real_cool);
        eSlot3 = SlotBuilder.enderChestSlotBuilder(eSlot3Id, real_cool);
        eSlot4 = SlotBuilder.enderChestSlotBuilder(eSlot4Id, real_cool);
        eSlot5 = SlotBuilder.enderChestSlotBuilder(eSlot5Id, real_cool);
        eSlot6 = SlotBuilder.enderChestSlotBuilder(eSlot6Id, real_cool);
        eSlot7 = SlotBuilder.enderChestSlotBuilder(eSlot7Id, real_cool);

        slot0 = SlotBuilder.slot0Builder(slot0ID, real_cool);
        slot1 = SlotBuilder.slot1Builder(slot1ID, real_cool);
        slot2 = SlotBuilder.slot2Builder(slot2ID, real_cool);
        slot36 = SlotBuilder.slot36Builder(slot36ID, real_cool);
        slot37 = SlotBuilder.slot37Builder(slot37ID, real_cool);
        slot38 = SlotBuilder.slot38Builder(slot38ID, real_cool);
        slot39 = SlotBuilder.slot39Builder(slot39ID, real_cool);
        slot40 = SlotBuilder.slot40Builder(slot40ID, real_cool);


        Act.initAll(this, slot8Id);
        Act.initAllEnderChest(this, eSlot0Id);
        Act.initAllEnderChest(this, eSlot1Id);
        Act.initAllEnderChest(this, eSlot2Id);
        Act.initAllEnderChest(this, eSlot3Id);
        Act.initAllEnderChest(this, eSlot4Id);
        Act.initAllEnderChest(this, eSlot5Id);
        Act.initAllEnderChest(this, eSlot6Id);
        Act.initAllEnderChest(this, eSlot7Id);


    }

    public String toString() {
        return "§6[命令系统]§aattack: §b" + attack
                + "  §abaoji: §b" + baoji
                + "  §abaojixiaoguo: §b" + baojixiaoguo + "\n"
                + "§6[命令系统]§ahujia: §b" + hujia
                + "  §apojia: §b" + pojia
                + "  §afakang: §b" + fakang + "\n"
                + "§6[命令系统]§apofa: §b" + pofa
                + "  §agedang: §b" + gedang
                + "  §ashouhu: §b" + shouhu + "\n"
                + "§6[命令系统]§arenxing: §b" + renxing
                + "  §ashengji: §b" + shengji
                + "  §acool_reduce: §b" + cool_reduce + "\n"
                + "§6[命令系统]§adumian: §b" + dumian
                + "  §ahuomian: §b" + huomian
                + "  §abingmian: §b" + bingmian + "\n"
                + "§6[命令系统]§ajianmian: §b" + jianmian
                + "  §ashuailuomian: §b" + shuailuomian
                + "  §asanchajimian: §b" + sanchajimian + "\n"
                + "§6[命令系统]§amoney: §b" + money
                + "  §ajinCount: §b" + jinCount
                + "  §amuCount: §b" + muCount + "\n"
                + "§6[命令系统]§ashuiCount: §b" + shuiCount
                + "  §ahuoCount: §b" + huoCount
                + "  §atuCount: §b" + tuCount + "\n"
                + "§6[命令系统]§arefinedJinCount: §b" + refinedJinCount
                + "  §arefinedMuCount: §b" + refinedMuCount
                + "  §arefinedShuiCount: §b" + refinedShuiCount + "\n"
                + "§6[命令系统]§arefinedHuoCount: §b" + refinedHuoCount
                + "  §arefinedTuCount: §b" + refinedTuCount
                + "  §aconcentratedJinCount: §b" + concentratedJinCount + "\n"
                + "§6[命令系统]§aconcentratedMuCount: §b" + concentratedMuCount
                + "  §aconcentratedShuiCount: §b" + concentratedShuiCount
                + "  §aconcentratedHuoCount: §b" + concentratedHuoCount + "\n"
                + "§6[命令系统]§aconcentratedTuCount: §b" + concentratedTuCount
                + "  §aslot0: §b" + slot0.id
                + "  §aslot1: §b" + slot1.id + "\n"
                + "§6[命令系统]§aslot2: §b" + slot2.id
                + "  §aslot36: §b" + slot36.id
                + "  §aslot37: §b" + slot37.id + "\n"
                + "§6[命令系统]§aslot38: §b" + slot38.id
                + "  §aslot39: §b" + slot39.id
                + "  §aslot40: §b" + slot40.id + "\n"
                + "§6[命令系统]§aslot8: §b" + slot8.id
                + "  §aeSlot0: §b" + eSlot0.id
                + "  §aeSlot1: §b" + eSlot1.id + "\n"
                + "§6[命令系统]§aeSlot2: §b" + eSlot2.id
                + "  §aeSlot3: §b" + eSlot3.id
                + "  §aeSlot4: §b" + eSlot4.id + "\n"
                + "§6[命令系统]§aeSlot5: §b" + eSlot5.id
                + "  §aeSlot6: §b" + eSlot6.id
                + "  §aeSlot7: §b" + eSlot7.id + "\n";


    }

    public void updateAttack() {
        attack = Math.max(0.0, attack_score * attack_mul);
    }

    public void updateBaoji() {
        baoji = Math.max(0.0, baoji_score + baoji_add);
    }

    public void updateBaojixiaoguo() {
        baojixiaoguo = Math.max(0.0, baojixiaoguo_score + baojixiaoguo_add);
    }

    public void updateHujia() {
        hujia = Math.max(0.0, hujia_score + hujia_add);
    }

    public void updateFakang() {
        fakang = Math.max(0.0, fakang_score + fakang_add);
    }

    public void updateShouhu() {
        shouhu = Math.max(0.0, shouhu_score + shouhu_add);
    }

    public void updatePofa() {
        pofa = Math.max(0.0, pofa_score + pofa_add);
    }

    public void updatePojia() {
        pojia = Math.max(0.0, pojia_score + pojia_add);
    }

    public void updateGedang() {
        gedang = Math.max(0.0, gedang_score + gedang_add);
    }


    public void updateCoolReduce() {
        cool_reduce = Math.max(0.0, cool_reduce_score + cool_reduce_add);
        cool_reduce = Math.min(0.5, cool_reduce);
        cool_reduce += cool_reduce_unlimited;
        real_cool = 1 - cool_reduce;
    }

    public void updateShengji() {
        shengji = Math.max(0.0, shengji_score + shengji_add);
    }

    public void updateRenxing() {
        renxing = Math.max(0.0, renxing_score + renxing_add);
        renxing = Math.min(0.8, renxing);
    }

    public void updateDumian() {
        dumian = Math.min(0.8, dumian_score);
    }

    public void updateHuomian() {
        huomian = Math.min(0.8, huomian_score);
    }

    public void updateBingmian() {
        bingmian = Math.min(0.8, bingmian_score);
    }

    public void updateJianmian() {
        jianmian = Math.min(0.8, jianmian_score);
    }

    public void updateShuailuomian() {
        shuailuomian = Math.min(0.8, shuailuomian_score);
    }

    public void updateSanchajimian() {
        sanchajimian = Math.min(0.8, sanchajimian_score);
    }

    public void setDumianScore(double value) {
        dumian_score = value;
        updateDumian();
    }

    public void setHuomianScore(double value) {
        huomian_score = value;
        updateHuomian();
    }

    public void setBingmianScore(double value) {
        bingmian_score = value;
        updateBingmian();
    }

    public void setJianmianScore(double value) {
        jianmian_score = value;
        updateJianmian();
    }

    public void setShuailuomianScore(double value) {
        shuailuomian_score = value;
        updateShuailuomian();
    }

    public void setSanchajimianScore(double value) {
        sanchajimian_score = value;
        updateSanchajimian();
    }


    public void setAttackScore(double value) {
        attack_score = value;
        updateAttack();
    }

    public void setBaojiScore(double value) {
        baoji_score = value;
        updateBaoji();
    }

    public void setBaoJiXiaoGuoScore(double value) {
        baojixiaoguo_score = value;
        updateBaojixiaoguo();
    }

    public void setHujiaScore(double value) {
        hujia_score = value;
        updateHujia();
    }

    public void setPojiaScore(double value) {
        pojia_score = value;
        updatePojia();
    }

    public void setGedangScore(double value) {
        gedang_score = value;
        updateGedang();
    }

    public void setShouhuScore(double value) {
        shouhu_score = value;
        updateShouhu();
    }

    public void setFakangScore(double value) {
        fakang_score = value;
        updateFakang();
    }

    public void setPofaScore(double value) {
        pofa_score = value;
        updatePofa();
    }

    public void setCoolReduceScore(double value) {
        cool_reduce_score = value;
        updateCoolReduce();
    }

    public void setShengjiScore(double value) {
        shengji_score = value;
        updateShengji();
    }

    public void setRenxingScore(double value) {
        renxing_score = value;
        updateRenxing();
    }

    public void updateAttackMul(double value) {
        attack_mul += value;
        updateAttack();
    }

    public void updateBaojiAdd(double value) {
        baoji_add += value;
        updateBaoji();
    }

    public void updateBaojixiaoguoAdd(double value) {
        baojixiaoguo_add += value;
        updateBaojixiaoguo();
    }

    public void updateHujiaAdd(double value) {
        hujia_add += value;
        updateHujia();
    }

    public void updatePojiaAdd(double value) {
        pojia_add += value;
        updatePojia();
    }

    public void updateGedangAdd(double value) {
        gedang_add += value;
        updateGedang();
    }

    public void updateShouhuAdd(double value) {
        shouhu_add += value;
        updateShouhu();
    }

    public void updateFakangAdd(double value) {
        fakang_add += value;
        updateFakang();
    }

    public void updatePofaAdd(double value) {
        pofa_add += value;
        updatePofa();
    }

    public void updateCoolReduceAdd(double value) {
        cool_reduce_add += value;
        updateCoolReduce();
    }


    public void updateShengjiAdd(double value) {
        shengji_add += value;
        updateShengji();
    }

    public void updateRenxingAdd(double value) {
        renxing_add += value;
        updateRenxing();
    }

    public void setCoolReduceUnlimited(double value) {
        cool_reduce_unlimited = value;
        updateCoolReduce();
    }


}