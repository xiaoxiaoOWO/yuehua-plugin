package com.xiaoxiaoowo.yuehua.attribute.attributes.jingong;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class JingongAdd implements MyAttribute {
    public double jingong;

    public JingongAdd(double jingong) {
        this.jingong = jingong;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        switch (data.job){
            case 1 -> {
                double baseBefore = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
                double baseAfter = baseBefore +  (3 * jingong);
                pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseAfter);

                double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);

                double finalValue = mulValue * baseAfter;

                pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
                data.setAttackScore(finalValue);
            }

            case 2 -> {
                double baseBefore = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
                double baseAfter = baseBefore + jingong;
                pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseAfter);

                double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);

                double finalValue = mulValue * baseAfter;

                pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
                GongData gongData = (GongData) data;
                gongData.setArrowScore(finalValue);
            }

            case 3 -> {
                double baseBefore = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
                double baseAfter = baseBefore + jingong;
                pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseAfter);

                double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);

                double finalValue = mulValue * baseAfter;

                pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
                DanData danData = (DanData) data;
                danData.setZhenfaScore(finalValue);
            }
        }
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        switch (data.job){
            case 1 -> {
                double baseBefore = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
                double baseAfter = baseBefore - (3 * jingong);
                pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseAfter);

                double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);

                double finalValue = mulValue * baseAfter;

                pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
                data.setAttackScore(finalValue);
            }

            case 2 -> {
                double baseBefore = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
                double baseAfter = baseBefore - jingong;
                pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseAfter);

                double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);

                double finalValue = mulValue * baseAfter;

                pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
                GongData gongData = (GongData) data;
                gongData.setArrowScore(finalValue);
            }

            case 3 -> {
                double baseBefore = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
                double baseAfter = baseBefore - jingong;
                pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseAfter);

                double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);

                double finalValue = mulValue * baseAfter;

                pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
                DanData danData = (DanData) data;
                danData.setZhenfaScore(finalValue);
            }
        }
    }

    @Override
    public String fromId() {
        if (jingong < 0) {
            return "§f进攻属性 -§c" + String.format("%.1f", Math.abs(jingong)) + "    ";
        } else {
            return "§f进攻属性 +§b" + String.format("%.1f", jingong)  + "    ";
        }
    }
}
