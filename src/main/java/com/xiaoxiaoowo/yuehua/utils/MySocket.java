package com.xiaoxiaoowo.yuehua.utils;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.event.player.Interact;
import com.xiaoxiaoowo.yuehua.guis.Yh;
import com.xiaoxiaoowo.yuehua.guis.op.OpTp;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public final class MySocket {
    public static WebSocketServer server;


    public static void init() {
        server = new WebSocketServer(new InetSocketAddress(23019)) {
            @Override
            public void onOpen(WebSocket conn, ClientHandshake handshake) {

            }

            @Override
            public void onClose(WebSocket conn, int code, String reason, boolean remote) {

            }

            @Override
            public void onMessage(WebSocket conn, String message) {
                String[] parts = message.split("->");
                String playerName = parts[0];
                String value = parts[1];
                Player player = Bukkit.getPlayer(playerName);
                if (player == null) {
                    return;
                }

                switch (value) {
                    case "menu" -> Scheduler.sync(() -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        if (data != null) {
                            data.webSocket = conn;
                        } else {
                            return;
                        }

                        player.openInventory(Yh.MAIN_MENU);
                        PlaySound.openInventory(player);
                    });

                    case "skill1" -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        if (data != null) {
                            data.webSocket = conn;
                        } else {
                            return;
                        }

                        if (player.isSneaking()) {
                            if (doSkill1Shift(data, player)) {
                                return;
                            }
                        }

                        switch (data.job) {
                            case 1, 2 -> Scheduler.sync(() -> doSkill1(data, player));

                            case 3 -> {
                                DanData danData = (DanData) data;
                                int level = danData.zhenfa_level;
                                String id = "jin" + level;
                                Scheduler.sync(() -> Interact.zhenfa(id, danData, player));
                            }
                        }
                    }

                    case "skill2" -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        if (data != null) {
                            data.webSocket = conn;
                        } else {
                            return;
                        }

                        if (player.isSneaking()) {
                            if (doSkill2Shift(data, player)) {
                                return;
                            }
                        }

                        switch (data.job) {
                            case 1, 2 -> Scheduler.sync(() -> doSkill2(data, player));

                            case 3 -> {
                                DanData danData = (DanData) data;
                                int level = danData.zhenfa_level;
                                String id = "mu" + level;
                                Scheduler.sync(() -> Interact.zhenfa(id, danData, player));
                            }
                        }
                    }

                    case "skill3" -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        if (data != null) {
                            data.webSocket = conn;
                        } else {
                            return;
                        }

                        if (player.isSneaking()) {
                            if (doSkill3Shift(data, player)) {
                                return;
                            }
                        }

                        switch (data.job) {
                            case 1, 2 -> Scheduler.sync(() -> doSkill3(data, player));

                            case 3 -> {
                                DanData danData = (DanData) data;
                                int level = danData.zhenfa_level;
                                String id = "shui" + level;
                                Scheduler.sync(() -> Interact.zhenfa(id, danData, player));
                            }
                        }
                    }

                    case "skill4" -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        if (data != null) {
                            data.webSocket = conn;
                        } else {
                            return;
                        }

                        if (player.isSneaking()) {
                            if (doSkill4Shift(data, player)) {
                                return;
                            }
                        }

                        switch (data.job) {
                            case 1, 2 -> Scheduler.sync(() -> doSkill4(data, player));

                            case 3 -> {
                                DanData danData = (DanData) data;
                                int level = danData.zhenfa_level;
                                String id = "huo" + level;
                                Scheduler.sync(() -> Interact.zhenfa(id, danData, player));
                            }
                        }
                    }

                    case "skill5" -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        if (data != null) {
                            data.webSocket = conn;
                        } else {
                            return;
                        }

                        if (player.isSneaking()) {
                            if (doSkill5Shift(data, player)) {
                                return;
                            }
                        }

                        switch (data.job) {
                            case 1, 2 -> Scheduler.sync(() -> doSkill5(data, player));

                            case 3 -> {
                                DanData danData = (DanData) data;
                                int level = danData.zhenfa_level;
                                String id = "tu" + level;
                                Scheduler.sync(() -> Interact.zhenfa(id, danData, player));
                            }
                        }
                    }

                    case "skill6" -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        if (data != null) {
                            data.webSocket = conn;
                        } else {
                            return;
                        }

                        if (player.isSneaking()) {
                            if (doSkill6Shift(data, player)) {
                                return;
                            }
                        }

                        Scheduler.sync(() -> doSkill6(data, player));
                    }

                    case "skill7" -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        if (data != null) {
                            data.webSocket = conn;
                        } else {
                            return;
                        }

                        if (player.isSneaking()) {
                            if (doSkill7Shift(data, player)) {
                                return;
                            }
                        }

                        Scheduler.sync(() -> doSkill7(data, player));
                    }

                    case "ld" -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        if (data != null) {
                            data.webSocket = conn;
                        } else {
                            return;
                        }
                        if (data.job != 3) {
                            if (player.isOp()) {
                                Scheduler.sync(() -> player.openInventory(OpTp.OPTP));
                            }
                            return;
                        }
                        DanData danData = (DanData) data;
                        if (danData.danlu == null) {
                            return;
                        }
                        Scheduler.sync(() -> {
                            player.openInventory(danData.danlu);
                            PlaySound.openInventory(player);
                        });

                    }

                    case "ys" -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        if (data != null) {
                            data.webSocket = conn;
                        } else {
                            return;
                        }
                        if (data.job != 3) {
                            return;
                        }
                        DanData danData = (DanData) data;

                        int level = danData.zhenfa_level;
                        level = (level + 1) % 3;
                        danData.zhenfa_level = level;

                        switch (level) {
                            case 0 -> SendInformation.sendMes(player, Component.text("§e[游戏机制]§a已切换为普通元素"));
                            case 1 -> SendInformation.sendMes(player, Component.text("§e[游戏机制]§a已切换为精炼元素"));
                            case 2 -> SendInformation.sendMes(player, Component.text("§e[游戏机制]§a已切换为浓缩元素"));
                        }
                    }

                    case "valid" -> {
                        int day = ZonedDateTime.now(ZoneId.of("Asia/Shanghai")).getDayOfWeek().getValue();
                        int hashCode = Integer.parseInt(parts[2]);

                        //mod count
                        //mod total size
                        //directory count(不含.开头，不含crash-reports，不含screenshots,debug,地平线,不含replay_recordings)
                        //jar size
                        String sbString = playerName +
                                day +
                                28 +
                                62527998  +
                                10 +
                                28335587;
                        int serverHashCode = sbString.hashCode();


                        //不带钠
                        String sbString2 = playerName +
                                day +
                                24 +
                                60675956 +
                                10 +
                                28335587;
                        int serverHashCode2 = sbString2.hashCode();

                        if (serverHashCode2 == hashCode || serverHashCode == hashCode) {
                            Yuehua.checkSet.add(player.getUniqueId());
                        } else {
//                            //OP无视规则
//                            if (player.isOp()) {
//                                Yuehua.checkSet.add(player.getUniqueId());
//                            }
                        }


                    }

                    case "res" -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        if (data != null) {
                            data.webSocket = conn;
                        }
                        long size = Long.parseLong(parts[2]);
                        if (size != 90728108 ) {
                            Scheduler.sync(() -> player.kick(Component.text("§c请使用最新官方材质包")));
                        }
                    }

                    case "f" ->
                            SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4你的手持装备尚未拥有第二形态"));

                    default -> {
                    }
                }

            }

            @Override
            public void onError(WebSocket conn, Exception ex) {
                Yuehua.logger.severe("WebSocket error: " + ex.getMessage());
            }

            @Override
            public void onStart() {

            }
        };
        new Thread(server).start();
    }

    public static void sendDataToFabricClient(Data data, String value) {
        WebSocket webSocket = data.webSocket;
        Player player = data.player;

        if (webSocket == null) {
            return;
        }

        if (!webSocket.isOpen()) {
            Scheduler.sync(() -> player.kick(Component.text("§4网络出现了故障")));
            return;
        }

        webSocket.send(value);
    }

    public static boolean doSkill1Shift(Data data, Player player) {
        switch (data.skill1Shift) {
            default -> {
                return false;
            }
        }
    }

    public static boolean doSkill2Shift(Data data, Player player) {
        switch (data.skill2Shift) {
            default -> {
                return false;
            }
        }
    }

    public static boolean doSkill3Shift(Data data, Player player) {
        switch (data.skill3Shift) {
            default -> {
                return false;
            }
        }
    }

    public static boolean doSkill4Shift(Data data, Player player) {
        switch (data.skill4Shift) {
            default -> {
                return false;
            }
        }
    }

    public static boolean doSkill5Shift(Data data, Player player) {
        switch (data.skill5Shift) {
            default -> {
                return false;
            }
        }
    }

    public static boolean doSkill6Shift(Data data, Player player) {
        switch (data.skill6Shift) {
            default -> {
                return false;
            }
        }
    }

    public static boolean doSkill7Shift(Data data, Player player) {
        switch (data.skill7Shift) {
            default -> {
                return false;
            }
        }
    }

    public static void doSkill1(Data data, Player player) {
        switch (data.skill1) {
            default -> {
            }
        }
    }

    public static void doSkill2(Data data, Player player) {
        switch (data.skill2) {
            default -> {
            }
        }
    }

    public static void doSkill3(Data data, Player player) {
        switch (data.skill3) {
            default -> {
            }
        }
    }

    public static void doSkill4(Data data, Player player) {
        switch (data.skill4) {
            default -> {
            }
        }
    }

    public static void doSkill5(Data data, Player player) {
        switch (data.skill5) {
            default -> {
            }
        }
    }

    public static void doSkill6(Data data, Player player) {
        switch (data.skill6) {
            default -> {
            }
        }
    }

    public static void doSkill7(Data data, Player player) {
        switch (data.skill7) {
            default -> {
            }
        }
    }


}