package com.xiaoxiaoowo.yuehua.attribute.attributes.jingong;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class ZhenfaAdd implements MyAttribute {
    public double zhenfa_add;

    public ZhenfaAdd(double zhenfa_add) {
        this.zhenfa_add = zhenfa_add;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        double baseBefore = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
        double baseAfter = baseBefore + zhenfa_add;
        pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseAfter);

        double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);

        double finalValue = mulValue * baseAfter;

        pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
        DanData danData = (DanData) data;
        danData.setZhenfaScore(finalValue);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        double baseBefore = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
        double baseAfter = baseBefore - zhenfa_add;
        pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseAfter);

        double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);

        double finalValue = mulValue * baseAfter;

        pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
        DanData danData = (DanData) data;
        danData.setZhenfaScore(finalValue);

    }

    @Override
    public String fromId() {
        if (zhenfa_add < 0) {
            return "§f阵法强度 -§c" + String.format("%.1f", Math.abs(zhenfa_add))  + "    ";
        } else {
            return "§f阵法强度 +§b" + String.format("%.1f", zhenfa_add) + "    ";
        }
    }
}
