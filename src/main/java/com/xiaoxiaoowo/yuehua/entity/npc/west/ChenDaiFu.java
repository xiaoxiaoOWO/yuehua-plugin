package com.xiaoxiaoowo.yuehua.entity.npc.west;

import com.xiaoxiaoowo.yuehua.items.PINZHENG;
import com.xiaoxiaoowo.yuehua.items.dz.FuLing;
import com.xiaoxiaoowo.yuehua.items.dz.TehuaShui;
import com.xiaoxiaoowo.yuehua.items.dz.YuShi;
import com.xiaoxiaoowo.yuehua.items.dz.YuanSu;
import com.xiaoxiaoowo.yuehua.items.other.Collection;
import com.xiaoxiaoowo.yuehua.items.other.Food;
import com.xiaoxiaoowo.yuehua.items.other.Mission;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;
import org.bukkit.inventory.meta.BookMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class ChenDaiFu {
    public static void spawn() {
        Location location = new Location(Bukkit.getWorld("world"), -118.5, 46, 139.5, 90, 0); // 使用指令中的坐标
        Villager villager = Bukkit.getWorld("world").spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.text("§b陈大夫"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // 交易 1: NPC气泡换书籍 - 解决日渐增强的怨气
            ItemStack buyItem1 = new ItemStack(Material.LIME_DYE, 1);
            buyItem1.editMeta(meta -> {
                meta.displayName(Component.text("§b陈大夫"));
                meta.lore(List.of(
                        Component.text("§7§o啊…欢迎欢迎,是来看病的吗？不是也没关系,喝杯茶吧.咦？我是神族的人？"),
                        Component.text("§7§o是啊,没错.你该不会以为所有的神都是冷冰冰的吧.我是神农氏,掌管全天下的药草."),
                        Component.text("§7§o不过因为我看见人间的疾苦实在放不下心,所以就待在这里救助病人了."),
                        Component.text("§7§o请称呼我为陈大夫就可以了.")
                ));
            });

            ItemStack sellItem1 = new ItemStack(Material.LIME_DYE, 1);
            sellItem1.editMeta(meta -> {
                meta.displayName(Component.text("§b陈大夫"));
                meta.lore(List.of(
                        Component.text("§7§o你有空的话,可以帮我一个忙吗？帮我到周围去采集一些药草."),
                        Component.text("§7§o我虽然身为神族,但是住在凡间的神是不能随意使用自己的能力的."),
                        Component.text("§7§o况且我也不想太大动作让天上那些家伙感应到我的所在."),
                        Component.text("§7§o药草应该可以在周围的野兽身上找到,麻烦你了.我会给你一些报酬的.")
                ));
            });

            ItemStack buyItem2 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem2.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.setTitle("§9与仙族盟主对话...");
                bookMeta.setAuthor("§9仙族盟主");
                bookMeta.pages(List.of(
                        Component.text("关于最长寿的仙人？你问这个做什么呢？你说女娲啊…..这太久远了，即使是目前最长寿的仙人大概也无法回答你的问题吧。女娲从很久以前就不再出现了。不过如果你真的那么有兴趣的话，我帮你找找看，我记得有这方面的文献……有了，这是第一任仙族盟主留下来的玉简……里面记载了一些关于女娲的事情。"),
                        Component.text("神族女娲，是人族的创造者。女娲利用自己的脊椎骨，沾了泥水甩动，掉落的泥块化为人族的祖先。嗯……历史的部分好像只到女娲创造人类，之后就没有关于他的任何信息了。前面也只有提到她与神族的药草之神-神农氏非常要好，除此之外没有其他的记载。神农氏似乎隐居在凡间，不过我也不知道他在哪。若你有幸遇到这位传说中的药神，问问他或许会知道的更清楚些。")
                ));
            });

            ItemStack sellItem2 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem2.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.setTitle("§9与陈大夫对话...");
                bookMeta.setAuthor("§9陈大夫");
                bookMeta.pages(List.of(
                        Component.text("你想知道女娲的去向？那是个我不愿意去回忆的事情。如果你坚持的话，那好吧，这件事情只能私下告诉你。你拿这把钥匙，就可以到后面的密室。你先进去，我随后就来。记住，别让任何人知道。")
                ));
            });

            ItemStack sellItem3 = Mission.renhide.clone();


            MerchantRecipe recipe1x = new MerchantRecipe(sellItem1, -2147483648, Integer.MAX_VALUE, false, 0, 0, 0, 0, true);
            recipe1x.addIngredient(buyItem1);
            recipes.add(recipe1x);

            MerchantRecipe recipe2x = new MerchantRecipe(sellItem2, -2147483648, Integer.MAX_VALUE, false, 0, 0, 0, 0, true);
            recipe2x.addIngredient(buyItem2);
            recipes.add(recipe2x);

            MerchantRecipe recipe3x = new MerchantRecipe(sellItem3, -2147483648, Integer.MAX_VALUE, false, 0, 0, 0, 0, true);
            recipe3x.addIngredient(sellItem2);
            recipes.add(recipe3x);


            ItemStack gongpin = Collection.CHEN_DAI_FU.clone();

            gongpin.setAmount(64);
            MerchantRecipe recipe0 = new MerchantRecipe(PINZHENG.qkd11Unlock, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(gongpin);
            recipes.add(recipe0);

            gongpin.setAmount(10);

            MerchantRecipe recipe1 = new MerchantRecipe(Food.chendaifu, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(gongpin);
            recipes.add(recipe1);

            gongpin.setAmount(25);
            MerchantRecipe recipe2 = new MerchantRecipe(TehuaShui.fangju4, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(gongpin);
            recipes.add(recipe2);

            gongpin.setAmount(3);
            ItemStack huixue3 = Food.huixue_3.clone();
            huixue3.setAmount(3);
            MerchantRecipe recipe3 = new MerchantRecipe(huixue3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(gongpin);
            recipes.add(recipe3);

            gongpin.setAmount(3);
            MerchantRecipe recipe4 = new MerchantRecipe(YuShi.ZI_JING_SHI1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(gongpin);
            recipes.add(recipe4);


            gongpin.setAmount(2);
            ItemStack huixue2 = Food.huixue_2.clone();
            huixue2.setAmount(7);
            MerchantRecipe recipe6 = new MerchantRecipe(huixue2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe6.addIngredient(gongpin);
            recipes.add(recipe6);

            MerchantRecipe recipe7 = new MerchantRecipe(FuLing.zhusha, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe7.addIngredient(gongpin);
            recipes.add(recipe7);

            gongpin.setAmount(1);
            ItemStack tu = YuanSu.mu.clone();
            tu.setAmount(7);
            MerchantRecipe recipe8 = new MerchantRecipe(tu, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe8.addIngredient(gongpin);
            recipes.add(recipe8);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:cartographer\",level:26,type:\"minecraft:snow\"}");
    }
}
