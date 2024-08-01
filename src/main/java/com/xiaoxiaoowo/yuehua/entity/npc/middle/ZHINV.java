package com.xiaoxiaoowo.yuehua.entity.npc.middle;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.itemstack.Book;
import com.xiaoxiaoowo.yuehua.itemstack.other.Feather;
import com.xiaoxiaoowo.yuehua.itemstack.other.Money;
import com.xiaoxiaoowo.yuehua.itemstack.other.Other;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class ZHINV {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 28.5, 48, -8.5, -90, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("织女").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            //需要6个交易项目
            List<MerchantRecipe> recipesDefault = new ArrayList<>();
            MerchantRecipe recipeDefault1 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault1.addIngredient(Other.ARROW);
            MerchantRecipe recipeDefault2 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault2.addIngredient(Other.ARROW);
            MerchantRecipe recipeDefault3 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault3.addIngredient(Other.ARROW);
            MerchantRecipe recipeDefault4 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault4.addIngredient(Other.ARROW);
            MerchantRecipe recipeDefault5 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault5.addIngredient(Other.ARROW);
            MerchantRecipe recipeDefault6 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault6.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault1);
            recipesDefault.add(recipeDefault2);
            recipesDefault.add(recipeDefault3);
            recipesDefault.add(recipeDefault4);
            recipesDefault.add(recipeDefault5);
            recipesDefault.add(recipeDefault6);
            it.setRecipes(recipesDefault);

            ItemStack yuanBao = Money.jinYuanBao.clone();
            ItemStack yinPiao = Money.yinPiao.clone();
            ItemStack jinPengZhiYuSuiPian = Feather.JIN_PENG_ZHI_YU_SUI_PIAN.clone();
            ItemStack jinPengZhiYu = Feather.JIN_PENG_ZHI_YU.clone();
            ItemStack qingLuanZhiYu = Feather.QING_LUAN_ZHI_YU.clone();
            ItemStack QingLuanZhiYuSuiPian = Feather.QING_LUAN_ZHI_YU_SUI_PIAN.clone();
            ItemStack tongHeZhiYuSuiPian = Feather.TONG_HE_ZHI_YU_SUI_PIAN.clone();
            ItemStack tongHeZhiYu = Feather.TONG_HE_ZHI_YU.clone();



            jinPengZhiYuSuiPian.setAmount(1);
            yuanBao.setAmount(5);
            MerchantRecipe recipe = new MerchantRecipe(yuanBao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(jinPengZhiYuSuiPian);
            it.setRecipe(0, recipe);


            QingLuanZhiYuSuiPian.setAmount(1);
            yinPiao.setAmount(1);
            MerchantRecipe recipe1 = new MerchantRecipe(yinPiao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(QingLuanZhiYuSuiPian);
            it.setRecipe(1, recipe1);

            tongHeZhiYuSuiPian.setAmount(1);
            yinPiao.setAmount(3);
            MerchantRecipe recipe2 = new MerchantRecipe(yinPiao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(tongHeZhiYuSuiPian);
            it.setRecipe(2, recipe2);


            jinPengZhiYuSuiPian.setAmount(4);
            jinPengZhiYu.setAmount(1);
            MerchantRecipe recipe3 = new MerchantRecipe(jinPengZhiYu, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(jinPengZhiYuSuiPian);
            it.setRecipe(3, recipe3);

            QingLuanZhiYuSuiPian.setAmount(16);
            qingLuanZhiYu.setAmount(1);
            MerchantRecipe recipe4 = new MerchantRecipe(qingLuanZhiYu, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(QingLuanZhiYuSuiPian);
            it.setRecipe(4, recipe4);


            tongHeZhiYuSuiPian.setAmount(64);
            tongHeZhiYu.setAmount(1);
            MerchantRecipe recipe5 = new MerchantRecipe(tongHeZhiYu, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(tongHeZhiYuSuiPian);
            it.setRecipe(5, recipe5);





        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:nitwit\",level:100,type:\"minecraft:jungle\"}");
    }
}
