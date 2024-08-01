package com.xiaoxiaoowo.yuehua.entity.npc.yushi;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.itemstack.dz.YuShi;
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

public final class Dianlanshi {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 223.5, 32, 117.5, -90f, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("沉思修士").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            //需要7个交易项目
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

            ItemStack tongqian = Money.tongQian.clone();
            ItemStack jinYuanBao = Money.jinYuanBao.clone();
            ItemStack yinPiao = Money.yinPiao.clone();
            ItemStack zuanShi = Money.zuanShi.clone();

            ItemStack bingshuangshi1 = YuShi.DIAN_LAN_SHI1.clone();
            ItemStack bingshuangshi2 = YuShi.DIAN_LAN_SHI2.clone();
            ItemStack bingshuangshi3 = YuShi.DIAN_LAN_SHI3.clone();
            ItemStack bingshuangshi4 = YuShi.DIAN_LAN_SHI4.clone();
            ItemStack bingshuangshi5 = YuShi.DIAN_LAN_SHI5.clone();
            ItemStack bingshuangshi6 = YuShi.DIAN_LAN_SHI6.clone();
            ItemStack bingshuangshi7 = YuShi.DIAN_LAN_SHI7.clone();
            ItemStack bingshuangshi8 = YuShi.DIAN_LAN_SHI8.clone();


            tongqian.setAmount(10);
            bingshuangshi1.setAmount(9);
            bingshuangshi2.setAmount(1);
            MerchantRecipe recipe0 = new MerchantRecipe(bingshuangshi2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(bingshuangshi1);
            recipe0.addIngredient(tongqian);
            it.setRecipe(0, recipe0);

            tongqian.setAmount(50);
            bingshuangshi2.setAmount(9);
            bingshuangshi3.setAmount(1);
            MerchantRecipe recipe1 = new MerchantRecipe(bingshuangshi3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(bingshuangshi2);
            recipe1.addIngredient(tongqian);
            it.setRecipe(1, recipe1);

            jinYuanBao.setAmount(10);
            bingshuangshi3.setAmount(9);
            bingshuangshi4.setAmount(1);
            MerchantRecipe recipe2 = new MerchantRecipe(bingshuangshi4, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(bingshuangshi3);
            recipe2.addIngredient(jinYuanBao);
            it.setRecipe(2, recipe2);

            jinYuanBao.setAmount(50);
            bingshuangshi4.setAmount(9);
            bingshuangshi5.setAmount(1);
            MerchantRecipe recipe3 = new MerchantRecipe(bingshuangshi5, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(bingshuangshi4);
            recipe3.addIngredient(jinYuanBao);
            it.setRecipe(3, recipe3);

            yinPiao.setAmount(10);
            bingshuangshi5.setAmount(9);
            bingshuangshi6.setAmount(1);
            MerchantRecipe recipe4 = new MerchantRecipe(bingshuangshi6, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(bingshuangshi5);
            recipe4.addIngredient(yinPiao);
            it.setRecipe(4, recipe4);

            yinPiao.setAmount(50);
            bingshuangshi6.setAmount(9);
            bingshuangshi7.setAmount(1);
            MerchantRecipe recipe5 = new MerchantRecipe(bingshuangshi7, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(bingshuangshi6);
            recipe5.addIngredient(yinPiao);
            it.setRecipe(5, recipe5);

            zuanShi.setAmount(10);
            bingshuangshi7.setAmount(9);
            bingshuangshi8.setAmount(1);
            MerchantRecipe recipe6 = new MerchantRecipe(bingshuangshi8, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe6.addIngredient(bingshuangshi7);
            recipe6.addIngredient(zuanShi);
            it.setRecipe(6, recipe6);











        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:librarian\",level:100,type:\"minecraft:taiga\"}");
    }
}
