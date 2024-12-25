package com.xiaoxiaoowo.yuehua.attribute.attributes.jingong;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class ArrowAdd implements MyAttribute {
    public double arrow_add;

    public ArrowAdd(double arrow_add) {
        this.arrow_add = arrow_add;
    }


    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        double baseBefore = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
        double baseAfter = baseBefore + arrow_add;
        pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseAfter);

        double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);

        double finalValue = mulValue * baseAfter;

        pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
        GongData gongData = (GongData) data;
        gongData.setArrowScore(finalValue);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        double baseBefore = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
        double baseAfter = baseBefore - arrow_add;
        pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseAfter);

        double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);

        double finalValue = mulValue * baseAfter;

        pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
        GongData gongData = (GongData) data;
        gongData.setArrowScore(finalValue);
    }

    @Override
    public String fromId() {
        if (arrow_add < 0) {
            return "§f箭矢强度 -§c" + String.format("%.1f", Math.abs(arrow_add)) + "    ";
        } else {
            return "§f箭矢强度 +§b" + String.format("%.1f", arrow_add) + "    ";
        }
    }
}
