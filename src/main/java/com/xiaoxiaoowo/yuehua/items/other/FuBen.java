package com.xiaoxiaoowo.yuehua.items.other;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public final class FuBen {
    //钥匙
    public static final ItemStack keyTong = new ItemStack(Material.NAUTILUS_SHELL);
    public static final ItemStack keyYin = new ItemStack(Material.NAUTILUS_SHELL);
    public static final ItemStack keyJin = new ItemStack(Material.NAUTILUS_SHELL);
    public static final ItemStack keyYu = new ItemStack(Material.NAUTILUS_SHELL);
    public static final ItemStack keyXinYun5 = new ItemStack(Material.NAUTILUS_SHELL);
    public static final ItemStack keyXinYun10 = new ItemStack(Material.NAUTILUS_SHELL);
    public static final ItemStack keyXinYun20 = new ItemStack(Material.NAUTILUS_SHELL);
    public static final ItemStack keyXinYun100 = new ItemStack(Material.NAUTILUS_SHELL);


    //副本道具


    static {
        ItemMeta keyTongMeta = keyTong.getItemMeta();
        ItemMeta keyYinMeta = keyYin.getItemMeta();
        ItemMeta keyJinMeta = keyJin.getItemMeta();
        ItemMeta keyYuMeta = keyYu.getItemMeta();
        ItemMeta keyXinYun5Meta = keyXinYun5.getItemMeta();
        ItemMeta keyXinYun10Meta = keyXinYun10.getItemMeta();
        ItemMeta keyXinYun20Meta = keyXinYun20.getItemMeta();
        ItemMeta keyXinYun100Meta = keyXinYun100.getItemMeta();

        keyTongMeta.setMaxStackSize(99);
        keyYinMeta.setMaxStackSize(99);
        keyJinMeta.setMaxStackSize(99);
        keyYuMeta.setMaxStackSize(99);
        keyXinYun5Meta.setMaxStackSize(99);
        keyXinYun10Meta.setMaxStackSize(99);
        keyXinYun20Meta.setMaxStackSize(99);
        keyXinYun100Meta.setMaxStackSize(99);


        PersistentDataContainer keyTongData = keyTongMeta.getPersistentDataContainer();
        PersistentDataContainer keyYinData = keyYinMeta.getPersistentDataContainer();
        PersistentDataContainer keyJinData = keyJinMeta.getPersistentDataContainer();
        PersistentDataContainer keyYuData = keyYuMeta.getPersistentDataContainer();
        PersistentDataContainer keyXinYun5Data = keyXinYun5Meta.getPersistentDataContainer();
        PersistentDataContainer keyXinYun10Data = keyXinYun10Meta.getPersistentDataContainer();
        PersistentDataContainer keyXinYun20Data = keyXinYun20Meta.getPersistentDataContainer();
        PersistentDataContainer keyXinYun100Data = keyXinYun100Meta.getPersistentDataContainer();

        keyTongData.set(DataContainer.id, PersistentDataType.STRING, "keyTong");
        keyYinData.set(DataContainer.id, PersistentDataType.STRING, "keyYin");
        keyJinData.set(DataContainer.id, PersistentDataType.STRING, "keyJin");
        keyYuData.set(DataContainer.id, PersistentDataType.STRING, "keyYu");
        keyXinYun5Data.set(DataContainer.id, PersistentDataType.STRING, "keyXinYun5");
        keyXinYun10Data.set(DataContainer.id, PersistentDataType.STRING, "keyXinYun10");
        keyXinYun20Data.set(DataContainer.id, PersistentDataType.STRING, "keyXinYun20");
        keyXinYun100Data.set(DataContainer.id, PersistentDataType.STRING, "keyXinYun100");

        keyTongMeta.displayName(
                Component.text("铜钥匙").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        keyYinMeta.displayName(
                Component.text("银钥匙").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        keyJinMeta.displayName(
                Component.text("金钥匙").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        keyYuMeta.displayName(
                Component.text("玉钥匙").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        keyXinYun5Meta.displayName(
                Component.text("幸运钥匙").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        keyXinYun10Meta.displayName(
                Component.text("高级幸运钥匙").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        keyXinYun20Meta.displayName(
                Component.text("超级幸运钥匙").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false)
        );
        keyXinYun100Meta.displayName(
                Component.text("百分百幸运钥匙").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false)
        );

        keyTongMeta.lore(
                List.of(ComponentSet.RARE3,
                        Component.text("用于开启铜宝箱").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true))
        );
        keyYinMeta.lore(
                List.of(ComponentSet.RARE4,
                        Component.text("用于开启银宝箱").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true))
        );
        keyJinMeta.lore(
                List.of(ComponentSet.RARE5,
                        Component.text("用于开启金宝箱").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true))
        );
        keyYuMeta.lore(
                List.of(ComponentSet.RARE6,
                        Component.text("用于开启玉宝箱").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true))
        );
        keyXinYun5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("§a用于开启副本和试炼宝箱"),
                        Component.text("§a并使本次开箱额外附加§b5§a点幸运值"),
                        Component.text("§a[绑定者]: §f[无]")
                )
        );
        keyXinYun10Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("§a用于开启副本和试炼宝箱"),
                        Component.text("§a并使本次开箱额外附加§b10§a点幸运值"),
                        Component.text("§a[绑定者]: §f[无]")
                )
        );
        keyXinYun20Meta.lore(
                List.of(
                        ComponentSet.RARE7,
                        Component.text("§a用于开启副本和试炼宝箱"),
                        Component.text("§a并使本次开箱额外附加§b20§a点幸运值"),
                        Component.text("§a[绑定者]: §f[无]")
                )
        );
        keyXinYun100Meta.lore(
                List.of(
                        ComponentSet.RARE8,
                        Component.text("§a用于开启副本和试炼宝箱"),
                        Component.text("§a并使本次开箱额外附加§b100§a点幸运值"),
                        Component.text("§a[绑定者]: §f[无]")
                )
        );


        keyTong.setItemMeta(keyTongMeta);
        keyYin.setItemMeta(keyYinMeta);
        keyJin.setItemMeta(keyJinMeta);
        keyYu.setItemMeta(keyYuMeta);
        keyXinYun5.setItemMeta(keyXinYun5Meta);
        keyXinYun10.setItemMeta(keyXinYun10Meta);
        keyXinYun20.setItemMeta(keyXinYun20Meta);
        keyXinYun100.setItemMeta(keyXinYun100Meta);
        keyXinYun100.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "nautilus_shell/8"));
        keyXinYun20.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "nautilus_shell/7"));
        keyXinYun10.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "nautilus_shell/6"));
        keyXinYun5.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "nautilus_shell/5"));
        keyYu.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "nautilus_shell/4"));
        keyJin.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "nautilus_shell/3"));
        keyYin.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "nautilus_shell/2"));
        keyTong.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "nautilus_shell/1"));
    }

}
