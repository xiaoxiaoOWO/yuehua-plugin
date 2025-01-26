package com.xiaoxiaoowo.yuehua.items.other;

import com.destroystokyo.paper.profile.PlayerProfile;
import com.destroystokyo.paper.profile.ProfileProperty;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.UUID;

public final class Skull {
    public static final ItemStack PlayerHeadXiangZi = new ItemStack(Material.PLAYER_HEAD);
    public static final ItemStack XiaoxiaoHead = new ItemStack(Material.PLAYER_HEAD);
    public static final ItemStack FuLongHead = new ItemStack(Material.PLAYER_HEAD);

    //神仙人妖战
    public static final ItemStack shenHead = new ItemStack(Material.PLAYER_HEAD);
    public static final ItemStack xianHead = new ItemStack(Material.PLAYER_HEAD);
    public static final ItemStack renHead = new ItemStack(Material.PLAYER_HEAD);
    public static final ItemStack yaoHead = new ItemStack(Material.PLAYER_HEAD);
    public static final ItemStack zhanshenHead = new ItemStack(Material.PLAYER_HEAD);

    public static final String shenid = "eyJ0aW1lc3RhbXAiOjE0MTEyODYxMjYzMjIsInByb2ZpbGVJZCI6IjViYjE5ZjBjNDBjNjQzMmZhMGY0NTQyZDAzY2YzZGNjIiwicHJvZmlsZU5hbWUiOiJBdWRpYWNlMDgwOSIsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jMTlmYzlhZTM3YmZkMTNlY2I5ZmNkMmJlNWYxOWRhZjkzOWI2OTA2ZjU5NjU3NmFlYWU1M2QxYjE1NGRlYiJ9fX0=";
    public static final String xianid = "eyJ0aW1lc3RhbXAiOjE0MTEyODUyNjk4MTMsInByb2ZpbGVJZCI6IjViYjE5ZjBjNDBjNjQzMmZhMGY0NTQyZDAzY2YzZGNjIiwicHJvZmlsZU5hbWUiOiJBdWRpYWNlMDgwOSIsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80MzFlMTM0NTdmYTczOTllZTg5NmJiZGQ5Y2YwMmE4OTUzYzExMjY3ZjU4Yzk4NmY0ZGJlYjVlZWU5NjYxNSJ9fX0=";
    ;
    public static final String renid = "eyJ0aW1lc3RhbXAiOjE0MTEyODQ4ODc0MzgsInByb2ZpbGVJZCI6IjViYjE5ZjBjNDBjNjQzMmZhMGY0NTQyZDAzY2YzZGNjIiwicHJvZmlsZU5hbWUiOiJBdWRpYWNlMDgwOSIsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hNWFmZmQ2NGVjNzFlNzhhY2NhM2Y0ZWE4Yzk2NzRjN2RhMWNjNmQ0MzQ1Yjg1YTYxOGE3YTM3M2FmYyJ9fX0=";
    public static final String yaoid = "eyJ0aW1lc3RhbXAiOjE0MTEyOTc4MDQ1MzAsInByb2ZpbGVJZCI6IjViYjE5ZjBjNDBjNjQzMmZhMGY0NTQyZDAzY2YzZGNjIiwicHJvZmlsZU5hbWUiOiJBdWRpYWNlMDgwOSIsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84MTlkNzk4OWY0YzVkMTZkNzJiOTQyZmNiMjQzN2NhOGY0ODRlNzFjYTBhNDY3ZGMxMzg5NDlkOGRlMzMifX19";
    public static final String zhanshenid = "eyJ0aW1lc3RhbXAiOjE0MTEyOTc5MTE2MjQsInByb2ZpbGVJZCI6IjViYjE5ZjBjNDBjNjQzMmZhMGY0NTQyZDAzY2YzZGNjIiwicHJvZmlsZU5hbWUiOiJBdWRpYWNlMDgwOSIsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jNTFlNjc0MzY1YTUyOGRmNTE4YThlZDFkODdmN2NjZWJjMzA1ODNiZjZjOTlmOTI4N2ZhYjA0ZTI5NDViMWEifX19";

    static {

        shenHead.editMeta(meta -> {
                    SkullMeta skullMeta = (SkullMeta) meta;
                    PlayerProfile profile = Bukkit.createProfile(UUID.randomUUID(), null);
                    profile.getProperties().add(new ProfileProperty("textures", shenid));
                    skullMeta.setPlayerProfile(profile);
                }
        );

        xianHead.editMeta(meta -> {
                    SkullMeta skullMeta = (SkullMeta) meta;
                    PlayerProfile profile = Bukkit.createProfile(UUID.randomUUID(), null);
                    profile.getProperties().add(new ProfileProperty("textures", xianid));
                    skullMeta.setPlayerProfile(profile);
                }
        );

        renHead.editMeta(meta -> {
                    SkullMeta skullMeta = (SkullMeta) meta;
                    PlayerProfile profile = Bukkit.createProfile(UUID.randomUUID(), null);
                    profile.getProperties().add(new ProfileProperty("textures", renid));
                    skullMeta.setPlayerProfile(profile);
                }
        );

        yaoHead.editMeta(meta -> {
                    SkullMeta skullMeta = (SkullMeta) meta;
                    PlayerProfile profile = Bukkit.createProfile(UUID.randomUUID(), null);
                    profile.getProperties().add(new ProfileProperty("textures", yaoid));
                    skullMeta.setPlayerProfile(profile);
                }
        );

        zhanshenHead.editMeta(meta -> {
                    SkullMeta skullMeta = (SkullMeta) meta;
                    PlayerProfile profile = Bukkit.createProfile(UUID.randomUUID(), null);
                    profile.getProperties().add(new ProfileProperty("textures", zhanshenid));
                    skullMeta.setPlayerProfile(profile);
                }
        );

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

        ItemMeta itemMeta5 = FuLongHead.getItemMeta();
        SkullMeta skullMeta2 = (SkullMeta) itemMeta5;
        OfflinePlayer offlinePlayer1 = Bukkit.getOfflinePlayer("M_Frunze");
        skullMeta2.setPlayerProfile(offlinePlayer1.getPlayerProfile());
        FuLongHead.setItemMeta(skullMeta2);
    }
}
