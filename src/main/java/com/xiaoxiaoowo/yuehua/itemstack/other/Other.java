package com.xiaoxiaoowo.yuehua.itemstack.other;

import com.destroystokyo.paper.profile.PlayerProfile;
import com.destroystokyo.paper.profile.ProfileProperty;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.List;
import java.util.UUID;

public final class Other {
    public static final ItemStack ARROW = new ItemStack(Material.ARROW, 1);
    public static final ItemStack NPC_PAOPAO = new ItemStack(Material.WHEAT_SEEDS, 1);
    public static final ItemStack CHONG_SHENG_STONE = new ItemStack(Material.NETHER_STAR, 1);
    public static final ItemStack PlayerHeadXiangZi = new ItemStack(Material.PLAYER_HEAD);
    public static final ItemStack XiaoxiaoHead = new ItemStack(Material.PLAYER_HEAD);

    static {
        ItemMeta itemMeta1 = NPC_PAOPAO.getItemMeta();
        itemMeta1.setMaxStackSize(99);
        itemMeta1.displayName(
                Component.text("NPC对话泡泡").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC,false)
        );
        itemMeta1.setCustomModelData(2);
        NPC_PAOPAO.setItemMeta(itemMeta1);

        ItemMeta itemMeta2 = CHONG_SHENG_STONE.getItemMeta();
        itemMeta2.setMaxStackSize(99);
        itemMeta2.displayName(
                Component.text("重生石").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false)
        );
        CHONG_SHENG_STONE.setItemMeta(itemMeta2);

        ItemMeta itemMeta3 = PlayerHeadXiangZi.getItemMeta();
        SkullMeta skullMeta = (SkullMeta) itemMeta3;

        PlayerProfile profile = Bukkit.createProfile(UUID.randomUUID(), null);
        profile.getProperties().add(new ProfileProperty("textures", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmY2OGQ1MDliNWQxNjY5Yjk3MWRkMWQ0ZGYyZTQ3ZTE5YmNiMWIzM2JmMWE3ZmYxZGRhMjliZmM2ZjllYmYifX19"));

        skullMeta.setPlayerProfile(profile);
        PlayerHeadXiangZi.setItemMeta(skullMeta);

        ItemMeta itemMeta4 = XiaoxiaoHead.getItemMeta();
        SkullMeta skullMeta1 = (SkullMeta) itemMeta4;
        OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer("xiaoxiaoOWO");
        skullMeta1.setPlayerProfile(offlinePlayer.getPlayerProfile());
        XiaoxiaoHead.setItemMeta(skullMeta1);



    }
}
