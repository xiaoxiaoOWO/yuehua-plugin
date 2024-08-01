package com.xiaoxiaoowo.yuehua.itemstack.monsterzhuangbei;

import com.xiaoxiaoowo.yuehua.utils.ZeroAttributeModifier;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public final class Bow {
    public static final ItemStack bow1 = new ItemStack(Material.BOW);
    public static final ItemStack bow2 = new ItemStack(Material.BOW);
    public static final ItemStack bow3 = new ItemStack(Material.BOW);
    public static final ItemStack bow4 = new ItemStack(Material.BOW);
    public static final ItemStack bow5 = new ItemStack(Material.BOW);
    public static final ItemStack bow6 = new ItemStack(Material.BOW);


    public static final ItemStack crossbow1 = new ItemStack(Material.CROSSBOW);
    public static final ItemStack crossbow2 = new ItemStack(Material.CROSSBOW);
    public static final ItemStack crossbow3 = new ItemStack(Material.CROSSBOW);
    public static final ItemStack crossbow4 = new ItemStack(Material.CROSSBOW);
    public static final ItemStack crossbow5 = new ItemStack(Material.CROSSBOW);

    public static final ItemStack sanchaji = new ItemStack(Material.TRIDENT);

    static {
        bow1.setUnbreakable(true);
        bow2.setUnbreakable(true);
        bow3.setUnbreakable(true);
        bow4.setUnbreakable(true);
        bow5.setUnbreakable(true);
        bow6.setUnbreakable(true);

        crossbow1.setUnbreakable(true);
        crossbow2.setUnbreakable(true);
        crossbow3.setUnbreakable(true);
        crossbow4.setUnbreakable(true);
        crossbow5.setUnbreakable(true);

        sanchaji.setUnbreakable(true);

        ItemMeta bow1Meta = bow1.getItemMeta();
        ItemMeta bow2Meta = bow2.getItemMeta();
        ItemMeta bow3Meta = bow3.getItemMeta();
        ItemMeta bow4Meta = bow4.getItemMeta();
        ItemMeta bow5Meta = bow5.getItemMeta();
        ItemMeta bow6Meta = bow6.getItemMeta();

        ItemMeta sanchajiMeta = sanchaji.getItemMeta();

        ItemMeta crossbow1Meta = crossbow1.getItemMeta();
        ItemMeta crossbow2Meta = crossbow2.getItemMeta();
        ItemMeta crossbow3Meta = crossbow3.getItemMeta();
        ItemMeta crossbow4Meta = crossbow4.getItemMeta();
        ItemMeta crossbow5Meta = crossbow5.getItemMeta();

        bow1Meta.setCustomModelData(1);
        bow2Meta.setCustomModelData(2);
        bow3Meta.setCustomModelData(3);
        bow4Meta.setCustomModelData(4);
        bow5Meta.setCustomModelData(5);
        bow6Meta.setCustomModelData(6);

        crossbow1Meta.setCustomModelData(1);
        crossbow2Meta.setCustomModelData(2);
        crossbow3Meta.setCustomModelData(3);
        crossbow4Meta.setCustomModelData(4);
        crossbow5Meta.setCustomModelData(5);

        bow1.setItemMeta(bow1Meta);
        bow2.setItemMeta(bow2Meta);
        bow3.setItemMeta(bow3Meta);
        bow4.setItemMeta(bow4Meta);
        bow5.setItemMeta(bow5Meta);
        bow6.setItemMeta(bow6Meta);

        crossbow1.setItemMeta(crossbow1Meta);
        crossbow2.setItemMeta(crossbow2Meta);
        crossbow3.setItemMeta(crossbow3Meta);
        crossbow4.setItemMeta(crossbow4Meta);
        crossbow5.setItemMeta(crossbow5Meta);

        sanchajiMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        sanchajiMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);

        sanchaji.setItemMeta(sanchajiMeta);

    }
}
