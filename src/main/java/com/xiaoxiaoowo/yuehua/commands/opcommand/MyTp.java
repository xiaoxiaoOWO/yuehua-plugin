package com.xiaoxiaoowo.yuehua.commands.opcommand;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static com.xiaoxiaoowo.yuehua.utils.LocationSet.*;

public final class MyTp implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
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
        }

        switch (args[0]) {
            case "森林入口" -> player.teleport(SEN_LIN_RU_KOU);
            case "龙须镇" -> player.teleport(LONG_XU_ZHEN);
            case "女王祭坛" -> player.teleport(NU_WANG_JI_TAN);
            case "始皇入口" -> player.teleport(SHI_HUANG_RU_KOU);
            case "兔子仙境" -> player.teleport(TU_ZI_XIAN_JING);
            case "山神庙" -> player.teleport(SHAN_SHEN_MIAO);
            case "神木妖精" -> player.teleport(SHEN_MU_YAO_JING);
            case "废弃村庄" -> player.teleport(FEI_QI_CUN_ZHUANG);
            case "公孙小少爷" -> player.teleport(GONG_SUN_XIAO_SHAO_YE);
            case "王员外" -> player.teleport(WANG_YUAN_WAI);
            case "温泉客栈" -> player.teleport(WEN_QUAN_KE_ZHAN);
            case "沙漠客栈" -> player.teleport(SHA_MO_KE_ZHAN);
            case "火魔入口" -> player.teleport(HUO_MO_RU_KOU);
            case "沙漠村庄" -> player.teleport(SHA_MO_CUN_ZHUANG);
            case "马贼窝" -> player.teleport(MA_ZEI_WO);
            case "沙漠石碑" -> player.teleport(SHA_MO_SHI_BEI);
            case "沙漠废弃村庄" -> player.teleport(SHA_MO_FEI_QI_CUN_ZHUANG);
            case "朱雀入口" -> player.teleport(ZHU_QUE_RU_KOU);
            case "欢乐果园" -> player.teleport(HUAN_LE_GUO_YUAN);
            case "陈大夫" -> player.teleport(CHEN_DA_FU);
            case "山洞村庄" -> player.teleport(SHAN_DONG_CUN_ZHUANG);
            case "山洞水池" -> player.teleport(SHAN_DONG_SHUI_CHI);
            case "白虎入口" -> player.teleport(BAI_HU_RU_KOU);
            case "大世界镇妖塔" -> player.teleport(DA_SHI_JIE_ZHEN_YAO_TA);
            case "雨竹" -> player.teleport(YU_ZHU);
            case "哭谷入口" -> player.teleport(KU_GU_RU_KOU);
            case "水族村庄" -> player.teleport(SHUI_ZU_CUN_ZHUANG);
            case "李大夫" -> player.teleport(LI_DA_FU);
            case "白骨精" -> player.teleport(BAI_GU_JING);
            case "玄武入口" -> player.teleport(XUAN_WU_RU_KOU);
            case "蓬莱渡口" -> player.teleport(PENG_LAI_DU_KOU);
            case "圣山入口" -> player.teleport(SHENG_SHAN_RU_KOU);
            case "假盘入口" -> player.teleport(JIA_PAN_RU_KOU);
            case "皇城中心" -> player.teleport(HUANG_CHENG_ZHONG_XIN);
            case "皇宫" -> player.teleport(HUANG_GONG);
            case "炼丹房" -> player.teleport(LIAN_DAN_FANG);
            case "炼丹室" -> player.teleport(LIAN_DAN_SHI);
            case "铁匠铺" -> player.teleport(TIE_JIANG_PU);
            case "风华楼" -> player.teleport(FENG_HUA_LOU);
            case "皇城东门" -> player.teleport(HUANG_CHENG_DONG_MEN);
            case "皇城南门" -> player.teleport(HUANG_CHENG_NAN_MEN);
            case "皇城西门" -> player.teleport(HUANG_CHENG_XI_MEN);
            case "皇城北门" -> player.teleport(HUANG_CHENG_BEI_MEN);
            case "神族出生点" -> player.teleport(SHEN_ZU_CHU_SHENG_DIAN);
            case "仙族出生点" -> player.teleport(XIAN_ZU_CHU_SHENG_DIAN);
            case "人族出生点" -> player.teleport(REN_ZU_CHU_SHENG_DIAN);
            case "妖族出生点" -> player.teleport(YAO_ZU_CHU_SHENG_DIAN);
            case "战神出生点" -> player.teleport(ZHAN_SHEN_CHU_SHENG_DIAN);
            case "蚩尤试炼" -> player.teleport(CHI_YOU_SHI_LIAN);
            case "女娲试炼" -> player.teleport(NU_WA_SHI_LIAN);
            case "盘古试炼" -> player.teleport(PAN_GU_SHI_LIAN);
            case "始皇" -> player.teleport(SHI_HUANG);
            case "火魔" -> player.teleport(HUO_MO);
            case "镇妖塔" -> player.teleport(ZHEN_YAO_TA);
            case "哭谷" -> player.teleport(KU_GU);
            case "圣山" -> player.teleport(SHENG_SHAN);
            case "青龙祭坛" -> player.teleport(QING_LONG_JI_TAN);
            case "朱雀祭坛" -> player.teleport(ZHU_QUE_JI_TAN);
            case "白虎祭坛" -> player.teleport(BAI_HU_JI_TAN);
            case "玄武祭坛" -> player.teleport(XUAN_WU_JI_TAN);
            case "千思谷入口" -> player.teleport(QIAN_SI_GU_RU_KOU);
            case "忘尘" -> player.teleport(WANG_CHEN);
            case "千思谷集市" -> player.teleport(QIAN_SI_GU_JI_SHI);
            case "老战士" -> player.teleport(LAO_ZHAN_SHI);
            case "元素商人" -> player.teleport(YUAN_SU_SHANG_REN);
            case "奈何桥" -> player.teleport(NAI_HE_QIAO);
            case "忠烈祠" -> player.teleport(ZHONG_LIE_CI);
            case "出生点" -> player.teleport(CHU_SHENG_DIAN);
            case "物品" -> player.teleport(WU_PIN);
        }

        return true;
    }
}
