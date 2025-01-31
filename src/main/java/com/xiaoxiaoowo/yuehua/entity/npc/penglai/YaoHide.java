package com.xiaoxiaoowo.yuehua.entity.npc.penglai;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.RaceProvince;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
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

public final class YaoHide {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 336.5, 16, -715.5, -180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);
            it.customName(Component.translatable("§b太上老君"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            {
                ItemStack buyItem = RaceProvince.yao.clone();

                ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                sellItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.title(Component.text("§9与太上老君对话..."));
                    bookMeta.author(Component.text("§9太上老君"));
                    bookMeta.pages(List.of(
                            Component.text("唉……这件事情说来话长。一切要从女娲造了人之后开始说起。当初人族一出现，繁衍的速度虽快，但是死亡率也高。我族的长老为了不要让女娲的用心白费，就命我下凡传下这本「基础炼丹法」。都怪我当时没有细看，只道是一些简单的炼丹方法，用以弥补人族体弱多病的体质。没想到，炼丹法里头的方子竟然掺了一味根本不需要的药材——「妖族的内丹」。"),
                            Component.text("等我发现时，已经太晚了。人族和妖族势同水火，各地都传出二族的争斗和伤亡。但是无论我如何费心解释，人族的人皇依旧不肯将炼丹法中的内容更正。我这才理解到，人也是有私心的。人皇想借炼丹的名义，向妖族发起进攻，夺取土地和资源。甚至还联合了原本不愿参战的仙族，共同建造了用来关押妖族的监狱——「镇妖塔」。"),
                            Component.text("只因我的疏忽，妖族生灵涂炭，这个罪孽我永远也还不清啊……我不想知道为何当初长老给我的药方里加了妖族内丹这味药，也不想和妖族解释什么。我独自躲到这里来，离群索居，日日夜夜地忏悔我的过错……"),
                            Component.text("真相是悔恨的……不能无情，就请时时刻刻用心。妖族隐藏剧情路线到此结束。")
                    ));
                });

                MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
                recipe.addIngredient(buyItem);
                recipes.add(recipe);

            }





            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:cleric\",level:26,type:\"minecraft:snow\"}");
    }
}
