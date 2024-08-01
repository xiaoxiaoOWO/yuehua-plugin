package com.xiaoxiaoowo.yuehua.data;


import com.xiaoxiaoowo.yuehua.system.Act;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public final class ZhanData extends Data {
    //36鞋，37裤，38甲，39头




    public ZhanData(Player player) {
        super(player);




        Act.initZhan(this, slot0.id);
        Act.initZhan(this, slot1.id);
        Act.initZhan(this, slot2.id);
        Act.initZhan(this, slot36.id);
        Act.initZhan(this, slot37.id);
        Act.initZhan(this, slot38.id);
        Act.initZhan(this, slot39.id);
        Act.initZhan(this, slot40.id);

    }

    public String toString() {
        return super.toString()
               + "§6[命令系统]§aslot0: §b" + slot0.id
               + "  §aslot1: §b" + slot1.id
               + "  §aslot2: §b" + slot2.id + "\n"
               + "§6[命令系统]§aslot36: §b" + slot36.id
               + "  §aslot37: §b" + slot37.id
               + "  §aslot38: §b" + slot38.id + "\n"
               + "§6[命令系统]§aslot39: §b" + slot39.id
               + "  §aslot40: §b" + slot40.id;
    }
}
