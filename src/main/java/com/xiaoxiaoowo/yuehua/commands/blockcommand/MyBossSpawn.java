package com.xiaoxiaoowo.yuehua.commands.blockcommand;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.entity.monster.east.boss.JIANXIGUIMEI;
import com.xiaoxiaoowo.yuehua.entity.monster.east.boss.LinYouDuZhu;
import com.xiaoxiaoowo.yuehua.entity.monster.east.boss.ZHIZHUNVWANG;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
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

public final class MyBossSpawn implements CommandExecutor {
    public static final Random random = new Random();

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        int timeIndex = Integer.parseInt(args[1]);
        if ((GetEntity.world.getGameTime() % 2400) == timeIndex) {
            if (sender instanceof Player player) {
                Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> {
                    player.sendMessage(
                            Component.text("§6[命令系统]§4你没有权限使用这个命令")
                    );
                });
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
            for (Entity entity : monsters) {
                MonsterData monsterData = Yuehua.monsterData.get(entity.getUniqueId());
                if (monsterData.id.equals(id)) {
                    return true;
                }
            }
            int randomNextTime = (timeIndex + 600 + random.nextInt(0, 1800)) % 2400;
            commandBlock.setCommand(String.format("mybossspawn %s %d", id, randomNextTime));
            commandBlock.update();


            switch (id) {
                case "zhizhunvwang" -> ZHIZHUNVWANG.spawn(location);
                case "linyouduzhu" -> LinYouDuZhu.spawn(location);
                case "jianxiguimei" -> JIANXIGUIMEI.spawn(location);
            }
        }


        return true;
    }


}
