package com.xiaoxiaoowo.yuehua.attribute.attributes.jingong;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class JinGongMul implements MyAttribute {
    public double jingong_mul;

    public JinGongMul(double mul) {
        this.jingong_mul = mul;
    }


    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        switch (data.job) {
            case 1 -> {
                double mulBefore = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
                double mulAfter = mulBefore + jingong_mul;
                pdc.set(DataContainer.attack_mul, PersistentDataType.DOUBLE, mulAfter);

                double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);

                double finalValue = baseValue * mulAfter;

                pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
                data.setAttackScore(finalValue);
            }

            case 2 -> {
                double mulBefore = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
                double mulAfter = mulBefore + jingong_mul;
                pdc.set(DataContainer.arrow_mul, PersistentDataType.DOUBLE, mulAfter);

                double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);

                double finalValue = baseValue * mulAfter;

                pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
                GongData gongData = (GongData) data;
                gongData.setArrowScore(finalValue);
            }

            case 3 -> {
                double mulBefore = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
                double mulAfter = mulBefore + jingong_mul;
                pdc.set(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE, mulAfter);

                double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);

                double finalValue = baseValue * mulAfter;

                pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
                data.setAttackScore(finalValue);
            }
        }
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        switch (data.job) {
            case 1 -> {
                double mulBefore = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
                double mulAfter = mulBefore - jingong_mul;
                pdc.set(DataContainer.attack_mul, PersistentDataType.DOUBLE, mulAfter);

                double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);

                double finalValue = baseValue * mulAfter;

                pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
                data.setAttackScore(finalValue);
            }

            case 2 -> {
                double mulBefore = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
                double mulAfter = mulBefore - jingong_mul;
                pdc.set(DataContainer.arrow_mul, PersistentDataType.DOUBLE, mulAfter);

                double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);

                double finalValue = baseValue * mulAfter;

                pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
                GongData gongData = (GongData) data;
                gongData.setArrowScore(finalValue);
            }

            case 3 -> {
                double mulBefore = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
                double mulAfter = mulBefore - jingong_mul;
                pdc.set(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE, mulAfter);

                double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);

                double finalValue = baseValue * mulAfter;

                pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
                data.setAttackScore(finalValue);
            }
        }
    }

    @Override
    public String fromId() {
        if (jingong_mul < 0) {
            return "§f进攻属性 -§c" + String.format("%.1f", Math.abs(jingong_mul * 100)) + "%" + "    ";
        } else {
            return "§f进攻属性 +§b" + String.format("%.1f", jingong_mul * 100) + "%" + "    ";
        }

    }
}
