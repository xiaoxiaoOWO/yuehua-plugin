package com.xiaoxiaoowo.yuehua.attribute.attributes.fangyu;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class ShouHu implements MyAttribute {
    public double shouhu;

    public ShouHu(double shouhu) {
        this.shouhu = shouhu;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.shouhu, PersistentDataType.DOUBLE);
        double after = base + shouhu;
        pdc.set(DataContainer.shouhu,PersistentDataType.DOUBLE,after);
        data.setShouhuScore(after);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.shouhu, PersistentDataType.DOUBLE);
        double after = base - shouhu;
        pdc.set(DataContainer.shouhu,PersistentDataType.DOUBLE,after);
        data.setShouhuScore(after);
    }

    @Override
    public String fromId() {
        if (shouhu < 0) {
            return "§f守护 -§c" + String.format("%.1f", Math.abs(shouhu))  + "    ";
        } else {
            return "§f守护 +§b" + String.format("%.1f", shouhu) + "    ";
        }
    }
}
