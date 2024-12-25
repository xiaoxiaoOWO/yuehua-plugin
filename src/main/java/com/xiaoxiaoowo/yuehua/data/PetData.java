package com.xiaoxiaoowo.yuehua.data;

import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;

import java.util.*;

public final class PetData {
    public double attack;
    public double hujia;
    public double pojia;
    public double pofa;
    public double gedang;

    public Map<String,Object> extraData;
    public ArrayList<Integer> taskIds;

    public Set<String> attackedObservers;
    public Set<String> killedObservers;
    public Set<String> attackObservers;
    public Set<String> shootObservers;

    public String id;
    public Player Owner;
    public Mob pet;
    public Mob lastAttacker;

    public PetData(double attack, double hujia, double pojia,double pofa, double gedang,String id, Mob pet,Player Owner) {
        this.attack = attack;
        this.hujia = hujia;
        this.pojia = pojia;
        this.pofa = pofa;
        this.gedang = gedang;
        this.id = id;

        this.pet = pet;
        this.Owner = Owner;
        lastAttacker = null;


        taskIds = new ArrayList<>(5);
        extraData = new HashMap<>(5);

        attackedObservers = new HashSet<>(5);
        killedObservers = new HashSet<>(5);
        attackObservers = new HashSet<>(5);
        shootObservers = new HashSet<>(5);

    }

}
