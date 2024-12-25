package com.xiaoxiaoowo.yuehua.data;


import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.system.Init;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.Transfer;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.HashSet;
import java.util.Set;

public final class GongData extends Data {
    //36鞋，37裤，38甲，39头

    public Set<String> hitObservers;

    public double arrow;
    public double arrow_add;
    public double arrow_score;
    public double arrow_mul;

    //不消耗等价于射速加快
    public double arrow_no_cost;
    //穿透等价于初速度增大
    public double arrow_pierce;

    public int arrow_count_max;
    //不严格持久化数据
    public int arrow_count;
    //拉弓时间
    public long time_pulling;
    public long time_charging;

    public boolean isBow;
    public boolean canShoot;

    public long noAct;


    public GongData(Player player) {
        super(player);
        hitObservers = new HashSet<>(10);

        PersistentDataContainer pck = player.getPersistentDataContainer();
        //防止未激活任何装备导致没有属性设置
        arrow_score = pck.get(DataContainer.arrow, PersistentDataType.DOUBLE);
        arrow_count_max = pck.get(DataContainer.arrow_count_max, PersistentDataType.INTEGER);
        arrow_no_cost = pck.get(DataContainer.arrow_no_cost, PersistentDataType.DOUBLE);
        arrow_pierce = pck.get(DataContainer.arrow_pierce, PersistentDataType.DOUBLE);
        isBow = pck.get(DataContainer.is_bow, PersistentDataType.BOOLEAN);

        //非激活的常驻数据
        arrow_count = pck.get(DataContainer.arrow_count, PersistentDataType.INTEGER);
        time_charging = pck.get(DataContainer.time_charging, PersistentDataType.LONG);
        //时效数据
        arrow_add = 0.0;
        arrow_mul = 1.0;

        time_pulling = GetEntity.world.getGameTime();
        canShoot = true;
        noAct = GetEntity.world.getGameTime();

        updateArrow();
        Init.initGong(this, slot0.id);
        Init.initGong(this, slot1.id);
        Init.initGong(this, slot2.id);
        Init.initGong(this, slot36.id);
        Init.initGong(this, slot37.id);
        Init.initGong(this, slot38.id);
        Init.initGong(this, slot39.id);
        Init.initGong(this, slot40.id);


    }

    public String toString() {
        return super.toString()
                + "§6[命令系统]§aarrow: §b" + arrow
                + "  §aarrow_score: §b" + arrow_score
                + "  §aarrow_mul: §b" + arrow_mul + "\n"
                + "§6[命令系统]§aarrow_no_cost: §b" + arrow_no_cost
                + "  §aarrow_pierce: §b" + arrow_pierce
                + "  §aarrow_count_max: §b" + arrow_count_max + "\n"
                + "§6[命令系统]§aarrow_count: §b" + arrow_count;

    }

    public void updateArrow() {
        arrow = Math.max(0.0, (arrow_score + arrow_add) * arrow_mul);
        Transfer.transferAttribute(this);
    }

    public void setArrowScore(double value) {
        arrow_score = value;
        updateArrow();
    }

    public void updateArrowAdd(double value) {
        arrow_add += value;
        updateArrow();
    }

    public void updateArrowMul(double value) {
        arrow_mul += value;
        updateArrow();
    }

}
