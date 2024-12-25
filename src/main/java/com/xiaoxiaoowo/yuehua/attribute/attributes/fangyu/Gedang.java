package com.xiaoxiaoowo.yuehua.attribute.attributes.fangyu;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class Gedang implements MyAttribute {
    public double gedang;

    public Gedang(double gedang) {
        this.gedang = gedang;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
        double after = base + gedang ;
        pdc.set(DataContainer.gedang,PersistentDataType.DOUBLE,after);
        data.setGedangScore(after);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
        double after = base - gedang ;
        pdc.set(DataContainer.gedang,PersistentDataType.DOUBLE,after);
        data.setGedangScore(after);
    }

    @Override
    public String fromId() {
        if (gedang < 0) {
            return "§f格挡 -§c" + String.format("%.1f", Math.abs(gedang))  + "    ";
        } else {
            return "§f格挡 +§b" + String.format("%.1f", gedang) + "    ";
        }
    }
}
