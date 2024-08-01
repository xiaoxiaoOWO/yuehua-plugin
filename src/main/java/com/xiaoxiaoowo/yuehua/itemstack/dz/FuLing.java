package com.xiaoxiaoowo.yuehua.itemstack.dz;

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

public final class FuLing {
    public static final ItemStack zhusha = new ItemStack(Material.PAPER);

    //守护，减免中毒，凋零伤害
    public static final ItemStack shouhu1 = new ItemStack(Material.PAPER);
    public static final ItemStack shouhu2 = new ItemStack(Material.PAPER);
    public static final ItemStack shouhu3 = new ItemStack(Material.PAPER);
    public static final ItemStack jiabin = new ItemStack(Material.PAPER);


    //炎铠，减少火焰伤害
    public static final ItemStack yankai1 = new ItemStack(Material.PAPER);
    public static final ItemStack yankai2 = new ItemStack(Material.PAPER);
    public static final ItemStack yankai3 = new ItemStack(Material.PAPER);
    public static final ItemStack yanmo = new ItemStack(Material.PAPER);

    //霜甲，减少冰冻伤害
    public static final ItemStack shuangjia1 = new ItemStack(Material.PAPER);
    public static final ItemStack shuangjia2 = new ItemStack(Material.PAPER);
    public static final ItemStack shuangjia3 = new ItemStack(Material.PAPER);
    public static final ItemStack aohan = new ItemStack(Material.PAPER);


    //落矢，减少箭矢伤害
    public static final ItemStack luoshi1 = new ItemStack(Material.PAPER);
    public static final ItemStack luoshi2 = new ItemStack(Material.PAPER);
    public static final ItemStack luoshi3 = new ItemStack(Material.PAPER);
    public static final ItemStack wuxie = new ItemStack(Material.PAPER);


    //羽体，减少摔落伤害
    public static final ItemStack yuti1 = new ItemStack(Material.PAPER);
    public static final ItemStack yuti2 = new ItemStack(Material.PAPER);
    public static final ItemStack yuti3 = new ItemStack(Material.PAPER);
    public static final ItemStack xianti = new ItemStack(Material.PAPER);

    //强韧，减少三叉戟伤害
    public static final ItemStack qiangren1 = new ItemStack(Material.PAPER);
    public static final ItemStack qiangren2 = new ItemStack(Material.PAPER);
    public static final ItemStack qiangren3 = new ItemStack(Material.PAPER);
    public static final ItemStack bucui = new ItemStack(Material.PAPER);

    //利刃,增加攻击速度
    public static final ItemStack liren1 = new ItemStack(Material.PAPER);
    public static final ItemStack liren2 = new ItemStack(Material.PAPER);
    public static final ItemStack liren3 = new ItemStack(Material.PAPER);
    public static final ItemStack duanzui = new ItemStack(Material.PAPER);

    //巨力，增加攻击距离
    public static final ItemStack juli1 = new ItemStack(Material.PAPER);
    public static final ItemStack juli2 = new ItemStack(Material.PAPER);
    public static final ItemStack juli3 = new ItemStack(Material.PAPER);
    public static final ItemStack wangyue = new ItemStack(Material.PAPER);

    //强弓，概率穿透
    public static final ItemStack qiangong1 = new ItemStack(Material.PAPER);
    public static final ItemStack qiangong2 = new ItemStack(Material.PAPER);
    public static final ItemStack qiangong3 = new ItemStack(Material.PAPER);
    public static final ItemStack yuanri = new ItemStack(Material.PAPER);

    //不尽，概率不消耗箭矢
    public static final ItemStack bujin1 = new ItemStack(Material.PAPER);
    public static final ItemStack bujin2 = new ItemStack(Material.PAPER);
    public static final ItemStack bujin3 = new ItemStack(Material.PAPER);
    public static final ItemStack wuxian = new ItemStack(Material.PAPER);

    //会心，概率不消耗普通元素
    public static final ItemStack huixin1 = new ItemStack(Material.PAPER);
    public static final ItemStack huixin2 = new ItemStack(Material.PAPER);
    public static final ItemStack huixin3 = new ItemStack(Material.PAPER);
    public static final ItemStack xianfa = new ItemStack(Material.PAPER);

    //贯通，概率不消耗精炼元素
    public static final ItemStack guantong1 = new ItemStack(Material.PAPER);
    public static final ItemStack guantong2 = new ItemStack(Material.PAPER);
    public static final ItemStack guantong3 = new ItemStack(Material.PAPER);
    public static final ItemStack shenfa = new ItemStack(Material.PAPER);


    //万法，概率不消耗浓缩元素
    public static final ItemStack wanfa1 = new ItemStack(Material.PAPER);
    public static final ItemStack wanfa2 = new ItemStack(Material.PAPER);
    public static final ItemStack wanfa3 = new ItemStack(Material.PAPER);
    public static final ItemStack shengfa = new ItemStack(Material.PAPER);


    static {
        zhusha.setCustomModelData(1);
        ItemMeta zhushaMeta = zhusha.getItemMeta();
        zhushaMeta.setMaxStackSize(99);
        zhushaMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "zhusha");
        zhushaMeta.displayName(
                Component.text("朱砂").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
        );
        zhushaMeta.lore(
                List.of(
                        ComponentSet.RARE2,
                        Component.text("可以刻画附灵符").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        zhusha.setItemMeta(zhushaMeta);

        shouhu1.setCustomModelData(2);
        ItemMeta shouhu1Meta = shouhu1.getItemMeta();
        shouhu1Meta.setMaxStackSize(99);
        shouhu1Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shouhu1");
        shouhu1Meta.displayName(
                Component.text("附灵符[守护]☯一").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        shouhu1Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("§f毒伤免疫 +§b10%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        shouhu1.setItemMeta(shouhu1Meta);

        shouhu2.setCustomModelData(2);
        ItemMeta shouhu2Meta = shouhu2.getItemMeta();
        shouhu2Meta.setMaxStackSize(99);
        shouhu2Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shouhu2");
        shouhu2Meta.displayName(
                Component.text("附灵符[守护]☯二").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        shouhu2Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("§f毒伤免疫 +§b20%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        shouhu2.setItemMeta(shouhu2Meta);

        shouhu3.setCustomModelData(2);
        ItemMeta shouhu3Meta = shouhu3.getItemMeta();
        shouhu3Meta.setMaxStackSize(99);
        shouhu3Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shouhu3");
        shouhu3Meta.displayName(
                Component.text("附灵符[守护]☯三").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        shouhu3Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("§f毒伤免疫 +§b30%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        shouhu3.setItemMeta(shouhu3Meta);

        jiabin.setCustomModelData(2);
        ItemMeta jiabinMeta = jiabin.getItemMeta();
        jiabinMeta.setMaxStackSize(99);
        jiabinMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shouhu4");
        jiabinMeta.displayName(
                Component.text("附灵符[甲兵]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        jiabinMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("§f毒伤免疫 +§b40%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        jiabin.setItemMeta(jiabinMeta);

        yankai1.setCustomModelData(3);
        ItemMeta yankai1Meta = yankai1.getItemMeta();
        yankai1Meta.setMaxStackSize(99);
        yankai1Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yankai1");
        yankai1Meta.displayName(
                Component.text("附灵符[炎凯]☯一").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        yankai1Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("§f火伤免疫 +§b10%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        yankai1.setItemMeta(yankai1Meta);


        yankai2.setCustomModelData(3);
        ItemMeta yankai2Meta = yankai2.getItemMeta();
        yankai2Meta.setMaxStackSize(99);
        yankai2Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yankai2");
        yankai2Meta.displayName(
                Component.text("附灵符[炎凯]☯二").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        yankai2Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("§f火伤免疫 +§b20%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        yankai2.setItemMeta(yankai2Meta);


        yankai3.setCustomModelData(3);
        ItemMeta yankai3Meta = yankai3.getItemMeta();
        yankai3Meta.setMaxStackSize(99);
        yankai3Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yankai3");
        yankai3Meta.displayName(
                Component.text("附灵符[炎凯]☯三").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        yankai3Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("§f火伤免疫 +§b30%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        yankai3.setItemMeta(yankai3Meta);


        yanmo.setCustomModelData(3);
        ItemMeta yanmoMeta = yanmo.getItemMeta();
        yanmoMeta.setMaxStackSize(99);
        yanmoMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yankai4");
        yanmoMeta.displayName(
                Component.text("附灵符[炎魔]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        yanmoMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("§f火伤免疫 +§b40%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        yanmo.setItemMeta(yanmoMeta);

        luoshi1.setCustomModelData(4);
        ItemMeta luoshi1Meta = luoshi1.getItemMeta();
        luoshi1Meta.setMaxStackSize(99);
        luoshi1Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "luoshi1");
        luoshi1Meta.displayName(
                Component.text("附灵符[落矢]☯一").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        luoshi1Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("§f箭伤免疫 +§b10%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        luoshi1.setItemMeta(luoshi1Meta);

        luoshi2.setCustomModelData(4);
        ItemMeta luoshi2Meta = luoshi2.getItemMeta();
        luoshi2Meta.setMaxStackSize(99);
        luoshi2Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "luoshi2");
        luoshi2Meta.displayName(
                Component.text("附灵符[落矢]☯二").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        luoshi2Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("§f箭伤免疫 +§b20%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        luoshi2.setItemMeta(luoshi2Meta);

        luoshi3.setCustomModelData(4);
        ItemMeta luoshi3Meta = luoshi3.getItemMeta();
        luoshi3Meta.setMaxStackSize(99);
        luoshi3Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "luoshi3");
        luoshi3Meta.displayName(
                Component.text("附灵符[落矢]☯三").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        luoshi3Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("§f箭伤免疫 +§b30%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        luoshi3.setItemMeta(luoshi3Meta);

        wuxie.setCustomModelData(4);
        ItemMeta wuxieMeta = wuxie.getItemMeta();
        wuxieMeta.setMaxStackSize(99);
        wuxieMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "luoshi4");
        wuxieMeta.displayName(
                Component.text("附灵符[无懈]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        wuxieMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("§f箭伤免疫 +§b40%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        wuxie.setItemMeta(wuxieMeta);


        wanfa1.setCustomModelData(5);
        ItemMeta wanfa1Meta = wanfa1.getItemMeta();
        wanfa1Meta.setMaxStackSize(99);
        wanfa1Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "wanfa1");
        wanfa1Meta.displayName(
                Component.text("附灵符[万法]☯一").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        wanfa1Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("§f浓缩元素不消耗率 +§b5%§f(上限§b90%§f)"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        wanfa1.setItemMeta(wanfa1Meta);

        wanfa2.setCustomModelData(5);
        ItemMeta wanfa2Meta = wanfa2.getItemMeta();
        wanfa2Meta.setMaxStackSize(99);
        wanfa2Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "wanfa2");
        wanfa2Meta.displayName(
                Component.text("附灵符[万法]☯二").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        wanfa2Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("§f浓缩元素不消耗率 +§b10%§f(上限§b90%§f)"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        wanfa2.setItemMeta(wanfa2Meta);

        wanfa3.setCustomModelData(5);
        ItemMeta wanfa3Meta = wanfa3.getItemMeta();
        wanfa3Meta.setMaxStackSize(99);
        wanfa3Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "wanfa3");
        wanfa3Meta.displayName(
                Component.text("附灵符[万法]☯三").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        wanfa3Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("§f浓缩元素不消耗率 +§b15%§f(上限§b90%§f)"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        wanfa3.setItemMeta(wanfa3Meta);

        shengfa.setCustomModelData(5);
        ItemMeta shengfaMeta = shengfa.getItemMeta();
        shengfaMeta.setMaxStackSize(99);
        shengfaMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "wanfa4");
        shengfaMeta.displayName(
                Component.text("附灵符[圣法]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        shengfaMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("§f浓缩元素不消耗率 +§b20%§f(上限§b90%§f)"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        shengfa.setItemMeta(shengfaMeta);


        yuti1.setCustomModelData(6);
        ItemMeta yuti1Meta = yuti1.getItemMeta();
        yuti1Meta.setMaxStackSize(99);
        yuti1Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yuti1");
        yuti1Meta.displayName(
                Component.text("附灵符[羽体]☯一").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        yuti1Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("§f摔落伤免疫 +§b10%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        yuti1.setItemMeta(yuti1Meta);


        yuti2.setCustomModelData(6);
        ItemMeta yuti2Meta = yuti2.getItemMeta();
        yuti2Meta.setMaxStackSize(99);
        yuti2Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yuti2");
        yuti2Meta.displayName(
                Component.text("附灵符[羽体]☯二").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        yuti2Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("§f摔落伤免疫 +§b20%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        yuti2.setItemMeta(yuti2Meta);

        yuti3.setCustomModelData(6);
        ItemMeta yuti3Meta = yuti3.getItemMeta();
        yuti3Meta.setMaxStackSize(99);
        yuti3Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yuti3");
        yuti3Meta.displayName(
                Component.text("附灵符[羽体]☯三").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        yuti3Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("§f摔落伤免疫 +§b30%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        yuti3.setItemMeta(yuti3Meta);

        xianti.setCustomModelData(6);
        ItemMeta xiantiMeta = xianti.getItemMeta();
        xiantiMeta.setMaxStackSize(99);
        xiantiMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yuti4");
        xiantiMeta.displayName(
                Component.text("附灵符[仙体]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        xiantiMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("§f摔落伤免疫 +§b40%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        xianti.setItemMeta(xiantiMeta);


        liren1.setCustomModelData(7);
        ItemMeta liren1Meta = liren1.getItemMeta();
        liren1Meta.setMaxStackSize(99);
        liren1Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "liren1");
        liren1Meta.displayName(
                Component.text("附灵符[利刃]☯一").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        liren1Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("§f攻击速度 +§b0.1§f"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        liren1.setItemMeta(liren1Meta);

        liren2.setCustomModelData(7);
        ItemMeta liren2Meta = liren2.getItemMeta();
        liren2Meta.setMaxStackSize(99);
        liren2Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "liren2");
        liren2Meta.displayName(
                Component.text("附灵符[利刃]☯二").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        liren2Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("§f攻击速度 +§b0.2§f"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        liren2.setItemMeta(liren2Meta);

        liren3.setCustomModelData(7);
        ItemMeta liren3Meta = liren3.getItemMeta();
        liren3Meta.setMaxStackSize(99);
        liren3Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "liren3");
        liren3Meta.displayName(
                Component.text("附灵符[利刃]☯三").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        liren3Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("§f攻击速度 +§b0.3§f"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        liren3.setItemMeta(liren3Meta);


        duanzui.setCustomModelData(7);
        ItemMeta duanzuiMeta = duanzui.getItemMeta();
        duanzuiMeta.setMaxStackSize(99);
        duanzuiMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "liren4");
        duanzuiMeta.displayName(
                Component.text("附灵符[断罪]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        duanzuiMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("§f攻击速度 +§b0.4§f"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        duanzui.setItemMeta(duanzuiMeta);

        qiangong1.setCustomModelData(8);
        ItemMeta qiangong1Meta = qiangong1.getItemMeta();
        qiangong1Meta.setMaxStackSize(99);
        qiangong1Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qiangong1");
        qiangong1Meta.displayName(
                Component.text("附灵符[强弓]☯一").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        qiangong1Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("§f射出穿透箭概率 +§b0.1§f"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qiangong1.setItemMeta(qiangong1Meta);

        qiangong2.setCustomModelData(8);
        ItemMeta qiangong2Meta = qiangong2.getItemMeta();
        qiangong2Meta.setMaxStackSize(99);
        qiangong2Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qiangong2");
        qiangong2Meta.displayName(
                Component.text("附灵符[强弓]☯二").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        qiangong2Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("§f射出穿透箭概率 +§b0.2§f"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qiangong2.setItemMeta(qiangong2Meta);

        qiangong3.setCustomModelData(8);
        ItemMeta qiangong3Meta = qiangong3.getItemMeta();
        qiangong3Meta.setMaxStackSize(99);
        qiangong3Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qiangong3");
        qiangong3Meta.displayName(
                Component.text("附灵符[强弓]☯三").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        qiangong3Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("§f射出穿透箭概率 +§b0.3§f"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qiangong3.setItemMeta(qiangong3Meta);

        yuanri.setCustomModelData(8);
        ItemMeta yuanriMeta = yuanri.getItemMeta();
        yuanriMeta.setMaxStackSize(99);
        yuanriMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qianggong4");
        yuanriMeta.displayName(
                Component.text("附灵符[渊日]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        yuanriMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("§f射出穿透箭概率 +§b0.4§f"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        yuanri.setItemMeta(yuanriMeta);


        qiangren1.setCustomModelData(9);
        ItemMeta qiangren1Meta = qiangren1.getItemMeta();
        qiangren1Meta.setMaxStackSize(99);
        qiangren1Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qiangren1");
        qiangren1Meta.displayName(
                Component.text("附灵符[强韧]☯一").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        qiangren1Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("§f三叉戟伤免疫 +§b10%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qiangren1.setItemMeta(qiangren1Meta);

        qiangren2.setCustomModelData(9);
        ItemMeta qiangren2Meta = qiangren2.getItemMeta();
        qiangren2Meta.setMaxStackSize(99);
        qiangren2Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qiangren2");
        qiangren2Meta.displayName(
                Component.text("附灵符[强韧]☯二").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        qiangren2Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("§f三叉戟伤免疫 +§b20%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qiangren2.setItemMeta(qiangren2Meta);

        qiangren3.setCustomModelData(9);
        ItemMeta qiangren3Meta = qiangren3.getItemMeta();
        qiangren3Meta.setMaxStackSize(99);
        qiangren3Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qiangren3");
        qiangren3Meta.displayName(
                Component.text("附灵符[强韧]☯三").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        qiangren3Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("§f三叉戟伤免疫 +§b30%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qiangren3.setItemMeta(qiangren3Meta);

        bucui.setCustomModelData(9);
        ItemMeta bucuiMeta = bucui.getItemMeta();
        bucuiMeta.setMaxStackSize(99);
        bucuiMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qiangren4");
        bucuiMeta.displayName(
                Component.text("附灵符[不摧]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        bucuiMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("§f三叉戟伤免疫 +§b40%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        bucui.setItemMeta(bucuiMeta);

        shuangjia1.setCustomModelData(10);
        ItemMeta shuangjia1Meta = shuangjia1.getItemMeta();
        shuangjia1Meta.setMaxStackSize(99);
        shuangjia1Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shuangjia1");
        shuangjia1Meta.displayName(
                Component.text("附灵符[霜甲]☯一").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        shuangjia1Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("§f冰冻伤害 -§b10%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        shuangjia1.setItemMeta(shuangjia1Meta);

        shuangjia2.setCustomModelData(10);
        ItemMeta shuangjia2Meta = shuangjia2.getItemMeta();
        shuangjia2Meta.setMaxStackSize(99);
        shuangjia2Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shuangjia2");
        shuangjia2Meta.displayName(
                Component.text("附灵符[霜甲]☯二").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        shuangjia2Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("§f冰冻伤害 -§b20%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        shuangjia2.setItemMeta(shuangjia2Meta);

        shuangjia3.setCustomModelData(10);
        ItemMeta shuangjia3Meta = shuangjia3.getItemMeta();
        shuangjia3Meta.setMaxStackSize(99);
        shuangjia3Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shuangjia3");
        shuangjia3Meta.displayName(
                Component.text("附灵符[霜甲]☯三").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        shuangjia3Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("§f冰冻伤害 -§b30%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        shuangjia3.setItemMeta(shuangjia3Meta);

        aohan.setCustomModelData(10);
        ItemMeta aohanMeta = aohan.getItemMeta();
        aohanMeta.setMaxStackSize(99);
        aohanMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shuangjia4");
        aohanMeta.displayName(
                Component.text("附灵符[傲寒]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        aohanMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("§f冰冻伤害 -§b40%§f(上限§b80%§f)"),
                        Component.text("可以附灵于防具").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        aohan.setItemMeta(aohanMeta);

        huixin1.setCustomModelData(11);
        ItemMeta huixin1Meta = huixin1.getItemMeta();
        huixin1Meta.setMaxStackSize(99);
        huixin1Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "huixin1");
        huixin1Meta.displayName(
                Component.text("附灵符[会心]☯一").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        huixin1Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("§f普通元素不消耗率 +§b15%§f(上限§b90%§f)"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        huixin1.setItemMeta(huixin1Meta);

        huixin2.setCustomModelData(11);
        ItemMeta huixin2Meta = huixin2.getItemMeta();
        huixin2Meta.setMaxStackSize(99);
        huixin2Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "huixin2");
        huixin2Meta.displayName(
                Component.text("附灵符[会心]☯二").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        huixin2Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("§f普通元素不消耗率 +§b30%§f(上限§b90%§f)"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        huixin2.setItemMeta(huixin2Meta);

        huixin3.setCustomModelData(11);
        ItemMeta huixin3Meta = huixin3.getItemMeta();
        huixin3Meta.setMaxStackSize(99);
        huixin3Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "huixin3");
        huixin3Meta.displayName(
                Component.text("附灵符[会心]☯三").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        huixin3Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("§f普通元素不消耗率 +§b45%§f(上限§b90%§f)"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        huixin3.setItemMeta(huixin3Meta);

        xianfa.setCustomModelData(11);
        ItemMeta xianfaMeta = xianfa.getItemMeta();
        xianfaMeta.setMaxStackSize(99);
        xianfaMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "huixin4");
        xianfaMeta.displayName(
                Component.text("附灵符[仙法]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        xianfaMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("§f普通元素不消耗率 +§b60%§f(上限§b90%§f)"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        xianfa.setItemMeta(xianfaMeta);

        guantong1.setCustomModelData(12);
        ItemMeta guantong1Meta = guantong1.getItemMeta();
        guantong1Meta.setMaxStackSize(99);
        guantong1Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "guantong1");
        guantong1Meta.displayName(
                Component.text("附灵符[贯通]☯一").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        guantong1Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("§f精炼元素不消耗率 +§b10%§f(上限§b90%§f)"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        guantong1.setItemMeta(guantong1Meta);

        guantong2.setCustomModelData(12);
        ItemMeta guantong2Meta = guantong2.getItemMeta();
        guantong2Meta.setMaxStackSize(99);
        guantong2Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "guantong2");
        guantong2Meta.displayName(
                Component.text("附灵符[贯通]☯二").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        guantong2Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("§f精炼元素不消耗率 +§b20%§f(上限§b90%§f)"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        guantong2.setItemMeta(guantong2Meta);

        guantong3.setCustomModelData(12);
        ItemMeta guantong3Meta = guantong3.getItemMeta();
        guantong3Meta.setMaxStackSize(99);
        guantong3Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "guantong3");
        guantong3Meta.displayName(
                Component.text("附灵符[贯通]☯三").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        guantong3Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("§f精炼元素不消耗率 +§b30%§f(上限§b90%§f)"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        guantong3.setItemMeta(guantong3Meta);

        shenfa.setCustomModelData(12);
        ItemMeta shenfaMeta = shenfa.getItemMeta();
        shenfaMeta.setMaxStackSize(99);
        shenfaMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "guantong4");
        shenfaMeta.displayName(
                Component.text("附灵符[神法]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        shenfaMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("§f精炼元素不消耗率 +§b40%§f(上限§b90%§f)"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        shenfa.setItemMeta(shenfaMeta);

        juli1.setCustomModelData(13);
        ItemMeta juli1Meta = juli1.getItemMeta();
        juli1Meta.setMaxStackSize(99);
        juli1Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "juli1");
        juli1Meta.displayName(
                Component.text("附灵符[巨力]☯一").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        juli1Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("§f攻击距离 +§b0.5§f"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        juli1.setItemMeta(juli1Meta);

        juli2.setCustomModelData(13);
        ItemMeta juli2Meta = juli2.getItemMeta();
        juli2Meta.setMaxStackSize(99);
        juli2Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "juli2");
        juli2Meta.displayName(
                Component.text("附灵符[巨力]☯二").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        juli2Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("§f攻击距离 +§b1§f"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        juli2.setItemMeta(juli2Meta);

        juli3.setCustomModelData(13);
        ItemMeta juli3Meta = juli3.getItemMeta();
        juli3Meta.setMaxStackSize(99);
        juli3Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "juli3");
        juli3Meta.displayName(
                Component.text("附灵符[巨力]☯三").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        juli3Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("§f攻击距离 +§b1.5§f"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        juli3.setItemMeta(juli3Meta);

        wangyue.setCustomModelData(13);
        ItemMeta wangyueMeta = wangyue.getItemMeta();
        wangyueMeta.setMaxStackSize(99);
        wangyueMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "juli4");
        wangyueMeta.displayName(
                Component.text("附灵符[望月]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        wangyueMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("§f攻击距离 +§b2§f"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        wangyue.setItemMeta(wangyueMeta);


        bujin1.setCustomModelData(14);
        ItemMeta bujin1Meta = bujin1.getItemMeta();
        bujin1Meta.setMaxStackSize(99);
        bujin1Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "bujin1");
        bujin1Meta.displayName(
                Component.text("附灵符[不尽]☯一").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        bujin1Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("§f箭矢不消耗率 +§b25%§f(触发不消耗时，会往背包里增加一枚箭矢)"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        bujin1.setItemMeta(bujin1Meta);

        bujin2.setCustomModelData(14);
        ItemMeta bujin2Meta = bujin2.getItemMeta();
        bujin2Meta.setMaxStackSize(99);
        bujin2Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "bujin2");
        bujin2Meta.displayName(
                Component.text("附灵符[不尽]☯二").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        bujin2Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("§f箭矢不消耗率 +§b50%§f(触发不消耗时，会往背包里增加一枚箭矢)"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        bujin2.setItemMeta(bujin2Meta);

        bujin3.setCustomModelData(14);
        ItemMeta bujin3Meta = bujin3.getItemMeta();
        bujin3Meta.setMaxStackSize(99);
        bujin3Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "bujin3");
        bujin3Meta.displayName(
                Component.text("附灵符[不尽]☯三").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        bujin3Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("§f箭矢不消耗率 +§b75%§f(触发不消耗时，会往背包里增加一枚箭矢)"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        bujin3.setItemMeta(bujin3Meta);

        wuxian.setCustomModelData(14);
        ItemMeta wuxianMeta = wuxian.getItemMeta();
        wuxianMeta.setMaxStackSize(99);
        wuxianMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "bujin4");
        wuxianMeta.displayName(
                Component.text("附灵符[无限]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        wuxianMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("§f不再消耗箭矢"),
                        Component.text("可以附灵于主武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        wuxian.setItemMeta(wuxianMeta);


    }


}
