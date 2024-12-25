package com.xiaoxiaoowo.yuehua.attribute.attributes.vanilla;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;

public final class DingLi implements MyAttribute {
    public double dingli;

    public DingLi(double dingli)
    {
        this.dingli = dingli;
    }


    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE);
        double base = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(base + dingli);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE);
        double base = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(base - dingli);
    }

    @Override
    public String fromId() {
        if (dingli < 0) {
            return "§f定力 -§c" + String.format("%.1f", Math.abs(dingli * 100)) + "    ";
        } else {
            return "§f定力 +§b" + String.format("%.1f", dingli * 100) + "    ";
        }
    }
}
