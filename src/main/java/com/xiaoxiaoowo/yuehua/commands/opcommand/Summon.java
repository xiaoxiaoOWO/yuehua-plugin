package com.xiaoxiaoowo.yuehua.commands.opcommand;

import com.xiaoxiaoowo.yuehua.entity.monster.east.boss.JIANXIGUIMEI;
import com.xiaoxiaoowo.yuehua.entity.monster.east.boss.LinYouDuZhu;
import com.xiaoxiaoowo.yuehua.entity.monster.east.normal.DuFeng;
import com.xiaoxiaoowo.yuehua.entity.monster.east.normal.KuGuGongJianShou;
import com.xiaoxiaoowo.yuehua.entity.monster.east.special.YaoJingPanda;
import com.xiaoxiaoowo.yuehua.entity.monster.other.*;
import com.xiaoxiaoowo.yuehua.entity.npc.dz.*;
import com.xiaoxiaoowo.yuehua.entity.npc.east.*;
import com.xiaoxiaoowo.yuehua.entity.npc.food.*;
import com.xiaoxiaoowo.yuehua.entity.npc.fulin.FuLingTaiYi;
import com.xiaoxiaoowo.yuehua.entity.npc.fulin.KEHUASHI1;
import com.xiaoxiaoowo.yuehua.entity.npc.fulin.KEHUASHI2;
import com.xiaoxiaoowo.yuehua.entity.npc.fulin.KEHUASHI3;
import com.xiaoxiaoowo.yuehua.entity.npc.middle.*;
import com.xiaoxiaoowo.yuehua.entity.npc.qiansigu.DAN;
import com.xiaoxiaoowo.yuehua.entity.npc.qiansigu.ZHANGGUI;
import com.xiaoxiaoowo.yuehua.entity.npc.tea.CHUYIYE;
import com.xiaoxiaoowo.yuehua.entity.npc.tea.TINGZHI;
import com.xiaoxiaoowo.yuehua.entity.npc.tea.XIAOER;
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
            case "钱庄龙须" -> EastQianZhuang.spawn();
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
            case "织布" ->ZHIBUFANG.spawn();
            case "千丝1" -> DAN.spawn();
            case "千丝2" -> ZHANGGUI.spawn();
            case "美食家" -> MEISHIJIA.spawn();
            case "茶馆小儿" -> XIAOER.spawn();
            case "听之" -> TINGZHI.spawn();
            case "楚一叶" -> CHUYIYE.spawn();

        }
        return true;
    }
}
