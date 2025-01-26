package com.xiaoxiaoowo.yuehua.entity.npc.south;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.PINZHENG;
import com.xiaoxiaoowo.yuehua.items.dz.*;
import com.xiaoxiaoowo.yuehua.items.other.Collection;
import com.xiaoxiaoowo.yuehua.items.other.Food;
import com.xiaoxiaoowo.yuehua.items.other.Mission;
import com.xiaoxiaoowo.yuehua.items.other.Other;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
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

public final class ZuanYuanZhenRen {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 125.5, 49, 808.5, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("篆元真人").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            //需要9个交易项目
            List<MerchantRecipe> recipesDefault = new ArrayList<>();
            MerchantRecipe recipeDefault1 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault1.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault1);
            MerchantRecipe recipeDefault2 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault2.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault2);
            MerchantRecipe recipeDefault3 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault3.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault3);
            MerchantRecipe recipeDefault4 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault4.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault4);
            MerchantRecipe recipeDefault5 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault5.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault5);
            MerchantRecipe recipeDefault6 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault6.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault6);
            MerchantRecipe recipeDefault7 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault7.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault7);
            MerchantRecipe recipeDefault8 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault8.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault8);
            MerchantRecipe recipeDefault9 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault9.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault9);
            MerchantRecipe recipeDefault10 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault10.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault10);
            MerchantRecipe recipeDefault11 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault11.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault11);
            it.setRecipes(recipesDefault);


            ItemStack gongpin = Collection.SHA_MO_SHI_BEI.clone();

            gongpin.setAmount(64);
            MerchantRecipe recipe0 = new MerchantRecipe(PINZHENG.qkd9Unlock, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(gongpin);
            it.setRecipe(0, recipe0);

            gongpin.setAmount(10);
            MerchantRecipe recipe1 = new MerchantRecipe(Food.zuanyaun, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(gongpin);
            it.setRecipe(1, recipe1);

            gongpin.setAmount(50);
            MerchantRecipe recipe2 = new MerchantRecipe(TehuaShui.wuqi3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(gongpin);
            it.setRecipe(2, recipe2);


            gongpin.setAmount(4);
            ItemStack huixue3 = Food.huixue_3.clone();
            huixue3.setAmount(3);
            MerchantRecipe recipe3 = new MerchantRecipe(huixue3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(gongpin);
            it.setRecipe(3, recipe3);

            gongpin.setAmount(4);
            MerchantRecipe recipe4 = new MerchantRecipe(YuShi.DIAN_LAN_SHI1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(gongpin);
            it.setRecipe(4, recipe4);

            gongpin.setAmount(5);
            MerchantRecipe recipe5 = new MerchantRecipe(Ingredient.WAN_YUE_YIN, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(gongpin);
            it.setRecipe(5, recipe5);

            gongpin.setAmount(2);
            ItemStack huixue2 = Food.huixue_2.clone();
            huixue2.setAmount(6);
            MerchantRecipe recipe6 = new MerchantRecipe(huixue2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe6.addIngredient(gongpin);
            it.setRecipe(6, recipe6);


            gongpin.setAmount(2);
            MerchantRecipe recipe7 = new MerchantRecipe(FuLing.zhusha, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe7.addIngredient(gongpin);
            it.setRecipe(7, recipe7);

            gongpin.setAmount(1);
            ItemStack tu = YuanSu.tu.clone();
            tu.setAmount(6);
            MerchantRecipe recipe8 = new MerchantRecipe(tu, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe8.addIngredient(gongpin);
            it.setRecipe(8, recipe8);

            // First Trade - Purple Dye for Book
            ItemStack buyItem6 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem6.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9与图书管理员对话..."));
                bookMeta.author(Component.text("§9图书管理员"));
                bookMeta.pages(List.of(
                        Component.text("你好，对妖族友善的神族朋友。有问题想要请教我吗？当然没问题，很乐意为你服务。我族的起源……？这倒是个有趣的问题。我族关于起源的记载相当稀少，就我所知，大部分的记载都是有关于其他几族的起源。我看看喔……这卷卷宗里似乎有记载。"),
                        Component.text("嗯……里面有提到我族出现的时间比神族稍晚，但是比人仙二族要早。不过并没有提到为何而出现，又或者是怎么出现的。毕竟对于自己的起源，除非像是神族一样直接继承部分盘古古神的记忆，不然应该都是不甚清楚的。人总不可能知道自己诞生的过程，你说是吧？"),
                        Component.text("不过尽管如此，也还是有办法的。在大陆的南方沙漠里，有一座古石碑。据说它自盘古开天就存在了，上面记载着一些没有人看得懂的信息。若有人可以翻译它的话，或许可以帮你解答你的疑惑。")
                ));
            });
            ItemStack sellItem6 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem6.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9与篆元上仙对话..."));
                bookMeta.author(Component.text("§9篆元上仙"));
                bookMeta.pages(List.of(
                        Component.text("喔喔神族的朋友你好。你是来询问石碑事情的吗？可以是可以，不过这座石碑上的信息量太过庞大，你自己「问」它吧。听不懂我的意思？让我告诉你吧，这座石碑可不是死物，他可是自盘古开天辟地以前就存在的灵石。"),
                        Component.text("想知道什么，问他最准确了。把这个拿去吧，用这挫粉末唤醒他。把粉末丢到石碑后的桶中就可以了。")
                ));
            });

            MerchantRecipe recipe9 = new MerchantRecipe(sellItem6, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe9.addIngredient(buyItem6);
            it.setRecipe(9, recipe9);


            MerchantRecipe recipe10 = new MerchantRecipe(Mission.shenhide.clone(), -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe10.addIngredient(sellItem6);
            it.setRecipe(10, recipe10);

            ItemStack buyItem = new ItemStack(Material.LIME_DYE, 1);
            buyItem.editMeta(meta -> {
                meta.displayName(Component.text("§b篆元真人"));
                meta.lore(List.of(Component.text("§7§o你好,你问我在这里做什么？我在看这个美丽的石碑啊！你看看这些纹理,这些文字…真是太美丽了。"),
                        Component.text("§7§o只是…前几天周围的怪物趁我不注意的时候,把我翻译的数据文献偷走了！"))
                );
            });

            ItemStack sellItem = new ItemStack(Material.LIME_DYE, 1);
            sellItem.editMeta(meta -> {
                meta.displayName(Component.text("§b篆元真人"));
                meta.lore(List.of(Component.text("§7§o没有那些翻译文献,我的考古工作很难继续进行.如果你在周围有发现我被偷的文献的话,麻烦拿过来我这里.我会给你一些报酬的.")));
            });

            MerchantRecipe firstRecipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            firstRecipe.addIngredient(buyItem);

            List<MerchantRecipe> recipes = new ArrayList<>(it.getRecipes());
            recipes.addFirst(firstRecipe);
            it.setRecipes(recipes);


        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:taiga\"}");
    }
}
