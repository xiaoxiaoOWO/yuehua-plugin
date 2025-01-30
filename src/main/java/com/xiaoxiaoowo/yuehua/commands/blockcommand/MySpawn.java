package com.xiaoxiaoowo.yuehua.commands.blockcommand;

import java.util.Collection;
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.block.CommandBlock;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.jetbrains.annotations.NotNull;

import com.xiaoxiaoowo.yuehua.entity.monster.east.normal.ChiJianJiangShi;
import com.xiaoxiaoowo.yuehua.entity.monster.east.normal.DuFeng;
import com.xiaoxiaoowo.yuehua.entity.monster.east.normal.JiangShi;
import com.xiaoxiaoowo.yuehua.entity.monster.east.normal.KuGuGongJianShou;
import com.xiaoxiaoowo.yuehua.entity.monster.east.normal.KuLou;
import com.xiaoxiaoowo.yuehua.entity.monster.east.normal.ZhiZhu;
import com.xiaoxiaoowo.yuehua.entity.monster.east.normal.ZhiZhuJinYin;
import com.xiaoxiaoowo.yuehua.entity.monster.east.special.ShanshenShooter;
import com.xiaoxiaoowo.yuehua.entity.monster.east.special.ShanshenSpider;
import com.xiaoxiaoowo.yuehua.entity.monster.east.special.ShanshenZombie;
import com.xiaoxiaoowo.yuehua.entity.monster.east.special.YaoJinShooter;
import com.xiaoxiaoowo.yuehua.entity.monster.east.special.YaoJingMiFeng;
import com.xiaoxiaoowo.yuehua.entity.monster.east.special.YaoJingPanda;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;

public final class MySpawn implements CommandExecutor {
    public static final Random random = new Random();


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        int timeIndex;
        try {
            timeIndex = Integer.parseInt(args[1]);
            if ((GetEntity.world.getGameTime() % 600) == timeIndex) {
                BlockCommandSender blockCommandSender = (BlockCommandSender) sender;
                CommandBlock commandBlock = (CommandBlock) blockCommandSender.getBlock().getState();
                Location location = commandBlock.getLocation().add(0.5, 2, 0.5);
                Collection<Entity> players = GetEntity.getPlayers(location, 10, 10, 10);
                if (players.isEmpty()) {
                    return true;
                }
                Collection<Entity> monsters = GetEntity.getMonsters(location, 12, 12, 12);
                if (monsters.size() > 3) {
                    return true;
                }

                String id = args[0];
                int randomNextTime = (timeIndex + 200 + random.nextInt(0, 400)) % 600;
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
            }else if (timeIndex >= 600) {
                BlockCommandSender blockCommandSender = (BlockCommandSender) sender;
                CommandBlock commandBlock = (CommandBlock) blockCommandSender.getBlock().getState();
                String id = args[0];
                int randomNextTime = random.nextInt(0, 600);
                commandBlock.setCommand(String.format("myspawn %s %d", id, randomNextTime));
                commandBlock.update();
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            BlockCommandSender blockCommandSender = (BlockCommandSender) sender;
            CommandBlock commandBlock = (CommandBlock) blockCommandSender.getBlock().getState();
            String id = args[0];
            int randomNextTime = random.nextInt(0, 600);
            commandBlock.setCommand(String.format("myspawn %s %d", id, randomNextTime));
            commandBlock.update();
        }


        return true;
    }
}
