package com.xiaoxiaoowo.yuehua.itemstack.liandan;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public final class Dan {
    //前两个怪物可掉落
    public static final ItemStack YAOYIN1 = new ItemStack(Material.REDSTONE, 1);
    public static final ItemStack YAOYIN2 = new ItemStack(Material.REDSTONE, 1);
    public static final ItemStack YAOYIN3 = new ItemStack(Material.REDSTONE, 1);
    public static final ItemStack YAOYIN4 = new ItemStack(Material.REDSTONE, 1);


    static {
        YAOYIN1.setCustomModelData(1);
        YAOYIN2.setCustomModelData(2);
        YAOYIN3.setCustomModelData(3);
        YAOYIN4.setCustomModelData(4);

        ItemMeta itemMeta1 = YAOYIN1.getItemMeta();
        ItemMeta itemMeta2 = YAOYIN2.getItemMeta();
        ItemMeta itemMeta3 = YAOYIN3.getItemMeta();
        ItemMeta itemMeta4 = YAOYIN4.getItemMeta();

        itemMeta1.setMaxStackSize(99);
        itemMeta2.setMaxStackSize(99);
        itemMeta3.setMaxStackSize(99);
        itemMeta4.setMaxStackSize(99);


        itemMeta1.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yaoyin1");
        itemMeta2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yaoyin2");
        itemMeta3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yaoyin3");
        itemMeta4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yaoyin4");

        itemMeta1.displayName(
                Component
                        .text("初级药引").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
        );

        itemMeta2.displayName(
                Component
                        .text("中级药引").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );

        itemMeta3.displayName(
                Component
                        .text("高级药引").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );

        itemMeta4.displayName(
                Component
                        .text("究级药引").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );

        itemMeta1.lore(
                List.of(
                        ComponentSet.RARE2,
                        Component.text("炼制丹药必备的材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );

        itemMeta2.lore(
                List.of(ComponentSet.RARE3,
                        Component.text("炼制丹药必备的材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );

        itemMeta3.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("炼制丹药必备的材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );

        itemMeta4.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("炼制丹药必备的材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );

        YAOYIN1.setItemMeta(itemMeta1);
        YAOYIN2.setItemMeta(itemMeta2);
        YAOYIN3.setItemMeta(itemMeta3);
        YAOYIN4.setItemMeta(itemMeta4);
    }
}
