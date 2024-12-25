package com.xiaoxiaoowo.yuehua.attribute.attributes.jingong;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class AttackAdd implements MyAttribute {

    public double attack_add;

    public AttackAdd(double attack_add) {
        this.attack_add = attack_add;
    }

    @Override
    public void act(Data data,PersistentDataContainer pdc) {
        double baseBefore = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
        double baseAfter = baseBefore + attack_add;
        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseAfter);

        double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);

        double finalValue = mulValue * baseAfter;

        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
        data.setAttackScore(finalValue);
    }

    @Override
    public void deAct(Data data,PersistentDataContainer pdc) {
        double baseBefore = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
        double baseAfter = baseBefore - attack_add;
        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseAfter);

        double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);

        double finalValue = mulValue * baseAfter;

        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
        data.setAttackScore(finalValue);
    }

    @Override
    public String fromId() {
        if (attack_add < 0) {
            return "§f近战伤害 -§c" + String.format("%.1f", Math.abs(attack_add)) + "    ";
        } else {
            return "§f近战伤害 +§b" + String.format("%.1f", attack_add) + "    ";
        }
    }
}
