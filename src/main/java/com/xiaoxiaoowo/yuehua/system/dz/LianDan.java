package com.xiaoxiaoowo.yuehua.system.dz;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.guis.dz.Recipe;
import com.xiaoxiaoowo.yuehua.utils.AdvancementSet;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import org.bukkit.advancement.Advancement;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public final class LianDan {
    public static void liandan(Inventory inventory, String id, Player player) {
        id = Help.removeCore(id);
        Inventory recipe = Recipe.danContents.get(id);
        //查看核心id有无对应配方
        if (recipe == null) {
            return;
        }

        //查看是否满足配方
        if (!Help.invCompare(recipe, inventory)) {
            return;
        }
        //给与物品
        PlaySound.liandan(player);
        ItemStack itemStack = Recipe.idToItem.get(id);
        itemStack.setAmount(10);
        inventory.setItem(0, itemStack);

        String lowcaseId = id.toLowerCase();
        Advancement advancement = AdvancementSet.idToAdvancements.get(lowcaseId);
        if (advancement != null) {
            int points = AdvancementSet.idToPoints.get(lowcaseId);
            AdvancementSet.giveAdv(player, advancement, points);
        }
    }

    public static void danshiLiandan(Inventory inventory, String id, Player player) {
        DanData danData = (DanData) Yuehua.playerData.get(player.getUniqueId());

        id = Help.removeCore(id);
        Inventory recipe = Recipe.dandanContents.get(id);
        //查看核心id有无对应配方
        if (recipe == null) {
            return;
        }

        //查看是否满足配方
        if (!Help.invCompare(recipe, inventory)) {
            return;
        }
        //给与物品
        PlaySound.liandan(player);
        ItemStack itemStack = Recipe.idToItem.get(id).clone();
        int amount = switch (danData.slot40.id) {
            case "heiTieGuo" -> 10;
            case "qinTongGuo" -> 12;
            case "lianDanLu" -> 14;
            case "suoHunLu" -> 16;
            case "qiShaDing" -> 18;
            case "hunYuanShenDing" -> 20;
            default -> 0;
        };
        itemStack.setAmount(amount);
        inventory.setItem(0, itemStack);


        String lowcaseId = id.toLowerCase();
        Advancement advancement = AdvancementSet.idToAdvancements.get(lowcaseId);
        if (advancement != null) {
            int points = AdvancementSet.idToPoints.get(lowcaseId);
            AdvancementSet.giveAdv(player, advancement, points);
        }
    }
}
