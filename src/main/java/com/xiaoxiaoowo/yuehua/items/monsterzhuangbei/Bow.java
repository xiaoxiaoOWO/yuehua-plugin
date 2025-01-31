package com.xiaoxiaoowo.yuehua.items.monsterzhuangbei;

import com.xiaoxiaoowo.yuehua.utils.ZeroAttributeModifier;
import io.papermc.paper.datacomponent.DataComponentTypes;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
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

// 弓箭手（BOW）


// 游侠（CROSSBOW）


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

        sanchajiMeta.addAttributeModifier(Attribute.ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        sanchajiMeta.addAttributeModifier(Attribute.ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);

        sanchaji.setItemMeta(sanchajiMeta);

        crossbow5.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "crossbow/6"));
        crossbow4.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "crossbow/5"));
        crossbow3.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "crossbow/4"));
        crossbow2.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "crossbow/3"));
        crossbow1.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "crossbow/2"));
        bow6.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bow/6"));
        bow5.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bow/5"));
        bow4.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bow/4"));
        bow3.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bow/3"));
        bow2.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bow/2"));
        bow1.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bow/1"));
    }
}
