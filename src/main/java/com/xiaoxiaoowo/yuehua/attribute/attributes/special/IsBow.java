package com.xiaoxiaoowo.yuehua.attribute.attributes.special;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class IsBow implements MyAttribute {
    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        pdc.set(DataContainer.is_bow, PersistentDataType.BOOLEAN,true);
        GongData gongData = (GongData) data;
        gongData.isBow = true;
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        pdc.set(DataContainer.is_bow, PersistentDataType.BOOLEAN,false);
        GongData gongData = (GongData) data;
        gongData.isBow = false;
    }

    @Override
    public String fromId() {
        return null;
    }
}
