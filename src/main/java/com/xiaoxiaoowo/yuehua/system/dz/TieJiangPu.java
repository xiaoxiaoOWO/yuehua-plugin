package com.xiaoxiaoowo.yuehua.system.dz;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.guis.Recipe;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public final class TieJiangPu {
    public static void dz(Inventory inventory, String id, Player player){
        Data data = Yuehua.playerData.get(player.getUniqueId());
        id = Help.removeCore(id);
        Inventory recipe = switch (data.job) {
            case 1 -> Recipe.zhanarmorContents.get(id);

            case 2 -> Recipe.gongarmorContents.get(id);

            case 3 -> Recipe.danarmorContents.get(id);

            default -> null;
        };
        //查看核心id有无对应配方
        if(recipe == null){
            recipe = switch (data.job){
                case 1 -> Recipe.zhanweaponContents.get(id);

                case 2 -> Recipe.gongweaponContents.get(id);

                case 3 -> Recipe.danweaponContents.get(id);

                default -> null;
            };

            if(recipe == null){

                recipe = switch (data.job){
                    case 1 -> Recipe.zhanbiweaponContents.get(id);

                    case 2 -> Recipe.gongbiweaponContents.get(id);

                    case 3 -> Recipe.danbiweaponContents.get(id);

                    default -> null;
                };

            }
        }


        if (recipe == null) {
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
