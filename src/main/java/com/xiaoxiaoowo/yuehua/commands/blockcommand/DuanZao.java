package com.xiaoxiaoowo.yuehua.commands.blockcommand;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public final class DuanZao implements CommandExecutor {
    public static final Inventory duanzaotai1 = Bukkit.createInventory(null, 9,Component.text("锻造台").color(NamedTextColor.AQUA));
    public static final Inventory duanzaotai2 = Bukkit.createInventory(null, 9, Component.text("锻造台").color(NamedTextColor.AQUA));
    public static final Inventory shipindz = Bukkit.createInventory(null, 9, Component.text("饰品锻造台").color(NamedTextColor.AQUA));
    public static final Inventory fabaodz = Bukkit.createInventory(null, 9, Component.text("法宝锻造台").color(NamedTextColor.AQUA));
    public static final Inventory yiqidz = Bukkit.createInventory(null, 9, Component.text("异器锻造台").color(NamedTextColor.AQUA));
    public static final Inventory liandanlu = Bukkit.createInventory(null, 9, Component.text("公用炼丹炉").color(NamedTextColor.AQUA));


    public static final Inventory Fulingtai = Bukkit.createInventory(null, 9, Component.text("附灵台").color(NamedTextColor.AQUA));
    public static final Inventory xiangqiantai = Bukkit.createInventory(null, 9, Component.text("镶嵌台").color(NamedTextColor.AQUA));
    public static final ItemStack CHUIZI = new ItemStack(Material.YELLOW_DYE);
    public static final ItemStack QIANZI = new ItemStack(Material.YELLOW_DYE);
    public static final ItemStack HUOZHEZI = new ItemStack(Material.YELLOW_DYE);
    public static final ItemStack FULINGSHA = new ItemStack(Material.YELLOW_DYE);


    static {
        ItemMeta itemMeta = CHUIZI.getItemMeta();
        itemMeta.setCustomModelData(15);
        itemMeta.displayName(
                Component.text("锻造锤").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemMeta.lore(
                List.of(
                        Component.text("一号位核心，后续按核心配方顺序").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC),
                        Component.text("放置完成后左键我！").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
                )
        );
        CHUIZI.setItemMeta(itemMeta);

        ItemMeta itemMeta1 = QIANZI.getItemMeta();
        itemMeta1.setCustomModelData(16);
        itemMeta1.displayName(
                Component.text("镶嵌钳").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemMeta1.lore(
                List.of(
                        Component.text("一号位装备，二号位玉石").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC),
                        Component.text("放置完成后左键我！").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
                )
        );
        QIANZI.setItemMeta(itemMeta1);

        ItemMeta itemMeta2 = HUOZHEZI.getItemMeta();
        itemMeta2.setCustomModelData(17);
        itemMeta2.displayName(
                Component.text("制丹火").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemMeta2.lore(
                List.of(
                        Component.text("一号位药引，后续按配方顺序").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC),
                        Component.text("放置完成后左键我！").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
                )
        );
        HUOZHEZI.setItemMeta(itemMeta2);

        ItemMeta itemMeta3 = FULINGSHA.getItemMeta();
        itemMeta3.setCustomModelData(18);
        itemMeta3.displayName(
                Component.text("附灵砂").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemMeta3.lore(
                List.of(
                        Component.text("一号位装备，二号位附灵石").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC),
                        Component.text("放置完成后左键我！").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
                )
        );
        FULINGSHA.setItemMeta(itemMeta3);


        duanzaotai1.setItem(8, CHUIZI);
        duanzaotai2.setItem(8, CHUIZI);
        shipindz.setItem(8, CHUIZI);
        fabaodz.setItem(8, CHUIZI);
        yiqidz.setItem(8, CHUIZI);

        liandanlu.setItem(8, HUOZHEZI);
        xiangqiantai.setItem(8, QIANZI);
        Fulingtai.setItem(8, FULINGSHA);
    }


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player player) {
            Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> {
                player.sendMessage(
                        Component.text("§6[命令系统]§4你没有权限使用这个命令")
                );
            });
            return true;
        }

        BlockCommandSender blockCommandSender = (BlockCommandSender) sender;
        Location location = blockCommandSender.getBlock().getLocation();

        Player player = GetEntity.getNearestPlayer(location, 5, 5, 5);
        if (player == null) {
            return true;
        }

        switch (args[0]) {
            case "tiejiangpu1" -> {
                player.openInventory(duanzaotai1);
                PlaySound.openInventory(player);
            }

            case "tiejiangpu2" -> {
                player.openInventory(duanzaotai2);
                PlaySound.openInventory(player);
            }

            case "fabao" -> {
                player.openInventory(fabaodz);
                PlaySound.openInventory(player);
            }

            case "yiqi" -> {
                player.openInventory(yiqidz);
                PlaySound.openInventory(player);
            }

            case "shipin" -> {
                player.openInventory(shipindz);
                PlaySound.openInventory(player);
            }

            case "yushi" -> {
                player.openInventory(xiangqiantai);
                PlaySound.openInventory(player);
            }

            case "fulin" -> {
                player.openInventory(Fulingtai);
                PlaySound.openInventory(player);
            }

            case "liandan" -> {
                player.openInventory(liandanlu);
                PlaySound.openInventory(player);
            }

        }


        return true;
    }
}
