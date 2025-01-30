package com.xiaoxiaoowo.yuehua.guis.other;

import com.xiaoxiaoowo.yuehua.guis.Yh;
import com.xiaoxiaoowo.yuehua.items.zhuangbei.Special;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

import static com.xiaoxiaoowo.yuehua.event.Inventory.Click.xianqianAward;

public class Speical {
    public static final Inventory time = Bukkit.createInventory(null, 9, Component.text("时光之礼").color(NamedTextColor.AQUA));

    static {
        ItemStack xianqian = Special.xianqianhuojian.clone();
        ItemMeta xianqianItemMeta = xianqian.getItemMeta();
        xianqianItemMeta.displayName(
                Component
                        .text("领取先遣服奖励").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        xianqianItemMeta.lore(
                List.of()
        );
        xianqian.setItemMeta(xianqianItemMeta);

        time.setItem(0, xianqian);

        time.setItem(8, Yh.BACK_BEFORE);
    }

    // 假设playerRanks是一个已经按等级排序的玩家列表
    public static void initXianqianAward() {
        List<String> playerRanks = List.of(
                "Xuanhan", "_Mr_me_", "LuckyYi0001", "QwQ_233333", "qiushuang_bring",
                "Wind_Dust_flow", "Neng_Mao", "rare457", "CXY__", "Smile_Aurora",
                "qiyue_cong", "_qins", "dadajun233", "AQhuixiang", "Nai_Li_07",
                "12deepth", "FutureChenFeng", "Soul__23", "lintfrost", "whaozhao",
                "IcedCola_OWO", "fengbaiqing", "HH_QaQ", "passer_____by", "fan_fer",
                "Nightwish__", "Dear_Joker_", "Xiao_haibei", "DLHMZZZ", "1_c_0613",
                "Tong__Yu", "Surtr_Molten", "_lao_bing", "Bule_Huang", "Leng__Xin",
                "tat224320", "Eggggg_", "YiYu55555", "loveQ30", "Hua_Li_Ren",
                "xun_cong", "dddd201881817", "YiYuxxxxx", "kiritoqwd", "ajqq",
                "Eternal_Tear", "mtyrpg100", "Feng_Buyu", "icuqALT10", "Mchine",
                "rarakuo", "Super_smart_egg", "wuhen23333", "huik1", "HHaiWang",
                "lonely0317", "sy183", "offo_moffo", "Sakura_Miku_0831", "erha10086",
                "hanji_hunike", "Danlanke", "Molong_Moyi", "TheXin_chen", "Ellen_SS",
                "chihongQAQ", "ku__Fu", "zhihehehe", "Jobanwater", "MusuYi",
                "shilaoyanya", "ink_phrase", "baixiyi", "_Vacancy", "zjris",
                "Zrrch", "Unapple12138", "Yizei", "double_booking"
        );

        for (int i = 0; i < playerRanks.size(); i++) {
            String playerName = playerRanks.get(i);
            ItemStack reward;

            // 根据排名分配不同的仙签火箭
            if (i < 2) {  // 前2名
                reward = Special.xianqianhuojian8;
            } else if (i < 4) {  // 3-4名
                reward = Special.xianqianhuojian7;
            } else if (i < 11) {  // 5-11名
                reward = Special.xianqianhuojian6;
            } else if (i < 15) {  // 12-15名
                reward = Special.xianqianhuojian5;
            } else if (i < 31) {  // 16-31名
                reward = Special.xianqianhuojian4;
            } else if (i < 44) {  // 32-44名
                reward = Special.xianqianhuojian3;
            } else if (i < 63) {  // 45-63名
                reward = Special.xianqianhuojian2;
            } else {  // 64名及以后
                reward = Special.xianqianhuojian;
            }

            xianqianAward.put(playerName, reward);
        }
    }
}
