package com.xiaoxiaoowo.yuehua.data;

import com.xiaoxiaoowo.yuehua.data.slot.SlotBuilder;
import com.xiaoxiaoowo.yuehua.data.slot.SlotWithOneActiveSkill;
import com.xiaoxiaoowo.yuehua.system.Act;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.HashSet;
import java.util.Set;


public final class DanData extends Data {
    //36鞋，37裤，38甲，39头

    public Set<String> zhenfaObservers;

    public long cd_jin;
    public long cd_mu;
    public long cd_shui;
    public long cd_huo;
    public long cd_tu;


    public double zhenfa;
    public double zhenfa_score;
    public double zhenfa_mul;
    public double noCost1;
    public double noCost2;
    public double noCost3;

    public SlotWithOneActiveSkill slot3;
    public SlotWithOneActiveSkill slot4;
    public SlotWithOneActiveSkill slot5;

    public long lastThrownPotionTime;


    public DanData(Player player) {
        super(player);
        zhenfaObservers = new HashSet<>(5);

        long time = GetEntity.world.getGameTime();
        cd_jin = time + 20 * 30L;
        cd_mu = time + 20 * 30L;
        cd_shui = time + 20 * 30L;
        cd_huo = time + 20 * 30L;
        cd_tu = time + 20 * 30L;
        lastThrownPotionTime = time;

        PersistentDataContainer pck = player.getPersistentDataContainer();
        zhenfa_score = pck.get(DataContainer.zhenfa, PersistentDataType.DOUBLE);
        noCost1 = pck.get(DataContainer.no_cost_1, PersistentDataType.DOUBLE);
        noCost2 = pck.get(DataContainer.no_cost_2, PersistentDataType.DOUBLE);
        noCost3 = pck.get(DataContainer.no_cost_3, PersistentDataType.DOUBLE);
        String slot3ID = pck.get(DataContainer.slot3, PersistentDataType.STRING);
        String slot4ID = pck.get(DataContainer.slot4, PersistentDataType.STRING);
        String slot5ID = pck.get(DataContainer.slot5, PersistentDataType.STRING);

        zhenfa = zhenfa_score;
        zhenfa_mul = 1.0;

        slot3 = SlotBuilder.slot3Builder(slot3ID, real_cool);
        slot4 = SlotBuilder.slot4Builder(slot4ID, real_cool);
        slot5 = SlotBuilder.slot5Builder(slot5ID, real_cool);

        Act.initDan(this, slot0.id);
        Act.initDan(this, slot1.id);
        Act.initDan(this, slot2.id);
        Act.initDan(this, slot3.id);
        Act.initDan(this, slot4.id);
        Act.initDan(this, slot5.id);
        Act.initDan(this, slot36.id);
        Act.initDan(this, slot37.id);
        Act.initDan(this, slot38.id);
        Act.initDan(this, slot39.id);
        Act.initDan(this, slot40.id);

        updateZhenfa();


    }

    public String toString() {
        return super.toString()
               + "§6[命令系统]§azhenfa: §b" + zhenfa
               + " §aslot0: §b" + slot0.id
               + " §aslot1: §b" + slot1.id + "\n"
               + "§6[命令系统]§aslot2: §b" + slot2.id
               + " §aslot3: §b" + slot3.id
               + " §aslot4: §b" + slot4.id + "\n"
               + "§6[命令系统]§aslot5: §b" + slot5.id
               + " §aslot36: §b" + slot36.id
               + " §aslot37: §b" + slot37.id + "\n"
               + "§6[命令系统]§aslot38: §b" + slot38.id
               + " §aslot39: §b" + slot39.id
               + " §aslot40: §b" + slot40.id;
    }

    public void updateZhenfa() {
        zhenfa = Math.max(0.0, zhenfa_score * zhenfa_mul);
    }

    public void updateNoCost1() {
        noCost1 = Math.min(0.9, noCost1);
    }

    public void updateNoCost2() {
        noCost2 = Math.min(0.9, noCost2);
    }

    public void updateNoCost3() {
        noCost3 = Math.min(0.9, noCost3);
    }

    public void setZhenfaScore(double value) {
        zhenfa_score = value;
        updateZhenfa();
    }

    public void updateZhenfaMul(double value) {
        zhenfa_mul += value;
        updateZhenfa();
    }

    public void setNoCost1(double value) {
        noCost1 = value;
        updateNoCost1();
    }

    public void setNoCost2(double value) {
        noCost2 = value;
        updateNoCost2();
    }


    public void setNoCost3(double value) {
        noCost3 = value;
        updateNoCost3();
    }



}
