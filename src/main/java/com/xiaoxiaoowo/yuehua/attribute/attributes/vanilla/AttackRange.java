package com.xiaoxiaoowo.yuehua.attribute.attributes.vanilla;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;

public final class AttackRange implements MyAttribute {
    public double attackrange;

    public AttackRange(double attackrange) {
        this.attackrange = attackrange;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.PLAYER_ENTITY_INTERACTION_RANGE);
        double base = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(base + attackrange);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.PLAYER_ENTITY_INTERACTION_RANGE);
        double base = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(base - attackrange);
    }

    @Override
    public String fromId() {
        if (attackrange < 0) {
            return "§f攻击距离 -§c" + String.format("%.1f", Math.abs(attackrange)) + "    ";
        } else {
            return "§f攻击距离 +§b" + String.format("%.1f", attackrange) + "    ";
        }
    }

}
