package com.xiaoxiaoowo.yuehua.commands.opcommand;

import com.xiaoxiaoowo.yuehua.entity.monster.east.boss.JIANXIGUIMEI;
import com.xiaoxiaoowo.yuehua.entity.monster.east.boss.LinYouDuZhu;
import com.xiaoxiaoowo.yuehua.entity.monster.east.normal.DuFeng;
import com.xiaoxiaoowo.yuehua.entity.monster.east.normal.KuGuGongJianShou;
import com.xiaoxiaoowo.yuehua.entity.monster.east.special.YaoJingPanda;
import com.xiaoxiaoowo.yuehua.entity.monster.other.*;
import com.xiaoxiaoowo.yuehua.entity.npc.chat.east.*;
import com.xiaoxiaoowo.yuehua.entity.npc.chat.middle.*;
import com.xiaoxiaoowo.yuehua.entity.npc.chat.middlechat.*;
import com.xiaoxiaoowo.yuehua.entity.npc.chat.north.*;
import com.xiaoxiaoowo.yuehua.entity.npc.chat.penglai.*;
import com.xiaoxiaoowo.yuehua.entity.npc.chat.qiansi.*;
import com.xiaoxiaoowo.yuehua.entity.npc.chat.ren.*;
import com.xiaoxiaoowo.yuehua.entity.npc.chat.shen.*;
import com.xiaoxiaoowo.yuehua.entity.npc.chat.south.*;
import com.xiaoxiaoowo.yuehua.entity.npc.chat.start.*;
import com.xiaoxiaoowo.yuehua.entity.npc.chat.west.*;
import com.xiaoxiaoowo.yuehua.entity.npc.chat.xian.*;
import com.xiaoxiaoowo.yuehua.entity.npc.chat.yao.*;
import com.xiaoxiaoowo.yuehua.entity.npc.chat.zhanshen.*;
import com.xiaoxiaoowo.yuehua.entity.npc.dz.*;
import com.xiaoxiaoowo.yuehua.entity.npc.east.*;
import com.xiaoxiaoowo.yuehua.entity.npc.food.*;
import com.xiaoxiaoowo.yuehua.entity.npc.fulin.FuLingTaiYi;
import com.xiaoxiaoowo.yuehua.entity.npc.fulin.KEHUASHI1;
import com.xiaoxiaoowo.yuehua.entity.npc.fulin.KEHUASHI2;
import com.xiaoxiaoowo.yuehua.entity.npc.fulin.KEHUASHI3;
import com.xiaoxiaoowo.yuehua.entity.npc.middle.*;
import com.xiaoxiaoowo.yuehua.entity.npc.mission.*;
import com.xiaoxiaoowo.yuehua.entity.npc.north.BaiGuJing;
import com.xiaoxiaoowo.yuehua.entity.npc.north.NorthIngre;
import com.xiaoxiaoowo.yuehua.entity.npc.north.PengLaiShangRen;
import com.xiaoxiaoowo.yuehua.entity.npc.penglai.TaiShangLaoJun;
import com.xiaoxiaoowo.yuehua.entity.npc.penglai.YaoHide;
import com.xiaoxiaoowo.yuehua.entity.npc.qiansigu.DAN;
import com.xiaoxiaoowo.yuehua.entity.npc.qiansigu.ZHANGGUI;
import com.xiaoxiaoowo.yuehua.entity.npc.south.*;
import com.xiaoxiaoowo.yuehua.entity.npc.tea.CHUYIYE;
import com.xiaoxiaoowo.yuehua.entity.npc.tea.TINGZHI;
import com.xiaoxiaoowo.yuehua.entity.npc.tea.XIAOER;
import com.xiaoxiaoowo.yuehua.entity.npc.west.ChenDaiFu;
import com.xiaoxiaoowo.yuehua.entity.npc.west.LaoZhe;
import com.xiaoxiaoowo.yuehua.entity.npc.west.WestIngre;
import com.xiaoxiaoowo.yuehua.entity.npc.west.YuZhu;
import com.xiaoxiaoowo.yuehua.entity.npc.yushi.*;
import com.xiaoxiaoowo.yuehua.entity.other.Pig;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public final class Summon implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        if (!player.isOp()) {
            player.sendMessage(
                    Component.text("§6[命令系统]§4你没有权限使用这个命令")
            );
            return true;
        }
        if (args.length == 0) {
            player.sendMessage(
                    Component.text("§6[命令系统]§4参数错误")
            );
            return true;
        }
        Location location = player.getLocation();
        switch (args[0]) {
            case "supply3" -> Supply3.spawn();

            case "zhan1" -> Zhan1.spawn();
            case "zhan2" -> Zhan2.spawn();
            case "zhan3" -> Zhan3.spawn();
            case "zhan4" -> Zhan4.spawn();
            case "zhan5" -> Zhan5.spawn();
            case "zhan6" -> Zhan6.spawn();
            case "zhan7" -> Zhan7.spawn();
            case "zhan8" -> Zhan8.spawn();
            case "zhan9" -> Zhan9.spawn();
            case "zhan10" -> Zhan10.spawn();
            case "zhan11" -> Zhan11.spawn();
            case "zhan12" -> Zhan12.spawn();
            case "zhan13" -> Zhan13.spawn();
            case "zhanmain1" -> Zhanmain1.spawn();
            case "zhanmain2" -> Zhanmain2.spawn();
            case "zhanmain3" -> Zhanmain3.spawn();
            case "zhanmain4" -> Zhanmain4.spawn();
            case "zhantong1" -> ZhanTong1.spawn();
            case "zhanTong2" -> ZhanTong2.spawn();
            case "zhanTong3" -> ZhanTong3.spawn();
            case "zhanTong4" -> ZhanTong4.spawn();
            case "zhanTong5" -> ZhanTong5.spawn();
            case "zhanTong6" -> ZhanTong6.spawn();
            case "zhanTong7" -> ZhanTong7.spawn();

            case "se2" -> Se2.spawn();
            case "sh1" -> Sh1.spawn();

            case "shen1" -> Shen1.spawn();
            case "shen2" -> Shen2.spawn();
            case "shen3" -> Shen3.spawn();
            case "shen4" -> Shen4.spawn();
            case "shen5" -> Shen5.spawn();
            case "shen6" -> Shen6.spawn();
            case "shen7" -> Shen7.spawn();
            case "shen8" -> Shen8.spawn();

            case "shenmain1" -> Shenmain1.spawn();
            case "shenmain2" -> Shenmain2.spawn();
            case "shenmain3" -> Shenmain3.spawn();
            case "shenmain4" -> Shenmain4.spawn();

            case "shentong1" -> ShenTong1.spawn();
            case "shentong2" -> ShenTong2.spawn();
            case "shentong3" -> ShenTong3.spawn();
            case "shentong4" -> ShenTong4.spawn();
            case "shentong5" -> ShenTong5.spawn();
            case "shentong6" -> ShenTong6.spawn();
            case "shentong7" -> ShenTong7.spawn();

            case "supply0" -> Supply0.spawn();
            case "zh2" -> Zh2.spawn();


            case "yao1" -> Yao1.spawn();
            case "yao2" -> Yao2.spawn();
            case "yao3" -> Yao3.spawn();
            case "yao4" -> Yao4.spawn();
            case "yao5" -> Yao5.spawn();
            case "yao6" -> Yao6.spawn();
            case "yao7" -> Yao7.spawn();
            case "yao8" -> Yao8.spawn();
            case "yao9" -> Yao9.spawn();
            case "yao10" -> Yao10.spawn();

            case "yaomain1" -> YaoMain1.spawn();
            case "yaomain2" -> YaoMain2.spawn();
            case "yaomain3" -> YaoMain3.spawn();
            case "yaomain4" -> YaoMain4.spawn();
            case "yaomain5" -> YaoMain5.spawn();

            case "tong20" -> Tong20.spawn();
            case "supply1" -> Supply1.spawn();

            case "yaotong1" -> YaoTong1.spawn();
            case "yaotong2" -> YaoTong2.spawn();
            case "yaotong3" -> YaoTong3.spawn();
            case "yaotong4" -> YaoTong4.spawn();
            case "yaotong5" -> YaoTong5.spawn();
            case "yaotong6" -> YaoTong6.spawn();
            case "yaotong7" -> YaoTong7.spawn();


            case "太上老君" -> TaiShangLaoJun.spawn();
            case "妖族隐藏" -> YaoHide.spawn();
            case "王员外" -> WangYuanWai.spawn();
            case "纂元真人" -> ZuanYuanZhenRen.spawn();
            case "温泉客栈" -> WenQuanKeZhan.spawn();

            case "陈大夫" -> ChenDaiFu.spawn();
            case "深山老者" -> LaoZhe.spawn();
            case "雨竹" -> YuZhu.spawn();

            case "蓬莱商人" -> PengLaiShangRen.spawn();

            case "ren1" -> Ren1.spawn();
            case "ren2" -> Ren2.spawn();
            case "ren3" -> Ren3.spawn();
            case "ren4" -> Ren4.spawn();
            case "ren5" -> Ren5.spawn();
            case "ren6" -> Ren6.spawn();
            case "ren7" -> Ren7.spawn();
            case "ren8" -> Ren8.spawn();
            case "ren9" -> Ren9.spawn();
            case "ren10" -> Ren10.spawn();
            case "ren11" -> Ren11.spawn();
            case "ren12" -> Ren12.spawn();
            case "ren13" -> Ren13.spawn();

            case "renm1" -> Renmain1.spawn();
            case "renm2" -> Renmain2.spawn();
            case "renm3" -> Renmain3.spawn();
            case "renm4" -> Renmain4.spawn();

            case "rentong1" -> RenTong1.spawn();
            case "rentong2" -> RenTong2.spawn();
            case "rentong3" -> RenTong3.spawn();
            case "rentong4" -> RenTong4.spawn();
            case "rentong5" -> RenTong5.spawn();
            case "rentong6" -> RenTong6.spawn();
            case "rentong7" -> RenTong7.spawn();

            case "rh1" -> Rh1.spawn();

            case "supply4" -> Supply4.spawn();

            case "守山人" -> ShouShanRen.spawn();

            case "mainxx" -> Mainxx.spawn();
            case "penglai1" -> Penglai1.spawn();
            case "penglai2" -> Penglai2.spawn();
            case "penglai3" -> Penglai3.spawn();
            case "penglai4" -> Penglai4.spawn();
            case "penglai5" -> Penglai5.spawn();
            case "penglai6" -> Penglai6.spawn();

            case "se1" -> Se1.spawn();
            case "yh5" -> Yh5.spawn();
            case "te32" -> Te32.spawn();

            case "shenmain6" -> Shenmain6.spawn();
            case "yaomain8" -> Yaomain8.spawn();
            case "zhanmain8" -> Zhanmain8.spawn();

            case "north1" -> North1.spawn();
            case "north2" -> North2.spawn();
            case "north3" -> North3.spawn();

            case "northm1" -> Northm1.spawn();
            case "northm2" -> Northm2.spawn();

            case "te2" -> Te2.spawn();
            case "te18" -> Te18.spawn();
            case "xh5" -> Xh5.spawn();

            case "白骨精" -> BaiGuJing.spawn();

            case "west1" -> West1.spawn();
            case "west3" -> West3.spawn();
            case "westm1" -> Westm1.spawn();
            case "westm2" -> Westm2.spawn();

            case "rh4" -> Rh4.spawn();
            case "te4" -> Te4.spawn();
            case "xe2" -> Xe2.spawn();
            case "yaomain6" -> Yaomain6.spawn();
            case "yaomain7" -> Yaomain7.spawn();


            case "qiansi1" -> Qiansi1.spawn();
            case "qiansi2" -> Qiansi2.spawn();
            case "qiansi3" -> Qiansi3.spawn();
            case "qiansi4" -> Qiansi4.spawn();
            case "qiansi5" -> Qiansi5.spawn();
            case "qiansi6" -> Qiansi6.spawn();
            case "qiansi7" -> Qiansi7.spawn();
            case "qiansi8" -> Qiansi8.spawn();
            case "qiansi9" -> Qiansi9.spawn();
            case "qiansi10" -> Qiansi10.spawn();
            case "qiansi11" -> Qiansi11.spawn();
            case "qiansi12" -> Qiansi12.spawn();
            case "qiansi13" -> Qiansi13.spawn();
            case "qiansi14" -> Qiansi14.spawn();
            case "qiansi15" -> Qiansi15.spawn();
            case "qiansi16" -> Qiansi16.spawn();

            case "se4" -> Se4.spawn();
            case "te33" -> Te33.spawn();
            case "zh3" -> Zh3.spawn();
            case "zh4" -> Zh4.spawn();


            case "leading0" -> Leading0.spawn();
            case "leading1" -> Leading1.spawn();
            case "leading2" -> Leading2.spawn();
            case "leading3" -> Leading3.spawn();
            case "leading4" -> Leading4.spawn();

            case "south1" -> South1.spawn();
            case "south2" -> South2.spawn();
            case "south3" -> South3.spawn();
            case "south4" -> South4.spawn();

            case "southm1" -> Southm1.spawn();
            case "southm2" -> Southm2.spawn();
            case "southm3" -> Southm3.spawn();
            case "southm4" -> Southm4.spawn();

            case "se3" -> Se3.spawn();
            case "sh4" -> Sh4.spawn();

            case "te22" -> Te22.spawn();
            case "tezhan2" -> Tezhan2.spawn();
            case "tezhan3" -> Tezhan3.spawn();

            case "ye2" -> Ye2.spawn();
            case "ze1" -> Ze1.spawn();
            case "zhuque" -> ZhuQueFenHun.spawn();

            case "east1" -> East1.spawn();
            case "east2" -> East2.spawn();
            case "east3" -> East3.spawn();
            case "east5" -> East5.spawn();
            case "qinglongfenhun" -> Maindragon.spawn();
            case "re1" -> Re1.spawn();
            case "re2" -> Re2.spawn();
            case "renmain6" -> Renmain6.spawn();
            case "xianmain6" -> Xianmain6.spawn();
            case "zhanmain6" -> Zhanmain6.spawn();
            case "zhanmain7" -> Zhanmain7.spawn();


            case "middle1" -> Middle1.spawn();
            case "middle2" -> Middle2.spawn();
            case "middle3" -> Middle3.spawn();
            case "middle4" -> Middle4.spawn();
            case "middle5" -> Middle5.spawn();
            case "middle6" -> Middle6.spawn();
            case "middle7" -> Middle7.spawn();
            case "middle8" -> Middle8.spawn();
            case "middle9" -> Middle9.spawn();
            case "middle10" -> Middle10.spawn();
            case "middle11" -> Middle11.spawn();
            case "middle12" -> Middle12.spawn();
            case "middle13" -> Middle13.spawn();
            case "middle14" -> Middle14.spawn();
            case "middle15" -> Middle15.spawn();
            case "middle16" -> Middle16.spawn();
            case "middle17" -> Middle17.spawn();
            case "middle18" -> Middle18.spawn();
            case "middle19" -> Middle19.spawn();
            case "middle20" -> Middle20.spawn();
            case "middle21" -> Middle21.spawn();
            case "middle22" -> Middle22.spawn();
            case "middle23" -> Middle23.spawn();
            case "middle24" -> Middle24.spawn();
            case "middle25" -> Middle25.spawn();
            case "middle26" -> Middle26.spawn();
            case "middle27" -> Middle27.spawn();
            case "middle28" -> Middle28.spawn();
            case "middle29" -> Middle29.spawn();
            case "middle30" -> Middle30.spawn();
            case "middle31" -> Middle31.spawn();
            case "middle32" -> Middle32.spawn();
            case "middle33" -> Middle33.spawn();
            case "middle34" -> Middle34.spawn();
            case "middle35" -> Middle35.spawn();
            case "middle36" -> Middle36.spawn();
            case "middle37" -> Middle37.spawn();
            case "middle38" -> Middle38.spawn();
            case "middle39" -> Middle39.spawn();
            case "middle40" -> Middle40.spawn();
            case "middle41" -> Middle41.spawn();
            case "middle42" -> Middle42.spawn();
            case "middle43" -> Middle43.spawn();
            case "middle44" -> Middle44.spawn();
            case "middle45" -> Middle45.spawn();
            case "middle46" -> Middle46.spawn();
            case "middle47" -> Middle47.spawn();
            case "middle48" -> Middle48.spawn();
            case "middle49" -> Middle49.spawn();
            case "middle50" -> Middle50.spawn();
            case "middle51" -> Middle51.spawn();
            case "middle52" -> Middle52.spawn();
            case "middle53" -> Middle53.spawn();
            case "middle54" -> Middle54.spawn();
            case "middle55" -> Middle55.spawn();
            case "middle56" -> Middle56.spawn();
            case "middle57" -> Middle57.spawn();
            case "middle58" -> Middle58.spawn();
            case "middle59" -> Middle59.spawn();
            case "middle61" -> Middle61.spawn();
            case "middle62" -> Middle62.spawn();
            case "middle63" -> Middle63.spawn();
            case "middle64" -> Middle64.spawn();
            case "middle65" -> Middle65.spawn();
            case "middle66" -> Middle66.spawn();
            case "middle67" -> Middle67.spawn();
            case "middle68" -> Middle68.spawn();
            case "middle69" -> Middle69.spawn();
            case "middle70" -> Middle70.spawn();
            case "middle71" -> Middle71.spawn();
            case "middle72" -> Middle72.spawn();
            case "middle73" -> Middle73.spawn();


            case "钱庄老板" -> QianZhuang.spawn();
            case "人偶" -> Renou.spawn();
            case "潇潇" -> Renou2.spawn();
            case "小猪猪" -> Pig.spawn(location);
            case "织女" -> ZHINV.spawn();
            case "水果贩" -> SHUIGUOFAN.spawn();
            case "海鲜贩" -> HAIXIANFAN.spawn();
            case "素食贩" -> SUSHIFAN.spawn();
            case "荤菜贩" -> HUNCAIFAN.spawn();
            case "瑶池金母" -> Yaochijinmu.spawn();
            case "极寒修士" -> Bingshuangshi.spawn();
            case "瞭望修士" -> Cuilvshi.spawn();
            case "沉思修士" -> Dianlanshi.spawn();
            case "搏斗修士" -> Xueseshi.spawn();
            case "望月修士" -> Hongyueshi.spawn();
            case "斋戒修士" -> Houtushi.spawn();
            case "多财修士" -> Jinhuangshi.spawn();
            case "隐居修士" -> Miyinshi.spawn();
            case "湮灭修士" -> Suiyanshi.spawn();
            case "宰割修士" -> Tulushi.spawn();
            case "酷热修士" -> Yanyangshi.spawn();
            case "繁花修士" -> Yulushi.spawn();
            case "奢华修士" -> Zijinshi.spawn();
            case "太一" -> FuLingTaiYi.spawn();
            case "初级刻画师" -> KEHUASHI1.spawn();
            case "中级刻画师" -> KEHUASHI2.spawn();
            case "高级刻画师" -> KEHUASHI3.spawn();
            case "铁匠铺掌柜" -> TIEJIANGPU.spawn();
            case "明珠堂堂主" -> MINGZHUTANG.spawn();
            case "妙法阁阁主" -> MIAOFAGE.spawn();
            case "异宝楼楼主" -> YIBAOLOU.spawn();
            case "头盔核心" -> ArmorHead.spawn();
            case "胸甲核心" -> ArmorChest.spawn();
            case "护腿核心" -> ArmorLeg.spawn();
            case "鞋子核心" -> ArmorFeet.spawn();
            case "战士武器核心" -> ZhanWeapon.spawn();
            case "弓箭武器核心" -> GongWeapon.spawn();
            case "炼丹武器核心" -> DanWeapon.spawn();
            case "副武器核心" -> BiWeapon.spawn();
            case "初级法宝核心" -> Fabao1.spawn();
            case "中级法宝核心" -> Fabao2.spawn();
            case "高级法宝核心" -> Fabao3.spawn();
            case "毒饰品核心" -> DUShipin.spawn();
            case "学饰品核心" -> XUESHIPIN.spawn();
            case "异器核心" -> Yiqi.spawn();
            case "元素精炼师" -> Ys1.spawn();
            case "元素浓缩师" -> Ys2.spawn();
            case "元素装袋师" -> Ys3.spawn();
            case "南北杂货" -> ZAHUO.spawn();
            case "卜命师" -> BUMINSHI.spawn();
            case "僵尸" -> TemplateMonster.spawn(location);
            case "射手" -> TemplateShooter.spawn(location);
            case "伏龙" -> Renou3.spawn();
            case "炼丹房掌柜" -> LIANDANZHANGGUI.spawn();
            case "元素置换员" -> YuanSuZhiHuanYuan.spawn();
            case "草药收藏家" -> CAOYAOSHOUCANGJIA.spawn();
            case "炼丹房小二" -> LIANDANFANGXIAOER.spawn();
            case "收购1" -> MoneyLootBuy.spawn();
            case "收购2" -> MoneLootBuy2.spawn();
            case "收购3" -> MoneyLootBuy3.spawn();
            case "锻造收购" -> IngredientBuy.spawn();
            case "龙须钱庄" -> EastQianZhuang.spawn();
            case "龙须杂货" -> EastZaHuoFanMai.spawn();
            case "龙须丹药" -> EastDanYaoFanMai.spawn();
            case "龙须收购" -> EastZaHuoShougou.spawn();
            case "南方丹药" -> SouthDan.spawn();
            case "南方材料" -> SouthIngre.spawn();
            case "南方战利品" -> SouthLoot.spawn();
            case "南方钱庄" -> SouthMoney.spawn();
            case "南方杂货" -> SouthSell.spawn();

            case "西方材料" -> WestIngre.spawn();
            case "北方材料" -> NorthIngre.spawn();

            case "东方材料收购" -> EastIngerBue.spawn();
            case "山神庙" -> SHANSHENMIAO.spawn();
            case "神木妖精" -> SHENMUYAOJIN.spawn();
            case "枯骨弓箭手" -> KuGuGongJianShou.spawn(player.getLocation());
            case "毒蜂" -> DuFeng.spawn(player.getLocation());
            case "熊猫" -> YaoJingPanda.spawn(player.getLocation());
            case "溺亡" -> JIANXIGUIMEI.spawn(player.getLocation());
            case "毒蛛" -> LinYouDuZhu.spawn(player.getLocation());
            case "老者" -> LaoLieHu.spawn();
            case "元素回收员" -> YuanSuHuiShou.spawn();
            case "织布" -> ZHIBUFANG.spawn();
            case "千丝1" -> DAN.spawn();
            case "千丝2" -> ZHANGGUI.spawn();
            case "美食家" -> MEISHIJIA.spawn();
            case "茶馆小儿" -> XIAOER.spawn();
            case "听之" -> TINGZHI.spawn();
            case "楚一叶" -> CHUYIYE.spawn();
            case "忠烈" -> ZHONGLIECI.spawn();
            case "神引路" -> ShenYinluRen.spawn();
            case "仙引路" -> XianYinLuRen.spawn();
            case "人引路" -> RenYinLuRen.spawn();
            case "妖引路" -> YaoYinLuRen.spawn();
            case "战神引路" -> ZhanYinLuRen.spawn();

            case "xian1" -> Xian1.spawn();
            case "xian2" -> Xian2.spawn();
            case "xian3" -> Xian3.spawn();
            case "xian4" -> Xian4.spawn();
            case "xian5" -> Xian5.spawn();
            case "xian6" -> Xian6.spawn();
            case "xian7" -> Xian7.spawn();
            case "xian8" -> Xian8.spawn();
            case "xian9" -> Xian9.spawn();
            case "xian10" -> Xian10.spawn();

            case "xianmain1" -> XianMain1.spawn();
            case "xianmain2" -> XianMain2.spawn();
            case "xianmain3" -> XianMain3.spawn();
            case "xianmain4" -> XianMain4.spawn();

            case "xe1" -> Xe1.spawn();
            case "xh1" -> Xh1.spawn();
            case "xh2" -> Xh2.spawn();
            case "xh3" -> Xh3.spawn();

            case "xiantong1" -> XianTong1.spawn();
            case "xiantong2" -> XianTong2.spawn();
            case "xiantong3" -> XianTong3.spawn();
            case "xiantong4" -> XianTong4.spawn();
            case "xiantong5" -> XianTong5.spawn();
            case "xiantong6" -> XianTong6.spawn();
            case "xiantong7" -> XianTong7.spawn();

            case "supply2" -> Supply2.spawn();

            case "jianyi1" -> ExSword1.spawn();
            case "jianyi2" -> ExSword2.spawn();

            case "ligonggong" -> LiGongGong.spawn();
            case "fenghua" -> FengHuaLou.spawn();
            case "mainx" -> Mainx.spawn();
            case "renhuang" -> RenHuang.spawn();
            case "shiri" -> ShiRi.spawn();
            case "yaotong" -> YaoTong.spawn();
            case "yuluo" -> YuLuo.spawn();
            case "ze2" -> Ze2.spawn();
            case "ze3" -> Ze3.spawn();

        }
        return true;
    }
}
