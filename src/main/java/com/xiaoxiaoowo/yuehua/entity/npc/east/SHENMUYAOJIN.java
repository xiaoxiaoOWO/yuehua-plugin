package com.xiaoxiaoowo.yuehua.entity.npc.east;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.dz.*;
import com.xiaoxiaoowo.yuehua.items.other.*;
import com.xiaoxiaoowo.yuehua.items.PINZHENG;
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

public final class SHENMUYAOJIN {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 633.5, 54, 384.5, -180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("神木妖精").color(NamedTextColor.AQUA));
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


            ItemStack gongpin = Collection.SHEN_MU_YAO_JING.clone();

            gongpin.setAmount(64);
            MerchantRecipe recipe0 = new MerchantRecipe(PINZHENG.qkd7Unlock, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(gongpin);
            it.setRecipe(0, recipe0);

            gongpin.setAmount(10);
            MerchantRecipe recipe1 = new MerchantRecipe(Food.SHENMULING, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(gongpin);
            it.setRecipe(1, recipe1);

            gongpin.setAmount(50);
            MerchantRecipe recipe2 = new MerchantRecipe(TehuaShui.wuqi2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(gongpin);
            it.setRecipe(2, recipe2);


            gongpin.setAmount(5);
            ItemStack huixue3 = Food.huixue_3.clone();
            huixue3.setAmount(3);
            MerchantRecipe recipe3 = new MerchantRecipe(huixue3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(gongpin);
            it.setRecipe(3, recipe3);

            gongpin.setAmount(5);
            MerchantRecipe recipe4 = new MerchantRecipe(YuShi.YU_LU_SHI1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(gongpin);
            it.setRecipe(4, recipe4);

            MerchantRecipe recipe5 = new MerchantRecipe(Ingredient.QI_CAI_JIN, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(gongpin);
            it.setRecipe(5, recipe5);

            gongpin.setAmount(2);
            ItemStack huixue2 = Food.huixue_2.clone();
            huixue2.setAmount(5);
            MerchantRecipe recipe6 = new MerchantRecipe(huixue2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe6.addIngredient(gongpin);
            it.setRecipe(6, recipe6);


            gongpin.setAmount(2);
            MerchantRecipe recipe7 = new MerchantRecipe(FuLing.zhusha, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe7.addIngredient(gongpin);
            it.setRecipe(7, recipe7);

            gongpin.setAmount(1);
            ItemStack tu = YuanSu.mu.clone();
            tu.setAmount(5);
            MerchantRecipe recipe8 = new MerchantRecipe(tu, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe8.addIngredient(gongpin);
            it.setRecipe(8, recipe8);

            // First Trade - Purple Dye for Book
            ItemStack buyItem1 = RaceProvince.yao.clone();

            ItemStack sellItem1 = new ItemStack(Material.WRITTEN_BOOK);
            sellItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9神木妖精的愿望"));
                bookMeta.author(Component.text("§9神木妖精"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.ye1.page1"),
                        Component.translatable("pl.book.ye1.page2")
                ));
            });

            // Second Trade - Purple Dye for Nether Wart
            ItemStack buyItem2 = RaceProvince.yao.clone();

            ItemStack sellItem2 = Mission.shenmuyaojingchouduan.clone();

            MerchantRecipe recipe9 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe9.addIngredient(buyItem1);
            it.setRecipe(9,recipe9);

            MerchantRecipe recipe10 = new MerchantRecipe(sellItem2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe10.addIngredient(buyItem2);
            it.setRecipe(10,recipe10);

            ItemStack buyItem = new ItemStack(Material.LIME_DYE, 1);
            buyItem.editMeta(meta -> {
                meta.displayName(Component.translatable("§b神木妖精"));
                meta.lore(List.of(Component.translatable("§7§o沃土是我们神木妖一族赖以修炼的宝物，可惜这里的怪物太过凶悍，沃土大都被它们霸占着")));
            });

            ItemStack sellItem = new ItemStack(Material.LIME_DYE, 1);
            sellItem.editMeta(meta -> {
                meta.displayName(Component.translatable("§b神木妖精"));
                meta.lore(List.of(Component.translatable("§7§o可不可以请你帮我弄来一些沃土？我可以用这里的一些特产和你交换")));
            });

            MerchantRecipe firstRecipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            firstRecipe.addIngredient(buyItem);

            List<MerchantRecipe> recipes = new ArrayList<>(it.getRecipes());
            recipes.addFirst(firstRecipe);
            it.setRecipes(recipes);

        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:jungle\"}");
    }
}
