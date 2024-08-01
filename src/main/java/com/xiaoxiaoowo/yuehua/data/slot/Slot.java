package com.xiaoxiaoowo.yuehua.data.slot;


public class Slot {
    public String id;
    public long cd_passive;


    public Slot(String id) {
        this.id = id;
    }

    public Slot(String id, long cd_passive) {
        this.id = id;
        this.cd_passive = cd_passive;
    }



}
