package com.xiaoxiaoowo.yuehua.itemstack.dz;


//使用iron_ingot
// 1开头->战核
// 2开头->弓核
// 3开头->丹核
// 4开头->通用核
// 5开头->原核

/*
第二位:
1-> 武器
2-> 防具
3-> 副武器
4-> 法宝
5-> 异器
6-> 饰品
* */

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

//第三位阶级
public final class                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    Core {
    // 原核
    public static final ItemStack CORE2 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CORE3 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CORE4 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CORE5 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CORE6 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CORE7 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CORE8 = new ItemStack(Material.IRON_INGOT);

    //武器核
    //战士

    //破军
    public static final ItemStack KAI_SHAN_DAO = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CHI_TONG_JIAN = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack PO_KONG_FU = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack SAN_BAO_YU_RU_YI = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack XUAN_YUAN = new ItemStack(Material.IRON_INGOT);

    //金钟
    public static final ItemStack QIN_TONG_JIAN = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack JU_TONG_ZHAN_CHUI = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack TAI_JI_JIAN = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack KUN_LUN_FEI_XIAN_JIAN = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack TAI_E = new ItemStack(Material.IRON_INGOT);

    //探云
    public static final ItemStack YIN_YUE_QIANG = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack HONG_YIN_QIANG = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack YOU_LONG_QIANG = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack HU_TOU_ZHAN_JIN_QIANG = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack RU_YI_JIN_GU_BANG = new ItemStack(Material.IRON_INGOT);


    //狙击
    public static final ItemStack QIN_TONG_GONG = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack YAN_TIE_GONG = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack ZHONG_CHUI_GONG = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack BEI_DOU_MIE_SHEN_GONG = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack ZHU_RI = new ItemStack(Material.IRON_INGOT);

    //游侠
    public static final ItemStack HEI_TIE_NU = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack HONG_LIN_NU = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack JIAO_LONG_NU = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack RI_YUE_LIU_XING_NU = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack LIANG_YI = new ItemStack(Material.IRON_INGOT);

    //灵箭
    public static final ItemStack FU_RONG_GONG = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack HONG_LUAN_GONG = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack TIAN_QIONG_GONG = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack SHE_TIAN_ZHUI_YUE_GONG = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack LIU_GUANG = new ItemStack(Material.IRON_INGOT);

    //炼丹师
    public static final ItemStack QIN_TONG_GUO = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack LIAN_DAN_LU = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack SUO_HUN_LU = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack QI_SHA_DING = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack HUN_YUAN_SHEN_DING = new ItemStack(Material.IRON_INGOT);

    //防具核
    //通用
    public static final ItemStack touSp2 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack touSp3 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack touSp4 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack touSp5 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack touSp6 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack touSp7 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack touSp8 = new ItemStack(Material.IRON_INGOT);

    //战士
    public static final ItemStack zhanTou2 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanTou3 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanTou4 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanTou5 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanTou6 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanTou7 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanTou8 = new ItemStack(Material.IRON_INGOT);

    //弓箭手
    public static final ItemStack gongTou2 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongTou3 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongTou4 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongTou5 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongTou6 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongTou7 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongTou8 = new ItemStack(Material.IRON_INGOT);


    //炼丹师
    public static final ItemStack danTou2 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danTou3 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danTou4 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danTou5 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danTou6 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danTou7 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danTou8 = new ItemStack(Material.IRON_INGOT);

    //通用
    public static final ItemStack xiongSp2 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack xiongSp3 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack xiongSp4 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack xiongSp5 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack xiongSp6 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack xiongSp7 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack xiongSp8 = new ItemStack(Material.IRON_INGOT);

    //战士
    public static final ItemStack zhanXiong2 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanXiong3 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanXiong4 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanXiong5 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanXiong6 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanXiong7 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanXiong8 = new ItemStack(Material.IRON_INGOT);

    //弓箭手
    public static final ItemStack gongXiong2 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongXiong3 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongXiong4 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongXiong5 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongXiong6 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongXiong7 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongXiong8 = new ItemStack(Material.IRON_INGOT);

    //炼丹师
    public static final ItemStack danXiong2 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danXiong3 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danXiong4 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danXiong5 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danXiong6 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danXiong7 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danXiong8 = new ItemStack(Material.IRON_INGOT);

    //通用
    public static final ItemStack tuiSp2 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack tuiSp3 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack tuiSp4 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack tuiSp5 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack tuiSp6 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack tuiSp7 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack tuiSp8 = new ItemStack(Material.IRON_INGOT);

    //战士
    public static final ItemStack zhanTui2 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanTui3 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanTui4 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanTui5 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanTui6 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanTui7 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanTui8 = new ItemStack(Material.IRON_INGOT);

    //弓箭手
    public static final ItemStack gongTui2 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongTui3 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongTui4 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongTui5 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongTui6 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongTui7 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongTui8 = new ItemStack(Material.IRON_INGOT);

    //炼丹师
    public static final ItemStack danTui2 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danTui3 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danTui4 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danTui5 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danTui6 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danTui7 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danTui8 = new ItemStack(Material.IRON_INGOT);

    //通用
    public static final ItemStack xieSp2 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack xieSp3 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack xieSp4 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack xieSp5 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack xieSp6 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack xieSp7 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack xieSp8 = new ItemStack(Material.IRON_INGOT);

    //战士
    public static final ItemStack zhanXie2 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanXie3 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanXie4 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanXie5 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanXie6 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanXie7 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack zhanXie8 = new ItemStack(Material.IRON_INGOT);

    //弓箭手
    public static final ItemStack gongXie2 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongXie3 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongXie4 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongXie5 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongXie6 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongXie7 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack gongXie8 = new ItemStack(Material.IRON_INGOT);

    // 炼丹师
    public static final ItemStack danXie2 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danXie3 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danXie4 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danXie5 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danXie6 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danXie7 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack danXie8 = new ItemStack(Material.IRON_INGOT);

    //战士，暗器
    public static final ItemStack JINRUIFEIREN = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack WUSHENGXIUJIAN = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack HUIXUANTAJI = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack WUYINWUZONG = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack YANWANGTIE = new ItemStack(Material.IRON_INGOT);

    //弓箭手，火铳
    public static final ItemStack HUANGTONGCHONG = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack MINGYUE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CANLAN = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack JINJING = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack XIAOTIAN = new ItemStack(Material.IRON_INGOT);

    //炼丹师，灵乐
    public static final ItemStack QINFENGYINYIN = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack LIUSHUICHANCHAN = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack BUQICHUNYU = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack SANSHENGZHENHUN = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack JIUFENGLAIYI = new ItemStack(Material.IRON_INGOT);

    //战士盾牌
    public static final ItemStack XINBINDUNPAI = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack JINRUIDUNPAI = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CHISEYUEHUO = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack JINGANGBUHUAI = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CHENBINLUOXUE = new ItemStack(Material.IRON_INGOT);

    //弓箭手箭袋
    public static final ItemStack XINBINJIANDAI = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack JINRUIJIANDAI = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack YINGYANJIANDAI = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CANGGUNINGWANG = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack NIEPANYUNANG = new ItemStack(Material.IRON_INGOT);


    //炼丹师萃刃
    public static final ItemStack TIEZHIDUANBI = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack HUIYIDAO = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack LONGYADAO = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack ZHANGQICUIZHU = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack MINGHONG = new ItemStack(Material.IRON_INGOT);


    public static final ItemStack QING_LONG_SHENG_QI2 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack QING_LONG_SHENG_QI3 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack QING_LONG_SHENG_QI4 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack QING_LONG_SHENG_QI5 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack QING_LONG_SHENG_QI6 = new ItemStack(Material.IRON_INGOT);

    public static final ItemStack BAI_HU_SHENG_QI2 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack BAI_HU_SHENG_QI3 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack BAI_HU_SHENG_QI4 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack BAI_HU_SHENG_QI5 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack BAI_HU_SHENG_QI6 = new ItemStack(Material.IRON_INGOT);

    public static final ItemStack ZHU_QUE_SHENG_QI2 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack ZHU_QUE_SHENG_QI3 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack ZHU_QUE_SHENG_QI4 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack ZHU_QUE_SHENG_QI5 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack ZHU_QUE_SHENG_QI6 = new ItemStack(Material.IRON_INGOT);

    public static final ItemStack XUAN_WU_SHENG_QI2 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack XUAN_WU_SHENG_QI3 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack XUAN_WU_SHENG_QI4 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack XUAN_WU_SHENG_QI5 = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack XUAN_WU_SHENG_QI6 = new ItemStack(Material.IRON_INGOT);

    public static final ItemStack TAN_YU_ZHI_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack TAN_LAN_DU_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack TAN_LAN_XIE_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack TAN_LAN_GUI_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack TAN_LAN_MO_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack TAN_LAN_MING_JIE = new ItemStack(Material.IRON_INGOT);

    public static final ItemStack CHI_MI_ZHI_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CHI_YU_DU_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CHI_YU_XIE_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CHI_YU_GUI_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CHI_YU_MO_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CHI_YU_MING_JIE = new ItemStack(Material.IRON_INGOT);

    public static final ItemStack CHEN_NU_ZHI_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CHEN_HEN_DU_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CHEN_HEN_XIE_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CHEN_HEN_GUI_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CHEN_HEN_MO_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CHEN_HEN_MING_JIE = new ItemStack(Material.IRON_INGOT);

    public static final ItemStack CHAN_DING_FA_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CHAN_DING_SHENG_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CHAN_DING_FO_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CHAN_DING_XIAN_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CHAN_DING_SHEN_JIE = new ItemStack(Material.IRON_INGOT);

    public static final ItemStack ZHI_HUI_FA_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack ZHI_HUI_SHENG_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack ZHI_HUI_FO_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack ZHI_HUI_XIAN_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack ZHI_HUI_SHEN_JIE = new ItemStack(Material.IRON_INGOT);

    public static final ItemStack CHI_JIE_FA_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CHI_JIE_SHENG_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CHI_JIE_FO_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CHI_JIE_XIAN_JIE = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack CHI_JIE_SHEN_JIE = new ItemStack(Material.IRON_INGOT);

    //通用
    public static final ItemStack ZHAOYAOJIN = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack YUFUCHEN = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack WUSEBUTIANSHI = new ItemStack(Material.IRON_INGOT, 1);

    public static final ItemStack YAOWANGHULU = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack CIXINMIAOLIAN = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack SHENXINYUGU = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack YINYANGZHANLONGJIAN = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack YUNLANGBAN = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack ZHENHUNYUXIAO = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack DIKUIHUALAN = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack XUANFENGZONGSHAN = new ItemStack(Material.IRON_INGOT, 1);

    public static final ItemStack TAIJIBAGUA = new ItemStack(Material.IRON_INGOT, 1);

    //战士

    //分支一，吸引仇恨
    public static final ItemStack JUEDOULING = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack LEIMINGGU = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack HUANSILIN = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack NIUMONUHOU = new ItemStack(Material.IRON_INGOT, 1);

    //分支二，增伤
    public static final ItemStack DOUQISHI = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack PANGUANBI = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack MINSHENGJIAN = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack ZHENLEITIANCHUI = new ItemStack(Material.IRON_INGOT, 1);

    //弓箭手

    //分支一，制造傀儡

    public static final ItemStack DIAOHUNGAN = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack SHELINZHU = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack YUJINPIN = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack TIANJISHENJIN = new ItemStack(Material.IRON_INGOT, 1);

    //分支二，增伤
    public static final ItemStack RUIYINGYAN = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack DUOHUNTANG = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack MOYUANFOZHU = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack FUXINRUYI = new ItemStack(Material.IRON_INGOT, 1);

    //炼丹

    //分支一，单点（直线）伤害
    public static final ItemStack LVYEXIANZONG = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack QINGNVHANSHUANG = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack ZHURONGKUYAN = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack ZHUDIANXUANJING = new ItemStack(Material.IRON_INGOT, 1);

    //分支二，群体伤害
    public static final ItemStack BUHUNWANG = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack YANGSHOUJIAN = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack WUMINGMOYINLUO = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack SHETIANHUAXUELING = new ItemStack(Material.IRON_INGOT, 1);

    //分支三，辅助队友
    public static final ItemStack KUYELING = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack LUOBEIJINPIN = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack PINYUSHUIYU = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack DIKONGYUMOQUAN = new ItemStack(Material.IRON_INGOT, 1);

    //分支四，削弱敌人
    public static final ItemStack LUANSHENGU = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack JINGULIAN = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack JIANCHANGULIN = new ItemStack(Material.IRON_INGOT, 1);
    public static final ItemStack MODUOHUNFAN = new ItemStack(Material.IRON_INGOT, 1);

    static {
        ItemMeta core2Meta = CORE2.getItemMeta();
        ItemMeta core3Meta = CORE3.getItemMeta();
        ItemMeta core4Meta = CORE4.getItemMeta();
        ItemMeta core5Meta = CORE5.getItemMeta();
        ItemMeta core6Meta = CORE6.getItemMeta();
        ItemMeta core7Meta = CORE7.getItemMeta();
        ItemMeta core8Meta = CORE8.getItemMeta();

        ItemMeta kaiShanDaoMeta = KAI_SHAN_DAO.getItemMeta();
        ItemMeta chiTongJianMeta = CHI_TONG_JIAN.getItemMeta();
        ItemMeta poKongFuMeta = PO_KONG_FU.getItemMeta();
        ItemMeta sanBaoYuRuYiMeta = SAN_BAO_YU_RU_YI.getItemMeta();
        ItemMeta xuanYuanMeta = XUAN_YUAN.getItemMeta();

        ItemMeta qinTongJianMeta = QIN_TONG_JIAN.getItemMeta();
        ItemMeta juTongZhanChuiMeta = JU_TONG_ZHAN_CHUI.getItemMeta();
        ItemMeta taiJiJianMeta = TAI_JI_JIAN.getItemMeta();
        ItemMeta kunLunFeiXianJianMeta = KUN_LUN_FEI_XIAN_JIAN.getItemMeta();
        ItemMeta taiEMeta = TAI_E.getItemMeta();

        ItemMeta yinYueQiangMeta = YIN_YUE_QIANG.getItemMeta();
        ItemMeta hongYinQiangMeta = HONG_YIN_QIANG.getItemMeta();
        ItemMeta youLongQiangMeta = YOU_LONG_QIANG.getItemMeta();
        ItemMeta huTouZhanJinQiangMeta = HU_TOU_ZHAN_JIN_QIANG.getItemMeta();
        ItemMeta ruYiJinGuBangMeta = RU_YI_JIN_GU_BANG.getItemMeta();

        ItemMeta qinTongGongMeta = QIN_TONG_GONG.getItemMeta();
        ItemMeta yanTieGongMeta = YAN_TIE_GONG.getItemMeta();
        ItemMeta zhongChuiGongMeta = ZHONG_CHUI_GONG.getItemMeta();
        ItemMeta beiDouMieShenGongMeta = BEI_DOU_MIE_SHEN_GONG.getItemMeta();
        ItemMeta zhuRiMeta = ZHU_RI.getItemMeta();

        ItemMeta heiTieNuMeta = HEI_TIE_NU.getItemMeta();
        ItemMeta hongLinNuMeta = HONG_LIN_NU.getItemMeta();
        ItemMeta jiaoLongNuMeta = JIAO_LONG_NU.getItemMeta();
        ItemMeta riYueLiuXingNuMeta = RI_YUE_LIU_XING_NU.getItemMeta();
        ItemMeta liangYiMeta = LIANG_YI.getItemMeta();

        ItemMeta fuRongGongMeta = FU_RONG_GONG.getItemMeta();
        ItemMeta hongLuanGongMeta = HONG_LUAN_GONG.getItemMeta();
        ItemMeta tianQiongGongMeta = TIAN_QIONG_GONG.getItemMeta();
        ItemMeta sheTianZhuiYueGongMeta = SHE_TIAN_ZHUI_YUE_GONG.getItemMeta();
        ItemMeta liuGuangMeta = LIU_GUANG.getItemMeta();

        ItemMeta qinTongGuoMeta = QIN_TONG_GUO.getItemMeta();
        ItemMeta lianDanLuMeta = LIAN_DAN_LU.getItemMeta();
        ItemMeta suoHunLuMeta = SUO_HUN_LU.getItemMeta();
        ItemMeta qiShaDingMeta = QI_SHA_DING.getItemMeta();
        ItemMeta hunYuanShenDingMeta = HUN_YUAN_SHEN_DING.getItemMeta();

        ItemMeta touSp2Meta = touSp2.getItemMeta();
        ItemMeta touSp3Meta = touSp3.getItemMeta();
        ItemMeta touSp4Meta = touSp4.getItemMeta();
        ItemMeta touSp5Meta = touSp5.getItemMeta();
        ItemMeta touSp6Meta = touSp6.getItemMeta();
        ItemMeta touSp7Meta = touSp7.getItemMeta();
        ItemMeta touSp8Meta = touSp8.getItemMeta();

        ItemMeta zhanTou2Meta = zhanTou2.getItemMeta();
        ItemMeta zhanTou3Meta = zhanTou3.getItemMeta();
        ItemMeta zhanTou4Meta = zhanTou4.getItemMeta();
        ItemMeta zhanTou5Meta = zhanTou5.getItemMeta();
        ItemMeta zhanTou6Meta = zhanTou6.getItemMeta();
        ItemMeta zhanTou7Meta = zhanTou7.getItemMeta();
        ItemMeta zhanTou8Meta = zhanTou8.getItemMeta();

        ItemMeta gongTou2Meta = gongTou2.getItemMeta();
        ItemMeta gongTou3Meta = gongTou3.getItemMeta();
        ItemMeta gongTou4Meta = gongTou4.getItemMeta();
        ItemMeta gongTou5Meta = gongTou5.getItemMeta();
        ItemMeta gongTou6Meta = gongTou6.getItemMeta();
        ItemMeta gongTou7Meta = gongTou7.getItemMeta();
        ItemMeta gongTou8Meta = gongTou8.getItemMeta();

        ItemMeta danTou2Meta = danTou2.getItemMeta();
        ItemMeta danTou3Meta = danTou3.getItemMeta();
        ItemMeta danTou4Meta = danTou4.getItemMeta();
        ItemMeta danTou5Meta = danTou5.getItemMeta();
        ItemMeta danTou6Meta = danTou6.getItemMeta();
        ItemMeta danTou7Meta = danTou7.getItemMeta();
        ItemMeta danTou8Meta = danTou8.getItemMeta();

        ItemMeta xiongSp2Meta = xiongSp2.getItemMeta();
        ItemMeta xiongSp3Meta = xiongSp3.getItemMeta();
        ItemMeta xiongSp4Meta = xiongSp4.getItemMeta();
        ItemMeta xiongSp5Meta = xiongSp5.getItemMeta();
        ItemMeta xiongSp6Meta = xiongSp6.getItemMeta();
        ItemMeta xiongSp7Meta = xiongSp7.getItemMeta();
        ItemMeta xiongSp8Meta = xiongSp8.getItemMeta();

        ItemMeta zhanXiong2Meta = zhanXiong2.getItemMeta();
        ItemMeta zhanXiong3Meta = zhanXiong3.getItemMeta();
        ItemMeta zhanXiong4Meta = zhanXiong4.getItemMeta();
        ItemMeta zhanXiong5Meta = zhanXiong5.getItemMeta();
        ItemMeta zhanXiong6Meta = zhanXiong6.getItemMeta();
        ItemMeta zhanXiong7Meta = zhanXiong7.getItemMeta();
        ItemMeta zhanXiong8Meta = zhanXiong8.getItemMeta();

        ItemMeta gongXiong2Meta = gongXiong2.getItemMeta();
        ItemMeta gongXiong3Meta = gongXiong3.getItemMeta();
        ItemMeta gongXiong4Meta = gongXiong4.getItemMeta();
        ItemMeta gongXiong5Meta = gongXiong5.getItemMeta();
        ItemMeta gongXiong6Meta = gongXiong6.getItemMeta();
        ItemMeta gongXiong7Meta = gongXiong7.getItemMeta();
        ItemMeta gongXiong8Meta = gongXiong8.getItemMeta();

        ItemMeta danXiong2Meta = danXiong2.getItemMeta();
        ItemMeta danXiong3Meta = danXiong3.getItemMeta();
        ItemMeta danXiong4Meta = danXiong4.getItemMeta();
        ItemMeta danXiong5Meta = danXiong5.getItemMeta();
        ItemMeta danXiong6Meta = danXiong6.getItemMeta();
        ItemMeta danXiong7Meta = danXiong7.getItemMeta();
        ItemMeta danXiong8Meta = danXiong8.getItemMeta();

        ItemMeta tuiSp2Meta = tuiSp2.getItemMeta();
        ItemMeta tuiSp3Meta = tuiSp3.getItemMeta();
        ItemMeta tuiSp4Meta = tuiSp4.getItemMeta();
        ItemMeta tuiSp5Meta = tuiSp5.getItemMeta();
        ItemMeta tuiSp6Meta = tuiSp6.getItemMeta();
        ItemMeta tuiSp7Meta = tuiSp7.getItemMeta();
        ItemMeta tuiSp8Meta = tuiSp8.getItemMeta();

        ItemMeta zhanTui2Meta = zhanTui2.getItemMeta();
        ItemMeta zhanTui3Meta = zhanTui3.getItemMeta();
        ItemMeta zhanTui4Meta = zhanTui4.getItemMeta();
        ItemMeta zhanTui5Meta = zhanTui5.getItemMeta();
        ItemMeta zhanTui6Meta = zhanTui6.getItemMeta();
        ItemMeta zhanTui7Meta = zhanTui7.getItemMeta();
        ItemMeta zhanTui8Meta = zhanTui8.getItemMeta();

        ItemMeta gongTui2Meta = gongTui2.getItemMeta();
        ItemMeta gongTui3Meta = gongTui3.getItemMeta();
        ItemMeta gongTui4Meta = gongTui4.getItemMeta();
        ItemMeta gongTui5Meta = gongTui5.getItemMeta();
        ItemMeta gongTui6Meta = gongTui6.getItemMeta();
        ItemMeta gongTui7Meta = gongTui7.getItemMeta();
        ItemMeta gongTui8Meta = gongTui8.getItemMeta();

        ItemMeta danTui2Meta = danTui2.getItemMeta();
        ItemMeta danTui3Meta = danTui3.getItemMeta();
        ItemMeta danTui4Meta = danTui4.getItemMeta();
        ItemMeta danTui5Meta = danTui5.getItemMeta();
        ItemMeta danTui6Meta = danTui6.getItemMeta();
        ItemMeta danTui7Meta = danTui7.getItemMeta();
        ItemMeta danTui8Meta = danTui8.getItemMeta();

        ItemMeta xieSp2Meta = xieSp2.getItemMeta();
        ItemMeta xieSp3Meta = xieSp3.getItemMeta();
        ItemMeta xieSp4Meta = xieSp4.getItemMeta();
        ItemMeta xieSp5Meta = xieSp5.getItemMeta();
        ItemMeta xieSp6Meta = xieSp6.getItemMeta();
        ItemMeta xieSp7Meta = xieSp7.getItemMeta();
        ItemMeta xieSp8Meta = xieSp8.getItemMeta();

        ItemMeta zhanXie2Meta = zhanXie2.getItemMeta();
        ItemMeta zhanXie3Meta = zhanXie3.getItemMeta();
        ItemMeta zhanXie4Meta = zhanXie4.getItemMeta();
        ItemMeta zhanXie5Meta = zhanXie5.getItemMeta();
        ItemMeta zhanXie6Meta = zhanXie6.getItemMeta();
        ItemMeta zhanXie7Meta = zhanXie7.getItemMeta();
        ItemMeta zhanXie8Meta = zhanXie8.getItemMeta();

        ItemMeta gongXie2Meta = gongXie2.getItemMeta();
        ItemMeta gongXie3Meta = gongXie3.getItemMeta();
        ItemMeta gongXie4Meta = gongXie4.getItemMeta();
        ItemMeta gongXie5Meta = gongXie5.getItemMeta();
        ItemMeta gongXie6Meta = gongXie6.getItemMeta();
        ItemMeta gongXie7Meta = gongXie7.getItemMeta();
        ItemMeta gongXie8Meta = gongXie8.getItemMeta();

        ItemMeta danXie2Meta = danXie2.getItemMeta();
        ItemMeta danXie3Meta = danXie3.getItemMeta();
        ItemMeta danXie4Meta = danXie4.getItemMeta();
        ItemMeta danXie5Meta = danXie5.getItemMeta();
        ItemMeta danXie6Meta = danXie6.getItemMeta();
        ItemMeta danXie7Meta = danXie7.getItemMeta();
        ItemMeta danXie8Meta = danXie8.getItemMeta();

        ItemMeta JINRUIFEIRENMeta = JINRUIFEIREN.getItemMeta();
        ItemMeta WUSHENGXIUJIANMeta = WUSHENGXIUJIAN.getItemMeta();
        ItemMeta HUIXUANTAJIMeta = HUIXUANTAJI.getItemMeta();
        ItemMeta WUYINWUZONGMeta = WUYINWUZONG.getItemMeta();
        ItemMeta YANWANGTIEMeta = YANWANGTIE.getItemMeta();

        ItemMeta HUANGTONGCHONGMeta = HUANGTONGCHONG.getItemMeta();
        ItemMeta MINGYUEMeta = MINGYUE.getItemMeta();
        ItemMeta CANLANMeta = CANLAN.getItemMeta();
        ItemMeta JINJINGMeta = JINJING.getItemMeta();
        ItemMeta XIAOTIANMeta = XIAOTIAN.getItemMeta();

        ItemMeta QINFENGYINYINMeta = QINFENGYINYIN.getItemMeta();
        ItemMeta LIUSHUICHANCHANMeta = LIUSHUICHANCHAN.getItemMeta();
        ItemMeta BUQICHUNYUMeta = BUQICHUNYU.getItemMeta();
        ItemMeta SANSHENGZHENHUNMeta = SANSHENGZHENHUN.getItemMeta();
        ItemMeta JIUFENGLAIYIMeta = JIUFENGLAIYI.getItemMeta();

        ItemMeta XINBINDUNPAIMeta = XINBINDUNPAI.getItemMeta();
        ItemMeta JINRUIDUNPAIMeta = JINRUIDUNPAI.getItemMeta();
        ItemMeta CHISEYUEHUOMeta = CHISEYUEHUO.getItemMeta();
        ItemMeta JINGANGBUHUAIMeta = JINGANGBUHUAI.getItemMeta();
        ItemMeta CHENBINLUOXUEMeta = CHENBINLUOXUE.getItemMeta();

        ItemMeta XINBINJIANDAIMeta = XINBINJIANDAI.getItemMeta();
        ItemMeta JINRUIJIANDAIMeta = JINRUIJIANDAI.getItemMeta();
        ItemMeta YINGYANJIANDAIMeta = YINGYANJIANDAI.getItemMeta();
        ItemMeta CANGGUNINGWANGMeta = CANGGUNINGWANG.getItemMeta();
        ItemMeta NIEPANYUNANGMeta = NIEPANYUNANG.getItemMeta();

        ItemMeta TIEZHIDUANBIMeta = TIEZHIDUANBI.getItemMeta();
        ItemMeta HUIYIDAOMeta = HUIYIDAO.getItemMeta();
        ItemMeta LONGYADAOMeta = LONGYADAO.getItemMeta();
        ItemMeta ZHANGQICUIZHUMeta = ZHANGQICUIZHU.getItemMeta();
        ItemMeta MINGHONGMeta = MINGHONG.getItemMeta();

        ItemMeta QING_LONG_SHENG_QI2Meta = QING_LONG_SHENG_QI2.getItemMeta();
        ItemMeta QING_LONG_SHENG_QI3Meta = QING_LONG_SHENG_QI3.getItemMeta();
        ItemMeta QING_LONG_SHENG_QI4Meta = QING_LONG_SHENG_QI4.getItemMeta();
        ItemMeta QING_LONG_SHENG_QI5Meta = QING_LONG_SHENG_QI5.getItemMeta();
        ItemMeta QING_LONG_SHENG_QI6Meta = QING_LONG_SHENG_QI6.getItemMeta();

        ItemMeta BAI_HU_SHENG_QI2Meta = BAI_HU_SHENG_QI2.getItemMeta();
        ItemMeta BAI_HU_SHENG_QI3Meta = BAI_HU_SHENG_QI3.getItemMeta();
        ItemMeta BAI_HU_SHENG_QI4Meta = BAI_HU_SHENG_QI4.getItemMeta();
        ItemMeta BAI_HU_SHENG_QI5Meta = BAI_HU_SHENG_QI5.getItemMeta();
        ItemMeta BAI_HU_SHENG_QI6Meta = BAI_HU_SHENG_QI6.getItemMeta();

        ItemMeta ZHU_QUE_SHENG_QI2Meta = ZHU_QUE_SHENG_QI2.getItemMeta();
        ItemMeta ZHU_QUE_SHENG_QI3Meta = ZHU_QUE_SHENG_QI3.getItemMeta();
        ItemMeta ZHU_QUE_SHENG_QI4Meta = ZHU_QUE_SHENG_QI4.getItemMeta();
        ItemMeta ZHU_QUE_SHENG_QI5Meta = ZHU_QUE_SHENG_QI5.getItemMeta();
        ItemMeta ZHU_QUE_SHENG_QI6Meta = ZHU_QUE_SHENG_QI6.getItemMeta();

        ItemMeta XUAN_WU_SHENG_QI2Meta = XUAN_WU_SHENG_QI2.getItemMeta();
        ItemMeta XUAN_WU_SHENG_QI3Meta = XUAN_WU_SHENG_QI3.getItemMeta();
        ItemMeta XUAN_WU_SHENG_QI4Meta = XUAN_WU_SHENG_QI4.getItemMeta();
        ItemMeta XUAN_WU_SHENG_QI5Meta = XUAN_WU_SHENG_QI5.getItemMeta();
        ItemMeta XUAN_WU_SHENG_QI6Meta = XUAN_WU_SHENG_QI6.getItemMeta();

        ItemMeta TAN_YU_ZHI_JIEMeta = TAN_YU_ZHI_JIE.getItemMeta();
        ItemMeta TAN_LAN_DU_JIEMeta = TAN_LAN_DU_JIE.getItemMeta();
        ItemMeta TAN_LAN_XIE_JIEMeta = TAN_LAN_XIE_JIE.getItemMeta();
        ItemMeta TAN_LAN_GUI_JIEMeta = TAN_LAN_GUI_JIE.getItemMeta();
        ItemMeta TAN_LAN_MO_JIEMeta = TAN_LAN_MO_JIE.getItemMeta();
        ItemMeta TAN_LAN_MING_JIEMeta = TAN_LAN_MING_JIE.getItemMeta();

        ItemMeta CHI_MI_ZHI_JIEMeta = CHI_MI_ZHI_JIE.getItemMeta();
        ItemMeta CHI_YU_DU_JIEMeta = CHI_YU_DU_JIE.getItemMeta();
        ItemMeta CHI_YU_XIE_JIEMeta = CHI_YU_XIE_JIE.getItemMeta();
        ItemMeta CHI_YU_GUI_JIEMeta = CHI_YU_GUI_JIE.getItemMeta();
        ItemMeta CHI_YU_MO_JIEMeta = CHI_YU_MO_JIE.getItemMeta();
        ItemMeta CHI_YU_MING_JIEMeta = CHI_YU_MING_JIE.getItemMeta();

        ItemMeta CHEN_NU_ZHI_JIEMeta = CHEN_NU_ZHI_JIE.getItemMeta();
        ItemMeta CHEN_HEN_DU_JIEMeta = CHEN_HEN_DU_JIE.getItemMeta();
        ItemMeta CHEN_HEN_XIE_JIEMeta = CHEN_HEN_XIE_JIE.getItemMeta();
        ItemMeta CHEN_HEN_GUI_JIEMeta = CHEN_HEN_GUI_JIE.getItemMeta();
        ItemMeta CHEN_HEN_MO_JIEMeta = CHEN_HEN_MO_JIE.getItemMeta();
        ItemMeta CHEN_HEN_MING_JIEMeta = CHEN_HEN_MING_JIE.getItemMeta();

        ItemMeta CHAN_DING_FA_JIEMeta = CHAN_DING_FA_JIE.getItemMeta();
        ItemMeta CHAN_DING_SHENG_JIEMeta = CHAN_DING_SHENG_JIE.getItemMeta();
        ItemMeta CHAN_DING_FO_JIEMeta = CHAN_DING_FO_JIE.getItemMeta();
        ItemMeta CHAN_DING_XIAN_JIEMeta = CHAN_DING_XIAN_JIE.getItemMeta();
        ItemMeta CHAN_DING_SHEN_JIEMeta = CHAN_DING_SHEN_JIE.getItemMeta();

        ItemMeta ZHI_HUI_FA_JIEMeta = ZHI_HUI_FA_JIE.getItemMeta();
        ItemMeta ZHI_HUI_SHENG_JIEMeta = ZHI_HUI_SHENG_JIE.getItemMeta();
        ItemMeta ZHI_HUI_FO_JIEMeta = ZHI_HUI_FO_JIE.getItemMeta();
        ItemMeta ZHI_HUI_XIAN_JIEMeta = ZHI_HUI_XIAN_JIE.getItemMeta();
        ItemMeta ZHI_HUI_SHEN_JIEMeta = ZHI_HUI_SHEN_JIE.getItemMeta();

        ItemMeta CHI_JIE_FA_JIEMeta = CHI_JIE_FA_JIE.getItemMeta();
        ItemMeta CHI_JIE_SHENG_JIEMeta = CHI_JIE_SHENG_JIE.getItemMeta();
        ItemMeta CHI_JIE_FO_JIEMeta = CHI_JIE_FO_JIE.getItemMeta();
        ItemMeta CHI_JIE_XIAN_JIEMeta = CHI_JIE_XIAN_JIE.getItemMeta();
        ItemMeta CHI_JIE_SHEN_JIEMeta = CHI_JIE_SHEN_JIE.getItemMeta();


        ItemMeta ZHAOYAOJINMeta = ZHAOYAOJIN.getItemMeta();
        ItemMeta YUFUCHENMeta = YUFUCHEN.getItemMeta();
        ItemMeta WUSEBUTIANSHIMeta = WUSEBUTIANSHI.getItemMeta();

        ItemMeta YAOWANGHULUMeta = YAOWANGHULU.getItemMeta();
        ItemMeta CIXINMIAOLIANMeta = CIXINMIAOLIAN.getItemMeta();
        ItemMeta SHENXINYUGUMeta = SHENXINYUGU.getItemMeta();
        ItemMeta YINYANGZHANLONGJIANMeta = YINYANGZHANLONGJIAN.getItemMeta();
        ItemMeta YUNLANGBANMeta = YUNLANGBAN.getItemMeta();
        ItemMeta ZHENHUNYUXIAOMeta = ZHENHUNYUXIAO.getItemMeta();
        ItemMeta DIKUIHUALANMeta = DIKUIHUALAN.getItemMeta();
        ItemMeta XUANFENGZONGSHANMeta = XUANFENGZONGSHAN.getItemMeta();
        ItemMeta TAIJIBAGUAMeta = TAIJIBAGUA.getItemMeta();

        ItemMeta JUEDOULINGMeta = JUEDOULING.getItemMeta();
        ItemMeta LEIMINGGUMeta = LEIMINGGU.getItemMeta();
        ItemMeta HUANSILINMeta = HUANSILIN.getItemMeta();
        ItemMeta NIUMONUHOUMeta = NIUMONUHOU.getItemMeta();

        ItemMeta DOUQISHIMeta = DOUQISHI.getItemMeta();
        ItemMeta PANGUANBIMeta = PANGUANBI.getItemMeta();
        ItemMeta MINSHENGJIANMeta = MINSHENGJIAN.getItemMeta();
        ItemMeta ZHENLEITIANCHUIMeta = ZHENLEITIANCHUI.getItemMeta();

        ItemMeta DIAOHUNGANMeta = DIAOHUNGAN.getItemMeta();
        ItemMeta SHELINZHUMeta = SHELINZHU.getItemMeta();
        ItemMeta YUJINPINMeta = YUJINPIN.getItemMeta();
        ItemMeta TIANJISHENJINMeta = TIANJISHENJIN.getItemMeta();

        ItemMeta RUIYINGYANMeta = RUIYINGYAN.getItemMeta();
        ItemMeta DUOHUNTANGMeta = DUOHUNTANG.getItemMeta();
        ItemMeta MOYUANFOZHUMeta = MOYUANFOZHU.getItemMeta();
        ItemMeta FUXINRUYIMeta = FUXINRUYI.getItemMeta();

        ItemMeta LVYEXIANZONGMeta = LVYEXIANZONG.getItemMeta();
        ItemMeta QINGNVHANSHUANGMeta = QINGNVHANSHUANG.getItemMeta();
        ItemMeta ZHURONGKUYANMeta = ZHURONGKUYAN.getItemMeta();
        ItemMeta ZHUDIANXUANJINGMeta = ZHUDIANXUANJING.getItemMeta();

        ItemMeta BUHUNWANGMeta = BUHUNWANG.getItemMeta();
        ItemMeta YANGSHOUJIANMeta = YANGSHOUJIAN.getItemMeta();
        ItemMeta WUMINGMOYINLUOMeta = WUMINGMOYINLUO.getItemMeta();
        ItemMeta SHETIANHUAXUELINGMeta = SHETIANHUAXUELING.getItemMeta();

        ItemMeta KUYELINGMeta = KUYELING.getItemMeta();
        ItemMeta LUOBEIJINPINMeta = LUOBEIJINPIN.getItemMeta();
        ItemMeta PINYUSHUIYUMeta = PINYUSHUIYU.getItemMeta();
        ItemMeta DIKONGYUMOQUANMeta = DIKONGYUMOQUAN.getItemMeta();

        ItemMeta LUANSHENGUMeta = LUANSHENGU.getItemMeta();
        ItemMeta JINGULIANMeta = JINGULIAN.getItemMeta();
        ItemMeta JIANCHANGULINMeta = JIANCHANGULIN.getItemMeta();
        ItemMeta MODUOHUNFANMeta = MODUOHUNFAN.getItemMeta();

        core2Meta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );

        core3Meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        core4Meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        core5Meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        core6Meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        core7Meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );

        core8Meta.lore(
                List.of(
                        ComponentSet.RARE8
                )
        );

        kaiShanDaoMeta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        chiTongJianMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        poKongFuMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        sanBaoYuRuYiMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        xuanYuanMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        qinTongJianMeta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        juTongZhanChuiMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        taiJiJianMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        kunLunFeiXianJianMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        taiEMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        yinYueQiangMeta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        hongYinQiangMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        youLongQiangMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        huTouZhanJinQiangMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        ruYiJinGuBangMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        qinTongGongMeta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        yanTieGongMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhongChuiGongMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        beiDouMieShenGongMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhuRiMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        heiTieNuMeta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        hongLinNuMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        jiaoLongNuMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        riYueLiuXingNuMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        liangYiMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        fuRongGongMeta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        hongLuanGongMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        tianQiongGongMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        sheTianZhuiYueGongMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        liuGuangMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        qinTongGuoMeta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        lianDanLuMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        suoHunLuMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        qiShaDingMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        hunYuanShenDingMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        touSp2Meta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        touSp3Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        touSp4Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        touSp5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        touSp6Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        touSp7Meta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        touSp8Meta.lore(
                List.of(
                        ComponentSet.RARE8,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanTou2Meta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanTou3Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanTou4Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanTou5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanTou6Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanTou7Meta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanTou8Meta.lore(
                List.of(
                        ComponentSet.RARE8,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongTou2Meta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongTou3Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongTou4Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongTou5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongTou6Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongTou7Meta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongTou8Meta.lore(
                List.of(
                        ComponentSet.RARE8,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danTou2Meta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danTou3Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danTou4Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danTou5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danTou6Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danTou7Meta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danTou8Meta.lore(
                List.of(
                        ComponentSet.RARE8,
                        ComponentSet.SHORTPEIFANG
                )
        );

        xiongSp2Meta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        xiongSp3Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        xiongSp4Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        xiongSp5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        xiongSp6Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        xiongSp7Meta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        xiongSp8Meta.lore(
                List.of(
                        ComponentSet.RARE8,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanXiong2Meta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanXiong3Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanXiong4Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanXiong5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanXiong6Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanXiong7Meta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanXiong8Meta.lore(
                List.of(
                        ComponentSet.RARE8,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongXiong2Meta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongXiong3Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongXiong4Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongXiong5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongXiong6Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongXiong7Meta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongXiong8Meta.lore(
                List.of(
                        ComponentSet.RARE8,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danXiong2Meta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danXiong3Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danXiong4Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danXiong5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danXiong6Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danXiong7Meta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danXiong8Meta.lore(
                List.of(
                        ComponentSet.RARE8,
                        ComponentSet.SHORTPEIFANG
                )
        );

        tuiSp2Meta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        tuiSp3Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        tuiSp4Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        tuiSp5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        tuiSp6Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        tuiSp7Meta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        tuiSp8Meta.lore(
                List.of(
                        ComponentSet.RARE8,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanTui2Meta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanTui3Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanTui4Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanTui5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanTui6Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanTui7Meta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanTui8Meta.lore(
                List.of(
                        ComponentSet.RARE8,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongTui2Meta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongTui3Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongTui4Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongTui5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongTui6Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongTui7Meta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongTui8Meta.lore(
                List.of(
                        ComponentSet.RARE8,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danTui2Meta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danTui3Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danTui4Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danTui5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danTui6Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danTui7Meta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danTui8Meta.lore(
                List.of(
                        ComponentSet.RARE8,
                        ComponentSet.SHORTPEIFANG
                )
        );

        xieSp2Meta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        xieSp3Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        xieSp4Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        xieSp5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        xieSp6Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        xieSp7Meta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        xieSp8Meta.lore(
                List.of(
                        ComponentSet.RARE8,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanXie2Meta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanXie3Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanXie4Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanXie5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanXie6Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanXie7Meta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        zhanXie8Meta.lore(
                List.of(
                        ComponentSet.RARE8,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongXie2Meta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongXie3Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongXie4Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongXie5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongXie6Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongXie7Meta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        gongXie8Meta.lore(
                List.of(
                        ComponentSet.RARE8,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danXie2Meta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danXie3Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danXie4Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danXie5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danXie6Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danXie7Meta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        danXie8Meta.lore(
                List.of(
                        ComponentSet.RARE8,
                        ComponentSet.SHORTPEIFANG
                )
        );

        JINRUIFEIRENMeta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        WUSHENGXIUJIANMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        HUIXUANTAJIMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        WUYINWUZONGMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        YANWANGTIEMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        HUANGTONGCHONGMeta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        MINGYUEMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CANLANMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        JINJINGMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        XIAOTIANMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        QINFENGYINYINMeta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        LIUSHUICHANCHANMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        BUQICHUNYUMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        SANSHENGZHENHUNMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        JIUFENGLAIYIMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        XINBINDUNPAIMeta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        JINRUIDUNPAIMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHISEYUEHUOMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        JINGANGBUHUAIMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHENBINLUOXUEMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        XINBINJIANDAIMeta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        JINRUIJIANDAIMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        YINGYANJIANDAIMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CANGGUNINGWANGMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        NIEPANYUNANGMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        TIEZHIDUANBIMeta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        HUIYIDAOMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        LONGYADAOMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        ZHANGQICUIZHUMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        MINGHONGMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        QING_LONG_SHENG_QI2Meta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        QING_LONG_SHENG_QI3Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        QING_LONG_SHENG_QI4Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        QING_LONG_SHENG_QI5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        QING_LONG_SHENG_QI6Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        BAI_HU_SHENG_QI2Meta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        BAI_HU_SHENG_QI3Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        BAI_HU_SHENG_QI4Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        BAI_HU_SHENG_QI5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        BAI_HU_SHENG_QI6Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        ZHU_QUE_SHENG_QI2Meta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        ZHU_QUE_SHENG_QI3Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        ZHU_QUE_SHENG_QI4Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        ZHU_QUE_SHENG_QI5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        ZHU_QUE_SHENG_QI6Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        XUAN_WU_SHENG_QI2Meta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        XUAN_WU_SHENG_QI3Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        XUAN_WU_SHENG_QI4Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        XUAN_WU_SHENG_QI5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        XUAN_WU_SHENG_QI6Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        TAN_YU_ZHI_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        TAN_LAN_DU_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        TAN_LAN_XIE_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        TAN_LAN_GUI_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        TAN_LAN_MO_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        TAN_LAN_MING_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHI_MI_ZHI_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHI_YU_DU_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHI_YU_XIE_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHI_YU_GUI_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHI_YU_MO_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHI_YU_MING_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHEN_NU_ZHI_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE2,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHEN_HEN_DU_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHEN_HEN_XIE_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHEN_HEN_GUI_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHEN_HEN_MO_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHEN_HEN_MING_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHAN_DING_FA_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHAN_DING_SHENG_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHAN_DING_FO_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHAN_DING_XIAN_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHAN_DING_SHEN_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        ZHI_HUI_FA_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        ZHI_HUI_SHENG_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        ZHI_HUI_FO_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        ZHI_HUI_XIAN_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        ZHI_HUI_SHEN_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHI_JIE_FA_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHI_JIE_SHENG_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHI_JIE_FO_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHI_JIE_XIAN_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CHI_JIE_SHEN_JIEMeta.lore(
                List.of(
                        ComponentSet.RARE7,
                        ComponentSet.SHORTPEIFANG
                )
        );

        ZHAOYAOJINMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        YUFUCHENMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        WUSEBUTIANSHIMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        YAOWANGHULUMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        CIXINMIAOLIANMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        SHENXINYUGUMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        YINYANGZHANLONGJIANMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        YUNLANGBANMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        ZHENHUNYUXIAOMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        DIKUIHUALANMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        XUANFENGZONGSHANMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        TAIJIBAGUAMeta.lore(
                List.of(
                        ComponentSet.RARE8,
                        ComponentSet.SHORTPEIFANG
                )
        );

        JUEDOULINGMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        LEIMINGGUMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        HUANSILINMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        NIUMONUHOUMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        DOUQISHIMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        PANGUANBIMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        MINSHENGJIANMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        ZHENLEITIANCHUIMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        DIAOHUNGANMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        SHELINZHUMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        YUJINPINMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        TIANJISHENJINMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        RUIYINGYANMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        DUOHUNTANGMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        MOYUANFOZHUMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        FUXINRUYIMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        LVYEXIANZONGMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        QINGNVHANSHUANGMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        ZHURONGKUYANMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        ZHUDIANXUANJINGMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        BUHUNWANGMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        YANGSHOUJIANMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        WUMINGMOYINLUOMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        SHETIANHUAXUELINGMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        KUYELINGMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        LUOBEIJINPINMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        PINYUSHUIYUMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        DIKONGYUMOQUANMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );

        LUANSHENGUMeta.lore(
                List.of(
                        ComponentSet.RARE3,
                        ComponentSet.SHORTPEIFANG
                )
        );

        JINGULIANMeta.lore(
                List.of(
                        ComponentSet.RARE4,
                        ComponentSet.SHORTPEIFANG
                )
        );

        JIANCHANGULINMeta.lore(
                List.of(
                        ComponentSet.RARE5,
                        ComponentSet.SHORTPEIFANG
                )
        );

        MODUOHUNFANMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        ComponentSet.SHORTPEIFANG
                )
        );


        core2Meta.setMaxStackSize(99);
        core3Meta.setMaxStackSize(99);
        core4Meta.setMaxStackSize(99);
        core5Meta.setMaxStackSize(99);
        core6Meta.setMaxStackSize(99);
        core7Meta.setMaxStackSize(99);
        core8Meta.setMaxStackSize(99);

        kaiShanDaoMeta.setMaxStackSize(99);
        chiTongJianMeta.setMaxStackSize(99);
        poKongFuMeta.setMaxStackSize(99);
        sanBaoYuRuYiMeta.setMaxStackSize(99);
        xuanYuanMeta.setMaxStackSize(99);

        qinTongJianMeta.setMaxStackSize(99);
        juTongZhanChuiMeta.setMaxStackSize(99);
        taiJiJianMeta.setMaxStackSize(99);
        kunLunFeiXianJianMeta.setMaxStackSize(99);
        taiEMeta.setMaxStackSize(99);

        yinYueQiangMeta.setMaxStackSize(99);
        hongYinQiangMeta.setMaxStackSize(99);
        youLongQiangMeta.setMaxStackSize(99);
        huTouZhanJinQiangMeta.setMaxStackSize(99);
        ruYiJinGuBangMeta.setMaxStackSize(99);

        qinTongGongMeta.setMaxStackSize(99);
        yanTieGongMeta.setMaxStackSize(99);
        zhongChuiGongMeta.setMaxStackSize(99);
        beiDouMieShenGongMeta.setMaxStackSize(99);
        zhuRiMeta.setMaxStackSize(99);

        heiTieNuMeta.setMaxStackSize(99);
        hongLinNuMeta.setMaxStackSize(99);
        jiaoLongNuMeta.setMaxStackSize(99);
        riYueLiuXingNuMeta.setMaxStackSize(99);
        liangYiMeta.setMaxStackSize(99);

        fuRongGongMeta.setMaxStackSize(99);
        hongLuanGongMeta.setMaxStackSize(99);
        tianQiongGongMeta.setMaxStackSize(99);
        sheTianZhuiYueGongMeta.setMaxStackSize(99);
        liuGuangMeta.setMaxStackSize(99);

        qinTongGuoMeta.setMaxStackSize(99);
        lianDanLuMeta.setMaxStackSize(99);
        suoHunLuMeta.setMaxStackSize(99);
        qiShaDingMeta.setMaxStackSize(99);
        hunYuanShenDingMeta.setMaxStackSize(99);

        touSp2Meta.setMaxStackSize(99);
        touSp3Meta.setMaxStackSize(99);
        touSp4Meta.setMaxStackSize(99);
        touSp5Meta.setMaxStackSize(99);
        touSp6Meta.setMaxStackSize(99);
        touSp7Meta.setMaxStackSize(99);
        touSp8Meta.setMaxStackSize(99);


        zhanTou2Meta.setMaxStackSize(99);
        zhanTou3Meta.setMaxStackSize(99);
        zhanTou4Meta.setMaxStackSize(99);
        zhanTou5Meta.setMaxStackSize(99);
        zhanTou6Meta.setMaxStackSize(99);
        zhanTou7Meta.setMaxStackSize(99);
        zhanTou8Meta.setMaxStackSize(99);

        gongTou2Meta.setMaxStackSize(99);
        gongTou3Meta.setMaxStackSize(99);
        gongTou4Meta.setMaxStackSize(99);
        gongTou5Meta.setMaxStackSize(99);
        gongTou6Meta.setMaxStackSize(99);
        gongTou7Meta.setMaxStackSize(99);
        gongTou8Meta.setMaxStackSize(99);

        danTou2Meta.setMaxStackSize(99);
        danTou3Meta.setMaxStackSize(99);
        danTou4Meta.setMaxStackSize(99);
        danTou5Meta.setMaxStackSize(99);
        danTou6Meta.setMaxStackSize(99);
        danTou7Meta.setMaxStackSize(99);
        danTou8Meta.setMaxStackSize(99);

        xiongSp2Meta.setMaxStackSize(99);
        xiongSp3Meta.setMaxStackSize(99);
        xiongSp4Meta.setMaxStackSize(99);
        xiongSp5Meta.setMaxStackSize(99);
        xiongSp6Meta.setMaxStackSize(99);
        xiongSp7Meta.setMaxStackSize(99);
        xiongSp8Meta.setMaxStackSize(99);

        zhanXiong2Meta.setMaxStackSize(99);
        zhanXiong3Meta.setMaxStackSize(99);
        zhanXiong4Meta.setMaxStackSize(99);
        zhanXiong5Meta.setMaxStackSize(99);
        zhanXiong6Meta.setMaxStackSize(99);
        zhanXiong7Meta.setMaxStackSize(99);
        zhanXiong8Meta.setMaxStackSize(99);

        gongXiong2Meta.setMaxStackSize(99);
        gongXiong3Meta.setMaxStackSize(99);
        gongXiong4Meta.setMaxStackSize(99);
        gongXiong5Meta.setMaxStackSize(99);
        gongXiong6Meta.setMaxStackSize(99);
        gongXiong7Meta.setMaxStackSize(99);
        gongXiong8Meta.setMaxStackSize(99);

        danXiong2Meta.setMaxStackSize(99);
        danXiong3Meta.setMaxStackSize(99);
        danXiong4Meta.setMaxStackSize(99);
        danXiong5Meta.setMaxStackSize(99);
        danXiong6Meta.setMaxStackSize(99);
        danXiong7Meta.setMaxStackSize(99);
        danXiong8Meta.setMaxStackSize(99);

        tuiSp2Meta.setMaxStackSize(99);
        tuiSp3Meta.setMaxStackSize(99);
        tuiSp4Meta.setMaxStackSize(99);
        tuiSp5Meta.setMaxStackSize(99);
        tuiSp6Meta.setMaxStackSize(99);
        tuiSp7Meta.setMaxStackSize(99);
        tuiSp8Meta.setMaxStackSize(99);

        zhanTui2Meta.setMaxStackSize(99);
        zhanTui3Meta.setMaxStackSize(99);
        zhanTui4Meta.setMaxStackSize(99);
        zhanTui5Meta.setMaxStackSize(99);
        zhanTui6Meta.setMaxStackSize(99);
        zhanTui7Meta.setMaxStackSize(99);
        zhanTui8Meta.setMaxStackSize(99);

        gongTui2Meta.setMaxStackSize(99);
        gongTui3Meta.setMaxStackSize(99);
        gongTui4Meta.setMaxStackSize(99);
        gongTui5Meta.setMaxStackSize(99);
        gongTui6Meta.setMaxStackSize(99);
        gongTui7Meta.setMaxStackSize(99);
        gongTui8Meta.setMaxStackSize(99);

        danTui2Meta.setMaxStackSize(99);
        danTui3Meta.setMaxStackSize(99);
        danTui4Meta.setMaxStackSize(99);
        danTui5Meta.setMaxStackSize(99);
        danTui6Meta.setMaxStackSize(99);
        danTui7Meta.setMaxStackSize(99);
        danTui8Meta.setMaxStackSize(99);

        xieSp2Meta.setMaxStackSize(99);
        xieSp3Meta.setMaxStackSize(99);
        xieSp4Meta.setMaxStackSize(99);
        xieSp5Meta.setMaxStackSize(99);
        xieSp6Meta.setMaxStackSize(99);
        xieSp7Meta.setMaxStackSize(99);
        xieSp8Meta.setMaxStackSize(99);

        zhanXie2Meta.setMaxStackSize(99);
        zhanXie3Meta.setMaxStackSize(99);
        zhanXie4Meta.setMaxStackSize(99);
        zhanXie5Meta.setMaxStackSize(99);
        zhanXie6Meta.setMaxStackSize(99);
        zhanXie7Meta.setMaxStackSize(99);
        zhanXie8Meta.setMaxStackSize(99);

        gongXie2Meta.setMaxStackSize(99);
        gongXie3Meta.setMaxStackSize(99);
        gongXie4Meta.setMaxStackSize(99);
        gongXie5Meta.setMaxStackSize(99);
        gongXie6Meta.setMaxStackSize(99);
        gongXie7Meta.setMaxStackSize(99);
        gongXie8Meta.setMaxStackSize(99);

        danXie2Meta.setMaxStackSize(99);
        danXie3Meta.setMaxStackSize(99);
        danXie4Meta.setMaxStackSize(99);
        danXie5Meta.setMaxStackSize(99);
        danXie6Meta.setMaxStackSize(99);
        danXie7Meta.setMaxStackSize(99);
        danXie8Meta.setMaxStackSize(99);


        JINRUIFEIRENMeta.setMaxStackSize(99);
        WUSHENGXIUJIANMeta.setMaxStackSize(99);
        HUIXUANTAJIMeta.setMaxStackSize(99);
        WUYINWUZONGMeta.setMaxStackSize(99);
        YANWANGTIEMeta.setMaxStackSize(99);


        HUANGTONGCHONGMeta.setMaxStackSize(99);
        MINGYUEMeta.setMaxStackSize(99);
        CANLANMeta.setMaxStackSize(99);
        JINJINGMeta.setMaxStackSize(99);
        XIAOTIANMeta.setMaxStackSize(99);


        QINFENGYINYINMeta.setMaxStackSize(99);
        LIUSHUICHANCHANMeta.setMaxStackSize(99);
        BUQICHUNYUMeta.setMaxStackSize(99);
        SANSHENGZHENHUNMeta.setMaxStackSize(99);
        JIUFENGLAIYIMeta.setMaxStackSize(99);


        XINBINDUNPAIMeta.setMaxStackSize(99);
        JINRUIDUNPAIMeta.setMaxStackSize(99);
        CHISEYUEHUOMeta.setMaxStackSize(99);
        JINGANGBUHUAIMeta.setMaxStackSize(99);
        CHENBINLUOXUEMeta.setMaxStackSize(99);


        XINBINJIANDAIMeta.setMaxStackSize(99);
        JINRUIJIANDAIMeta.setMaxStackSize(99);
        YINGYANJIANDAIMeta.setMaxStackSize(99);
        CANGGUNINGWANGMeta.setMaxStackSize(99);
        NIEPANYUNANGMeta.setMaxStackSize(99);


        TIEZHIDUANBIMeta.setMaxStackSize(99);
        HUIYIDAOMeta.setMaxStackSize(99);
        LONGYADAOMeta.setMaxStackSize(99);
        ZHANGQICUIZHUMeta.setMaxStackSize(99);
        MINGHONGMeta.setMaxStackSize(99);

        QING_LONG_SHENG_QI2Meta.setMaxStackSize(99);
        QING_LONG_SHENG_QI3Meta.setMaxStackSize(99);
        QING_LONG_SHENG_QI4Meta.setMaxStackSize(99);
        QING_LONG_SHENG_QI5Meta.setMaxStackSize(99);
        QING_LONG_SHENG_QI6Meta.setMaxStackSize(99);

        BAI_HU_SHENG_QI2Meta.setMaxStackSize(99);
        BAI_HU_SHENG_QI3Meta.setMaxStackSize(99);
        BAI_HU_SHENG_QI4Meta.setMaxStackSize(99);
        BAI_HU_SHENG_QI5Meta.setMaxStackSize(99);
        BAI_HU_SHENG_QI6Meta.setMaxStackSize(99);

        ZHU_QUE_SHENG_QI2Meta.setMaxStackSize(99);
        ZHU_QUE_SHENG_QI3Meta.setMaxStackSize(99);
        ZHU_QUE_SHENG_QI4Meta.setMaxStackSize(99);
        ZHU_QUE_SHENG_QI5Meta.setMaxStackSize(99);
        ZHU_QUE_SHENG_QI6Meta.setMaxStackSize(99);

        XUAN_WU_SHENG_QI2Meta.setMaxStackSize(99);
        XUAN_WU_SHENG_QI3Meta.setMaxStackSize(99);
        XUAN_WU_SHENG_QI4Meta.setMaxStackSize(99);
        XUAN_WU_SHENG_QI5Meta.setMaxStackSize(99);
        XUAN_WU_SHENG_QI6Meta.setMaxStackSize(99);

        TAN_YU_ZHI_JIEMeta.setMaxStackSize(99);
        TAN_LAN_DU_JIEMeta.setMaxStackSize(99);
        TAN_LAN_XIE_JIEMeta.setMaxStackSize(99);
        TAN_LAN_GUI_JIEMeta.setMaxStackSize(99);
        TAN_LAN_MO_JIEMeta.setMaxStackSize(99);
        TAN_LAN_MING_JIEMeta.setMaxStackSize(99);

        CHI_MI_ZHI_JIEMeta.setMaxStackSize(99);
        CHI_YU_DU_JIEMeta.setMaxStackSize(99);
        CHI_YU_XIE_JIEMeta.setMaxStackSize(99);
        CHI_YU_GUI_JIEMeta.setMaxStackSize(99);
        CHI_YU_MO_JIEMeta.setMaxStackSize(99);
        CHI_YU_MING_JIEMeta.setMaxStackSize(99);

        CHEN_NU_ZHI_JIEMeta.setMaxStackSize(99);
        CHEN_HEN_DU_JIEMeta.setMaxStackSize(99);
        CHEN_HEN_XIE_JIEMeta.setMaxStackSize(99);
        CHEN_HEN_GUI_JIEMeta.setMaxStackSize(99);
        CHEN_HEN_MO_JIEMeta.setMaxStackSize(99);
        CHEN_HEN_MING_JIEMeta.setMaxStackSize(99);

        CHAN_DING_FA_JIEMeta.setMaxStackSize(99);
        CHAN_DING_SHENG_JIEMeta.setMaxStackSize(99);
        CHAN_DING_FO_JIEMeta.setMaxStackSize(99);
        CHAN_DING_XIAN_JIEMeta.setMaxStackSize(99);
        CHAN_DING_SHEN_JIEMeta.setMaxStackSize(99);

        ZHI_HUI_FA_JIEMeta.setMaxStackSize(99);
        ZHI_HUI_SHENG_JIEMeta.setMaxStackSize(99);
        ZHI_HUI_FO_JIEMeta.setMaxStackSize(99);
        ZHI_HUI_XIAN_JIEMeta.setMaxStackSize(99);
        ZHI_HUI_SHEN_JIEMeta.setMaxStackSize(99);

        CHI_JIE_FA_JIEMeta.setMaxStackSize(99);
        CHI_JIE_SHENG_JIEMeta.setMaxStackSize(99);
        CHI_JIE_FO_JIEMeta.setMaxStackSize(99);
        CHI_JIE_XIAN_JIEMeta.setMaxStackSize(99);
        CHI_JIE_SHEN_JIEMeta.setMaxStackSize(99);

        ZHAOYAOJINMeta.setMaxStackSize(99);
        YUFUCHENMeta.setMaxStackSize(99);
        WUSEBUTIANSHIMeta.setMaxStackSize(99);

        YAOWANGHULUMeta.setMaxStackSize(99);
        CIXINMIAOLIANMeta.setMaxStackSize(99);
        SHENXINYUGUMeta.setMaxStackSize(99);
        YINYANGZHANLONGJIANMeta.setMaxStackSize(99);
        YUNLANGBANMeta.setMaxStackSize(99);
        ZHENHUNYUXIAOMeta.setMaxStackSize(99);
        DIKUIHUALANMeta.setMaxStackSize(99);
        XUANFENGZONGSHANMeta.setMaxStackSize(99);
        TAIJIBAGUAMeta.setMaxStackSize(99);

        JUEDOULINGMeta.setMaxStackSize(99);
        LEIMINGGUMeta.setMaxStackSize(99);
        HUANSILINMeta.setMaxStackSize(99);
        NIUMONUHOUMeta.setMaxStackSize(99);

        DOUQISHIMeta.setMaxStackSize(99);
        PANGUANBIMeta.setMaxStackSize(99);
        MINSHENGJIANMeta.setMaxStackSize(99);
        ZHENLEITIANCHUIMeta.setMaxStackSize(99);

        DIAOHUNGANMeta.setMaxStackSize(99);
        SHELINZHUMeta.setMaxStackSize(99);
        YUJINPINMeta.setMaxStackSize(99);
        TIANJISHENJINMeta.setMaxStackSize(99);

        RUIYINGYANMeta.setMaxStackSize(99);
        DUOHUNTANGMeta.setMaxStackSize(99);
        MOYUANFOZHUMeta.setMaxStackSize(99);
        FUXINRUYIMeta.setMaxStackSize(99);

        LVYEXIANZONGMeta.setMaxStackSize(99);
        QINGNVHANSHUANGMeta.setMaxStackSize(99);
        ZHURONGKUYANMeta.setMaxStackSize(99);
        ZHUDIANXUANJINGMeta.setMaxStackSize(99);

        BUHUNWANGMeta.setMaxStackSize(99);
        YANGSHOUJIANMeta.setMaxStackSize(99);
        WUMINGMOYINLUOMeta.setMaxStackSize(99);
        SHETIANHUAXUELINGMeta.setMaxStackSize(99);

        KUYELINGMeta.setMaxStackSize(99);
        LUOBEIJINPINMeta.setMaxStackSize(99);
        PINYUSHUIYUMeta.setMaxStackSize(99);
        DIKONGYUMOQUANMeta.setMaxStackSize(99);

        LUANSHENGUMeta.setMaxStackSize(99);
        JINGULIANMeta.setMaxStackSize(99);
        JIANCHANGULINMeta.setMaxStackSize(99);
        MODUOHUNFANMeta.setMaxStackSize(99);

        PersistentDataContainer pdcCore2 = core2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcCore3 = core3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcCore4 = core4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcCore5 = core5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcCore6 = core6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcCore7 = core7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcCore8 = core8Meta.getPersistentDataContainer();

        PersistentDataContainer pdcKaiShanDao = kaiShanDaoMeta.getPersistentDataContainer();
        PersistentDataContainer pdcChiTongJian = chiTongJianMeta.getPersistentDataContainer();
        PersistentDataContainer pdcPoKongFu = poKongFuMeta.getPersistentDataContainer();
        PersistentDataContainer pdcSanBaoYuRuYi = sanBaoYuRuYiMeta.getPersistentDataContainer();
        PersistentDataContainer pdcXuanYuan = xuanYuanMeta.getPersistentDataContainer();

        PersistentDataContainer pdcQinTongJian = qinTongJianMeta.getPersistentDataContainer();
        PersistentDataContainer pdcJuTongZhanChui = juTongZhanChuiMeta.getPersistentDataContainer();
        PersistentDataContainer pdcTaiJiJian = taiJiJianMeta.getPersistentDataContainer();
        PersistentDataContainer pdcKunLunFeiXianJian = kunLunFeiXianJianMeta.getPersistentDataContainer();
        PersistentDataContainer pdcTaiE = taiEMeta.getPersistentDataContainer();

        PersistentDataContainer pdcYinYueQiang = yinYueQiangMeta.getPersistentDataContainer();
        PersistentDataContainer pdcHongYinQiang = hongYinQiangMeta.getPersistentDataContainer();
        PersistentDataContainer pdcYouLongQiang = youLongQiangMeta.getPersistentDataContainer();
        PersistentDataContainer pdcHuTouZhanJinQiang = huTouZhanJinQiangMeta.getPersistentDataContainer();
        PersistentDataContainer pdcRuYiJinGuBang = ruYiJinGuBangMeta.getPersistentDataContainer();

        PersistentDataContainer pdcQinTongGong = qinTongGongMeta.getPersistentDataContainer();
        PersistentDataContainer pdcYanTieGong = yanTieGongMeta.getPersistentDataContainer();
        PersistentDataContainer pdcZhongChuiGong = zhongChuiGongMeta.getPersistentDataContainer();
        PersistentDataContainer pdcBeiDouMieShenGong = beiDouMieShenGongMeta.getPersistentDataContainer();
        PersistentDataContainer pdcZhuRi = zhuRiMeta.getPersistentDataContainer();

        PersistentDataContainer pdcHeiTieNu = heiTieNuMeta.getPersistentDataContainer();
        PersistentDataContainer pdcHongLinNu = hongLinNuMeta.getPersistentDataContainer();
        PersistentDataContainer pdcJiaoLongNu = jiaoLongNuMeta.getPersistentDataContainer();
        PersistentDataContainer pdcRiYueLiuXingNu = riYueLiuXingNuMeta.getPersistentDataContainer();
        PersistentDataContainer pdcLiangYi = liangYiMeta.getPersistentDataContainer();

        PersistentDataContainer pdcFuRongGong = fuRongGongMeta.getPersistentDataContainer();
        PersistentDataContainer pdcHongLuanGong = hongLuanGongMeta.getPersistentDataContainer();
        PersistentDataContainer pdcTianQiongGong = tianQiongGongMeta.getPersistentDataContainer();
        PersistentDataContainer pdcSheTianZhuiYueGong = sheTianZhuiYueGongMeta.getPersistentDataContainer();
        PersistentDataContainer pdcLiuGuang = liuGuangMeta.getPersistentDataContainer();

        PersistentDataContainer pdcQinTongGuo = qinTongGuoMeta.getPersistentDataContainer();
        PersistentDataContainer pdcLianDanLu = lianDanLuMeta.getPersistentDataContainer();
        PersistentDataContainer pdcSuoHunLu = suoHunLuMeta.getPersistentDataContainer();
        PersistentDataContainer pdcQiShaDing = qiShaDingMeta.getPersistentDataContainer();
        PersistentDataContainer pdcHunYuanShenDing = hunYuanShenDingMeta.getPersistentDataContainer();

        PersistentDataContainer pdcTouSp2 = touSp2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcTouSp3 = touSp3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcTouSp4 = touSp4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcTouSp5 = touSp5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcTouSp6 = touSp6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcTouSp7 = touSp7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcTouSp8 = touSp8Meta.getPersistentDataContainer();

        PersistentDataContainer pdcZhanTou2 = zhanTou2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanTou3 = zhanTou3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanTou4 = zhanTou4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanTou5 = zhanTou5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanTou6 = zhanTou6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanTou7 = zhanTou7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanTou8 = zhanTou8Meta.getPersistentDataContainer();

        PersistentDataContainer pdcGongTou2 = gongTou2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongTou3 = gongTou3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongTou4 = gongTou4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongTou5 = gongTou5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongTou6 = gongTou6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongTou7 = gongTou7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongTou8 = gongTou8Meta.getPersistentDataContainer();

        PersistentDataContainer pdcDanTou2 = danTou2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanTou3 = danTou3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanTou4 = danTou4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanTou5 = danTou5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanTou6 = danTou6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanTou7 = danTou7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanTou8 = danTou8Meta.getPersistentDataContainer();

        PersistentDataContainer pdcXiongSp2 = xiongSp2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXiongSp3 = xiongSp3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXiongSp4 = xiongSp4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXiongSp5 = xiongSp5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXiongSp6 = xiongSp6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXiongSp7 = xiongSp7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXiongSp8 = xiongSp8Meta.getPersistentDataContainer();

        PersistentDataContainer pdcZhanXiong2 = zhanXiong2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanXiong3 = zhanXiong3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanXiong4 = zhanXiong4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanXiong5 = zhanXiong5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanXiong6 = zhanXiong6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanXiong7 = zhanXiong7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanXiong8 = zhanXiong8Meta.getPersistentDataContainer();

        PersistentDataContainer pdcGongXiong2 = gongXiong2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongXiong3 = gongXiong3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongXiong4 = gongXiong4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongXiong5 = gongXiong5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongXiong6 = gongXiong6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongXiong7 = gongXiong7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongXiong8 = gongXiong8Meta.getPersistentDataContainer();

        PersistentDataContainer pdcDanXiong2 = danXiong2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanXiong3 = danXiong3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanXiong4 = danXiong4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanXiong5 = danXiong5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanXiong6 = danXiong6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanXiong7 = danXiong7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanXiong8 = danXiong8Meta.getPersistentDataContainer();

        PersistentDataContainer pdcTuiSp2 = tuiSp2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcTuiSp3 = tuiSp3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcTuiSp4 = tuiSp4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcTuiSp5 = tuiSp5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcTuiSp6 = tuiSp6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcTuiSp7 = tuiSp7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcTuiSp8 = tuiSp8Meta.getPersistentDataContainer();

        PersistentDataContainer pdcZhanTui2 = zhanTui2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanTui3 = zhanTui3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanTui4 = zhanTui4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanTui5 = zhanTui5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanTui6 = zhanTui6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanTui7 = zhanTui7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanTui8 = zhanTui8Meta.getPersistentDataContainer();

        PersistentDataContainer pdcGongTui2 = gongTui2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongTui3 = gongTui3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongTui4 = gongTui4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongTui5 = gongTui5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongTui6 = gongTui6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongTui7 = gongTui7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongTui8 = gongTui8Meta.getPersistentDataContainer();

        PersistentDataContainer pdcDanTui2 = danTui2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanTui3 = danTui3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanTui4 = danTui4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanTui5 = danTui5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanTui6 = danTui6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanTui7 = danTui7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanTui8 = danTui8Meta.getPersistentDataContainer();

        PersistentDataContainer pdcXieSp2 = xieSp2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXieSp3 = xieSp3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXieSp4 = xieSp4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXieSp5 = xieSp5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXieSp6 = xieSp6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXieSp7 = xieSp7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXieSp8 = xieSp8Meta.getPersistentDataContainer();

        PersistentDataContainer pdcZhanXie2 = zhanXie2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanXie3 = zhanXie3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanXie4 = zhanXie4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanXie5 = zhanXie5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanXie6 = zhanXie6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanXie7 = zhanXie7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanXie8 = zhanXie8Meta.getPersistentDataContainer();

        PersistentDataContainer pdcGongXie2 = gongXie2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongXie3 = gongXie3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongXie4 = gongXie4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongXie5 = gongXie5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongXie6 = gongXie6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongXie7 = gongXie7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongXie8 = gongXie8Meta.getPersistentDataContainer();

        PersistentDataContainer pdcDanXie2 = danXie2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanXie3 = danXie3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanXie4 = danXie4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanXie5 = danXie5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanXie6 = danXie6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanXie7 = danXie7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanXie8 = danXie8Meta.getPersistentDataContainer();

        PersistentDataContainer pdcJinRuiFeiRen = JINRUIFEIRENMeta.getPersistentDataContainer();
        PersistentDataContainer pdcWuShengXiuJian = WUSHENGXIUJIANMeta.getPersistentDataContainer();
        PersistentDataContainer pdcHuiXuanTaiJi = HUIXUANTAJIMeta.getPersistentDataContainer();
        PersistentDataContainer pdcWuYinWuZong = WUYINWUZONGMeta.getPersistentDataContainer();
        PersistentDataContainer pdcYanWangTie = YANWANGTIEMeta.getPersistentDataContainer();

        PersistentDataContainer pdcHuangTongChong = HUANGTONGCHONGMeta.getPersistentDataContainer();
        PersistentDataContainer pdcMingYue = MINGYUEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcCanLan = CANLANMeta.getPersistentDataContainer();
        PersistentDataContainer pdcJinJing = JINJINGMeta.getPersistentDataContainer();
        PersistentDataContainer pdcXiaoTian = XIAOTIANMeta.getPersistentDataContainer();

        PersistentDataContainer pdcQinFengYinYin = QINFENGYINYINMeta.getPersistentDataContainer();
        PersistentDataContainer pdcLiuShuiChanChan = LIUSHUICHANCHANMeta.getPersistentDataContainer();
        PersistentDataContainer pdcBuQiChunYu = BUQICHUNYUMeta.getPersistentDataContainer();
        PersistentDataContainer pdcSanShengZhenHun = SANSHENGZHENHUNMeta.getPersistentDataContainer();
        PersistentDataContainer pdcJiuFengLaiYi = JIUFENGLAIYIMeta.getPersistentDataContainer();

        PersistentDataContainer pdcXinBinDunPai = XINBINDUNPAIMeta.getPersistentDataContainer();
        PersistentDataContainer pdcJinRuiDunPai = JINRUIDUNPAIMeta.getPersistentDataContainer();
        PersistentDataContainer pdcChiSeYueHuo = CHISEYUEHUOMeta.getPersistentDataContainer();
        PersistentDataContainer pdcJinGangBuHuai = JINGANGBUHUAIMeta.getPersistentDataContainer();
        PersistentDataContainer pdcChenBinLuoXue = CHENBINLUOXUEMeta.getPersistentDataContainer();

        PersistentDataContainer pdcXinBinJianDai = XINBINJIANDAIMeta.getPersistentDataContainer();
        PersistentDataContainer pdcJinRuiJianDai = JINRUIJIANDAIMeta.getPersistentDataContainer();
        PersistentDataContainer pdcYingYanJianDai = YINGYANJIANDAIMeta.getPersistentDataContainer();
        PersistentDataContainer pdcCangGuNingWang = CANGGUNINGWANGMeta.getPersistentDataContainer();
        PersistentDataContainer pdcNiePanYunAng = NIEPANYUNANGMeta.getPersistentDataContainer();

        PersistentDataContainer pdcTieZhiDuanBi = TIEZHIDUANBIMeta.getPersistentDataContainer();
        PersistentDataContainer pdcHuiYiDao = HUIYIDAOMeta.getPersistentDataContainer();
        PersistentDataContainer pdcLongYaDao = LONGYADAOMeta.getPersistentDataContainer();
        PersistentDataContainer pdcZhangQiCuiZhu = ZHANGQICUIZHUMeta.getPersistentDataContainer();
        PersistentDataContainer pdcMingHong = MINGHONGMeta.getPersistentDataContainer();

        PersistentDataContainer pdcQingLongShengQi2 = QING_LONG_SHENG_QI2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcQingLongShengQi3 = QING_LONG_SHENG_QI3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcQingLongShengQi4 = QING_LONG_SHENG_QI4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcQingLongShengQi5 = QING_LONG_SHENG_QI5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcQingLongShengQi6 = QING_LONG_SHENG_QI6Meta.getPersistentDataContainer();

        PersistentDataContainer pdcBaiHuShengQi2 = BAI_HU_SHENG_QI2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcBaiHuShengQi3 = BAI_HU_SHENG_QI3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcBaiHuShengQi4 = BAI_HU_SHENG_QI4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcBaiHuShengQi5 = BAI_HU_SHENG_QI5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcBaiHuShengQi6 = BAI_HU_SHENG_QI6Meta.getPersistentDataContainer();

        PersistentDataContainer pdcZhuQueShengQi2 = ZHU_QUE_SHENG_QI2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhuQueShengQi3 = ZHU_QUE_SHENG_QI3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhuQueShengQi4 = ZHU_QUE_SHENG_QI4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhuQueShengQi5 = ZHU_QUE_SHENG_QI5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhuQueShengQi6 = ZHU_QUE_SHENG_QI6Meta.getPersistentDataContainer();

        PersistentDataContainer pdcXuanWuShengQi2 = XUAN_WU_SHENG_QI2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXuanWuShengQi3 = XUAN_WU_SHENG_QI3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXuanWuShengQi4 = XUAN_WU_SHENG_QI4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXuanWuShengQi5 = XUAN_WU_SHENG_QI5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXuanWuShengQi6 = XUAN_WU_SHENG_QI6Meta.getPersistentDataContainer();

        PersistentDataContainer pdcTanYuZhiJie = TAN_YU_ZHI_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcTanLanDuJie = TAN_LAN_DU_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcTanLanXieJie = TAN_LAN_XIE_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcTanLanGuiJie = TAN_LAN_GUI_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcTanLanMoJie = TAN_LAN_MO_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcTanLanMingJie = TAN_LAN_MING_JIEMeta.getPersistentDataContainer();

        PersistentDataContainer pdcChiMiZhiJie = CHI_MI_ZHI_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcChiYuDuJie = CHI_YU_DU_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcChiYuXieJie = CHI_YU_XIE_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcChiYuGuiJie = CHI_YU_GUI_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcChiYuMoJie = CHI_YU_MO_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcChiYuMingJie = CHI_YU_MING_JIEMeta.getPersistentDataContainer();

        PersistentDataContainer pdcChenNuZhiJie = CHEN_NU_ZHI_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcChenHenDuJie = CHEN_HEN_DU_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcChenHenXieJie = CHEN_HEN_XIE_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcChenHenGuiJie = CHEN_HEN_GUI_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcChenHenMoJie = CHEN_HEN_MO_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcChenHenMingJie = CHEN_HEN_MING_JIEMeta.getPersistentDataContainer();

        PersistentDataContainer pdcChanDingFaJie = CHAN_DING_FA_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcChanDingShengJie = CHAN_DING_SHENG_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcChanDingFoJie = CHAN_DING_FO_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcChanDingXianJie = CHAN_DING_XIAN_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcChanDingShenJie = CHAN_DING_SHEN_JIEMeta.getPersistentDataContainer();

        PersistentDataContainer pdcZhiHuiFaJie = ZHI_HUI_FA_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcZhiHuiShengJie = ZHI_HUI_SHENG_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcZhiHuiFoJie = ZHI_HUI_FO_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcZhiHuiXianJie = ZHI_HUI_XIAN_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcZhiHuiShenJie = ZHI_HUI_SHEN_JIEMeta.getPersistentDataContainer();

        PersistentDataContainer pdcChiJieFaJie = CHI_JIE_FA_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcChiJieShengJie = CHI_JIE_SHENG_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcChiJieFoJie = CHI_JIE_FO_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcChiJieXianJie = CHI_JIE_XIAN_JIEMeta.getPersistentDataContainer();
        PersistentDataContainer pdcChiJieShenJie = CHI_JIE_SHEN_JIEMeta.getPersistentDataContainer();

        PersistentDataContainer pdcZhaoYaoJin = ZHAOYAOJINMeta.getPersistentDataContainer();
        PersistentDataContainer pdcYuFuChen = YUFUCHENMeta.getPersistentDataContainer();
        PersistentDataContainer pdcWuSeBuTianShi = WUSEBUTIANSHIMeta.getPersistentDataContainer();

        PersistentDataContainer pdcYaoWangHuLu = YAOWANGHULUMeta.getPersistentDataContainer();
        PersistentDataContainer pdcCiXinMiaoLian = CIXINMIAOLIANMeta.getPersistentDataContainer();
        PersistentDataContainer pdcSHENXINYUGU = SHENXINYUGUMeta.getPersistentDataContainer();
        PersistentDataContainer pdcYINYANGZHANLONGJIAN = YINYANGZHANLONGJIANMeta.getPersistentDataContainer();
        PersistentDataContainer pdcYUNLANGBAN = YUNLANGBANMeta.getPersistentDataContainer();
        PersistentDataContainer pdcZHENHUNYUXIAO = ZHENHUNYUXIAOMeta.getPersistentDataContainer();
        PersistentDataContainer pdcDIKUIHUALAN = DIKUIHUALANMeta.getPersistentDataContainer();
        PersistentDataContainer pdcXuanFengZongShan = XUANFENGZONGSHANMeta.getPersistentDataContainer();
        PersistentDataContainer pdcTaijiBagua = TAIJIBAGUAMeta.getPersistentDataContainer();

        PersistentDataContainer pdcJUEDOULING = JUEDOULINGMeta.getPersistentDataContainer();
        PersistentDataContainer pdcLeimingu = LEIMINGGUMeta.getPersistentDataContainer();
        PersistentDataContainer pdcHuanSiLin = HUANSILINMeta.getPersistentDataContainer();
        PersistentDataContainer pdcNiuMoNuHou = NIUMONUHOUMeta.getPersistentDataContainer();

        PersistentDataContainer pdcDouQiShi = DOUQISHIMeta.getPersistentDataContainer();
        PersistentDataContainer pdcPanGuanBi = PANGUANBIMeta.getPersistentDataContainer();
        PersistentDataContainer pdcMinShengJian = MINSHENGJIANMeta.getPersistentDataContainer();
        PersistentDataContainer pdcZhenLeiTianChui = ZHENLEITIANCHUIMeta.getPersistentDataContainer();

        PersistentDataContainer pdcDiaoHunGan = DIAOHUNGANMeta.getPersistentDataContainer();
        PersistentDataContainer pdcSheLinZhu = SHELINZHUMeta.getPersistentDataContainer();
        PersistentDataContainer pdcYuJinPin = YUJINPINMeta.getPersistentDataContainer();
        PersistentDataContainer pdcTianJiShenJin = TIANJISHENJINMeta.getPersistentDataContainer();

        PersistentDataContainer pdcRuiYingYan = RUIYINGYANMeta.getPersistentDataContainer();
        PersistentDataContainer pdcDuoHunTang = DUOHUNTANGMeta.getPersistentDataContainer();
        PersistentDataContainer pdcMoYuanFoZhu = MOYUANFOZHUMeta.getPersistentDataContainer();
        PersistentDataContainer pdcFuXinRuYi = FUXINRUYIMeta.getPersistentDataContainer();

        PersistentDataContainer pdcLvYeXianZong = LVYEXIANZONGMeta.getPersistentDataContainer();
        PersistentDataContainer pdcQingNvHanShuang = QINGNVHANSHUANGMeta.getPersistentDataContainer();
        PersistentDataContainer pdcZhuRongKuYan = ZHURONGKUYANMeta.getPersistentDataContainer();
        PersistentDataContainer pdcZhuDianXuanJing = ZHUDIANXUANJINGMeta.getPersistentDataContainer();

        PersistentDataContainer pdcBuHunWang = BUHUNWANGMeta.getPersistentDataContainer();
        PersistentDataContainer pdcYangShouJian = YANGSHOUJIANMeta.getPersistentDataContainer();
        PersistentDataContainer pdcWuMingMoYinLuo = WUMINGMOYINLUOMeta.getPersistentDataContainer();
        PersistentDataContainer pdcSheTianHuaXueLing = SHETIANHUAXUELINGMeta.getPersistentDataContainer();

        PersistentDataContainer pdcKuYeLing = KUYELINGMeta.getPersistentDataContainer();
        PersistentDataContainer pdcLuoBeiJinPin = LUOBEIJINPINMeta.getPersistentDataContainer();
        PersistentDataContainer pdcPinYuShuiYu = PINYUSHUIYUMeta.getPersistentDataContainer();
        PersistentDataContainer pdcDiKongYuMoQuan = DIKONGYUMOQUANMeta.getPersistentDataContainer();

        PersistentDataContainer pdcLuanShenGu = LUANSHENGUMeta.getPersistentDataContainer();
        PersistentDataContainer pdcJinGuLian = JINGULIANMeta.getPersistentDataContainer();
        PersistentDataContainer pdcJianChanGuLin = JIANCHANGULINMeta.getPersistentDataContainer();
        PersistentDataContainer pdcMoDuoHunFan = MODUOHUNFANMeta.getPersistentDataContainer();

        pdcCore2.set(DataContainer.id, PersistentDataType.STRING, "core2");
        pdcCore3.set(DataContainer.id, PersistentDataType.STRING, "core3");
        pdcCore4.set(DataContainer.id, PersistentDataType.STRING, "core4");
        pdcCore5.set(DataContainer.id, PersistentDataType.STRING, "core5");
        pdcCore6.set(DataContainer.id, PersistentDataType.STRING, "core6");
        pdcCore7.set(DataContainer.id, PersistentDataType.STRING, "core7");
        pdcCore8.set(DataContainer.id, PersistentDataType.STRING, "core8");

        pdcKaiShanDao.set(DataContainer.id, PersistentDataType.STRING, "corekaiShanDao");
        pdcChiTongJian.set(DataContainer.id, PersistentDataType.STRING, "corechiTongJian");
        pdcPoKongFu.set(DataContainer.id, PersistentDataType.STRING, "corepoKongFu");
        pdcSanBaoYuRuYi.set(DataContainer.id, PersistentDataType.STRING, "coresanBaoYuRuYi");
        pdcXuanYuan.set(DataContainer.id, PersistentDataType.STRING, "corexuanYuan");

        pdcQinTongJian.set(DataContainer.id, PersistentDataType.STRING, "coreqinTongJian");
        pdcJuTongZhanChui.set(DataContainer.id, PersistentDataType.STRING, "corejuTongZhanChui");
        pdcTaiJiJian.set(DataContainer.id, PersistentDataType.STRING, "coretaiJiJian");
        pdcKunLunFeiXianJian.set(DataContainer.id, PersistentDataType.STRING, "corekunLunFeiXianJian");
        pdcTaiE.set(DataContainer.id, PersistentDataType.STRING, "coretaiE");

        pdcYinYueQiang.set(DataContainer.id, PersistentDataType.STRING, "coreyinYueQiang");
        pdcHongYinQiang.set(DataContainer.id, PersistentDataType.STRING, "corehongYinQiang");
        pdcYouLongQiang.set(DataContainer.id, PersistentDataType.STRING, "coreyouLongQiang");
        pdcHuTouZhanJinQiang.set(DataContainer.id, PersistentDataType.STRING, "corehuTouZhanJinQiang");
        pdcRuYiJinGuBang.set(DataContainer.id, PersistentDataType.STRING, "coreruYiJinGuBang");

        pdcQinTongGong.set(DataContainer.id, PersistentDataType.STRING, "coreqinTongGong");
        pdcYanTieGong.set(DataContainer.id, PersistentDataType.STRING, "coreyanTieGong");
        pdcZhongChuiGong.set(DataContainer.id, PersistentDataType.STRING, "corezhongChuiGong");
        pdcBeiDouMieShenGong.set(DataContainer.id, PersistentDataType.STRING, "corebeiDouMieShenGong");
        pdcZhuRi.set(DataContainer.id, PersistentDataType.STRING, "corezhuRi");

        pdcHeiTieNu.set(DataContainer.id, PersistentDataType.STRING, "coreheiTieNu");
        pdcHongLinNu.set(DataContainer.id, PersistentDataType.STRING, "corehongLinNu");
        pdcJiaoLongNu.set(DataContainer.id, PersistentDataType.STRING, "corejiaoLongNu");
        pdcRiYueLiuXingNu.set(DataContainer.id, PersistentDataType.STRING, "coreriYueLiuXingNu");
        pdcLiangYi.set(DataContainer.id, PersistentDataType.STRING, "coreliangYi");

        pdcFuRongGong.set(DataContainer.id, PersistentDataType.STRING, "corefuRongGong");
        pdcHongLuanGong.set(DataContainer.id, PersistentDataType.STRING, "corehongLuanGong");
        pdcTianQiongGong.set(DataContainer.id, PersistentDataType.STRING, "coretianQiongGong");
        pdcSheTianZhuiYueGong.set(DataContainer.id, PersistentDataType.STRING, "coresheTianZhuiYueGong");
        pdcLiuGuang.set(DataContainer.id, PersistentDataType.STRING, "coreliuGuang");

        pdcQinTongGuo.set(DataContainer.id, PersistentDataType.STRING, "coreqinTongGuo");
        pdcLianDanLu.set(DataContainer.id, PersistentDataType.STRING, "corelianDanLu");
        pdcSuoHunLu.set(DataContainer.id, PersistentDataType.STRING, "coresuoHunLu");
        pdcQiShaDing.set(DataContainer.id, PersistentDataType.STRING, "coreqiShaDing");
        pdcHunYuanShenDing.set(DataContainer.id, PersistentDataType.STRING, "corehunYuanShenDing");

        pdcTouSp2.set(DataContainer.id, PersistentDataType.STRING, "coretouSp2");
        pdcTouSp3.set(DataContainer.id, PersistentDataType.STRING, "coretouSp3");
        pdcTouSp4.set(DataContainer.id, PersistentDataType.STRING, "coretouSp4");
        pdcTouSp5.set(DataContainer.id, PersistentDataType.STRING, "coretouSp5");
        pdcTouSp6.set(DataContainer.id, PersistentDataType.STRING, "coretouSp6");
        pdcTouSp7.set(DataContainer.id, PersistentDataType.STRING, "coretouSp7");
        pdcTouSp8.set(DataContainer.id, PersistentDataType.STRING, "coretouSp8");

        pdcZhanTou2.set(DataContainer.id, PersistentDataType.STRING, "corezhanTou2");
        pdcZhanTou3.set(DataContainer.id, PersistentDataType.STRING, "corezhanTou3");
        pdcZhanTou4.set(DataContainer.id, PersistentDataType.STRING, "corezhanTou4");
        pdcZhanTou5.set(DataContainer.id, PersistentDataType.STRING, "corezhanTou5");
        pdcZhanTou6.set(DataContainer.id, PersistentDataType.STRING, "corezhanTou6");
        pdcZhanTou7.set(DataContainer.id, PersistentDataType.STRING, "corezhanTou7");
        pdcZhanTou8.set(DataContainer.id, PersistentDataType.STRING, "corezhanTou8");

        pdcGongTou2.set(DataContainer.id, PersistentDataType.STRING, "coregongTou2");
        pdcGongTou3.set(DataContainer.id, PersistentDataType.STRING, "coregongTou3");
        pdcGongTou4.set(DataContainer.id, PersistentDataType.STRING, "coregongTou4");
        pdcGongTou5.set(DataContainer.id, PersistentDataType.STRING, "coregongTou5");
        pdcGongTou6.set(DataContainer.id, PersistentDataType.STRING, "coregongTou6");
        pdcGongTou7.set(DataContainer.id, PersistentDataType.STRING, "coregongTou7");
        pdcGongTou8.set(DataContainer.id, PersistentDataType.STRING, "coregongTou8");

        pdcDanTou2.set(DataContainer.id, PersistentDataType.STRING, "coredanTou2");
        pdcDanTou3.set(DataContainer.id, PersistentDataType.STRING, "coredanTou3");
        pdcDanTou4.set(DataContainer.id, PersistentDataType.STRING, "coredanTou4");
        pdcDanTou5.set(DataContainer.id, PersistentDataType.STRING, "coredanTou5");
        pdcDanTou6.set(DataContainer.id, PersistentDataType.STRING, "coredanTou6");
        pdcDanTou7.set(DataContainer.id, PersistentDataType.STRING, "coredanTou7");
        pdcDanTou8.set(DataContainer.id, PersistentDataType.STRING, "coredanTou8");

        pdcXiongSp2.set(DataContainer.id, PersistentDataType.STRING, "corexiongSp2");
        pdcXiongSp3.set(DataContainer.id, PersistentDataType.STRING, "corexiongSp3");
        pdcXiongSp4.set(DataContainer.id, PersistentDataType.STRING, "corexiongSp4");
        pdcXiongSp5.set(DataContainer.id, PersistentDataType.STRING, "corexiongSp5");
        pdcXiongSp6.set(DataContainer.id, PersistentDataType.STRING, "corexiongSp6");
        pdcXiongSp7.set(DataContainer.id, PersistentDataType.STRING, "corexiongSp7");
        pdcXiongSp8.set(DataContainer.id, PersistentDataType.STRING, "corexiongSp8");

        pdcZhanXiong2.set(DataContainer.id, PersistentDataType.STRING, "corezhanXiong2");
        pdcZhanXiong3.set(DataContainer.id, PersistentDataType.STRING, "corezhanXiong3");
        pdcZhanXiong4.set(DataContainer.id, PersistentDataType.STRING, "corezhanXiong4");
        pdcZhanXiong5.set(DataContainer.id, PersistentDataType.STRING, "corezhanXiong5");
        pdcZhanXiong6.set(DataContainer.id, PersistentDataType.STRING, "corezhanXiong6");
        pdcZhanXiong7.set(DataContainer.id, PersistentDataType.STRING, "corezhanXiong7");
        pdcZhanXiong8.set(DataContainer.id, PersistentDataType.STRING, "corezhanXiong8");

        pdcGongXiong2.set(DataContainer.id, PersistentDataType.STRING, "coregongXiong2");
        pdcGongXiong3.set(DataContainer.id, PersistentDataType.STRING, "coregongXiong3");
        pdcGongXiong4.set(DataContainer.id, PersistentDataType.STRING, "coregongXiong4");
        pdcGongXiong5.set(DataContainer.id, PersistentDataType.STRING, "coregongXiong5");
        pdcGongXiong6.set(DataContainer.id, PersistentDataType.STRING, "coregongXiong6");
        pdcGongXiong7.set(DataContainer.id, PersistentDataType.STRING, "coregongXiong7");
        pdcGongXiong8.set(DataContainer.id, PersistentDataType.STRING, "coregongXiong8");

        pdcDanXiong2.set(DataContainer.id, PersistentDataType.STRING, "coredanXiong2");
        pdcDanXiong3.set(DataContainer.id, PersistentDataType.STRING, "coredanXiong3");
        pdcDanXiong4.set(DataContainer.id, PersistentDataType.STRING, "coredanXiong4");
        pdcDanXiong5.set(DataContainer.id, PersistentDataType.STRING, "coredanXiong5");
        pdcDanXiong6.set(DataContainer.id, PersistentDataType.STRING, "coredanXiong6");
        pdcDanXiong7.set(DataContainer.id, PersistentDataType.STRING, "coredanXiong7");
        pdcDanXiong8.set(DataContainer.id, PersistentDataType.STRING, "coredanXiong8");

        pdcTuiSp2.set(DataContainer.id, PersistentDataType.STRING, "coretuiSp2");
        pdcTuiSp3.set(DataContainer.id, PersistentDataType.STRING, "coretuiSp3");
        pdcTuiSp4.set(DataContainer.id, PersistentDataType.STRING, "coretuiSp4");
        pdcTuiSp5.set(DataContainer.id, PersistentDataType.STRING, "coretuiSp5");
        pdcTuiSp6.set(DataContainer.id, PersistentDataType.STRING, "coretuiSp6");
        pdcTuiSp7.set(DataContainer.id, PersistentDataType.STRING, "coretuiSp7");
        pdcTuiSp8.set(DataContainer.id, PersistentDataType.STRING, "coretuiSp8");

        pdcZhanTui2.set(DataContainer.id, PersistentDataType.STRING, "corezhanTui2");
        pdcZhanTui3.set(DataContainer.id, PersistentDataType.STRING, "corezhanTui3");
        pdcZhanTui4.set(DataContainer.id, PersistentDataType.STRING, "corezhanTui4");
        pdcZhanTui5.set(DataContainer.id, PersistentDataType.STRING, "corezhanTui5");
        pdcZhanTui6.set(DataContainer.id, PersistentDataType.STRING, "corezhanTui6");
        pdcZhanTui7.set(DataContainer.id, PersistentDataType.STRING, "corezhanTui7");
        pdcZhanTui8.set(DataContainer.id, PersistentDataType.STRING, "corezhanTui8");

        pdcGongTui2.set(DataContainer.id, PersistentDataType.STRING, "coregongTui2");
        pdcGongTui3.set(DataContainer.id, PersistentDataType.STRING, "coregongTui3");
        pdcGongTui4.set(DataContainer.id, PersistentDataType.STRING, "coregongTui4");
        pdcGongTui5.set(DataContainer.id, PersistentDataType.STRING, "coregongTui5");
        pdcGongTui6.set(DataContainer.id, PersistentDataType.STRING, "coregongTui6");
        pdcGongTui7.set(DataContainer.id, PersistentDataType.STRING, "coregongTui7");
        pdcGongTui8.set(DataContainer.id, PersistentDataType.STRING, "coregongTui8");

        pdcDanTui2.set(DataContainer.id, PersistentDataType.STRING, "coredanTui2");
        pdcDanTui3.set(DataContainer.id, PersistentDataType.STRING, "coredanTui3");
        pdcDanTui4.set(DataContainer.id, PersistentDataType.STRING, "coredanTui4");
        pdcDanTui5.set(DataContainer.id, PersistentDataType.STRING, "coredanTui5");
        pdcDanTui6.set(DataContainer.id, PersistentDataType.STRING, "coredanTui6");
        pdcDanTui7.set(DataContainer.id, PersistentDataType.STRING, "coredanTui7");
        pdcDanTui8.set(DataContainer.id, PersistentDataType.STRING, "coredanTui8");

        pdcXieSp2.set(DataContainer.id, PersistentDataType.STRING, "corexieSp2");
        pdcXieSp3.set(DataContainer.id, PersistentDataType.STRING, "corexieSp3");
        pdcXieSp4.set(DataContainer.id, PersistentDataType.STRING, "corexieSp4");
        pdcXieSp5.set(DataContainer.id, PersistentDataType.STRING, "corexieSp5");
        pdcXieSp6.set(DataContainer.id, PersistentDataType.STRING, "corexieSp6");
        pdcXieSp7.set(DataContainer.id, PersistentDataType.STRING, "corexieSp7");
        pdcXieSp8.set(DataContainer.id, PersistentDataType.STRING, "corexieSp8");

        pdcZhanXie2.set(DataContainer.id, PersistentDataType.STRING, "corezhanXie2");
        pdcZhanXie3.set(DataContainer.id, PersistentDataType.STRING, "corezhanXie3");
        pdcZhanXie4.set(DataContainer.id, PersistentDataType.STRING, "corezhanXie4");
        pdcZhanXie5.set(DataContainer.id, PersistentDataType.STRING, "corezhanXie5");
        pdcZhanXie6.set(DataContainer.id, PersistentDataType.STRING, "corezhanXie6");
        pdcZhanXie7.set(DataContainer.id, PersistentDataType.STRING, "corezhanXie7");
        pdcZhanXie8.set(DataContainer.id, PersistentDataType.STRING, "corezhanXie8");

        pdcGongXie2.set(DataContainer.id, PersistentDataType.STRING, "coregongXie2");
        pdcGongXie3.set(DataContainer.id, PersistentDataType.STRING, "coregongXie3");
        pdcGongXie4.set(DataContainer.id, PersistentDataType.STRING, "coregongXie4");
        pdcGongXie5.set(DataContainer.id, PersistentDataType.STRING, "coregongXie5");
        pdcGongXie6.set(DataContainer.id, PersistentDataType.STRING, "coregongXie6");
        pdcGongXie7.set(DataContainer.id, PersistentDataType.STRING, "coregongXie7");
        pdcGongXie8.set(DataContainer.id, PersistentDataType.STRING, "coregongXie8");

        pdcDanXie2.set(DataContainer.id, PersistentDataType.STRING, "coredanXie2");
        pdcDanXie3.set(DataContainer.id, PersistentDataType.STRING, "coredanXie3");
        pdcDanXie4.set(DataContainer.id, PersistentDataType.STRING, "coredanXie4");
        pdcDanXie5.set(DataContainer.id, PersistentDataType.STRING, "coredanXie5");
        pdcDanXie6.set(DataContainer.id, PersistentDataType.STRING, "coredanXie6");
        pdcDanXie7.set(DataContainer.id, PersistentDataType.STRING, "coredanXie7");
        pdcDanXie8.set(DataContainer.id, PersistentDataType.STRING, "coredanXie8");

        pdcJinRuiFeiRen.set(DataContainer.id, PersistentDataType.STRING, "corejinRuiFeiRen");
        pdcWuShengXiuJian.set(DataContainer.id, PersistentDataType.STRING, "corewuShengXiuJian");
        pdcHuiXuanTaiJi.set(DataContainer.id, PersistentDataType.STRING, "corehuiXuanTaiJi");
        pdcWuYinWuZong.set(DataContainer.id, PersistentDataType.STRING, "corewuYinWuZong");
        pdcYanWangTie.set(DataContainer.id, PersistentDataType.STRING, "coreyanWangTie");

        pdcHuangTongChong.set(DataContainer.id, PersistentDataType.STRING, "corehuangTongChong");
        pdcMingYue.set(DataContainer.id, PersistentDataType.STRING, "coremingYue");
        pdcCanLan.set(DataContainer.id, PersistentDataType.STRING, "corecanLan");
        pdcJinJing.set(DataContainer.id, PersistentDataType.STRING, "corejinJing");
        pdcXiaoTian.set(DataContainer.id, PersistentDataType.STRING, "corexiaoTian");

        pdcQinFengYinYin.set(DataContainer.id, PersistentDataType.STRING, "coreqinFengYinYin");
        pdcLiuShuiChanChan.set(DataContainer.id, PersistentDataType.STRING, "coreliuShuiChanChan");
        pdcBuQiChunYu.set(DataContainer.id, PersistentDataType.STRING, "corebuQiChunYu");
        pdcSanShengZhenHun.set(DataContainer.id, PersistentDataType.STRING, "coresanShengZhenHun");
        pdcJiuFengLaiYi.set(DataContainer.id, PersistentDataType.STRING, "corejiuFengLaiYi");

        pdcXinBinDunPai.set(DataContainer.id, PersistentDataType.STRING, "corexinBinDunPai");
        pdcJinRuiDunPai.set(DataContainer.id, PersistentDataType.STRING, "corejinRuiDunPai");
        pdcChiSeYueHuo.set(DataContainer.id, PersistentDataType.STRING, "corechiSeYueHuo");
        pdcJinGangBuHuai.set(DataContainer.id, PersistentDataType.STRING, "corejinGangBuHuai");
        pdcChenBinLuoXue.set(DataContainer.id, PersistentDataType.STRING, "corechenBinLuoXue");

        pdcXinBinJianDai.set(DataContainer.id, PersistentDataType.STRING, "corexinBinJianDai");
        pdcJinRuiJianDai.set(DataContainer.id, PersistentDataType.STRING, "corejinRuiJianDai");
        pdcYingYanJianDai.set(DataContainer.id, PersistentDataType.STRING, "coreyingYanJianDai");
        pdcCangGuNingWang.set(DataContainer.id, PersistentDataType.STRING, "corecangGuNingWang");
        pdcNiePanYunAng.set(DataContainer.id, PersistentDataType.STRING, "coreniePanYunAng");

        pdcTieZhiDuanBi.set(DataContainer.id, PersistentDataType.STRING, "coretieZhiDuanBi");
        pdcHuiYiDao.set(DataContainer.id, PersistentDataType.STRING, "corehuiYiDao");
        pdcLongYaDao.set(DataContainer.id, PersistentDataType.STRING, "corelongYaDao");
        pdcZhangQiCuiZhu.set(DataContainer.id, PersistentDataType.STRING, "corezhangQiCuiZhu");
        pdcMingHong.set(DataContainer.id, PersistentDataType.STRING, "coremingHong");

        pdcQingLongShengQi2.set(DataContainer.id, PersistentDataType.STRING, "coreqingLongShengQi2");
        pdcQingLongShengQi3.set(DataContainer.id, PersistentDataType.STRING, "coreqingLongShengQi3");
        pdcQingLongShengQi4.set(DataContainer.id, PersistentDataType.STRING, "coreqingLongShengQi4");
        pdcQingLongShengQi5.set(DataContainer.id, PersistentDataType.STRING, "coreqingLongShengQi5");
        pdcQingLongShengQi6.set(DataContainer.id, PersistentDataType.STRING, "coreqingLongShengQi6");

        pdcBaiHuShengQi2.set(DataContainer.id, PersistentDataType.STRING, "corebaiHuShengQi2");
        pdcBaiHuShengQi3.set(DataContainer.id, PersistentDataType.STRING, "corebaiHuShengQi3");
        pdcBaiHuShengQi4.set(DataContainer.id, PersistentDataType.STRING, "corebaiHuShengQi4");
        pdcBaiHuShengQi5.set(DataContainer.id, PersistentDataType.STRING, "corebaiHuShengQi5");
        pdcBaiHuShengQi6.set(DataContainer.id, PersistentDataType.STRING, "corebaiHuShengQi6");

        pdcZhuQueShengQi2.set(DataContainer.id, PersistentDataType.STRING, "corezhuQueShengQi2");
        pdcZhuQueShengQi3.set(DataContainer.id, PersistentDataType.STRING, "corezhuQueShengQi3");
        pdcZhuQueShengQi4.set(DataContainer.id, PersistentDataType.STRING, "corezhuQueShengQi4");
        pdcZhuQueShengQi5.set(DataContainer.id, PersistentDataType.STRING, "corezhuQueShengQi5");
        pdcZhuQueShengQi6.set(DataContainer.id, PersistentDataType.STRING, "corezhuQueShengQi6");

        pdcXuanWuShengQi2.set(DataContainer.id, PersistentDataType.STRING, "corexuanWuShengQi2");
        pdcXuanWuShengQi3.set(DataContainer.id, PersistentDataType.STRING, "corexuanWuShengQi3");
        pdcXuanWuShengQi4.set(DataContainer.id, PersistentDataType.STRING, "corexuanWuShengQi4");
        pdcXuanWuShengQi5.set(DataContainer.id, PersistentDataType.STRING, "corexuanWuShengQi5");
        pdcXuanWuShengQi6.set(DataContainer.id, PersistentDataType.STRING, "corexuanWuShengQi6");

        pdcTanYuZhiJie.set(DataContainer.id, PersistentDataType.STRING, "coretanYuZhiJie");
        pdcTanLanDuJie.set(DataContainer.id, PersistentDataType.STRING, "coretanLanDuJie");
        pdcTanLanXieJie.set(DataContainer.id, PersistentDataType.STRING, "coretanLanXieJie");
        pdcTanLanGuiJie.set(DataContainer.id, PersistentDataType.STRING, "coretanLanGuiJie");
        pdcTanLanMoJie.set(DataContainer.id, PersistentDataType.STRING, "coretanLanMoJie");
        pdcTanLanMingJie.set(DataContainer.id, PersistentDataType.STRING, "coretanLanMingJie");

        pdcChiMiZhiJie.set(DataContainer.id, PersistentDataType.STRING, "corechiMiZhiJie");
        pdcChiYuDuJie.set(DataContainer.id, PersistentDataType.STRING, "corechiYuDuJie");
        pdcChiYuXieJie.set(DataContainer.id, PersistentDataType.STRING, "corechiYuXieJie");
        pdcChiYuGuiJie.set(DataContainer.id, PersistentDataType.STRING, "corechiYuGuiJie");
        pdcChiYuMoJie.set(DataContainer.id, PersistentDataType.STRING, "corechiYuMoJie");
        pdcChiYuMingJie.set(DataContainer.id, PersistentDataType.STRING, "corechiYuMingJie");

        pdcChenNuZhiJie.set(DataContainer.id, PersistentDataType.STRING, "corechenNuZhiJie");
        pdcChenHenDuJie.set(DataContainer.id, PersistentDataType.STRING, "corechenHenDuJie");
        pdcChenHenXieJie.set(DataContainer.id, PersistentDataType.STRING, "corechenHenXieJie");
        pdcChenHenGuiJie.set(DataContainer.id, PersistentDataType.STRING, "corechenHenGuiJie");
        pdcChenHenMoJie.set(DataContainer.id, PersistentDataType.STRING, "corechenHenMoJie");
        pdcChenHenMingJie.set(DataContainer.id, PersistentDataType.STRING, "corechenHenMingJie");

        pdcChanDingFaJie.set(DataContainer.id, PersistentDataType.STRING, "corechanDingFaJie");
        pdcChanDingShengJie.set(DataContainer.id, PersistentDataType.STRING, "corechanDingShengJie");
        pdcChanDingFoJie.set(DataContainer.id, PersistentDataType.STRING, "corechanDingFoJie");
        pdcChanDingXianJie.set(DataContainer.id, PersistentDataType.STRING, "corechanDingXianJie");
        pdcChanDingShenJie.set(DataContainer.id, PersistentDataType.STRING, "corechanDingShenJie");

        pdcZhiHuiFaJie.set(DataContainer.id, PersistentDataType.STRING, "corezhiHuiFaJie");
        pdcZhiHuiShengJie.set(DataContainer.id, PersistentDataType.STRING, "corezhiHuiShengJie");
        pdcZhiHuiFoJie.set(DataContainer.id, PersistentDataType.STRING, "corezhiHuiFoJie");
        pdcZhiHuiXianJie.set(DataContainer.id, PersistentDataType.STRING, "corezhiHuiXianJie");
        pdcZhiHuiShenJie.set(DataContainer.id, PersistentDataType.STRING, "corezhiHuiShenJie");

        pdcChiJieFaJie.set(DataContainer.id, PersistentDataType.STRING, "corechiJieFaJie");
        pdcChiJieShengJie.set(DataContainer.id, PersistentDataType.STRING, "corechiJieShengJie");
        pdcChiJieFoJie.set(DataContainer.id, PersistentDataType.STRING, "corechiJieFoJie");
        pdcChiJieXianJie.set(DataContainer.id, PersistentDataType.STRING, "corechiJieXianJie");
        pdcChiJieShenJie.set(DataContainer.id, PersistentDataType.STRING, "corechiJieShenJie");

        pdcZhaoYaoJin.set(DataContainer.id, PersistentDataType.STRING, "corezhaoYaoJin");
        pdcYuFuChen.set(DataContainer.id, PersistentDataType.STRING, "coreyuFuChen");
        pdcWuSeBuTianShi.set(DataContainer.id, PersistentDataType.STRING, "corewuSeBuTianShi");

        pdcYaoWangHuLu.set(DataContainer.id, PersistentDataType.STRING, "coreyaoWangHuLu");
        pdcCiXinMiaoLian.set(DataContainer.id, PersistentDataType.STRING, "coreciXinMiaoLian");
        pdcSHENXINYUGU.set(DataContainer.id, PersistentDataType.STRING, "coreshenXinYuGu");
        pdcYINYANGZHANLONGJIAN.set(DataContainer.id, PersistentDataType.STRING, "coreyinYangZhanLongJian");
        pdcYUNLANGBAN.set(DataContainer.id, PersistentDataType.STRING, "coreyunLangBan");
        pdcZHENHUNYUXIAO.set(DataContainer.id, PersistentDataType.STRING, "corezhenHunYuXiao");
        pdcDIKUIHUALAN.set(DataContainer.id, PersistentDataType.STRING, "corediKuiHuaLan");
        pdcXuanFengZongShan.set(DataContainer.id, PersistentDataType.STRING, "corexuanFengZongShan");
        pdcTaijiBagua.set(DataContainer.id, PersistentDataType.STRING, "coretaiJiBaGua");

        pdcJUEDOULING.set(DataContainer.id, PersistentDataType.STRING, "corejueDouLing");
        pdcLeimingu.set(DataContainer.id, PersistentDataType.STRING, "coreleiMingU");
        pdcHuanSiLin.set(DataContainer.id, PersistentDataType.STRING, "corehuanSiLin");
        pdcNiuMoNuHou.set(DataContainer.id, PersistentDataType.STRING, "coreniuMoNuHou");

        pdcDouQiShi.set(DataContainer.id, PersistentDataType.STRING, "coredouQiShi");
        pdcPanGuanBi.set(DataContainer.id, PersistentDataType.STRING, "corepanGuanBi");
        pdcMinShengJian.set(DataContainer.id, PersistentDataType.STRING, "coreminShengJian");
        pdcZhenLeiTianChui.set(DataContainer.id, PersistentDataType.STRING, "corezhenLeiTianChui");

        pdcDiaoHunGan.set(DataContainer.id, PersistentDataType.STRING, "corediaoHunGan");
        pdcSheLinZhu.set(DataContainer.id, PersistentDataType.STRING, "coresheLinZhu");
        pdcYuJinPin.set(DataContainer.id, PersistentDataType.STRING, "coreyuJinPin");
        pdcTianJiShenJin.set(DataContainer.id, PersistentDataType.STRING, "coretianJiShenJin");

        pdcRuiYingYan.set(DataContainer.id, PersistentDataType.STRING, "coreruiYingYan");
        pdcDuoHunTang.set(DataContainer.id, PersistentDataType.STRING, "coreduoHunTang");
        pdcMoYuanFoZhu.set(DataContainer.id, PersistentDataType.STRING, "coremoYuanFoZhu");
        pdcFuXinRuYi.set(DataContainer.id, PersistentDataType.STRING, "corefuXinRuYi");

        pdcLvYeXianZong.set(DataContainer.id, PersistentDataType.STRING, "corelvYeXianZong");
        pdcQingNvHanShuang.set(DataContainer.id, PersistentDataType.STRING, "coreqingNvHanShuang");
        pdcZhuRongKuYan.set(DataContainer.id, PersistentDataType.STRING, "corezhuRongKuYan");
        pdcZhuDianXuanJing.set(DataContainer.id, PersistentDataType.STRING, "corezhuDianXuanJing");

        pdcBuHunWang.set(DataContainer.id, PersistentDataType.STRING, "corebuHunWang");
        pdcYangShouJian.set(DataContainer.id, PersistentDataType.STRING, "coreyangShouJian");
        pdcWuMingMoYinLuo.set(DataContainer.id, PersistentDataType.STRING, "corewuMingMoYinLuo");
        pdcSheTianHuaXueLing.set(DataContainer.id, PersistentDataType.STRING, "coresheTianHuaXueLing");

        pdcLvYeXianZong.set(DataContainer.id, PersistentDataType.STRING, "corelvYeXianZong");
        pdcQingNvHanShuang.set(DataContainer.id, PersistentDataType.STRING, "coreqingNvHanShuang");
        pdcZhuRongKuYan.set(DataContainer.id, PersistentDataType.STRING, "corezhuRongKuYan");
        pdcZhuDianXuanJing.set(DataContainer.id, PersistentDataType.STRING, "corezhuDianXuanJing");

        pdcBuHunWang.set(DataContainer.id, PersistentDataType.STRING, "corebuHunWang");
        pdcYangShouJian.set(DataContainer.id, PersistentDataType.STRING, "coreyangShouJian");
        pdcWuMingMoYinLuo.set(DataContainer.id, PersistentDataType.STRING, "corewuMingMoYinLuo");
        pdcSheTianHuaXueLing.set(DataContainer.id, PersistentDataType.STRING, "coresheTianHuaXueLing");

        pdcKuYeLing.set(DataContainer.id, PersistentDataType.STRING, "corekuYeLing");
        pdcLuoBeiJinPin.set(DataContainer.id, PersistentDataType.STRING, "coreluoBeiJinPin");
        pdcPinYuShuiYu.set(DataContainer.id, PersistentDataType.STRING, "corepinYuShuiYu");
        pdcDiKongYuMoQuan.set(DataContainer.id, PersistentDataType.STRING, "corediKongYuMoQuan");

        pdcLuanShenGu.set(DataContainer.id, PersistentDataType.STRING, "coreluanShenGu");
        pdcJinGuLian.set(DataContainer.id, PersistentDataType.STRING, "corejinGuLian");
        pdcJianChanGuLin.set(DataContainer.id, PersistentDataType.STRING, "corejianChanGuLin");
        pdcMoDuoHunFan.set(DataContainer.id, PersistentDataType.STRING, "coremoDuoHunFan");

        core2Meta.displayName(Component.text("二阶装备原核").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        core3Meta.displayName(Component.text("三阶装备原核").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        core4Meta.displayName(Component.text("四阶装备原核").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        core5Meta.displayName(Component.text("五阶装备原核").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        core6Meta.displayName(Component.text("六阶装备原核").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        core7Meta.displayName(Component.text("七阶装备原核").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        core8Meta.displayName(Component.text("八阶装备原核").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));

        kaiShanDaoMeta.displayName(Component.text("开山刀[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        chiTongJianMeta.displayName(Component.text("赤铜剑[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        poKongFuMeta.displayName(Component.text("破空斧[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        sanBaoYuRuYiMeta.displayName(Component.text("三宝玉如意[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        xuanYuanMeta.displayName(Component.text("轩辕[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        qinTongJianMeta.displayName(Component.text("青铜剑[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        juTongZhanChuiMeta.displayName(Component.text("金瓜锤[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        taiJiJianMeta.displayName(Component.text("太极剑[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        kunLunFeiXianJianMeta.displayName(Component.text("昆仑飞仙剑[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        taiEMeta.displayName(Component.text("太阿[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        yinYueQiangMeta.displayName(Component.text("银月枪[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        hongYinQiangMeta.displayName(Component.text("红缨枪[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        youLongQiangMeta.displayName(Component.text("游龙枪[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        huTouZhanJinQiangMeta.displayName(Component.text("虎头湛金枪[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        ruYiJinGuBangMeta.displayName(Component.text("如意金箍棒[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        qinTongGongMeta.displayName(Component.text("青铜弓[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        yanTieGongMeta.displayName(Component.text("焰铁弓[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        zhongChuiGongMeta.displayName(Component.text("重锤弓[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        beiDouMieShenGongMeta.displayName(Component.text("北斗灭神弓[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        zhuRiMeta.displayName(Component.text("逐日[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        heiTieNuMeta.displayName(Component.text("黑铁弩[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        hongLinNuMeta.displayName(Component.text("红翎弩[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        jiaoLongNuMeta.displayName(Component.text("蛟龙弩[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        riYueLiuXingNuMeta.displayName(Component.text("日月流星弩[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        liangYiMeta.displayName(Component.text("两仪[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        fuRongGongMeta.displayName(Component.text("芙蓉弓[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        hongLuanGongMeta.displayName(Component.text("红鸾弓[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        tianQiongGongMeta.displayName(Component.text("天琼弓[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        sheTianZhuiYueGongMeta.displayName(Component.text("奢天追月弓[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        liuGuangMeta.displayName(Component.text("流光[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        qinTongGuoMeta.displayName(Component.text("青铜锅[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        lianDanLuMeta.displayName(Component.text("炼丹炉[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        suoHunLuMeta.displayName(Component.text("锁魂炉[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        qiShaDingMeta.displayName(Component.text("七煞鼎[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        hunYuanShenDingMeta.displayName(Component.text("混元神鼎[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        touSp2Meta.displayName(Component.text("芙蓉冠[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        touSp3Meta.displayName(Component.text("古松冠[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        touSp4Meta.displayName(Component.text("凭依冠[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        touSp5Meta.displayName(Component.text("三绫冠[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        touSp6Meta.displayName(Component.text("残昼[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        touSp7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        touSp8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        zhanTou2Meta.displayName(Component.text("战狼头罩[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        zhanTou3Meta.displayName(Component.text("饕餮头饰[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        zhanTou4Meta.displayName(Component.text("甲骨头饰[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        zhanTou5Meta.displayName(Component.text("龙须回[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        zhanTou6Meta.displayName(Component.text("帝冠遗响[战][锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        zhanTou7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        zhanTou8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        gongTou2Meta.displayName(Component.text("风行护额[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        gongTou3Meta.displayName(Component.text("虎皮头饰[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        gongTou4Meta.displayName(Component.text("蛇信[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        gongTou5Meta.displayName(Component.text("赤鹰眼[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        gongTou6Meta.displayName(Component.text("帝冠遗响[弓][锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        gongTou7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        gongTou8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        danTou2Meta.displayName(Component.text("丹顶鹤羽[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        danTou3Meta.displayName(Component.text("华佗顶[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        danTou4Meta.displayName(Component.text("芍冠[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        danTou5Meta.displayName(Component.text("七星冠[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        danTou6Meta.displayName(Component.text("帝冠遗响[丹][锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        danTou7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        danTou8Meta.displayName(Component.text("X").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));

        xiongSp2Meta.displayName(Component.text("绿菊甲[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        xiongSp3Meta.displayName(Component.text("翠竹甲[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        xiongSp4Meta.displayName(Component.text("洛水甲[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        xiongSp5Meta.displayName(Component.text("乐游甲[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        xiongSp6Meta.displayName(Component.text("如狱[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        xiongSp7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        xiongSp8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        zhanXiong2Meta.displayName(Component.text("战狼硬甲[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        zhanXiong3Meta.displayName(Component.text("饕餮战甲[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        zhanXiong4Meta.displayName(Component.text("玄灵武甲[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        zhanXiong5Meta.displayName(Component.text("龙鳞软甲[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        zhanXiong6Meta.displayName(Component.text("鬼火焚铠[战][锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        zhanXiong7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        zhanXiong8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        gongXiong2Meta.displayName(Component.text("听风皮甲[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        gongXiong3Meta.displayName(Component.text("虎牙胸甲[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        gongXiong4Meta.displayName(Component.text("蛇皮锁甲[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        gongXiong5Meta.displayName(Component.text("赤鹰翼[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        gongXiong6Meta.displayName(Component.text("鬼火焚凯[弓][锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        gongXiong7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        gongXiong8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        danXiong2Meta.displayName(Component.text("丹魂皮甲[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        danXiong3Meta.displayName(Component.text("炼丹袍[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        danXiong4Meta.displayName(Component.text("华佗裳[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        danXiong5Meta.displayName(Component.text("地黄袍[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        danXiong6Meta.displayName(Component.text("太上神袍[丹][锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        danXiong7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        danXiong8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));

        tuiSp2Meta.displayName(Component.text("百合裤[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        tuiSp3Meta.displayName(Component.text("新柳裤[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        tuiSp4Meta.displayName(Component.text("宿月裤[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        tuiSp5Meta.displayName(Component.text("司正裤[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        tuiSp6Meta.displayName(Component.text("厄夜[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        tuiSp7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        tuiSp8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        zhanTui2Meta.displayName(Component.text("战狼皮裤[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        zhanTui3Meta.displayName(Component.text("饕餮护胯[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        zhanTui4Meta.displayName(Component.text("龟宁护胯[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        zhanTui5Meta.displayName(Component.text("龙筋护腰[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        zhanTui6Meta.displayName(Component.text("九黎羽护[战][锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        zhanTui7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        zhanTui8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        gongTui2Meta.displayName(Component.text("风鳞裤[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        gongTui3Meta.displayName(Component.text("虎纹护胯[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        gongTui4Meta.displayName(Component.text("蛇鳞护胯[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        gongTui5Meta.displayName(Component.text("赤鹰羽[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        gongTui6Meta.displayName(Component.text("九黎羽护[弓][锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        gongTui7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        gongTui8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        danTui2Meta.displayName(Component.text("功夫裤[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        danTui3Meta.displayName(Component.text("华佗叶[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        danTui4Meta.displayName(Component.text("川贝折[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        danTui5Meta.displayName(Component.text("君尘拂[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        danTui6Meta.displayName(Component.text("九黎羽护[丹][锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        danTui7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        danTui8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));

        xieSp2Meta.displayName(Component.text("牡丹鞋[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        xieSp3Meta.displayName(Component.text("幽兰鞋[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        xieSp4Meta.displayName(Component.text("观天羽[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        xieSp5Meta.displayName(Component.text("听音羽[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        xieSp6Meta.displayName(Component.text("犹绝[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        xieSp7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        xieSp8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        zhanXie2Meta.displayName(Component.text("战狼长筒靴[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        zhanXie3Meta.displayName(Component.text("凶兽蹄[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        zhanXie4Meta.displayName(Component.text("灵龟出水[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        zhanXie5Meta.displayName(Component.text("龙爪履[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        zhanXie6Meta.displayName(Component.text("沉潜殇履[战][锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        zhanXie7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        zhanXie8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        gongXie2Meta.displayName(Component.text("风羽草鞋[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        gongXie3Meta.displayName(Component.text("虎皮靴[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        gongXie4Meta.displayName(Component.text("蛇行足[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        gongXie5Meta.displayName(Component.text("赤鹰爪[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        gongXie6Meta.displayName(Component.text("沉潜殇履[弓][锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        gongXie7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        gongXie8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        danXie2Meta.displayName(Component.text("功夫鞋[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        danXie3Meta.displayName(Component.text("华佗石[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        danXie4Meta.displayName(Component.text("紫苏叶履[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        danXie5Meta.displayName(Component.text("文武曲[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        danXie6Meta.displayName(Component.text("沉潜殇履[丹][锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        danXie7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        danXie8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));

        JINRUIFEIRENMeta.displayName(Component.text("精锐飞刃[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        WUSHENGXIUJIANMeta.displayName(Component.text("无声袖箭[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        HUIXUANTAJIMeta.displayName(Component.text("回旋踏迹[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        WUYINWUZONGMeta.displayName(Component.text("无影无踪[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        YANWANGTIEMeta.displayName(Component.text("阎王帖[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        HUANGTONGCHONGMeta.displayName(Component.text("黄铜铳[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        MINGYUEMeta.displayName(Component.text("明月[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        CANLANMeta.displayName(Component.text("灿烂[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        JINJINGMeta.displayName(Component.text("净镜[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        XIAOTIANMeta.displayName(Component.text("啸天[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        QINFENGYINYINMeta.displayName(Component.text("轻风吟吟[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        LIUSHUICHANCHANMeta.displayName(Component.text("流水潺潺[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        BUQICHUNYUMeta.displayName(Component.text("不期春雨[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        SANSHENGZHENHUNMeta.displayName(Component.text("三生镇魂[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        JIUFENGLAIYIMeta.displayName(Component.text("九凤来仪[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        XINBINDUNPAIMeta.displayName(Component.text("新兵盾牌[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        JINRUIDUNPAIMeta.displayName(Component.text("精锐盾牌[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        CHISEYUEHUOMeta.displayName(Component.text("赤色跃火[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        JINGANGBUHUAIMeta.displayName(Component.text("金刚不坏[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        CHENBINLUOXUEMeta.displayName(Component.text("沉冰落雪[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        XINBINJIANDAIMeta.displayName(Component.text("新兵箭袋[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        JINRUIJIANDAIMeta.displayName(Component.text("精锐箭袋[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        YINGYANJIANDAIMeta.displayName(Component.text("鹰眼之视[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        CANGGUNINGWANGMeta.displayName(Component.text("仓古凝望[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        NIEPANYUNANGMeta.displayName(Component.text("涅槃羽囊[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        TIEZHIDUANBIMeta.displayName(Component.text("铁制短匕[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        HUIYIDAOMeta.displayName(Component.text("回翼刀[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        LONGYADAOMeta.displayName(Component.text("龙牙刀[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        ZHANGQICUIZHUMeta.displayName(Component.text("瘴气翠竹[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        MINGHONGMeta.displayName(Component.text("鸣鸿[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        QING_LONG_SHENG_QI2Meta.displayName(Component.text("二阶青龙兽魂[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        QING_LONG_SHENG_QI3Meta.displayName(Component.text("三阶青龙兽魂[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        QING_LONG_SHENG_QI4Meta.displayName(Component.text("四阶青龙兽魂[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        QING_LONG_SHENG_QI5Meta.displayName(Component.text("五阶青龙兽魂[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        QING_LONG_SHENG_QI6Meta.displayName(Component.text("六阶青龙兽魂[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        BAI_HU_SHENG_QI2Meta.displayName(Component.text("二阶白虎兽魂[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        BAI_HU_SHENG_QI3Meta.displayName(Component.text("三阶白虎兽魂[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        BAI_HU_SHENG_QI4Meta.displayName(Component.text("四阶白虎兽魂[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        BAI_HU_SHENG_QI5Meta.displayName(Component.text("五阶白虎兽魂[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        BAI_HU_SHENG_QI6Meta.displayName(Component.text("六阶白虎兽魂[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        ZHU_QUE_SHENG_QI2Meta.displayName(Component.text("二阶朱雀兽魂[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        ZHU_QUE_SHENG_QI3Meta.displayName(Component.text("三阶朱雀兽魂[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        ZHU_QUE_SHENG_QI4Meta.displayName(Component.text("四阶朱雀兽魂[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        ZHU_QUE_SHENG_QI5Meta.displayName(Component.text("五阶朱雀兽魂[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        ZHU_QUE_SHENG_QI6Meta.displayName(Component.text("六阶朱雀兽魂[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        XUAN_WU_SHENG_QI2Meta.displayName(Component.text("二阶玄武兽魂[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        XUAN_WU_SHENG_QI3Meta.displayName(Component.text("三阶玄武兽魂[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        XUAN_WU_SHENG_QI4Meta.displayName(Component.text("四阶玄武兽魂[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        XUAN_WU_SHENG_QI5Meta.displayName(Component.text("五阶玄武兽魂[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        XUAN_WU_SHENG_QI6Meta.displayName(Component.text("六阶玄武兽魂[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        TAN_YU_ZHI_JIEMeta.displayName(Component.text("贪欲之戒[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        TAN_LAN_DU_JIEMeta.displayName(Component.text("贪婪毒戒[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        TAN_LAN_XIE_JIEMeta.displayName(Component.text("贪婪邪戒[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        TAN_LAN_GUI_JIEMeta.displayName(Component.text("贪婪鬼戒[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        TAN_LAN_MO_JIEMeta.displayName(Component.text("贪婪魔戒[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        TAN_LAN_MING_JIEMeta.displayName(Component.text("贪婪冥戒[锻核]").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));

        CHI_MI_ZHI_JIEMeta.displayName(Component.text("痴迷之戒[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        CHI_YU_DU_JIEMeta.displayName(Component.text("痴愚毒戒[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        CHI_YU_XIE_JIEMeta.displayName(Component.text("痴愚邪戒[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        CHI_YU_GUI_JIEMeta.displayName(Component.text("痴愚鬼戒[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        CHI_YU_MO_JIEMeta.displayName(Component.text("痴愚魔戒[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        CHI_YU_MING_JIEMeta.displayName(Component.text("痴愚冥戒[锻核]").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));

        CHEN_NU_ZHI_JIEMeta.displayName(Component.text("嗔怒之戒[锻核]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        CHEN_HEN_DU_JIEMeta.displayName(Component.text("嗔恨毒戒[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        CHEN_HEN_XIE_JIEMeta.displayName(Component.text("嗔恨邪戒[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        CHEN_HEN_GUI_JIEMeta.displayName(Component.text("嗔恨鬼戒[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        CHEN_HEN_MO_JIEMeta.displayName(Component.text("嗔恨魔戒[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        CHEN_HEN_MING_JIEMeta.displayName(Component.text("嗔恨冥戒[锻核]").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));

        CHAN_DING_FA_JIEMeta.displayName(Component.text("禅定法戒[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        CHAN_DING_SHENG_JIEMeta.displayName(Component.text("禅定圣戒[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        CHAN_DING_FO_JIEMeta.displayName(Component.text("禅定佛戒[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        CHAN_DING_XIAN_JIEMeta.displayName(Component.text("禅定仙戒[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        CHAN_DING_SHEN_JIEMeta.displayName(Component.text("禅定神戒[锻核]").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));

        ZHI_HUI_FA_JIEMeta.displayName(Component.text("智慧法戒[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        ZHI_HUI_SHENG_JIEMeta.displayName(Component.text("智慧圣戒[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        ZHI_HUI_FO_JIEMeta.displayName(Component.text("智慧佛戒[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        ZHI_HUI_XIAN_JIEMeta.displayName(Component.text("智慧仙戒[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        ZHI_HUI_SHEN_JIEMeta.displayName(Component.text("智慧神戒[锻核]").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));

        CHI_JIE_FA_JIEMeta.displayName(Component.text("持戒法戒[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        CHI_JIE_SHENG_JIEMeta.displayName(Component.text("持戒圣戒[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        CHI_JIE_FO_JIEMeta.displayName(Component.text("持戒佛戒[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        CHI_JIE_XIAN_JIEMeta.displayName(Component.text("持戒仙戒[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        CHI_JIE_SHEN_JIEMeta.displayName(Component.text("持戒神戒[锻核]").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));

        ZHAOYAOJINMeta.displayName(Component.text("照妖镜[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        YUFUCHENMeta.displayName(Component.text("羽拂尘[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        WUSEBUTIANSHIMeta.displayName(Component.text("五色补天使[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));

        YAOWANGHULUMeta.displayName(Component.text("药王葫芦[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        CIXINMIAOLIANMeta.displayName(Component.text("慈心妙莲[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        SHENXINYUGUMeta.displayName(Component.text("神行渔鼓[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        YINYANGZHANLONGJIANMeta.displayName(Component.text("阴阳斩龙剑[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        YUNLANGBANMeta.displayName(Component.text("云阳板[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        ZHENHUNYUXIAOMeta.displayName(Component.text("镇魂玉箫[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        DIKUIHUALANMeta.displayName(Component.text("地魁花篮[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        XUANFENGZONGSHANMeta.displayName(Component.text("玄风棕扇[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        TAIJIBAGUAMeta.displayName(Component.text("太极八卦[锻核]").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));

        JUEDOULINGMeta.displayName(Component.text("决斗令[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        LEIMINGGUMeta.displayName(Component.text("雷鸣鼓[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        HUANSILINMeta.displayName(Component.text("幻思铃[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        NIUMONUHOUMeta.displayName(Component.text("牛魔怒吼[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        DOUQISHIMeta.displayName(Component.text("斗气石[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        PANGUANBIMeta.displayName(Component.text("判官笔[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        MINSHENGJIANMeta.displayName(Component.text("悯生剑[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        ZHENLEITIANCHUIMeta.displayName(Component.text("震雷天锤[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        DIAOHUNGANMeta.displayName(Component.text("钓魂竿[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        SHELINZHUMeta.displayName(Component.text("摄灵珠[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        YUJINPINMeta.displayName(Component.text("玉净瓶[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        TIANJISHENJINMeta.displayName(Component.text("天机神镜[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        RUIYINGYANMeta.displayName(Component.text("锐鹰眼[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        DUOHUNTANGMeta.displayName(Component.text("夺魂汤[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        MOYUANFOZHUMeta.displayName(Component.text("摩愿佛珠[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        FUXINRUYIMeta.displayName(Component.text("浮行如意[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        LVYEXIANZONGMeta.displayName(Component.text("绿野仙踪[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        QINGNVHANSHUANGMeta.displayName(Component.text("青女寒霜[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        ZHURONGKUYANMeta.displayName(Component.text("祝融酷炎[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        ZHUDIANXUANJINGMeta.displayName(Component.text("朱电玄镜[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        BUHUNWANGMeta.displayName(Component.text("捕魂网[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        YANGSHOUJIANMeta.displayName(Component.text("阳寿剪[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        WUMINGMOYINLUOMeta.displayName(Component.text("无冥魔音螺[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        SHETIANHUAXUELINGMeta.displayName(Component.text("奢天化雪令[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        KUYELINGMeta.displayName(Component.text("枯叶灵[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        LUOBEIJINPINMeta.displayName(Component.text("罗悲净瓶[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        PINYUSHUIYUMeta.displayName(Component.text("萍雨水盂[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        DIKONGYUMOQUANMeta.displayName(Component.text("帝空御魔圈[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        LUANSHENGUMeta.displayName(Component.text("乱神菇[锻核]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        JINGULIANMeta.displayName(Component.text("禁锢镰[锻核]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        JIANCHANGULINMeta.displayName(Component.text("间忏蛊铃[锻核]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        MODUOHUNFANMeta.displayName(Component.text("摩多魂幡[锻核]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));


        core2Meta.setCustomModelData(52);
        core3Meta.setCustomModelData(53);
        core4Meta.setCustomModelData(54);
        core5Meta.setCustomModelData(55);
        core6Meta.setCustomModelData(56);
        core7Meta.setCustomModelData(57);
        core8Meta.setCustomModelData(58);

        kaiShanDaoMeta.setCustomModelData(112);
        chiTongJianMeta.setCustomModelData(113);
        poKongFuMeta.setCustomModelData(114);
        sanBaoYuRuYiMeta.setCustomModelData(115);
        xuanYuanMeta.setCustomModelData(116);

        qinTongJianMeta.setCustomModelData(112);
        juTongZhanChuiMeta.setCustomModelData(113);
        taiJiJianMeta.setCustomModelData(114);
        kunLunFeiXianJianMeta.setCustomModelData(115);
        taiEMeta.setCustomModelData(116);

        yinYueQiangMeta.setCustomModelData(112);
        hongYinQiangMeta.setCustomModelData(113);
        youLongQiangMeta.setCustomModelData(114);
        huTouZhanJinQiangMeta.setCustomModelData(115);
        ruYiJinGuBangMeta.setCustomModelData(116);

        qinTongGongMeta.setCustomModelData(212);
        yanTieGongMeta.setCustomModelData(213);
        zhongChuiGongMeta.setCustomModelData(214);
        beiDouMieShenGongMeta.setCustomModelData(215);
        zhuRiMeta.setCustomModelData(216);

        heiTieNuMeta.setCustomModelData(212);
        hongLinNuMeta.setCustomModelData(213);
        jiaoLongNuMeta.setCustomModelData(214);
        riYueLiuXingNuMeta.setCustomModelData(215);
        liangYiMeta.setCustomModelData(216);

        fuRongGongMeta.setCustomModelData(212);
        hongLuanGongMeta.setCustomModelData(213);
        tianQiongGongMeta.setCustomModelData(214);
        sheTianZhuiYueGongMeta.setCustomModelData(215);
        liuGuangMeta.setCustomModelData(216);

        qinTongGuoMeta.setCustomModelData(312);
        lianDanLuMeta.setCustomModelData(313);
        suoHunLuMeta.setCustomModelData(314);
        qiShaDingMeta.setCustomModelData(315);
        hunYuanShenDingMeta.setCustomModelData(316);

        touSp2Meta.setCustomModelData(422);
        touSp3Meta.setCustomModelData(423);
        touSp4Meta.setCustomModelData(424);
        touSp5Meta.setCustomModelData(425);
        touSp6Meta.setCustomModelData(426);
        touSp7Meta.setCustomModelData(427);
        touSp8Meta.setCustomModelData(428);

        zhanTou2Meta.setCustomModelData(122);
        zhanTou3Meta.setCustomModelData(123);
        zhanTou4Meta.setCustomModelData(124);
        zhanTou5Meta.setCustomModelData(125);
        zhanTou6Meta.setCustomModelData(126);
        zhanTou7Meta.setCustomModelData(127);
        zhanTou8Meta.setCustomModelData(128);

        gongTou2Meta.setCustomModelData(222);
        gongTou3Meta.setCustomModelData(223);
        gongTou4Meta.setCustomModelData(224);
        gongTou5Meta.setCustomModelData(225);
        gongTou6Meta.setCustomModelData(226);
        gongTou7Meta.setCustomModelData(227);
        gongTou8Meta.setCustomModelData(228);

        danTou2Meta.setCustomModelData(322);
        danTou3Meta.setCustomModelData(323);
        danTou4Meta.setCustomModelData(324);
        danTou5Meta.setCustomModelData(325);
        danTou6Meta.setCustomModelData(326);
        danTou7Meta.setCustomModelData(327);
        danTou8Meta.setCustomModelData(328);

        xiongSp2Meta.setCustomModelData(422);
        xiongSp3Meta.setCustomModelData(423);
        xiongSp4Meta.setCustomModelData(424);
        xiongSp5Meta.setCustomModelData(425);
        xiongSp6Meta.setCustomModelData(426);
        xiongSp7Meta.setCustomModelData(427);
        xiongSp8Meta.setCustomModelData(428);

        zhanXiong2Meta.setCustomModelData(122);
        zhanXiong3Meta.setCustomModelData(123);
        zhanXiong4Meta.setCustomModelData(124);
        zhanXiong5Meta.setCustomModelData(125);
        zhanXiong6Meta.setCustomModelData(126);
        zhanXiong7Meta.setCustomModelData(127);
        zhanXiong8Meta.setCustomModelData(128);

        gongXiong2Meta.setCustomModelData(222);
        gongXiong3Meta.setCustomModelData(223);
        gongXiong4Meta.setCustomModelData(224);
        gongXiong5Meta.setCustomModelData(225);
        gongXiong6Meta.setCustomModelData(226);
        gongXiong7Meta.setCustomModelData(227);
        gongXiong8Meta.setCustomModelData(228);

        danXiong2Meta.setCustomModelData(322);
        danXiong3Meta.setCustomModelData(323);
        danXiong4Meta.setCustomModelData(324);
        danXiong5Meta.setCustomModelData(325);
        danXiong6Meta.setCustomModelData(326);
        danXiong7Meta.setCustomModelData(327);
        danXiong8Meta.setCustomModelData(328);

        tuiSp2Meta.setCustomModelData(422);
        tuiSp3Meta.setCustomModelData(423);
        tuiSp4Meta.setCustomModelData(424);
        tuiSp5Meta.setCustomModelData(425);
        tuiSp6Meta.setCustomModelData(426);
        tuiSp7Meta.setCustomModelData(427);
        tuiSp8Meta.setCustomModelData(428);

        zhanTui2Meta.setCustomModelData(122);
        zhanTui3Meta.setCustomModelData(123);
        zhanTui4Meta.setCustomModelData(124);
        zhanTui5Meta.setCustomModelData(125);
        zhanTui6Meta.setCustomModelData(126);
        zhanTui7Meta.setCustomModelData(127);
        zhanTui8Meta.setCustomModelData(128);

        gongTui2Meta.setCustomModelData(222);
        gongTui3Meta.setCustomModelData(223);
        gongTui4Meta.setCustomModelData(224);
        gongTui5Meta.setCustomModelData(225);
        gongTui6Meta.setCustomModelData(226);
        gongTui7Meta.setCustomModelData(227);
        gongTui8Meta.setCustomModelData(228);

        danTui2Meta.setCustomModelData(322);
        danTui3Meta.setCustomModelData(323);
        danTui4Meta.setCustomModelData(324);
        danTui5Meta.setCustomModelData(325);
        danTui6Meta.setCustomModelData(326);
        danTui7Meta.setCustomModelData(327);
        danTui8Meta.setCustomModelData(328);

        xieSp2Meta.setCustomModelData(422);
        xieSp3Meta.setCustomModelData(423);
        xieSp4Meta.setCustomModelData(424);
        xieSp5Meta.setCustomModelData(425);
        xieSp6Meta.setCustomModelData(426);
        xieSp7Meta.setCustomModelData(427);
        xieSp8Meta.setCustomModelData(428);

        zhanXie2Meta.setCustomModelData(122);
        zhanXie3Meta.setCustomModelData(123);
        zhanXie4Meta.setCustomModelData(124);
        zhanXie5Meta.setCustomModelData(125);
        zhanXie6Meta.setCustomModelData(126);
        zhanXie7Meta.setCustomModelData(127);
        zhanXie8Meta.setCustomModelData(128);

        gongXie2Meta.setCustomModelData(222);
        gongXie3Meta.setCustomModelData(223);
        gongXie4Meta.setCustomModelData(224);
        gongXie5Meta.setCustomModelData(225);
        gongXie6Meta.setCustomModelData(226);
        gongXie7Meta.setCustomModelData(227);
        gongXie8Meta.setCustomModelData(228);

        danXie2Meta.setCustomModelData(322);
        danXie3Meta.setCustomModelData(323);
        danXie4Meta.setCustomModelData(324);
        danXie5Meta.setCustomModelData(325);
        danXie6Meta.setCustomModelData(326);
        danXie7Meta.setCustomModelData(327);
        danXie8Meta.setCustomModelData(328);


        JINRUIFEIRENMeta.setCustomModelData(132);
        WUSHENGXIUJIANMeta.setCustomModelData(133);
        HUIXUANTAJIMeta.setCustomModelData(134);
        WUYINWUZONGMeta.setCustomModelData(135);
        YANWANGTIEMeta.setCustomModelData(136);

        HUANGTONGCHONGMeta.setCustomModelData(232);
        MINGYUEMeta.setCustomModelData(233);
        CANLANMeta.setCustomModelData(234);
        JINJINGMeta.setCustomModelData(235);
        XIAOTIANMeta.setCustomModelData(236);

        QINFENGYINYINMeta.setCustomModelData(332);
        LIUSHUICHANCHANMeta.setCustomModelData(333);
        BUQICHUNYUMeta.setCustomModelData(334);
        SANSHENGZHENHUNMeta.setCustomModelData(335);
        JIUFENGLAIYIMeta.setCustomModelData(336);

        XINBINDUNPAIMeta.setCustomModelData(152);
        JINRUIDUNPAIMeta.setCustomModelData(153);
        CHISEYUEHUOMeta.setCustomModelData(154);
        JINGANGBUHUAIMeta.setCustomModelData(155);
        CHENBINLUOXUEMeta.setCustomModelData(156);

        XINBINJIANDAIMeta.setCustomModelData(252);
        JINRUIJIANDAIMeta.setCustomModelData(253);
        YINGYANJIANDAIMeta.setCustomModelData(254);
        CANGGUNINGWANGMeta.setCustomModelData(255);
        NIEPANYUNANGMeta.setCustomModelData(256);

        TIEZHIDUANBIMeta.setCustomModelData(352);
        HUIYIDAOMeta.setCustomModelData(353);
        LONGYADAOMeta.setCustomModelData(354);
        ZHANGQICUIZHUMeta.setCustomModelData(355);
        MINGHONGMeta.setCustomModelData(356);

        QING_LONG_SHENG_QI2Meta.setCustomModelData(462);
        QING_LONG_SHENG_QI3Meta.setCustomModelData(463);
        QING_LONG_SHENG_QI4Meta.setCustomModelData(464);
        QING_LONG_SHENG_QI5Meta.setCustomModelData(465);
        QING_LONG_SHENG_QI6Meta.setCustomModelData(466);

        BAI_HU_SHENG_QI2Meta.setCustomModelData(462);
        BAI_HU_SHENG_QI3Meta.setCustomModelData(463);
        BAI_HU_SHENG_QI4Meta.setCustomModelData(464);
        BAI_HU_SHENG_QI5Meta.setCustomModelData(465);
        BAI_HU_SHENG_QI6Meta.setCustomModelData(466);

        ZHU_QUE_SHENG_QI2Meta.setCustomModelData(462);
        ZHU_QUE_SHENG_QI3Meta.setCustomModelData(463);
        ZHU_QUE_SHENG_QI4Meta.setCustomModelData(464);
        ZHU_QUE_SHENG_QI5Meta.setCustomModelData(465);
        ZHU_QUE_SHENG_QI6Meta.setCustomModelData(466);

        XUAN_WU_SHENG_QI2Meta.setCustomModelData(462);
        XUAN_WU_SHENG_QI3Meta.setCustomModelData(463);
        XUAN_WU_SHENG_QI4Meta.setCustomModelData(464);
        XUAN_WU_SHENG_QI5Meta.setCustomModelData(465);
        XUAN_WU_SHENG_QI6Meta.setCustomModelData(466);

        TAN_YU_ZHI_JIEMeta.setCustomModelData(462);
        TAN_LAN_DU_JIEMeta.setCustomModelData(463);
        TAN_LAN_XIE_JIEMeta.setCustomModelData(464);
        TAN_LAN_GUI_JIEMeta.setCustomModelData(465);
        TAN_LAN_MO_JIEMeta.setCustomModelData(466);
        TAN_LAN_MING_JIEMeta.setCustomModelData(467);

        CHI_MI_ZHI_JIEMeta.setCustomModelData(462);
        CHI_YU_DU_JIEMeta.setCustomModelData(463);
        CHI_YU_XIE_JIEMeta.setCustomModelData(464);
        CHI_YU_GUI_JIEMeta.setCustomModelData(465);
        CHI_YU_MO_JIEMeta.setCustomModelData(466);
        CHI_YU_MING_JIEMeta.setCustomModelData(467);

        CHEN_NU_ZHI_JIEMeta.setCustomModelData(462);
        CHEN_HEN_DU_JIEMeta.setCustomModelData(463);
        CHEN_HEN_XIE_JIEMeta.setCustomModelData(464);
        CHEN_HEN_GUI_JIEMeta.setCustomModelData(465);
        CHEN_HEN_MO_JIEMeta.setCustomModelData(466);
        CHEN_HEN_MING_JIEMeta.setCustomModelData(467);

        CHAN_DING_FA_JIEMeta.setCustomModelData(463);
        CHAN_DING_SHENG_JIEMeta.setCustomModelData(464);
        CHAN_DING_FO_JIEMeta.setCustomModelData(465);
        CHAN_DING_XIAN_JIEMeta.setCustomModelData(466);
        CHAN_DING_SHEN_JIEMeta.setCustomModelData(467);

        ZHI_HUI_FA_JIEMeta.setCustomModelData(463);
        ZHI_HUI_SHENG_JIEMeta.setCustomModelData(464);
        ZHI_HUI_FO_JIEMeta.setCustomModelData(465);
        ZHI_HUI_XIAN_JIEMeta.setCustomModelData(466);
        ZHI_HUI_SHEN_JIEMeta.setCustomModelData(467);

        CHI_JIE_FA_JIEMeta.setCustomModelData(463);
        CHI_JIE_SHENG_JIEMeta.setCustomModelData(464);
        CHI_JIE_FO_JIEMeta.setCustomModelData(465);
        CHI_JIE_XIAN_JIEMeta.setCustomModelData(466);
        CHI_JIE_SHEN_JIEMeta.setCustomModelData(467);

        ZHAOYAOJINMeta.setCustomModelData(443);
        YUFUCHENMeta.setCustomModelData(444);
        WUSEBUTIANSHIMeta.setCustomModelData(445);

        YAOWANGHULUMeta.setCustomModelData(446);
        CIXINMIAOLIANMeta.setCustomModelData(446);
        SHENXINYUGUMeta.setCustomModelData(446);
        YINYANGZHANLONGJIANMeta.setCustomModelData(446);
        YUNLANGBANMeta.setCustomModelData(446);
        ZHENHUNYUXIAOMeta.setCustomModelData(446);
        DIKUIHUALANMeta.setCustomModelData(446);
        XUANFENGZONGSHANMeta.setCustomModelData(446);
        TAIJIBAGUAMeta.setCustomModelData(448);

        JUEDOULINGMeta.setCustomModelData(143);
        LEIMINGGUMeta.setCustomModelData(144);
        HUANSILINMeta.setCustomModelData(145);
        NIUMONUHOUMeta.setCustomModelData(146);

        DOUQISHIMeta.setCustomModelData(143);
        PANGUANBIMeta.setCustomModelData(144);
        MINSHENGJIANMeta.setCustomModelData(145);
        ZHENLEITIANCHUIMeta.setCustomModelData(146);

        DIAOHUNGANMeta.setCustomModelData(243);
        SHELINZHUMeta.setCustomModelData(244);
        YUJINPINMeta.setCustomModelData(245);
        TIANJISHENJINMeta.setCustomModelData(246);

        RUIYINGYANMeta.setCustomModelData(243);
        DUOHUNTANGMeta.setCustomModelData(244);
        MOYUANFOZHUMeta.setCustomModelData(245);
        FUXINRUYIMeta.setCustomModelData(246);

        LVYEXIANZONGMeta.setCustomModelData(343);
        QINGNVHANSHUANGMeta.setCustomModelData(344);
        ZHURONGKUYANMeta.setCustomModelData(345);
        ZHUDIANXUANJINGMeta.setCustomModelData(346);

        BUHUNWANGMeta.setCustomModelData(343);
        YANGSHOUJIANMeta.setCustomModelData(344);
        WUMINGMOYINLUOMeta.setCustomModelData(345);
        SHETIANHUAXUELINGMeta.setCustomModelData(346);

        KUYELINGMeta.setCustomModelData(343);
        LUOBEIJINPINMeta.setCustomModelData(344);
        PINYUSHUIYUMeta.setCustomModelData(345);
        DIKONGYUMOQUANMeta.setCustomModelData(346);

        LUANSHENGUMeta.setCustomModelData(343);
        JINGULIANMeta.setCustomModelData(344);
        JIANCHANGULINMeta.setCustomModelData(345);
        MODUOHUNFANMeta.setCustomModelData(346);


        CORE2.setItemMeta(core2Meta);
        CORE3.setItemMeta(core3Meta);
        CORE4.setItemMeta(core4Meta);
        CORE5.setItemMeta(core5Meta);
        CORE6.setItemMeta(core6Meta);
        CORE7.setItemMeta(core7Meta);
        CORE8.setItemMeta(core8Meta);

        KAI_SHAN_DAO.setItemMeta(kaiShanDaoMeta);
        CHI_TONG_JIAN.setItemMeta(chiTongJianMeta);
        PO_KONG_FU.setItemMeta(poKongFuMeta);
        SAN_BAO_YU_RU_YI.setItemMeta(sanBaoYuRuYiMeta);
        XUAN_YUAN.setItemMeta(xuanYuanMeta);

        QIN_TONG_JIAN.setItemMeta(qinTongJianMeta);
        JU_TONG_ZHAN_CHUI.setItemMeta(juTongZhanChuiMeta);
        TAI_JI_JIAN.setItemMeta(taiJiJianMeta);
        KUN_LUN_FEI_XIAN_JIAN.setItemMeta(kunLunFeiXianJianMeta);
        TAI_E.setItemMeta(taiEMeta);

        YIN_YUE_QIANG.setItemMeta(yinYueQiangMeta);
        HONG_YIN_QIANG.setItemMeta(hongYinQiangMeta);
        YOU_LONG_QIANG.setItemMeta(youLongQiangMeta);
        HU_TOU_ZHAN_JIN_QIANG.setItemMeta(huTouZhanJinQiangMeta);
        RU_YI_JIN_GU_BANG.setItemMeta(ruYiJinGuBangMeta);

        QIN_TONG_GONG.setItemMeta(qinTongGongMeta);
        YAN_TIE_GONG.setItemMeta(yanTieGongMeta);
        ZHONG_CHUI_GONG.setItemMeta(zhongChuiGongMeta);
        BEI_DOU_MIE_SHEN_GONG.setItemMeta(beiDouMieShenGongMeta);
        ZHU_RI.setItemMeta(zhuRiMeta);

        HEI_TIE_NU.setItemMeta(heiTieNuMeta);
        HONG_LIN_NU.setItemMeta(hongLinNuMeta);
        JIAO_LONG_NU.setItemMeta(jiaoLongNuMeta);
        RI_YUE_LIU_XING_NU.setItemMeta(riYueLiuXingNuMeta);
        LIANG_YI.setItemMeta(liangYiMeta);

        FU_RONG_GONG.setItemMeta(fuRongGongMeta);
        HONG_LUAN_GONG.setItemMeta(hongLuanGongMeta);
        TIAN_QIONG_GONG.setItemMeta(tianQiongGongMeta);
        SHE_TIAN_ZHUI_YUE_GONG.setItemMeta(sheTianZhuiYueGongMeta);
        LIU_GUANG.setItemMeta(liuGuangMeta);

        QIN_TONG_GUO.setItemMeta(qinTongGuoMeta);
        LIAN_DAN_LU.setItemMeta(lianDanLuMeta);
        SUO_HUN_LU.setItemMeta(suoHunLuMeta);
        QI_SHA_DING.setItemMeta(qiShaDingMeta);
        HUN_YUAN_SHEN_DING.setItemMeta(hunYuanShenDingMeta);

        touSp2.setItemMeta(touSp2Meta);
        touSp3.setItemMeta(touSp3Meta);
        touSp4.setItemMeta(touSp4Meta);
        touSp5.setItemMeta(touSp5Meta);
        touSp6.setItemMeta(touSp6Meta);
        touSp7.setItemMeta(touSp7Meta);
        touSp8.setItemMeta(touSp8Meta);

        zhanTou2.setItemMeta(zhanTou2Meta);
        zhanTou3.setItemMeta(zhanTou3Meta);
        zhanTou4.setItemMeta(zhanTou4Meta);
        zhanTou5.setItemMeta(zhanTou5Meta);
        zhanTou6.setItemMeta(zhanTou6Meta);
        zhanTou7.setItemMeta(zhanTou7Meta);
        zhanTou8.setItemMeta(zhanTou8Meta);

        gongTou2.setItemMeta(gongTou2Meta);
        gongTou3.setItemMeta(gongTou3Meta);
        gongTou4.setItemMeta(gongTou4Meta);
        gongTou5.setItemMeta(gongTou5Meta);
        gongTou6.setItemMeta(gongTou6Meta);
        gongTou7.setItemMeta(gongTou7Meta);
        gongTou8.setItemMeta(gongTou8Meta);

        danTou2.setItemMeta(danTou2Meta);
        danTou3.setItemMeta(danTou3Meta);
        danTou4.setItemMeta(danTou4Meta);
        danTou5.setItemMeta(danTou5Meta);
        danTou6.setItemMeta(danTou6Meta);
        danTou7.setItemMeta(danTou7Meta);
        danTou8.setItemMeta(danTou8Meta);

        xiongSp2.setItemMeta(xiongSp2Meta);
        xiongSp3.setItemMeta(xiongSp3Meta);
        xiongSp4.setItemMeta(xiongSp4Meta);
        xiongSp5.setItemMeta(xiongSp5Meta);
        xiongSp6.setItemMeta(xiongSp6Meta);
        xiongSp7.setItemMeta(xiongSp7Meta);
        xiongSp8.setItemMeta(xiongSp8Meta);

        zhanXiong2.setItemMeta(zhanXiong2Meta);
        zhanXiong3.setItemMeta(zhanXiong3Meta);
        zhanXiong4.setItemMeta(zhanXiong4Meta);
        zhanXiong5.setItemMeta(zhanXiong5Meta);
        zhanXiong6.setItemMeta(zhanXiong6Meta);
        zhanXiong7.setItemMeta(zhanXiong7Meta);
        zhanXiong8.setItemMeta(zhanXiong8Meta);

        gongXiong2.setItemMeta(gongXiong2Meta);
        gongXiong3.setItemMeta(gongXiong3Meta);
        gongXiong4.setItemMeta(gongXiong4Meta);
        gongXiong5.setItemMeta(gongXiong5Meta);
        gongXiong6.setItemMeta(gongXiong6Meta);
        gongXiong7.setItemMeta(gongXiong7Meta);
        gongXiong8.setItemMeta(gongXiong8Meta);

        danXiong2.setItemMeta(danXiong2Meta);
        danXiong3.setItemMeta(danXiong3Meta);
        danXiong4.setItemMeta(danXiong4Meta);
        danXiong5.setItemMeta(danXiong5Meta);
        danXiong6.setItemMeta(danXiong6Meta);
        danXiong7.setItemMeta(danXiong7Meta);
        danXiong8.setItemMeta(danXiong8Meta);

        tuiSp2.setItemMeta(tuiSp2Meta);
        tuiSp3.setItemMeta(tuiSp3Meta);
        tuiSp4.setItemMeta(tuiSp4Meta);
        tuiSp5.setItemMeta(tuiSp5Meta);
        tuiSp6.setItemMeta(tuiSp6Meta);
        tuiSp7.setItemMeta(tuiSp7Meta);
        tuiSp8.setItemMeta(tuiSp8Meta);

        zhanTui2.setItemMeta(zhanTui2Meta);
        zhanTui3.setItemMeta(zhanTui3Meta);
        zhanTui4.setItemMeta(zhanTui4Meta);
        zhanTui5.setItemMeta(zhanTui5Meta);
        zhanTui6.setItemMeta(zhanTui6Meta);
        zhanTui7.setItemMeta(zhanTui7Meta);
        zhanTui8.setItemMeta(zhanTui8Meta);

        gongTui2.setItemMeta(gongTui2Meta);
        gongTui3.setItemMeta(gongTui3Meta);
        gongTui4.setItemMeta(gongTui4Meta);
        gongTui5.setItemMeta(gongTui5Meta);
        gongTui6.setItemMeta(gongTui6Meta);
        gongTui7.setItemMeta(gongTui7Meta);
        gongTui8.setItemMeta(gongTui8Meta);

        danTui2.setItemMeta(danTui2Meta);
        danTui3.setItemMeta(danTui3Meta);
        danTui4.setItemMeta(danTui4Meta);
        danTui5.setItemMeta(danTui5Meta);
        danTui6.setItemMeta(danTui6Meta);
        danTui7.setItemMeta(danTui7Meta);
        danTui8.setItemMeta(danTui8Meta);

        xieSp2.setItemMeta(xieSp2Meta);
        xieSp3.setItemMeta(xieSp3Meta);
        xieSp4.setItemMeta(xieSp4Meta);
        xieSp5.setItemMeta(xieSp5Meta);
        xieSp6.setItemMeta(xieSp6Meta);
        xieSp7.setItemMeta(xieSp7Meta);
        xieSp8.setItemMeta(xieSp8Meta);

        zhanXie2.setItemMeta(zhanXie2Meta);
        zhanXie3.setItemMeta(zhanXie3Meta);
        zhanXie4.setItemMeta(zhanXie4Meta);
        zhanXie5.setItemMeta(zhanXie5Meta);
        zhanXie6.setItemMeta(zhanXie6Meta);
        zhanXie7.setItemMeta(zhanXie7Meta);
        zhanXie8.setItemMeta(zhanXie8Meta);

        gongXie2.setItemMeta(gongXie2Meta);
        gongXie3.setItemMeta(gongXie3Meta);
        gongXie4.setItemMeta(gongXie4Meta);
        gongXie5.setItemMeta(gongXie5Meta);
        gongXie6.setItemMeta(gongXie6Meta);
        gongXie7.setItemMeta(gongXie7Meta);
        gongXie8.setItemMeta(gongXie8Meta);

        danXie2.setItemMeta(danXie2Meta);
        danXie3.setItemMeta(danXie3Meta);
        danXie4.setItemMeta(danXie4Meta);
        danXie5.setItemMeta(danXie5Meta);
        danXie6.setItemMeta(danXie6Meta);
        danXie7.setItemMeta(danXie7Meta);
        danXie8.setItemMeta(danXie8Meta);

        JINRUIFEIREN.setItemMeta(JINRUIFEIRENMeta);
        WUSHENGXIUJIAN.setItemMeta(WUSHENGXIUJIANMeta);
        HUIXUANTAJI.setItemMeta(HUIXUANTAJIMeta);
        WUYINWUZONG.setItemMeta(WUYINWUZONGMeta);
        YANWANGTIE.setItemMeta(YANWANGTIEMeta);

        HUANGTONGCHONG.setItemMeta(HUANGTONGCHONGMeta);
        MINGYUE.setItemMeta(MINGYUEMeta);
        CANLAN.setItemMeta(CANLANMeta);
        JINJING.setItemMeta(JINJINGMeta);
        XIAOTIAN.setItemMeta(XIAOTIANMeta);

        QINFENGYINYIN.setItemMeta(QINFENGYINYINMeta);
        LIUSHUICHANCHAN.setItemMeta(LIUSHUICHANCHANMeta);
        BUQICHUNYU.setItemMeta(BUQICHUNYUMeta);
        SANSHENGZHENHUN.setItemMeta(SANSHENGZHENHUNMeta);
        JIUFENGLAIYI.setItemMeta(JIUFENGLAIYIMeta);

        XINBINDUNPAI.setItemMeta(XINBINDUNPAIMeta);
        JINRUIDUNPAI.setItemMeta(JINRUIDUNPAIMeta);
        CHISEYUEHUO.setItemMeta(CHISEYUEHUOMeta);
        JINGANGBUHUAI.setItemMeta(JINGANGBUHUAIMeta);
        CHENBINLUOXUE.setItemMeta(CHENBINLUOXUEMeta);

        XINBINJIANDAI.setItemMeta(XINBINJIANDAIMeta);
        JINRUIJIANDAI.setItemMeta(JINRUIJIANDAIMeta);
        YINGYANJIANDAI.setItemMeta(YINGYANJIANDAIMeta);
        CANGGUNINGWANG.setItemMeta(CANGGUNINGWANGMeta);
        NIEPANYUNANG.setItemMeta(NIEPANYUNANGMeta);

        TIEZHIDUANBI.setItemMeta(TIEZHIDUANBIMeta);
        HUIYIDAO.setItemMeta(HUIYIDAOMeta);
        LONGYADAO.setItemMeta(LONGYADAOMeta);
        ZHANGQICUIZHU.setItemMeta(ZHANGQICUIZHUMeta);
        MINGHONG.setItemMeta(MINGHONGMeta);

        QING_LONG_SHENG_QI2.setItemMeta(QING_LONG_SHENG_QI2Meta);
        QING_LONG_SHENG_QI3.setItemMeta(QING_LONG_SHENG_QI3Meta);
        QING_LONG_SHENG_QI4.setItemMeta(QING_LONG_SHENG_QI4Meta);
        QING_LONG_SHENG_QI5.setItemMeta(QING_LONG_SHENG_QI5Meta);
        QING_LONG_SHENG_QI6.setItemMeta(QING_LONG_SHENG_QI6Meta);

        BAI_HU_SHENG_QI2.setItemMeta(BAI_HU_SHENG_QI2Meta);
        BAI_HU_SHENG_QI3.setItemMeta(BAI_HU_SHENG_QI3Meta);
        BAI_HU_SHENG_QI4.setItemMeta(BAI_HU_SHENG_QI4Meta);
        BAI_HU_SHENG_QI5.setItemMeta(BAI_HU_SHENG_QI5Meta);
        BAI_HU_SHENG_QI6.setItemMeta(BAI_HU_SHENG_QI6Meta);

        ZHU_QUE_SHENG_QI2.setItemMeta(ZHU_QUE_SHENG_QI2Meta);
        ZHU_QUE_SHENG_QI3.setItemMeta(ZHU_QUE_SHENG_QI3Meta);
        ZHU_QUE_SHENG_QI4.setItemMeta(ZHU_QUE_SHENG_QI4Meta);
        ZHU_QUE_SHENG_QI5.setItemMeta(ZHU_QUE_SHENG_QI5Meta);
        ZHU_QUE_SHENG_QI6.setItemMeta(ZHU_QUE_SHENG_QI6Meta);

        XUAN_WU_SHENG_QI2.setItemMeta(XUAN_WU_SHENG_QI2Meta);
        XUAN_WU_SHENG_QI3.setItemMeta(XUAN_WU_SHENG_QI3Meta);
        XUAN_WU_SHENG_QI4.setItemMeta(XUAN_WU_SHENG_QI4Meta);
        XUAN_WU_SHENG_QI5.setItemMeta(XUAN_WU_SHENG_QI5Meta);
        XUAN_WU_SHENG_QI6.setItemMeta(XUAN_WU_SHENG_QI6Meta);

        TAN_YU_ZHI_JIE.setItemMeta(TAN_YU_ZHI_JIEMeta);
        TAN_LAN_DU_JIE.setItemMeta(TAN_LAN_DU_JIEMeta);
        TAN_LAN_XIE_JIE.setItemMeta(TAN_LAN_XIE_JIEMeta);
        TAN_LAN_GUI_JIE.setItemMeta(TAN_LAN_GUI_JIEMeta);
        TAN_LAN_MO_JIE.setItemMeta(TAN_LAN_MO_JIEMeta);
        TAN_LAN_MING_JIE.setItemMeta(TAN_LAN_MING_JIEMeta);

        CHI_MI_ZHI_JIE.setItemMeta(CHI_MI_ZHI_JIEMeta);
        CHI_YU_DU_JIE.setItemMeta(CHI_YU_DU_JIEMeta);
        CHI_YU_XIE_JIE.setItemMeta(CHI_YU_XIE_JIEMeta);
        CHI_YU_GUI_JIE.setItemMeta(CHI_YU_GUI_JIEMeta);
        CHI_YU_MO_JIE.setItemMeta(CHI_YU_MO_JIEMeta);
        CHI_YU_MING_JIE.setItemMeta(CHI_YU_MING_JIEMeta);

        CHEN_NU_ZHI_JIE.setItemMeta(CHEN_NU_ZHI_JIEMeta);
        CHEN_HEN_DU_JIE.setItemMeta(CHEN_HEN_DU_JIEMeta);
        CHEN_HEN_XIE_JIE.setItemMeta(CHEN_HEN_XIE_JIEMeta);
        CHEN_HEN_GUI_JIE.setItemMeta(CHEN_HEN_GUI_JIEMeta);
        CHEN_HEN_MO_JIE.setItemMeta(CHEN_HEN_MO_JIEMeta);
        CHEN_HEN_MING_JIE.setItemMeta(CHEN_HEN_MING_JIEMeta);

        CHAN_DING_FA_JIE.setItemMeta(CHAN_DING_FA_JIEMeta);
        CHAN_DING_SHENG_JIE.setItemMeta(CHAN_DING_SHENG_JIEMeta);
        CHAN_DING_FO_JIE.setItemMeta(CHAN_DING_FO_JIEMeta);
        CHAN_DING_XIAN_JIE.setItemMeta(CHAN_DING_XIAN_JIEMeta);
        CHAN_DING_SHEN_JIE.setItemMeta(CHAN_DING_SHEN_JIEMeta);

        ZHI_HUI_FA_JIE.setItemMeta(ZHI_HUI_FA_JIEMeta);
        ZHI_HUI_SHENG_JIE.setItemMeta(ZHI_HUI_SHENG_JIEMeta);
        ZHI_HUI_FO_JIE.setItemMeta(ZHI_HUI_FO_JIEMeta);
        ZHI_HUI_XIAN_JIE.setItemMeta(ZHI_HUI_XIAN_JIEMeta);
        ZHI_HUI_SHEN_JIE.setItemMeta(ZHI_HUI_SHEN_JIEMeta);

        CHI_JIE_FA_JIE.setItemMeta(CHI_JIE_FA_JIEMeta);
        CHI_JIE_SHENG_JIE.setItemMeta(CHI_JIE_SHENG_JIEMeta);
        CHI_JIE_FO_JIE.setItemMeta(CHI_JIE_FO_JIEMeta);
        CHI_JIE_XIAN_JIE.setItemMeta(CHI_JIE_XIAN_JIEMeta);
        CHI_JIE_SHEN_JIE.setItemMeta(CHI_JIE_SHEN_JIEMeta);

        ZHAOYAOJIN.setItemMeta(ZHAOYAOJINMeta);
        YUFUCHEN.setItemMeta(YUFUCHENMeta);
        WUSEBUTIANSHI.setItemMeta(WUSEBUTIANSHIMeta);

        YAOWANGHULU.setItemMeta(YAOWANGHULUMeta);
        CIXINMIAOLIAN.setItemMeta(CIXINMIAOLIANMeta);
        SHENXINYUGU.setItemMeta(SHENXINYUGUMeta);
        YINYANGZHANLONGJIAN.setItemMeta(YINYANGZHANLONGJIANMeta);
        YUNLANGBAN.setItemMeta(YUNLANGBANMeta);
        ZHENHUNYUXIAO.setItemMeta(ZHENHUNYUXIAOMeta);
        DIKUIHUALAN.setItemMeta(DIKUIHUALANMeta);
        XUANFENGZONGSHAN.setItemMeta(XUANFENGZONGSHANMeta);
        TAIJIBAGUA.setItemMeta(TAIJIBAGUAMeta);

        JUEDOULING.setItemMeta(JUEDOULINGMeta);
        LEIMINGGU.setItemMeta(LEIMINGGUMeta);
        HUANSILIN.setItemMeta(HUANSILINMeta);
        NIUMONUHOU.setItemMeta(NIUMONUHOUMeta);

        DOUQISHI.setItemMeta(DOUQISHIMeta);
        PANGUANBI.setItemMeta(PANGUANBIMeta);
        MINSHENGJIAN.setItemMeta(MINSHENGJIANMeta);
        ZHENLEITIANCHUI.setItemMeta(ZHENLEITIANCHUIMeta);

        DIAOHUNGAN.setItemMeta(DIAOHUNGANMeta);
        SHELINZHU.setItemMeta(SHELINZHUMeta);
        YUJINPIN.setItemMeta(YUJINPINMeta);
        TIANJISHENJIN.setItemMeta(TIANJISHENJINMeta);

        DOUQISHI.setItemMeta(DOUQISHIMeta);
        PANGUANBI.setItemMeta(PANGUANBIMeta);
        MINSHENGJIAN.setItemMeta(MINSHENGJIANMeta);
        ZHENLEITIANCHUI.setItemMeta(ZHENLEITIANCHUIMeta);

        DIAOHUNGAN.setItemMeta(DIAOHUNGANMeta);
        SHELINZHU.setItemMeta(SHELINZHUMeta);
        YUJINPIN.setItemMeta(YUJINPINMeta);
        TIANJISHENJIN.setItemMeta(TIANJISHENJINMeta);

        RUIYINGYAN.setItemMeta(RUIYINGYANMeta);
        DUOHUNTANG.setItemMeta(DUOHUNTANGMeta);
        MOYUANFOZHU.setItemMeta(MOYUANFOZHUMeta);
        FUXINRUYI.setItemMeta(FUXINRUYIMeta);

        LVYEXIANZONG.setItemMeta(LVYEXIANZONGMeta);
        QINGNVHANSHUANG.setItemMeta(QINGNVHANSHUANGMeta);
        ZHURONGKUYAN.setItemMeta(ZHURONGKUYANMeta);
        ZHUDIANXUANJING.setItemMeta(ZHUDIANXUANJINGMeta);

        BUHUNWANG.setItemMeta(BUHUNWANGMeta);
        YANGSHOUJIAN.setItemMeta(YANGSHOUJIANMeta);
        WUMINGMOYINLUO.setItemMeta(WUMINGMOYINLUOMeta);
        SHETIANHUAXUELING.setItemMeta(SHETIANHUAXUELINGMeta);

        KUYELING.setItemMeta(KUYELINGMeta);
        LUOBEIJINPIN.setItemMeta(LUOBEIJINPINMeta);
        PINYUSHUIYU.setItemMeta(PINYUSHUIYUMeta);
        DIKONGYUMOQUAN.setItemMeta(DIKONGYUMOQUANMeta);

        LUANSHENGU.setItemMeta(LUANSHENGUMeta);
        JINGULIAN.setItemMeta(JINGULIANMeta);
        JIANCHANGULIN.setItemMeta(JIANCHANGULINMeta);
        MODUOHUNFAN.setItemMeta(MODUOHUNFANMeta);

    }

}
