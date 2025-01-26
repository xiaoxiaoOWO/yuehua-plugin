package com.xiaoxiaoowo.yuehua.entity.npc.chat.qiansi;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.Mission;
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

public final class Zh3 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, -678, 139, 354, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.zh3"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // Red Dye item (buy item)
            ItemStack buyItem = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem.editMeta(meta -> {
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

            // Book item (sell item)
            ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9与忘尘对话..."));
                bookMeta.author(Component.text("§9忘尘"));
                bookMeta.pages(
                        List.of(
                                Component.text("你好，请问你是……？尘嚣？呵呵，没想到过了这么多年，还有人提起这个名字。没错，我就是过去神族的尘嚣天君。不过现在我只是忘尘，一位隐居避世的凡夫俗子罢了。嗯……你真的是战神族的人？好吧……如果你坚持想知道所谓「真相」，这是我家的钥匙，先进去吧，我随后就来。")
                        )
                );
            });

            ItemStack sellItem2 = Mission.zhanshenhide.clone();

            MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(buyItem);
            recipes.add(recipe);

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(sellItem);
            recipes.add(recipe1);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:shepherd\",level:26,type:\"minecraft:snow\"}");
    }
}
