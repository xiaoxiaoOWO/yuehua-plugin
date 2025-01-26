package com.xiaoxiaoowo.yuehua.data.slot.special;

import com.xiaoxiaoowo.yuehua.data.slot.SlotWithTwoActiveSkill;

public final class Chong extends SlotWithTwoActiveSkill {
    public int count;
    public int maxCount;

    public Chong(String id, long cd_passive, long cd_active, long cd_active2, int maxCount) {
        super(id, cd_passive, cd_active, cd_active2);
        count = 0;
        this.maxCount = maxCount;
    }
}
