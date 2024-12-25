package com.xiaoxiaoowo.yuehua.utils;

import org.bukkit.Bukkit;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public final class LevelLeaderBoard {
    public static final Objective level;

    static {
        ScoreboardManager scoreboardManager = Bukkit.getScoreboardManager();
        Scoreboard mainScoreboard = scoreboardManager.getMainScoreboard();
        level = mainScoreboard.getObjective("level");
    }

    public static void display(){
        level.setDisplaySlot(DisplaySlot.SIDEBAR);
    }

    public static void undisplay(){
        level.setDisplaySlot(null);
    }
}
