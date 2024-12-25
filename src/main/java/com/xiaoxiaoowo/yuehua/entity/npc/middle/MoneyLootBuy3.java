package com.xiaoxiaoowo.yuehua.entity.npc.middle;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.Money;
import com.xiaoxiaoowo.yuehua.items.other.MoneyLoot;
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

public final class MoneyLootBuy3 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 84.5, 47, 112.5, 90, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("神秘收购员").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            //需要2个交易项目
            List<MerchantRecipe> recipesDefault = new ArrayList<>();
            MerchantRecipe recipeDefault1 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault1.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault1);
            MerchantRecipe recipeDefault2 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault2.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault2);
            it.setRecipes(recipesDefault);




            ItemStack yinpiao = Money.zuanShi.clone();
            yinpiao.setAmount(5);



            MerchantRecipe recipe0 = new MerchantRecipe(yinpiao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(MoneyLoot.HU_PO.clone());
            it.setRecipe(0,recipe0);

            MerchantRecipe recipe1 = new MerchantRecipe(yinpiao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(MoneyLoot.BIN_TIE.clone());
            it.setRecipe(1,recipe1);







        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:plains\"}");
    }
}