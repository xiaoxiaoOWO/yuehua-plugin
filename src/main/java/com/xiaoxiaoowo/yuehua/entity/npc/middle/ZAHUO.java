package com.xiaoxiaoowo.yuehua.entity.npc.middle;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.Feather;
import com.xiaoxiaoowo.yuehua.items.other.FuBen;
import com.xiaoxiaoowo.yuehua.items.other.Money;
import com.xiaoxiaoowo.yuehua.items.other.Other;
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

public final class ZAHUO {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 101.5, 46, 185.5, -180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(false);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("南北杂货售卖").color(NamedTextColor.AQUA));
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
            MerchantRecipe recipeDefault7 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault7.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault1);
            recipesDefault.add(recipeDefault2);
            recipesDefault.add(recipeDefault3);
            recipesDefault.add(recipeDefault4);
            recipesDefault.add(recipeDefault5);
            recipesDefault.add(recipeDefault6);
            recipesDefault.add(recipeDefault7);
            it.setRecipes(recipesDefault);


            ItemStack yinyuan = Money.jinYuanBao.clone();
            ItemStack yuanbao = Money.yinPiao.clone();
            ItemStack yinpiao = Money.zuanShi.clone();

            ItemStack arrow = Other.ARROW.clone();
            arrow.setAmount(99);

            ItemStack tongyaoshi = FuBen.keyTong.clone();
            ItemStack yinyaoshi = FuBen.keyYin.clone();
            ItemStack jinyaoshi = FuBen.keyJin.clone();
            ItemStack yuyaoshi = FuBen.keyYu.clone();

            tongyaoshi.setAmount(1);
            yinyaoshi.setAmount(1);
            jinyaoshi.setAmount(1);
            yuyaoshi.setAmount(1);

            ItemStack qingying = Feather.QING_YING_ZHI_YU.clone();
            qingying.setAmount(1);

            MerchantRecipe recipe0 = new MerchantRecipe(arrow, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            yinyuan.setAmount(1);
            recipe0.addIngredient(yinyuan);
            it.setRecipe(0, recipe0);

            MerchantRecipe recipe1 = new MerchantRecipe(qingying, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            yuanbao.setAmount(1);
            recipe1.addIngredient(yuanbao);
            it.setRecipe(1, recipe1);

            MerchantRecipe recipe2 = new MerchantRecipe(tongyaoshi, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            yuanbao.setAmount(2);
            recipe2.addIngredient(yuanbao);
            it.setRecipe(2, recipe2);

            MerchantRecipe recipe3 = new MerchantRecipe(yinyaoshi, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            yuanbao.setAmount(5);
            recipe3.addIngredient(yuanbao);
            it.setRecipe(3, recipe3);

            MerchantRecipe recipe4 = new MerchantRecipe(jinyaoshi, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            yinpiao.setAmount(2);
            recipe4.addIngredient(yinpiao);
            it.setRecipe(4, recipe4);

            MerchantRecipe recipe5 = new MerchantRecipe(yuyaoshi, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            yinpiao.setAmount(5);
            recipe5.addIngredient(yinpiao);
            it.setRecipe(5, recipe5);

            MerchantRecipe recipe6 = new MerchantRecipe(Other.wangyuanjin, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            yuanbao.setAmount(1);
            recipe6.addIngredient(yuanbao);
            it.setRecipe(6, recipe6);


        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:plains\"}");
    }
}
