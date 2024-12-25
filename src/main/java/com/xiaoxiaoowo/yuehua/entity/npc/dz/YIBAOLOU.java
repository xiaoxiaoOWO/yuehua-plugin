package com.xiaoxiaoowo.yuehua.entity.npc.dz;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.Book;
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

public final class YIBAOLOU {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 248.5, 71, -154.5, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("异宝楼楼主").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            //需要1个交易项目
            List<MerchantRecipe> recipesDefault = new ArrayList<>();
            MerchantRecipe recipeDefault1 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault1.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault1);
            it.setRecipes(recipesDefault);

            ItemStack npcPaoPao = Other.NPC_PAOPAO;


            MerchantRecipe recipe = new MerchantRecipe(Book.YIQIDZ, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(npcPaoPao);
            it.setRecipe(0, recipe);


        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:armorer\",level:100,type:\"minecraft:snow\"}");
    }
}
