package com.xiaoxiaoowo.yuehua.entity.npc.chat.shen;

import com.xiaoxiaoowo.yuehua.Yuehua;
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

public final class Zh2 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 3259, 115, 375, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);
            it.customName(Component.translatable("pl.npc.name.zh2"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First trade item
            ItemStack buyItem = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem.editMeta(meta -> {
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
            // Sell item (Written Book)
            ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9与九幽对话..."));
                bookMeta.author(Component.text("§9九幽"));
                bookMeta.pages(List.of(
                        Component.text("你好，请问你是？……原来如此，是族长派你来的。有需要我帮忙的吗？关于当年四兽镇压我族联盟据点的历史吗？我可以找找我这几年来搜集的资料，不确定有没有……嗯……找到了，关于四圣兽事件的历史文献。当年决定以四兽镇压战神联盟的，是神族的长老与干部在会议中共同决定的结果。"),
                        Component.text("以下是当初参与会议的名单：神族长老、贪狼星君、尘嚣天君，主要是这三位。这是巧合吗……现在还留在昆仑的就只剩下长老一人了。贪狼星君是带领四兽出征据点的人，但在那场战争中陨落了。尘嚣天君则在出征前夕突然失踪……详细情形可能要问当初参与会议的神才知道了。什么？为何不去询问长老？你不知道，长老非常残酷，我可不敢惹。"),
                        Component.text("就连同族的神，只要违逆长老意思的，都能灰飞烟灭，更何况异族人。我做间谍几十年，都不敢和他对视，生怕被发现。想套长老的话？那一定是疯了……但除了长老，也还有其他选择，例如失踪的尘嚣天君。文献记载，尘嚣天君是唯一反对镇压的神。"),
                        Component.text("传言有人在大陆西南方一处隐居地，看见过和他长得很像的神，似乎改名叫「忘尘」。你可以到西南方找找看，或许能找到这位失踪的尘嚣天君。")

                ));
            });

            MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(buyItem);
            recipes.add(recipe);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:snow\"}");
    }
}