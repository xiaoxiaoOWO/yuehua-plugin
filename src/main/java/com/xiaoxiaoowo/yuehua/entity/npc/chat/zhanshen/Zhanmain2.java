package com.xiaoxiaoowo.yuehua.entity.npc.chat.zhanshen;

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

public final class Zhanmain2 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 3264, 20, -148, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);
            it.customName(Component.translatable("pl.npc.name.zhanmain2"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First trade: leading paper for book
            ItemStack buyItem1 = new ItemStack(Material.NETHER_WART, 1);
            buyItem1.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.newzhan"));
                meta.lore(List.of(
                        Component.translatable("pl.item.lore.newzhana"),
                        Component.translatable("pl.item.lore.newzhanb")
                ));
            });

            ItemStack sellItem1 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9族长的关心"));
                bookMeta.author(Component.text("§9战神族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.zm1.page1")
                ));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);

            // Second trade: book for change paper
            ItemStack buyItem2 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem2.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9族长的关心"));
                bookMeta.author(Component.text("§9战神族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.zm1.page1")
                ));
            });

            ItemStack sellItem2 = new ItemStack(Material.NETHER_WART, 6);
            sellItem2.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.newchange"));
                meta.lore(List.of(
                        Component.translatable("pl.item.lore.newchange")
                ));
            });

            MerchantRecipe recipe2 = new MerchantRecipe(sellItem2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(buyItem2);
            recipes.add(recipe2);

            // Third trade: book for another book
            ItemStack buyItem3 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9丹药管理员"));
                bookMeta.author(Component.text("§9战神族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.zm3.page1")
                ));
            });

            ItemStack sellItem3 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9族长的嘱托"));
                bookMeta.author(Component.text("§9战神族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.zm4.page1"),
                        Component.translatable("pl.book.zm4.page2"),
                        Component.translatable("pl.book.zm4.page3")
                ));
            });

            MerchantRecipe recipe3 = new MerchantRecipe(sellItem3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(buyItem3);
            recipes.add(recipe3);

            // Fourth trade: red dye for book
            ItemStack buyItem4 = RaceProvince.zhanShen.clone();

            ItemStack sellItem4 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem4.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9与族长对话..."));
                bookMeta.author(Component.text("§9族长"));
                bookMeta.pages(List.of(
                        Component.text("你知道，我们战神一族的由来吗？其实，战神指的是「对抗神」。想当初上古时代，神族利用四兽——青龙、白虎、朱雀、玄武的强大战力，逼迫各族必须缴纳供品。于是有一群不服的反抗军，组成了“战神联盟”，誓言对抗独断的神族。战神联盟由各种族的人士组成，包括当时与长老意见不合的一些神族族人。"),
                        Component.text("这些有志之士在战神族领地附近聚集起来。但不知道是谁走漏风声，神族利用四兽攻击了战神联盟的据点.当时祖先们死的死，逃的逃。剩下的联盟成员只好躲起来，逃避神族的追杀。而这群剩下的战神联盟成员，就是我们战神一族的祖先。为了复仇，百年前我们战神一族发起攻击，突袭了四兽的祭坛据点。"),
                        Component.text("四兽虽然负伤，但依旧有余力应敌，歼灭了所有刺客后便离开祭坛，不知所踪。我们一直在寻找四兽养伤的所在地。一日不除四兽，血海深仇难得伸张。但我们的敌人真的只是四兽吗？四兽只是神族的工具，真正下令攻击战神联盟据点的一定另有其人……"),
                        Component.text("这样吧，给你一个秘密任务。我们在神族中有一位间谍，为了怕被发现，他平日与族内联系极少。这位情报员名叫九幽。我希望你潜入神族领地昆仑，联系上九幽，并向他询问四兽当年攻击联盟据点的经过。")
                ));
            });

            MerchantRecipe recipe4 = new MerchantRecipe(sellItem4, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(buyItem4);
            recipes.add(recipe4);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:fletcher\",level:26,type:\"minecraft:desert\"}");
    }
}