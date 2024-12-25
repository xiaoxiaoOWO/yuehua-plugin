package com.xiaoxiaoowo.yuehua.attribute.attributes.fangyu;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class Shengji implements MyAttribute {
    public double shengji;

    public Shengji(double shengji) {
        this.shengji = shengji;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);
        double after = base + shengji;
        pdc.set(DataContainer.shengji,PersistentDataType.DOUBLE,after);
        data.setShengjiScore(after);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);
        double after = base - shengji;
        pdc.set(DataContainer.shengji,PersistentDataType.DOUBLE,after);
        data.setShengjiScore(after);
    }

    @Override
    public String fromId() {
        if (shengji < 0) {
            return "§f生机 -§c" + String.format("%.1f", Math.abs(shengji * 100))  + "    ";
        } else {
            return "§f生机 +§b" + String.format("%.1f", shengji * 100) + "    ";
        }
    }
}
