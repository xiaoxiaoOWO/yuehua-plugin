package com.xiaoxiaoowo.yuehua.utils;


import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.guis.Yh;
import com.xiaoxiaoowo.yuehua.guis.dz.Recipe;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import de.tr7zw.nbtapi.NBT;
import de.tr7zw.nbtapi.NBTCompound;
import de.tr7zw.nbtapi.NBTItem;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public final class SQL {
    private static Connection connection;
    private static Connection recipeConnection;

    private final static String url = "jdbc:sqlite:world/yh.db";
    private final static String recipeUrl = "jdbc:sqlite:world/recipe.db";

    private static final String getAllShared = """
            SELECT * FROM shared;
            """;

    private static final String getAllRecipe = """
            SELECT * FROM recipe;
            """;

    private static final String getAllZhanArmor = """
            SELECT * FROM zhanarmor;
            """;

    private static final String getAllGongArmor = """
            SELECT * FROM gongarmor;
            """;

    private static final String getAllDanArmor = """
            SELECT * FROM danarmor;
            """;

    private static final String getAllZhanWeapon = """
            SELECT * FROM zhanweapon;
            """;

    private static final String getAllGongWeapon = """
            SELECT * FROM gongweapon;
            """;

    private static final String getAllDanWeapon = """
            SELECT * FROM danweapon;
            """;

    private static final String getAllZhanBiWeapon = """
            SELECT * FROM zhanbiweapon;
            """;

    private static final String getAllGongBiWeapon = """
            SELECT * FROM gongbiweapon;
            """;

    private static final String getAllDanBiWeapon = """
            SELECT * FROM danbiweapon;
            """;

    private static final String getAllZhanFaBao = """
            SELECT * FROM zhanfabao;
            """;

    private static final String getAllGongFaBao = """
            SELECT * FROM gongfabao;
            """;

    private static final String getAllDanFaBao = """
            SELECT * FROM danfabao;
            """;

    private static final String getAllZhanYiQi = """
            SELECT * FROM zhanyiqi;
            """;

    private static final String getAllGongYiQi = """
            SELECT * FROM gongyiqi;
            """;

    private static final String getAllDanYiQi = """
            SELECT * FROM danyiqi;
            """;

    private static final String getAllShipinRecipe = """
            SELECT * FROM shipinrecipe;
            """;

    private static final String getAllDanDan = """
            SELECT * FROM dandan;
            """;

    private static final String getAllDan = """
            SELECT * FROM dan;
            """;

    private static final String getAllIdItem = """
            SELECT * FROM iditem;
            """;

    private static final String getOther = """
            SELECT data
            FROM other
            WHERE name = ?;
            """;

    private static final String getZhanArmor = """
            SELECT data
            FROM zhanarmor
            WHERE name = ?;
            """;

    private static final String getGongArmor = """
            SELECT data
            FROM gongarmor
            WHERE name = ?;
            """;

    private static final String getDanArmor = """
            SELECT data
            FROM danarmor
            WHERE name = ?;
            """;


    private static final String getZhanWeapon = """
            SELECT data
            FROM zhanweapon
            WHERE name = ?;
            """;

    private static final String getGongWeapon = """
            SELECT data
            FROM gongweapon
            WHERE name = ?;
            """;

    private static final String getDanWeapon = """
            SELECT data
            FROM danweapon
            WHERE name = ?;
            """;

    private static final String getZhanBiWeapon = """
            SELECT data
            FROM zhanbiweapon
            WHERE name = ?;
            """;

    private static final String getGongBiWeapon = """
            SELECT data
            FROM gongbiweapon
            WHERE name = ?;
            """;

    private static final String getDanBiWeapon = """
            SELECT data
            FROM danbiweapon
            WHERE name = ?;
            """;

    private static final String getZhanFaBao = """
            SELECT data
            FROM zhanfabao
            WHERE name = ?;
            """;
    private static final String getGongFaBao = """
            SELECT data
            FROM gongfabao
            WHERE name = ?;
            """;

    private static final String getDanFaBao = """
            SELECT data
            FROM danfabao
            WHERE name = ?;
            """;

    private static final String getZhanYiQi = """
            SELECT data
            FROM zhanyiqi
            WHERE name = ?;
            """;

    private static final String getGongYiQi = """
            SELECT data
            FROM gongyiqi
            WHERE name = ?;
            """;


    private static final String getDanYiQi = """
            SELECT data
            FROM danyiqi
            WHERE name = ?;
            """;

    private static final String getDanDan = """
            SELECT data
            FROM dandan
            WHERE name = ?;
            """;

    private static final String getDan = """
            SELECT data
            FROM dan
            WHERE name = ?;
            """;

    private static final String getIdItem = """
            SELECT data
            FROM iditem
            WHERE name = ?;
            """;

    private static final String getShipinRecipe = """
            SELECT data
            FROM shipinrecipe
            WHERE name = ?;
            """;

    private static final String storeShared = """
            INSERT OR REPLACE INTO shared (player_name, shared) VALUES (?, ?);
            """;

    private static final String storeRecipe = """
            INSERT OR REPLACE INTO recipe (name, data)
            VALUES (?, ?);
            """;

    private static final String storeOther = """
            INSERT OR REPLACE INTO other (name, data)
            VALUES (?, ?);
            """;

    private static final String storeZhanArmor = """
            INSERT OR REPLACE INTO zhanarmor (name, data)
            VALUES (?, ?);
            """;

    private static final String storeGongArmor = """
            INSERT OR REPLACE INTO gongarmor (name, data)
            VALUES (?, ?);
            """;

    private static final String storeDanArmor = """
            INSERT OR REPLACE INTO danarmor (name, data)
            VALUES (?, ?);
            """;

    private static final String storeZhanWeapon = """
            INSERT OR REPLACE INTO zhanweapon (name, data)
            VALUES (?, ?);
            """;

    private static final String storeGongWeapon = """
            INSERT OR REPLACE INTO gongweapon (name, data)
            VALUES (?, ?);
            """;

    private static final String storeDanWeapon = """
            INSERT OR REPLACE INTO danweapon (name, data)
            VALUES (?, ?);
            """;

    private static final String storeZhanBiWeapon = """
            INSERT OR REPLACE INTO zhanbiweapon (name, data)
            VALUES (?, ?);
            """;

    private static final String storeGongBiWeapon = """
            INSERT OR REPLACE INTO gongbiweapon (name, data)
            VALUES (?, ?);
            """;

    private static final String storeDanBiWeapon = """
            INSERT OR REPLACE INTO danbiweapon (name, data)
            VALUES (?, ?);
            """;

    private static final String storeZhanFaBao = """
            INSERT OR REPLACE INTO zhanfabao (name, data)
            VALUES (?, ?);
            """;

    private static final String storeGongFaBao = """
            INSERT OR REPLACE INTO gongfabao (name, data)
            VALUES (?, ?);
            """;

    private static final String storeDanFaBao = """
            INSERT OR REPLACE INTO danfabao (name, data)
            VALUES (?, ?);
            """;

    private static final String storeZhanYiQi = """
            INSERT OR REPLACE INTO zhanyiqi (name, data)
            VALUES (?, ?);
            """;

    private static final String storeGongYiQi = """
            INSERT OR REPLACE INTO gongyiqi (name, data)
            VALUES (?, ?);
            """;

    private static final String storeDanYiQi = """
            INSERT OR REPLACE INTO danyiqi (name, data)
            VALUES (?, ?);
            """;

    private static final String storeShipinRecipe = """
            INSERT OR REPLACE INTO shipinrecipe (name, data)
            VALUES (?, ?);
            """;

    private static final String storeDanDan = """
            INSERT OR REPLACE INTO dandan (name, data)
            VALUES (?, ?);
            """;

    private static final String storeDan = """
            INSERT OR REPLACE INTO dan (name, data)
            VALUES (?, ?);
            """;
    private static final String storeIdItem = """
            INSERT OR REPLACE INTO iditem (name, data)
            VALUES (?, ?);
            """;

    private static final String storeDuanZaoTai = """
            INSERT OR REPLACE INTO duanzaotai (name, data)
            VALUES (?, ?);
            """;

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

    private static final String getShared = """
            SELECT shared
            FROM shared
            WHERE player_name = ?;
            """;

    private static final String getDuanZaoTai = """
            SELECT data
            FROM duanzaotai
            WHERE name = ?;
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


    public static void connect() {
        try {
            connection = DriverManager.getConnection(url);
            recipeConnection = DriverManager.getConnection(recipeUrl);
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

        if (recipeConnection != null) {
            try {
                recipeConnection.close();
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

        String CREATE_TABLE27 = """
                CREATE TABLE IF NOT EXISTS recipe (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE28 = """
                CREATE TABLE IF NOT EXISTS zhanarmor (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE29 = """
                CREATE TABLE IF NOT EXISTS gongarmor (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE30 = """
                CREATE TABLE IF NOT EXISTS danarmor (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";
        String CREATE_TABLE31 = """
                CREATE TABLE IF NOT EXISTS zhanweapon (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE32 = """
                CREATE TABLE IF NOT EXISTS gongweapon (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE33 = """
                CREATE TABLE IF NOT EXISTS danweapon (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";


        String CREATE_TABLE34 = """
                CREATE TABLE IF NOT EXISTS zhanbiweapon (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE35 = """
                CREATE TABLE IF NOT EXISTS gongbiweapon (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE36 = """
                CREATE TABLE IF NOT EXISTS danbiweapon (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";


        String CREATE_TABLE37 = """
                CREATE TABLE IF NOT EXISTS zhanfabao (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE38 = """
                CREATE TABLE IF NOT EXISTS gongfabao (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE39 = """
                CREATE TABLE IF NOT EXISTS danfabao (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";


        String CREATE_TABLE40 = """
                CREATE TABLE IF NOT EXISTS zhanyiqi (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE41 = """
                CREATE TABLE IF NOT EXISTS gongyiqi (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE42 = """
                CREATE TABLE IF NOT EXISTS danyiqi (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE43 = """
                CREATE TABLE IF NOT EXISTS shipinrecipe (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE44 = """
                CREATE TABLE IF NOT EXISTS dan (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE45 = """
                CREATE TABLE IF NOT EXISTS dandan (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE46 = """
                CREATE TABLE IF NOT EXISTS iditem (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE47 = """
                CREATE TABLE IF NOT EXISTS duanzaotai (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
                    data TEXT NOT NULL
                );""";

        String CREATE_TABLE48 = """
                CREATE TABLE IF NOT EXISTS other (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL UNIQUE,
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

        try (Statement statement = recipeConnection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE27);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = recipeConnection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE28);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = recipeConnection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE29);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = recipeConnection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE30);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = recipeConnection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE31);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = recipeConnection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE32);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = recipeConnection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE33);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = recipeConnection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE34);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = recipeConnection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE35);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = recipeConnection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE36);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = recipeConnection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE37);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = recipeConnection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE38);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = recipeConnection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE39);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = recipeConnection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE40);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = recipeConnection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE41);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = recipeConnection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE42);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = recipeConnection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE43);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = recipeConnection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE44);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = recipeConnection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE45);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = recipeConnection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE46);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = connection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE47);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        try (Statement statement = recipeConnection.createStatement()) {
            // 执行创建表的 SQL 语句
            statement.execute(CREATE_TABLE48);
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }


    }


    public static void storeDuanZaoTai(String name, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeDuanZaoTai)) {
            pstmt.setString(1, name);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
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

    public static void storeShared(String playerName, Inventory inventory) {
        try (PreparedStatement pstmt = connection.prepareStatement(storeShared)
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

    public static Inventory retrieveDuanzaotai(String name) throws SQLException {
        Inventory inventory = Bukkit.createInventory(null, 18, Component.text(name));
        try (PreparedStatement pstmt = connection.prepareStatement(getDuanZaoTai)) {
            pstmt.setString(1, name);

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

    public static Inventory retrieveShared(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Component.text("混元袋☯无界").color(NamedTextColor.AQUA));
        String playerName = player.getName();
        try (PreparedStatement pstmt = connection.prepareStatement(getShared)) {
            pstmt.setString(1, playerName);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("shared");
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
        Inventory inventory = Bukkit.createInventory(null, 54, Component.text("月华市场[第" + (id + 1) + "页]").color(NamedTextColor.AQUA));
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
        List<String> playerList = new ArrayList<>();
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
        List<String> playerList = new ArrayList<>();
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

    public static void initialShared(Player player) {
        String playerName = player.getName();
        Inventory inventory = Bukkit.createInventory(player, 54, Component.text("混元袋☯无界").color(NamedTextColor.AQUA));
        inventory.setItem(53, Yh.BACK_BEFORE);
        try (PreparedStatement pstmt = connection.prepareStatement(storeShared)
        ) {
            pstmt.setString(1, playerName);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
            Scheduler.sync(
                    () -> Yuehua.sharedInv.put(playerName, inventory)
            );
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }

    public static void initialShared() {
        try (PreparedStatement pstmt = connection.prepareStatement(getAllShared)) {
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                Inventory inventory = Bukkit.createInventory(null, 54, Component.text("混元袋☯无界").color(NamedTextColor.AQUA));
                String playerName = resultSet.getString("player_name"); // 获取player_name列的数据
                String data = resultSet.getString("shared"); // 获取shared列的数据
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                Yuehua.sharedInv.put(playerName, inventory);
            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }


    @SuppressWarnings("deprecation")
    public static void initialRecipe() {
        try (PreparedStatement pstmt = recipeConnection.prepareStatement(getAllRecipe)) {
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name"); // 获取name列的数据
                String data = resultSet.getString("data"); // 获取data列的数据
                Inventory inventory = switch (name) {
                    case "§b护甲配方[战][第一页]" -> Recipe.zhanArmor;

                    case "§b护甲配方[弓][第一页]" -> Recipe.gongArmor;

                    case "§b护甲配方[丹][第一页]" -> Recipe.danArmor;

                    case "§b护甲配方[战][第二页]" -> Recipe.zhanArmor2;

                    case "§b护甲配方[弓][第二页]" -> Recipe.gongArmor2;

                    case "§b护甲配方[丹][第二页]" -> Recipe.danArmor2;

                    case "§b武器配方[战][第一页]" -> Recipe.zhanWeapon;

                    case "§b武器配方[弓][第一页]" -> Recipe.gongWeapon;

                    case "§b武器配方[丹][第一页]" -> Recipe.danWeapon;

                    case "§b武器配方[战][第二页]" -> Recipe.zhanWeapon2;

                    case "§b武器配方[弓][第二页]" -> Recipe.gongWeapon2;

                    case "§b武器配方[丹][第二页]" -> Recipe.danWeapon2;

                    case "§b副武器配方[战][第一页]" -> Recipe.zhanBiWeapon;

                    case "§b副武器配方[弓][第一页]" -> Recipe.gongBiWeapon;

                    case "§b副武器配方[丹][第一页]" -> Recipe.danBiWeapon;

                    case "§b副武器配方[战][第二页]" -> Recipe.zhanBiWeapon2;

                    case "§b副武器配方[弓][第二页]" -> Recipe.gongBiWeapon2;

                    case "§b副武器配方[丹][第二页]" -> Recipe.danBiWeapon2;

                    case "§b法宝配方[战][第一页]" -> Recipe.zhanFaBao;

                    case "§b法宝配方[弓][第一页]" -> Recipe.gongFaBao;

                    case "§b法宝配方[丹][第一页]" -> Recipe.danFaBao;

                    case "§b法宝配方[战][第二页]" -> Recipe.zhanFaBao2;

                    case "§b法宝配方[弓][第二页]" -> Recipe.gongFaBao2;

                    case "§b法宝配方[丹][第二页]" -> Recipe.danFaBao2;

                    case "§b异器配方[战][第一页]" -> Recipe.zhanYiQi;

                    case "§b异器配方[弓][第一页]" -> Recipe.gongYiQi;

                    case "§b异器配方[丹][第一页]" -> Recipe.danYiQi;

                    case "§b异器配方[战][第二页]" -> Recipe.zhanFaBao2;

                    case "§b异器配方[弓][第二页]" -> Recipe.gongFaBao2;

                    case "§b异器配方[丹][第二页]" -> Recipe.danFaBao2;

                    case "§b饰品配方[第一页]" -> Recipe.shipin;

                    case "§b饰品配方[第二页]" -> Recipe.shipin2;

                    case "§b丹药配方[第一页]" -> Recipe.recipeAllDan;

                    case "§b丹药配方[第二页]" -> Recipe.recipeAllDan2;

                    case "§b丹药配方[仅炼丹][第一页]" -> Recipe.recipeDanDan;

                    case "§b丹药配方[仅炼丹][第二页]" -> Recipe.recipeDanDan2;

                    case "§b其它配方[第一页]" -> Recipe.recipeOther;

                    case "§b其它配方[第二页]" -> Recipe.recipeOther2;

                    default -> null;
                };
                inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));


            }
        } catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }


//        try (PreparedStatement pstmt = recipeConnection.prepareStatement(getAllIdItem)) {
//            ResultSet resultSet = pstmt.executeQuery();
//            while (resultSet.next()) {
//                String name = resultSet.getString("name"); // 获取name列的数据
//                String data = resultSet.getString("data"); // 获取data列的数据
//                ItemStack itemStack = NBTItem.convertNBTtoItem((NBTCompound) NBT.parseNBT(data));
//                Recipe.idToItem.put(name, itemStack);
//            }
//        } catch (SQLException e) {
//            Bukkit.shutdown();
//            throw new RuntimeException(e);
//        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.zhanArmor.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getZhanArmor)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b护甲配方[战][第一页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.zhanarmorContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.zhanArmor2.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getZhanArmor)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b护甲配方[战][第二页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.zhanarmorContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.gongArmor.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getGongArmor)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b护甲配方[弓][第一页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.gongarmorContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.gongArmor2.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getGongArmor)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b护甲配方[弓][第二页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.gongarmorContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.danArmor.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getDanArmor)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b护甲配方[丹][第一页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.danarmorContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.danArmor2.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getDanArmor)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b护甲配方[丹][第二页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.danarmorContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.zhanWeapon.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getZhanWeapon)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b武器配方[战][第一页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.zhanweaponContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.zhanWeapon2.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getZhanWeapon)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b武器配方[战][第二页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.zhanweaponContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.gongWeapon.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getGongWeapon)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b武器配方[弓][第一页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.gongweaponContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.gongWeapon2.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getGongWeapon)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b武器配方[弓][第二页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.gongweaponContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.danWeapon.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getDanWeapon)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b武器配方[丹][第一页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.danweaponContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.danWeapon2.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getDanWeapon)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b武器配方[丹][第二页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.danweaponContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.zhanBiWeapon.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getZhanBiWeapon)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b副武器配方[战][第一页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.zhanbiweaponContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.zhanBiWeapon2.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getZhanBiWeapon)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b副武器配方[战][第二页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.zhanbiweaponContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.gongBiWeapon.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getGongBiWeapon)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b副武器配方[弓][第一页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.gongbiweaponContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.gongBiWeapon2.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getGongBiWeapon)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b副武器配方[弓][第二页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.gongbiweaponContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.danBiWeapon.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getDanBiWeapon)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b副武器配方[丹][第一页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.danbiweaponContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.danBiWeapon2.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getDanBiWeapon)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b副武器配方[丹][第二页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.danbiweaponContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.zhanFaBao.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getZhanFaBao)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b法宝配方[战][第一页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.zhanfabaoContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.zhanFaBao2.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getZhanFaBao)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b法宝配方[战][第二页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.zhanfabaoContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.gongFaBao.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getGongFaBao)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b法宝配方[弓][第一页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.gongfabaoContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.gongFaBao2.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getGongFaBao)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b法宝配方[弓][第二页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.gongfabaoContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.danFaBao.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getDanFaBao)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b法宝配方[丹][第一页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.danfabaoContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.danFaBao2.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getDanFaBao)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b法宝配方[丹][第二页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.danfabaoContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.zhanYiQi.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getZhanYiQi)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b异器配方[战][第一页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.zhanyiqiContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.zhanYiQi2.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getZhanYiQi)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b异器配方[战][第二页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.zhanyiqiContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.gongYiQi.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getGongYiQi)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b异器配方[弓][第一页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.gongyiqiContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.gongYiQi2.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getGongYiQi)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b异器配方[弓][第二页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.gongyiqiContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.danYiQi.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getDanYiQi)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b异器配方[丹][第一页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.danyiqiContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.danYiQi2.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getDanYiQi)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b异器配方[丹][第二页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.danyiqiContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }


        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.shipin.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getShipinRecipe)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b饰品配方[第一页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.shipinContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.shipin2.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getShipinRecipe)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b饰品配方[第二页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.shipinContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.recipeAllDan.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getDan)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b丹药配方[第一页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.danContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.recipeAllDan2.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getDan)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b丹药配方[第二页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.danContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }


        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.recipeDanDan.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getDanDan)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b丹药配方[仅炼丹][第一页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.dandanContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.recipeDanDan2.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getDanDan)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b丹药配方[仅炼丹][第二页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.dandanContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }


        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.recipeOther.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getOther)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b其它配方[第一页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.otherContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 53; i++) {
            ItemStack itemStack = Recipe.recipeOther2.getItem(i);
            if (itemStack == null) {
                continue;
            }
            String id = itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            if (id.equals("null")) {
                continue;
            }
            try (PreparedStatement pstmt = recipeConnection.prepareStatement(getOther)) {
                pstmt.setString(1, id);
                ResultSet resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    String data = resultSet.getString("data");
                    Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b其它配方[第二页][详情]"));
                    inventory.setContents(NBTItem.convertNBTtoItemArray((NBTCompound) NBT.parseNBT(data)));
                    Recipe.otherContents.put(id, inventory);
                }
            } catch (SQLException e) {
                Bukkit.shutdown();
                throw new RuntimeException(e);
            }
        }


    }

    public static void storeOneInv(Inventory inventory, String name, String sql) {
        try (PreparedStatement pstmt = recipeConnection.prepareStatement(sql)
        ) {
            pstmt.setString(1, name);
            pstmt.setString(2, NBTItem.convertItemArraytoNBT(inventory.getContents()).toString());
            pstmt.execute();
        } // try-with-resources 将自动关闭 pstmt
        catch (SQLException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }
    }


    public static void storeRecipe() {
        storeOneInv(Recipe.zhanArmor, "§b护甲配方[战][第一页]", storeRecipe);
        storeOneInv(Recipe.zhanArmor2, "§b护甲配方[战][第二页]", storeRecipe);
        storeOneInv(Recipe.gongArmor, "§b护甲配方[弓][第一页]", storeRecipe);
        storeOneInv(Recipe.gongArmor2, "§b护甲配方[弓][第二页]", storeRecipe);
        storeOneInv(Recipe.danArmor, "§b护甲配方[丹][第一页]", storeRecipe);
        storeOneInv(Recipe.danArmor2, "§b护甲配方[丹][第二页]", storeRecipe);

        storeOneInv(Recipe.zhanWeapon, "§b武器配方[战][第一页]", storeRecipe);
        storeOneInv(Recipe.zhanWeapon2, "§b武器配方[战][第二页]", storeRecipe);
        storeOneInv(Recipe.gongWeapon, "§b武器配方[弓][第一页]", storeRecipe);
        storeOneInv(Recipe.gongWeapon2, "§b武器配方[弓][第二页]", storeRecipe);
        storeOneInv(Recipe.danWeapon, "§b武器配方[丹][第一页]", storeRecipe);
        storeOneInv(Recipe.danWeapon2, "§b武器配方[丹][第二页]", storeRecipe);

        storeOneInv(Recipe.zhanBiWeapon, "§b副武器配方[战][第一页]", storeRecipe);
        storeOneInv(Recipe.zhanBiWeapon2, "§b副武器配方[战][第二页]", storeRecipe);
        storeOneInv(Recipe.gongBiWeapon, "§b副武器配方[弓][第一页]", storeRecipe);
        storeOneInv(Recipe.gongBiWeapon2, "§b副武器配方[弓][第二页]", storeRecipe);
        storeOneInv(Recipe.danBiWeapon, "§b副武器配方[丹][第一页]", storeRecipe);
        storeOneInv(Recipe.danBiWeapon2, "§b副武器配方[丹][第二页]", storeRecipe);

        storeOneInv(Recipe.zhanFaBao, "§b法宝配方[战][第一页]", storeRecipe);
        storeOneInv(Recipe.zhanFaBao2, "§b法宝配方[战][第二页]", storeRecipe);
        storeOneInv(Recipe.gongFaBao, "§b法宝配方[弓][第一页]", storeRecipe);
        storeOneInv(Recipe.gongFaBao2, "§b法宝配方[弓][第二页]", storeRecipe);
        storeOneInv(Recipe.danFaBao, "§b法宝配方[丹][第一页]", storeRecipe);
        storeOneInv(Recipe.danFaBao2, "§b法宝配方[丹][第二页]", storeRecipe);

        storeOneInv(Recipe.zhanYiQi, "§b异器配方[战][第一页]", storeRecipe);
        storeOneInv(Recipe.zhanYiQi2, "§b异器配方[战][第二页]", storeRecipe);
        storeOneInv(Recipe.gongYiQi, "§b异器配方[弓][第一页]", storeRecipe);
        storeOneInv(Recipe.gongYiQi2, "§b异器配方[弓][第二页]", storeRecipe);
        storeOneInv(Recipe.danYiQi, "§b异器配方[丹][第一页]", storeRecipe);
        storeOneInv(Recipe.danYiQi2, "§b异器配方[丹][第二页]", storeRecipe);

        storeOneInv(Recipe.shipin, "§b饰品配方[第一页]", storeRecipe);
        storeOneInv(Recipe.shipin2, "§b饰品配方[第二页]", storeRecipe);

        storeOneInv(Recipe.recipeAllDan, "§b丹药配方[第一页]", storeRecipe);
        storeOneInv(Recipe.recipeAllDan2, "§b丹药配方[第二页]", storeRecipe);
        storeOneInv(Recipe.recipeDanDan, "§b丹药配方[仅炼丹][第一页]", storeRecipe);
        storeOneInv(Recipe.recipeDanDan2, "§b丹药配方[仅炼丹][第二页]", storeRecipe);

        storeOneInv(Recipe.recipeOther, "§b其它配方[第一页]", storeRecipe);
        storeOneInv(Recipe.recipeOther2, "§b其它配方[第二页]", storeRecipe);

        Recipe.zhanarmorContents.forEach((key, value) -> {
            storeOneInv(value, key, storeZhanArmor);
        });

        Recipe.gongarmorContents.forEach((key, value) -> {
            storeOneInv(value, key, storeGongArmor);
        });

        Recipe.danarmorContents.forEach((key, value) -> {
            storeOneInv(value, key, storeDanArmor);
        });

        Recipe.zhanweaponContents.forEach((key, value) -> {
            storeOneInv(value, key, storeZhanWeapon);
        });

        Recipe.gongweaponContents.forEach((key, value) -> {
            storeOneInv(value, key, storeGongWeapon);
        });

        Recipe.danweaponContents.forEach((key, value) -> {
            storeOneInv(value, key, storeDanWeapon);
        });

        Recipe.zhanbiweaponContents.forEach((key, value) -> {
            storeOneInv(value, key, storeZhanBiWeapon);
        });

        Recipe.gongbiweaponContents.forEach((key, value) -> {
            storeOneInv(value, key, storeGongBiWeapon);
        });

        Recipe.danbiweaponContents.forEach((key, value) -> {
            storeOneInv(value, key, storeDanBiWeapon);
        });

        Recipe.zhanfabaoContents.forEach((key, value) -> {
            storeOneInv(value, key, storeZhanFaBao);
        });

        Recipe.gongfabaoContents.forEach((key, value) -> {
            storeOneInv(value, key, storeGongFaBao);
        });

        Recipe.danfabaoContents.forEach((key, value) -> {
            storeOneInv(value, key, storeDanFaBao);
        });

        Recipe.zhanyiqiContents.forEach((key, value) -> {
            storeOneInv(value, key, storeZhanYiQi);
        });

        Recipe.gongyiqiContents.forEach((key, value) -> {
            storeOneInv(value, key, storeGongYiQi);
        });

        Recipe.danyiqiContents.forEach((key, value) -> {
            storeOneInv(value, key, storeDanYiQi);
        });

        Recipe.shipinContents.forEach((key, value) -> {
            storeOneInv(value, key, storeShipinRecipe);
        });

        Recipe.danContents.forEach((key, value) -> {
            storeOneInv(value, key, storeDan);
        });

        Recipe.dandanContents.forEach((key, value) -> {
            storeOneInv(value, key, storeDanDan);
        });

        Recipe.otherContents.forEach((key, value) -> {
            storeOneInv(value, key, storeOther);
        });

//        Recipe.idToItem.forEach((key, value) -> {
//            try (PreparedStatement pstmt = recipeConnection.prepareStatement(storeIdItem)
//            ) {
//                pstmt.setString(1, key);
//                pstmt.setString(2, NBTItem.convertItemtoNBT(value).toString());
//                pstmt.execute();
//            } // try-with-resources 将自动关闭 pstmt
//            catch (SQLException e) {
//                Bukkit.shutdown();
//                throw new RuntimeException(e);
//            }
//
//        });


    }


}





