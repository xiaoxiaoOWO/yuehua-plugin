package com.xiaoxiaoowo.yuehua.attribute.attributes.fangyu;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class Renxing implements MyAttribute {
    public double renxing;

    public Renxing(double renxing) {
        this.renxing = renxing;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
        double after = base + renxing;
        pdc.set(DataContainer.renxing,PersistentDataType.DOUBLE,after);
        data.setRenxingScore(after);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
        double after = base - renxing;
        pdc.set(DataContainer.renxing,PersistentDataType.DOUBLE,after);
        data.setRenxingScore(after);
    }

    @Override
    public String fromId() {
        if (renxing < 0) {
            return "§f韧性 -§c" + String.format("%.1f", Math.abs(renxing * 100))  + "    ";
        } else {
            return "§f韧性 +§b" + String.format("%.1f", renxing * 100) + "    ";
        }
    }
}
