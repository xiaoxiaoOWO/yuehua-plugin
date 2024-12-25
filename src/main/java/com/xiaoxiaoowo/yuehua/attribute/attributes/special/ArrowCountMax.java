package com.xiaoxiaoowo.yuehua.attribute.attributes.special;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class ArrowCountMax implements MyAttribute {
    public int countMax;

    public ArrowCountMax(int countMax)
    {
        this.countMax = countMax;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        pdc.set(DataContainer.arrow_count_max, PersistentDataType.INTEGER,countMax);
        GongData gongData = (GongData) data;
        gongData.arrow_count_max = countMax;
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        pdc.set(DataContainer.arrow_count_max, PersistentDataType.INTEGER,0);
        GongData gongData = (GongData) data;
        gongData.arrow_count_max = 0;
    }

    @Override
    public String fromId() {
        return "§f箭袋容量 +§b" + String.format("%d", countMax) + "    ";
    }
}
