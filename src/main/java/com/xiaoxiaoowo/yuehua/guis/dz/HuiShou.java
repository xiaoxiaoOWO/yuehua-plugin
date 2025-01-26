package com.xiaoxiaoowo.yuehua.guis.dz;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import io.papermc.paper.persistence.PersistentDataContainerView;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public class HuiShou {
    public static final Inventory huishou = Bukkit.createInventory(null, 9, Component.text("回收2阶装备").color(NamedTextColor.AQUA));

    static {
        ItemStack QIANZI = new ItemStack(Material.YELLOW_DYE);
        ItemMeta itemMeta1 = QIANZI.getItemMeta();
        itemMeta1.setCustomModelData(16);
        itemMeta1.displayName(
                Component.text("拆解钳").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemMeta1.lore(
                List.of(
                        Component.text("点击我拆解容器内的所有二阶装备").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC),
                        Component.text("得到的铜钱将直接存入存款！").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
                )
        );
        QIANZI.setItemMeta(itemMeta1);
        huishou.setItem(8, QIANZI);
    }

    public static void doChaiJie(Player player) {
        int money = 0;
        for (int i = 0; i < 8; i++) {
            ItemStack itemStack = huishou.getItem(i);
            if (itemStack == null) {
                continue;
            }
            PersistentDataContainerView pdc = itemStack.getPersistentDataContainer();
            if (!pdc.has(DataContainer.id)) {
                continue;
            }
            if (pdc.has(DataContainer.insertid)) {
                String insertId = pdc.get(DataContainer.insertid, PersistentDataType.STRING);
                if (!insertId.equals("null")) {
                    SendInformation.sendMes(player, Component.text("§e[回收系统]§4你的装备的玉石还没有拆卸！"));
                    continue;
                }
            }


            switch (pdc.get(DataContainer.id, PersistentDataType.STRING)) {
                case "touSp2", "zhanTou2", "gongTou2", "danTou2",
                     "xiongSp2", "zhanXiong2", "gongXiong2", "danXiong2",
                     "tuiSp2", "zhanTui2", "gongTui2", "danTui2",
                     "xieSp2", "zhanXie2", "gongXie2", "danXie2" -> {
                    money += 350;
                    huishou.setItem(i, null);
                }

                case "kaiShanDao", "qinTongJian", "yinYueQiang",
                     "qinTongGong", "heiTieNu", "fuRongGong",
                     "qinTongGuo" -> {
                    money += 700;
                    huishou.setItem(i, null);
                }
            }

        }


        if (money != 0) {
            Data data = Yuehua.playerData.get(player.getUniqueId());
            data.money += money;
            PlaySound.closeInventory(player);
            Scheduler.sync(player::closeInventory);
            SendInformation.sendMes(player, Component.text("§e[拆解]§a回收装备获得： §b" + money));
        }

    }
}
