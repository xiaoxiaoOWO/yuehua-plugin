package com.xiaoxiaoowo.yuehua.guis.dz;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.guis.Yh;
import com.xiaoxiaoowo.yuehua.items.zhuangbei.*;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.SQL;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
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
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.sql.SQLException;
import java.util.List;

public final class DuanZao implements CommandExecutor {
    public static Inventory duanzaotai1 = Bukkit.createInventory(null, 18, Component.text("锻造台[一]").color(NamedTextColor.AQUA));
    public static Inventory duanzaotai2 = Bukkit.createInventory(null, 18, Component.text("锻造台[二]").color(NamedTextColor.AQUA));
    public static Inventory shipindz = Bukkit.createInventory(null, 18, Component.text("饰品锻造台").color(NamedTextColor.AQUA));
    public static Inventory fabaodz = Bukkit.createInventory(null, 18, Component.text("法宝锻造台").color(NamedTextColor.AQUA));
    public static Inventory yiqidz = Bukkit.createInventory(null, 18, Component.text("异器锻造台").color(NamedTextColor.AQUA));
    public static Inventory liandanlu1 = Bukkit.createInventory(null, 18, Component.text("公用炼丹炉[一]").color(NamedTextColor.AQUA));
    public static Inventory liandanlu2 = Bukkit.createInventory(null, 18, Component.text("公用炼丹炉[二]").color(NamedTextColor.AQUA));
    public static Inventory liandanlu3 = Bukkit.createInventory(null, 18, Component.text("公用炼丹炉[三]").color(NamedTextColor.AQUA));
    public static Inventory liandanlu4 = Bukkit.createInventory(null, 18, Component.text("公用炼丹炉[四]").color(NamedTextColor.AQUA));

    public static Inventory Fulingtai = Bukkit.createInventory(null, 9, Component.text("附灵台").color(NamedTextColor.AQUA));
    public static Inventory xiangqiantai = Bukkit.createInventory(null, 9, Component.text("镶嵌台").color(NamedTextColor.AQUA));
    public static ItemStack CHUIZI = new ItemStack(Material.YELLOW_DYE);
    public static ItemStack QIANZI = new ItemStack(Material.YELLOW_DYE);
    public static ItemStack HUOZHEZI = new ItemStack(Material.YELLOW_DYE);
    public static ItemStack FULINGSHA = new ItemStack(Material.YELLOW_DYE);

    public static Inventory recipeZhan = Bukkit.createInventory(null, 9, Component.text("锻造配方[战]").color(NamedTextColor.AQUA));
    public static Inventory recipeGong = Bukkit.createInventory(null, 9, Component.text("锻造配方[弓]").color(NamedTextColor.AQUA));
    public static Inventory recipeDan = Bukkit.createInventory(null, 9, Component.text("锻造配方[丹]").color(NamedTextColor.AQUA));

    public static void getFromSql() throws SQLException {

        duanzaotai1 = SQL.retrieveDuanzaotai("§b锻造台[一]");
        duanzaotai2 = SQL.retrieveDuanzaotai("§b锻造台[二]");

        shipindz = SQL.retrieveDuanzaotai("§b饰品锻造台");
        fabaodz = SQL.retrieveDuanzaotai("§b法宝锻造台");
        yiqidz = SQL.retrieveDuanzaotai("§b异器锻造台");
        liandanlu1 = SQL.retrieveDuanzaotai("§b公用炼丹炉[一]");
        liandanlu2 = SQL.retrieveDuanzaotai("§b公用炼丹炉[二]");
        liandanlu3 = SQL.retrieveDuanzaotai("§b公用炼丹炉[三]");
        liandanlu4 = SQL.retrieveDuanzaotai("§b公用炼丹炉[四]");

        Fulingtai = SQL.retrieveDuanzaotai("§b附灵台");
        ItemStack[] itemStacks = Fulingtai.getContents();
        Fulingtai = Bukkit.createInventory(null, 9, Component.text("附灵台").color(NamedTextColor.AQUA));
        Fulingtai.setContents(itemStacks);

        xiangqiantai = SQL.retrieveDuanzaotai("§b镶嵌台");
        ItemStack[] itemStacks1 = xiangqiantai.getContents();
        xiangqiantai = Bukkit.createInventory(null, 9, Component.text("镶嵌台").color(NamedTextColor.AQUA));
        xiangqiantai.setContents(itemStacks1);

        duanzaotai1.setItem(17, CHUIZI);
        duanzaotai2.setItem(17, CHUIZI);
        shipindz.setItem(17, CHUIZI);
        fabaodz.setItem(17, CHUIZI);
        yiqidz.setItem(17, CHUIZI);
        liandanlu1.setItem(17, HUOZHEZI);
        liandanlu2.setItem(17, HUOZHEZI);
        liandanlu3.setItem(17, HUOZHEZI);
        liandanlu4.setItem(17, HUOZHEZI);

        xiangqiantai.setItem(8, QIANZI);
        Fulingtai.setItem(8, FULINGSHA);
    }

    public static void storeToSql() {

        SQL.storeDuanZaoTai("§b锻造台[一]", duanzaotai1);
        SQL.storeDuanZaoTai("§b锻造台[二]", duanzaotai2);

        SQL.storeDuanZaoTai("§b饰品锻造台", shipindz);
        SQL.storeDuanZaoTai("§b法宝锻造台", fabaodz);
        SQL.storeDuanZaoTai("§b异器锻造台", yiqidz);

        SQL.storeDuanZaoTai("§b公用炼丹炉[一]", liandanlu1);
        SQL.storeDuanZaoTai("§b公用炼丹炉[二]", liandanlu2);
        SQL.storeDuanZaoTai("§b公用炼丹炉[三]", liandanlu3);
        SQL.storeDuanZaoTai("§b公用炼丹炉[四]", liandanlu4);

        SQL.storeDuanZaoTai("§b附灵台", Fulingtai);
        SQL.storeDuanZaoTai("§b镶嵌台", xiangqiantai);
    }


    static {
        ItemStack jian = Weapon.TAO_MU_JIAN.clone();
        ItemMeta jianMeta = jian.getItemMeta();
        jianMeta.displayName(
                Component.text("武器配方").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        jianMeta.lore(
                List.of()
        );
        jian.setItemMeta(jianMeta);
        recipeZhan.setItem(0, jian);

        ItemStack gong = Weapon.TENG_MU_GONG.clone();
        ItemMeta gongMeta = gong.getItemMeta();
        gongMeta.displayName(
                Component.text("武器配方").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        gongMeta.lore(
                List.of()
        );
        gong.setItemMeta(gongMeta);
        recipeGong.setItem(0, gong);

        ItemStack luzi = Weapon.HEI_TIE_GUO.clone();
        ItemMeta luziMeta = luzi.getItemMeta();
        luziMeta.displayName(
                Component.text("武器配方").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        luziMeta.lore(
                List.of()
        );
        luzi.setItemMeta(luziMeta);
        recipeDan.setItem(0, luzi);

        ItemStack armor = ArmorHead.tou1.clone();
        ItemMeta armorMeta = armor.getItemMeta();
        armorMeta.displayName(
                Component.text("护甲配方").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        armorMeta.lore(
                List.of()
        );
        armor.setItemMeta(armorMeta);
        recipeZhan.setItem(1, armor);
        recipeGong.setItem(1, armor);
        recipeDan.setItem(1, armor);

        ItemStack anqi = BiWeapon.FEIREN.clone();
        ItemMeta anqiMeta = anqi.getItemMeta();
        anqiMeta.displayName(
                Component.text("副武器配方").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        anqiMeta.lore(
                List.of()
        );
        anqi.setItemMeta(anqiMeta);
        recipeZhan.setItem(2, anqi);

        ItemStack chong = BiWeapon.HEITIECHONG.clone();
        ItemMeta chongMeta = chong.getItemMeta();
        chongMeta.displayName(
                Component.text("副武器配方").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        chongMeta.lore(
                List.of()
        );
        chong.setItemMeta(chongMeta);
        recipeGong.setItem(2, chong);

        ItemStack xiao = BiWeapon.XIAO.clone();
        ItemMeta xiaoMeta = xiao.getItemMeta();
        xiaoMeta.displayName(
                Component.text("副武器配方").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        xiaoMeta.lore(
                List.of()
        );
        xiao.setItemMeta(xiaoMeta);
        recipeDan.setItem(2, xiao);

        ItemStack fabao = Fabao.ZHAOYAOJIN.clone();
        ItemMeta fabaoMeta = fabao.getItemMeta();
        fabaoMeta.displayName(
                Component.text("法宝配方").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        fabaoMeta.lore(
                List.of()
        );
        fabao.setItemMeta(fabaoMeta);
        recipeZhan.setItem(3, fabao);
        recipeGong.setItem(3, fabao);
        recipeDan.setItem(3, fabao);

        ItemStack shipin = Shipin.PO_SUN_TAN_ZHI_JIE.clone();
        ItemMeta shipinMeta = shipin.getItemMeta();
        shipinMeta.displayName(
                Component.text("饰品配方").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        shipinMeta.lore(
                List.of()
        );
        shipin.setItemMeta(shipinMeta);
        recipeZhan.setItem(4, shipin);
        recipeGong.setItem(4, shipin);
        recipeDan.setItem(4, shipin);

        ItemStack yiqi = YiQi.LAOZHANSHIDUNPAI.clone();
        ItemMeta yiqiMeta = yiqi.getItemMeta();
        yiqiMeta.displayName(
                Component.text("异器配方").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        yiqiMeta.lore(
                List.of()
        );
        yiqi.setItemMeta(yiqiMeta);
        recipeZhan.setItem(5, yiqi);

        ItemStack jiandai = YiQi.LAOLIEHUJIANDAI.clone();
        ItemMeta jiandaiMeta = jiandai.getItemMeta();
        jiandaiMeta.displayName(
                Component.text("异器配方").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        jiandaiMeta.lore(
                List.of()
        );
        jiandai.setItemMeta(jiandaiMeta);
        recipeGong.setItem(5, jiandai);

        ItemStack cuiren = YiQi.FANGSHENDUANBI.clone();
        ItemMeta cuirenMeta = cuiren.getItemMeta();
        cuirenMeta.displayName(
                Component.text("异器配方").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        cuirenMeta.lore(
                List.of()
        );
        cuiren.setItemMeta(cuirenMeta);
        recipeDan.setItem(5, cuiren);

        recipeZhan.setItem(8, Yh.BACK_BEFORE);
        recipeGong.setItem(8, Yh.BACK_BEFORE);
        recipeDan.setItem(8, Yh.BACK_BEFORE);

        ItemMeta itemMeta = CHUIZI.getItemMeta();
        itemMeta.setCustomModelData(15);
        itemMeta.displayName(
                Component.text("锻造锤").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemMeta.lore(
                List.of(
                        Component.text("一号位核心，后续按配方顺序").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC),
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


        duanzaotai1.setItem(17, CHUIZI);
        duanzaotai2.setItem(17, CHUIZI);
        shipindz.setItem(17, CHUIZI);
        fabaodz.setItem(17, CHUIZI);
        yiqidz.setItem(17, CHUIZI);
        liandanlu1.setItem(17, HUOZHEZI);
        liandanlu2.setItem(17, HUOZHEZI);
        liandanlu3.setItem(17, HUOZHEZI);
        liandanlu4.setItem(17, HUOZHEZI);

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
                Scheduler.sync(() -> {
                    player.openInventory(duanzaotai1);
                    PlaySound.openInventory(player);
                });


            }

            case "tiejiangpu2" -> {
                Scheduler.sync(() -> {
                    player.openInventory(duanzaotai2);
                    PlaySound.openInventory(player);
                });

            }

            case "fabao" -> {
                Scheduler.sync(() -> {
                    player.openInventory(fabaodz);
                    PlaySound.openInventory(player);
                });

            }

            case "yiqi" -> {
                Scheduler.sync(() -> {
                    player.openInventory(yiqidz);
                    PlaySound.openInventory(player);
                });

            }

            case "shipin" -> {
                Scheduler.sync(() -> {
                    player.openInventory(shipindz);
                    PlaySound.openInventory(player);
                });

            }

            case "yushi" -> {
                Scheduler.sync(() -> {
                    player.openInventory(xiangqiantai);
                    PlaySound.openInventory(player);
                });

            }

            case "fulin" -> {
                Scheduler.sync(() -> {
                    player.openInventory(Fulingtai);
                    PlaySound.openInventory(player);
                });

            }

            case "liandan1" -> {
                Scheduler.sync(() -> {
                    player.openInventory(liandanlu1);
                    PlaySound.openInventory(player);
                });

            }

            case "liandan2" -> {
                Scheduler.sync(() -> {
                    player.openInventory(liandanlu2);
                    PlaySound.openInventory(player);
                });

            }

            case "liandan3" -> Scheduler.sync(() -> {
                player.openInventory(liandanlu3);
                PlaySound.openInventory(player);
            });

            case "liandan4" -> Scheduler.sync(() -> {
                player.openInventory(liandanlu4);
                PlaySound.openInventory(player);
            });

            case "huishou" -> Scheduler.sync(() -> {
                player.openInventory(HuiShou.huishou);
                PlaySound.openInventory(player);
            });

        }


        return true;
    }


}
