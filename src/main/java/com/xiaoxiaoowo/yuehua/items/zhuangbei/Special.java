package com.xiaoxiaoowo.yuehua.items.zhuangbei;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import com.xiaoxiaoowo.yuehua.utils.ZeroAttributeModifier;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public final class Special {
    public static final ItemStack xianqianhuojian = new ItemStack(Material.HEARTBREAK_POTTERY_SHERD, 1);
    public static final ItemStack xianqianhuojian2 = new ItemStack(Material.HEARTBREAK_POTTERY_SHERD, 1);
    public static final ItemStack xianqianhuojian3 = new ItemStack(Material.HEARTBREAK_POTTERY_SHERD, 1);
    public static final ItemStack xianqianhuojian4 = new ItemStack(Material.HEARTBREAK_POTTERY_SHERD, 1);
    public static final ItemStack xianqianhuojian5 = new ItemStack(Material.HEARTBREAK_POTTERY_SHERD, 1);
    public static final ItemStack xianqianhuojian6 = new ItemStack(Material.HEARTBREAK_POTTERY_SHERD, 1);
    public static final ItemStack xianqianhuojian7 = new ItemStack(Material.HEARTBREAK_POTTERY_SHERD, 1);
    public static final ItemStack xianqianhuojian8 = new ItemStack(Material.HEARTBREAK_POTTERY_SHERD, 1);

    public static final ItemStack bifengfu = new ItemStack(Material.HEARTBREAK_POTTERY_SHERD, 1);

    public static final ItemStack bihuofu = new ItemStack(Material.SNOWBALL, 1);

    static {
        bihuofu.editMeta(meta -> {
            meta.addItemFlags(ZeroAttributeModifier.itemFlags);
            meta.setMaxStackSize(99);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "bihuofu");
            meta.displayName(Component.text("§b灭火符"));
            meta.lore(List.of(
                    Component.text("§f右键使用可以发射，冷却§b2§fs"),
                    Component.text("§f对烈焰人类型的怪物造成§b[200%进攻属性]§f点物理伤害")
            ));

        });

        xianqianhuojian.editMeta(meta -> {
            meta.setCustomModelData(1);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xianqianhuojian");
            meta.setMaxStackSize(1);
            meta.displayName(Component.text("§f先遣纪念烟花"));
            meta.lore(List.of(
                    ComponentSet.RARE1,
                    Component.text("§f右键发射火箭，冷却§b2§fs，爆裂造成§b[10+10%进攻属性]§f点物理伤害"),
                    Component.text("§f此物品永久绑定玩家ID，在每个周目都会保留")
            ));
        });

        xianqianhuojian2.editMeta(meta -> {
            meta.setCustomModelData(1);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xianqianhuojian2");
            meta.setMaxStackSize(1);
            meta.displayName(Component.text("§a先遣纪念烟花"));
            meta.lore(List.of(
                    ComponentSet.RARE2,
                    Component.text("§f右键发射火箭，冷却§b2§fs，爆裂造成§b[15+10%进攻属性]§f点物理伤害"),
                    Component.text("§f此物品永久绑定玩家ID，在每个周目都会保留")
            ));
        });

        xianqianhuojian3.editMeta(meta -> {
            meta.setCustomModelData(1);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xianqianhuojian3");
            meta.setMaxStackSize(1);
            meta.displayName(Component.text("§9先遣纪念烟花"));
            meta.lore(List.of(
                    ComponentSet.RARE3,
                    Component.text("§f右键发射火箭，冷却§b2§fs，爆裂造成§b[20+10%进攻属性]§f点物理伤害"),
                    Component.text("§f此物品永久绑定玩家ID，在每个周目都会保留")
            ));
        });

        xianqianhuojian4.editMeta(meta -> {
            meta.setCustomModelData(1);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xianqianhuojian4");
            meta.setMaxStackSize(1);
            meta.displayName(Component.text("§d先遣纪念烟花"));
            meta.lore(List.of(
                    ComponentSet.RARE4,
                    Component.text("§f右键发射火箭，冷却§b2§fs，爆裂造成§b[25+10%进攻属性]§f点物理伤害"),
                    Component.text("§f此物品永久绑定玩家ID，在每个周目都会保留")
            ));
        });

        xianqianhuojian5.editMeta(meta -> {
            meta.setCustomModelData(1);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xianqianhuojian5");
            meta.setMaxStackSize(1);
            meta.displayName(Component.text("§e先遣纪念烟花"));
            meta.lore(List.of(
                    ComponentSet.RARE5,
                    Component.text("§f右键发射火箭，冷却§b2§fs，爆裂造成§b[30+10%进攻属性]§f点物理伤害"),
                    Component.text("§f此物品永久绑定玩家ID，在每个周目都会保留")
            ));
        });

        xianqianhuojian6.editMeta(meta -> {
            meta.setCustomModelData(1);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xianqianhuojian6");
            meta.setMaxStackSize(1);
            meta.displayName(Component.text("§c先遣纪念烟花"));
            meta.lore(List.of(
                    ComponentSet.RARE6,
                    Component.text("§f右键发射火箭，冷却§b2§fs，爆裂造成§b[35+10%进攻属性]§f点物理伤害"),
                    Component.text("§f此物品永久绑定玩家ID，在每个周目都会保留")
            ));
        });

        xianqianhuojian7.editMeta(meta -> {
            meta.setCustomModelData(1);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xianqianhuojian7");
            meta.setMaxStackSize(1);
            meta.displayName(Component.text("§4先遣纪念烟花"));
            meta.lore(List.of(
                    ComponentSet.RARE7,
                    Component.text("§f右键发射火箭，冷却§b2§fs，爆裂造成§b[40+10%进攻属性]§f点物理伤害"),
                    Component.text("§f此物品永久绑定玩家ID，在每个周目都会保留")
            ));
        });

        xianqianhuojian8.editMeta(meta -> {
            meta.setCustomModelData(1);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xianqianhuojian8");
            meta.setMaxStackSize(1);
            meta.displayName(Component.text("§6先遣纪念烟花"));
            meta.lore(List.of(
                    ComponentSet.RARE8,
                    Component.text("§f右键发射火箭，冷却§b2§fs，爆裂造成§b[45+10%进攻属性]§f点物理伤害"),
                    Component.text("§f此物品永久绑定玩家ID，在每个周目都会保留")
            ));
        });


        bifengfu.editMeta(meta -> {
            meta.setCustomModelData(2);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "bifengfu");
            meta.setMaxStackSize(99);
            meta.displayName(Component.text("§b驱蜂符"));
            meta.lore(List.of(
                    Component.text("§f右键使用可以驱赶周围§b4§f格的蜜蜂，造成至多§b6§f格的击退")
            ));
        });
    }
}
