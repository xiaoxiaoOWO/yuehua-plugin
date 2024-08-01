package com.xiaoxiaoowo.yuehua.data;


import com.xiaoxiaoowo.yuehua.system.Act;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.HashSet;
import java.util.Set;

public final class GongData extends Data {
    //36鞋，37裤，38甲，39头

    public Set<String> hitObservers;

    public double arrow;
    public double arrow_score;
    public double arrow_mul;
    public double arrow_no_cost;
    public double arrow_pierce;

    public int arrow_count_max;
    //不严格持久化数据
    public int arrow_count;
    //拉弓时间
    public long time_pulling;
    public long time_charging;

    //弓弩ready
    public boolean isBow;
    public boolean canShoot;

    public boolean readyBow;
    public boolean readyCrossBow;


    public GongData(Player player) {
        super(player);


        hitObservers = new HashSet<>(10);

        PersistentDataContainer pck = player.getPersistentDataContainer();
        arrow_score = pck.get(DataContainer.arrow, PersistentDataType.DOUBLE);
        arrow_count_max = pck.get(DataContainer.arrow_count_max, PersistentDataType.INTEGER);
        arrow_count = pck.get(DataContainer.arrow_count, PersistentDataType.INTEGER);
        arrow_no_cost = pck.get(DataContainer.arrow_no_cost, PersistentDataType.DOUBLE);
        arrow_pierce = pck.get(DataContainer.arrow_pierce, PersistentDataType.DOUBLE);
        arrow = arrow_score;
        arrow_mul = 1.0;

        time_pulling = GetEntity.world.getGameTime();
        time_charging = pck.get(DataContainer.time_charging, PersistentDataType.LONG);
        isBow = pck.get(DataContainer.is_bow, PersistentDataType.BOOLEAN);

        canShoot = true;
        readyBow = true;
        readyCrossBow = true;

        Act.initGong(this, slot0.id);
        Act.initGong(this, slot1.id);
        Act.initGong(this, slot2.id);
        Act.initGong(this, slot36.id);
        Act.initGong(this, slot37.id);
        Act.initGong(this, slot38.id);
        Act.initGong(this, slot39.id);
        Act.initGong(this, slot40.id);


        updateArrow();
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
        arrow = Math.max(0.0, arrow_score * arrow_mul);
    }

    public void setArrowScore(double value) {
        arrow_score = value;
        updateArrow();
    }

    public void updateArrowMul(double value) {
        arrow_mul += value;
        updateArrow();
    }

}
