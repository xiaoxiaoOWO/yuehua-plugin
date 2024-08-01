package com.xiaoxiaoowo.yuehua.itemstack.zhuangbei;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import com.xiaoxiaoowo.yuehua.utils.ZeroAttributeModifier;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Banner;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BannerMeta;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public final class YiQi {
    //战士盾牌
    public static final ItemStack LAOZHANSHIDUNPAI = new ItemStack(Material.SHIELD);
    public static final ItemStack XINBINDUNPAI = new ItemStack(Material.SHIELD);
    public static final ItemStack JINRUIDUNPAI = new ItemStack(Material.SHIELD);
    public static final ItemStack CHISEYUEHUO = new ItemStack(Material.SHIELD);
    public static final ItemStack JINGANGBUHUAI = new ItemStack(Material.SHIELD);
    public static final ItemStack CHENBINLUOXUE = new ItemStack(Material.SHIELD);

    //弓箭手箭袋
    public static final ItemStack LAOLIEHUJIANDAI = new ItemStack(Material.GOLDEN_PICKAXE);
    public static final ItemStack XINBINJIANDAI = new ItemStack(Material.GOLDEN_PICKAXE);
    public static final ItemStack JINRUIJIANDAI = new ItemStack(Material.GOLDEN_PICKAXE);
    public static final ItemStack YINGYANJIANDAI = new ItemStack(Material.GOLDEN_PICKAXE);
    public static final ItemStack CANGGUNINGWANG = new ItemStack(Material.GOLDEN_PICKAXE);
    public static final ItemStack NIEPANYUNANG = new ItemStack(Material.GOLDEN_PICKAXE);


    //炼丹师萃刃
    public static final ItemStack FANGSHENDUANBI = new ItemStack(Material.NETHERITE_PICKAXE);
    public static final ItemStack TIEZHIDUANBI = new ItemStack(Material.NETHERITE_PICKAXE);
    public static final ItemStack HUIYIDAO = new ItemStack(Material.NETHERITE_PICKAXE);
    public static final ItemStack LONGYADAO = new ItemStack(Material.NETHERITE_PICKAXE);
    public static final ItemStack ZHANGQICUIZHU = new ItemStack(Material.NETHERITE_PICKAXE);
    public static final ItemStack MINGHONG = new ItemStack(Material.NETHERITE_PICKAXE);


    static {
        BlockStateMeta laozhanshidunpaiItemMeta =  (BlockStateMeta) LAOZHANSHIDUNPAI.getItemMeta();
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

        laozhanshidunpaiItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xinbindunpaiItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        jinruidunpaiItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chiseyuehuoItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        jingangbuhuaiItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chenbinluoxueItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);

        laoliehujiandaiItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xinbinjiandaiItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        jinruijiandaiItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        yingyanjiandaiItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        cangguningwangItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        niepanyunangItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);

        fangshenduanbiItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        tongzhiduanbiItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        huiyidaoItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        longyadaoItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhangqicuizhuItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        minghongItemMeta.addItemFlags(ZeroAttributeModifier.itemFlags);

        laozhanshidunpaiItemMeta.setUnbreakable(true);
        xinbindunpaiItemMeta.setUnbreakable(true);
        jinruidunpaiItemMeta.setUnbreakable(true);
        chiseyuehuoItemMeta.setUnbreakable(true);
        jingangbuhuaiItemMeta.setUnbreakable(true);
        chenbinluoxueItemMeta.setUnbreakable(true);

        laoliehujiandaiItemMeta.setUnbreakable(true);
        xinbinjiandaiItemMeta.setUnbreakable(true);
        jinruijiandaiItemMeta.setUnbreakable(true);
        yingyanjiandaiItemMeta.setUnbreakable(true);
        cangguningwangItemMeta.setUnbreakable(true);
        niepanyunangItemMeta.setUnbreakable(true);

        fangshenduanbiItemMeta.setUnbreakable(true);
        tongzhiduanbiItemMeta.setUnbreakable(true);
        huiyidaoItemMeta.setUnbreakable(true);
        longyadaoItemMeta.setUnbreakable(true);
        zhangqicuizhuItemMeta.setUnbreakable(true);
        minghongItemMeta.setUnbreakable(true);

        laoliehujiandaiItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,ZeroAttributeModifier.ATTACK_DAMAGE);
        xinbinjiandaiItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,ZeroAttributeModifier.ATTACK_DAMAGE);
        jinruijiandaiItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,ZeroAttributeModifier.ATTACK_DAMAGE);
        yingyanjiandaiItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,ZeroAttributeModifier.ATTACK_DAMAGE);
        cangguningwangItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,ZeroAttributeModifier.ATTACK_DAMAGE);
        niepanyunangItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,ZeroAttributeModifier.ATTACK_DAMAGE);

        fangshenduanbiItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,ZeroAttributeModifier.ATTACK_DAMAGE);
        tongzhiduanbiItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,ZeroAttributeModifier.ATTACK_DAMAGE);
        huiyidaoItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,ZeroAttributeModifier.ATTACK_DAMAGE);
        longyadaoItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,ZeroAttributeModifier.ATTACK_DAMAGE);
        zhangqicuizhuItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,ZeroAttributeModifier.ATTACK_DAMAGE);
        minghongItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,ZeroAttributeModifier.ATTACK_DAMAGE);

        laoliehujiandaiItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED,ZeroAttributeModifier.ATTACK_SPEED);
        xinbinjiandaiItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED,ZeroAttributeModifier.ATTACK_SPEED);
        jinruijiandaiItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED,ZeroAttributeModifier.ATTACK_SPEED);
        yingyanjiandaiItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED,ZeroAttributeModifier.ATTACK_SPEED);
        cangguningwangItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED,ZeroAttributeModifier.ATTACK_SPEED);
        niepanyunangItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED,ZeroAttributeModifier.ATTACK_SPEED);

        fangshenduanbiItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED,ZeroAttributeModifier.ATTACK_SPEED);
        tongzhiduanbiItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED,ZeroAttributeModifier.ATTACK_SPEED);
        huiyidaoItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED,ZeroAttributeModifier.ATTACK_SPEED);
        longyadaoItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED,ZeroAttributeModifier.ATTACK_SPEED);
        zhangqicuizhuItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED,ZeroAttributeModifier.ATTACK_SPEED);
        minghongItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED,ZeroAttributeModifier.ATTACK_SPEED);


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

        pdclaozhanshidunpaiItemMeta.set(DataContainer.id, PersistentDataType.STRING, "laozhanshidunpai");
        pdcxinbindunpaiItemMeta.set(DataContainer.id, PersistentDataType.STRING, "xinbindunpai");
        pdcjinruidunpaiItemMeta.set(DataContainer.id, PersistentDataType.STRING, "jinruidunpai");
        pdcchiseyuehuoItemMeta.set(DataContainer.id, PersistentDataType.STRING, "chiseyuehuo");
        pdcjingangbuhuaiItemMeta.set(DataContainer.id, PersistentDataType.STRING, "jingangbuhuai");
        pdcchenbinluoxueItemMeta.set(DataContainer.id, PersistentDataType.STRING, "chenbinluoxue");

        pdclaoliehujiandaiItemMeta.set(DataContainer.id, PersistentDataType.STRING, "laoliehujiandai");
        pdcxinbinjiandaiItemMeta.set(DataContainer.id, PersistentDataType.STRING, "xinbinjiandai");
        pdcjinruijiandaiItemMeta.set(DataContainer.id, PersistentDataType.STRING, "jinruijiandai");
        pdcyingyanjiandaiItemMeta.set(DataContainer.id, PersistentDataType.STRING, "yingyanjiandai");
        pdccangguningwangItemMeta.set(DataContainer.id, PersistentDataType.STRING, "cangguningwang");
        pdcniepanyunangItemMeta.set(DataContainer.id, PersistentDataType.STRING, "niepanyunang");

        pdcfangshenduanbiItemMeta.set(DataContainer.id, PersistentDataType.STRING, "fangshenduanbi");
        pdctongzhiduanbiItemMeta.set(DataContainer.id, PersistentDataType.STRING, "tongzhiduanbi");
        pdchuiyidaoItemMeta.set(DataContainer.id, PersistentDataType.STRING, "huiyidao");
        pdclongyadaoItemMeta.set(DataContainer.id, PersistentDataType.STRING, "longyadao");
        pdczhangqicuizhuItemMeta.set(DataContainer.id, PersistentDataType.STRING, "zhangqicuizhu");
        pdcminghongItemMeta.set(DataContainer.id, PersistentDataType.STRING, "minghong");

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
                List.of(
                        ComponentSet.RARE1
                )
        );
        xinbindunpaiItemMeta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );
        jinruidunpaiItemMeta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );
        chiseyuehuoItemMeta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );
        jingangbuhuaiItemMeta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );
        chenbinluoxueItemMeta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );
        laoliehujiandaiItemMeta.lore(
                List.of(
                        ComponentSet.RARE1
                )
        );
        xinbinjiandaiItemMeta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );
        jinruijiandaiItemMeta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );
        yingyanjiandaiItemMeta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );
        cangguningwangItemMeta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );
        niepanyunangItemMeta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );
        fangshenduanbiItemMeta.lore(
                List.of(
                        ComponentSet.RARE1
                )
        );
        tongzhiduanbiItemMeta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );
        huiyidaoItemMeta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );
        longyadaoItemMeta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );
        zhangqicuizhuItemMeta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );
        minghongItemMeta.lore(
                List.of(
                        ComponentSet.RARE6
                )
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

        laoliehujiandaiItemMeta.setCustomModelData(101);
        xinbinjiandaiItemMeta.setCustomModelData(101);
        jinruijiandaiItemMeta.setCustomModelData(102);
        yingyanjiandaiItemMeta.setCustomModelData(103);
        cangguningwangItemMeta.setCustomModelData(104);
        niepanyunangItemMeta.setCustomModelData(105);

        fangshenduanbiItemMeta.setCustomModelData(1);
        tongzhiduanbiItemMeta.setCustomModelData(2);
        huiyidaoItemMeta.setCustomModelData(3);
        longyadaoItemMeta.setCustomModelData(4);
        zhangqicuizhuItemMeta.setCustomModelData(5);
        minghongItemMeta.setCustomModelData(6);

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


    }
}
