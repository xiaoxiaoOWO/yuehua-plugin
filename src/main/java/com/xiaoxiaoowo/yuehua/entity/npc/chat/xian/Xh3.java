package com.xiaoxiaoowo.yuehua.entity.npc.chat.xian;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.RaceProvince;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.event.ClickEvent;
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

public final class Xh3 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 3225.5, 60, 941.5, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.xh3"));
            it.setCustomNameVisible(true);

            // 设置交易项目
            List<MerchantRecipe> recipes = new ArrayList<>();

            // 交易：书
            ItemStack buyItem =  new ItemStack(org.bukkit.Material.WRITTEN_BOOK, 1);
            buyItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.setTitle("§9与戒忍上仙对话...");
                bookMeta.setAuthor("§9戒忍上仙");
                bookMeta.pages(List.of(
                        Component.text("找我什么事呢？我这阵子已经制作了够多法器了，不要再来找我订购了喔。唉？不是法器的事？你把蓝图交给了戒忍上仙。这……这是四圣兽的设计蓝图？不会错的，就是四圣兽的设计手稿，详细的程度实在让人吃惊……等等，你是从哪里拿到这份蓝图的？仙族的藏书阁？怎么可能？"),
                        Component.text("不，等等……这份蓝图可能真的出自我族之手。就我所知，神族虽然强大，但是一向缺乏创造能力，不可能设计出这么复杂的东西来。可是，如果四圣兽真的是由我们仙族设计的，成品又为何会到了神族的手上？越想越不对劲……这样吧，你到蜀山中间那座大石碑去，找负责管理历史的墨仙问问看，看看文献中有没有记载这方面的信息。")
                ));
            });

            ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.setTitle("§9与管理员-墨仙对话...");
                bookMeta.setAuthor("§9管理员-墨仙");
                bookMeta.pages(List.of(
                        Component.text("你好，我是管理仙族历史的墨仙。请问需要查询什么？四圣兽，是由仙族设计，神仙二族共同制作的强大法器。它们拥有自己的意志，但是指挥权还是握在仙族手中。制作完成后，仙族将四圣兽的指挥权赠送给神族，作为二族友好的象征。而神族也善用了四圣兽的能力，将世界管理的井井有条。"),
                        Component.text("但是百年前战神一族的攻击，令四圣兽负伤失踪，不知去向。嗯……大概就是这些。唉？你很意外四圣兽是我族送给神族的吗？我看看喔……当初做决定的好像是那时的仙族盟主。如果还是很疑惑的话，不妨去找现任的盟主问问看？历代盟主都会有传承的文献，或许那里有你需要的记载。")
                ));
            });

            MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(buyItem);
            recipes.add(recipe);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:taiga\"}");
    }
}