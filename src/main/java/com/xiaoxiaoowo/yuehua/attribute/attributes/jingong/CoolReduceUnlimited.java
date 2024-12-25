package com.xiaoxiaoowo.yuehua.attribute.attributes.jingong;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class CoolReduceUnlimited implements MyAttribute {
    public double unlimited;

    public CoolReduceUnlimited(double unlimited) {
        this.unlimited = unlimited;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.cool_reduce_unlimited, PersistentDataType.DOUBLE);
        double after = base + unlimited;
        pdc.set(DataContainer.cool_reduce_unlimited, PersistentDataType.DOUBLE, after);
        data.setCoolReduceUnlimited(after);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.cool_reduce_unlimited, PersistentDataType.DOUBLE);
        double after = base - unlimited;
        pdc.set(DataContainer.cool_reduce_unlimited, PersistentDataType.DOUBLE, after);
        data.setCoolReduceUnlimited(after);
    }

    @Override
    public String fromId() {
        return null;
    }
}
