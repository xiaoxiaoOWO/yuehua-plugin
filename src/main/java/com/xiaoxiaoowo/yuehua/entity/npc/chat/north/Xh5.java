package com.xiaoxiaoowo.yuehua.entity.npc.chat.north;

import com.xiaoxiaoowo.yuehua.items.other.RaceProvince;
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

public final class Xh5 {
    public static void spawn() {
        Location location = new Location(Bukkit.getWorld("world"), -335, 97, -446, 0, 0); // 使用指令中的坐标
        Villager villager = Bukkit.getWorld("world").spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.te16"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // 交易: 用蓝宝石换书籍
            ItemStack buyItem = RaceProvince.xian.clone();

            ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
            BookMeta bookMeta = (BookMeta) sellItem.getItemMeta();
            if (bookMeta != null) {
                bookMeta.setTitle("§9与雨竹对话...");
                bookMeta.setAuthor("§9雨竹");
                bookMeta.pages(
                        List.of(
                                Component.text("雨竹：\"你终于来了……我在这里已经不知道度过了多少个寒暑。但是在持有卷宗的人来找我之前，我不能够离开。现在，你来了，我们终于可以知道，盟主当初计划的事情到底是什么了……\""),
                                Component.text("（雨竹将自己手中的玉简与你带的那一份放在一起，两个物体接合在一起，然后在空中浮现了一个仙人的图像）\n" +
                                        "仙人：\"你们好，我是仙族盟主-梓决。你们能够看到这段图像，就代表有缘获得密卷的人，和雨竹，你们两个都在现场。我现在要讲的，是攸关仙族的，重大的秘密。\""),
                                Component.text("梓决：\"你们应该知道，神族继承了盘古的血脉，他们与天地同寿，能力强大无比……相对于他们，我们仙人的寿命，至多二千岁。即使我们拥有的才华比神还要多，还要大，在岁月的侵袭下，终会归于尘土。\""),
                                Component.text("梓决继续解释：\"因此，我族一直以来，就在寻找能够永生的方法。而我，发现了一个可能性，那就是，重塑'盘古神'！是的，这个计划就是为了让我族获得永生所设计的'造神计划'。只要控制了盘古神，我们一定能发掘永生的秘密。\""),
                                Component.text("梓决详细说明了计划：\"为了重塑盘古，我和仙族几位天赋异禀的工匠，设计了'四圣兽'。这四只圣兽，其实就是提取日月精华，重塑'盘古肉身'的阵法根源。我们联手制造了四圣兽，并将它们送给了神族。利用五行和风水，一步一步的实现造神的伟大理想！这个阵法发动的时间不确定，但是总有一天，四圣兽将齐聚一堂，重塑盘古肉身。\""),
                                Component.text("梓决最后说：\"期望后世的你们，可以将这件事情转达给仙族的同胞。告诉他们，我们获得永生的日子不远了！\"\n" +
                                        "雨竹听完后感叹：\"原来如此……这就是盟主想要达成的计划吗……可我度过这么多个年头，早就知道了永生是一件多么痛苦的事情……\""),
                                Component.text("（真相是贪婪的……如果已经看破尘世，就请不要给予太多的期待……）\n" +
                                        "仙族隐藏剧情路线到此结束。")
                        )
                );
                sellItem.setItemMeta(bookMeta);
            }

            MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, Integer.MAX_VALUE, false, 0, 0, 0, 0, true);
            recipe.addIngredient(buyItem);
            recipes.add(recipe);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:farmer\",level:26,type:\"minecraft:taiga\"}");
    }
}
