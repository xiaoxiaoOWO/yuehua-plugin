package com.xiaoxiaoowo.yuehua.data.slot;

public class SlotWithOneActiveSkill extends Slot {
    public long cd_active;


    public SlotWithOneActiveSkill(String id) {
        super(id);
    }

    public SlotWithOneActiveSkill(String id,long cd_passive){
        super(id,cd_passive);
    }


    public SlotWithOneActiveSkill(String id,long cd_passive,long cd_active){
        super(id,cd_passive);
        this.cd_active = cd_active;
    }

}
