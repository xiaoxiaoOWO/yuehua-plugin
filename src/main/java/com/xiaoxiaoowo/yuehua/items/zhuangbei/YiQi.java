package com.xiaoxiaoowo.yuehua.items.zhuangbei;

import com.xiaoxiaoowo.yuehua.attribute.AttributeSet;
import com.xiaoxiaoowo.yuehua.guis.dz.Recipe;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import com.xiaoxiaoowo.yuehua.utils.ZeroAttributeModifier;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Banner;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class YiQi {
    //战士盾牌
    public static final ItemStack LAOZHANSHIDUNPAI = new ItemStack(Material.SHIELD);
    public static final ItemStack XINBINDUNPAI = new ItemStack(Material.SHIELD);
    public static final ItemStack JINRUIDUNPAI = new ItemStack(Material.SHIELD);
    public static final ItemStack CHISEYUEHUO = new ItemStack(Material.SHIELD);
    public static final ItemStack JINGANGBUHUAI = new ItemStack(Material.SHIELD);
    public static final ItemStack CHENBINLUOXUE = new ItemStack(Material.SHIELD);

    //弓箭手箭袋
    public static final ItemStack LAOLIEHUJIANDAI = new ItemStack(Material.RABBIT_HIDE);
    public static final ItemStack XINBINJIANDAI = new ItemStack(Material.RABBIT_HIDE);
    public static final ItemStack JINRUIJIANDAI = new ItemStack(Material.RABBIT_HIDE);
    public static final ItemStack YINGYANJIANDAI = new ItemStack(Material.RABBIT_HIDE);
    public static final ItemStack CANGGUNINGWANG = new ItemStack(Material.RABBIT_HIDE);
    public static final ItemStack NIEPANYUNANG = new ItemStack(Material.RABBIT_HIDE);


    //炼丹师萃刃
    public static final ItemStack FANGSHENDUANBI = new ItemStack(Material.ANGLER_POTTERY_SHERD);
    public static final ItemStack TIEZHIDUANBI = new ItemStack(Material.ANGLER_POTTERY_SHERD);
    public static final ItemStack HUIYIDAO = new ItemStack(Material.ANGLER_POTTERY_SHERD);
    public static final ItemStack LONGYADAO = new ItemStack(Material.ANGLER_POTTERY_SHERD);
    public static final ItemStack ZHANGQICUIZHU = new ItemStack(Material.ANGLER_POTTERY_SHERD);
    public static final ItemStack MINGHONG = new ItemStack(Material.ANGLER_POTTERY_SHERD);


    static {
        BlockStateMeta laozhanshidunpaiItemMeta = (BlockStateMeta) LAOZHANSHIDUNPAI.getItemMeta();
        BlockStateMeta xinbindunpaiItemMeta = (BlockStateMeta) XINBINDUNPAI.getItemMeta();
        BlockStateMeta jinruidunpaiItemMeta = (BlockStateMeta) JINRUIDUNPAI.getItemMeta();
        BlockStateMeta chiseyuehuoItemMeta = (BlockStateMeta) CHISEYUEHUO.getItemMeta();
        BlockStateMeta jingangbuhuaiItemMeta = (BlockStateMeta) JINGANGBUHUAI.getItemMeta();
        BlockStateMeta chenbinluoxueItemMeta = (BlockStateMeta) CHENBINLUOXUE.getItemMeta();

        ItemMeta laoliehujiandaiItemMeta = LAOLIEHUJIANDAI.getItemMeta();
        ItemMeta xinbinjiandaiItemMeta = XINBINJIANDAI.getItemMeta();
        ItemMeta jinruijiandaiItemMeta = JINRUIJIANDAI.getItemMeta();
        ItemMeta yingyanjiandaiItemMeta = YINGYANJIANDAI.getItemMeta();
        ItemMeta cangguningwangItemMeta = CANGGUNINGWANG.getItemMeta();
        ItemMeta niepanyunangItemMeta = NIEPANYUNANG.getItemMeta();

        ItemMeta fangshenduanbiItemMeta = FANGSHENDUANBI.getItemMeta();
        ItemMeta tongzhiduanbiItemMeta = TIEZHIDUANBI.getItemMeta();
        ItemMeta huiyidaoItemMeta = HUIYIDAO.getItemMeta();
        ItemMeta longyadaoItemMeta = LONGYADAO.getItemMeta();
        ItemMeta zhangqicuizhuItemMeta = ZHANGQICUIZHU.getItemMeta();
        ItemMeta minghongItemMeta = MINGHONG.getItemMeta();

        laoliehujiandaiItemMeta.setMaxStackSize(1);
        xinbinjiandaiItemMeta.setMaxStackSize(1);
        jinruijiandaiItemMeta.setMaxStackSize(1);
        yingyanjiandaiItemMeta.setMaxStackSize(1);
        cangguningwangItemMeta.setMaxStackSize(1);
        niepanyunangItemMeta.setMaxStackSize(1);
        fangshenduanbiItemMeta.setMaxStackSize(1);
        tongzhiduanbiItemMeta.setMaxStackSize(1);
        huiyidaoItemMeta.setMaxStackSize(1);
        longyadaoItemMeta.setMaxStackSize(1);
        zhangqicuizhuItemMeta.setMaxStackSize(1);
        minghongItemMeta.setMaxStackSize(1);

        laozhanshidunpaiItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xinbindunpaiItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        jinruidunpaiItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chiseyuehuoItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        jingangbuhuaiItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chenbinluoxueItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);


        laozhanshidunpaiItemMeta.setUnbreakable(true);
        xinbindunpaiItemMeta.setUnbreakable(true);
        jinruidunpaiItemMeta.setUnbreakable(true);
        chiseyuehuoItemMeta.setUnbreakable(true);
        jingangbuhuaiItemMeta.setUnbreakable(true);
        chenbinluoxueItemMeta.setUnbreakable(true);


        PersistentDataContainer pdclaozhanshidunpaiItemMeta = laozhanshidunpaiItemMeta.getPersistentDataContainer();
        PersistentDataContainer pdcxinbindunpaiItemMeta = xinbindunpaiItemMeta.getPersistentDataContainer();
        PersistentDataContainer pdcjinruidunpaiItemMeta = jinruidunpaiItemMeta.getPersistentDataContainer();
        PersistentDataContainer pdcchiseyuehuoItemMeta = chiseyuehuoItemMeta.getPersistentDataContainer();
        PersistentDataContainer pdcjingangbuhuaiItemMeta = jingangbuhuaiItemMeta.getPersistentDataContainer();
        PersistentDataContainer pdcchenbinluoxueItemMeta = chenbinluoxueItemMeta.getPersistentDataContainer();

        PersistentDataContainer pdclaoliehujiandaiItemMeta = laoliehujiandaiItemMeta.getPersistentDataContainer();
        PersistentDataContainer pdcxinbinjiandaiItemMeta = xinbinjiandaiItemMeta.getPersistentDataContainer();
        PersistentDataContainer pdcjinruijiandaiItemMeta = jinruijiandaiItemMeta.getPersistentDataContainer();
        PersistentDataContainer pdcyingyanjiandaiItemMeta = yingyanjiandaiItemMeta.getPersistentDataContainer();
        PersistentDataContainer pdccangguningwangItemMeta = cangguningwangItemMeta.getPersistentDataContainer();
        PersistentDataContainer pdcniepanyunangItemMeta = niepanyunangItemMeta.getPersistentDataContainer();

        PersistentDataContainer pdcfangshenduanbiItemMeta = fangshenduanbiItemMeta.getPersistentDataContainer();
        PersistentDataContainer pdctongzhiduanbiItemMeta = tongzhiduanbiItemMeta.getPersistentDataContainer();
        PersistentDataContainer pdchuiyidaoItemMeta = huiyidaoItemMeta.getPersistentDataContainer();
        PersistentDataContainer pdclongyadaoItemMeta = longyadaoItemMeta.getPersistentDataContainer();
        PersistentDataContainer pdczhangqicuizhuItemMeta = zhangqicuizhuItemMeta.getPersistentDataContainer();
        PersistentDataContainer pdcminghongItemMeta = minghongItemMeta.getPersistentDataContainer();

        pdclaozhanshidunpaiItemMeta.set(DataContainer.id, PersistentDataType.STRING, "laoZhanShiDunPai");
        pdcxinbindunpaiItemMeta.set(DataContainer.id, PersistentDataType.STRING, "xinBinDunPai");
        pdcjinruidunpaiItemMeta.set(DataContainer.id, PersistentDataType.STRING, "jinRuiDunPai");
        pdcchiseyuehuoItemMeta.set(DataContainer.id, PersistentDataType.STRING, "chiSeYueHuo");
        pdcjingangbuhuaiItemMeta.set(DataContainer.id, PersistentDataType.STRING, "jinGangBuHuai");
        pdcchenbinluoxueItemMeta.set(DataContainer.id, PersistentDataType.STRING, "chenBinLuoXue");
        pdclaoliehujiandaiItemMeta.set(DataContainer.id, PersistentDataType.STRING, "laoLieHuJianDai");
        pdcxinbinjiandaiItemMeta.set(DataContainer.id, PersistentDataType.STRING, "xinBinJianDai");
        pdcjinruijiandaiItemMeta.set(DataContainer.id, PersistentDataType.STRING, "jinRuiJianDai");
        pdcyingyanjiandaiItemMeta.set(DataContainer.id, PersistentDataType.STRING, "yingYanJianDai");
        pdccangguningwangItemMeta.set(DataContainer.id, PersistentDataType.STRING, "cangGuNingWang");
        pdcniepanyunangItemMeta.set(DataContainer.id, PersistentDataType.STRING, "niePanYunAng");
        pdcfangshenduanbiItemMeta.set(DataContainer.id, PersistentDataType.STRING, "fangShenDuanBi");
        pdctongzhiduanbiItemMeta.set(DataContainer.id, PersistentDataType.STRING, "tieZhiDuanBi");
        pdchuiyidaoItemMeta.set(DataContainer.id, PersistentDataType.STRING, "huiYiDao");
        pdclongyadaoItemMeta.set(DataContainer.id, PersistentDataType.STRING, "longYaDao");
        pdczhangqicuizhuItemMeta.set(DataContainer.id, PersistentDataType.STRING, "zhangQiCuiZhu");
        pdcminghongItemMeta.set(DataContainer.id, PersistentDataType.STRING, "mingHong");


        pdclaozhanshidunpaiItemMeta.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcxinbindunpaiItemMeta.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcjinruidunpaiItemMeta.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcchiseyuehuoItemMeta.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcjingangbuhuaiItemMeta.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcchenbinluoxueItemMeta.set(DataContainer.job, PersistentDataType.INTEGER, 1);

        pdclaoliehujiandaiItemMeta.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcxinbinjiandaiItemMeta.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcjinruijiandaiItemMeta.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcyingyanjiandaiItemMeta.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdccangguningwangItemMeta.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcniepanyunangItemMeta.set(DataContainer.job, PersistentDataType.INTEGER, 2);

        pdcfangshenduanbiItemMeta.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdctongzhiduanbiItemMeta.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdchuiyidaoItemMeta.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdclongyadaoItemMeta.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdczhangqicuizhuItemMeta.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcminghongItemMeta.set(DataContainer.job, PersistentDataType.INTEGER, 3);

        pdclaozhanshidunpaiItemMeta.set(DataContainer.slot, PersistentDataType.INTEGER, 40);
        pdcxinbindunpaiItemMeta.set(DataContainer.slot, PersistentDataType.INTEGER, 40);
        pdcjinruidunpaiItemMeta.set(DataContainer.slot, PersistentDataType.INTEGER, 40);
        pdcchiseyuehuoItemMeta.set(DataContainer.slot, PersistentDataType.INTEGER, 40);
        pdcjingangbuhuaiItemMeta.set(DataContainer.slot, PersistentDataType.INTEGER, 40);
        pdcchenbinluoxueItemMeta.set(DataContainer.slot, PersistentDataType.INTEGER, 40);

        pdclaoliehujiandaiItemMeta.set(DataContainer.slot, PersistentDataType.INTEGER, 40);
        pdcxinbinjiandaiItemMeta.set(DataContainer.slot, PersistentDataType.INTEGER, 40);
        pdcjinruijiandaiItemMeta.set(DataContainer.slot, PersistentDataType.INTEGER, 40);
        pdcyingyanjiandaiItemMeta.set(DataContainer.slot, PersistentDataType.INTEGER, 40);
        pdccangguningwangItemMeta.set(DataContainer.slot, PersistentDataType.INTEGER, 40);
        pdcniepanyunangItemMeta.set(DataContainer.slot, PersistentDataType.INTEGER, 40);

        pdcfangshenduanbiItemMeta.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdctongzhiduanbiItemMeta.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdchuiyidaoItemMeta.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdclongyadaoItemMeta.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdczhangqicuizhuItemMeta.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcminghongItemMeta.set(DataContainer.slot, PersistentDataType.INTEGER, 0);

        laozhanshidunpaiItemMeta.displayName(Component.text("老战士的盾牌[异器]").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false));
        xinbindunpaiItemMeta.displayName(Component.text("新兵盾牌[异器]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        jinruidunpaiItemMeta.displayName(Component.text("精锐盾牌[异器]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        chiseyuehuoItemMeta.displayName(Component.text("赤色跃火[异器]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        jingangbuhuaiItemMeta.displayName(Component.text("金刚不坏[异器]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        chenbinluoxueItemMeta.displayName(Component.text("沉冰落雪[异器]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        laoliehujiandaiItemMeta.displayName(Component.text("老猎户的箭袋[异器]").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false));
        xinbinjiandaiItemMeta.displayName(Component.text("新兵箭袋[异器]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        jinruijiandaiItemMeta.displayName(Component.text("精锐箭袋[异器]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        yingyanjiandaiItemMeta.displayName(Component.text("鹰眼之视[异器]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        cangguningwangItemMeta.displayName(Component.text("仓古凝望[异器]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        niepanyunangItemMeta.displayName(Component.text("涅槃羽囊[异器]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        fangshenduanbiItemMeta.displayName(Component.text("防身短匕[异器]").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false));
        tongzhiduanbiItemMeta.displayName(Component.text("铁制短匕[异器]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        huiyidaoItemMeta.displayName(Component.text("回翼刀[异器]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        longyadaoItemMeta.displayName(Component.text("龙牙刀[异器]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        zhangqicuizhuItemMeta.displayName(Component.text("瘴气翠竹[异器]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        minghongItemMeta.displayName(Component.text("鸣鸿[异器]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        laozhanshidunpaiItemMeta.lore(
                Stream.of(
                                ComponentSet.RARE1,
                                ComponentSet.JOBZHAN,
                                ComponentSet.ActFUSHOU,
                                Component.text("§7§o饱经战火洗礼的老盾牌"),
                                Component.text("§7§o虽有磨损但依然坚固"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("laoZhanShiDunPai", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[被动技]§f[坚固] §f冷却: §b20s"),
                                Component.text("§f获得无限时长的§b16§f点护盾")
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        xinbindunpaiItemMeta.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBZHAN,
                                ComponentSet.ActFUSHOU,
                                Component.text("§7§o崭新的制式盾牌"),
                                Component.text("§7§o用料扎实耐用"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("xinBinDunPai", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[被动技]§a[坚韧] §f冷却: §b20s"),
                                Component.text("§f获得无限时长的§b24§f点护盾"),
                                Component.text("§f同时提高§b20§f点护甲，持续§b4s")
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        jinruidunpaiItemMeta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBZHAN,
                                ComponentSet.ActFUSHOU,
                                Component.text("§7§o精心打造的军用盾牌"),
                                Component.text("§7§o能完美防御各类攻击"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("jinRuiDunPai", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[被动技]§9[不破] §f冷却: §b20s"),
                                Component.text("§f获得无限时长的§b36§f点护盾"),
                                Component.text("§f同时减免§b10%§f任何伤害，持续§b4s")
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        chiseyuehuoItemMeta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBZHAN,
                                ComponentSet.ActFUSHOU,
                                Component.text("§7§o蕴含烈焰之力的神盾"),
                                Component.text("§7§o可将敌人的攻击化为火焰反击"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chiSeYueHuo", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[被动技]§d[焰灵化劫] §f冷却: §b20s"),
                                Component.text("§f获得无限时长的§b72§f点护盾，并进入§6[烈焰护体]§f状态，持续§b4s"),
                                Component.text("§f在此期间，受到的任何类型的伤害的§b10%§f均会转为烈焰"),
                                Component.text("§f转为烈焰的伤害不会再对玩家造成伤害，同时每吸收§b1§f点伤害，转化§b50§f点热力"),
                                Component.text("§f并对攻击者造成§b[热力值]§f点伤害")
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        jingangbuhuaiItemMeta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBZHAN,
                                ComponentSet.ActFUSHOU,
                                Component.text("§7§o以金刚石锻造的无双神盾"),
                                Component.text("§7§o刀枪不入水火不侵"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("jinGangBuHuai", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[被动技]§e[玄元不破] §f冷却: 无"),
                                Component.text("§f受到的任何类型的伤害均会减免§b10%"),
                                Component.text("§6[被动技]§e[金刚不坏] §f冷却: §b20s"),
                                Component.text("§f获得无限时长的§b144§f点护盾，然后进入§6[金刚不坏]§f状态，持续§b4s"),
                                Component.text("§f在此期间，若受到的伤害低于§b[5%最大生命]§f，则完全抵挡这次伤害"),
                                Component.text("§f同时，若此伤害为物理伤害，则至多造成§b[25%最大生命]§f点伤害"),
                                Component.text("§f触发上述两种情况，均会对攻击者造成§b[受到的伤害*20]§f点伤害")
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        chenbinluoxueItemMeta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBZHAN,
                                ComponentSet.ActFUSHOU,
                                Component.text("§7§o凝结万载寒冰之力"),
                                Component.text("§7§o可冻结一切攻击"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chenBinLuoXue", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        laoliehujiandaiItemMeta.lore(
                Stream.of(
                                ComponentSet.RARE1,
                                ComponentSet.JOBGONG,
                                ComponentSet.ActFUSHOU,
                                Component.text("§7§o老猎人随身携带的箭袋"),
                                Component.text("§7§o虽破旧但十分实用"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("laoLieHuJianDai", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[被动技]§f[利箭] §f冷却: 无"),
                                Component.text("§f满弦箭造成的物理伤害提高§b15%")
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        xinbinjiandaiItemMeta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBGONG,
                                ComponentSet.ActFUSHOU,
                                Component.text("§7§o新手弓手的标配箭袋"),
                                Component.text("§7§o能妥善收纳各类箭矢"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("xinBinJianDai", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[被动技]§a[利箭] §f冷却: 无"),
                                Component.text("§f满弦箭造成的物理伤害提高§b30%"),
                                Component.text("§f并能额外造成§b[50%箭矢强度]§f法术伤害")
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        jinruijiandaiItemMeta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBGONG,
                                ComponentSet.ActFUSHOU,
                                Component.text("§7§o军中精锐专用的箭袋"),
                                Component.text("§7§o可快速取箭增强战力"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("jinRuiJianDai", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[被动技]§9[锐利] §f冷却: 无"),
                                Component.text("§f满弦箭造成的物理伤害提高§b45%"),
                                Component.text("§f若本次是第三次满弦箭命中，则额外造成§b[300%箭矢强度]§f法术伤害")
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        yingyanjiandaiItemMeta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBGONG,
                                ComponentSet.ActFUSHOU,
                                Component.text("§7§o蕴含鹰之锐目的箭袋"),
                                Component.text("§7§o助你百发百中"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("yingYanJianDai", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[被动技]§d[鹰眼] §f冷却: 无"),
                                Component.text("§f满弦箭造成的物理伤害提高§b60%§f，同时为目标附加§6[鹰眼]§f印记，持续§b4§fs"),
                                Component.text("§f命中附有§6[鹰眼]§f印记的目标，将额外造成§b[300%箭矢强度]§f法术伤害，然后消除印记"),
                                Component.text("§f每消除§b20§f个印记，提高自身§b20%§f箭矢强度，持续§b5s")
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        cangguningwangItemMeta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBGONG,
                                ComponentSet.ActFUSHOU,
                                Component.text("§7§o承载上古神明的洞察之力"),
                                Component.text("§7§o箭无虚发"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("cangGuNingWang", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[被动技]§e[仓古] §f冷却: 无"),
                                Component.text("§f满弦箭造成的物理伤害提高§b75%§f，同时额外造成§b[150%箭矢强度]§f法术伤害"),
                                Component.text("§6[被动技]§e[凝望] §f冷却: §b2s"),
                                Component.text("§f箭袋之灵沿玩家视线方向进行一次凝望"),
                                Component.text("§f对沿途距离§b1§f格内的所有怪物施加§6[无可遁形]§f效果，持续§b10s"),
                                Component.text("§f重复施加不可叠加，将刷新持续时间，处于§6[无可遁形]§f效果的怪物将"),
                                Component.text("§f无法隐形，并提高受到的任意玩家的箭矢物理伤害§b20%"),
                                Component.text("§f满弦箭命中处于§6[无可遁形]§f效果的怪物将积攒一层§6[掣获]§f"),
                                Component.text("§f达到§b20§f层时，将自动消耗全部§6[掣获]§f，并提高§b30%§f箭矢强度，持续§b5s")
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        niepanyunangItemMeta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBGONG,
                                ComponentSet.ActFUSHOU,
                                Component.text("§7§o注入不死鸟之魂的箭袋"),
                                Component.text("§7§o箭矢可化作火凤重生"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("niePanYunAng", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        fangshenduanbiItemMeta.lore(
                Stream.of(
                                ComponentSet.RARE1,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act1,
                                Component.text("§7§o简单的防身匕首"),
                                Component.text("§7§o适合在危急时刻使用"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("fangShenDuanBi", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[被动技]§f[萃取]"),
                                Component.text("§f用此武器攻击的物理伤害提高§b[100%阵法强度]§f点"),
                                Component.text("§f用此武器击杀可额外获取随机§b2§f份普通元素")
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        tongzhiduanbiItemMeta.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act1,
                                Component.text("§7§o精铁打造的短匕"),
                                Component.text("§7§o锋利坚固"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("tieZhiDuanBi", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[被动技]§a[萃取]"),
                                Component.text("§f用此武器攻击的物理伤害提高§b[150%阵法强度]§f点"),
                                Component.text("§f用此武器击杀可额外获取随机§b4§f份普通元素")
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        huiyidaoItemMeta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act1,
                                Component.text("§7§o如鹰翼般灵动的弧形刀"),
                                Component.text("§7§o出招迅捷无比"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("huiYiDao", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[被动技]§9[萃取]"),
                                Component.text("§f用此武器攻击的物理伤害提高§b[200%阵法强度]§f点"),
                                Component.text("§f用此武器击杀可额外获取随机§b6§f份普通元素")
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        longyadaoItemMeta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act1,
                                Component.text("§7§o刀身似龙牙般锋利"),
                                Component.text("§7§o一击即可撕裂敌人"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("longYaDao", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[被动技]§d[萃取]"),
                                Component.text("§f用此武器攻击的物理伤害提高§b[250%阵法强度]§f点"),
                                Component.text("§f用此武器击杀可额外获取随机§b8§f份普通元素")
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        zhangqicuizhuItemMeta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act1,
                                Component.text("§7§o浸染剧毒的诡异短刃"),
                                Component.text("§7§o伤口难以愈合"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("zhangQiCuiZhu", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[被动技]§c[萃取]"),
                                Component.text("§f用此武器攻击的物理伤害提高§e[300%阵法强度]§f点"),
                                Component.text("§f用此武器击杀可额外获取随机§b10§f份普通元素")
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        minghongItemMeta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act1,
                                Component.text("§7§o刀锋凝聚凤凰火焰"),
                                Component.text("§7§o每一击都伴随凤鸣"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("mingHong", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );


        Banner xinbindunpaiBanner = (Banner) xinbindunpaiItemMeta.getBlockState();
        xinbindunpaiBanner.addPattern(new Pattern(DyeColor.LIME, PatternType.BASE));
        xinbindunpaiBanner.addPattern(new Pattern(DyeColor.LIGHT_BLUE, PatternType.RHOMBUS));
        xinbindunpaiBanner.addPattern(new Pattern(DyeColor.YELLOW, PatternType.STRIPE_DOWNRIGHT));
        xinbindunpaiBanner.addPattern(new Pattern(DyeColor.YELLOW, PatternType.STRIPE_DOWNLEFT));
        xinbindunpaiBanner.addPattern(new Pattern(DyeColor.LIGHT_GRAY, PatternType.BORDER));
        xinbindunpaiItemMeta.setBlockState(xinbindunpaiBanner);

        Banner jinruidunpaiBanner = (Banner) jinruidunpaiItemMeta.getBlockState();
        jinruidunpaiBanner.addPattern(new Pattern(DyeColor.BLUE, PatternType.BASE));
        jinruidunpaiBanner.addPattern(new Pattern(DyeColor.CYAN, PatternType.SKULL));
        jinruidunpaiBanner.addPattern(new Pattern(DyeColor.LIGHT_GRAY, PatternType.BORDER));
        jinruidunpaiItemMeta.setBlockState(jinruidunpaiBanner);

        Banner chiseyuehuoBanner = (Banner) chiseyuehuoItemMeta.getBlockState();
        chiseyuehuoBanner.addPattern(new Pattern(DyeColor.RED, PatternType.BASE));
        chiseyuehuoBanner.addPattern(new Pattern(DyeColor.PINK, PatternType.GRADIENT));
        chiseyuehuoBanner.addPattern(new Pattern(DyeColor.ORANGE, PatternType.CREEPER));
        chiseyuehuoBanner.addPattern(new Pattern(DyeColor.LIGHT_GRAY, PatternType.BORDER));
        chiseyuehuoItemMeta.setBlockState(chiseyuehuoBanner);

        Banner jingangbuhuaiBanner = (Banner) jingangbuhuaiItemMeta.getBlockState();
        jingangbuhuaiBanner.addPattern(new Pattern(DyeColor.YELLOW, PatternType.BASE));
        jingangbuhuaiBanner.addPattern(new Pattern(DyeColor.BLACK, PatternType.GRADIENT));
        jingangbuhuaiBanner.addPattern(new Pattern(DyeColor.GRAY, PatternType.SKULL));
        jingangbuhuaiBanner.addPattern(new Pattern(DyeColor.LIGHT_GRAY, PatternType.BORDER));
        jingangbuhuaiItemMeta.setBlockState(jingangbuhuaiBanner);

        Banner chenbinluoxueBanner = (Banner) chenbinluoxueItemMeta.getBlockState();
        chenbinluoxueBanner.addPattern(new Pattern(DyeColor.LIGHT_BLUE, PatternType.BASE));
        chenbinluoxueBanner.addPattern(new Pattern(DyeColor.BLUE, PatternType.GRADIENT_UP));
        chenbinluoxueBanner.addPattern(new Pattern(DyeColor.PINK, PatternType.FLOWER));
        chenbinluoxueBanner.addPattern(new Pattern(DyeColor.LIGHT_GRAY, PatternType.BORDER));
        chenbinluoxueItemMeta.setBlockState(chenbinluoxueBanner);


        LAOZHANSHIDUNPAI.setItemMeta(laozhanshidunpaiItemMeta);
        XINBINDUNPAI.setItemMeta(xinbindunpaiItemMeta);
        JINRUIDUNPAI.setItemMeta(jinruidunpaiItemMeta);
        CHISEYUEHUO.setItemMeta(chiseyuehuoItemMeta);
        JINGANGBUHUAI.setItemMeta(jingangbuhuaiItemMeta);
        CHENBINLUOXUE.setItemMeta(chenbinluoxueItemMeta);

        LAOLIEHUJIANDAI.setItemMeta(laoliehujiandaiItemMeta);
        XINBINJIANDAI.setItemMeta(xinbinjiandaiItemMeta);
        JINRUIJIANDAI.setItemMeta(jinruijiandaiItemMeta);
        YINGYANJIANDAI.setItemMeta(yingyanjiandaiItemMeta);
        CANGGUNINGWANG.setItemMeta(cangguningwangItemMeta);
        NIEPANYUNANG.setItemMeta(niepanyunangItemMeta);

        FANGSHENDUANBI.setItemMeta(fangshenduanbiItemMeta);
        TIEZHIDUANBI.setItemMeta(tongzhiduanbiItemMeta);
        HUIYIDAO.setItemMeta(huiyidaoItemMeta);
        LONGYADAO.setItemMeta(longyadaoItemMeta);
        ZHANGQICUIZHU.setItemMeta(zhangqicuizhuItemMeta);
        MINGHONG.setItemMeta(minghongItemMeta);

        MINGHONG.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "angler_pottery_sherd/6"));
        ZHANGQICUIZHU.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "angler_pottery_sherd/5"));
        LONGYADAO.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "angler_pottery_sherd/4"));
        HUIYIDAO.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "angler_pottery_sherd/3"));
        TIEZHIDUANBI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "angler_pottery_sherd/2"));
        FANGSHENDUANBI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "angler_pottery_sherd/1"));
        NIEPANYUNANG.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "rabbit_hide/106"));
        CANGGUNINGWANG.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "rabbit_hide/105"));
        YINGYANJIANDAI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "rabbit_hide/104"));
        JINRUIJIANDAI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "rabbit_hide/103"));
        XINBINJIANDAI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "rabbit_hide/102"));
        LAOLIEHUJIANDAI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "rabbit_hide/101"));
    }

    public static void putId() {
        Recipe.idToItem.put("laoZhanShiDunPai", LAOZHANSHIDUNPAI);
        Recipe.idToItem.put("xinBinDunPai", XINBINDUNPAI);
        Recipe.idToItem.put("jinRuiDunPai", JINRUIDUNPAI);
        Recipe.idToItem.put("chiSeYueHuo", CHISEYUEHUO);
        Recipe.idToItem.put("jinGangBuHuai", JINGANGBUHUAI);
        Recipe.idToItem.put("chenBinLuoXue", CHENBINLUOXUE);

        Recipe.idToItem.put("laoLieHuJianDai", LAOLIEHUJIANDAI);
        Recipe.idToItem.put("xinBinJianDai", XINBINJIANDAI);
        Recipe.idToItem.put("jinRuiJianDai", JINRUIJIANDAI);
        Recipe.idToItem.put("yingYanJianDai", YINGYANJIANDAI);
        Recipe.idToItem.put("cangGuNingWang", CANGGUNINGWANG);
        Recipe.idToItem.put("niePanYunAng", NIEPANYUNANG);

        Recipe.idToItem.put("fangShenDuanBi", FANGSHENDUANBI);
        Recipe.idToItem.put("tieZhiDuanBi", TIEZHIDUANBI);
        Recipe.idToItem.put("huiYiDao", HUIYIDAO);
        Recipe.idToItem.put("longYaDao", LONGYADAO);
        Recipe.idToItem.put("zhangQiCuiZhu", ZHANGQICUIZHU);
        Recipe.idToItem.put("mingHong", MINGHONG);
    }
}
