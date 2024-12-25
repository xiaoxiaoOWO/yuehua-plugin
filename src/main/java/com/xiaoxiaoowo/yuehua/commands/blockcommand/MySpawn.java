package com.xiaoxiaoowo.yuehua.commands.blockcommand;

import com.xiaoxiaoowo.yuehua.entity.monster.east.normal.*;
import com.xiaoxiaoowo.yuehua.entity.monster.east.special.*;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.block.CommandBlock;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Random;

public final class MySpawn implements CommandExecutor {
    public static final Random random = new Random();


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        int timeIndex;
        try {
            timeIndex = Integer.parseInt(args[1]);
            if ((GetEntity.world.getGameTime() % 1000) == timeIndex) {
                if (sender instanceof Player player) {
                    Scheduler.async(() -> player.sendMessage(
                            Component.text("§6[命令系统]§4你没有权限使用这个命令")
                    ));
                    return true;
                }
                BlockCommandSender blockCommandSender = (BlockCommandSender) sender;
                CommandBlock commandBlock = (CommandBlock) blockCommandSender.getBlock().getState();
                Location location = commandBlock.getLocation().add(0.5, 2, 0.5);
                Collection<Entity> players = GetEntity.getPlayers(location, 10, 10, 10);
                if (players.isEmpty()) {
                    return true;
                }
                Collection<Entity> monsters = GetEntity.getMonsters(location, 12, 12, 12);
                if (monsters.size() > 5) {
                    return true;
                }

                String id = args[0];
                int randomNextTime = (timeIndex + 250 + random.nextInt(0, 750)) % 1000;
                commandBlock.setCommand(String.format("myspawn %s %d", id, randomNextTime));
                commandBlock.update();


                switch (id) {
                    case "eastKulou" -> KuLou.spawn(location);
                    case "eastZhizhu" -> ZhiZhu.spawn(location);
                    case "eastJiangshi" -> JiangShi.spawn(location);

                    case "eastZhizhuJinyin" -> ZhiZhuJinYin.spawn(location);
                    case "eastDuFeng" -> DuFeng.spawn(location);
                    case "eastkugugongjianshou" -> KuGuGongJianShou.spawn(location);
                    case "eastjiangshijinyin" -> ChiJianJiangShi.spawn(location);

                    case "shanshenshooter" -> ShanshenShooter.spawn(location);
                    case "shanshenspider" -> ShanshenSpider.spawn(location);
                    case "shanshenzombie" -> ShanshenZombie.spawn(location);

                    case "yaojindufeng" -> YaoJingMiFeng.spawn(location);
                    case "yaojinshooter" -> YaoJinShooter.spawn(location);
                    case "yaojingpanda" -> YaoJingPanda.spawn(location);
                }
            }

        } catch (Exception e) {
            BlockCommandSender blockCommandSender = (BlockCommandSender) sender;
            CommandBlock commandBlock = (CommandBlock) blockCommandSender.getBlock().getState();
            String id = args[0];
            int randomNextTime = random.nextInt(0, 1000);
            commandBlock.setCommand(String.format("myspawn %s %d", id, randomNextTime));
            commandBlock.update();
        }


        return true;
    }
}
