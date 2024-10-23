package com.xiaoxiaoowo.yuehua.utils;

import com.xiaoxiaoowo.yuehua.Yuehua;
import org.bukkit.Bukkit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static com.xiaoxiaoowo.yuehua.Yuehua.serverSocket;

public final class TcpServer implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                if (serverSocket.isClosed()) {
                    Bukkit.shutdown();
                    break;
                }
                Socket clientSocket = serverSocket.accept(); // 接受客户端连接
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
            String userName = "";
            int hashCode = 0;
            int count = 2;
            while ((inputLine = in.readLine()) != null && !clientSocket.isClosed() && count > 0) {
                switch (count) {
                    case 2 -> userName = inputLine;
                    case 1 -> hashCode = Integer.parseInt(inputLine);
                }
                count--;
            }
            int day = ZonedDateTime.now(ZoneId.of("Asia/Shanghai")).getDayOfWeek().getValue();


            //mod count
            //mod total size
            //directory count(不含.开头，不含crash-reports，不含screenshots)
            //jar size
            String sbString = userName +
                    day +
                    14 +
                    14388652    +
                    9 +
                    26836080;
//            int serverHashCode = sbString.hashCode();
//            if (serverHashCode == hashCode) {
//                Yuehua.nameSet.add(userName);
//            }
            Yuehua.nameSet.add(userName);

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

