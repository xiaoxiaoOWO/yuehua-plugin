package com.xiaoxiaoowo.yuehua.data;


import com.xiaoxiaoowo.yuehua.system.Init;
import org.bukkit.entity.Player;

public final class ZhanData extends Data {
    //36鞋，37裤，38甲，39头




    public ZhanData(Player player) {
        super(player);


        Init.initZhan(this, slot0.id);
        Init.initZhan(this, slot1.id);
        Init.initZhan(this, slot2.id);
        Init.initZhan(this, slot36.id);
        Init.initZhan(this, slot37.id);
        Init.initZhan(this, slot38.id);
        Init.initZhan(this, slot39.id);
        Init.initZhan(this, slot40.id);

    }

    public String toString() {
        return super.toString();
    }
}
