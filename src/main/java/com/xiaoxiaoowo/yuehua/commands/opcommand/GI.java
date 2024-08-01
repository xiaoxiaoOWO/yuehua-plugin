package com.xiaoxiaoowo.yuehua.commands.opcommand;


import com.xiaoxiaoowo.yuehua.itemstack.dz.FuLing;
import com.xiaoxiaoowo.yuehua.itemstack.dz.Ingredient;
import com.xiaoxiaoowo.yuehua.itemstack.dz.YuShi;
import com.xiaoxiaoowo.yuehua.itemstack.dz.YuanSu;
import com.xiaoxiaoowo.yuehua.itemstack.liandan.Dan;
import com.xiaoxiaoowo.yuehua.itemstack.liandan.Herb;
import com.xiaoxiaoowo.yuehua.itemstack.monsterzhuangbei.Bow;
import com.xiaoxiaoowo.yuehua.itemstack.other.*;
import com.xiaoxiaoowo.yuehua.itemstack.zhuangbei.*;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public final class GI implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player player) {
            if (!player.isOp()) {
                player.sendMessage(
                        Component.text("§6[命令系统]§4你没有权限使用这个命令")
                );
                return true;
            }
            if (args.length != 1) {
                player.sendMessage(
                        Component.text("§6[命令系统]§4参数错误")
                );
                return true;
            }

            List<ItemStack> itemStacks = switch (args[0]) {
                case "fuling" -> List.of(
                        FuLing.zhusha,
                        FuLing.shouhu1,
                        FuLing.shouhu2,
                        FuLing.shouhu3,
                        FuLing.jiabin,
                        FuLing.yankai1,
                        FuLing.yankai2,
                        FuLing.yankai3,
                        FuLing.yanmo,
                        FuLing.shuangjia1,
                        FuLing.shuangjia2,
                        FuLing.shuangjia3,
                        FuLing.aohan,
                        FuLing.luoshi1,
                        FuLing.luoshi2,
                        FuLing.luoshi3,
                        FuLing.wuxie,
                        FuLing.yuti1,
                        FuLing.yuti2,
                        FuLing.yuti3,
                        FuLing.xianti,
                        FuLing.qiangren1,
                        FuLing.qiangren2,
                        FuLing.qiangren3,
                        FuLing.bucui
                );

                case "fuling2" -> List.of(
                        FuLing.liren1,
                        FuLing.liren2,
                        FuLing.liren3,
                        FuLing.duanzui,
                        FuLing.juli1,
                        FuLing.juli2,
                        FuLing.juli3,
                        FuLing.wangyue,
                        FuLing.qiangong1,
                        FuLing.qiangong2,
                        FuLing.qiangong3,
                        FuLing.yuanri,
                        FuLing.bujin1,
                        FuLing.bujin2,
                        FuLing.bujin3,
                        FuLing.wuxian,
                        FuLing.huixin1,
                        FuLing.huixin2,
                        FuLing.huixin3,
                        FuLing.xianfa,
                        FuLing.guantong1,
                        FuLing.guantong2,
                        FuLing.guantong3,
                        FuLing.shenfa,
                        FuLing.wanfa1,
                        FuLing.wanfa2,
                        FuLing.wanfa3,
                        FuLing.shengfa
                );


                case "ingredient" -> List.of(
                        Ingredient.BI_SHI_SUI,
                        Ingredient.CHI_TONG_DING,
                        Ingredient.XUAN_TIE_DING,
                        Ingredient.LING_YU_JIAN,
                        Ingredient.SHEN_ZAO_TIE,
                        Ingredient.QI_CAI_XIAN_YU,
                        Ingredient.AO_LANG_PI,
                        Ingredient.BA_JIAO_YE,
                        Ingredient.LIU_YIN_CHOU,
                        Ingredient.NIE_PAN_YU,
                        Ingredient.HUANG_TU_SHEN_QIU,
                        Ingredient.YAN_GUI_ZHI_JIN,
                        Ingredient.LIU_GUANG_LIN_JUAN,
                        Ingredient.MING_LEI_YOU_SHA,
                        Ingredient.BAI_SHE_LIN,
                        Ingredient.KU_XIU_GU,
                        Ingredient.HUANG_TONG_KUANG,
                        Ingredient.DU_ZHU_YA,
                        Ingredient.RONG_YAN_SHA,
                        Ingredient.YAN_YANG_HUA,
                        Ingredient.GUI_YOU_HUO,
                        Ingredient.CHI_SHA_MO,
                        Ingredient.LIU_LUO_ZHU,
                        Ingredient.TIAN_SHU_SHI,
                        Ingredient.YU_HENG_SHI,
                        Ingredient.RONG_LIAN_SHI,
                        Ingredient.CHEN_SHUI_TIE,
                        Ingredient.JI_LANG_LUO,
                        Ingredient.MING_HAI_JIN,
                        Ingredient.BI_BO_JING,
                        Ingredient.QI_CAI_JIN,
                        Ingredient.WAN_YUE_YIN,
                        Ingredient.QIAN_NIAN_YU,
                        Ingredient.ZHANG_NIE_YIN_TIE,
                        Ingredient.XUE_YING_SHI
                );


                case "yuansu" -> List.of(
                        YuanSu.jin, YuanSu.mu, YuanSu.huo, YuanSu.shui, YuanSu.tu,
                        YuanSu.concentrated_jin, YuanSu.concentrated_mu, YuanSu.concentrated_huo, YuanSu.concentrated_shui, YuanSu.concentrated_tu,
                        YuanSu.refined_jin, YuanSu.refined_mu, YuanSu.refined_huo, YuanSu.refined_shui, YuanSu.refined_tu,
                        YuanSu.bagging_jin, YuanSu.bagging_mu, YuanSu.bagging_huo, YuanSu.bagging_shui, YuanSu.bagging_tu
                );


                case "yushi1" -> List.of(
                        YuShi.XUE_SE_SHI1, YuShi.XUE_SE_SHI2, YuShi.XUE_SE_SHI3, YuShi.XUE_SE_SHI4, YuShi.XUE_SE_SHI5, YuShi.XUE_SE_SHI6, YuShi.XUE_SE_SHI7, YuShi.XUE_SE_SHI8,
                        YuShi.CUI_LV_SHI1, YuShi.CUI_LV_SHI2, YuShi.CUI_LV_SHI3, YuShi.CUI_LV_SHI4, YuShi.CUI_LV_SHI5, YuShi.CUI_LV_SHI6, YuShi.CUI_LV_SHI7, YuShi.CUI_LV_SHI8,
                        YuShi.DIAN_LAN_SHI1, YuShi.DIAN_LAN_SHI2, YuShi.DIAN_LAN_SHI3, YuShi.DIAN_LAN_SHI4, YuShi.DIAN_LAN_SHI5, YuShi.DIAN_LAN_SHI6, YuShi.DIAN_LAN_SHI7, YuShi.DIAN_LAN_SHI8,
                        YuShi.JIN_HUANG_SHI1, YuShi.JIN_HUANG_SHI2, YuShi.JIN_HUANG_SHI3, YuShi.JIN_HUANG_SHI4, YuShi.JIN_HUANG_SHI5, YuShi.JIN_HUANG_SHI6, YuShi.JIN_HUANG_SHI7, YuShi.JIN_HUANG_SHI8
                );

                case "yushi2" -> List.of(
                        YuShi.HOU_TU_SHI1, YuShi.HOU_TU_SHI2, YuShi.HOU_TU_SHI3, YuShi.HOU_TU_SHI4, YuShi.HOU_TU_SHI5, YuShi.HOU_TU_SHI6, YuShi.HOU_TU_SHI7, YuShi.HOU_TU_SHI8,
                        YuShi.ZI_JING_SHI1, YuShi.ZI_JING_SHI2, YuShi.ZI_JING_SHI3, YuShi.ZI_JING_SHI4, YuShi.ZI_JING_SHI5, YuShi.ZI_JING_SHI6, YuShi.ZI_JING_SHI7, YuShi.ZI_JING_SHI8,
                        YuShi.TU_LU_SHI1, YuShi.TU_LU_SHI2, YuShi.TU_LU_SHI3, YuShi.TU_LU_SHI4, YuShi.TU_LU_SHI5, YuShi.TU_LU_SHI6, YuShi.TU_LU_SHI7, YuShi.TU_LU_SHI8

                );

                case "yushi3" -> List.of(
                        YuShi.HONG_YUE_SHI1, YuShi.HONG_YUE_SHI2, YuShi.HONG_YUE_SHI3, YuShi.HONG_YUE_SHI4, YuShi.HONG_YUE_SHI5, YuShi.HONG_YUE_SHI6, YuShi.HONG_YUE_SHI7, YuShi.HONG_YUE_SHI8,
                        YuShi.MI_YIN_SHI1, YuShi.MI_YIN_SHI2, YuShi.MI_YIN_SHI3, YuShi.MI_YIN_SHI4, YuShi.MI_YIN_SHI5, YuShi.MI_YIN_SHI6, YuShi.MI_YIN_SHI7, YuShi.MI_YIN_SHI8,
                        YuShi.YU_LU_SHI1, YuShi.YU_LU_SHI2, YuShi.YU_LU_SHI3, YuShi.YU_LU_SHI4, YuShi.YU_LU_SHI5, YuShi.YU_LU_SHI6, YuShi.YU_LU_SHI7, YuShi.YU_LU_SHI8

                );

                case "yushi4" -> List.of(
                        YuShi.BING_SHUANG_SHI1, YuShi.BING_SHUANG_SHI2, YuShi.BING_SHUANG_SHI3, YuShi.BING_SHUANG_SHI4, YuShi.BING_SHUANG_SHI5, YuShi.BING_SHUANG_SHI6, YuShi.BING_SHUANG_SHI7, YuShi.BING_SHUANG_SHI8,
                        YuShi.YAN_YANG_SHI1, YuShi.YAN_YANG_SHI2, YuShi.YAN_YANG_SHI3, YuShi.YAN_YANG_SHI4, YuShi.YAN_YANG_SHI5, YuShi.YAN_YANG_SHI6, YuShi.YAN_YANG_SHI7, YuShi.YAN_YANG_SHI8,
                        YuShi.SUI_YAN_SHI1, YuShi.SUI_YAN_SHI2, YuShi.SUI_YAN_SHI3, YuShi.SUI_YAN_SHI4, YuShi.SUI_YAN_SHI5, YuShi.SUI_YAN_SHI6, YuShi.SUI_YAN_SHI7, YuShi.SUI_YAN_SHI8
                );

                case "dan" -> List.of(
                        Dan.YAOYIN1,
                        Dan.YAOYIN2,
                        Dan.YAOYIN3,
                        Dan.YAOYIN4
                );

                case "herb" -> List.of(
                        Herb.RenShen,
                        Herb.LingZhi,
                        Herb.HeShouWu,
                        Herb.GouQi,
                        Herb.HeTun,
                        Herb.WangYouCao,
                        Herb.ZhenZhu,
                        Herb.LuRong,
                        Herb.PuTiZi,
                        Herb.BaJiaoXuanBinCao,
                        Herb.LieHuoXinJiaoShu,
                        Herb.QiCaiFuRongHua
                );

                case "collection" -> List.of(
                        Collection.SHAN_SHEN_MIAO,
                        Collection.SHEN_MU_YAO_JING,
                        Collection.WANG_YUAN_WAI,
                        Collection.WEN_QUAN_KE_ZHAN,
                        Collection.SHA_MO_SHI_BEI,
                        Collection.CHEN_DAI_FU,
                        Collection.SHEN_SHAN_ZHANG_ZHE,
                        Collection.YU_ZHU,
                        Collection.BAI_GU_JING,
                        Collection.PENG_LAI_SHANG_REN,
                        Collection.SHI_HUANG,
                        Collection.HUO_MO,
                        Collection.CHI_YOU,
                        Collection.GUI_OU,
                        Collection.SHENG_SHAN,
                        Collection.KU_GU
                );

                case "feather" -> List.of(
                        Feather.XIN_YA_ZHI_YU,
                        Feather.QING_YING_ZHI_YU,
                        Feather.SHEN_SU_ZHI_YU,
                        Feather.JIN_PENG_ZHI_YU,
                        Feather.JIN_PENG_ZHI_YU_SUI_PIAN,
                        Feather.QING_LUAN_ZHI_YU,
                        Feather.QING_LUAN_ZHI_YU_SUI_PIAN,
                        Feather.TONG_HE_ZHI_YU,
                        Feather.TONG_HE_ZHI_YU_SUI_PIAN
                );


                case "food" -> List.of(
                        Food.baoZi,
                        Food.kaoDiGua,
                        Food.xiBing,
                        Food.foTiaoQiang,
                        Food.kaoYu,
                        Food.kaoGuiYu,
                        Food.kaoJi,
                        Food.niuPai,
                        Food.zhuPai,
                        Food.yangTui,
                        Food.tuRou,
                        Food.zongZi,
                        Food.yueBin,
                        Food.ZhuangYuanYueBin,
                        Food.DuiTangYueBin,
                        Food.SanHongYueBin,
                        Food.YiHeYueBin,
                        Food.BanHeYueBin,
                        Food.xianTao,
                        Food.pinGuo,
                        Food.fengmi,
                        Food.shuilangniemianren,
                        Food.xiguapian,
                        Food.longjin,
                        Food.maojian,
                        Food.tieguanyin,
                        Food.puer
                );

                case "fuben" -> List.of(
                        FuBen.keyTong,
                        FuBen.keyYin,
                        FuBen.keyJin,
                        FuBen.keyYu,
                        FuBen.keyXinYun5,
                        FuBen.keyXinYun10,
                        FuBen.keyXinYun20,
                        FuBen.keyXinYun100
                );

                case "money" -> List.of(
                        Money.tongQian,
                        Money.jinYuanBao,
                        Money.yinPiao,
                        Money.zuanShi,
                        Money.MONEY_SHEN,
                        Money.MONEY_XIAN,
                        Money.MONEY_REN,
                        Money.MONEY_YAO,
                        Money.MONEY_ZHANSHEN
                );

                case "moneyloot" -> List.of(
                        MoneyLoot.ZHI_ZHU_YAN,
                        MoneyLoot.PI_GE,
                        MoneyLoot.TU_ZI_PI,
                        MoneyLoot.MEI_TAN,
                        MoneyLoot.XIAO_MAI,
                        MoneyLoot.FU_ZHU,
                        MoneyLoot.XI_RANG,
                        MoneyLoot.TAO_CI_SUI,
                        MoneyLoot.CU_TIE,
                        MoneyLoot.YAO_NIAO_YU,
                        MoneyLoot.YAO_NIAO_LEI,
                        MoneyLoot.SHAN_HU_SHI,
                        MoneyLoot.ZHANG_QI_TOU_LU,
                        MoneyLoot.GOU_YU_BAI,
                        MoneyLoot.GOU_YU_HEI,
                        MoneyLoot.BIN_TIE,
                        MoneyLoot.HU_PO
                );

                case "other" -> List.of(
                        Other.NPC_PAOPAO,
                        Other.CHONG_SHENG_STONE
                );

                case "raceprovince" -> List.of(
                        RaceProvince.shen,
                        RaceProvince.xian,
                        RaceProvince.ren,
                        RaceProvince.yao,
                        RaceProvince.zhanShen
                );

                case "xp" -> List.of(
                        XP.XP_10,
                        XP.XP_20,
                        XP.XP_50,
                        XP.XP_100,
                        XP.XP_200,
                        XP.XP_500
                );

                case "tou" -> List.of(
                        ArmorHead.tou1,
                        ArmorHead.touSp2,
                        ArmorHead.touSp3,
                        ArmorHead.touSp4,
                        ArmorHead.touSp5,
                        ArmorHead.touSp6,
                        ArmorHead.touSp7,
                        ArmorHead.touSp8,
                        ArmorHead.zhanTou2,
                        ArmorHead.zhanTou3,
                        ArmorHead.zhanTou4,
                        ArmorHead.zhanTou5,
                        ArmorHead.zhanTou6,
                        ArmorHead.zhanTou7,
                        ArmorHead.zhanTou8,
                        ArmorHead.gongTou2,
                        ArmorHead.gongTou3,
                        ArmorHead.gongTou4,
                        ArmorHead.gongTou5,
                        ArmorHead.gongTou6,
                        ArmorHead.gongTou7,
                        ArmorHead.gongTou8,
                        ArmorHead.danTou2,
                        ArmorHead.danTou3,
                        ArmorHead.danTou4,
                        ArmorHead.danTou5,
                        ArmorHead.danTou6,
                        ArmorHead.danTou7,
                        ArmorHead.danTou8
                );

                case "xiong" -> List.of(
                        ArmorChest.xiong1,
                        ArmorChest.xiongSp2,
                        ArmorChest.xiongSp3,
                        ArmorChest.xiongSp4,
                        ArmorChest.xiongSp5,
                        ArmorChest.xiongSp6,
                        ArmorChest.xiongSp7,
                        ArmorChest.xiongSp8,
                        ArmorChest.zhanXiong2,
                        ArmorChest.zhanXiong3,
                        ArmorChest.zhanXiong4,
                        ArmorChest.zhanXiong5,
                        ArmorChest.zhanXiong6,
                        ArmorChest.zhanXiong7,
                        ArmorChest.zhanXiong8,
                        ArmorChest.gongXiong2,
                        ArmorChest.gongXiong3,
                        ArmorChest.gongXiong4,
                        ArmorChest.gongXiong5,
                        ArmorChest.gongXiong6,
                        ArmorChest.gongXiong7,
                        ArmorChest.gongXiong8,
                        ArmorChest.danXiong2,
                        ArmorChest.danXiong3,
                        ArmorChest.danXiong4,
                        ArmorChest.danXiong5,
                        ArmorChest.danXiong6,
                        ArmorChest.danXiong7,
                        ArmorChest.danXiong8

                );

                case "tui" -> List.of(
                        ArmorLeg.tui1,
                        ArmorLeg.tuiSp2,
                        ArmorLeg.tuiSp3,
                        ArmorLeg.tuiSp4,
                        ArmorLeg.tuiSp5,
                        ArmorLeg.tuiSp6,
                        ArmorLeg.tuiSp7,
                        ArmorLeg.tuiSp8,
                        ArmorLeg.zhanTui2,
                        ArmorLeg.zhanTui3,
                        ArmorLeg.zhanTui4,
                        ArmorLeg.zhanTui5,
                        ArmorLeg.zhanTui6,
                        ArmorLeg.zhanTui7,
                        ArmorLeg.zhanTui8,
                        ArmorLeg.gongTui2,
                        ArmorLeg.gongTui3,
                        ArmorLeg.gongTui4,
                        ArmorLeg.gongTui5,
                        ArmorLeg.gongTui6,
                        ArmorLeg.gongTui7,
                        ArmorLeg.gongTui8,
                        ArmorLeg.danTui2,
                        ArmorLeg.danTui3,
                        ArmorLeg.danTui4,
                        ArmorLeg.danTui5,
                        ArmorLeg.danTui6,
                        ArmorLeg.danTui7,
                        ArmorLeg.danTui8
                );

                case "xie" -> List.of(
                        ArmorFeet.xie1,
                        ArmorFeet.xieSp2,
                        ArmorFeet.xieSp3,
                        ArmorFeet.xieSp4,
                        ArmorFeet.xieSp5,
                        ArmorFeet.xieSp6,
                        ArmorFeet.xieSp7,
                        ArmorFeet.xieSp8,
                        ArmorFeet.zhanXie2,
                        ArmorFeet.zhanXie3,
                        ArmorFeet.zhanXie4,
                        ArmorFeet.zhanXie5,
                        ArmorFeet.zhanXie6,
                        ArmorFeet.zhanXie7,
                        ArmorFeet.zhanXie8,
                        ArmorFeet.gongXie2,
                        ArmorFeet.gongXie3,
                        ArmorFeet.gongXie4,
                        ArmorFeet.gongXie5,
                        ArmorFeet.gongXie6,
                        ArmorFeet.gongXie7,
                        ArmorFeet.gongXie8,
                        ArmorFeet.danXie2,
                        ArmorFeet.danXie3,
                        ArmorFeet.danXie4,
                        ArmorFeet.danXie5,
                        ArmorFeet.danXie6,
                        ArmorFeet.danXie7,
                        ArmorFeet.danXie8
                );


                case "weapon1" -> List.of(
                        Weapon.TAO_MU_JIAN,
                        Weapon.KAI_SHAN_DAO,
                        Weapon.JU_TONG_ZHAN_CHUI,
                        Weapon.PO_KONG_FU,
                        Weapon.SAN_BAO_YU_RU_YI,
                        Weapon.XUAN_YUAN,
                        Weapon.QIN_TONG_JIAN,
                        Weapon.JU_TONG_ZHAN_CHUI,
                        Weapon.TAI_JI_JIAN,
                        Weapon.KUN_LUN_FEI_XIAN_JIAN,
                        Weapon.TAI_E,
                        Weapon.YIN_YUE_QIANG,
                        Weapon.HONG_YIN_QIANG,
                        Weapon.YOU_LONG_QIANG,
                        Weapon.HU_TOU_ZHAN_JIN_QIANG,
                        Weapon.RU_YI_JIN_GU_BANG
                );

                case "weapon2" -> List.of(
                        Weapon.TENG_MU_GONG,
                        Weapon.QIN_TONG_GONG,
                        Weapon.YAN_TIE_GONG,
                        Weapon.ZHONG_CHUI_GONG,
                        Weapon.BEI_DOU_MIE_SHEN_GONG,
                        Weapon.ZHU_RI,
                        Weapon.HEI_TIE_NU,
                        Weapon.HONG_LIN_NU,
                        Weapon.JIAO_LONG_NU,
                        Weapon.RI_YUE_LIU_XING_NU,
                        Weapon.LIANG_YI,
                        Weapon.FU_RONG_GONG,
                        Weapon.HONG_LUAN_GONG,
                        Weapon.TIAN_QIONG_GONG,
                        Weapon.SHE_TIAN_ZHUI_YUE_GONG,
                        Weapon.LIU_GUANG
                );

                case "weapon3" -> List.of(
                        Weapon.HEI_TIE_GUO,
                        Weapon.QIN_TONG_GUO,
                        Weapon.LIAN_DAN_LU,
                        Weapon.SUO_HUN_LU,
                        Weapon.QI_SHA_DING,
                        Weapon.HUN_YUAN_SHEN_DING

                );

                case "shouhun" -> List.of(
                        Shipin.QING_LONG_SHENG_QI1,
                        Shipin.QING_LONG_SHENG_QI2,
                        Shipin.QING_LONG_SHENG_QI3,
                        Shipin.QING_LONG_SHENG_QI4,
                        Shipin.QING_LONG_SHENG_QI5,
                        Shipin.QING_LONG_SHENG_QI6,

                        Shipin.BAI_HU_SHENG_QI1,
                        Shipin.BAI_HU_SHENG_QI2,
                        Shipin.BAI_HU_SHENG_QI3,
                        Shipin.BAI_HU_SHENG_QI4,
                        Shipin.BAI_HU_SHENG_QI5,
                        Shipin.BAI_HU_SHENG_QI6,

                        Shipin.ZHU_QUE_SHENG_QI1,
                        Shipin.ZHU_QUE_SHENG_QI2,
                        Shipin.ZHU_QUE_SHENG_QI3,
                        Shipin.ZHU_QUE_SHENG_QI4,
                        Shipin.ZHU_QUE_SHENG_QI5,
                        Shipin.ZHU_QUE_SHENG_QI6,

                        Shipin.XUAN_WU_SHENG_QI1,
                        Shipin.XUAN_WU_SHENG_QI2,
                        Shipin.XUAN_WU_SHENG_QI3,
                        Shipin.XUAN_WU_SHENG_QI4,
                        Shipin.XUAN_WU_SHENG_QI5,
                        Shipin.XUAN_WU_SHENG_QI6
                );

                case "jiezhi1" -> List.of(
                        Shipin.PO_SUN_TAN_ZHI_JIE,
                        Shipin.TAN_YU_ZHI_JIE,
                        Shipin.TAN_LAN_DU_JIE,
                        Shipin.TAN_LAN_XIE_JIE,
                        Shipin.TAN_LAN_GUI_JIE,
                        Shipin.TAN_LAN_MO_JIE,
                        Shipin.TAN_LAN_MING_JIE,

                        Shipin.PO_SUN_CHEN_ZHI_JIE,
                        Shipin.CHEN_NU_ZHI_JIE,
                        Shipin.CHEN_HEN_DU_JIE,
                        Shipin.CHEN_HEN_XIE_JIE,
                        Shipin.CHEN_HEN_GUI_JIE,
                        Shipin.CHEN_HEN_MO_JIE,
                        Shipin.CHEN_HEN_MING_JIE,

                        Shipin.PO_SUN_CHI_ZHI_JIE,
                        Shipin.CHI_MI_ZHI_JIE,
                        Shipin.CHI_YU_DU_JIE,
                        Shipin.CHI_YU_XIE_JIE,
                        Shipin.CHI_YU_GUI_JIE,
                        Shipin.CHI_YU_MO_JIE,
                        Shipin.CHI_YU_MING_JIE
                );

                case "jiezhi2" -> List.of(
                        Shipin.CHAN_DING_FA_JIE,
                        Shipin.CHAN_DING_SHENG_JIE,
                        Shipin.CHAN_DING_FO_JIE,
                        Shipin.CHAN_DING_XIAN_JIE,
                        Shipin.CHAN_DING_SHEN_JIE,

                        Shipin.ZHI_HUI_FA_JIE,
                        Shipin.ZHI_HUI_SHENG_JIE,
                        Shipin.ZHI_HUI_FO_JIE,
                        Shipin.ZHI_HUI_XIAN_JIE,
                        Shipin.ZHI_HUI_SHEN_JIE,

                        Shipin.CHI_JIE_FA_JIE,
                        Shipin.CHI_JIE_SHENG_JIE,
                        Shipin.CHI_JIE_FO_JIE,
                        Shipin.CHI_JIE_XIAN_JIE,
                        Shipin.CHI_JIE_SHEN_JIE
                );

                case "xiantian" -> List.of(
                        Shipin.HUN_TIAN_LIN,
                        Shipin.TAI_CHU_SHEN_JIA,
                        Shipin.ZI_SHA_CHAN,
                        Shipin.FENG_HUO_LUN,
                        Shipin.JIU_TIAN_XUAN_YU,
                        Shipin.WEI_TUO_TIAN
                );

                case "monsterbow" -> List.of(
                        Bow.bow1,
                        Bow.bow2,
                        Bow.bow3,
                        Bow.bow4,
                        Bow.bow5,
                        Bow.bow6
                );

                case "yiqi" -> List.of(
                        YiQi.LAOZHANSHIDUNPAI,
                        YiQi.XINBINDUNPAI,
                        YiQi.JINRUIDUNPAI,
                        YiQi.CHISEYUEHUO,
                        YiQi.JINGANGBUHUAI,
                        YiQi.CHENBINLUOXUE,
                        YiQi.LAOLIEHUJIANDAI,
                        YiQi.XINBINJIANDAI,
                        YiQi.JINRUIJIANDAI,
                        YiQi.YINGYANJIANDAI,
                        YiQi.CANGGUNINGWANG,
                        YiQi.NIEPANYUNANG,
                        YiQi.FANGSHENDUANBI,
                        YiQi.TIEZHIDUANBI,
                        YiQi.HUIYIDAO,
                        YiQi.LONGYADAO,
                        YiQi.ZHANGQICUIZHU,
                        YiQi.MINGHONG
                );

                case "biweapon" -> List.of(
                        BiWeapon.FEIREN,
                        BiWeapon.JINRUIFEIREN,
                        BiWeapon.WUSHENGXIUJIAN,
                        BiWeapon.HUIXUANTAJI,
                        BiWeapon.WUYINWUZONG,
                        BiWeapon.YANWANGTIE,

                        BiWeapon.HEITIECHONG,
                        BiWeapon.HUANGTONGCHONG,
                        BiWeapon.MINGYUE,
                        BiWeapon.CANLAN,
                        BiWeapon.JINJING,
                        BiWeapon.XIAOTIAN,

                        BiWeapon.XIAO,
                        BiWeapon.QINFENGYINYIN,
                        BiWeapon.LIUSHUICHANCHAN,
                        BiWeapon.BUQICHUNYU,
                        BiWeapon.SANSHENGZHENHUN,
                        BiWeapon.JIUFENGLAIYI
                );

                case "fabao0" -> List.of(
                        Fabao.YAOWANGHULU,
                        Fabao.CIXINMIAOLIAN,
                        Fabao.YUNLANGBAN,
                        Fabao.YINYANGZHANLONGJIAN,
                        Fabao.XUANFENGZONGSHAN,
                        Fabao.SHENXINYUGU,
                        Fabao.ZHENHUNYUXIAO,
                        Fabao.DIKUIHUALAN,
                        Fabao.TAIJIBAGUA
                );


                case "fabao1" -> List.of(
                        Fabao.JUEDOULING,
                        Fabao.LEIMINGGU,
                        Fabao.HUANSILIN,
                        Fabao.NIUMONUHOU,
                        Fabao.DOUQISHI,
                        Fabao.PANGUANBI,
                        Fabao.MINSHENGJIAN,
                        Fabao.ZHENLEITIANCHUI
                );

                case "fabao2" -> List.of(
                        Fabao.DIAOHUNGAN,
                        Fabao.SHELINZHU,
                        Fabao.YUJINPIN,
                        Fabao.TIANJISHENJIN,
                        Fabao.RUIYINGYAN,
                        Fabao.DUOHUNTANG,
                        Fabao.MOYUANFOZHU,
                        Fabao.FUXINRUYI
                );

                case "fabao3" -> List.of(
                        Fabao.LVYEXIANZONG,
                        Fabao.QINGNVHANSHUANG,
                        Fabao.ZHURONGKUYAN,
                        Fabao.ZHUDIANXUANJING,
                        Fabao.BUHUNWANG,
                        Fabao.YANGSHOUJIAN,
                        Fabao.WUMINGMOYINLUO,
                        Fabao.SHETIANHUAXUELING,
                        Fabao.KUYELING,
                        Fabao.YUJINPIN,
                        Fabao.PINYUSHUIYU,
                        Fabao.DIKONGYUMOQUAN,
                        Fabao.LUANSHENGU,
                        Fabao.JINGULIAN,
                        Fabao.JIANCHANGULIN,
                        Fabao.MODUOHUNFAN
                );


                default -> List.of();
            };


//            ItemStack itemStack = switch (args[0]) {
//                case "神族证明" -> RaceProvince.shen;
//                case "仙族证明" -> RaceProvince.xian;
//                case "人族证明" -> RaceProvince.ren;
//                case "妖族证明" -> RaceProvince.yao;
//                case "战神族证明" -> RaceProvince.zhanShen;
//
//
//                case "铜钱" -> Money.tongQian;
//                case "金元宝" -> Money.jinYuanBao;
//                case "银票" -> Money.yinPiao;
//                case "钻石" -> Money.zuanShi;
//                case "神族钱" -> Money.MONEY_SHEN;
//                case "仙族钱" -> Money.MONEY_XIAN;
//                case "人族钱" -> Money.MONEY_REN;
//                case "妖族钱" -> Money.MONEY_YAO;
//                case "战神族钱" -> Money.MONEY_ZHANSHEN;
//
//
//                case "NPC泡泡" -> Other.NPC_PAOPAO;
//
//
//                case "包子" -> Food.baoZi;
//                case "烤地瓜" -> Food.kaoDiGua;
//                case "喜饼" -> Food.xiBing;
//                case "佛跳墙" -> Food.foTiaoQiang;
//                case "烤鱼" -> Food.kaoYu;
//                case "烤鲑鱼" -> Food.kaoGuiYu;
//                case "烤鸡" -> Food.kaoJi;
//                case "牛排" -> Food.niuPai;
//                case "猪排" -> Food.zhuPai;
//                case "羊腿" -> Food.yangTui;
//                case "兔肉" -> Food.tuRou;
//                case "粽子" -> Food.zongZi;
//                case "月饼" -> Food.yueBin;
//                case "苹果" -> Food.pinGuo;
//
//
//                case "金元素" -> YuanSu.jin;
//                case "木元素" -> YuanSu.mu;
//                case "火元素" -> YuanSu.huo;
//                case "水元素" -> YuanSu.shui;
//                case "土元素" -> YuanSu.tu;
//                case "浓缩金元素" -> YuanSu.concentrated_jin;
//                case "浓缩木元素" -> YuanSu.concentrated_mu;
//                case "浓缩火元素" -> YuanSu.concentrated_huo;
//                case "浓缩水元素" -> YuanSu.concentrated_shui;
//                case "浓缩土元素" -> YuanSu.concentrated_tu;
//                case "精炼金元素" -> YuanSu.refined_jin;
//                case "精炼木元素" -> YuanSu.refined_mu;
//                case "精炼火元素" -> YuanSu.refined_huo;
//                case "精炼水元素" -> YuanSu.refined_shui;
//                case "精炼土元素" -> YuanSu.refined_tu;
//                case "袋装金元素" -> YuanSu.bagging_jin;
//                case "袋装木元素" -> YuanSu.bagging_mu;
//                case "袋装火元素" -> YuanSu.bagging_huo;
//                case "袋装水元素" -> YuanSu.bagging_shui;
//                case "袋装土元素" -> YuanSu.bagging_tu;
//
//
//                case "初级药引" -> Dan.YAOYIN1;
//                case "中级药引" -> Dan.YAOYIN2;
//                case "高级药引" -> Dan.YAOYIN3;
//                case "究级药引" -> Dan.YAOYIN4;
//                case "枸杞" -> Herb.GouQi;
//                case "人参" -> Herb.RenShen;
//                case "灵芝" -> Herb.LingZhi;
//                case "何首乌" -> Herb.HeShouWu;
//                case "珍珠" -> Herb.ZhenZhu;
//                case "河豚" -> Herb.HeTun;
//                case "鹿茸" -> Herb.LuRong;
//
//
//
//                case "经验1" -> XP.XP_10;
//                case "经验2" -> XP.XP_20;
//                case "经验5" -> XP.XP_50;
//                case "经验10" -> XP.XP_100;
//                case "经验20" -> XP.XP_200;
//                case "经验50" -> XP.XP_500;
//
//
//                case "重生石" -> Other.CHONG_SHENG_STONE;
//
//
//                case "碧石碎" -> Ingredient.BI_SHI_SUI;
//                case "赤铜锭" -> Ingredient.CHI_TONG_DING;
//                case "玄铁锭" -> Ingredient.XUAN_TIE_DING;
//                case "灵玉简" -> Ingredient.LING_YU_JIAN;
//                case "神造铁" -> Ingredient.SHEN_ZAO_TIE;
//                case "七彩仙玉" -> Ingredient.QI_CAI_XIAN_YU;
//
//
//                case "獒狼皮" -> Ingredient.AO_LANG_PI;
//                case "芭蕉叶" -> Ingredient.BA_JIAO_YE;
//                case "流音绸" -> Ingredient.LIU_YIN_CHOU;
//                case "涅槃羽" -> Ingredient.NIE_PAN_YU;
//                case "皇图神裘" -> Ingredient.HUANG_TU_SHEN_QIU;
//                case "炎鬼织锦" -> Ingredient.YAN_GUI_ZHI_JIN;
//                case "流光灵绢" -> Ingredient.LIU_GUANG_LIN_JUAN;
//                case "鸣泪幽纱" -> Ingredient.MING_LEI_YOU_SHA;
//
//                case "白蛇鳞" -> Ingredient.BAI_SHE_LIN;
//                case "枯朽骨" -> Ingredient.KU_XIU_GU;
//                case "黄铜矿" -> Ingredient.HUANG_TONG_KUANG;
//                case "毒蛛牙" -> Ingredient.DU_ZHU_YA;
//
//                case "熔岩砂" -> Ingredient.RONG_YAN_SHA;
//                case "炎阳花" -> Ingredient.YAN_YANG_HUA;
//                case "鬼幽火" -> Ingredient.GUI_YOU_HUO;
//                case "炽砂沫" -> Ingredient.CHI_SHA_MO;
//
//                case "琉洛珠" -> Ingredient.LIU_LUO_ZHU;
//                case "天枢石" -> Ingredient.TIAN_SHU_SHI;
//                case "玉衡石" -> Ingredient.YU_HENG_SHI;
//                case "熔炼石" -> Ingredient.RONG_LIAN_SHI;
//
//                case "沉水铁" -> Ingredient.CHEN_SHUI_TIE;
//                case "激浪螺" -> Ingredient.JI_LANG_LUO;
//                case "冥海晶" -> Ingredient.MING_HAI_JIN;
//                case "碧波镜" -> Ingredient.BI_BO_JING;
//
//                case "七彩晶" -> Ingredient.QI_CAI_JIN;
//                case "挽月银" -> Ingredient.WAN_YUE_YIN;
//                case "千炼玉" -> Ingredient.QIAN_NIAN_YU;
//
//
//
//
//
//
//
//                default -> new ItemStack(Material.AIR);
//            };

            Inventory inventory = player.getInventory();
            itemStacks.forEach(inventory::addItem);


        }
        return true;
    }
}
