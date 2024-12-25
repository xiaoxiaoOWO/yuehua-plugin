package com.xiaoxiaoowo.yuehua.data.slot.special;

import com.xiaoxiaoowo.yuehua.data.slot.SlotWithOneActiveSkill;
import org.bukkit.Location;

public final class BeiDouMieShen extends SlotWithOneActiveSkill {
    public Location loc1;
    public Location loc2;
    public Location loc3;
    public Location loc4;
    public Location loc5;
    public Location loc6;
    public Location loc7;

    public BeiDouMieShen(String id,long cd_passive,long cd_active) {
        super(id,cd_passive,cd_active);
    }
}
