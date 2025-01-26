package com.xiaoxiaoowo.yuehua;

import com.xiaoxiaoowo.yuehua.commands.Test;
import com.xiaoxiaoowo.yuehua.commands.blockcommand.*;
import com.xiaoxiaoowo.yuehua.commands.opcommand.*;
import com.xiaoxiaoowo.yuehua.commands.opcommand.data.DataCountGet;
import com.xiaoxiaoowo.yuehua.commands.opcommand.data.DataGet;
import com.xiaoxiaoowo.yuehua.commands.opcommand.data.DataSet;
import com.xiaoxiaoowo.yuehua.commands.opcommand.data.ItemDataGet;
import com.xiaoxiaoowo.yuehua.commands.playercommand.Check;
import com.xiaoxiaoowo.yuehua.commands.playercommand.*;
import com.xiaoxiaoowo.yuehua.commands.playercommand.completer.BuyCom;
import com.xiaoxiaoowo.yuehua.commands.playercommand.completer.SaleCom;
import com.xiaoxiaoowo.yuehua.commands.playercommand.completer.SellCom;
import com.xiaoxiaoowo.yuehua.data.*;
import com.xiaoxiaoowo.yuehua.event.Inventory.Click;
import com.xiaoxiaoowo.yuehua.event.Inventory.Close;
import com.xiaoxiaoowo.yuehua.event.Inventory.Open;
import com.xiaoxiaoowo.yuehua.event.Projectile.Hit;
import com.xiaoxiaoowo.yuehua.event.block.CauldronLevelChange;
import com.xiaoxiaoowo.yuehua.event.block.Ingite;
import com.xiaoxiaoowo.yuehua.event.entity.Death;
import com.xiaoxiaoowo.yuehua.event.entity.*;
import com.xiaoxiaoowo.yuehua.event.player.*;
import com.xiaoxiaoowo.yuehua.guis.dz.DuanZao;
import com.xiaoxiaoowo.yuehua.guis.other.Shichang;
import com.xiaoxiaoowo.yuehua.shilian.huancheng.HuanCheng;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.system.Team;
import com.xiaoxiaoowo.yuehua.utils.*;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

import java.sql.SQLException;
import java.util.*;
import java.util.logging.Logger;

public final class Yuehua extends JavaPlugin {
    public static JavaPlugin instance;
    public static BukkitScheduler scheduler;
    public static CommandSender console;
    public static Collection<? extends Player> players;

    public static Map<UUID, Data> playerData;
    public static Map<UUID, MonsterData> monsterData;
    public static Map<UUID, PetData> petData;

    public static Map<UUID, Long> timeLastIn;
    public static Set<UUID> checkSet;


    public static List<Inventory> shichang = new ArrayList<>(100);
    public static Map<String, Inventory> sharedInv = new HashMap<>(1000);

    public static Logger logger;



    @Override
    public void onEnable() {
//        Bukkit.setWhitelist(false);

        instance = this;
        logger = this.getLogger();
        scheduler = Bukkit.getScheduler();
        console = Bukkit.createCommandSender(it -> {
        });
        players = Bukkit.getOnlinePlayers();
        //对map进行put,get,remove都要注意是在主线程中，对数据本身的操作可以在异步线程中
        //playerData size = player count * 100
        playerData = new HashMap<>(500);
        monsterData = new HashMap<>(20000);
        petData = new HashMap<>(2000);

        checkSet = new HashSet<>(200);
        timeLastIn = new HashMap<>(1600);
        //数据库
        SQL.connect();


        for (int i = 0; i < 100; i++) {
            Inventory inventory = SQL.retrieveShiChang(i);
            shichang.add(inventory);
        }

        Scheduler.asyncTimer(Shichang::reshapeShichang, 0, 200);


        //初始化共享存储
        SQL.initialShared();

        try {
            DuanZao.getFromSql();
        } catch (SQLException e) {
            throw new RuntimeException(e);
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
        Bukkit.setWhitelist(true);

        //清空监听器与任务
        scheduler.cancelTasks(instance);

        try {
            MySocket.server.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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
            pdc.set(DataContainer.checkCount, PersistentDataType.INTEGER, data.nextCheckCount);

            pdc.set(DataContainer.killEastSkeletonConut, PersistentDataType.INTEGER, data.killEastSkeletonConut);
            pdc.set(DataContainer.killEastZombieCount, PersistentDataType.INTEGER, data.killEastZombieCount);
            pdc.set(DataContainer.killEastSpiderCount, PersistentDataType.INTEGER, data.killEastSpiderCount);

            pdc.set(DataContainer.killEastArrowSkeletonCount, PersistentDataType.INTEGER, data.killEastArrowSkeletonCount);
            pdc.set(DataContainer.killEastPoisonFlyCount, PersistentDataType.INTEGER, data.killEastPoisonFlyCount);
            pdc.set(DataContainer.killEastZombieEliteCount, PersistentDataType.INTEGER, data.killEastZombieEliteCount);
            pdc.set(DataContainer.killEastSpiderEliteCount, PersistentDataType.INTEGER, data.killEastSpiderEliteCount);

            pdc.set(DataContainer.killEastZombieMountainCount, PersistentDataType.INTEGER, data.killEastZombieMountainCount);
            pdc.set(DataContainer.killEastSpiderMountainCount, PersistentDataType.INTEGER, data.killEastSpiderMountainCount);
            pdc.set(DataContainer.killEastArrowSkeletonMountainCount, PersistentDataType.INTEGER, data.killEastArrowSkeletonMountainCount);

            pdc.set(DataContainer.killEastPoisonFlyMountainCount, PersistentDataType.INTEGER, data.killEastPoisonFlyMountainCount);
            pdc.set(DataContainer.killEastPandaMountainCount, PersistentDataType.INTEGER, data.killEastPandaMountainCount);
            pdc.set(DataContainer.killEastArrowSkeletonSHENMUCount, PersistentDataType.INTEGER, data.killEastArrowSkeletonSHENMUCount);

            pdc.set(DataContainer.killEastSpiderQueenMountainCount, PersistentDataType.INTEGER, data.killEastSpiderQueenMountainCount);
            pdc.set(DataContainer.killEastWaterGhostMountainCount, PersistentDataType.INTEGER, data.killEastWaterGhostMountainCount);
            pdc.set(DataContainer.killEastPoisonSpiderMountainCount, PersistentDataType.INTEGER, data.killEastPoisonSpiderMountainCount);

            if (data.job == 2) {
                GongData gongData = (GongData) data;
                pdc.set(DataContainer.time_charging, PersistentDataType.LONG, gongData.time_charging);
                pdc.set(DataContainer.arrow_count, PersistentDataType.INTEGER, gongData.arrow_count);
            }

            if (data.job == 3) {
                DanData danData = (DanData) data;
                //金木水火土
                pdc.set(DataContainer.jinCd, PersistentDataType.LONG, danData.cd_jin);
                pdc.set(DataContainer.muCd, PersistentDataType.LONG, danData.cd_mu);
                pdc.set(DataContainer.shuiCd, PersistentDataType.LONG, danData.cd_shui);
                pdc.set(DataContainer.huoCd, PersistentDataType.LONG, danData.cd_huo);
                pdc.set(DataContainer.tuCd, PersistentDataType.LONG, danData.cd_tu);
            }

            String name = player.getName();
            player.kick(Component.text("服务器关闭"));
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

        //保存共享存储
        for (Map.Entry<String, Inventory> entry : sharedInv.entrySet()) {
            SQL.storeShared(entry.getKey(), entry.getValue());
        }

        //保存配方
        SQL.storeRecipe();

        DuanZao.storeToSql();

        //关数据库
        SQL.close();

        for (Entity entity : GetEntity.world.getEntities()) {
            if (entity.getScoreboardTags().contains("p")) {
                entity.remove();
            }
        }


    }

    private void init() {
        //@e
        GetEntity.init();
        //队伍
        Team.init();

        MySocket.init();
    }

    private void registerListener() {
        PluginManager pluginManager = Bukkit.getPluginManager();

        //entity
        pluginManager.registerEvents(new AddToWorld(), this);
        pluginManager.registerEvents(new Breed(), this);
        pluginManager.registerEvents(new Combust(), this);
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

        pluginManager.registerEvents(new CauldronLevelChange(), this);
        pluginManager.registerEvents(new Ingite(), this);

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
        Objects.requireNonNull(Bukkit.getPluginCommand("renou3")).setExecutor(new RenOu3());
        Objects.requireNonNull(Bukkit.getPluginCommand("select")).setExecutor(new Select());
        Objects.requireNonNull(Bukkit.getPluginCommand("storerelifestone")).setExecutor(new StoreRelifeStone());
        Objects.requireNonNull(Bukkit.getPluginCommand("mission")).setExecutor(new Mission());

        //opcommand
        //DATA
        Objects.requireNonNull(Bukkit.getPluginCommand("a")).setExecutor(new A());
        Objects.requireNonNull(Bukkit.getPluginCommand("datacountget")).setExecutor(new DataCountGet());
        Objects.requireNonNull(Bukkit.getPluginCommand("dataget")).setExecutor(new DataGet());
        Objects.requireNonNull(Bukkit.getPluginCommand("dataset")).setExecutor(new DataSet());
        Objects.requireNonNull(Bukkit.getPluginCommand("itemdataget")).setExecutor(new ItemDataGet());

        Objects.requireNonNull(Bukkit.getPluginCommand("clearup")).setExecutor(new Clearup());
        Objects.requireNonNull(Bukkit.getPluginCommand("gi")).setExecutor(new GI());
        Objects.requireNonNull(Bukkit.getPluginCommand("mysave")).setExecutor(new MySave());
        Objects.requireNonNull(Bukkit.getPluginCommand("mytp")).setExecutor(new MyTp());
        Objects.requireNonNull(Bukkit.getPluginCommand("mytp")).setTabCompleter(new MyTpTab());
        Objects.requireNonNull(Bukkit.getPluginCommand("perget")).setExecutor(new com.xiaoxiaoowo.yuehua.commands.opcommand.PerGet());
        Objects.requireNonNull(Bukkit.getPluginCommand("r")).setExecutor(new R());
        Objects.requireNonNull(Bukkit.getPluginCommand("setsign")).setExecutor(new SetSign());
        Objects.requireNonNull(Bukkit.getPluginCommand("mysummon")).setExecutor(new Summon());

        //playercommand
//        Objects.requireNonNull(Bukkit.getPluginCommand("arrow")).setTabCompleter(new ArrowCom());
        Objects.requireNonNull(Bukkit.getPluginCommand("buy")).setTabCompleter(new BuyCom());
//        Objects.requireNonNull(Bukkit.getPluginCommand("money")).setTabCompleter(new com.xiaoxiaoowo.yuehua.commands.playercommand.completer.MoneyCom());
//        Objects.requireNonNull(Bukkit.getPluginCommand("ys")).setTabCompleter(new YuanSuCom());
        Objects.requireNonNull(Bukkit.getPluginCommand("sale")).setTabCompleter(new SaleCom());
        Objects.requireNonNull(Bukkit.getPluginCommand("sell")).setTabCompleter(new SellCom());
        Objects.requireNonNull(Bukkit.getPluginCommand("yhteam")).setTabCompleter(new com.xiaoxiaoowo.yuehua.commands.playercommand.completer.Yhteam());
//        Objects.requireNonNull(Bukkit.getPluginCommand("arrow")).setExecutor(new ArrowCMD());
        Objects.requireNonNull(Bukkit.getPluginCommand("buy")).setExecutor(new Buy());
//        Objects.requireNonNull(Bukkit.getPluginCommand("ki")).setExecutor(new Kill());
//        Objects.requireNonNull(Bukkit.getPluginCommand("money")).setExecutor(new MoneyCMD());
        Objects.requireNonNull(Bukkit.getPluginCommand("sale")).setExecutor(new Sale());
        Objects.requireNonNull(Bukkit.getPluginCommand("sell")).setExecutor(new Sell());
//        Objects.requireNonNull(Bukkit.getPluginCommand("yh")).setExecutor(new Yh());
        Objects.requireNonNull(Bukkit.getPluginCommand("yhteam")).setExecutor(new Yhteam());
//        Objects.requireNonNull(Bukkit.getPluginCommand("ys")).setExecutor(new YuanSuCMD());
        Objects.requireNonNull(Bukkit.getPluginCommand("c")).setExecutor(new Check());
        Objects.requireNonNull(Bukkit.getPluginCommand("c")).setTabCompleter(new com.xiaoxiaoowo.yuehua.commands.playercommand.completer.Check());
        Objects.requireNonNull(Bukkit.getPluginCommand("fixlore")).setExecutor(new FixLore());

        //test
        Objects.requireNonNull(Bukkit.getPluginCommand("test")).setExecutor(new Test());

        Objects.requireNonNull(Bukkit.getPluginCommand("advancement")).setExecutor(new Advancement());

        //环城跑酷
        Objects.requireNonNull(Bukkit.getPluginCommand("huancheng")).setExecutor(new HuanCheng());
    }

}
