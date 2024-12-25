package com.xiaoxiaoowo.yuehua.guis.op;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public final class OpGui {
    public final static Inventory OP_GUI = Bukkit.createInventory(null, 54, Component.text("OP菜单").color(NamedTextColor.AQUA));

    public final static Inventory zhanWeapon = Bukkit.createInventory(null, 54, Component.text("物品管理").color(NamedTextColor.AQUA));
    public final static Inventory gongWeapon = Bukkit.createInventory(null, 54, Component.text("物品管理").color(NamedTextColor.AQUA));
    public final static Inventory danWeapon = Bukkit.createInventory(null, 54, Component.text("物品管理").color(NamedTextColor.AQUA));

    public final static Inventory zhanArmor = Bukkit.createInventory(null, 54, Component.text("物品管理").color(NamedTextColor.AQUA));
    public final static Inventory gongArmor = Bukkit.createInventory(null, 54, Component.text("物品管理").color(NamedTextColor.AQUA));
    public final static Inventory danArmor = Bukkit.createInventory(null, 54, Component.text("物品管理").color(NamedTextColor.AQUA));

    static {

    }
}
