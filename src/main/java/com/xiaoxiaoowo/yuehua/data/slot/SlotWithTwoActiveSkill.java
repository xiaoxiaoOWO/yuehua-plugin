package com.xiaoxiaoowo.yuehua.data.slot;

public class SlotWithTwoActiveSkill extends SlotWithOneActiveSkill{
    public long cd_active2;

    public SlotWithTwoActiveSkill(String id) {
        super(id);
    }

    public SlotWithTwoActiveSkill(String id,long cd_passive){
        super(id,cd_passive);
    }

    public SlotWithTwoActiveSkill(String id,long cd_passive,long cd_active){
        super(id,cd_passive,cd_active);
    }

    public SlotWithTwoActiveSkill(String id,long cd_passive,long cd_active,long cd_active2){
        super(id,cd_passive,cd_active);
        this.cd_active2 = cd_active2;
    }
}
