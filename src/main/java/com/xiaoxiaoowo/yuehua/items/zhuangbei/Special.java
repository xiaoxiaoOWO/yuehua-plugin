package com.xiaoxiaoowo.yuehua.items.zhuangbei;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ZeroAttributeModifier;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public final class Special {
    public static final ItemStack xianqianhuojian = new ItemStack(Material.HEARTBREAK_POTTERY_SHERD, 1);

    public static final ItemStack bifengfu = new ItemStack(Material.HEARTBREAK_POTTERY_SHERD, 1);

    public static final ItemStack bihuofu = new ItemStack(Material.SNOWBALL,1);

    static {
        bihuofu.editMeta(meta -> {
            meta.addItemFlags(ZeroAttributeModifier.itemFlags);
            meta.setMaxStackSize(99);
            meta.getPersistentDataContainer().set(DataContainer.id,PersistentDataType.STRING, "bihuofu");
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
            meta.displayName(Component.text("§b先遣纪念烟花"));
            meta.lore(List.of(
                    Component.text("§f右键发射火箭，冷却§b2§fs，爆裂造成§b[15+15%进攻属性]§f点物理伤害"),
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
