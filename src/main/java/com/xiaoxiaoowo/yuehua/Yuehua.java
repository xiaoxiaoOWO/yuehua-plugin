package com.xiaoxiaoowo.yuehua;

import com.xiaoxiaoowo.yuehua.commands.Test;
import com.xiaoxiaoowo.yuehua.commands.blockcommand.*;
import com.xiaoxiaoowo.yuehua.commands.opcommand.*;
import com.xiaoxiaoowo.yuehua.commands.opcommand.data.DataCountGet;
import com.xiaoxiaoowo.yuehua.commands.opcommand.data.DataGet;
import com.xiaoxiaoowo.yuehua.commands.opcommand.data.DataSet;
import com.xiaoxiaoowo.yuehua.commands.opcommand.data.ItemDataGet;
import com.xiaoxiaoowo.yuehua.commands.playercommand.Yhteam;
import com.xiaoxiaoowo.yuehua.commands.playercommand.*;
import com.xiaoxiaoowo.yuehua.commands.playercommand.completer.*;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.TransferData;
import com.xiaoxiaoowo.yuehua.event.Inventory.Click;
import com.xiaoxiaoowo.yuehua.event.Inventory.Close;
import com.xiaoxiaoowo.yuehua.event.Inventory.Open;
import com.xiaoxiaoowo.yuehua.event.Projectile.Hit;
import com.xiaoxiaoowo.yuehua.event.entity.Damage;
import com.xiaoxiaoowo.yuehua.event.entity.Death;
import com.xiaoxiaoowo.yuehua.event.entity.*;
import com.xiaoxiaoowo.yuehua.event.player.*;
import com.xiaoxiaoowo.yuehua.shilian.huancheng.HuanCheng;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.system.Team;
import com.xiaoxiaoowo.yuehua.utils.*;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public final class Yuehua extends JavaPlugin {
    public static JavaPlugin instance;
    public static BukkitScheduler scheduler;
    public static CommandSender console;
    public static Collection<? extends Player> players;
    public static ServerSocket serverSocket;
    public static ServerSocket mySocket;
    public static Map<UUID, Data> playerData;
    public static Map<UUID, MonsterData> monsterData;
    public static Set<String> nameSet;
    public static List<Inventory> shichang = new ArrayList<>(100);
    public static Map<UUID, Long> timeLastIn;

    @Override
    public void onEnable() {
        instance = this;
        scheduler = Bukkit.getScheduler();
        console = Bukkit.createCommandSender(it -> {
        });
        players = Bukkit.getOnlinePlayers();
        //对map进行put,get,remove都要注意是在主线程中，对数据本身的操作可以在异步线程中
        //playerData size = player count * 100
        playerData = new HashMap<>(500);
        monsterData = new HashMap<>(20000);
        nameSet = new HashSet<>(200);
        timeLastIn = new HashMap<>(1600);
        //数据库
        SQL.connect();

        for (int i = 0; i < 100; i++) {
            Inventory inventory = SQL.retrieveShiChang(i);
            shichang.add(inventory);
        }

        //初始化
        init();

        //注册监听器
        registerListener();

        //注册命令
        registerCommand();
    }


    @Override
    public void onDisable() {
        //清空监听器与任务
        scheduler.cancelTasks(instance);

        //保存玩家数据
        for (Player player : players) {
            UUID uuid = player.getUniqueId();
            Data data = Yuehua.playerData.get(uuid);
            if (data == null) {
                continue;
            }

            PersistentDataContainer pdc = player.getPersistentDataContainer();
            pdc.set(DataContainer.money, PersistentDataType.INTEGER, data.money);
            pdc.set(DataContainer.JinCount, PersistentDataType.INTEGER, data.jinCount);
            pdc.set(DataContainer.MuCount, PersistentDataType.INTEGER, data.muCount);
            pdc.set(DataContainer.ShuiCount, PersistentDataType.INTEGER, data.shuiCount);
            pdc.set(DataContainer.HuoCount, PersistentDataType.INTEGER, data.huoCount);
            pdc.set(DataContainer.TuCount, PersistentDataType.INTEGER, data.tuCount);
            pdc.set(DataContainer.RefinedJinCount, PersistentDataType.INTEGER, data.refinedJinCount);
            pdc.set(DataContainer.RefinedMuCount, PersistentDataType.INTEGER, data.refinedMuCount);
            pdc.set(DataContainer.RefinedShuiCount, PersistentDataType.INTEGER, data.refinedShuiCount);
            pdc.set(DataContainer.RefinedHuoCount, PersistentDataType.INTEGER, data.refinedHuoCount);
            pdc.set(DataContainer.RefinedTuCount, PersistentDataType.INTEGER, data.refinedTuCount);
            pdc.set(DataContainer.ConcentratedJinCount, PersistentDataType.INTEGER, data.concentratedJinCount);
            pdc.set(DataContainer.ConcentratedMuCount, PersistentDataType.INTEGER, data.concentratedMuCount);
            pdc.set(DataContainer.ConcentratedShuiCount, PersistentDataType.INTEGER, data.concentratedShuiCount);
            pdc.set(DataContainer.ConcentratedHuoCount, PersistentDataType.INTEGER, data.concentratedHuoCount);
            pdc.set(DataContainer.ConcentratedTuCount, PersistentDataType.INTEGER, data.concentratedTuCount);

            if (data.job == 2) {
                GongData gongData = (GongData) data;
                pdc.set(DataContainer.time_charging, PersistentDataType.LONG, gongData.time_charging);
                pdc.set(DataContainer.arrow_count, PersistentDataType.INTEGER, gongData.arrow_count);
            }

            String name = player.getName();
            if (data.inventory1 != null) {
                SQL.storePlayerInventory1(name, data.inventory1);
            }
            if (data.inventory2 != null) {
                SQL.storePlayerInventory2(name, data.inventory2);
            }
            if (data.inventory3 != null) {
                SQL.storePlayerInventory3(name, data.inventory3);
            }
            if (data.inventory4 != null) {
                SQL.storePlayerInventory4(name, data.inventory4);
            }
            if (data.inventory5 != null) {
                SQL.storePlayerInventory5(name, data.inventory5);
            }
            if (data.inventory6 != null) {
                SQL.storePlayerInventory6(name, data.inventory6);
            }
            if (data.inventory7 != null) {
                SQL.storePlayerInventory7(name, data.inventory7);
            }
            if (data.inventory8 != null) {
                SQL.storePlayerInventory8(name, data.inventory8);
            }
            if (data.inventory9 != null) {
                SQL.storePlayerInventory9(name, data.inventory9);
            }
            if (data.inventory10 != null) {
                SQL.storePlayerInventory10(name, data.inventory10);
            }
            if (data.inventory11 != null) {
                SQL.storePlayerInventory11(name, data.inventory11);
            }
            if (data.inventory12 != null) {
                SQL.storePlayerInventory12(name, data.inventory12);
            }
            if (data.inventory13 != null) {
                SQL.storePlayerInventory13(name, data.inventory13);
            }
            if (data.inventory14 != null) {
                SQL.storePlayerInventory14(name, data.inventory14);
            }
            if (data.inventory15 != null) {
                SQL.storePlayerInventory15(name, data.inventory15);
            }
            if (data.inventory16 != null) {
                SQL.storePlayerInventory16(name, data.inventory16);
            }
            if (data.inventory17 != null) {
                SQL.storePlayerInventory17(name, data.inventory17);
            }
            if (data.inventory18 != null) {
                SQL.storePlayerInventory18(name, data.inventory18);
            }
            if (data.shipinBar != null) {
                SQL.storeShiPin(uuid.toString(), data.shipinBar);
            }
        }

        for (int i = 0; i < 100; i++) {
            SQL.storeShiChang(i, shichang.get(i));
        }

        //关数据库
        SQL.close();

        //关TCP
        try {
            if (serverSocket != null && !serverSocket.isClosed()) {
                serverSocket.close(); // 关闭服务器套接字
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void init() {
        //@e
        GetEntity.init();
        //队伍
        Team.init();
        //BGM
        Scheduler.asyncTimer(
                () -> {
                    for (Player player : players) {
                        LocationCheck.check(player);
                    }
                }
                , 0, 20 * 60 * 3);

        Scheduler.asyncTimer(
                () -> {
                    for (Data data : playerData.values()) {
                        Player player = data.player;
                        TransferData transferData = new TransferData(data);
                        String string = transferData.toString();
                        InetSocketAddress inetSocketAddress = player.getAddress();
                        String ip = inetSocketAddress.getAddress().getHostAddress();

                        try (Socket socket = new Socket(ip, 23454);
                             OutputStream out = socket.getOutputStream()) {
                            out.write(string.getBytes());
                            out.flush();
                        } catch (Exception e) {
                            Scheduler.sync(
                                    () -> player.kick(Component.text("§c网络异常!"))
                            );
                        }
                    }
                }
                , 0, 10);


        //开tcpserver
        try {
            serverSocket = new ServerSocket(23455);
            System.out.println("TCP Server started on port: " + 23455);
        } catch (IOException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        new Thread(new TcpServer()).start();

        try {
            mySocket = new ServerSocket(23456);
            System.out.println("TCP Server started on port: " + 23456);
        } catch (IOException e) {
            Bukkit.shutdown();
            throw new RuntimeException(e);
        }

        new Thread(new MySocket()).start();
    }

    private void registerListener() {
        PluginManager pluginManager = Bukkit.getPluginManager();

        //entity
        pluginManager.registerEvents(new AddToWorld(), this);
        pluginManager.registerEvents(new Breed(), this);
        pluginManager.registerEvents(new Damage(), this);
        pluginManager.registerEvents(new DamageByEntity(), this);
        pluginManager.registerEvents(new Death(), this);
        pluginManager.registerEvents(new LoadCrossBow(), this);
        pluginManager.registerEvents(new PotionSpLash(), this);
        pluginManager.registerEvents(new RegainHealth(), this);
        pluginManager.registerEvents(new RemoveFromWorld(), this);
        pluginManager.registerEvents(new ShootBow(), this);
        pluginManager.registerEvents(new SlimeSpilt(), this);
        pluginManager.registerEvents(new Transform(), this);


        //Inventory
        pluginManager.registerEvents(new Click(), this);
        pluginManager.registerEvents(new Close(), this);
        pluginManager.registerEvents(new Open(), this);


        //player
        pluginManager.registerEvents(new ConsumeItem(), this);
        pluginManager.registerEvents(new com.xiaoxiaoowo.yuehua.event.player.Death(), this);
        //pluginManager.registerEvents(new DropItem(), this);
        pluginManager.registerEvents(new FlowerPotManipulate(), this);
        pluginManager.registerEvents(new Interact(), this);
        pluginManager.registerEvents(new InventorySlotChange(), this);
        pluginManager.registerEvents(new Join(), this);
        pluginManager.registerEvents(new LevelChange(), this);
        pluginManager.registerEvents(new Login(), this);
        pluginManager.registerEvents(new Quit(), this);
        pluginManager.registerEvents(new Swap(), this);
        pluginManager.registerEvents(new Teleport(), this);

        //projectile
        pluginManager.registerEvents(new Hit(), this);
        //pluginManager.registerEvents(new Launch(), this);


        //Spawner
        //pluginManager.registerEvents(new Spawn(), this);

    }

    private void registerCommand() {
        //blockcommand
        Objects.requireNonNull(Bukkit.getPluginCommand("blocktp")).setExecutor(new BlockTp());
        Objects.requireNonNull(Bukkit.getPluginCommand("duanzao")).setExecutor(new DuanZao());
        Objects.requireNonNull(Bukkit.getPluginCommand("intogame")).setExecutor(new IntoGame());
        Objects.requireNonNull(Bukkit.getPluginCommand("markrelife")).setExecutor(new MarkRelife());
        Objects.requireNonNull(Bukkit.getPluginCommand("mybossspawn")).setExecutor(new MyBossSpawn());
        Objects.requireNonNull(Bukkit.getPluginCommand("myspawn")).setExecutor(new MySpawn());
        Objects.requireNonNull(Bukkit.getPluginCommand("relife")).setExecutor(new Relife());
        Objects.requireNonNull(Bukkit.getPluginCommand("renou")).setExecutor(new RenOu());
        Objects.requireNonNull(Bukkit.getPluginCommand("renou2")).setExecutor(new RenOu2());
        Objects.requireNonNull(Bukkit.getPluginCommand("select")).setExecutor(new Select());
        Objects.requireNonNull(Bukkit.getPluginCommand("storerelifestone")).setExecutor(new StoreRelifeStone());

        //opcommand
        //DATA
        Objects.requireNonNull(Bukkit.getPluginCommand("datacountget")).setExecutor(new DataCountGet());
        Objects.requireNonNull(Bukkit.getPluginCommand("dataget")).setExecutor(new DataGet());
        Objects.requireNonNull(Bukkit.getPluginCommand("dataset")).setExecutor(new DataSet());
        Objects.requireNonNull(Bukkit.getPluginCommand("itemdataget")).setExecutor(new ItemDataGet());

        Objects.requireNonNull(Bukkit.getPluginCommand("clearup")).setExecutor(new Clearup());
        Objects.requireNonNull(Bukkit.getPluginCommand("gi")).setExecutor(new GI());
        Objects.requireNonNull(Bukkit.getPluginCommand("mytp")).setExecutor(new MyTp());
        Objects.requireNonNull(Bukkit.getPluginCommand("mytp")).setTabCompleter(new MyTpTab());
        Objects.requireNonNull(Bukkit.getPluginCommand("perget")).setExecutor(new com.xiaoxiaoowo.yuehua.commands.opcommand.PerGet());
        Objects.requireNonNull(Bukkit.getPluginCommand("setsign")).setExecutor(new SetSign());
        Objects.requireNonNull(Bukkit.getPluginCommand("mysummon")).setExecutor(new Summon());

        //playercommand
        Objects.requireNonNull(Bukkit.getPluginCommand("arrow")).setTabCompleter(new ArrowCom());
        Objects.requireNonNull(Bukkit.getPluginCommand("buy")).setTabCompleter(new BuyCom());
        Objects.requireNonNull(Bukkit.getPluginCommand("money")).setTabCompleter(new com.xiaoxiaoowo.yuehua.commands.playercommand.completer.MoneyCom());
        Objects.requireNonNull(Bukkit.getPluginCommand("ys")).setTabCompleter(new YuanSuCom());
        Objects.requireNonNull(Bukkit.getPluginCommand("sale")).setTabCompleter(new SaleCom());
        Objects.requireNonNull(Bukkit.getPluginCommand("sell")).setTabCompleter(new SellCom());
        Objects.requireNonNull(Bukkit.getPluginCommand("yhteam")).setTabCompleter(new com.xiaoxiaoowo.yuehua.commands.playercommand.completer.Yhteam());
        Objects.requireNonNull(Bukkit.getPluginCommand("arrow")).setExecutor(new ArrowCMD());
        Objects.requireNonNull(Bukkit.getPluginCommand("buy")).setExecutor(new Buy());
        Objects.requireNonNull(Bukkit.getPluginCommand("ki")).setExecutor(new Kill());
        Objects.requireNonNull(Bukkit.getPluginCommand("money")).setExecutor(new MoneyCMD());
        Objects.requireNonNull(Bukkit.getPluginCommand("sale")).setExecutor(new Sale());
        Objects.requireNonNull(Bukkit.getPluginCommand("sell")).setExecutor(new Sell());
        Objects.requireNonNull(Bukkit.getPluginCommand("yh")).setExecutor(new Yh());
        Objects.requireNonNull(Bukkit.getPluginCommand("yhteam")).setExecutor(new Yhteam());
        Objects.requireNonNull(Bukkit.getPluginCommand("ys")).setExecutor(new YuanSuCMD());

        //test
        Objects.requireNonNull(Bukkit.getPluginCommand("test")).setExecutor(new Test());

        //环城跑酷
        Objects.requireNonNull(Bukkit.getPluginCommand("huancheng")).setExecutor(new HuanCheng());
    }

    public static boolean ItemCompare(ItemStack itemStack1, ItemStack itemStack2) {
        if (itemStack1.getType() != itemStack2.getType()) {
            return false;
        }
        if (itemStack1.getAmount() != itemStack2.getAmount()) {
            return false;
        }
        ItemMeta itemMeta1 = itemStack1.getItemMeta();
        ItemMeta itemMeta2 = itemStack2.getItemMeta();
        return Objects.equals(itemMeta1.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING), itemMeta2.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING));
    }

}
