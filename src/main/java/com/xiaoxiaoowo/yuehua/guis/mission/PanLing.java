package com.xiaoxiaoowo.yuehua.guis.mission;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import io.papermc.paper.datacomponent.DataComponentTypes;
import io.papermc.paper.persistence.PersistentDataContainerView;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;

public class PanLing {
    public static final Inventory jianyi = Bukkit.createInventory(null, 9, Component.text("剑意").color(NamedTextColor.AQUA));

    public static final Inventory xuanwu = Bukkit.createInventory(null, 9, Component.text("水族祭坛").color(NamedTextColor.AQUA));

    public static final ItemStack tijiao = new ItemStack(Material.INK_SAC);

    public static final ItemStack tijiaoxuanwu = new ItemStack(Material.INK_SAC);

    static {
        tijiao.editMeta(itemMeta -> {
            itemMeta.displayName(Component.text("§b将天地人剑意按顺序放于一二三格后，点我提交任务"));
        });
        tijiao.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "ink_sac/1"));
        jianyi.setItem(8, tijiao);

        tijiaoxuanwu.editMeta(itemMeta -> {
            itemMeta.displayName(Component.text("§b将金木水火土元素按顺序放于一二三四五格后，点我提交任务"));
        });
        tijiaoxuanwu.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "ink_sac/1"));
        xuanwu.setItem(8, tijiaoxuanwu);

    }

    public static void tijiaoXuanWu(Player player) {
        ItemStack itemStack0 = xuanwu.getItem(0);
        if (itemStack0 == null) {
            return;
        }
        PersistentDataContainerView persistentDataContainerView = itemStack0.getPersistentDataContainer();
        if (!persistentDataContainerView.has(DataContainer.id)) {
            return;
        }
        ItemStack itemStack1 = xuanwu.getItem(1);
        if (itemStack1 == null) {
            return;
        }
        PersistentDataContainerView persistentDataContainerView1 = itemStack1.getPersistentDataContainer();
        if (!persistentDataContainerView1.has(DataContainer.id)) {
            return;
        }
        ItemStack itemStack2 = xuanwu.getItem(2);
        if (itemStack2 == null) {
            return;
        }
        PersistentDataContainerView persistentDataContainerView2 = itemStack2.getPersistentDataContainer();
        if (!persistentDataContainerView2.has(DataContainer.id)) {
            return;
        }
        ItemStack itemStack3 = xuanwu.getItem(3);
        if (itemStack3 == null) {
            return;
        }
        PersistentDataContainerView persistentDataContainerView3 = itemStack3.getPersistentDataContainer();
        if (!persistentDataContainerView3.has(DataContainer.id)) {
            return;
        }
        ItemStack itemStack4 = xuanwu.getItem(4);
        if (itemStack4 == null) {
            return;
        }
        PersistentDataContainerView persistentDataContainerView4 = itemStack4.getPersistentDataContainer();
        if (!persistentDataContainerView4.has(DataContainer.id)) {
            return;
        }

        if (itemStack0.getAmount() != 10) {
            return;
        }

        if (itemStack1.getAmount() != 10) {
            return;
        }
        if (itemStack2.getAmount() != 10) {
            return;
        }
        if (itemStack3.getAmount() != 10) {
            return;
        }
        if (itemStack4.getAmount() != 10) {
            return;
        }

        String id0 = persistentDataContainerView.get(DataContainer.id, PersistentDataType.STRING);
        String id1 = persistentDataContainerView1.get(DataContainer.id, PersistentDataType.STRING);
        String id2 = persistentDataContainerView2.get(DataContainer.id, PersistentDataType.STRING);
        String id3 = persistentDataContainerView3.get(DataContainer.id, PersistentDataType.STRING);
        String id4 = persistentDataContainerView4.get(DataContainer.id, PersistentDataType.STRING);


        if (id0.equals("jin") && id1.equals("mu") && id2.equals("shui") && id3.equals("huo") && id4.equals("tu")) {
            xuanwu.setItem(0, null);
            xuanwu.setItem(1, null);
            xuanwu.setItem(2, null);
            xuanwu.setItem(3, null);
            xuanwu.setItem(4, null);

            if (player.getScoreboardTags().contains("xuanwu")) {
                SendInformation.sendMes(player, Component.text("§e[支线任务]§4你已经获得了进入玄武祭坛的许可！"));
                Scheduler.sync(player::closeInventory);
                return;
            }

            player.addScoreboardTag("xuanwu");
            PlaySound.success(player);
            SendInformation.sendMes(player, Component.text("§e[支线任务]§a获得进入玄武祭坛的许可"));
            Scheduler.sync(player::closeInventory);
        }
    }

    public static void tijiaoJianYi(Player player) {
        ItemStack itemStack0 = jianyi.getItem(0);
        if (itemStack0 == null) {
            return;
        }
        PersistentDataContainerView persistentDataContainerView = itemStack0.getPersistentDataContainer();
        if (!persistentDataContainerView.has(DataContainer.id)) {
            return;
        }
        ItemStack itemStack1 = jianyi.getItem(1);
        if (itemStack1 == null) {
            return;
        }
        PersistentDataContainerView persistentDataContainerView1 = itemStack1.getPersistentDataContainer();
        if (!persistentDataContainerView1.has(DataContainer.id)) {
            return;
        }
        ItemStack itemStack2 = jianyi.getItem(2);
        if (itemStack2 == null) {
            return;
        }
        PersistentDataContainerView persistentDataContainerView2 = itemStack2.getPersistentDataContainer();
        if (!persistentDataContainerView2.has(DataContainer.id)) {
            return;
        }

        String id0 = persistentDataContainerView.get(DataContainer.id, PersistentDataType.STRING);
        String id1 = persistentDataContainerView1.get(DataContainer.id, PersistentDataType.STRING);
        String id2 = persistentDataContainerView2.get(DataContainer.id, PersistentDataType.STRING);

        if (id0.equals("jianyiTian") && id1.equals("jianyiDi") && id2.equals("jianyiRen")) {
            jianyi.setItem(0, null);
            jianyi.setItem(1, null);
            jianyi.setItem(2, null);

            if (player.getScoreboardTags().contains("jianyi")) {
                SendInformation.sendMes(player, Component.text("§e[支线任务]§4你已经获得了奖励！"));
                Scheduler.sync(player::closeInventory);
                return;
            }

            PlaySound.success(player);
            player.teleport(new Location(GetEntity.world, 1351.5, 66, 517.5, 0, 0));
        }

    }
}
