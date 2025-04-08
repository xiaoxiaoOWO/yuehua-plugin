package com.xiaoxiaoowo.yuehua.attribute.attributes.vanilla;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlotGroup;
import org.bukkit.persistence.PersistentDataContainer;

public final class Jump implements MyAttribute {
    public double jump;
    public NamespacedKey namespacedKey;

    public static final NamespacedKey touJump = new NamespacedKey("yh", "toujump");
    public static final NamespacedKey xiongJump = new NamespacedKey("yh", "xiongjump");
    public static final NamespacedKey tuiJump = new NamespacedKey("yh", "tuijump");
    public static final NamespacedKey xieJump = new NamespacedKey("yh", "xiejump");
    public static final NamespacedKey weaponJump = new NamespacedKey("yh", "weaponjump");
    public static final NamespacedKey biweaponJump = new NamespacedKey("yh", "biweaponjump");
    public static final NamespacedKey yiqiJump = new NamespacedKey("yh", "yiqijump");
    public static final NamespacedKey shipinJump = new NamespacedKey("yh", "shipinjump");
    public static final NamespacedKey xiantianJump = new NamespacedKey("yh", "xiantianjump");

    public static final NamespacedKey canNotJump = new NamespacedKey("yh", "cannotjump");


    public Jump(double jump, NamespacedKey namespacedKey) {
        this.jump = jump;
        this.namespacedKey = namespacedKey;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.JUMP_STRENGTH);
        attributeInstance.addModifier(
                new AttributeModifier(
                        namespacedKey,
                        jump,
                        AttributeModifier.Operation.ADD_SCALAR,
                        EquipmentSlotGroup.ANY));
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.JUMP_STRENGTH);
        attributeInstance.removeModifier(namespacedKey);
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
