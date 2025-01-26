package com.xiaoxiaoowo.yuehua.entity.npc.chat.xian;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.Money;
import com.xiaoxiaoowo.yuehua.items.other.Other;
import com.xiaoxiaoowo.yuehua.items.zhuangbei.BiWeapon;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class XianTong2 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 3234.5, 67, 877.5, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.xiantong2"));
            it.setCustomNameVisible(true);

            //需要1个交易项目
            List<MerchantRecipe> recipesDefault = new ArrayList<>();

            MerchantRecipe recipeDefault1 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault1.addIngredient(Other.ARROW);
            MerchantRecipe recipeDefault2 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault2.addIngredient(Other.ARROW);
            MerchantRecipe recipeDefault3 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault3.addIngredient(Other.ARROW);

            recipesDefault.add(recipeDefault1);
            recipesDefault.add(recipeDefault2);
            recipesDefault.add(recipeDefault3);
            it.setRecipes(recipesDefault);

            ItemStack jinyaunbao = Money.yinPiao.clone();
            jinyaunbao.setAmount(1);

            MerchantRecipe recipe = new MerchantRecipe(BiWeapon.FEIREN, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(jinyaunbao);
            it.setRecipe(0, recipe);

            MerchantRecipe recipe1 = new MerchantRecipe(BiWeapon.HEITIECHONG, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(jinyaunbao);
            it.setRecipe(1, recipe1);

            MerchantRecipe recipe2 = new MerchantRecipe(BiWeapon.XIAO, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(jinyaunbao);
            it.setRecipe(2, recipe2);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:taiga\"}");
    }

}
