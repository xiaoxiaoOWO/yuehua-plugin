package com.xiaoxiaoowo.yuehua.commands.playercommand;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.utils.SQL;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public final class Yhteam implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        String playerName = player.getName();
        Yuehua.async(
                () -> {
                    switch (args[0]) {
                        case "create" -> {
                            if (args.length != 1) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }


                            String teamName = SQL.getYhTeam(playerName);
                            if (!teamName.equals("null")) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4你已经加入了一个队伍")
                                );
                                return;
                            }

                            SQL.storeYhTeam(playerName, playerName);
                            player.sendMessage(
                                    Component.text("§6[命令系统]§a队伍创建成功")
                            );


                        }

                        case "destroy" -> {
                            if (args.length != 1) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }


                            String teamName = SQL.getYhTeam(playerName);
                            if (teamName.equals("null")) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4你不在一个队伍中")
                                );
                                return;
                            }

                            if (!teamName.equals(playerName)) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4你不是队长")
                                );
                                return;
                            }

                            List<String> teamMembers = SQL.getTeamPlayer(teamName);
                            for (String name : teamMembers) {
                                SQL.storeYhTeam(name, "null");
                                Player playerInner = Bukkit.getPlayer(name);
                                if (playerInner != null && playerInner.isOnline()) {
                                    playerInner.sendMessage(
                                            Component.text("§6[命令系统]§a当前队伍已被解散")
                                    );
                                }

                            }

                        }

                        case "join" -> {
                            if (args.length != 2) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }

                            String hisTeam = SQL.getYhTeam(playerName);
                            if (!hisTeam.equals("null")) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4你已经加入了一个队伍")
                                );
                                return;
                            }

                            String applyName = args[1];

                            Player applyPlayer = Bukkit.getPlayer(applyName);

                            if (applyPlayer == null || !applyPlayer.isOnline()) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4该玩家不在线")
                                );
                                return;
                            }

                            String applyTeam = SQL.getYhTeam(applyName);

                            if (applyTeam.equals("null")) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4该队伍不存在")
                                );
                                return;
                            }

                            if (!applyTeam.equals(applyName)) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4该玩家不是队长")
                                );
                                return;
                            }

                            SQL.storeYhTeamApply(playerName, applyTeam);

                            player.sendMessage(
                                    Component.text("§6[命令系统]§a申请已发送")
                            );

                            applyPlayer.sendMessage(
                                    Component.text("§6[命令系统]§a玩家：§b" + playerName + "§a申请加入队伍")
                            );

                        }

                        case "leave" -> {
                            if (args.length != 1) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }

                            String teamName = SQL.getYhTeam(playerName);
                            if (teamName.equals("null")) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4你不在一个队伍中")
                                );
                                return;
                            }

                            if (teamName.equals(playerName)) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4你是队长，只能解散队伍")
                                );
                                return;
                            }

                            SQL.storeYhTeam(playerName, "null");

                            player.sendMessage(
                                    Component.text("§6[命令系统]§a已退出队伍")
                            );

                            Player leader = Bukkit.getPlayer(teamName);

                            if (leader != null && leader.isOnline()) {
                                leader.sendMessage(
                                        Component.text("§6[命令系统]§a玩家§b" + playerName + "§a已退出队伍")
                                );
                            }
                        }

                        case "accept" -> {
                            if (args.length != 2) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }

                            String teamName = SQL.getYhTeam(playerName);

                            if (teamName.equals("null")) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4你不在一个队伍中")
                                );
                                return;
                            }

                            if (!teamName.equals(playerName)) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4你不是队长")
                                );
                                return;
                            }

                            String args1 = args[1];
                            String teamApply = SQL.getYhTeamApply(args1);

                            if (teamApply.equals("null")) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4该玩家没有申请")
                                );
                                return;
                            }

                            if (!teamApply.equals(teamName)) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4该玩家申请的不是你的队伍")
                                );
                                return;
                            }

                            Player player1 = Bukkit.getPlayer(args1);
                            SQL.storeYhTeam(args1, playerName);
                            SQL.deleteYhTeamApply(args1);

                            if (player1 != null && player1.isOnline()) {
                                player1.sendMessage(
                                        Component.text("§6[命令系统]§a成功加入队伍")
                                );
                            }

                            player.sendMessage(
                                    Component.text("§6[命令系统]§a批准玩家加入队伍")
                            );

                        }

                        case "refuse" -> {
                            if (args.length != 2) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }

                            String teamName = SQL.getYhTeam(playerName);

                            if (teamName.equals("null")) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4你不在一个队伍中")
                                );
                                return;
                            }

                            if (!teamName.equals(playerName)) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4你不是队长")
                                );
                                return;
                            }

                            String args1 = args[1];
                            String teamApply = SQL.getYhTeamApply(args1);

                            if (teamApply.equals("null")) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4该玩家没有申请")
                                );
                                return;
                            }

                            if (!teamApply.equals(teamName)) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4该玩家申请的不是你的队伍")
                                );
                                return;
                            }

                            Player player1 = Bukkit.getPlayer(args1);
                            SQL.deleteYhTeamApply(args1);

                            if (player1 != null && player1.isOnline()) {
                                player1.sendMessage(
                                        Component.text("§6[命令系统]§4被拒绝加入队伍")
                                );
                            }


                            player.sendMessage(
                                    Component.text("§6[命令系统]§a拒绝玩家加入队伍")
                            );
                        }

                        case "kick" -> {
                            if (args.length != 2) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }

                            String teamName = SQL.getYhTeam(playerName);

                            if (teamName.equals("null")) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4你不在一个队伍中")
                                );
                                return;
                            }

                            if (!teamName.equals(playerName)) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4你不是队长")
                                );
                                return;
                            }

                            String args1 = args[1];

                            String hisTeam = SQL.getYhTeam(args1);

                            if (!hisTeam.equals(playerName)) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4该玩家不在你的队伍中")
                                );
                                return;
                            }

                            Player player1 = Bukkit.getPlayer(args1);
                            SQL.storeYhTeam(args1, "null");

                            if (player1 != null && player1.isOnline()) {
                                player1.sendMessage(
                                        Component.text("§6[命令系统]§4被踢出队伍")
                                );
                            }


                            player.sendMessage(
                                    Component.text("§6[命令系统]§a成功剔出玩家")
                            );
                        }

                        case "check" -> {
                            String teamName = SQL.getYhTeam(playerName);
                            if (teamName.equals("null")) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a你不在一个队伍中")
                                );
                                return;
                            }

                            player.sendMessage(
                                    Component.text("§6[命令系统]§a你所在的队伍队长是：§b" + teamName)
                            );
                        }

                        default -> player.sendMessage(
                                Component.text("§6[命令系统]§4参数错误")
                        );
                    }
                }
        );

        return true;
    }
}
