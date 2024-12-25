package com.xiaoxiaoowo.yuehua.system.dz;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.guis.Recipe;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public final class Fabao {
    public static void dz(Inventory inventory, String id, Player player) {
        Data data = Yuehua.playerData.get(player.getUniqueId());
        id = Help.removeCore(id);
        Inventory recipe = switch (data.job) {
            case 1 -> Recipe.zhanfabaoContents.get(id);

            case 2 -> Recipe.gongfabaoContents.get(id);

            case 3 -> Recipe.danfabaoContents.get(id);

            default -> null;
        };
        //查看核心id有无对应配方
        if(recipe == null){
            return;
        }

        //查看是否满足配方
        if(!Help.invCompare(recipe,inventory)){
            return;
        }
        //设置物品
        inventory.setItem(0,Recipe.idToItem.get(id));
        PlaySound.dz(player);

    }
}
