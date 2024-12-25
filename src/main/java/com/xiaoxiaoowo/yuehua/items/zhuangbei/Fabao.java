package com.xiaoxiaoowo.yuehua.items.zhuangbei;

import com.xiaoxiaoowo.yuehua.attribute.AttributeSet;
import com.xiaoxiaoowo.yuehua.commands.opcommand.R;
import com.xiaoxiaoowo.yuehua.guis.Recipe;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import com.xiaoxiaoowo.yuehua.utils.ZeroAttributeModifier;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Fabao {
    //通用
    public static final ItemStack ZHAOYAOJIN = new ItemStack(Material.IRON_PICKAXE, 1);
    public static final ItemStack YUFUCHEN = new ItemStack(Material.IRON_PICKAXE, 1);
    public static final ItemStack WUSEBUTIANSHI = new ItemStack(Material.IRON_PICKAXE, 1);

    public static final ItemStack YAOWANGHULU = new ItemStack(Material.IRON_PICKAXE, 1);
    public static final ItemStack CIXINMIAOLIAN = new ItemStack(Material.IRON_PICKAXE, 1);
    public static final ItemStack SHENXINYUGU = new ItemStack(Material.IRON_PICKAXE, 1);
    public static final ItemStack YINYANGZHANLONGJIAN = new ItemStack(Material.IRON_PICKAXE, 1);
    public static final ItemStack YUNLANGBAN = new ItemStack(Material.IRON_PICKAXE, 1);
    public static final ItemStack ZHENHUNYUXIAO = new ItemStack(Material.IRON_PICKAXE, 1);
    public static final ItemStack DIKUIHUALAN = new ItemStack(Material.IRON_PICKAXE, 1);
    public static final ItemStack XUANFENGZONGSHAN = new ItemStack(Material.IRON_PICKAXE, 1);

    public static final ItemStack TAIJIBAGUA = new ItemStack(Material.IRON_PICKAXE, 1);

    //战士

    //分支一，吸引仇恨
    public static final ItemStack JUEDOULING = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack LEIMINGGU = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack HUANSILIN = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack NIUMONUHOU = new ItemStack(Material.DIAMOND_PICKAXE, 1);

    //分支二，增伤
    public static final ItemStack DOUQISHI = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack PANGUANBI = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack MINSHENGJIAN = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack ZHENLEITIANCHUI = new ItemStack(Material.DIAMOND_PICKAXE, 1);

    //弓箭手

    //分支一，制造傀儡

    public static final ItemStack DIAOHUNGAN = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack SHELINZHU = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack YUJINPIN = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack TIANJISHENJIN = new ItemStack(Material.DIAMOND_PICKAXE, 1);

    //分支二，增伤
    public static final ItemStack RUIYINGYAN = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack DUOHUNTANG = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack MOYUANFOZHU = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack FUXINRUYI = new ItemStack(Material.DIAMOND_PICKAXE, 1);

    //炼丹

    //分支一，单点（直线）伤害
    public static final ItemStack LVYEXIANZONG = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack QINGNVHANSHUANG = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack ZHURONGKUYAN = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack ZHUDIANXUANJING = new ItemStack(Material.DIAMOND_PICKAXE, 1);

    //分支二，群体伤害
    public static final ItemStack BUHUNWANG = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack YANGSHOUJIAN = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack WUMINGMOYINLUO = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack SHETIANHUAXUELING = new ItemStack(Material.DIAMOND_PICKAXE, 1);

    //分支三，辅助队友
    public static final ItemStack KUYELING = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack LUOBEIJINPIN = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack PINYUSHUIYU = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack DIKONGYUMOQUAN = new ItemStack(Material.DIAMOND_PICKAXE, 1);

    //分支四，削弱敌人
    public static final ItemStack LUANSHENGU = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack JINGULIAN = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack JIANCHANGULIN = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    public static final ItemStack MODUOHUNFAN = new ItemStack(Material.DIAMOND_PICKAXE, 1);


    static {
        ItemMeta zhaoyaojinMeta = ZHAOYAOJIN.getItemMeta();
        ItemMeta yufuchenMeta = YUFUCHEN.getItemMeta();
        ItemMeta wusebutianshiMeta = WUSEBUTIANSHI.getItemMeta();
        ItemMeta yaowanghuluMeta = YAOWANGHULU.getItemMeta();
        ItemMeta cixinmiaolianMeta = CIXINMIAOLIAN.getItemMeta();
        ItemMeta shenxinyuguMeta = SHENXINYUGU.getItemMeta();
        ItemMeta yinyangzhanlongjianMeta = YINYANGZHANLONGJIAN.getItemMeta();
        ItemMeta yunlangbanMeta = YUNLANGBAN.getItemMeta();
        ItemMeta zhenhunyuxiaoMeta = ZHENHUNYUXIAO.getItemMeta();
        ItemMeta dikuihualanMeta = DIKUIHUALAN.getItemMeta();
        ItemMeta xuanfengzongshanMeta = XUANFENGZONGSHAN.getItemMeta();
        ItemMeta taijibaguaMeta = TAIJIBAGUA.getItemMeta();
        ItemMeta juedoulingMeta = JUEDOULING.getItemMeta();
        ItemMeta leimingguMeta = LEIMINGGU.getItemMeta();
        ItemMeta huansilinMeta = HUANSILIN.getItemMeta();
        ItemMeta niumonuhouMeta = NIUMONUHOU.getItemMeta();
        ItemMeta douqishiMeta = DOUQISHI.getItemMeta();
        ItemMeta panguanbiMeta = PANGUANBI.getItemMeta();
        ItemMeta minshengjianMeta = MINSHENGJIAN.getItemMeta();
        ItemMeta zhenleitianchuiMeta = ZHENLEITIANCHUI.getItemMeta();
        ItemMeta diohunganMeta = DIAOHUNGAN.getItemMeta();
        ItemMeta shelinzhuMeta = SHELINZHU.getItemMeta();
        ItemMeta yujinpinMeta = YUJINPIN.getItemMeta();
        ItemMeta tianjishenjinMeta = TIANJISHENJIN.getItemMeta();
        ItemMeta ruiyingyanMeta = RUIYINGYAN.getItemMeta();
        ItemMeta duohuntangMeta = DUOHUNTANG.getItemMeta();
        ItemMeta moyuanfozhuMeta = MOYUANFOZHU.getItemMeta();
        ItemMeta fuxinruyiMeta = FUXINRUYI.getItemMeta();
        ItemMeta lvyexianzongMeta = LVYEXIANZONG.getItemMeta();
        ItemMeta qingnvhuanshuangMeta = QINGNVHANSHUANG.getItemMeta();
        ItemMeta zhurongkuyanMeta = ZHURONGKUYAN.getItemMeta();
        ItemMeta zhudianxuanjingMeta = ZHUDIANXUANJING.getItemMeta();
        ItemMeta buhunwangMeta = BUHUNWANG.getItemMeta();
        ItemMeta yangshoujianMeta = YANGSHOUJIAN.getItemMeta();
        ItemMeta wumingmoyinluoMeta = WUMINGMOYINLUO.getItemMeta();
        ItemMeta shetianhuaxuelingMeta = SHETIANHUAXUELING.getItemMeta();
        ItemMeta kuyelingMeta = KUYELING.getItemMeta();
        ItemMeta luobeijinpinMeta = LUOBEIJINPIN.getItemMeta();
        ItemMeta pinyushuiyuMeta = PINYUSHUIYU.getItemMeta();
        ItemMeta dikongymoquanMeta = DIKONGYUMOQUAN.getItemMeta();
        ItemMeta luanshenguMeta = LUANSHENGU.getItemMeta();
        ItemMeta jingulianMeta = JINGULIAN.getItemMeta();
        ItemMeta jianchangulinMeta = JIANCHANGULIN.getItemMeta();
        ItemMeta moduohunfanMeta = MODUOHUNFAN.getItemMeta();


        zhaoyaojinMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        yufuchenMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        wusebutianshiMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        yaowanghuluMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        cixinmiaolianMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        shenxinyuguMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        yinyangzhanlongjianMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        yunlangbanMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhenhunyuxiaoMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        dikuihualanMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xuanfengzongshanMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        taijibaguaMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        juedoulingMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        leimingguMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        huansilinMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        niumonuhouMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        douqishiMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        panguanbiMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        minshengjianMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhenleitianchuiMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        diohunganMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        shelinzhuMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        yujinpinMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        tianjishenjinMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        ruiyingyanMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        duohuntangMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        moyuanfozhuMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        fuxinruyiMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        lvyexianzongMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        qingnvhuanshuangMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhurongkuyanMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhudianxuanjingMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        buhunwangMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        yangshoujianMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        wumingmoyinluoMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        shetianhuaxuelingMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        kuyelingMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        luobeijinpinMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        pinyushuiyuMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        dikongymoquanMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        luanshenguMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        jingulianMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        jianchangulinMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        moduohunfanMeta.addItemFlags(ZeroAttributeModifier.itemFlags);


        zhaoyaojinMeta.setUnbreakable(true);
        yufuchenMeta.setUnbreakable(true);
        wusebutianshiMeta.setUnbreakable(true);
        yaowanghuluMeta.setUnbreakable(true);
        cixinmiaolianMeta.setUnbreakable(true);
        shenxinyuguMeta.setUnbreakable(true);
        yinyangzhanlongjianMeta.setUnbreakable(true);
        yunlangbanMeta.setUnbreakable(true);
        zhenhunyuxiaoMeta.setUnbreakable(true);
        dikuihualanMeta.setUnbreakable(true);
        xuanfengzongshanMeta.setUnbreakable(true);
        taijibaguaMeta.setUnbreakable(true);
        juedoulingMeta.setUnbreakable(true);
        leimingguMeta.setUnbreakable(true);
        huansilinMeta.setUnbreakable(true);
        niumonuhouMeta.setUnbreakable(true);
        douqishiMeta.setUnbreakable(true);
        panguanbiMeta.setUnbreakable(true);
        minshengjianMeta.setUnbreakable(true);
        zhenleitianchuiMeta.setUnbreakable(true);
        diohunganMeta.setUnbreakable(true);
        shelinzhuMeta.setUnbreakable(true);
        yujinpinMeta.setUnbreakable(true);
        tianjishenjinMeta.setUnbreakable(true);
        ruiyingyanMeta.setUnbreakable(true);
        duohuntangMeta.setUnbreakable(true);
        moyuanfozhuMeta.setUnbreakable(true);
        fuxinruyiMeta.setUnbreakable(true);
        lvyexianzongMeta.setUnbreakable(true);
        qingnvhuanshuangMeta.setUnbreakable(true);
        zhurongkuyanMeta.setUnbreakable(true);
        zhudianxuanjingMeta.setUnbreakable(true);
        buhunwangMeta.setUnbreakable(true);
        yangshoujianMeta.setUnbreakable(true);
        wumingmoyinluoMeta.setUnbreakable(true);
        shetianhuaxuelingMeta.setUnbreakable(true);
        kuyelingMeta.setUnbreakable(true);
        luobeijinpinMeta.setUnbreakable(true);
        pinyushuiyuMeta.setUnbreakable(true);
        dikongymoquanMeta.setUnbreakable(true);
        luanshenguMeta.setUnbreakable(true);
        jingulianMeta.setUnbreakable(true);
        jianchangulinMeta.setUnbreakable(true);
        moduohunfanMeta.setUnbreakable(true);


        zhaoyaojinMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        yufuchenMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        wusebutianshiMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        yaowanghuluMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        cixinmiaolianMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        shenxinyuguMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        yinyangzhanlongjianMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        yunlangbanMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        zhenhunyuxiaoMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        dikuihualanMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        xuanfengzongshanMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        taijibaguaMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        juedoulingMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        leimingguMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        huansilinMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        niumonuhouMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        douqishiMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        panguanbiMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        minshengjianMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        zhenleitianchuiMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        diohunganMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        shelinzhuMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        yujinpinMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        tianjishenjinMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        ruiyingyanMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        duohuntangMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        moyuanfozhuMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        fuxinruyiMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        lvyexianzongMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        qingnvhuanshuangMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        zhurongkuyanMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        zhudianxuanjingMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        buhunwangMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        yangshoujianMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        wumingmoyinluoMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        shetianhuaxuelingMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        kuyelingMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        luobeijinpinMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        pinyushuiyuMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        dikongymoquanMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        luanshenguMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        jingulianMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        jianchangulinMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        moduohunfanMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);


        zhaoyaojinMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        yufuchenMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        wusebutianshiMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        yaowanghuluMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        cixinmiaolianMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        shenxinyuguMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        yinyangzhanlongjianMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        yunlangbanMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        zhenhunyuxiaoMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        dikuihualanMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        xuanfengzongshanMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        taijibaguaMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        juedoulingMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        leimingguMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        huansilinMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        niumonuhouMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        douqishiMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        panguanbiMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        minshengjianMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        zhenleitianchuiMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        diohunganMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        shelinzhuMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        yujinpinMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        tianjishenjinMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        ruiyingyanMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        duohuntangMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        moyuanfozhuMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        fuxinruyiMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        lvyexianzongMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        qingnvhuanshuangMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        zhurongkuyanMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        zhudianxuanjingMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        buhunwangMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        yangshoujianMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        wumingmoyinluoMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        shetianhuaxuelingMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        kuyelingMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        luobeijinpinMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        pinyushuiyuMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        dikongymoquanMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        luanshenguMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        jingulianMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        jianchangulinMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        moduohunfanMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);

        PersistentDataContainer pdczhaoyaojin = zhaoyaojinMeta.getPersistentDataContainer();
        PersistentDataContainer pdcyufuchen = yufuchenMeta.getPersistentDataContainer();
        PersistentDataContainer pdcwusebutianshi = wusebutianshiMeta.getPersistentDataContainer();
        PersistentDataContainer pdcyaowanghulu = yaowanghuluMeta.getPersistentDataContainer();
        PersistentDataContainer pdccixinmiaolian = cixinmiaolianMeta.getPersistentDataContainer();
        PersistentDataContainer pdcshenxinyugu = shenxinyuguMeta.getPersistentDataContainer();
        PersistentDataContainer pdcyinyangzhanlongjian = yinyangzhanlongjianMeta.getPersistentDataContainer();
        PersistentDataContainer pdcyunlangban = yunlangbanMeta.getPersistentDataContainer();
        PersistentDataContainer pdczhenhunyuxiao = zhenhunyuxiaoMeta.getPersistentDataContainer();
        PersistentDataContainer pdcdikuihualan = dikuihualanMeta.getPersistentDataContainer();
        PersistentDataContainer pdcxuanfengzongshan = xuanfengzongshanMeta.getPersistentDataContainer();
        PersistentDataContainer pdctaijibagua = taijibaguaMeta.getPersistentDataContainer();
        PersistentDataContainer pdctaijiling = juedoulingMeta.getPersistentDataContainer();
        PersistentDataContainer pdcleiminggu = leimingguMeta.getPersistentDataContainer();
        PersistentDataContainer pdchuansilin = huansilinMeta.getPersistentDataContainer();
        PersistentDataContainer pdcniumonuhou = niumonuhouMeta.getPersistentDataContainer();
        PersistentDataContainer pdcdouqishi = douqishiMeta.getPersistentDataContainer();
        PersistentDataContainer pdcpanguanbi = panguanbiMeta.getPersistentDataContainer();
        PersistentDataContainer pdcminshengjian = minshengjianMeta.getPersistentDataContainer();
        PersistentDataContainer pdczhenleitianchui = zhenleitianchuiMeta.getPersistentDataContainer();
        PersistentDataContainer pdcdiohungan = diohunganMeta.getPersistentDataContainer();
        PersistentDataContainer pdcshelinzhu = shelinzhuMeta.getPersistentDataContainer();
        PersistentDataContainer pdcyujinpin = yujinpinMeta.getPersistentDataContainer();
        PersistentDataContainer pdctianjishenjin = tianjishenjinMeta.getPersistentDataContainer();
        PersistentDataContainer pdcruiyingyan = ruiyingyanMeta.getPersistentDataContainer();
        PersistentDataContainer pdcduohuntang = duohuntangMeta.getPersistentDataContainer();
        PersistentDataContainer pdcmoyuanfozhu = moyuanfozhuMeta.getPersistentDataContainer();
        PersistentDataContainer pdcfuxinruyi = fuxinruyiMeta.getPersistentDataContainer();
        PersistentDataContainer pdclvyexianzong = lvyexianzongMeta.getPersistentDataContainer();
        PersistentDataContainer pdcqingnvhuanshuang = qingnvhuanshuangMeta.getPersistentDataContainer();
        PersistentDataContainer pdczhurongkuyan = zhurongkuyanMeta.getPersistentDataContainer();
        PersistentDataContainer pdczhudianxuanjing = zhudianxuanjingMeta.getPersistentDataContainer();
        PersistentDataContainer pdcbuhunwang = buhunwangMeta.getPersistentDataContainer();
        PersistentDataContainer pdcyangshoujian = yangshoujianMeta.getPersistentDataContainer();
        PersistentDataContainer pdcwumingmoyinluo = wumingmoyinluoMeta.getPersistentDataContainer();
        PersistentDataContainer pdcshetianhuaxueling = shetianhuaxuelingMeta.getPersistentDataContainer();
        PersistentDataContainer pdckuyeling = kuyelingMeta.getPersistentDataContainer();
        PersistentDataContainer pdcluobeijinpin = luobeijinpinMeta.getPersistentDataContainer();
        PersistentDataContainer pdcpinyushuiyu = pinyushuiyuMeta.getPersistentDataContainer();
        PersistentDataContainer pdcdikongymoquan = dikongymoquanMeta.getPersistentDataContainer();
        PersistentDataContainer pdcluanshengu = luanshenguMeta.getPersistentDataContainer();
        PersistentDataContainer pdcjingulian = jingulianMeta.getPersistentDataContainer();
        PersistentDataContainer pdcjianchangulin = jianchangulinMeta.getPersistentDataContainer();
        PersistentDataContainer pdcmoduohunfan = moduohunfanMeta.getPersistentDataContainer();

        pdczhaoyaojin.set(DataContainer.id, PersistentDataType.STRING, "zhaoYaoJin");
        pdcyufuchen.set(DataContainer.id, PersistentDataType.STRING, "yuFuChen");
        pdcwusebutianshi.set(DataContainer.id, PersistentDataType.STRING, "wuSeBuTianShi");
        pdcyaowanghulu.set(DataContainer.id, PersistentDataType.STRING, "yaoWangHuLu");
        pdccixinmiaolian.set(DataContainer.id, PersistentDataType.STRING, "ciXinMiaoLian");
        pdcshenxinyugu.set(DataContainer.id, PersistentDataType.STRING, "shenXinYuGu");
        pdcyinyangzhanlongjian.set(DataContainer.id, PersistentDataType.STRING, "yinYangZhanLongJian");
        pdcyunlangban.set(DataContainer.id, PersistentDataType.STRING, "yunLangBan");
        pdczhenhunyuxiao.set(DataContainer.id, PersistentDataType.STRING, "zhenHunYuXiao");
        pdcdikuihualan.set(DataContainer.id, PersistentDataType.STRING, "diKuiHuaLan");
        pdcxuanfengzongshan.set(DataContainer.id, PersistentDataType.STRING, "xuanFengZongShan");
        pdctaijibagua.set(DataContainer.id, PersistentDataType.STRING, "taiJiBaGua");
        pdctaijiling.set(DataContainer.id, PersistentDataType.STRING, "jueDouLing");
        pdcleiminggu.set(DataContainer.id, PersistentDataType.STRING, "leiMingGu");
        pdchuansilin.set(DataContainer.id, PersistentDataType.STRING, "huanSiLin");
        pdcniumonuhou.set(DataContainer.id, PersistentDataType.STRING, "niuMoNuHou");
        pdcdouqishi.set(DataContainer.id, PersistentDataType.STRING, "douQiShi");
        pdcpanguanbi.set(DataContainer.id, PersistentDataType.STRING, "panGuanBi");
        pdcminshengjian.set(DataContainer.id, PersistentDataType.STRING, "minShengJian");
        pdczhenleitianchui.set(DataContainer.id, PersistentDataType.STRING, "zhenLeiTianChui");
        pdcdiohungan.set(DataContainer.id, PersistentDataType.STRING, "dioHunGan");
        pdcshelinzhu.set(DataContainer.id, PersistentDataType.STRING, "sheLingZhu");
        pdcyujinpin.set(DataContainer.id, PersistentDataType.STRING, "yuJinPin");
        pdctianjishenjin.set(DataContainer.id, PersistentDataType.STRING, "tianJiShenJin");
        pdcruiyingyan.set(DataContainer.id, PersistentDataType.STRING, "ruiYingYan");
        pdcduohuntang.set(DataContainer.id, PersistentDataType.STRING, "duoHunTang");
        pdcmoyuanfozhu.set(DataContainer.id, PersistentDataType.STRING, "moYuanFoZhu");
        pdcfuxinruyi.set(DataContainer.id, PersistentDataType.STRING, "fuXinRuYi");
        pdclvyexianzong.set(DataContainer.id, PersistentDataType.STRING, "lvYeXianZong");
        pdcqingnvhuanshuang.set(DataContainer.id, PersistentDataType.STRING, "qingNvHuanShuang");
        pdczhurongkuyan.set(DataContainer.id, PersistentDataType.STRING, "zhuRongKuYan");
        pdczhudianxuanjing.set(DataContainer.id, PersistentDataType.STRING, "zhuDianXuanJing");
        pdcbuhunwang.set(DataContainer.id, PersistentDataType.STRING, "buHunWang");
        pdcyangshoujian.set(DataContainer.id, PersistentDataType.STRING, "yangShouJian");
        pdcwumingmoyinluo.set(DataContainer.id, PersistentDataType.STRING, "wuMingMoYinLuo");
        pdcshetianhuaxueling.set(DataContainer.id, PersistentDataType.STRING, "sheTianHuaXueLing");
        pdckuyeling.set(DataContainer.id, PersistentDataType.STRING, "kuYeLing");
        pdcluobeijinpin.set(DataContainer.id, PersistentDataType.STRING, "luoBeiJinPin");
        pdcpinyushuiyu.set(DataContainer.id, PersistentDataType.STRING, "pinYuShuiYu");
        pdcdikongymoquan.set(DataContainer.id, PersistentDataType.STRING, "diKongYmoQuan");
        pdcluanshengu.set(DataContainer.id, PersistentDataType.STRING, "luanShenGu");
        pdcjingulian.set(DataContainer.id, PersistentDataType.STRING, "jinGuLian");
        pdcjianchangulin.set(DataContainer.id, PersistentDataType.STRING, "jianChangGuLin");
        pdcmoduohunfan.set(DataContainer.id, PersistentDataType.STRING, "moDuoHunFan");


        pdczhaoyaojin.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdcyufuchen.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdcwusebutianshi.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdcyaowanghulu.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdccixinmiaolian.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdcshenxinyugu.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdcyinyangzhanlongjian.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdcyunlangban.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdczhenhunyuxiao.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdcdikuihualan.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdcxuanfengzongshan.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdctaijibagua.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdctaijiling.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcleiminggu.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdchuansilin.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcniumonuhou.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcdouqishi.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcpanguanbi.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcminshengjian.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdczhenleitianchui.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcdiohungan.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcshelinzhu.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcyujinpin.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdctianjishenjin.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcruiyingyan.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcduohuntang.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcmoyuanfozhu.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcfuxinruyi.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdclvyexianzong.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcqingnvhuanshuang.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdczhurongkuyan.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdczhudianxuanjing.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcbuhunwang.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcyangshoujian.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcwumingmoyinluo.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcshetianhuaxueling.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdckuyeling.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcluobeijinpin.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcpinyushuiyu.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcdikongymoquan.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcluanshengu.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcjingulian.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcjianchangulin.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcmoduohunfan.set(DataContainer.job, PersistentDataType.INTEGER, 3);

        pdczhaoyaojin.set(DataContainer.slot, PersistentDataType.INTEGER, 8);
        pdcyufuchen.set(DataContainer.slot, PersistentDataType.INTEGER, 8);
        pdcwusebutianshi.set(DataContainer.slot, PersistentDataType.INTEGER, 8);
        pdcyaowanghulu.set(DataContainer.slot, PersistentDataType.INTEGER, 8);
        pdccixinmiaolian.set(DataContainer.slot, PersistentDataType.INTEGER, 8);
        pdcshenxinyugu.set(DataContainer.slot, PersistentDataType.INTEGER, 8);
        pdcyinyangzhanlongjian.set(DataContainer.slot, PersistentDataType.INTEGER, 8);
        pdcyunlangban.set(DataContainer.slot, PersistentDataType.INTEGER, 8);
        pdczhenhunyuxiao.set(DataContainer.slot, PersistentDataType.INTEGER, 8);
        pdcdikuihualan.set(DataContainer.slot, PersistentDataType.INTEGER, 8);
        pdcxuanfengzongshan.set(DataContainer.slot, PersistentDataType.INTEGER, 8);
        pdctaijibagua.set(DataContainer.slot, PersistentDataType.INTEGER, 8);

        pdctaijiling.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdcleiminggu.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdchuansilin.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdcniumonuhou.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdcdouqishi.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdcpanguanbi.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdcminshengjian.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdczhenleitianchui.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdcdiohungan.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdcshelinzhu.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdcyujinpin.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdctianjishenjin.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdcruiyingyan.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdcduohuntang.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdcmoyuanfozhu.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdcfuxinruyi.set(DataContainer.slot, PersistentDataType.INTEGER, 2);



        pdclvyexianzong.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdcqingnvhuanshuang.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdczhurongkuyan.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdczhudianxuanjing.set(DataContainer.slot, PersistentDataType.INTEGER, 2);

        pdcbuhunwang.set(DataContainer.slot, PersistentDataType.INTEGER, 3);
        pdcyangshoujian.set(DataContainer.slot, PersistentDataType.INTEGER, 3);
        pdcwumingmoyinluo.set(DataContainer.slot, PersistentDataType.INTEGER, 3);
        pdcshetianhuaxueling.set(DataContainer.slot, PersistentDataType.INTEGER, 3);

        pdckuyeling.set(DataContainer.slot, PersistentDataType.INTEGER, 4);
        pdcluobeijinpin.set(DataContainer.slot, PersistentDataType.INTEGER, 4);
        pdcpinyushuiyu.set(DataContainer.slot, PersistentDataType.INTEGER, 4);
        pdcdikongymoquan.set(DataContainer.slot, PersistentDataType.INTEGER, 4);

        pdcluanshengu.set(DataContainer.slot, PersistentDataType.INTEGER, 5);
        pdcjingulian.set(DataContainer.slot, PersistentDataType.INTEGER, 5);
        pdcjianchangulin.set(DataContainer.slot, PersistentDataType.INTEGER, 5);
        pdcmoduohunfan.set(DataContainer.slot, PersistentDataType.INTEGER, 5);

        zhaoyaojinMeta.displayName(Component.text("照妖镜[法宝]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        yufuchenMeta.displayName(Component.text("羽拂尘[法宝]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        wusebutianshiMeta.displayName(Component.text("五色补天石[法宝]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        yaowanghuluMeta.displayName(Component.text("药王葫芦[法宝]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        cixinmiaolianMeta.displayName(Component.text("慈心妙莲[法宝]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        shenxinyuguMeta.displayName(Component.text("神行渔鼓[法宝]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        yinyangzhanlongjianMeta.displayName(Component.text("阴阳斩龙剑[法宝]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        yunlangbanMeta.displayName(Component.text("云阳板[法宝]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        zhenhunyuxiaoMeta.displayName(Component.text("镇魂玉箫[法宝]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        dikuihualanMeta.displayName(Component.text("地魁花篮[法宝]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        xuanfengzongshanMeta.displayName(Component.text("玄风棕扇[法宝]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        taijibaguaMeta.displayName(Component.text("太极八卦[法宝]").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        juedoulingMeta.displayName(Component.text("决斗令[法宝]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        leimingguMeta.displayName(Component.text("雷鸣鼓[法宝]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        huansilinMeta.displayName(Component.text("幻思铃[法宝]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        niumonuhouMeta.displayName(Component.text("牛魔怒吼[法宝]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        douqishiMeta.displayName(Component.text("斗气石[法宝]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        panguanbiMeta.displayName(Component.text("判官笔[法宝]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        minshengjianMeta.displayName(Component.text("悯生剑[法宝]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        zhenleitianchuiMeta.displayName(Component.text("震雷天锤[法宝]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        diohunganMeta.displayName(Component.text("钓魂竿[法宝]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        shelinzhuMeta.displayName(Component.text("摄灵珠[法宝]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        yujinpinMeta.displayName(Component.text("玉净瓶[法宝]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        tianjishenjinMeta.displayName(Component.text("天机神镜[法宝]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        ruiyingyanMeta.displayName(Component.text("锐鹰眼[法宝]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        duohuntangMeta.displayName(Component.text("夺魂汤[法宝]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        moyuanfozhuMeta.displayName(Component.text("摩愿佛珠[法宝]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        fuxinruyiMeta.displayName(Component.text("浮行如意[法宝]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        lvyexianzongMeta.displayName(Component.text("绿野仙踪[法宝]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        qingnvhuanshuangMeta.displayName(Component.text("青女寒霜[法宝]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        zhurongkuyanMeta.displayName(Component.text("祝融酷炎[法宝]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        zhudianxuanjingMeta.displayName(Component.text("朱电玄镜[法宝]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        buhunwangMeta.displayName(Component.text("捕魂网[法宝]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        yangshoujianMeta.displayName(Component.text("阳寿剪[法宝]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        wumingmoyinluoMeta.displayName(Component.text("无冥魔音螺[法宝]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        shetianhuaxuelingMeta.displayName(Component.text("奢天化雪令[法宝]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        kuyelingMeta.displayName(Component.text("枯叶灵[法宝]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        luobeijinpinMeta.displayName(Component.text("罗悲净瓶[法宝]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        pinyushuiyuMeta.displayName(Component.text("萍雨水盂[法宝]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        dikongymoquanMeta.displayName(Component.text("帝空御魔圈[法宝]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        luanshenguMeta.displayName(Component.text("乱神菇[法宝]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        jingulianMeta.displayName(Component.text("禁锢镰[法宝]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        jianchangulinMeta.displayName(Component.text("间忏蛊铃[法宝]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        moduohunfanMeta.displayName(Component.text("摩多魂幡[法宝]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        zhaoyaojinMeta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBALL,
                                ComponentSet.Act9,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("zhaoYaoJin", 2),
                                ComponentSet.SHORTJINENG
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

        yufuchenMeta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBALL,
                                ComponentSet.Act9,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("yuFuChen", 2),
                                ComponentSet.SHORTJINENG
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

        wusebutianshiMeta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBALL,
                                ComponentSet.Act9,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("wuSeBuTianShi", 2),
                                ComponentSet.SHORTJINENG
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

        yaowanghuluMeta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBALL,
                                ComponentSet.Act9,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("yaoWangHuLu", 2),
                                ComponentSet.SHORTJINENG
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

        cixinmiaolianMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.JOBALL,
                        ComponentSet.Act9,
                        ComponentSet.SHORTSHUXIN,
                        ComponentSet.SHORTJINENG
                )
        );

        shenxinyuguMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.JOBALL,
                        ComponentSet.Act9,
                        ComponentSet.SHORTSHUXIN,
                        ComponentSet.SHORTJINENG
                )
        );

        yinyangzhanlongjianMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.JOBALL,
                        ComponentSet.Act9,
                        ComponentSet.SHORTSHUXIN,
                        ComponentSet.SHORTJINENG
                )
        );

        yunlangbanMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.JOBALL,
                        ComponentSet.Act9,
                        ComponentSet.SHORTSHUXIN,
                        ComponentSet.SHORTJINENG
                )
        );

        zhenhunyuxiaoMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.JOBALL,
                        ComponentSet.Act9,
                        ComponentSet.SHORTSHUXIN,
                        ComponentSet.SHORTJINENG
                )
        );

        dikuihualanMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.JOBALL,
                        ComponentSet.Act9,
                        ComponentSet.SHORTSHUXIN,
                        ComponentSet.SHORTJINENG
                )
        );

        xuanfengzongshanMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.JOBALL,
                        ComponentSet.Act9,
                        ComponentSet.SHORTSHUXIN,
                        ComponentSet.SHORTJINENG
                )
        );

        taijibaguaMeta.lore(
                List.of(
                        ComponentSet.RARE8,
                        ComponentSet.JOBDAN,
                        ComponentSet.Act9,
                        ComponentSet.SHORTSHUXIN,
                        ComponentSet.SHORTJINENG
                )
        );

        juedoulingMeta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act3,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("jueDouLing", 2),
                                ComponentSet.SHORTJINENG
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

        leimingguMeta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act3,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("leiMingGu", 2),
                                ComponentSet.SHORTJINENG
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

        huansilinMeta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act3,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("huanSiLin", 2),
                                ComponentSet.SHORTJINENG
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

        niumonuhouMeta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act3,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("niuMoNuHou", 2),
                                ComponentSet.SHORTJINENG
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

        douqishiMeta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act3,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("douQiShi", 2),
                                ComponentSet.SHORTJINENG
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

        panguanbiMeta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act3,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("panGuanBi", 2),
                                ComponentSet.SHORTJINENG
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

        minshengjianMeta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act3,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("minShengJian", 2),
                                ComponentSet.SHORTJINENG
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

        zhenleitianchuiMeta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act3,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("zhenLeiTianChui", 2),
                                ComponentSet.SHORTJINENG
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

        diohunganMeta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act3,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("dioHunGan", 2),
                                ComponentSet.SHORTJINENG
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

        shelinzhuMeta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act3,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("sheLingZhu", 2),
                                ComponentSet.SHORTJINENG
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

        yujinpinMeta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act3,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("yuJinPin", 2),
                                ComponentSet.SHORTJINENG
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

        tianjishenjinMeta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act3,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("tianJiShenJin", 2),
                                ComponentSet.SHORTJINENG
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

        ruiyingyanMeta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act3,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("ruiYingYan", 2),
                                ComponentSet.SHORTJINENG
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

        duohuntangMeta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act3,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("duoHunTang", 2),
                                ComponentSet.SHORTJINENG
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

        moyuanfozhuMeta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act3,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("moYuanFoZhu", 2),
                                ComponentSet.SHORTJINENG
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

        fuxinruyiMeta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act3,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("fuXinRuYi", 2),
                                ComponentSet.SHORTJINENG
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

        lvyexianzongMeta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act3,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("lvYeXianZong", 2),
                                ComponentSet.SHORTJINENG
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

        qingnvhuanshuangMeta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act3,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("qingNvHuanShuang", 2),
                                ComponentSet.SHORTJINENG
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

        zhurongkuyanMeta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act3,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("zhuRongKuYan", 2),
                                ComponentSet.SHORTJINENG
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

        zhudianxuanjingMeta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act3,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("zhuDianXuanJing", 2),
                                ComponentSet.SHORTJINENG
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

        buhunwangMeta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act4,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("buHunWang", 2),
                                ComponentSet.SHORTJINENG
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

        yangshoujianMeta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act4,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("yangShouJian", 2),
                                ComponentSet.SHORTJINENG
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

        wumingmoyinluoMeta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act4,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("wuMingMoYinLuo", 2),
                                ComponentSet.SHORTJINENG
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

        shetianhuaxuelingMeta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act4,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("sheTianHuaXueLing", 2),
                                ComponentSet.SHORTJINENG
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

        kuyelingMeta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act5,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("kuYeLing", 2),
                                ComponentSet.SHORTJINENG
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

        luobeijinpinMeta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act5,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("luoBeiJinPin", 2),
                                ComponentSet.SHORTJINENG
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

        pinyushuiyuMeta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act5,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("pinYuShuiYu", 2),
                                ComponentSet.SHORTJINENG
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

        dikongymoquanMeta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act5,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("diKongYmoQuan", 2),
                                ComponentSet.SHORTJINENG
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

        luanshenguMeta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act6,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("luanShenGu", 2),
                                ComponentSet.SHORTJINENG
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

        jingulianMeta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act6,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("jinGuLian", 2),
                                ComponentSet.SHORTJINENG
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

        jianchangulinMeta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act6,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("jianChangGuLin", 2),
                                ComponentSet.SHORTJINENG
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

        moduohunfanMeta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act6,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("moDuoHunFan", 2),
                                ComponentSet.SHORTJINENG
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


        zhaoyaojinMeta.setCustomModelData(1);
        yufuchenMeta.setCustomModelData(2);
        wusebutianshiMeta.setCustomModelData(3);
        yaowanghuluMeta.setCustomModelData(4);
        cixinmiaolianMeta.setCustomModelData(5);
        shenxinyuguMeta.setCustomModelData(6);
        yinyangzhanlongjianMeta.setCustomModelData(7);
        yunlangbanMeta.setCustomModelData(8);
        zhenhunyuxiaoMeta.setCustomModelData(9);
        dikuihualanMeta.setCustomModelData(10);
        xuanfengzongshanMeta.setCustomModelData(11);
        taijibaguaMeta.setCustomModelData(12);

        juedoulingMeta.setCustomModelData(7001);
        leimingguMeta.setCustomModelData(7002);
        huansilinMeta.setCustomModelData(7003);
        niumonuhouMeta.setCustomModelData(7004);
        douqishiMeta.setCustomModelData(7101);
        panguanbiMeta.setCustomModelData(7102);
        minshengjianMeta.setCustomModelData(7103);
        zhenleitianchuiMeta.setCustomModelData(7104);

        diohunganMeta.setCustomModelData(8001);
        shelinzhuMeta.setCustomModelData(8002);
        yujinpinMeta.setCustomModelData(8003);
        tianjishenjinMeta.setCustomModelData(8004);
        ruiyingyanMeta.setCustomModelData(8101);
        duohuntangMeta.setCustomModelData(8102);
        moyuanfozhuMeta.setCustomModelData(8103);
        fuxinruyiMeta.setCustomModelData(8104);

        lvyexianzongMeta.setCustomModelData(9001);
        qingnvhuanshuangMeta.setCustomModelData(9002);
        zhurongkuyanMeta.setCustomModelData(9003);
        zhudianxuanjingMeta.setCustomModelData(9004);

        buhunwangMeta.setCustomModelData(9101);
        yangshoujianMeta.setCustomModelData(9102);
        wumingmoyinluoMeta.setCustomModelData(9103);
        shetianhuaxuelingMeta.setCustomModelData(9104);

        kuyelingMeta.setCustomModelData(9201);
        luobeijinpinMeta.setCustomModelData(9202);
        pinyushuiyuMeta.setCustomModelData(9203);
        dikongymoquanMeta.setCustomModelData(9204);

        luanshenguMeta.setCustomModelData(9301);
        jingulianMeta.setCustomModelData(9302);
        jianchangulinMeta.setCustomModelData(9303);
        moduohunfanMeta.setCustomModelData(9304);

        ZHAOYAOJIN.setItemMeta(zhaoyaojinMeta);
        YUFUCHEN.setItemMeta(yufuchenMeta);
        WUSEBUTIANSHI.setItemMeta(wusebutianshiMeta);
        YAOWANGHULU.setItemMeta(yaowanghuluMeta);
        CIXINMIAOLIAN.setItemMeta(cixinmiaolianMeta);
        SHENXINYUGU.setItemMeta(shenxinyuguMeta);
        YINYANGZHANLONGJIAN.setItemMeta(yinyangzhanlongjianMeta);
        YUNLANGBAN.setItemMeta(yunlangbanMeta);
        ZHENHUNYUXIAO.setItemMeta(zhenhunyuxiaoMeta);
        DIKUIHUALAN.setItemMeta(dikuihualanMeta);
        XUANFENGZONGSHAN.setItemMeta(xuanfengzongshanMeta);
        TAIJIBAGUA.setItemMeta(taijibaguaMeta);
        JUEDOULING.setItemMeta(juedoulingMeta);
        LEIMINGGU.setItemMeta(leimingguMeta);
        HUANSILIN.setItemMeta(huansilinMeta);
        NIUMONUHOU.setItemMeta(niumonuhouMeta);
        DOUQISHI.setItemMeta(douqishiMeta);
        PANGUANBI.setItemMeta(panguanbiMeta);
        MINSHENGJIAN.setItemMeta(minshengjianMeta);
        ZHENLEITIANCHUI.setItemMeta(zhenleitianchuiMeta);
        DIAOHUNGAN.setItemMeta(diohunganMeta);
        SHELINZHU.setItemMeta(shelinzhuMeta);
        YUJINPIN.setItemMeta(yujinpinMeta);
        TIANJISHENJIN.setItemMeta(tianjishenjinMeta);
        RUIYINGYAN.setItemMeta(ruiyingyanMeta);
        DUOHUNTANG.setItemMeta(duohuntangMeta);
        MOYUANFOZHU.setItemMeta(moyuanfozhuMeta);
        FUXINRUYI.setItemMeta(fuxinruyiMeta);
        LVYEXIANZONG.setItemMeta(lvyexianzongMeta);
        QINGNVHANSHUANG.setItemMeta(qingnvhuanshuangMeta);
        ZHURONGKUYAN.setItemMeta(zhurongkuyanMeta);
        ZHUDIANXUANJING.setItemMeta(zhudianxuanjingMeta);
        BUHUNWANG.setItemMeta(buhunwangMeta);
        YANGSHOUJIAN.setItemMeta(yangshoujianMeta);
        WUMINGMOYINLUO.setItemMeta(wumingmoyinluoMeta);
        SHETIANHUAXUELING.setItemMeta(shetianhuaxuelingMeta);
        KUYELING.setItemMeta(kuyelingMeta);
        LUOBEIJINPIN.setItemMeta(luobeijinpinMeta);
        PINYUSHUIYU.setItemMeta(pinyushuiyuMeta);
        DIKONGYUMOQUAN.setItemMeta(dikongymoquanMeta);
        LUANSHENGU.setItemMeta(luanshenguMeta);
        JINGULIAN.setItemMeta(jingulianMeta);
        JIANCHANGULIN.setItemMeta(jianchangulinMeta);
        MODUOHUNFAN.setItemMeta(moduohunfanMeta);


    }

    public static void putId(){
        Recipe.idToItem.put("zhaoYaoJin",ZHAOYAOJIN);
        Recipe.idToItem.put("yuFuChen",YUFUCHEN);
        Recipe.idToItem.put("wuSeBuTianShi", WUSEBUTIANSHI);

        Recipe.idToItem.put("yaoWangHuLu", YAOWANGHULU);
        Recipe.idToItem.put("ciXinMiaoLian", CIXINMIAOLIAN);
        Recipe.idToItem.put("shenXinYuGu", SHENXINYUGU);
        Recipe.idToItem.put("yinYangZhanLongJian", YINYANGZHANLONGJIAN);
        Recipe.idToItem.put("yunLangBan", YUNLANGBAN);
        Recipe.idToItem.put("zhenHunYuXiao", ZHENHUNYUXIAO);
        Recipe.idToItem.put("diKuiHuaLan", DIKUIHUALAN);
        Recipe.idToItem.put("xuanFengZongShan", XUANFENGZONGSHAN);
        Recipe.idToItem.put("taiJiBaGua", TAIJIBAGUA);

        Recipe.idToItem.put("jueDouLing", JUEDOULING);
        Recipe.idToItem.put("leiMingGu", LEIMINGGU);
        Recipe.idToItem.put("huanSiLin", HUANSILIN);
        Recipe.idToItem.put("niuMoNuHou", NIUMONUHOU);

        Recipe.idToItem.put("douQiShi", DOUQISHI);
        Recipe.idToItem.put("panGuanBi", PANGUANBI);
        Recipe.idToItem.put("minShengJian", MINSHENGJIAN);
        Recipe.idToItem.put("zhenLeiTianChui", ZHENLEITIANCHUI);

        Recipe.idToItem.put("dioHunGan", DIAOHUNGAN);
        Recipe.idToItem.put("sheLingZhu", SHELINZHU);
        Recipe.idToItem.put("yuJinPin", YUJINPIN);
        Recipe.idToItem.put("tianJiShenJin", TIANJISHENJIN);

        Recipe.idToItem.put("ruiYingYan", RUIYINGYAN);
        Recipe.idToItem.put("duoHunTang", DUOHUNTANG);
        Recipe.idToItem.put("moYuanFoZhu", MOYUANFOZHU);
        Recipe.idToItem.put("fuXinRuYi", FUXINRUYI);

        Recipe.idToItem.put("lvYeXianZong", LVYEXIANZONG);
        Recipe.idToItem.put("qingNvHuanShuang", QINGNVHANSHUANG);
        Recipe.idToItem.put("zhuRongKuYan", ZHURONGKUYAN);
        Recipe.idToItem.put("zhuDianXuanJing", ZHUDIANXUANJING);

        Recipe.idToItem.put("buHunWang", BUHUNWANG);
        Recipe.idToItem.put("yangShouJian", YANGSHOUJIAN);
        Recipe.idToItem.put("wuMingMoYinLuo", WUMINGMOYINLUO);
        Recipe.idToItem.put("sheTianHuaXueLing", SHETIANHUAXUELING);

        Recipe.idToItem.put("kuYeLing", KUYELING);
        Recipe.idToItem.put("luoBeiJinPin", LUOBEIJINPIN);
        Recipe.idToItem.put("pinYuShuiYu", PINYUSHUIYU);
        Recipe.idToItem.put("diKongYmoQuan", DIKONGYUMOQUAN);

        Recipe.idToItem.put("luanShenGu", LUANSHENGU);
        Recipe.idToItem.put("jinGuLian", JINGULIAN);
        Recipe.idToItem.put("jianChangGuLin", JIANCHANGULIN);
        Recipe.idToItem.put("moDuoHunFan", MODUOHUNFAN);
    }
}
