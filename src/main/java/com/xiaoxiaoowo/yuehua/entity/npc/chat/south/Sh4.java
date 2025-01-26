package com.xiaoxiaoowo.yuehua.entity.npc.chat.south;

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

public final class Sh4 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 123, 32, 814, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.sh4"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            ItemStack buyItem = RaceProvince.shen.clone();

            ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK);
            sellItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9与石碑的精魄对话..."));
                bookMeta.author(Component.text("§9石碑的精魄"));
                bookMeta.pages(List.of(
                        Component.text("哈啾！哈……哈啾！我说，你们这些野蛮人就没有文明一点的方式吗？老是拿胡椒粉往我鼻子上撒……真是的……好啦，你这小家伙，有什么想问我的吗？我可是上知天文下知地理，无所不知无所不晓的神石碑碑～哈啾"),
                        Component.text("喔……想知道妖族的起源？这倒是个有趣的问题。不过，身为神族的你，真的有这样的觉悟想要知道真相吗？……好吧，既然你如此坚持，那我就告诉你历史的事实吧。妖族，其实是比神族，甚至是比盘古，更古老的存在。"),
                        Component.text("早在盘古还未开天辟地之时，妖族就已经存在了，而且妖族和这个世界是一体的。盘古强行破开天地，将宇宙切开，这才逼迫妖族必须化形，用双腿在地上行走。妖族才是这个世界的原住民，神族才是外来的种族。这也是为何世界的意志-天道如此的维护妖族。因为妖族的出现就是世界意志的展现！是世界为了抵抗神族的「殖民」所做出的「抵抗」！"),
                        Component.text("……你问我为什么会知道？因为我也是妖族的族人。我原本是混沌的宇宙中最早清醒的一团云雾。我亲眼看着盘古切开宇宙，分开天地，然后力尽而亡。我亲眼看着神族的诞生和妖族的化形……啧啧……你相信也好不相信也罢，滚回去吧。真是扫我的兴。"),
                        Component.text("以后别来了，这就是你想要知道的真相。真相是残酷的……不能接受，就不要寻找。神族隐藏剧情路线到此结束。")
                ));
            });

            MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(buyItem);
            recipes.add(recipe);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:jungle\"}");
    }
}
