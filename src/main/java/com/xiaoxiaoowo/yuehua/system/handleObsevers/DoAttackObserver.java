package com.xiaoxiaoowo.yuehua.system.handleObsevers;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.display.utils.ParticleUtils;
import com.xiaoxiaoowo.yuehua.system.Buff;
import com.xiaoxiaoowo.yuehua.system.Cure;
import com.xiaoxiaoowo.yuehua.system.Damage;
import com.xiaoxiaoowo.yuehua.task.weapon.PoKongFu;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Map;
import java.util.Random;

public final class DoAttackObserver {
    private static final World world = GetEntity.world;
    private static final PotionEffect baoHe20s = new PotionEffect(PotionEffectType.SATURATION, 20 * 20, 0);
    public static final Random random = new Random();

    public static final Particle.DustOptions whiteDust = new Particle.DustOptions(Color.WHITE, 2);
    public static final BlockData iron = Bukkit.createBlockData(Material.IRON_BLOCK);
    public static final BlockData bedRock = Bukkit.createBlockData(Material.BEDROCK);

    public static double doAttack(String id, Data data, MonsterData monsterData) {
        switch (id) {
            case "taoMuJian" -> {
                return doTaoMuJian(data, monsterData);
            }

            case "kaiShanDao" -> {
                return doKaiShanDao(data, monsterData);
            }

            case "juTongZhanChui" -> {
                return doJinGuaChui(data, monsterData);
            }

            case "poKongFu" -> {
                return doPoKongFu(data, monsterData);
            }

            case "sanBaoYuRuYi" -> {
                return doSanBaoYuRuYi(data, monsterData);
            }

            case "hongLuanGong" -> {
                return doHongLuanGong(data, monsterData);
            }

            default -> {
                return 1.0d;
            }
        }
    }

    public static double doHongLuanGong(Data data, MonsterData monsterData) {
        double damage = (double) data.extraData.get("hongLuanGongAttack");
        Damage.damageMonster(data, damage, monsterData);
        return 1.0d;
    }

    public static double doTaoMuJian(Data data, MonsterData monsterData) {
        data.attackObservers.remove("taoMuJian");
        double damage = data.attack * 3;
        Damage.damageMonster(data, damage, monsterData);
        ParticleUtils.atMonsterDust(monsterData.monster,whiteDust);

        return 1.0d;
    }

    public static double doKaiShanDao(Data data, MonsterData monsterData) {
        data.attackObservers.remove("kaiShanDao");
        double damage = data.attack * 4;
        Damage.damageMonster(data, damage, monsterData);
        Buff.deHujia(monsterData, 5 * 20, 0.2, "kaiShanDao");
        ParticleUtils.atMonster(monsterData.monster,Particle.CRIT);
        return 1.0d;
    }

    public static double doJinGuaChui(Data data, MonsterData monsterData) {
        data.attackObservers.remove("juTongZhanChui");
        double damage = data.attack * 5;
        Damage.damageMonster(data, damage, monsterData);
        ParticleUtils.atMonster(monsterData.monster,Particle.CRIT);
        Player player = data.player;
        double damageRange = data.attack * 3;
        for (Entity entity : GetEntity.getMonsters(player.getLocation(), 5, 5, 5)) {
            MonsterData monsterData2 = Yuehua.monsterData.get(entity.getUniqueId());
            Damage.damageMonster(data, damageRange, monsterData2);
            ParticleUtils.atMonsterBlock(monsterData2.monster,iron);
            Buff.xuanYun(monsterData2, 2 * 20);
        }
        return 1.0d;
    }

    public static double doPoKongFu(Data data, MonsterData monsterData) {
        data.attackObservers.remove("poKongFu");
        double damage = data.attack * 6;
        Damage.damageMonster(data, damage, monsterData);
        ParticleUtils.atMonster(monsterData.monster,Particle.CRIT);
        new PoKongFu(5, monsterData, data, data.attack * 2).runTaskTimer(Yuehua.instance, 20, 20);
        Buff.jianSu(monsterData, 5 * 20, 1);

        monsterData.wuliAttackedObservers.add("poKongFu");
        Map<String, Object> extraData = monsterData.extraData;
        long timeEnd = (long) extraData.getOrDefault("poKongFu", 0L);
        long timeNow = GetEntity.world.getGameTime();
        if (timeEnd > timeNow) {
            extraData.put("poKongFu", timeEnd - 1 + 5 * 20L);
            Scheduler.syncLater(() -> {
                long timeNowInTask = GetEntity.world.getGameTime();
                long timeEndInTask = (long) extraData.get("poKongFu");
                if (timeEndInTask > timeNowInTask) {
                    return;
                }
                monsterData.wuliAttackedObservers.remove("poKongFu");
            }, 5 * 20L);
        } else {
            extraData.put("poKongFu", timeNow - 1 + 5 * 20L);
            Scheduler.syncLater(() -> {
                long timeNowInTask = GetEntity.world.getGameTime();
                long timeEndInTask = (long) extraData.get("poKongFu");
                if (timeEndInTask > timeNowInTask) {
                    return;
                }
                monsterData.wuliAttackedObservers.remove("poKongFu");
            }, 5 * 20L);
        }

        return 1.0d;
    }

    public static double doSanBaoYuRuYi(Data data, MonsterData monsterData) {
        data.attackObservers.remove("sanBaoYuRuYi");
        double damage = data.attack * 7;
        Damage.damageMonster(data, damage, monsterData);
        ParticleUtils.atMonsterDust(monsterData.monster,whiteDust);
        Map<String, Object> extraData = monsterData.extraData;
        long timeNow = GetEntity.world.getGameTime();
        //生成一个随机数，数字的取值范围是0，1，2
        int randomNum = (int) (random.nextDouble() * 3);
        switch (randomNum) {
            case 0 -> {
                long timeEnd = (long) extraData.getOrDefault("sanBaoYuRuYi-fo", 0L);
                if (timeEnd > timeNow) {
                    Player player = data.player;
                    extraData.put("sanBaoYuRuYi-fo", 0L);
                    monsterData.wuliAttackedObservers.remove("sanBaoYuRuYi-fo");
                    SendInformation.sendMes(data.player, Component.text("§e[三宝]§6[佛]§a消除"));
                    for (Entity entity : GetEntity.getMonsters(player.getLocation(), 16, 16, 16)) {
                        damage = data.attack * 28;
                        MonsterData monsterData1 = Yuehua.monsterData.get(entity.getUniqueId());
                        Damage.damageMonster(data, damage, monsterData1);
                        ParticleUtils.atMonsterBlock(monsterData1.monster,iron);
                    }
                    return 1.0d;
                }
                extraData.put("sanBaoYuRuYi-fo", timeNow - 1 + 20 * 20L);
                monsterData.wuliAttackedObservers.add("sanBaoYuRuYi-fo");
                Scheduler.syncLater(() -> {
                    long timeNowInTask = GetEntity.world.getGameTime();
                    long timeEndInTask = (long) extraData.get("sanBaoYuRuYi-fo");
                    if (timeEndInTask > timeNowInTask) {
                        return;
                    }
                    monsterData.wuliAttackedObservers.remove("sanBaoYuRuYi-fo");
                }, 20 * 20L);
                SendInformation.sendMes(data.player, Component.text("§e[三宝]§6[佛]§a附加"));

            }
            case 1 -> {
                long timeEnd = (long) extraData.getOrDefault("sanBaoYuRuYi-fa", 0L);
                if (timeEnd > timeNow) {
                    Player player = data.player;
                    extraData.put("sanBaoYuRuYi-fa", 0L);
                    monsterData.wuliAttackedObservers.remove("sanBaoYuRuYi-fa");
                    SendInformation.sendMes(data.player, Component.text("§e[三宝]§6[法]§a消除"));
                    Cure.curePlayer(0.1 * player.getAttribute(Attribute.MAX_HEALTH).getValue() + 200, data);
                    return 1.0d;
                }
                extraData.put("sanBaoYuRuYi-fa", timeNow - 1 + 20 * 20L);
                monsterData.wuliAttackedObservers.add("sanBaoYuRuYi-fa");
                Scheduler.syncLater(() -> {
                    long timeNowInTask = GetEntity.world.getGameTime();
                    long timeEndInTask = (long) extraData.get("sanBaoYuRuYi-fa");
                    if (timeEndInTask > timeNowInTask) {
                        return;
                    }
                    monsterData.wuliAttackedObservers.remove("sanBaoYuRuYi-fa");
                }, 20 * 20L);
                SendInformation.sendMes(data.player, Component.text("§e[三宝]§6[法]§a附加"));
            }

            case 2 -> {
                long timeEnd = (long) extraData.getOrDefault("sanBaoYuRuYi-seng", 0L);
                if (timeEnd > timeNow) {
                    extraData.put("sanBaoYuRuYi-seng", 0L);
                    monsterData.wuliAttackedObservers.remove("sanBaoYuRuYi-seng");
                    SendInformation.sendMes(data.player, Component.text("§e[三宝]§6[僧]§a消除"));
                    data.player.addPotionEffect(baoHe20s);
                    return 1.0d;
                }
                extraData.put("sanBaoYuRuYi-seng", timeNow - 1 + 20 * 20L);
                monsterData.wuliAttackedObservers.add("sanBaoYuRuYi-seng");
                Scheduler.syncLater(() -> {
                    long timeNowInTask = GetEntity.world.getGameTime();
                    long timeEndInTask = (long) extraData.get("sanBaoYuRuYi-seng");
                    if (timeEndInTask > timeNowInTask) {
                        return;
                    }
                    monsterData.wuliAttackedObservers.remove("sanBaoYuRuYi-seng");
                }, 20 * 20L);
                SendInformation.sendMes(data.player, Component.text("§e[三宝]§6[僧]§a附加"));
            }
        }

        return 1.0d;
    }
}
