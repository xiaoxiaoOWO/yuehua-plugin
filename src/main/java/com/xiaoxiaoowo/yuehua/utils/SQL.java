package com.xiaoxiaoowo.yuehua.utils;


import com.xiaoxiaoowo.yuehua.commands.playercommand.Yh;
import de.tr7zw.nbtapi.NBT;
import de.tr7zw.nbtapi.NBTCompound;
import de.tr7zw.nbtapi.NBTItem;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.sql.*;
import java.util.List;

public final class SQL {
    private static Connection connection;

    private final static String url = "jdbc:sqlite:world/yh.db";
    private static final String storeInventory1 = """
            INSERT OR REPLACE INTO inventory1 (player_name, data)
            VALUES (?, ?);
            """;
    private static final String storeInventory2 = """
            INSERT OR REPLACE INTO inventory2 (player_name, data)
            VALUES (?, ?);
            """;

    private static final String storeInventory3 = """
            INSERT OR REPLACE INTO inventory3 (player_name, data)
            VALUES (?, ?);
            """;

    private static final String storeInventory4 = """
            INSERT OR REPLACE INTO inventory4 (player_name, data)
            VALUES (?, ?);
            """;


    private static final String storeInventory5 = """
            INSERT OR REPLACE INTO inventory5 (player_name, data)
            VALUES (?,  ?);
            """;


    private static final String storeInventory6 = """
            INSERT OR REPLACE INTO inventory6 (player_name, data)
            VALUES (?, ?);
            """;

    private static final String storeInventory7 = """
            INSERT OR REPLACE INTO inventory7 (player_name, data)
            VALUES (?, ?);
            """;

    private static final String storeInventory8 = """
            INSERT OR REPLACE INTO inventory8 (player_name, data)
            VALUES (?, ?);
            """;

    private static final String storeInventory9 = """
            INSERT OR REPLACE INTO inventory9 (player_name, data)
            VALUES (?, ?);
            """;

    private static final String storeInventory10 = """
            INSERT OR REPLACE INTO inventory10 (player_name, data)
            VALUES (?, ?);
            """;

    private static final String storeInventory11 = """
            INSERT OR REPLACE INTO inventory11 (player_name, data)
            VALUES (?, ?);
            """;

    private static final String storeInventory12 = """
            INSERT OR REPLACE INTO inventory12 (player_name, data)
            VALUES (?, ?);
            """;

    private static final String storeInventory13 = """
            INSERT OR REPLACE INTO inventory13 (player_name, data)
            VALUES (?, ?);
            """;

    private static final String storeInventory14 = """
            INSERT OR REPLACE INTO inventory14 (player_name, data)
            VALUES (?, ?);
            """;

    private static final String storeInventory15 = """
            INSERT OR REPLACE INTO inventory15 (player_name, data)
            VALUES (?, ?);
            """;

    private static final String storeInventory16 = """
            INSERT OR REPLACE INTO inventory16 (player_name, data)
            VALUES (?, ?);
            """;

    private static final String storeInventory17 = """
            INSERT OR REPLACE INTO inventory17 (player_name, data)
            VALUES (?, ?);
            """;

    private static final String storeInventory18 = """
            INSERT OR REPLACE INTO inventory18 (player_name, data)
            VALUES (?, ?);
            """;

    private static final String storeShiPin = """
            INSERT OR REPLACE INTO shipin (player_name, data)
            VALUES (?, ?);
            """;

    private static final String storeShiChang = """
            INSERT OR REPLACE INTO shichang (id, data)
            VALUES (?, ?);
            """;

    private static final String storeShiChangMoney = """
            INSERT OR REPLACE INTO shichangmoney (player_name, count)
            VALUES (?, ?);
            """;

    private static final String getInventory1 = """
            SELECT data
            FROM inventory1
            WHERE player_name = ?;
            """;

    private static final String getInventory2 = """
            SELECT data
            FROM inventory2
            WHERE player_name = ?;
            """;

    private static final String getInventory3 = """
            SELECT data
            FROM inventory3
            WHERE player_name = ?;
            """;

    private static final String getInventory4 = """
            SELECT data
            FROM inventory4
            WHERE player_name = ?;
            """;

    private static final String getInventory5 = """
            SELECT data
            FROM inventory5
            WHERE player_name = ?;
            """;

    private static final String getInventory6 = """
            SELECT data
            FROM inventory6
            WHERE player_name = ?;
            """;

    private static final String getInventory7 = """
            SELECT data
            FROM inventory7
            WHERE player_name = ?;
            """;

    private static final String getInventory8 = """
            SELECT data
            FROM inventory8
            WHERE player_name = ?;
            """;

    private static final String getInventory9 = """
            SELECT  data
            FROM inventory9
            WHERE player_name = ?;
            """;

    private static final String getInventory10 = """
            SELECT  data
            FROM inventory10
            WHERE player_name = ?;
            """;

    private static final String getInventory11 = """
            SELECT  data
            FROM inventory11
            WHERE player_name = ?;
            """;

    private static final String getInventory12 = """
            SELECT  data
            FROM inventory12
            WHERE player_name = ?;
            """;

    private static final String getInventory13 = """
            SELECT  data
            FROM inventory13
            WHERE player_name = ?;
            """;

    private static final String getInventory14 = """
            SELECT  data
            FROM inventory14
            WHERE player_name = ?;
            """;

    private static final String getInventory15 = """
            SELECT  data
            FROM inventory15
            WHERE player_name = ?;
            """;

    private static final String getInventory16 = """
            SELECT  data
            FROM inventory16
            WHERE player_name = ?;
            """;

    private static final String getInventory17 = """
            SELECT  data
            FROM inventory17
            WHERE player_name = ?;
            """;

    private static final String getInventory18 = """
            SELECT  data
            FROM inventory18
            WHERE player_name = ?;
            """;

    private static final String getShiPin = """
            SELECT  data
            FROM shipin
            WHERE player_name = ?;
            """;

    private static final String getShiChang = """
            SELECT  data
            FROM shichang
            WHERE id = ?;
            """;

    private static final String getShiChangMoney = """
            SELECT  count
            FROM shichangmoney
            WHERE player_name = ?;
            """;

    private static final String setCount = """
            INSERT OR REPLACE INTO weigui (player_name, count) VALUES (?, 0);
            """;

    private static final String addCount = """
            UPDATE weigui
            SET count = count + 1
            WHERE player_name = ?;
            """;

    private static final String getCount = """
            SELECT count
            FROM weigui
            WHERE player_name = ?;
            """;

    // 只传入玩家名和队伍的SQL语句
    private static final String storeYhTeam = """
            INSERT OR REPLACE INTO yhteam (player_name, yh_team) VALUES (?, ?);
            """;

    // 获取玩家的队伍
    private static final String getYhTeam = """
            SELECT yh_team
            FROM yhteam
            WHERE player_name = ?;
            """;

    //获取一个队伍里的玩家
    private static final String getTeamPlayer = """
            SELECT player_name
            FROM yhteam
            WHERE yh_team = ?;
            """;

    private static final String storeYhTeamApply = """
            INSERT OR REPLACE INTO teamapply (player_name, apply_team) VALUES (?, ?);
            """;

    //更新teamapply中的apply_team,根据玩家名
    private static final String updateYhTeamApply = """
            UPDATE teamapply
            SET apply_team = ?
            WHERE player_name = ?;
            """;

    //删除玩家的申请
    private static final String deleteYhTeamApply = """
            DELETE FROM teamapply
            WHERE player_name = ?;
            """;

    //获取玩家的申请
    private static final String getYhTeamApply = """
            SELECT apply_team
            FROM teamapply
            WHERE player_name = ?;
            """;

    //获取所有申请了某个队伍的玩家
    private static final String getTeamApplyPlayer = """
            SELECT player_name
            FROM teamapply
            WHERE apply_team = ?;
            """;

    private static final String storeShared = """
            INSERT OR REPLACE INTO shared (player_name, shared) VALUES (?, ?);
            """;

    private static final String getShared = """
            SELECT shared
            FROM shared
            WHERE player_name = ?;
            """;




    public static void connect() {
        try {
            connection = DriverManager.getConnection(url);
            init();
        } catch (SQLException e) {
            Bukkit.shutdown();
        }

    }

    public static void close() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                Bukkit.shutdown();
            }
        }
    }


    public static void init() {
        String CREATE_TABLE1 = """
                CREATE TABLE IF NOT EXISTS inventory1 (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE2 = """
                CREATE TABLE IF NOT EXISTS inventory2 (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE3 = """
                CREATE TABLE IF NOT EXISTS inventory3 (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE4 = """
                CREATE TABLE IF NOT EXISTS inventory4 (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE5 = """
                CREATE TABLE IF NOT EXISTS inventory5 (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE6 = """
                CREATE TABLE IF NOT EXISTS inventory6 (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE7 = """
                CREATE TABLE IF NOT EXISTS inventory7 (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE8 = """
                CREATE TABLE IF NOT EXISTS inventory8 (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE9 = """
                CREATE TABLE IF NOT EXISTS inventory9 (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE10 = """
                CREATE TABLE IF NOT EXISTS shipin (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE11 = """
                CREATE TABLE IF NOT EXISTS weigui (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    count INTEGER
                );""";

        String CREATE_TABLE12 = """
                CREATE TABLE IF NOT EXISTS shichang (
                    id INTEGER PRIMARY KEY,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE13 = """
                CREATE TABLE IF NOT EXISTS shichangmoney (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    count INTEGER
                );""";

        String CREATE_TABLE14 = """
                CREATE TABLE IF NOT EXISTS yhteam (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    yh_team TEXT NOT NULL
                );""";

        String CREATE_TABLE15 = """
                CREATE TABLE IF NOT EXISTS teamapply (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    apply_team TEXT NOT NULL
                );""";

        String CREATE_TABLE16 = """
                CREATE TABLE IF NOT EXISTS shared (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    shared TEXT NOT NULL
                );""";

        String CREATE_TABLE17 = """
                CREATE TABLE IF NOT EXISTS sharedapply (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    apply_shared TEXT NOT NULL
                );""";

        String CREATE_TABLE18 = """
                CREATE TABLE IF NOT EXISTS inventory10 (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE19 = """
                CREATE TABLE IF NOT EXISTS inventory11 (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE20 = """
                CREATE TABLE IF NOT EXISTS inventory12 (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE21 = """
                CREATE TABLE IF NOT EXISTS inventory13 (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE22 = """
                CREATE TABLE IF NOT EXISTS inventory14 (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE23 = """
                CREATE TABLE IF NOT EXISTS inventory15 (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE24 = """
                CREATE TABLE IF NOT EXISTS inventory16 (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE25 = """
                CREATE TABLE IF NOT EXISTS inventory17 (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";


        String CREATE_TABLE26 = """
                CREATE TABLE IF NOT EXISTS inventory18 (
                    id INTEGER PRIMARY KEY,
                    player_name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";


        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE1);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE2);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE3);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE4);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE5);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE6);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE7);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE8);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }


        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE9);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE10);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE11);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE12);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE13);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE14);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE15);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE16);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE17);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE18);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE19);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE20);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE21);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE22);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE23);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE24);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE25);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE26);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }



    }


    public static void storePlayerInventory1(String playerName, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeInventory1)) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void storePlayerInventory2(String playerName, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeInventory2)) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void storePlayerInventory3(String playerName, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeInventory3)
        ) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void storePlayerInventory4(String playerName, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeInventory4)
        ) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void storePlayerInventory5(String playerName, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeInventory5)
        ) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void storePlayerInventory6(String playerName, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeInventory6)
        ) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void storePlayerInventory7(String playerName, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeInventory7)
        ) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void storePlayerInventory8(String playerName, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeInventory8)
        ) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void storePlayerInventory9(String playerName, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeInventory9)
        ) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void storePlayerInventory10(String playerName, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeInventory10)
        ) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void storePlayerInventory11(String playerName, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeInventory11)
        ) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void storePlayerInventory12(String playerName, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeInventory12)
        ) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void storePlayerInventory13(String playerName, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeInventory13)
        ) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void storePlayerInventory14(String playerName, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeInventory14)
        ) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void storePlayerInventory15(String playerName, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeInventory15)
        ) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void storePlayerInventory16(String playerName, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeInventory16)
        ) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void storePlayerInventory17(String playerName, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeInventory17)
        ) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void storePlayerInventory18(String playerName, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeInventory18)
        ) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }


    public static void storeShiPin(String playerName, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeShiPin)
        ) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void storeShiChang(int id, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeShiChang)
        ) {
            pstmt.setInt(1, id);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void storeShiChangMoney(String player, int count) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeShiChangMoney)
        ) {
            pstmt.setString(1, player);
            pstmt.setInt(2, count);
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static Inventory retrievePlayerInventory1(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Component.text("乾坤盒☯一").color(NamedTextColor.AQUA));
        String playerName = player.getName();
        try (PreparedStatement pstmt = connection.prepareStatement(getInventory1)) {
            pstmt.setString(1, playerName);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("data");
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        return inventory;
    }

    public static Inventory retrievePlayerInventory2(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Component.text("乾坤盒☯二").color(NamedTextColor.AQUA));
        String playerName = player.getName();
        try (PreparedStatement pstmt = connection.prepareStatement(getInventory2)) {
            pstmt.setString(1, playerName);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("data");
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        return inventory;
    }

    public static Inventory retrievePlayerInventory3(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Component.text("乾坤盒☯三").color(NamedTextColor.AQUA));
        String playerName = player.getName();
        try (PreparedStatement pstmt = connection.prepareStatement(getInventory3)) {
            pstmt.setString(1, playerName);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("data");
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        return inventory;
    }

    public static Inventory retrievePlayerInventory4(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Component.text("乾坤盒☯四").color(NamedTextColor.AQUA));
        String playerName = player.getName();
        try (PreparedStatement pstmt = connection.prepareStatement(getInventory4)) {
            pstmt.setString(1, playerName);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("data");
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        return inventory;
    }

    public static Inventory retrievePlayerInventory5(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Component.text("乾坤盒☯五").color(NamedTextColor.AQUA));
        String playerName = player.getName();
        try (PreparedStatement pstmt = connection.prepareStatement(getInventory5)) {
            pstmt.setString(1, playerName);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("data");
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        return inventory;
    }

    public static Inventory retrievePlayerInventory6(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Component.text("乾坤盒☯六").color(NamedTextColor.AQUA));
        String playerName = player.getName();
        try (PreparedStatement pstmt = connection.prepareStatement(getInventory6)) {
            pstmt.setString(1, playerName);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("data");
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        return inventory;
    }

    public static Inventory retrievePlayerInventory7(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Component.text("乾坤盒☯七").color(NamedTextColor.AQUA));
        String playerName = player.getName();
        try (PreparedStatement pstmt = connection.prepareStatement(getInventory7)) {
            pstmt.setString(1, playerName);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("data");
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        return inventory;
    }

    public static Inventory retrievePlayerInventory8(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Component.text("乾坤盒☯八").color(NamedTextColor.AQUA));
        String playerName = player.getName();
        try (PreparedStatement pstmt = connection.prepareStatement(getInventory8)) {
            pstmt.setString(1, playerName);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("data");
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        return inventory;
    }

    public static Inventory retrievePlayerInventory9(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Component.text("乾坤盒☯九").color(NamedTextColor.AQUA));
        String playerName = player.getName();
        try (PreparedStatement pstmt = connection.prepareStatement(getInventory9)) {
            pstmt.setString(1, playerName);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("data");
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        return inventory;
    }

    public static Inventory retrievePlayerInventory10(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Component.text("乾坤盒☯十").color(NamedTextColor.AQUA));
        String playerName = player.getName();
        try (PreparedStatement pstmt = connection.prepareStatement(getInventory10)) {
            pstmt.setString(1, playerName);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("data");
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        return inventory;
    }

    public static Inventory retrievePlayerInventory11(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Component.text("乾坤盒☯十一").color(NamedTextColor.AQUA));
        String playerName = player.getName();
        try (PreparedStatement pstmt = connection.prepareStatement(getInventory11)) {
            pstmt.setString(1, playerName);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("data");
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        return inventory;
    }

    public static Inventory retrievePlayerInventory12(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Component.text("乾坤盒☯十二").color(NamedTextColor.AQUA));
        String playerName = player.getName();
        try (PreparedStatement pstmt = connection.prepareStatement(getInventory12)) {
            pstmt.setString(1, playerName);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("data");
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        return inventory;
    }

    public static Inventory retrievePlayerInventory13(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Component.text("乾坤盒☯十三").color(NamedTextColor.AQUA));
        String playerName = player.getName();
        try (PreparedStatement pstmt = connection.prepareStatement(getInventory13)) {
            pstmt.setString(1, playerName);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("data");
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        return inventory;
    }

    public static Inventory retrievePlayerInventory14(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Component.text("乾坤盒☯十四").color(NamedTextColor.AQUA));
        String playerName = player.getName();
        try (PreparedStatement pstmt = connection.prepareStatement(getInventory14)) {
            pstmt.setString(1, playerName);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("data");
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        return inventory;
    }

    public static Inventory retrievePlayerInventory15(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Component.text("乾坤盒☯十五").color(NamedTextColor.AQUA));
        String playerName = player.getName();
        try (PreparedStatement pstmt = connection.prepareStatement(getInventory15)) {
            pstmt.setString(1, playerName);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("data");
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        return inventory;
    }

    public static Inventory retrievePlayerInventory16(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Component.text("乾坤盒☯十六").color(NamedTextColor.AQUA));
        String playerName = player.getName();
        try (PreparedStatement pstmt = connection.prepareStatement(getInventory16)) {
            pstmt.setString(1, playerName);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("data");
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        return inventory;
    }

    public static Inventory retrievePlayerInventory17(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Component.text("乾坤盒☯十七").color(NamedTextColor.AQUA));
        String playerName = player.getName();
        try (PreparedStatement pstmt = connection.prepareStatement(getInventory17)) {
            pstmt.setString(1, playerName);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("data");
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        return inventory;
    }

    public static Inventory retrievePlayerInventory18(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Component.text("乾坤盒☯十八").color(NamedTextColor.AQUA));
        String playerName = player.getName();
        try (PreparedStatement pstmt = connection.prepareStatement(getInventory18)) {
            pstmt.setString(1, playerName);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("data");
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        return inventory;
    }

    public static Inventory initialInventory(Player player, String a) {
        Inventory inventory = Bukkit.createInventory(player, 54, Component.text("乾坤盒☯" + a).color(NamedTextColor.AQUA));
        inventory.setItem(53, Yh.BACK_BEFORE);
        return inventory;
    }


    public static Inventory retrieveShiChang(int id) {
        Inventory inventory = Bukkit.createInventory(null, 54, Component.text("全球市场[第" + (id + 1) + "页]").color(NamedTextColor.AQUA));
        try (PreparedStatement pstmt = connection.prepareStatement(getShiChang)) {
            pstmt.setInt(1, id);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("data");
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        return inventory;
    }

    public static Inventory retrieveShipin(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 9, Component.text("饰品槽").color(NamedTextColor.AQUA));
        String playerUUID = player.getUniqueId().toString();
        try (PreparedStatement pstmt = connection.prepareStatement(getShiPin)) {
            pstmt.setString(1, playerUUID);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("data");
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        return inventory;
    }

    public static int retrieveShiChangMoney(String player) {
        int count = 0;
        try (PreparedStatement pstmt = connection.prepareStatement(getShiChangMoney)) {
            pstmt.setString(1, player);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                count = resultSet.getInt("count");
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        return count;
    }


    public static void setCount(String name) {
        try (PreparedStatement pstmt = connection.prepareStatement(setCount)) {
            pstmt.setString(1, name);
            pstmt.execute();
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void addCount(String name) {
        try (PreparedStatement pstmt = connection.prepareStatement(addCount)) {
            pstmt.setString(1, name);
            pstmt.execute();
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static int getCount(String name) {
        int count = 0;
        try (PreparedStatement pstmt = connection.prepareStatement(getCount)) {
            pstmt.setString(1, name);
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                count = resultSet.getInt("count");
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
        return count;
    }


    public static void storeYhTeam(String playerName, String yhTeam) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeYhTeam)) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, yhTeam);
            pstmt.execute();
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void storeShared(String playerName, String shared) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeShared)) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, shared);
            pstmt.execute();
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static String getYhTeam(String playerName) {
        String yhTeam = "null";
        try (PreparedStatement pstmt = connection.prepareStatement(getYhTeam)) {
            pstmt.setString(1, playerName);
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                yhTeam = resultSet.getString("yh_team");
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
        return yhTeam;
    }

    public static String getShared(String playerName) {
        String shared = "null";
        try (PreparedStatement pstmt = connection.prepareStatement(getShared)) {
            pstmt.setString(1, playerName);
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                shared = resultSet.getString("shared");
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
        return shared;
    }

    public static void storeYhTeamApply(String playerName, String applyTeam) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeYhTeamApply)) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, applyTeam);
            pstmt.execute();
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void updateYhTeamApply(String applyTeam, String playerName) {
        try (PreparedStatement pstmt = connection.prepareStatement(updateYhTeamApply)) {
            pstmt.setString(1, applyTeam);
            pstmt.setString(2, playerName);
            pstmt.execute();
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void deleteYhTeamApply(String playerName) {
        try (PreparedStatement pstmt = connection.prepareStatement(deleteYhTeamApply)) {
            pstmt.setString(1, playerName);
            pstmt.execute();
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static String getYhTeamApply(String playerName) {
        String applyTeam = "null";
        try (PreparedStatement pstmt = connection.prepareStatement(getYhTeamApply)) {
            pstmt.setString(1, playerName);
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                applyTeam = resultSet.getString("apply_team");
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
        return applyTeam;
    }

    public static List<String> getTeamPlayer(String yhTeam) {
        List<String> playerList = new java.util.ArrayList<>();
        try (PreparedStatement pstmt = connection.prepareStatement(getTeamPlayer)) {
            pstmt.setString(1, yhTeam);
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                playerList.add(resultSet.getString("player_name"));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
        return playerList;
    }

    public static List<String> getTeamApplyPlayer(String applyTeam) {
        List<String> playerList = new java.util.ArrayList<>();
        try (PreparedStatement pstmt = connection.prepareStatement(getTeamApplyPlayer)) {
            pstmt.setString(1, applyTeam);
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                playerList.add(resultSet.getString("player_name"));
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
        return playerList;
    }


}
