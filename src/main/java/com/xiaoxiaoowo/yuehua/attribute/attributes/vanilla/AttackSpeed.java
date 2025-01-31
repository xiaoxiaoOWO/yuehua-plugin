package com.xiaoxiaoowo.yuehua.attribute.attributes.vanilla;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;

public final class AttackSpeed implements MyAttribute {
    public double attackSpeed;

    public AttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.ATTACK_SPEED);
        double base = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(base + attackSpeed);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.ATTACK_SPEED);
        double base = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(base - attackSpeed);
    }

    @Override
    public String fromId() {
        if(attackSpeed < 0){
            return "§f攻击速度 -§c" + String.format("%.1f", Math.abs(attackSpeed)) + "    ";
        }else {
            return "§f攻击速度 +§b" + String.format("%.1f", attackSpeed) + "    ";
        }
    }
}
