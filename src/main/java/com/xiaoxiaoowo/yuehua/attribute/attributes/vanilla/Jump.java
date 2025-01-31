package com.xiaoxiaoowo.yuehua.attribute.attributes.vanilla;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;

public final class Jump implements MyAttribute {
    public double jump;

    public static final NamespacedKey canNotJump = new NamespacedKey("yh", "cannotjump");


    public Jump(double jump) {
        this.jump = jump;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.JUMP_STRENGTH);
        double base = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(base + jump);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.JUMP_STRENGTH);
        double base = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(base - jump);
    }

    @Override
    public String fromId() {
        if (jump < 0) {
            return "§f跳跃力 -§c" + String.format("%.1f", Math.abs(jump * 100)) + "    ";
        } else {
            return "§f跳跃力 +§b" + String.format("%.1f", jump * 100) + "    ";
        }
    }
}
