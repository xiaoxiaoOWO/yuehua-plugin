package com.xiaoxiaoowo.yuehua.attribute.attributes.jingong;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class ZhenfaMul implements MyAttribute {
    public double zhenfa_mul;

    public ZhenfaMul(double zhenfa_mul) {
        this.zhenfa_mul = zhenfa_mul;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        double mulBefore = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
        double mulAfter = mulBefore + zhenfa_mul;
        pdc.set(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE, mulAfter);

        double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);

        double finalValue = baseValue * mulAfter;

        pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);

        DanData danData = (DanData) data;

        danData.setZhenfaScore(finalValue);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        double mulBefore = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
        double mulAfter = mulBefore - zhenfa_mul;
        pdc.set(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE, mulAfter);

        double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);

        double finalValue = baseValue * mulAfter;

        pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
        DanData danData = (DanData) data;

        danData.setZhenfaScore(finalValue);
    }

    @Override
    public String fromId() {
        if (zhenfa_mul < 0) {
            return "§f阵法强度 -§c" + String.format("%.1f", Math.abs(zhenfa_mul * 100)) + "%" + "    ";
        } else {
            return "§f阵法强度 +§b" + String.format("%.1f", zhenfa_mul * 100) + "%" + "    ";
        }
    }
}
