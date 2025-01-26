package com.xiaoxiaoowo.yuehua.items.other;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public final class Mission {
    public static final ItemStack maikefeng = new ItemStack(Material.RABBIT_FOOT);
    public static final ItemStack caoyaobao = new ItemStack(Material.RABBIT_FOOT);

    public static final ItemStack tuzi = new ItemStack(Material.RABBIT_FOOT);
    public static final ItemStack gongsunshaoye = new ItemStack(Material.RABBIT_FOOT);
    public static final ItemStack shenmuyaojingchouduan = new ItemStack(Material.RABBIT_FOOT);
    public static final ItemStack banmeiyupei = new ItemStack(Material.RABBIT_FOOT);
    public static final ItemStack zhinvxin = new ItemStack(Material.RABBIT_FOOT);

    public static final ItemStack jianyiRen = new ItemStack(Material.RABBIT_FOOT);
    public static final ItemStack jianyiTian = new ItemStack(Material.RABBIT_FOOT);
    public static final ItemStack jianyiDi = new ItemStack(Material.RABBIT_FOOT);

    public static final ItemStack yuzhu = new ItemStack(Material.NETHER_WART);

    public static final ItemStack shenhide = new ItemStack(Material.RABBIT_FOOT);
    public static final ItemStack renhide = new ItemStack(Material.RABBIT_FOOT);
    public static final ItemStack yaohide = new ItemStack(Material.RABBIT_FOOT);
    public static final ItemStack zhanshenhide = new ItemStack(Material.RABBIT_FOOT);


    static {
        zhanshenhide.editMeta(meta -> {
            meta.displayName(Component.translatable("pl.item.name.zhan_hide_key"));
            meta.lore(List.of(
                    Component.translatable("pl.item.lore.zhan_hide_key.a"),
                    Component.translatable("pl.item.lore.zhan_hide_key.b")
            ));
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "zhanshenhide");
        });


        yaohide.editMeta(meta -> {
            meta.displayName(Component.translatable("pl.item.name.yao_hide_key"));
            meta.lore(List.of(
                    Component.translatable("pl.item.lore.yao_hide_key.a"),
                    Component.translatable("pl.item.lore.yao_hide_key.b")
            ));
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yaohide");
        });

        renhide.editMeta(meta -> {
            meta.displayName(Component.translatable("pl.item.name.ren_hide_key"));
            meta.lore(List.of(
                    Component.translatable("pl.item.lore.ren_hide_key.a"),
                    Component.translatable("pl.item.lore.ren_hide_key.b")
            ));
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "renhide");
        });

        shenhide.editMeta(meta -> {
            meta.displayName(Component.translatable("pl.item.name.shen_hide_key"));
            meta.lore(List.of(
                    Component.translatable("pl.item.lore.shen_hide_key.a"),
                    Component.translatable("pl.item.lore.shen_hide_key.b")
            ));
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shenhide");
        });

        yuzhu.editMeta(meta -> {
            meta.displayName(Component.translatable("pl.item.name.te32"));
            meta.lore(List.of(
                    Component.translatable("pl.item.lore.te32a"),
                    Component.translatable("pl.item.lore.te32b"),
                    Component.translatable("pl.item.lore.te32c"),
                    Component.translatable("pl.item.lore.te32d")
            ));
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yuzhuzijue");
        });

        zhinvxin.editMeta(meta -> {
            meta.displayName(Component.translatable("pl.item.name.xe"));
            meta.lore(List.of(
                    Component.translatable("pl.item.lore.xea"),
                    Component.translatable("pl.item.lore.xeb")
            ));
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "zhinvxin");
        });

        banmeiyupei.editMeta(meta -> {
            meta.displayName(Component.translatable("pl.item.name.se1"));
            meta.lore(List.of(
                    Component.translatable("pl.item.lore.se1a"),
                    Component.translatable("pl.item.lore.se1b")
            ));
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "banmeiyupei");
        });

        shenmuyaojingchouduan.editMeta(meta -> {
            meta.displayName(Component.translatable("pl.item.name.ye"));
            meta.lore(List.of(
                    Component.translatable("pl.item.lore.yea"),
                    Component.translatable("pl.item.lore.yeb")
            ));
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shenmuyaojingchouduan");
        });

        gongsunshaoye.editMeta(meta -> {
            meta.displayName(Component.translatable("pl.item.name.ze"));
            meta.lore(List.of(
                    Component.translatable("pl.item.lore.zea"),
                    Component.translatable("pl.item.lore.zeb")
            ));
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "gongsunshaoye");
        });

        tuzi.editMeta(meta -> {
            meta.displayName(Component.translatable("pl.item.name.re1"));
            meta.lore(List.of(
                    Component.translatable("pl.item.lore.re1a"),
                    Component.translatable("pl.item.lore.re1b")
            ));
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "tuzixinwu");
        });

        jianyiDi.editMeta(itemMeta -> {
            itemMeta.displayName(Component.text("§b地之剑意"));
            itemMeta.lore(List.of(
                    Component.text("§7§o地之剑为正道"),
                    Component.text("§7§o地脉正气,歧途者不可得"),
                    Component.text("§7§o邪妄之人,斩！")
            ));
            itemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "jianyiDi");
        });

        jianyiTian.editMeta(itemMeta -> {
            itemMeta.displayName(Component.text("§b天之剑意"));
            itemMeta.lore(List.of(
                    Component.text("§7§o天之剑为大道"),
                    Component.text("§7§o凡事循规蹈矩,规矩以定方圆"),
                    Component.text("§7§o逾矩之徒,斩！")
            ));
            itemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "jianyiTian");
        });

        jianyiRen.editMeta(itemMeta -> {
            itemMeta.displayName(Component.text("§b人之剑意"));
            itemMeta.lore(List.of(
                    Component.text("§7§o人之剑为小道"),
                    Component.text("§7§o由欲驱使,虽杀不杀"),
                    Component.text("§7§o杀心不定者,斩！")
            ));
            itemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "jianyiRen");
        });


        maikefeng.editMeta(itemMeta -> {
            itemMeta.displayName(Component.text("§b迷路的麦克蜂"));
            itemMeta.lore(List.of(
                    Component.text("§7§o有活力的小蜜蜂")
            ));
            itemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "maikefeng");
        });

        caoyaobao.editMeta(itemMeta -> {
            itemMeta.displayName(Component.text("§b辛齐天需要的药材包"));
            itemMeta.lore(List.of(
                    Component.text("§7§o里面包含了三根人参")
            ));
            itemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "caoyaobao");
        });
    }
}
