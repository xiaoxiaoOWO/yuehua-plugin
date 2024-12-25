package com.xiaoxiaoowo.yuehua.commands.playercommand;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.time.ZoneId;
import java.time.ZonedDateTime;


public final class Check implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        if (args.length != 1) {
            SendInformation.sendMes(player, Component.text("§6[命令系统]§4参数错误"));
            return true;
        }
        String value = args[0];
        Data data = Yuehua.playerData.get(player.getUniqueId());

        switch (data.checkState) {
            case 1 -> {
                try {
                    int num = Integer.parseInt(value);
                    if (num == (int) data.extraData.get("checkNum")) {
                        data.checkState = 0;
                        SendInformation.sendMes(player, Component.text("§6[命令系统]§e验证成功！"));
                    } else {
                        SendInformation.sendMes(player, Component.text("§6[命令系统]§4回答错误"));
                    }
                } catch (Exception e) {
                    SendInformation.sendMes(player, Component.text("§6[命令系统]§4回答错误"));
                }
            }

            case 2 -> {
                int day = ZonedDateTime.now(ZoneId.of("Asia/Shanghai")).getDayOfWeek().getValue();

                try {
                    int num = Integer.parseInt(value);
                    if (num == day) {
                        data.checkState = 0;
                        SendInformation.sendMes(player, Component.text("§6[命令系统]§e验证成功！"));
                    } else {
                        SendInformation.sendMes(player, Component.text("§6[命令系统]§4回答错误"));
                    }

                } catch (Exception e) {
                    SendInformation.sendMes(player, Component.text("§6[命令系统]§4回答错误"));
                }
            }

            case 3 -> {
                ZonedDateTime shanghaiTime = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
                int month = shanghaiTime.getMonthValue(); // 获取月份（1-12）

                try {
                    int num = Integer.parseInt(value);
                    if (num == month) {
                        data.checkState = 0;
                        SendInformation.sendMes(player, Component.text("§6[命令系统]§e验证成功！"));
                    } else {
                        SendInformation.sendMes(player, Component.text("§6[命令系统]§4回答错误"));
                    }
                } catch (Exception e) {
                    SendInformation.sendMes(player, Component.text("§6[命令系统]§4回答错误"));
                    return true;
                }
            }

            case 4 -> {
                ZonedDateTime shanghaiTime = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
                int year = shanghaiTime.getYear();       // 获取年份

                try {
                    int num = Integer.parseInt(value);
                    if (num == year) {
                        data.checkState = 0;
                        SendInformation.sendMes(player, Component.text("§6[命令系统]§e验证成功！"));
                    } else {
                        SendInformation.sendMes(player, Component.text("§6[命令系统]§4回答错误"));
                    }
                } catch (Exception e) {
                    SendInformation.sendMes(player, Component.text("§6[命令系统]§4回答错误"));
                    return true;
                }
            }


            case 5 -> {
                if (value.equals("xiaoxiaoOWO")) {
                    data.checkState = 0;
                    SendInformation.sendMes(player, Component.text("§6[命令系统]§e验证成功！"));
                } else {
                    SendInformation.sendMes(player, Component.text("§6[命令系统]§4回答错误"));
                }
            }

            case 6 -> {
                if (value.equals("M_Frunze")) {
                    data.checkState = 0;
                    SendInformation.sendMes(player, Component.text("§6[命令系统]§e验证成功！"));
                } else {
                    SendInformation.sendMes(player, Component.text("§6[命令系统]§4回答错误"));
                }
            }
        }


        return true;
    }
}
