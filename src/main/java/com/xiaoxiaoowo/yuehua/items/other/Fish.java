package com.xiaoxiaoowo.yuehua.items.other;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public final class Fish {
    public static final ItemStack xueyu = new ItemStack(Material.COD);
    public static final ItemStack guiyu = new ItemStack(Material.COD);
    public static final ItemStack xiaochouyu = new ItemStack(Material.COD);

    public static final ItemStack lanlin = new ItemStack(Material.COD);
    public static final ItemStack jinlin = new ItemStack(Material.COD);
    public static final ItemStack miao = new ItemStack(Material.COD);

    public static final ItemStack bawangyu = new ItemStack(Material.COD);
    public static final ItemStack canjin = new ItemStack(Material.COD);

    static {

        xueyu.editMeta(meta -> {
            meta.setMaxStackSize(99);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xueyu");
            meta.displayName(Component.text("§f鳕鱼"));
            meta.lore(List.of(
                    ComponentSet.RARE1
            ));
        });


        guiyu.editMeta(meta -> {
            meta.setMaxStackSize(99);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "guiyu");
            meta.displayName(Component.text("§a鲑鱼"));
            meta.lore(List.of(
                    ComponentSet.RARE2
            ));
        });


        xiaochouyu.editMeta(meta -> {
            meta.setMaxStackSize(99);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xiaochouyu");
            meta.displayName(Component.text("§9小丑鱼"));
            meta.lore(List.of(
                    ComponentSet.RARE3
            ));
        });


        lanlin.editMeta(meta -> {
            meta.setMaxStackSize(99);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "lanlinyu");
            meta.displayName(Component.text("§d蓝鳞"));
            meta.lore(List.of(
                    ComponentSet.RARE4
            ));
        });


        jinlin.editMeta(meta -> {
            meta.setMaxStackSize(99);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "jinlinyu");
            meta.displayName(Component.text("§e金鳞"));
            meta.lore(List.of(
                    ComponentSet.RARE5
            ));
        });


        miao.editMeta(meta -> {
            meta.setMaxStackSize(99);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "miaoyu");
            meta.displayName(Component.text("§c虹"));
            meta.lore(List.of(
                    ComponentSet.RARE6
            ));
        });


        bawangyu.editMeta(meta -> {
            meta.setMaxStackSize(99);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "bawangyu");
            meta.displayName(Component.text("§4霸王鱼"));
            meta.lore(List.of(
                    ComponentSet.RARE7
            ));
        });


        canjin.editMeta(meta -> {
            meta.setMaxStackSize(99);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "canjinyu");
            meta.displayName(Component.text("§6灿金"));
            meta.lore(List.of(
                    ComponentSet.RARE8
            ));
        });
        canjin.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "cod/8"));
        bawangyu.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "cod/7"));
        miao.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "cod/6"));
        jinlin.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "cod/5"));
        lanlin.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "cod/4"));
        xiaochouyu.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "cod/3"));
        guiyu.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "cod/2"));
        xueyu.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "cod/1"));
    }
}
