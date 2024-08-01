package com.xiaoxiaoowo.yuehua.utils;

import org.bukkit.NamespacedKey;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlotGroup;
import org.bukkit.inventory.ItemFlag;

import java.util.UUID;

public final class ZeroAttributeModifier {
    public static final AttributeModifier TOU_ARMOR = new AttributeModifier(new NamespacedKey("minecraft","armor.helmet"), 0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlotGroup.HEAD);
    public static final AttributeModifier TOU_ARMOR_TOUGHNESS = new AttributeModifier(new NamespacedKey("minecraft","armor.helmet"), 0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlotGroup.HEAD);
    public static final AttributeModifier TOU_KNOCKBACK_RESISTANCE = new AttributeModifier(new NamespacedKey("minecraft","armor.helmet"), 0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlotGroup.HEAD);

    public static final AttributeModifier XIONG_ARMOR = new AttributeModifier(new NamespacedKey("minecraft","armor.chestplate"), 0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlotGroup.CHEST);
    public static final AttributeModifier XIONG_ARMOR_TOUGHNESS = new AttributeModifier(new NamespacedKey("minecraft","armor.chestplate"), 0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlotGroup.CHEST);
    public static final AttributeModifier XIONG_KNOCKBACK_RESISTANCE = new AttributeModifier(new NamespacedKey("minecraft","armor.chestplate"),0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlotGroup.CHEST);

    public static final AttributeModifier TUI_ARMOR = new AttributeModifier(new NamespacedKey("minecraft","armor.leggings"), 0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlotGroup.LEGS);
    public static final AttributeModifier TUI_ARMOR_TOUGHNESS = new AttributeModifier(new NamespacedKey("minecraft","armor.leggings"), 0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlotGroup.LEGS);
    public static final AttributeModifier TUI_KNOCKBACK_RESISTANCE = new AttributeModifier(new NamespacedKey("minecraft","armor.leggings"), 0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlotGroup.LEGS);

    public static final AttributeModifier JIAO_ARMOR = new AttributeModifier(new NamespacedKey("minecraft","armor.boots"), 0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlotGroup.FEET);
    public static final AttributeModifier JIAO_ARMOR_TOUGHNESS = new AttributeModifier(new NamespacedKey("minecraft","armor.boots"), 0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlotGroup.FEET);
    public static final AttributeModifier JIAO_KNOCKBACK_RESISTANCE = new AttributeModifier(new NamespacedKey("minecraft","armor.feet"), 0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlotGroup.FEET);

    public static final AttributeModifier ATTACK_DAMAGE = new AttributeModifier(new NamespacedKey("minecraft","base_attack_damage"), 0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlotGroup.HAND);
    public static final AttributeModifier ATTACK_SPEED = new AttributeModifier(new NamespacedKey("minecraft","base_attack_speed"), 0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlotGroup.HAND);

    public static final ItemFlag[] itemFlags = {
            ItemFlag.HIDE_ENCHANTS,
            ItemFlag.HIDE_ATTRIBUTES,
            ItemFlag.HIDE_UNBREAKABLE,
            ItemFlag.HIDE_DESTROYS,
            ItemFlag.HIDE_PLACED_ON,
            ItemFlag.HIDE_ADDITIONAL_TOOLTIP,
            ItemFlag.HIDE_DYE,
            ItemFlag.HIDE_ARMOR_TRIM,
            ItemFlag.HIDE_STORED_ENCHANTS
    };
}
