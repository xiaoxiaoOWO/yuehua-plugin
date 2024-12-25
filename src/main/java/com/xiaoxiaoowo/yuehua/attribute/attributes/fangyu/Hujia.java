package com.xiaoxiaoowo.yuehua.attribute.attributes.fangyu;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class Hujia implements MyAttribute {
    public double hujia;

    public Hujia(double hujia) {
        this.hujia = hujia;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        double after = base + hujia;
        pdc.set(DataContainer.hujia,PersistentDataType.DOUBLE,after);
        data.setHujiaScore(after);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        double after = base - hujia;
        pdc.set(DataContainer.hujia,PersistentDataType.DOUBLE,after);
        data.setHujiaScore(after);
    }

    @Override
    public String fromId() {
        if (hujia < 0) {
            return "§f护甲 -§c" + String.format("%.1f", Math.abs(hujia * 100))  + "    ";
        } else {
            return "§f护甲 +§b" + String.format("%.1f", hujia * 100) + "    ";
        }
    }
}
