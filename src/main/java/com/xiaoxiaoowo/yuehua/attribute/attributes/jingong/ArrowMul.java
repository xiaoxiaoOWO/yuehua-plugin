package com.xiaoxiaoowo.yuehua.attribute.attributes.jingong;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class ArrowMul implements MyAttribute {
    public double arrow_mul;

    public ArrowMul(double arrow_mul) {
        this.arrow_mul = arrow_mul;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        double mulBefore = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
        double mulAfter = mulBefore + arrow_mul;
        pdc.set(DataContainer.arrow_mul, PersistentDataType.DOUBLE, mulAfter);

        double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);

        double finalValue = baseValue * mulAfter;

        pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
        GongData gongData = (GongData) data;
        gongData.setArrowScore(finalValue);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        double mulBefore = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
        double mulAfter = mulBefore - arrow_mul;
        pdc.set(DataContainer.arrow_mul, PersistentDataType.DOUBLE, mulAfter);

        double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);

        double finalValue = baseValue * mulAfter;

        pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
        GongData gongData = (GongData) data;
        gongData.setArrowScore(finalValue);
    }

    @Override
    public String fromId() {
        if (arrow_mul < 0) {
            return "§f箭矢强度 -§c" + String.format("%.1f", Math.abs(arrow_mul * 100)) + "%" + "    ";
        } else {
            return "§f箭矢强度 +§b" + String.format("%.1f", arrow_mul * 100) + "%" + "    ";
        }

    }
}
