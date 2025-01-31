package com.xiaoxiaoowo.yuehua.items.monsterzhuangbei;

import com.xiaoxiaoowo.yuehua.utils.ZeroAttributeModifier;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public final class Helmet {
    public static final ItemStack leatherHelmet = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack chainmailHelmet = new ItemStack(Material.CHAINMAIL_HELMET);
    public static final ItemStack ironHelmet = new ItemStack(Material.IRON_HELMET);
    public static final ItemStack goldenHelmet = new ItemStack(Material.GOLDEN_HELMET);
    public static final ItemStack diamondHelmet = new ItemStack(Material.DIAMOND_HELMET);
    public static final ItemStack netheriteHelmet = new ItemStack(Material.NETHERITE_HELMET);
    public static final ItemStack WhiteHelmet = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack SliverHelmet = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack GrayHelmet = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack BlackHelmet = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack RedHelmet = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack MaroonHelmet = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack YellowHelmet = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack OliveHelmet = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack LimeHelmet = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack GreenHelmet = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack AquaHelmet = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack TealHelmet = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack BlueHelmet = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack NavyHelmet = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack FuchsiaHelmet = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack PurpleHelmet = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack OrangeHelmet = new ItemStack(Material.LEATHER_HELMET);


    static {
        leatherHelmet.setUnbreakable(true);
        chainmailHelmet.setUnbreakable(true);
        ironHelmet.setUnbreakable(true);
        goldenHelmet.setUnbreakable(true);
        diamondHelmet.setUnbreakable(true);
        netheriteHelmet.setUnbreakable(true);

        leatherHelmet.addAttributeModifier(Attribute.ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        chainmailHelmet.addAttributeModifier(Attribute.ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        ironHelmet.addAttributeModifier(Attribute.ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        goldenHelmet.addAttributeModifier(Attribute.ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        diamondHelmet.addAttributeModifier(Attribute.ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        netheriteHelmet.addAttributeModifier(Attribute.ARMOR, ZeroAttributeModifier.TOU_ARMOR);

        leatherHelmet.addAttributeModifier(Attribute.ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        chainmailHelmet.addAttributeModifier(Attribute.ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        ironHelmet.addAttributeModifier(Attribute.ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        goldenHelmet.addAttributeModifier(Attribute.ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        diamondHelmet.addAttributeModifier(Attribute.ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        netheriteHelmet.addAttributeModifier(Attribute.ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);

        leatherHelmet.addAttributeModifier(Attribute.KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        chainmailHelmet.addAttributeModifier(Attribute.KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        ironHelmet.addAttributeModifier(Attribute.KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        goldenHelmet.addAttributeModifier(Attribute.KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        diamondHelmet.addAttributeModifier(Attribute.KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        netheriteHelmet.addAttributeModifier(Attribute.KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);

        LeatherArmorMeta whiteHelmetMeta = (LeatherArmorMeta) leatherHelmet.getItemMeta().clone();
        whiteHelmetMeta.setColor(Color.WHITE);
        WhiteHelmet.setItemMeta(whiteHelmetMeta);

        LeatherArmorMeta sliverHelmetMeta = (LeatherArmorMeta) leatherHelmet.getItemMeta().clone();
        sliverHelmetMeta.setColor(Color.SILVER);
        SliverHelmet.setItemMeta(sliverHelmetMeta);

        LeatherArmorMeta grayHelmetMeta = (LeatherArmorMeta) leatherHelmet.getItemMeta().clone();
        grayHelmetMeta.setColor(Color.GRAY);
        GrayHelmet.setItemMeta(grayHelmetMeta);

        LeatherArmorMeta blackHelmetMeta = (LeatherArmorMeta) leatherHelmet.getItemMeta().clone();
        blackHelmetMeta.setColor(Color.BLACK);
        BlackHelmet.setItemMeta(blackHelmetMeta);

        LeatherArmorMeta redHelmetMeta = (LeatherArmorMeta) leatherHelmet.getItemMeta().clone();
        redHelmetMeta.setColor(Color.RED);
        RedHelmet.setItemMeta(redHelmetMeta);

        LeatherArmorMeta maroonHelmetMeta = (LeatherArmorMeta) leatherHelmet.getItemMeta().clone();
        maroonHelmetMeta.setColor(Color.MAROON);
        MaroonHelmet.setItemMeta(maroonHelmetMeta);

        LeatherArmorMeta yellowHelmetMeta = (LeatherArmorMeta) leatherHelmet.getItemMeta().clone();
        yellowHelmetMeta.setColor(Color.YELLOW);
        YellowHelmet.setItemMeta(yellowHelmetMeta);

        LeatherArmorMeta oliveHelmetMeta = (LeatherArmorMeta) leatherHelmet.getItemMeta().clone();
        oliveHelmetMeta.setColor(Color.OLIVE);
        OliveHelmet.setItemMeta(oliveHelmetMeta);

        LeatherArmorMeta limeHelmetMeta = (LeatherArmorMeta) leatherHelmet.getItemMeta().clone();
        limeHelmetMeta.setColor(Color.LIME);
        LimeHelmet.setItemMeta(limeHelmetMeta);

        LeatherArmorMeta greenHelmetMeta = (LeatherArmorMeta) leatherHelmet.getItemMeta().clone();
        greenHelmetMeta.setColor(Color.GREEN);
        GreenHelmet.setItemMeta(greenHelmetMeta);

        LeatherArmorMeta aquaHelmetMeta = (LeatherArmorMeta) leatherHelmet.getItemMeta().clone();
        aquaHelmetMeta.setColor(Color.AQUA);
        AquaHelmet.setItemMeta(aquaHelmetMeta);

        LeatherArmorMeta tealHelmetMeta = (LeatherArmorMeta) leatherHelmet.getItemMeta().clone();
        tealHelmetMeta.setColor(Color.TEAL);
        TealHelmet.setItemMeta(tealHelmetMeta);

        LeatherArmorMeta blueHelmetMeta = (LeatherArmorMeta) leatherHelmet.getItemMeta().clone();
        blueHelmetMeta.setColor(Color.BLUE);
        BlueHelmet.setItemMeta(blueHelmetMeta);

        LeatherArmorMeta navyHelmetMeta = (LeatherArmorMeta) leatherHelmet.getItemMeta().clone();
        navyHelmetMeta.setColor(Color.NAVY);
        NavyHelmet.setItemMeta(navyHelmetMeta);

        LeatherArmorMeta fuchsiaHelmetMeta = (LeatherArmorMeta) leatherHelmet.getItemMeta().clone();
        fuchsiaHelmetMeta.setColor(Color.FUCHSIA);
        FuchsiaHelmet.setItemMeta(fuchsiaHelmetMeta);

        LeatherArmorMeta purpleHelmetMeta = (LeatherArmorMeta) leatherHelmet.getItemMeta().clone();
        purpleHelmetMeta.setColor(Color.PURPLE);
        PurpleHelmet.setItemMeta(purpleHelmetMeta);

        LeatherArmorMeta orangeHelmetMeta = (LeatherArmorMeta) leatherHelmet.getItemMeta().clone();
        orangeHelmetMeta.setColor(Color.ORANGE);
        OrangeHelmet.setItemMeta(orangeHelmetMeta);


    }
}
