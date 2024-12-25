package com.xiaoxiaoowo.yuehua.attribute.attributes.jingong;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class AttackMul implements MyAttribute {
    public double attack_mul;

    public AttackMul(double attack_mul) {
        this.attack_mul = attack_mul;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        double mulBefore = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
        double mulAfter = mulBefore + attack_mul;
        pdc.set(DataContainer.attack_mul, PersistentDataType.DOUBLE, mulAfter);

        double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);

        double finalValue = baseValue * mulAfter;

        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
        data.setAttackScore(finalValue);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        double mulBefore = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
        double mulAfter = mulBefore - attack_mul;
        pdc.set(DataContainer.attack_mul, PersistentDataType.DOUBLE, mulAfter);

        double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);

        double finalValue = baseValue * mulAfter;

        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
        data.setAttackScore(finalValue);
    }

    @Override
    public String fromId() {
        if (attack_mul < 0) {
            return "§f近战伤害 -§c" + String.format("%.1f", Math.abs(attack_mul * 100)) + "%" + "    ";
        } else {
            return "§f近战伤害 +§b" + String.format("%.1f", attack_mul * 100) + "%" + "    ";
        }
    }
}
