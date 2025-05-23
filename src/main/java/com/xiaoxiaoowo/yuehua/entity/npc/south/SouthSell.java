package com.xiaoxiaoowo.yuehua.entity.npc.south;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.Food;
import com.xiaoxiaoowo.yuehua.items.other.Money;
import com.xiaoxiaoowo.yuehua.items.other.Other;
import com.xiaoxiaoowo.yuehua.items.zhuangbei.Special;
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

public final class SouthSell {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 8.5, 48, 828.5, 90, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("绿洲小镇杂货贩卖商").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            //需要4个交易项目
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
            it.setRecipes(recipesDefault);


            ItemStack tongqian = Money.tongQian.clone();
            ItemStack yinyuan = Money.jinYuanBao.clone();

            yinyuan.setAmount(1);
            tongqian.setAmount(2);


            ItemStack arrow = Other.ARROW.clone();
            arrow.setAmount(99);
            ItemStack baozi = Food.baoZi.clone();
            baozi.setAmount(5);

            ItemStack bihuofu = Special.bihuofu.clone();
            bihuofu.setAmount(99);


            MerchantRecipe recipe0 = new MerchantRecipe(arrow, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(yinyuan);
            it.setRecipe(0, recipe0);

            MerchantRecipe recipe1 = new MerchantRecipe(baozi, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(tongqian);
            it.setRecipe(1, recipe1);

            yinyuan.setAmount(2);

            MerchantRecipe recipe2 = new MerchantRecipe(bihuofu, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(yinyuan);
            it.setRecipe(2, recipe2);





        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:plains\"}");
    }
}
