package com.xiaoxiaoowo.yuehua.entity.npc.chat.qiansi;

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

public final class Zh4 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, -678, 139, 346, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.zh4"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // Red Dye item (buy item)
            ItemStack buyItem = RaceProvince.zhanShen.clone();

            // Book item (sell item)
            ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9与尘嚣天君对话..."));
                bookMeta.author(Component.text("§9尘嚣天君"));
                bookMeta.pages(
                        List.of(
                                Component.text("当年……我还在昆仑的时候，有一位生死相许的伴侣，她叫做芊无天君。长老颁布了一系列逼各族缴纳供品的措施时，芊无她不顾我的反对，参加了「战神联盟」。那阵子我在昆仑和联盟据点两地跑，每次都苦口婆心地劝她回来。但她非常坚持。"),
                                Component.text("而就在那时，长老突然决定歼灭这些他认为有危险的因子。即便战神联盟并没有想要推翻神族地位的意图……长老召开了一个看似民主的会议，邀请我和贪狼星君一起参与。但是，谁都知道贪狼星君好战，只要和征战有关的事情他一定会同意。而长老选择我，只是因为他知道凭我和芊无的关系，一定会反对镇压行动。"),
                                Component.text("二票对一票，看似不那么独断。但我知道，这是一场必输的局。会议一结束，我便用最快速度前往联盟据点通知芊无，并试图说服战神联盟的人尽快撤离。但他们并不了解四圣兽的力量有多强，因此大部分人并不愿意离开。我只好先带部分人撤离，而芊无则继续留在据点说服其他人。"),
                                Component.text("然而，当我再次回到据点时，等待我的只是熊熊烈火和满地的尸首……我只好带着部分人离开据点，到这里重新开始，将此地命名为「千丝谷」。而芊无……我没有去寻找，也没有勇气确认……我不知道在我离开后，还有多少联盟的人存活下来。"),
                                Component.text("真相是沉痛的……不能忘却，就不要试图想起。战神族隐藏剧情路线到此结束。")

                        )
                );
            });

            MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(buyItem);
            recipes.add(recipe);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:shepherd\",level:26,type:\"minecraft:snow\"}");
    }
}
