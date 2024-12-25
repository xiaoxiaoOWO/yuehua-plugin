package com.xiaoxiaoowo.yuehua.attribute.attributes.vanilla;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlotGroup;
import org.bukkit.persistence.PersistentDataContainer;

public final class Speed implements MyAttribute {

    public static final NamespacedKey touSpeed = new NamespacedKey("yh", "touspeed");
    public static final NamespacedKey xiongSpeed = new NamespacedKey("yh", "xiongspeed");
    public static final NamespacedKey tuiSpeed = new NamespacedKey("yh", "tuispeed");
    public static final NamespacedKey xieSpeed = new NamespacedKey("yh", "xiespeed");
    public static final NamespacedKey weaponSpeed = new NamespacedKey("yh", "weaponspeed");
    public static final NamespacedKey biweaponSpeed = new NamespacedKey("yh", "biweaponspeed");
    public static final NamespacedKey yiqiSpeed = new NamespacedKey("yh", "yiqispeed");
    public static final NamespacedKey shipinSpeed = new NamespacedKey("yh", "shipinspeed");
    public static final NamespacedKey xiantianSpeed = new NamespacedKey("yh", "xiantianspeed");

    public static final NamespacedKey canNotMove = new NamespacedKey("yh", "cannotmove");


    public double speed;
    public NamespacedKey namespacedKey;

    public Speed(double speed, NamespacedKey namespacedKey) {
        this.speed = speed;
        this.namespacedKey = namespacedKey;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED);
        attributeInstance.addModifier(
                new AttributeModifier(
                        namespacedKey,
                        speed,
                        AttributeModifier.Operation.ADD_SCALAR,
                        EquipmentSlotGroup.ANY
                )
        );
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED);
        attributeInstance.removeModifier(namespacedKey);
    }

    @Override
    public String fromId() {
        if (speed < 0) {
            return "§f移动速度 -§c" + String.format("%.1f", Math.abs(speed * 100)) + "%" + "    ";
        } else {
            return "§f移动速度 +§b" + String.format("%.1f", speed * 100) + "%" +"    ";
        }
    }
}
