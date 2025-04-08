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

public final class HpMulFinal implements MyAttribute {
    public static final NamespacedKey touHpFinal = new NamespacedKey("yh", "touhpfinal");
    public static final NamespacedKey xiongHpFinal = new NamespacedKey("yh", "xionghpfinal");
    public static final NamespacedKey tuiHpFinal = new NamespacedKey("yh", "tuihpfinal");
    public static final NamespacedKey xieHpFinal = new NamespacedKey("yh", "xiehpfinal");
    public static final NamespacedKey weaponHpFinal = new NamespacedKey("yh", "weaponhpfinal");
    public static final NamespacedKey biweaponHpFinal = new NamespacedKey("yh", "biweaponhpfinal");
    public static final NamespacedKey yiqiHpFinal = new NamespacedKey("yh", "yiqihpfinal");
    public static final NamespacedKey shipinHpFinal = new NamespacedKey("yh", "shipinhpfinal");
    public static final NamespacedKey xiantainHpFinal = new NamespacedKey("yh", "xiantainhpfinal");


    public double hpfinal_mul_final;
    public NamespacedKey namespacedKey;

    public HpMulFinal(double hpfinal_mul_final, NamespacedKey namespacedKey) {
        this.hpfinal_mul_final = hpfinal_mul_final;
        this.namespacedKey = namespacedKey;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
        attributeInstance.addModifier(
                new AttributeModifier(
                        namespacedKey,
                        hpfinal_mul_final,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.ANY
                )
        );

    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
        attributeInstance.removeModifier(namespacedKey);
    }

    @Override
    public String fromId() {
        if (hpfinal_mul_final < 0) {
            return "§f最终生命 -§c" + String.format("%.1f", Math.abs(hpfinal_mul_final * 100)) + "%" + "    ";
        } else {
            return "§f最终生命 +§b" + String.format("%.1f", hpfinal_mul_final * 100) + "%" + "    ";
        }
    }
}
