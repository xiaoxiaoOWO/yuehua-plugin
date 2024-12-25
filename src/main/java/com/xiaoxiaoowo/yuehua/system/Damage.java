package com.xiaoxiaoowo.yuehua.system;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.PetData;
import com.xiaoxiaoowo.yuehua.system.handleMonsters.DoMonsterAttacked;
import com.xiaoxiaoowo.yuehua.system.handleMonsters.DoMonsterMoFaAttacked;
import com.xiaoxiaoowo.yuehua.system.handleMonsters.DoMonsterWuLiAttacked;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoAttackedObserver;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoBaojiObserver;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.Vector;

import java.util.ArrayList;

import static com.xiaoxiaoowo.yuehua.utils.GetEntity.random;

public final class Damage {

    public static void damageMultiEye(Location eyeloc, double sizeAdder, double interval, int count, double damage, Data data, int moveTimeForOnePart) {
        Vector direction = eyeloc.getDirection().normalize();
        Vector eyeVector = eyeloc.toVector();
        for (int i = 0; i < count; i++) {
            Vector start = eyeVector.clone().add(direction.clone().multiply(interval * i));
            Vector end = eyeVector.clone().add(direction.clone().multiply(interval * (i + 1)));
            Scheduler.syncLater(() -> {
                for (Mob mob : GetEntity.getLineMonster(start, end, sizeAdder)) {
                    Damage.damageMonster(data, damage, mob);
                }
            }, (long) ((i + 0.5) * moveTimeForOnePart + 2));

        }
    }

    public static void damageMultiLine(Vector start, Vector end, double sizeAdder, int count, double damage, Data data, int moveTimeForOnePart) {
        Vector lineVector = end.clone().subtract(start);
        Vector direction = lineVector.normalize();
        double totalDistance = lineVector.length();
        double partDistance = totalDistance / count;

        for (int i = 0; i < count; i++) {
            Vector partStart = start.clone().add(direction.clone().multiply(partDistance * i));
            Vector partEnd = start.clone().add(direction.clone().multiply(partDistance * (i + 1)));

            Scheduler.syncLater(() -> {
                for (Mob mob : GetEntity.getLineMonster(partStart, partEnd, sizeAdder)) {
                    Damage.damageMonster(data, damage, mob);
                }
            }, (long) ((i + 0.5) * moveTimeForOnePart + 2));
        }

    }

    public static void damageOneEye(Location eyeloc, double sizeAdder, double midDistance, double damage, Data data, int moveTimeForOnePart) {
        Scheduler.syncLater(() -> {
            for (Mob mob : GetEntity.getRayMonster(eyeloc, midDistance, sizeAdder)) {
                Damage.damageMonster(data, damage, mob);
            }
        }, (long) (0.5 * moveTimeForOnePart + 2));
    }

    public static void damageOneLine(Vector start, Vector end, double sizeAdder, double damage, Data data, int moveTimeForOnePart) {
        Scheduler.syncLater(() -> {
            for (Mob mob : GetEntity.getLineMonster(start, end, sizeAdder)) {
                Damage.damageMonster(data, damage, mob);
            }
        }, (long) (0.5 * moveTimeForOnePart + 2));
    }

    public static void damageMonster(Data data, double damage, Mob mob) {
        Player player = data.player;

        //仇恨
        if (mob.getTarget() == null) {
            mob.setTarget(player);
        }
        MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());

        monsterData.lastAttacker = player;

        double baoji = data.baoji;
        double baojixiaoguo = data.baojixiaoguo;
        //判断是否暴击
        if (data.mustBaoji > 0) {
            data.mustBaoji--;
            damage = damage * baojixiaoguo;
            for (String observer : data.baoJiObservers) {
                damage = damage * DoBaojiObserver.doBaoji(observer, data, monsterData);
            }
        } else if (random.nextDouble() < baoji) {
            damage = damage * baojixiaoguo;
            for (String observer : data.baoJiObservers) {
                damage = damage * DoBaojiObserver.doBaoji(observer, data, monsterData);
            }
        }


        //取数据
        double fakang = monsterData.fakang;
        double gedang = monsterData.gedang;
        double x = Math.max(0.0, fakang - data.pofa);
        double y = x / (0.5 + x);

        double damage2 = damage - gedang;

        damage2 = damage2 * (1.0 - y);

        for (String observer : monsterData.mofaAttackedObservers) {
            damage2 = damage2 * DoMonsterMoFaAttacked.doMoFaAttacked(observer, monsterData, data);
        }

        for (String observer : monsterData.attackedObservers) {
            damage2 = damage2 * DoMonsterAttacked.doAttacked(observer, monsterData, data);
        }

        mob.damage(damage2);
    }

    public static void damageMonster(Data data, double damage, MonsterData monsterData) {
        if (monsterData == null) {
            return;
        }

        Player player = data.player;
        Mob mob = monsterData.monster;

        //仇恨
        if (mob.getTarget() == null) {
            mob.setTarget(player);
        }

        monsterData.lastAttacker = player;

        double baoji = data.baoji;
        double baojixiaoguo = data.baojixiaoguo;
        //判断是否暴击
        if (data.mustBaoji > 0) {
            data.mustBaoji--;
            damage = damage * baojixiaoguo;
            for (String observer : data.baoJiObservers) {
                damage = damage * DoBaojiObserver.doBaoji(observer, data, monsterData);
            }
        } else if (random.nextDouble() < baoji) {
            damage = damage * baojixiaoguo;
            for (String observer : data.baoJiObservers) {
                damage = damage * DoBaojiObserver.doBaoji(observer, data, monsterData);
            }
        }


        //取数据
        double fakang = monsterData.fakang;
        double gedang = monsterData.gedang;
        double x = Math.max(0.0, fakang - data.pofa);
        double y = x / (0.5 + x);

        double damage2 = damage - gedang;

        damage2 = damage2 * (1.0 - y);

        for (String observer : monsterData.mofaAttackedObservers) {
            damage2 = damage2 * DoMonsterMoFaAttacked.doMoFaAttacked(observer, monsterData, data);
        }

        for (String observer : monsterData.attackedObservers) {
            damage2 = damage2 * DoMonsterAttacked.doAttacked(observer, monsterData, data);
        }

        mob.damage(damage2);
    }


    public static void damageMonster(Data data, double damage, ArrayList<Mob> mobs) {
        Player player = data.player;
        double baoji = data.baoji;
        double baojixiaoguo = data.baojixiaoguo;

        for (Mob mob : mobs) {
            //仇恨
            if (mob.getTarget() == null) {
                mob.setTarget(player);
            }
            MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());

            monsterData.lastAttacker = player;


            //判断是否暴击
            if (data.mustBaoji > 0) {
                data.mustBaoji--;
                damage = damage * baojixiaoguo;
                for (String observer : data.baoJiObservers) {
                    damage = damage * DoBaojiObserver.doBaoji(observer, data, monsterData);
                }
            } else if (random.nextDouble() < baoji) {
                damage = damage * baojixiaoguo;
                for (String observer : data.baoJiObservers) {
                    damage = damage * DoBaojiObserver.doBaoji(observer, data, monsterData);
                }
            }


            //取数据
            double fakang = monsterData.fakang;
            double gedang = monsterData.gedang;
            double x = Math.max(0.0, fakang - data.pofa);
            double y = x / (0.5 + x);

            double damage2 = damage - gedang;

            damage2 = damage2 * (1.0 - y);

            for (String observer : monsterData.mofaAttackedObservers) {
                damage2 = damage2 * DoMonsterMoFaAttacked.doMoFaAttacked(observer, monsterData, data);
            }

            for (String observer : monsterData.attackedObservers) {
                damage2 = damage2 * DoMonsterAttacked.doAttacked(observer, monsterData, data);
            }

            mob.damage(damage2);
        }
    }


    public static void damageMonsterWhenMonsterDataAlready(Data data, double damage, ArrayList<MonsterData> monsterDataArrayList) {
        Player player = data.player;
        double baoji = data.baoji;
        double baojixiaoguo = data.baojixiaoguo;

        for (MonsterData monsterData : monsterDataArrayList) {
            Mob mob = monsterData.monster;

            //仇恨
            if (mob.getTarget() == null) {
                mob.setTarget(player);
            }

            monsterData.lastAttacker = player;


            //判断是否暴击
            if (data.mustBaoji > 0) {
                data.mustBaoji--;
                damage = damage * baojixiaoguo;
                for (String observer : data.baoJiObservers) {
                    damage = damage * DoBaojiObserver.doBaoji(observer, data, monsterData);
                }
            } else if (random.nextDouble() < baoji) {
                damage = damage * baojixiaoguo;
                for (String observer : data.baoJiObservers) {
                    damage = damage * DoBaojiObserver.doBaoji(observer, data, monsterData);
                }
            }


            //取数据
            double fakang = monsterData.fakang;
            double gedang = monsterData.gedang;
            double x = Math.max(0.0, fakang - data.pofa);
            double y = x / (0.5 + x);

            double damage2 = damage - gedang;

            damage2 = damage2 * (1.0 - y);

            for (String observer : monsterData.mofaAttackedObservers) {
                damage2 = damage2 * DoMonsterMoFaAttacked.doMoFaAttacked(observer, monsterData, data);
            }

            for (String observer : monsterData.attackedObservers) {
                damage2 = damage2 * DoMonsterAttacked.doAttacked(observer, monsterData, data);
            }

            mob.damage(damage2);
        }
    }

    public static void damageMonster(PetData petData, double damage, Mob mob) {
        MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
        monsterData.lastAttacker = petData.Owner;

        //取数据
        double fakang = monsterData.fakang;
        double gedang = monsterData.gedang;
        double x = Math.max(0.0, fakang - petData.pofa);
        double y = x / (0.5 + x);
        double damage2 = damage - gedang;
        damage2 = damage2 * (1.0 - y);

        for (String observer : monsterData.mofaAttackedObservers) {
            damage2 = damage2 * DoMonsterMoFaAttacked.doMoFaAttacked(observer, monsterData, petData);
        }

        for (String observer : monsterData.attackedObservers) {
            damage2 = damage2 * DoMonsterAttacked.doAttacked(observer, monsterData, petData);
        }

        mob.damage(damage2);
    }

    public static void damageMonster(PetData petData, double damage, ArrayList<Mob> mobs) {
        for (Mob mob : mobs) {
            MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
            monsterData.lastAttacker = petData.Owner;

            //取数据
            double fakang = monsterData.fakang;
            double gedang = monsterData.gedang;
            double x = Math.max(0.0, fakang - petData.pofa);
            double y = x / (0.5 + x);
            double damage2 = damage - gedang;
            damage2 = damage2 * (1.0 - y);

            for (String observer : monsterData.mofaAttackedObservers) {
                damage2 = damage2 * DoMonsterMoFaAttacked.doMoFaAttacked(observer, monsterData, petData);
            }

            for (String observer : monsterData.attackedObservers) {
                damage2 = damage2 * DoMonsterAttacked.doAttacked(observer, monsterData, petData);
            }

            mob.damage(damage2);
        }
    }

    public static void damageWuli(Data data, double damage, Mob mob) {
        Player player = data.player;
        //仇恨
        if (mob.getTarget() == null) {
            mob.setTarget(player);
        }
        MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());

        monsterData.lastAttacker = player;

        double baoji = data.baoji;
        double baojixiaoguo = data.baojixiaoguo;
        //判断是否暴击
        if (data.mustBaoji > 0) {
            data.mustBaoji--;
            damage = damage * baojixiaoguo;
            for (String observer : data.baoJiObservers) {
                damage = damage * DoBaojiObserver.doBaoji(observer, data, monsterData);
            }
        } else if (random.nextDouble() < baoji) {
            damage = damage * baojixiaoguo;
            for (String observer : data.baoJiObservers) {
                damage = damage * DoBaojiObserver.doBaoji(observer, data, monsterData);
            }
        }

        //取数据
        double hujia = monsterData.hujia;
        double gedang = monsterData.gedang;
        double x = Math.max(0.0, hujia - data.pojia);
        double y = x / (0.5 + x);
        double damage2 = damage - gedang;

        damage2 = damage2 * (1.0 - y);

        for (String observer : monsterData.wuliAttackedObservers) {
            damage2 = damage2 * DoMonsterWuLiAttacked.doWuLiAttacked(observer, monsterData, data);
        }

        for (String observer : monsterData.attackedObservers) {
            damage2 = damage2 * DoMonsterAttacked.doAttacked(observer, monsterData, data);
        }

        mob.damage(damage2);
    }

    public static void damageWuli(Data data, double damage, ArrayList<Mob> mobs) {
        Player player = data.player;
        double baoji = data.baoji;
        double baojixiaoguo = data.baojixiaoguo;
        for (Mob mob : mobs) {
            //仇恨
            if (mob.getTarget() == null) {
                mob.setTarget(player);
            }
            MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());

            monsterData.lastAttacker = player;


            //判断是否暴击
            if (data.mustBaoji > 0) {
                data.mustBaoji--;
                damage = damage * baojixiaoguo;
                for (String observer : data.baoJiObservers) {
                    damage = damage * DoBaojiObserver.doBaoji(observer, data, monsterData);
                }
            } else if (random.nextDouble() < baoji) {
                damage = damage * baojixiaoguo;
                for (String observer : data.baoJiObservers) {
                    damage = damage * DoBaojiObserver.doBaoji(observer, data, monsterData);
                }
            }

            //取数据
            double hujia = monsterData.hujia;
            double gedang = monsterData.gedang;
            double x = Math.max(0.0, hujia - data.pojia);
            double y = x / (0.5 + x);
            double damage2 = damage - gedang;

            damage2 = damage2 * (1.0 - y);

            for (String observer : monsterData.wuliAttackedObservers) {
                damage2 = damage2 * DoMonsterWuLiAttacked.doWuLiAttacked(observer, monsterData, data);
            }

            for (String observer : monsterData.attackedObservers) {
                damage2 = damage2 * DoMonsterAttacked.doAttacked(observer, monsterData, data);
            }

            mob.damage(damage2);
        }
    }


    public static void damagePlayer(Player player, double damage, MonsterData monsterData) {
        //取数据
        Data data = Yuehua.playerData.get(player.getUniqueId());

        Mob mob = monsterData.monster;

        data.lastAttacker = mob;

        double fakang = data.fakang;
        double gedang = data.gedang;
        double x = Math.max(0.0, fakang - monsterData.pofa);
        double y = x / (0.5 + x);


        double damage2 = damage - gedang;
        damage2 = damage2 * (1.0 - y);

        double damageBefore = damage2;

        for (String observer : data.fashuAttackedObservers) {
            damage2 = damage2 * DoAttackedObserver.doAttackedMoFa(observer, data, mob);
        }

        for (String observer : data.attackedObservers) {
            damage2 = damage2 * DoAttackedObserver.doAttacked(observer, data, mob, damageBefore);
        }

        //伤害
        player.damage(damage2);

    }


    public static void damagePlayer(Data data, double damage, MonsterData monsterData) {

        //取数据
        Mob mob = monsterData.monster;

        data.lastAttacker = mob;

        double fakang = data.fakang;
        double gedang = data.gedang;
        double x = Math.max(0.0, fakang - monsterData.pofa);
        double y = x / (0.5 + x);


        double damage2 = damage - gedang;
        damage2 = damage2 * (1.0 - y);

        double damageBefore = damage2;

        for (String observer : data.fashuAttackedObservers) {
            damage2 = damage2 * DoAttackedObserver.doAttackedMoFa(observer, data, mob);
        }

        for (String observer : data.attackedObservers) {
            damage2 = damage2 * DoAttackedObserver.doAttacked(observer, data, mob, damageBefore);
        }

        //伤害
        data.player.damage(damage2);

    }


    public static void damagePlayer(double damage, ArrayList<Player> players, MonsterData monsterData) {
        for (Player player : players) {
            //取数据
            Data data = Yuehua.playerData.get(player.getUniqueId());


            Mob mob = monsterData.monster;

            data.lastAttacker = mob;

            double fakang = data.fakang;
            double gedang = data.gedang;
            double x = Math.max(0.0, fakang - monsterData.pofa);
            double y = x / (0.5 + x);


            double damage2 = damage - gedang;
            damage2 = damage2 * (1.0 - y);

            double damageBefore = damage2;

            for (String observer : data.fashuAttackedObservers) {
                damage2 = damage2 * DoAttackedObserver.doAttackedMoFa(observer, data, mob);
            }

            for (String observer : data.attackedObservers) {
                damage2 = damage2 * DoAttackedObserver.doAttacked(observer, data, mob, damageBefore);
            }

            //伤害
            player.damage(damage2);
        }
    }

    public static void damagePlayerWhenDataAlready(double damage, ArrayList<Data> datas, MonsterData monsterData) {
        for (Data data : datas) {

            //取数据
            Mob mob = monsterData.monster;

            data.lastAttacker = mob;

            double fakang = data.fakang;
            double gedang = data.gedang;
            double x = Math.max(0.0, fakang - monsterData.pofa);
            double y = x / (0.5 + x);


            double damage2 = damage - gedang;
            damage2 = damage2 * (1.0 - y);

            double damageBefore = damage2;

            for (String observer : data.fashuAttackedObservers) {
                damage2 = damage2 * DoAttackedObserver.doAttackedMoFa(observer, data, mob);
            }

            for (String observer : data.attackedObservers) {
                damage2 = damage2 * DoAttackedObserver.doAttacked(observer, data, mob, damageBefore);
            }

            //伤害
            data.player.damage(damage2);
        }
    }


}
