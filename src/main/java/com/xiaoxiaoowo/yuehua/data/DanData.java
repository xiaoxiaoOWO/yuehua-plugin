package com.xiaoxiaoowo.yuehua.data;

import com.xiaoxiaoowo.yuehua.data.slot.SlotBuilder;
import com.xiaoxiaoowo.yuehua.data.slot.SlotWithOneActiveSkill;
import com.xiaoxiaoowo.yuehua.guis.dz.DuanZao;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.system.Init;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.Transfer;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.HashSet;
import java.util.Set;


public final class DanData extends Data {
    //36鞋，37裤，38甲，39头

    public Set<String> zhenfaObservers;

    public boolean noinforDan;

    public long cd_jin;
    public long cd_mu;
    public long cd_shui;
    public long cd_huo;
    public long cd_tu;


    public double zhenfa;
    public double zhenfa_score;
    public double zhenfa_add;
    public double zhenfa_mul;
    public double noCost1;
    public double noCost2;
    public double noCost3;

    public SlotWithOneActiveSkill slot3;
    public SlotWithOneActiveSkill slot4;
    public SlotWithOneActiveSkill slot5;

    public Inventory danlu;
    public int zhenfa_level;


    @SuppressWarnings("deprecation")
    public DanData(Player player) {
        super(player);
        zhenfaObservers = new HashSet<>(5);


        PersistentDataContainer pck = player.getPersistentDataContainer();
        noinforDan = pck.get(DataContainer.noInforDan, PersistentDataType.BOOLEAN);
        zhenfa_score = pck.get(DataContainer.zhenfa, PersistentDataType.DOUBLE);
        noCost1 = pck.get(DataContainer.no_cost_1, PersistentDataType.DOUBLE);
        noCost2 = pck.get(DataContainer.no_cost_2, PersistentDataType.DOUBLE);
        noCost3 = pck.get(DataContainer.no_cost_3, PersistentDataType.DOUBLE);
        String slot3ID = pck.get(DataContainer.slot3, PersistentDataType.STRING);
        String slot4ID = pck.get(DataContainer.slot4, PersistentDataType.STRING);
        String slot5ID = pck.get(DataContainer.slot5, PersistentDataType.STRING);


        cd_jin = pck.get(DataContainer.jinCd, PersistentDataType.LONG) + 20 * 2L;
        cd_mu = pck.get(DataContainer.muCd, PersistentDataType.LONG) + 20 * 10L;
        cd_shui = pck.get(DataContainer.shuiCd, PersistentDataType.LONG) + 20 * 10L;
        cd_huo = pck.get(DataContainer.huoCd, PersistentDataType.LONG) + 20 * 10L;
        cd_tu = pck.get(DataContainer.tuCd, PersistentDataType.LONG) + 20 * 10L;

        Scheduler.sync(() -> player.setCooldown(Material.SPLASH_POTION, 100));

        zhenfa_add = 0.0;
        zhenfa_mul = 1.0;
        zhenfa_level = 0;

        updateZhenfa();

        slot3 = SlotBuilder.slot3Builder(slot3ID, real_cool);
        slot4 = SlotBuilder.slot4Builder(slot4ID, real_cool);
        slot5 = SlotBuilder.slot5Builder(slot5ID, real_cool);

        Init.initDan(this, slot0.id);
        Init.initDan(this, slot1.id);
        Init.initDan(this, slot2.id);
        Init.initDan(this, slot3.id);
        Init.initDan(this, slot4.id);
        Init.initDan(this, slot5.id);
        Init.initDan(this, slot36.id);
        Init.initDan(this, slot37.id);
        Init.initDan(this, slot38.id);
        Init.initDan(this, slot39.id);
        Init.initDan(this, slot40.id);


        danlu = switch (slot40.id) {
            case "heiTieGuo" -> Bukkit.createInventory(player, 18, "§b黑铁锅");
            case "qinTongGuo" -> Bukkit.createInventory(player, 18, "§b青铜锅");
            case "lianDanLu" -> Bukkit.createInventory(player, 18, "§b炼丹炉");
            case "suoHunLu" -> Bukkit.createInventory(player, 18, "§b锁魂炉");
            case "qiShaDing" -> Bukkit.createInventory(player, 18, "§b七煞鼎");
            case "hunYuanShenDing" -> Bukkit.createInventory(player, 18, "§b混元神鼎");
            default -> null;
        };
        if (danlu != null) {
            danlu.setItem(17, DuanZao.HUOZHEZI);
        }


    }

    public String toString() {
        return super.toString()
                + "§6[命令系统]§azhenfa: §b" + zhenfa;
    }

    public void updateZhenfa() {
        zhenfa = Math.max(0.0, (zhenfa_score + zhenfa_add) * zhenfa_mul);
        Transfer.transferAttribute(this);
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

    public void updateZhenfaAdd(double value) {
        zhenfa_add += value;
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
