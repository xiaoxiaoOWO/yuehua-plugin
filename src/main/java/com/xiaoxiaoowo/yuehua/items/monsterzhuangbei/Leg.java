package com.xiaoxiaoowo.yuehua.items.monsterzhuangbei;

import com.xiaoxiaoowo.yuehua.utils.ZeroAttributeModifier;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public final class Leg {
    public static final ItemStack leatherLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack chainmailLeggings = new ItemStack(Material.CHAINMAIL_LEGGINGS);
    public static final ItemStack ironLeggings = new ItemStack(Material.IRON_LEGGINGS);
    public static final ItemStack goldenLeggings = new ItemStack(Material.GOLDEN_LEGGINGS);
    public static final ItemStack diamondLeggings = new ItemStack(Material.DIAMOND_LEGGINGS);
    public static final ItemStack netheriteLeggings = new ItemStack(Material.NETHERITE_LEGGINGS);
    public static final ItemStack WhiteLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack SliverLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack GrayLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack BlackLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack RedLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack MaroonLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack YellowLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack OliveLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack LimeLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack GreenLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack AquaLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack TealLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack BlueLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack NavyLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack FuchsiaLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack PurpleLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack OrangeLeggings = new ItemStack(Material.LEATHER_LEGGINGS);


    static {
        leatherLeggings.setUnbreakable(true);
        chainmailLeggings.setUnbreakable(true);
        ironLeggings.setUnbreakable(true);
        goldenLeggings.setUnbreakable(true);
        diamondLeggings.setUnbreakable(true);
        netheriteLeggings.setUnbreakable(true);

        leatherLeggings.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        chainmailLeggings.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        ironLeggings.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        goldenLeggings.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        diamondLeggings.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        netheriteLeggings.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);

        leatherLeggings.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        chainmailLeggings.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        ironLeggings.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        goldenLeggings.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        diamondLeggings.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        netheriteLeggings.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);

        leatherLeggings.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        chainmailLeggings.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        ironLeggings.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        goldenLeggings.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        diamondLeggings.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        netheriteLeggings.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);

        LeatherArmorMeta baseMeta = (LeatherArmorMeta) leatherLeggings.getItemMeta().clone();

        baseMeta.setColor(Color.WHITE);
        WhiteLeggings.setItemMeta(baseMeta);

        baseMeta.setColor(Color.SILVER);
        SliverLeggings.setItemMeta(baseMeta);

        baseMeta.setColor(Color.GRAY);
        GrayLeggings.setItemMeta(baseMeta);

        baseMeta.setColor(Color.BLACK);
        BlackLeggings.setItemMeta(baseMeta);

        baseMeta.setColor(Color.RED);
        RedLeggings.setItemMeta(baseMeta);

        baseMeta.setColor(Color.MAROON);
        MaroonLeggings.setItemMeta(baseMeta);

        baseMeta.setColor(Color.YELLOW);
        YellowLeggings.setItemMeta(baseMeta);

        baseMeta.setColor(Color.OLIVE);
        OliveLeggings.setItemMeta(baseMeta);

        baseMeta.setColor(Color.LIME);
        LimeLeggings.setItemMeta(baseMeta);

        baseMeta.setColor(Color.GREEN);
        GreenLeggings.setItemMeta(baseMeta);

        baseMeta.setColor(Color.AQUA);
        AquaLeggings.setItemMeta(baseMeta);

        baseMeta.setColor(Color.TEAL);
        TealLeggings.setItemMeta(baseMeta);

        baseMeta.setColor(Color.BLUE);
        BlueLeggings.setItemMeta(baseMeta);

        baseMeta.setColor(Color.NAVY);
        NavyLeggings.setItemMeta(baseMeta);

        baseMeta.setColor(Color.FUCHSIA);
        FuchsiaLeggings.setItemMeta(baseMeta);

        baseMeta.setColor(Color.PURPLE);
        PurpleLeggings.setItemMeta(baseMeta);

        baseMeta.setColor(Color.ORANGE);
        OrangeLeggings.setItemMeta(baseMeta);


    }

}
