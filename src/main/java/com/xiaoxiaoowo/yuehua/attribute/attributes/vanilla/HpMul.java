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


public final class HpMul implements MyAttribute {
    public static final NamespacedKey touHp = new NamespacedKey("yh", "touhp");
    public static final NamespacedKey xiongHp = new NamespacedKey("yh", "xionghp");
    public static final NamespacedKey tuiHp = new NamespacedKey("yh", "tuihp");
    public static final NamespacedKey xieHp = new NamespacedKey("yh", "xiehp");
    public static final NamespacedKey weaponHp = new NamespacedKey("yh", "weaponhp");
    public static final NamespacedKey biweaponHp = new NamespacedKey("yh", "biweaponhp");
    public static final NamespacedKey yiqiHp = new NamespacedKey("yh", "yiqihp");
    public static final NamespacedKey shipinHp = new NamespacedKey("yh", "shipinhp");
    public static final NamespacedKey xiantainHp = new NamespacedKey("yh", "xiantainhp");


    public double hp_mul;
    public NamespacedKey namespacedKey;

    public HpMul(double hp_mul, NamespacedKey namespacedKey) {
        this.hp_mul = hp_mul;
        this.namespacedKey = namespacedKey;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        attributeInstance.addModifier(
                new AttributeModifier(
                        namespacedKey,
                        hp_mul,
                        AttributeModifier.Operation.ADD_SCALAR,
                        EquipmentSlotGroup.ANY
                )
        );

    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        attributeInstance.removeModifier(namespacedKey);
    }

    @Override
    public String fromId() {
        if (hp_mul < 0) {
            return "§f最大生命 -§c" + String.format("%.1f", Math.abs(hp_mul * 100)) + "%" + "    ";
        } else {
            return "§f最大生命 +§b" + String.format("%.1f", hp_mul * 100)+ "%" + "    ";
        }
    }
}
