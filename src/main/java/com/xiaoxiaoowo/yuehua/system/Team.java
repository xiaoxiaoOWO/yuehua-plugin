package com.xiaoxiaoowo.yuehua.system;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.commands.playercommand.Yh;
import com.xiaoxiaoowo.yuehua.utils.SQL;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.inventory.Inventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.scoreboard.Scoreboard;

@SuppressWarnings("deprecation")
public final class Team {
    public static Scoreboard scoreboard;

    public static org.bukkit.scoreboard.Team playerTeam;
    public static org.bukkit.scoreboard.Team monsterTeam;

    public static void init() {
        scoreboard = Bukkit.getScoreboardManager().getMainScoreboard();

        //队伍
        playerTeam = scoreboard.getTeam("player");
        if (playerTeam == null) {
            playerTeam = scoreboard.registerNewTeam("player");
            playerTeam.setColor(ChatColor.YELLOW);
            playerTeam.setOption(org.bukkit.scoreboard.Team.Option.DEATH_MESSAGE_VISIBILITY, org.bukkit.scoreboard.Team.OptionStatus.ALWAYS);
        }

        monsterTeam = scoreboard.getTeam("enemy");
        if (monsterTeam == null) {
            monsterTeam = scoreboard.registerNewTeam("enemy");
            monsterTeam.setColor(ChatColor.DARK_RED);
            monsterTeam.setOption(org.bukkit.scoreboard.Team.Option.DEATH_MESSAGE_VISIBILITY, org.bukkit.scoreboard.Team.OptionStatus.NEVER);
            initialShiChang();
        }

    }

    private static void initialShiChang() {
        for (int i = 0; i < 100; i++) {
            Inventory inventory = Bukkit.createInventory(null, 54, Component.text("全球市场[第" + (i + 1) + "页]").color(NamedTextColor.AQUA));
            if (i != 99) {
                inventory.setItem(0, Yh.TO_NEXT);
            }
            inventory.setItem(53, Yh.BACK_BEFORE);
            SQL.storeShiChang(i, inventory);
            Yuehua.shichang.set(i, inventory);
        }
    }
}
