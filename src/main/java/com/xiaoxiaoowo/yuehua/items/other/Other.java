package com.xiaoxiaoowo.yuehua.items.other;

import com.xiaoxiaoowo.yuehua.utils.ZeroAttributeModifier;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public final class Other {
    public static final ItemStack ARROW = new ItemStack(Material.ARROW, 1);
    public static final ItemStack NPC_PAOPAO = new ItemStack(Material.WHEAT_SEEDS, 1);
    public static final ItemStack CHONG_SHENG_STONE = new ItemStack(Material.NETHER_STAR, 1);
    public static final ItemStack wangyuanjin = new ItemStack(Material.SPYGLASS, 1);

    static {
        ItemMeta arrow = ARROW.getItemMeta();
        arrow.setMaxStackSize(99);
        ARROW.setItemMeta(arrow);

        ItemMeta itemMeta1 = NPC_PAOPAO.getItemMeta();
        itemMeta1.setMaxStackSize(99);
        itemMeta1.displayName(
                Component.text("NPC对话泡泡").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        NPC_PAOPAO.setItemMeta(itemMeta1);


        ItemMeta itemMeta2 = CHONG_SHENG_STONE.getItemMeta();
        itemMeta2.setMaxStackSize(99);
        itemMeta2.displayName(
                Component.text("重生石").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        CHONG_SHENG_STONE.setItemMeta(itemMeta2);

        ItemMeta itemMeta = wangyuanjin.getItemMeta();
        itemMeta.setMaxStackSize(1);
        itemMeta.displayName(
                Component.text("千里眼").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        wangyuanjin.setItemMeta(itemMeta);


        NPC_PAOPAO.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "wheat_seeds/2"));
    }
}
