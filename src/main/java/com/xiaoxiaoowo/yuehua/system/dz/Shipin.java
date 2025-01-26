package com.xiaoxiaoowo.yuehua.system.dz;

import com.xiaoxiaoowo.yuehua.guis.dz.Recipe;
import com.xiaoxiaoowo.yuehua.utils.AdvancementSet;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import org.bukkit.advancement.Advancement;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public final class Shipin {
    public static void dz(Inventory inventory, String id, Player player) {
        id = Help.removeCore(id);
        Inventory recipe = Recipe.shipinContents.get(id);
        //查看核心id有无对应配方
        if (recipe == null) {
            return;
        }

        //查看是否满足配方
        if (!Help.invCompare(recipe, inventory)) {
            return;
        }
        //设置物品
        PlaySound.dz(player);
        inventory.setItem(0, Recipe.idToItem.get(id));

        String lowcaseId = id.toLowerCase();
        Advancement advancement = AdvancementSet.idToAdvancements.get(lowcaseId);
        if (advancement != null) {
            int points = AdvancementSet.idToPoints.get(lowcaseId);
            AdvancementSet.giveAdv(player, advancement, points);
        }
    }
}
