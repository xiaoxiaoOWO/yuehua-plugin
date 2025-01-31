package com.xiaoxiaoowo.yuehua.items.monsterzhuangbei;

import io.papermc.paper.datacomponent.DataComponentTypes;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Banner;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.inventory.meta.ItemMeta;

public final class Weapon {
    //武器
    //战士
    public static final ItemStack TAO_MU_JIAN = new ItemStack(Material.PRISMARINE_SHARD);

    //破军
    public static final ItemStack KAI_SHAN_DAO = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack CHI_TONG_JIAN = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack PO_KONG_FU = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack SAN_BAO_YU_RU_YI = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack XUAN_YUAN = new ItemStack(Material.PRISMARINE_SHARD);

    //金钟
    public static final ItemStack QIN_TONG_JIAN = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack JU_TONG_ZHAN_CHUI = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack TAI_JI_JIAN = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack KUN_LUN_FEI_XIAN_JIAN = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack TAI_E = new ItemStack(Material.PRISMARINE_SHARD);

    //探云
    public static final ItemStack YIN_YUE_QIANG = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack HONG_YIN_QIANG = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack YOU_LONG_QIANG = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack HU_TOU_ZHAN_JIN_QIANG = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack RU_YI_JIN_GU_BANG = new ItemStack(Material.PRISMARINE_SHARD);

    //战士，暗器
    public static final ItemStack FEIREN = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack JINRUIFEIREN = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack WUSHENGXIUJIAN = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack HUIXUANTAJI = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack WUYINWUZONG = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack YANWANGTIE = new ItemStack(Material.PRISMARINE_SHARD);

    //弓箭手，火铳
    public static final ItemStack HEITIECHONG = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack HUANGTONGCHONG = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack MINGYUE = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack CANLAN = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack JINJING = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack XIAOTIAN = new ItemStack(Material.PRISMARINE_SHARD);

    //炼丹师，灵乐
    public static final ItemStack XIAO = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack QINFENGYINYIN = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack LIUSHUICHANCHAN = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack BUQICHUNYU = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack SANSHENGZHENHUN = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack JIUFENGLAIYI = new ItemStack(Material.PRISMARINE_SHARD);

    //分支一，吸引仇恨
    public static final ItemStack JUEDOULING = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack LEIMINGGU = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack HUANSILIN = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack NIUMONUHOU = new ItemStack(Material.PRISMARINE_SHARD, 1);

    //分支二，增伤
    public static final ItemStack DOUQISHI = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack PANGUANBI = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack MINSHENGJIAN = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack ZHENLEITIANCHUI = new ItemStack(Material.PRISMARINE_SHARD, 1);

    //弓箭手

    //分支一，制造傀儡

    public static final ItemStack DIAOHUNGAN = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack SHELINZHU = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack YUJINPIN = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack TIANJISHENJIN = new ItemStack(Material.PRISMARINE_SHARD, 1);

    //分支二，增伤
    public static final ItemStack RUIYINGYAN = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack DUOHUNTANG = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack MOYUANFOZHU = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack FUXINRUYI = new ItemStack(Material.PRISMARINE_SHARD, 1);

    //炼丹

    //分支一，单点（直线）伤害
    public static final ItemStack LVYEXIANZONG = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack QINGNVHANSHUANG = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack ZHURONGKUYAN = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack ZHUDIANXUANJING = new ItemStack(Material.PRISMARINE_SHARD, 1);

    //分支二，群体伤害
    public static final ItemStack BUHUNWANG = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack YANGSHOUJIAN = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack WUMINGMOYINLUO = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack SHETIANHUAXUELING = new ItemStack(Material.PRISMARINE_SHARD, 1);

    //分支三，辅助队友
    public static final ItemStack KUYELING = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack LUOBEIJINPIN = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack PINYUSHUIYU = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack DIKONGYUMOQUAN = new ItemStack(Material.PRISMARINE_SHARD, 1);

    //分支四，削弱敌人
    public static final ItemStack LUANSHENGU = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack JINGULIAN = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack JIANCHANGULIN = new ItemStack(Material.PRISMARINE_SHARD, 1);
    public static final ItemStack MODUOHUNFAN = new ItemStack(Material.PRISMARINE_SHARD, 1);

    //炉子
    public static final ItemStack HEI_TIE_GUO = new ItemStack(Material.RABBIT_HIDE);
    public static final ItemStack QIN_TONG_GUO = new ItemStack(Material.RABBIT_HIDE);
    public static final ItemStack LIAN_DAN_LU = new ItemStack(Material.RABBIT_HIDE);
    public static final ItemStack SUO_HUN_LU = new ItemStack(Material.RABBIT_HIDE);
    public static final ItemStack QI_SHA_DING = new ItemStack(Material.RABBIT_HIDE);
    public static final ItemStack HUN_YUAN_SHEN_DING = new ItemStack(Material.RABBIT_HIDE);

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

    //通用法宝
    public static final ItemStack ZHAOYAOJIN = new ItemStack(Material.PRISMARINE_CRYSTALS, 1);
    public static final ItemStack YUFUCHEN = new ItemStack(Material.PRISMARINE_CRYSTALS, 1);
    public static final ItemStack WUSEBUTIANSHI = new ItemStack(Material.PRISMARINE_CRYSTALS, 1);

    public static final ItemStack YAOWANGHULU = new ItemStack(Material.PRISMARINE_CRYSTALS, 1);
    public static final ItemStack CIXINMIAOLIAN = new ItemStack(Material.PRISMARINE_CRYSTALS, 1);
    public static final ItemStack SHENXINYUGU = new ItemStack(Material.PRISMARINE_CRYSTALS, 1);
    public static final ItemStack YINYANGZHANLONGJIAN = new ItemStack(Material.PRISMARINE_CRYSTALS, 1);
    public static final ItemStack YUNLANGBAN = new ItemStack(Material.PRISMARINE_CRYSTALS, 1);
    public static final ItemStack ZHENHUNYUXIAO = new ItemStack(Material.PRISMARINE_CRYSTALS, 1);
    public static final ItemStack DIKUIHUALAN = new ItemStack(Material.PRISMARINE_CRYSTALS, 1);
    public static final ItemStack XUANFENGZONGSHAN = new ItemStack(Material.PRISMARINE_CRYSTALS, 1);

    public static final ItemStack TAIJIBAGUA = new ItemStack(Material.PRISMARINE_CRYSTALS, 1);


    //盾牌
    public static final ItemStack LAOZHANSHIDUNPAI = new ItemStack(Material.SHIELD);
    public static final ItemStack XINBINDUNPAI = new ItemStack(Material.SHIELD);
    public static final ItemStack JINRUIDUNPAI = new ItemStack(Material.SHIELD);
    public static final ItemStack CHISEYUEHUO = new ItemStack(Material.SHIELD);
    public static final ItemStack JINGANGBUHUAI = new ItemStack(Material.SHIELD);
    public static final ItemStack CHENBINLUOXUE = new ItemStack(Material.SHIELD);


    static {
        ItemStack shield = new ItemStack(Material.SHIELD);
        ItemStack diamond_pickaxe = new ItemStack(Material.PRISMARINE_SHARD);
        ItemStack iron_pickaxe = new ItemStack(Material.PRISMARINE_CRYSTALS);
        ItemStack golden_pickaxe = new ItemStack(Material.RABBIT_HIDE);
        ItemStack netherite_pickaxe = new ItemStack(Material.ANGLER_POTTERY_SHERD);

        ItemMeta shieldMeta = shield.getItemMeta();
        ItemMeta diamond_pickaxeMeta = diamond_pickaxe.getItemMeta();
        ItemMeta iron_pickaxeMeta = iron_pickaxe.getItemMeta();
        ItemMeta golden_pickaxeMeta = golden_pickaxe.getItemMeta();
        ItemMeta netherite_pickaxeMeta = netherite_pickaxe.getItemMeta();


        ItemMeta taomujianMeta = diamond_pickaxeMeta.clone();
        TAO_MU_JIAN.setItemMeta(taomujianMeta);

        ItemMeta kaishandaoMeta = diamond_pickaxeMeta.clone();
        KAI_SHAN_DAO.setItemMeta(kaishandaoMeta);

        ItemMeta chitongjianMeta = diamond_pickaxeMeta.clone();
        CHI_TONG_JIAN.setItemMeta(chitongjianMeta);

        ItemMeta pokongfuMeta = diamond_pickaxeMeta.clone();
        PO_KONG_FU.setItemMeta(pokongfuMeta);

        ItemMeta sanbaoyuruyiMeta = diamond_pickaxeMeta.clone();
        SAN_BAO_YU_RU_YI.setItemMeta(sanbaoyuruyiMeta);

        ItemMeta xuanyuanMeta = diamond_pickaxeMeta.clone();
        XUAN_YUAN.setItemMeta(xuanyuanMeta);

        ItemMeta qintongjianMeta = diamond_pickaxeMeta.clone();
        QIN_TONG_JIAN.setItemMeta(qintongjianMeta);

        ItemMeta jutongzhanchuiMeta = diamond_pickaxeMeta.clone();
        JU_TONG_ZHAN_CHUI.setItemMeta(jutongzhanchuiMeta);

        ItemMeta taiJiJianMeta = diamond_pickaxeMeta.clone();
        TAI_JI_JIAN.setItemMeta(taiJiJianMeta);

        ItemMeta kunlunfeixianjianMeta = diamond_pickaxeMeta.clone();
        KUN_LUN_FEI_XIAN_JIAN.setItemMeta(kunlunfeixianjianMeta);

        ItemMeta taiEMeta = diamond_pickaxeMeta.clone();
        TAI_E.setItemMeta(taiEMeta);

        ItemMeta yinyueqiangMeta = diamond_pickaxeMeta.clone();
        YIN_YUE_QIANG.setItemMeta(yinyueqiangMeta);

        ItemMeta hongyinqiangMeta = diamond_pickaxeMeta.clone();
        HONG_YIN_QIANG.setItemMeta(hongyinqiangMeta);

        ItemMeta youlongqiangMeta = diamond_pickaxeMeta.clone();
        YOU_LONG_QIANG.setItemMeta(youlongqiangMeta);

        ItemMeta hutouzhanjinqiangMeta = diamond_pickaxeMeta.clone();
        HU_TOU_ZHAN_JIN_QIANG.setItemMeta(hutouzhanjinqiangMeta);

        ItemMeta ruyijingubangMeta = diamond_pickaxeMeta.clone();
        RU_YI_JIN_GU_BANG.setItemMeta(ruyijingubangMeta);

        ItemMeta feirenMeta = diamond_pickaxeMeta.clone();
        FEIREN.setItemMeta(feirenMeta);

        ItemMeta jinruifeirenMeta = diamond_pickaxeMeta.clone();
        JINRUIFEIREN.setItemMeta(jinruifeirenMeta);

        ItemMeta wushengxiujianMeta = diamond_pickaxeMeta.clone();
        WUSHENGXIUJIAN.setItemMeta(wushengxiujianMeta);

        ItemMeta huixuantajiMeta = diamond_pickaxeMeta.clone();
        HUIXUANTAJI.setItemMeta(huixuantajiMeta);

        ItemMeta wuyinwuzongMeta = diamond_pickaxeMeta.clone();
        WUYINWUZONG.setItemMeta(wuyinwuzongMeta);

        ItemMeta yanwangtieMeta = diamond_pickaxeMeta.clone();
        YANWANGTIE.setItemMeta(yanwangtieMeta);

        ItemMeta heitiechongMeta = diamond_pickaxeMeta.clone();
        HEITIECHONG.setItemMeta(heitiechongMeta);

        ItemMeta huangtongchongMeta = diamond_pickaxeMeta.clone();
        HUANGTONGCHONG.setItemMeta(huangtongchongMeta);

        ItemMeta mingyueMeta = diamond_pickaxeMeta.clone();
        MINGYUE.setItemMeta(mingyueMeta);

        ItemMeta canlanMeta = diamond_pickaxeMeta.clone();
        CANLAN.setItemMeta(canlanMeta);

        ItemMeta jinjingMeta = diamond_pickaxeMeta.clone();
        JINJING.setItemMeta(jinjingMeta);

        ItemMeta xiaotianMeta = diamond_pickaxeMeta.clone();
        XIAOTIAN.setItemMeta(xiaotianMeta);

        ItemMeta xiaoMeta = diamond_pickaxeMeta.clone();
        XIAO.setItemMeta(xiaoMeta);

        ItemMeta qinfengyinyinMeta = diamond_pickaxeMeta.clone();
        QINFENGYINYIN.setItemMeta(qinfengyinyinMeta);

        ItemMeta liushuichanchanMeta = diamond_pickaxeMeta.clone();
        LIUSHUICHANCHAN.setItemMeta(liushuichanchanMeta);

        ItemMeta buqichunyuMeta = diamond_pickaxeMeta.clone();
        BUQICHUNYU.setItemMeta(buqichunyuMeta);

        ItemMeta sanzhenghenghunMeta = diamond_pickaxeMeta.clone();
        SANSHENGZHENHUN.setItemMeta(sanzhenghenghunMeta);

        ItemMeta jiufenglaiyiMeta = diamond_pickaxeMeta.clone();
        JIUFENGLAIYI.setItemMeta(jiufenglaiyiMeta);


        ItemMeta juedoulingMeta = diamond_pickaxeMeta.clone();
        JUEDOULING.setItemMeta(juedoulingMeta);

        ItemMeta leimingguMeta = diamond_pickaxeMeta.clone();
        LEIMINGGU.setItemMeta(leimingguMeta);

        ItemMeta huansilinMeta = diamond_pickaxeMeta.clone();
        HUANSILIN.setItemMeta(huansilinMeta);

        ItemMeta niumonuhouMeta = diamond_pickaxeMeta.clone();
        NIUMONUHOU.setItemMeta(niumonuhouMeta);

        ItemMeta douqishiMeta = diamond_pickaxeMeta.clone();
        DOUQISHI.setItemMeta(douqishiMeta);

        ItemMeta panguanbiMeta = diamond_pickaxeMeta.clone();
        PANGUANBI.setItemMeta(panguanbiMeta);

        ItemMeta minshengjianMeta = diamond_pickaxeMeta.clone();
        MINSHENGJIAN.setItemMeta(minshengjianMeta);

        ItemMeta zhenleitianchuiMeta = diamond_pickaxeMeta.clone();
        ZHENLEITIANCHUI.setItemMeta(zhenleitianchuiMeta);

        ItemMeta diaohunganMeta = diamond_pickaxeMeta.clone();
        DIAOHUNGAN.setItemMeta(diaohunganMeta);

        ItemMeta shelinzhuMeta = diamond_pickaxeMeta.clone();
        SHELINZHU.setItemMeta(shelinzhuMeta);

        ItemMeta yujinpinMeta = diamond_pickaxeMeta.clone();
        YUJINPIN.setItemMeta(yujinpinMeta);

        ItemMeta tianjishenjinMeta = diamond_pickaxeMeta.clone();
        TIANJISHENJIN.setItemMeta(tianjishenjinMeta);

        ItemMeta ruiyingyanMeta = diamond_pickaxeMeta.clone();
        RUIYINGYAN.setItemMeta(ruiyingyanMeta);

        ItemMeta duohuntangMeta = diamond_pickaxeMeta.clone();
        DUOHUNTANG.setItemMeta(duohuntangMeta);

        ItemMeta moyuanfozhuMeta = diamond_pickaxeMeta.clone();
        MOYUANFOZHU.setItemMeta(moyuanfozhuMeta);

        ItemMeta fuxinruyiMeta = diamond_pickaxeMeta.clone();
        FUXINRUYI.setItemMeta(fuxinruyiMeta);

        ItemMeta lvyezianzongMeta = diamond_pickaxeMeta.clone();
        LVYEXIANZONG.setItemMeta(lvyezianzongMeta);

        ItemMeta qingnvhanshuangMeta = diamond_pickaxeMeta.clone();
        QINGNVHANSHUANG.setItemMeta(qingnvhanshuangMeta);

        ItemMeta zhurongkuyanMeta = diamond_pickaxeMeta.clone();
        ZHURONGKUYAN.setItemMeta(zhurongkuyanMeta);

        ItemMeta zhudianxuanjingMeta = diamond_pickaxeMeta.clone();
        ZHUDIANXUANJING.setItemMeta(zhudianxuanjingMeta);

        ItemMeta buhunwangMeta = diamond_pickaxeMeta.clone();
        BUHUNWANG.setItemMeta(buhunwangMeta);

        ItemMeta zhongyuangongMeta = diamond_pickaxeMeta.clone();
        YANGSHOUJIAN.setItemMeta(zhongyuangongMeta);

        ItemMeta wumingmoyinluoMeta = diamond_pickaxeMeta.clone();
        WUMINGMOYINLUO.setItemMeta(wumingmoyinluoMeta);

        ItemMeta shetianhuaxuelingMeta = diamond_pickaxeMeta.clone();
        SHETIANHUAXUELING.setItemMeta(shetianhuaxuelingMeta);

        ItemMeta kuyelingMeta = diamond_pickaxeMeta.clone();
        KUYELING.setItemMeta(kuyelingMeta);

        ItemMeta luobeijinpinMeta = diamond_pickaxeMeta.clone();
        LUOBEIJINPIN.setItemMeta(luobeijinpinMeta);

        ItemMeta pinyushuiyuMeta = diamond_pickaxeMeta.clone();
        PINYUSHUIYU.setItemMeta(pinyushuiyuMeta);

        ItemMeta dikongyumuquanMeta = diamond_pickaxeMeta.clone();
        DIKONGYUMOQUAN.setItemMeta(dikongyumuquanMeta);

        ItemMeta luanshenguMeta = diamond_pickaxeMeta.clone();
        LUANSHENGU.setItemMeta(luanshenguMeta);

        ItemMeta jingulianMeta = diamond_pickaxeMeta.clone();
        JINGULIAN.setItemMeta(jingulianMeta);

        ItemMeta jianchangulinMeta = diamond_pickaxeMeta.clone();
        JIANCHANGULIN.setItemMeta(jianchangulinMeta);

        ItemMeta moduohunfanMeta = diamond_pickaxeMeta.clone();
        MODUOHUNFAN.setItemMeta(moduohunfanMeta);

        ItemMeta heitieguoMeta = golden_pickaxeMeta.clone();
        HEI_TIE_GUO.setItemMeta(heitieguoMeta);

        ItemMeta qintongguoMeta = golden_pickaxeMeta.clone();
        QIN_TONG_GUO.setItemMeta(qintongguoMeta);

        ItemMeta liandanluMeta = golden_pickaxeMeta.clone();
        LIAN_DAN_LU.setItemMeta(liandanluMeta);

        ItemMeta suohunluMeta = golden_pickaxeMeta.clone();
        SUO_HUN_LU.setItemMeta(suohunluMeta);

        ItemMeta qishadingMeta = golden_pickaxeMeta.clone();
        QI_SHA_DING.setItemMeta(qishadingMeta);

        ItemMeta hunyuanshendingMeta = golden_pickaxeMeta.clone();
        HUN_YUAN_SHEN_DING.setItemMeta(hunyuanshendingMeta);

        ItemMeta laoliehujiandaiMeta = golden_pickaxeMeta.clone();
        LAOLIEHUJIANDAI.setItemMeta(laoliehujiandaiMeta);

        ItemMeta xinbinjiandaiMeta = golden_pickaxeMeta.clone();
        XINBINJIANDAI.setItemMeta(xinbinjiandaiMeta);

        ItemMeta jinruijiandaiMeta = golden_pickaxeMeta.clone();
        JINRUIJIANDAI.setItemMeta(jinruijiandaiMeta);

        ItemMeta yingyanjiandaiMeta = golden_pickaxeMeta.clone();
        YINGYANJIANDAI.setItemMeta(yingyanjiandaiMeta);

        ItemMeta cangguningwangMeta = golden_pickaxeMeta.clone();
        CANGGUNINGWANG.setItemMeta(cangguningwangMeta);

        ItemMeta niepanyunangMeta = golden_pickaxeMeta.clone();
        NIEPANYUNANG.setItemMeta(niepanyunangMeta);

        ItemMeta fangshenduanbiMeta = netherite_pickaxeMeta.clone();
        FANGSHENDUANBI.setItemMeta(fangshenduanbiMeta);

        ItemMeta tiezhiduanbiMeta = netherite_pickaxeMeta.clone();
        TIEZHIDUANBI.setItemMeta(tiezhiduanbiMeta);

        ItemMeta huiyidaoMeta = netherite_pickaxeMeta.clone();
        HUIYIDAO.setItemMeta(huiyidaoMeta);

        ItemMeta longyadaoMeta = netherite_pickaxeMeta.clone();
        LONGYADAO.setItemMeta(longyadaoMeta);

        ItemMeta zhangqicuizhuMeta = netherite_pickaxeMeta.clone();
        ZHANGQICUIZHU.setItemMeta(zhangqicuizhuMeta);

        ItemMeta minghongMeta = netherite_pickaxeMeta.clone();
        MINGHONG.setItemMeta(minghongMeta);

        ItemMeta zhaoyaojinMeta = iron_pickaxeMeta.clone();
        ZHAOYAOJIN.setItemMeta(zhaoyaojinMeta);

        ItemMeta yufuchenMeta = iron_pickaxeMeta.clone();
        YUFUCHEN.setItemMeta(yufuchenMeta);

        ItemMeta wusebutianshiMeta = iron_pickaxeMeta.clone();
        WUSEBUTIANSHI.setItemMeta(wusebutianshiMeta);

        ItemMeta yaowanghuluMeta = iron_pickaxeMeta.clone();
        YAOWANGHULU.setItemMeta(yaowanghuluMeta);

        ItemMeta cixinmiaolianMeta = iron_pickaxeMeta.clone();
        CIXINMIAOLIAN.setItemMeta(cixinmiaolianMeta);

        ItemMeta shenxinyuguMeta = iron_pickaxeMeta.clone();
        SHENXINYUGU.setItemMeta(shenxinyuguMeta);

        ItemMeta yinyangzhanlongjianMeta = iron_pickaxeMeta.clone();
        YINYANGZHANLONGJIAN.setItemMeta(yinyangzhanlongjianMeta);

        ItemMeta yunlangbanMeta = iron_pickaxeMeta.clone();
        YUNLANGBAN.setItemMeta(yunlangbanMeta);

        ItemMeta zhenhunyuxiaoMeta = iron_pickaxeMeta.clone();
        ZHENHUNYUXIAO.setItemMeta(zhenhunyuxiaoMeta);

        ItemMeta dikuihualanMeta = iron_pickaxeMeta.clone();
        DIKUIHUALAN.setItemMeta(dikuihualanMeta);

        ItemMeta xuanfengzongshanMeta = iron_pickaxeMeta.clone();
        XUANFENGZONGSHAN.setItemMeta(xuanfengzongshanMeta);

        ItemMeta taijibaguaMeta = iron_pickaxeMeta.clone();
        TAIJIBAGUA.setItemMeta(taijibaguaMeta);

        LAOZHANSHIDUNPAI.setItemMeta(shieldMeta);

        BlockStateMeta xinbindunpaiItemMeta = (BlockStateMeta) shieldMeta.clone();
        Banner xinbindunpaiBanner = (Banner) xinbindunpaiItemMeta.getBlockState();
        xinbindunpaiBanner.addPattern(new Pattern(DyeColor.LIME, PatternType.BASE));
        xinbindunpaiBanner.addPattern(new Pattern(DyeColor.LIGHT_BLUE, PatternType.RHOMBUS));
        xinbindunpaiBanner.addPattern(new Pattern(DyeColor.YELLOW, PatternType.STRIPE_DOWNRIGHT));
        xinbindunpaiBanner.addPattern(new Pattern(DyeColor.YELLOW, PatternType.STRIPE_DOWNLEFT));
        xinbindunpaiBanner.addPattern(new Pattern(DyeColor.LIGHT_GRAY, PatternType.BORDER));
        xinbindunpaiItemMeta.setBlockState(xinbindunpaiBanner);
        XINBINDUNPAI.setItemMeta(xinbindunpaiItemMeta);

        BlockStateMeta jinruidunpaiItemMeta = (BlockStateMeta) shieldMeta.clone();
        Banner jinruidunpaiBanner = (Banner) jinruidunpaiItemMeta.getBlockState();
        jinruidunpaiBanner.addPattern(new Pattern(DyeColor.BLUE, PatternType.BASE));
        jinruidunpaiBanner.addPattern(new Pattern(DyeColor.CYAN, PatternType.SKULL));
        jinruidunpaiBanner.addPattern(new Pattern(DyeColor.LIGHT_GRAY, PatternType.BORDER));
        jinruidunpaiItemMeta.setBlockState(jinruidunpaiBanner);
        JINRUIDUNPAI.setItemMeta(jinruidunpaiItemMeta);

        BlockStateMeta chiseyuehuoItemMeta = (BlockStateMeta) shieldMeta.clone();
        Banner chiseyuehuoBanner = (Banner) chiseyuehuoItemMeta.getBlockState();
        chiseyuehuoBanner.addPattern(new Pattern(DyeColor.RED, PatternType.BASE));
        chiseyuehuoBanner.addPattern(new Pattern(DyeColor.PINK, PatternType.GRADIENT));
        chiseyuehuoBanner.addPattern(new Pattern(DyeColor.ORANGE, PatternType.CREEPER));
        chiseyuehuoBanner.addPattern(new Pattern(DyeColor.LIGHT_GRAY, PatternType.BORDER));
        chiseyuehuoItemMeta.setBlockState(chiseyuehuoBanner);
        CHISEYUEHUO.setItemMeta(chiseyuehuoItemMeta);

        BlockStateMeta jingangbuhuaiItemMeta = (BlockStateMeta) shieldMeta.clone();
        Banner jingangbuhuaiBanner = (Banner) jingangbuhuaiItemMeta.getBlockState();
        jingangbuhuaiBanner.addPattern(new Pattern(DyeColor.YELLOW, PatternType.BASE));
        jingangbuhuaiBanner.addPattern(new Pattern(DyeColor.BLACK, PatternType.GRADIENT));
        jingangbuhuaiBanner.addPattern(new Pattern(DyeColor.GRAY, PatternType.SKULL));
        jingangbuhuaiBanner.addPattern(new Pattern(DyeColor.LIGHT_GRAY, PatternType.BORDER));
        jingangbuhuaiItemMeta.setBlockState(jingangbuhuaiBanner);
        JINGANGBUHUAI.setItemMeta(jingangbuhuaiItemMeta);

        BlockStateMeta chenbinluoxueItemMeta = (BlockStateMeta) shieldMeta.clone();
        Banner chenbinluoxueBanner = (Banner) chenbinluoxueItemMeta.getBlockState();
        chenbinluoxueBanner.addPattern(new Pattern(DyeColor.LIGHT_BLUE, PatternType.BASE));
        chenbinluoxueBanner.addPattern(new Pattern(DyeColor.BLUE, PatternType.GRADIENT_UP));
        chenbinluoxueBanner.addPattern(new Pattern(DyeColor.PINK, PatternType.FLOWER));
        chenbinluoxueBanner.addPattern(new Pattern(DyeColor.LIGHT_GRAY, PatternType.BORDER));
        chenbinluoxueItemMeta.setBlockState(chenbinluoxueBanner);
        CHENBINLUOXUE.setItemMeta(chenbinluoxueItemMeta);



        TAIJIBAGUA.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_crystals/12"));
        XUANFENGZONGSHAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_crystals/11"));
        DIKUIHUALAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_crystals/10"));
        ZHENHUNYUXIAO.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_crystals/9"));
        YUNLANGBAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_crystals/8"));
        YINYANGZHANLONGJIAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_crystals/7"));
        SHENXINYUGU.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_crystals/6"));
        CIXINMIAOLIAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_crystals/5"));
        YAOWANGHULU.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_crystals/4"));
        WUSEBUTIANSHI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_crystals/3"));
        YUFUCHEN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_crystals/2"));
        ZHAOYAOJIN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_crystals/1"));
        MINGHONG.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "angler_pottery_sherd/6"));
        ZHANGQICUIZHU.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "angler_pottery_sherd/5"));
        LONGYADAO.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "angler_pottery_sherd/4"));
        HUIYIDAO.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "angler_pottery_sherd/3"));
        TIEZHIDUANBI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "angler_pottery_sherd/2"));
        FANGSHENDUANBI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "angler_pottery_sherd/1"));
        NIEPANYUNANG.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "rabbit_hide/105"));
        CANGGUNINGWANG.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "rabbit_hide/104"));
        YINGYANJIANDAI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "rabbit_hide/103"));
        JINRUIJIANDAI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "rabbit_hide/102"));
        XINBINJIANDAI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "rabbit_hide/101"));
        LAOLIEHUJIANDAI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "rabbit_hide/101"));
        HUN_YUAN_SHEN_DING.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "rabbit_hide/5"));
        QI_SHA_DING.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "rabbit_hide/4"));
        SUO_HUN_LU.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "rabbit_hide/3"));
        LIAN_DAN_LU.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "rabbit_hide/2"));
        QIN_TONG_GUO.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "rabbit_hide/1"));
        HEI_TIE_GUO.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "rabbit_hide/1"));
        MODUOHUNFAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/9304"));
        JIANCHANGULIN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/9303"));
        JINGULIAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/9302"));
        LUANSHENGU.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/9301"));
        DIKONGYUMOQUAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/9204"));
        PINYUSHUIYU.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/9203"));
        LUOBEIJINPIN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/9202"));
        KUYELING.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/9201"));
        SHETIANHUAXUELING.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/9104"));
        WUMINGMOYINLUO.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/9103"));
        YANGSHOUJIAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/9102"));
        BUHUNWANG.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/9101"));
        ZHUDIANXUANJING.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/9004"));
        ZHURONGKUYAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/9003"));
        QINGNVHANSHUANG.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/9002"));
        LVYEXIANZONG.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/9001"));
        FUXINRUYI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/8104"));
        MOYUANFOZHU.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/8103"));
        DUOHUNTANG.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/8102"));
        RUIYINGYAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/8101"));
        TIANJISHENJIN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/8004"));
        YUJINPIN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/8003"));
        SHELINZHU.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/8002"));
        DIAOHUNGAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/8001"));
        ZHENLEITIANCHUI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/7104"));
        MINSHENGJIAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/7103"));
        PANGUANBI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/7102"));
        DOUQISHI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/7101"));
        NIUMONUHOU.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/7004"));
        HUANSILIN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/7003"));
        LEIMINGGU.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/7002"));
        JUEDOULING.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/7001"));
        JIUFENGLAIYI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/6006"));
        SANSHENGZHENHUN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/6005"));
        BUQICHUNYU.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/6004"));
        LIUSHUICHANCHAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/6003"));
        QINFENGYINYIN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/6002"));
        XIAO.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/6001"));
        XIAOTIAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/5006"));
        JINJING.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/5005"));
        CANLAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/5004"));
        MINGYUE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/5003"));
        HUANGTONGCHONG.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/5002"));
        HEITIECHONG.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/5001"));
        YANWANGTIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/4006"));
        WUYINWUZONG.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/4005"));
        HUIXUANTAJI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/4004"));
        WUSHENGXIUJIAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/4003"));
        JINRUIFEIREN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/4002"));
        FEIREN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/4001"));
        RU_YI_JIN_GU_BANG.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/3005"));
        HU_TOU_ZHAN_JIN_QIANG.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/3004"));
        YOU_LONG_QIANG.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/3003"));
        HONG_YIN_QIANG.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/3002"));
        YIN_YUE_QIANG.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/3001"));
        TAI_E.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/2005"));
        KUN_LUN_FEI_XIAN_JIAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/2004"));
        TAI_JI_JIAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/2003"));
        JU_TONG_ZHAN_CHUI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/1002"));
        QIN_TONG_JIAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/2001"));
        XUAN_YUAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/1005"));
        SAN_BAO_YU_RU_YI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/1004"));
        PO_KONG_FU.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/1003"));
        CHI_TONG_JIAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/2002"));
        KAI_SHAN_DAO.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/1001"));
        TAO_MU_JIAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/1"));
    }
}
