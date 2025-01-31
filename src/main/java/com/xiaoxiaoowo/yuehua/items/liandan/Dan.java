package com.xiaoxiaoowo.yuehua.items.liandan;

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
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public final class Dan {
    //前两个怪物可掉落
    public static final ItemStack YAOYIN1 = new ItemStack(Material.REDSTONE, 1);
    public static final ItemStack YAOYIN2 = new ItemStack(Material.REDSTONE, 1);
    public static final ItemStack YAOYIN3 = new ItemStack(Material.REDSTONE, 1);
    public static final ItemStack YAOYIN4 = new ItemStack(Material.REDSTONE, 1);

    //瞬间伤害
    public static final ItemStack FENGHOU_1 = new ItemStack(Material.SPLASH_POTION, 1);
    public static final ItemStack FENGHOU_2 = new ItemStack(Material.SPLASH_POTION, 1);
    public static final ItemStack FENGHOU_3 = new ItemStack(Material.SPLASH_POTION, 1);
    public static final ItemStack FENGHOU_4 = new ItemStack(Material.SPLASH_POTION, 1);

    //持续伤害
    public static final ItemStack QIXUE_1 = new ItemStack(Material.SPLASH_POTION, 1);
    public static final ItemStack QIXUE_2 = new ItemStack(Material.SPLASH_POTION, 1);
    public static final ItemStack QIXUE_3 = new ItemStack(Material.SPLASH_POTION, 1);
    public static final ItemStack QIXUE_4 = new ItemStack(Material.SPLASH_POTION, 1);

    //削弱攻击力
    public static final ItemStack DUOHUN_1 = new ItemStack(Material.SPLASH_POTION, 1);
    public static final ItemStack DUOHUN_2 = new ItemStack(Material.SPLASH_POTION, 1);
    public static final ItemStack DUOHUN_3 = new ItemStack(Material.SPLASH_POTION, 1);
    public static final ItemStack DUOHUN_4 = new ItemStack(Material.SPLASH_POTION, 1);

    //破防 蚀骨
    public static final ItemStack SHIGU_1 = new ItemStack(Material.SPLASH_POTION, 1);
    public static final ItemStack SHIGU_2 = new ItemStack(Material.SPLASH_POTION, 1);
    public static final ItemStack SHIGU_3 = new ItemStack(Material.SPLASH_POTION, 1);
    public static final ItemStack SHIGU_4 = new ItemStack(Material.SPLASH_POTION, 1);

    //降低回血 断元
    public static final ItemStack DUANYUAN_1 = new ItemStack(Material.SPLASH_POTION, 1);
    public static final ItemStack DUANYUAN_2 = new ItemStack(Material.SPLASH_POTION, 1);
    public static final ItemStack DUANYUAN_3 = new ItemStack(Material.SPLASH_POTION, 1);
    public static final ItemStack DUANYUAN_4 = new ItemStack(Material.SPLASH_POTION, 1);

    //控制 缚神
    public static final ItemStack FUSHEN_1 = new ItemStack(Material.SPLASH_POTION, 1);
    public static final ItemStack FUSHEN_2 = new ItemStack(Material.SPLASH_POTION, 1);
    public static final ItemStack FUSHEN_3 = new ItemStack(Material.SPLASH_POTION, 1);
    public static final ItemStack FUSHEN_4 = new ItemStack(Material.SPLASH_POTION, 1);


    //回血
    public static final ItemStack FENGMUHUICHUNQUAN_1 = new ItemStack(Material.BREAD, 1);
    public static final ItemStack FENGMUHUICHUNQUAN_2 = new ItemStack(Material.BREAD, 1);
    public static final ItemStack FENGMUHUICHUNQUAN_3 = new ItemStack(Material.BREAD, 1);
    public static final ItemStack FENGMUHUICHUNQUAN_4 = new ItemStack(Material.BREAD, 1);

    //强化防御
    public static final ItemStack TIANSHENHUTIAN_1 = new ItemStack(Material.BREAD, 1);
    public static final ItemStack TIANSHENHUTIAN_2 = new ItemStack(Material.BREAD, 1);
    public static final ItemStack TIANSHENHUTIAN_3 = new ItemStack(Material.BREAD, 1);
    public static final ItemStack TIANSHENHUTIAN_4 = new ItemStack(Material.BREAD, 1);

    //提升生机
    public static final ItemStack JIUZHUANHUANHUNXIANG_1 = new ItemStack(Material.BREAD, 1);
    public static final ItemStack JIUZHUANHUANHUNXIANG_2 = new ItemStack(Material.BREAD, 1);
    public static final ItemStack JIUZHUANHUANHUNXIANG_3 = new ItemStack(Material.BREAD, 1);
    public static final ItemStack JIUZHUANHUANHUNXIANG_4 = new ItemStack(Material.BREAD, 1);

    //强化进攻 九天聚灵露
    public static final ItemStack JIUTIANJULINGLU_1 = new ItemStack(Material.BREAD, 1);
    public static final ItemStack JIUTIANJULINGLU_2 = new ItemStack(Material.BREAD, 1);
    public static final ItemStack JIUTIANJULINGLU_3 = new ItemStack(Material.BREAD, 1);
    public static final ItemStack JIUTIANJULINGLU_4 = new ItemStack(Material.BREAD, 1);


    static {
        ItemMeta fengmuhuichunquan1ItemMeta = FENGMUHUICHUNQUAN_1.getItemMeta();


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
        YAOYIN4.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "redstone/4"));
        YAOYIN3.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "redstone/3"));
        YAOYIN2.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "redstone/2"));
        YAOYIN1.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "redstone/1"));
    }
}
