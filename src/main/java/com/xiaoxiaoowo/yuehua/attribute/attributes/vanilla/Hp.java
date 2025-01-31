package com.xiaoxiaoowo.yuehua.attribute.attributes.vanilla;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;

public final class Hp implements MyAttribute {
    public double hp;

    public Hp(double hp) {
        this.hp = hp;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
        double base = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(base + hp);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
        double base = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(base - hp);
    }

    @Override
    public String fromId() {
        if (hp < 0) {
            return "§f最大生命 -§c" + String.format("%.1f", Math.abs(hp)) + "    ";
        } else {
            return "§f最大生命 +§b" + String.format("%.1f", hp) + "    ";
        }
    }
}
