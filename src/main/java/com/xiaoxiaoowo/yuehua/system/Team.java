package com.xiaoxiaoowo.yuehua.system;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scoreboard.Scoreboard;

import static com.xiaoxiaoowo.yuehua.guis.Shichang.initialShiChang;

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
            playerTeam.setCanSeeFriendlyInvisibles(false);
            playerTeam.setAllowFriendlyFire(false);
            playerTeam.setOption(org.bukkit.scoreboard.Team.Option.COLLISION_RULE, org.bukkit.scoreboard.Team.OptionStatus.ALWAYS);
            playerTeam.setOption(org.bukkit.scoreboard.Team.Option.DEATH_MESSAGE_VISIBILITY, org.bukkit.scoreboard.Team.OptionStatus.ALWAYS);
        }

        monsterTeam = scoreboard.getTeam("enemy");
        if (monsterTeam == null) {
            monsterTeam = scoreboard.registerNewTeam("enemy");
            monsterTeam.setColor(ChatColor.DARK_RED);
            playerTeam.setCanSeeFriendlyInvisibles(false);
            monsterTeam.setAllowFriendlyFire(false);
            monsterTeam.setOption(org.bukkit.scoreboard.Team.Option.COLLISION_RULE, org.bukkit.scoreboard.Team.OptionStatus.ALWAYS);
            monsterTeam.setOption(org.bukkit.scoreboard.Team.Option.DEATH_MESSAGE_VISIBILITY, org.bukkit.scoreboard.Team.OptionStatus.NEVER);
            initialShiChang();
        }

    }


}
