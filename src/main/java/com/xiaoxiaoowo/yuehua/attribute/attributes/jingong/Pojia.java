package com.xiaoxiaoowo.yuehua.attribute.attributes.jingong;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class Pojia implements MyAttribute {
    public double pojia;

    public Pojia(double pojia) {
        this.pojia = pojia;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.pojia, PersistentDataType.DOUBLE);
        double after = base + pojia;
        pdc.set(DataContainer.pojia,PersistentDataType.DOUBLE,after);
        data.setPojiaScore(after);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.pojia, PersistentDataType.DOUBLE);
        double after = base - pojia;
        pdc.set(DataContainer.pojia,PersistentDataType.DOUBLE,after);
        data.setPojiaScore(after);
    }

    @Override
    public String fromId() {
        if (pojia < 0) {
            return "§f破甲 -§c" + String.format("%.1f", Math.abs(pojia * 100))  + "    ";
        } else {
            return "§f破甲 +§b" + String.format("%.1f", pojia * 100) + "    ";
        }
    }
}
