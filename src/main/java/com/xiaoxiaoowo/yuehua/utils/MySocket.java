package com.xiaoxiaoowo.yuehua.utils;

import com.xiaoxiaoowo.yuehua.commands.playercommand.Yh;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import static com.xiaoxiaoowo.yuehua.Yuehua.mySocket;

public final class MySocket implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                if (mySocket.isClosed()) {
                    Bukkit.shutdown();
                    break;
                }
                Socket clientSocket = mySocket.accept(); // 接受客户端连接
                handleClientConnection(clientSocket); // 在同一线程中处理客户端连接
            } catch (IOException e) {
                Bukkit.shutdown();
                break;
            }
        }
    }


    private void handleClientConnection(Socket clientSocket) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            String inputLine;
            String getFromClient = "";
            while ((inputLine = in.readLine()) != null && !clientSocket.isClosed()) {
                getFromClient = inputLine;
            }
            String[] strings = getFromClient.split("->");
            String key = strings[0];
            String value = strings[1];
            switch (key){
                case "menu" -> {
                    Player player = Bukkit.getPlayer(value);
                    if(player == null){
                        return;
                    }

                    Scheduler.sync(
                            () -> {
                                player.openInventory(Yh.MAIN_MENU);
                                PlaySound.openInventory(player);
                            }
                    );

                }

                case "skill1" -> {
                    Player player = Bukkit.getPlayer(value);
                    if(player == null){
                        return;
                    }
                    SendInformation.sendMes(Component.text("§e[游戏机制]§4此功能仍未完善"),player);
                }

                case "skill2" -> {
                    Player player = Bukkit.getPlayer(value);
                    if(player == null){
                        return;
                    }
                    SendInformation.sendMes(Component.text("§e[游戏机制]§4此功能仍未完善"),player);
                }

                case "skill3" -> {
                    Player player = Bukkit.getPlayer(value);
                    if(player == null){
                        return;
                    }
                    SendInformation.sendMes(Component.text("§e[游戏机制]§4此功能仍未完善"),player);
                }

                case "skill4" -> {
                    Player player = Bukkit.getPlayer(value);
                    if(player == null){
                        return;
                    }
                    SendInformation.sendMes(Component.text("§e[游戏机制]§4此功能仍未完善"),player);
                }

                case "skill5" -> {
                    Player player = Bukkit.getPlayer(value);
                    if(player == null){
                        return;
                    }
                    SendInformation.sendMes(Component.text("§e[游戏机制]§4此功能仍未完善"),player);
                }

                case  "ld" ->{
                    Player player = Bukkit.getPlayer(value);
                    if(player == null){
                        return;
                    }
                }

                case  "ys" ->{
                    Player player = Bukkit.getPlayer(value);
                    if(player == null){
                        return;
                    }
                }
            }


        } catch (IOException e) {
            Bukkit.shutdown();
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                Bukkit.shutdown();
            }
        }
    }
}
