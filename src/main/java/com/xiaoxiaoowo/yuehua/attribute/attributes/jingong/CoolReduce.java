package com.xiaoxiaoowo.yuehua.attribute.attributes.jingong;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class CoolReduce implements MyAttribute {
    public double cool_reduce;

    public CoolReduce(double cool_reduce) {
        this.cool_reduce = cool_reduce;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.cool_reduce, PersistentDataType.DOUBLE);
        double after = base + cool_reduce;
        pdc.set(DataContainer.cool_reduce,PersistentDataType.DOUBLE,after);
        data.setCoolReduceScore(after);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.cool_reduce, PersistentDataType.DOUBLE);
        double after = base - cool_reduce;
        pdc.set(DataContainer.cool_reduce,PersistentDataType.DOUBLE,after);
        data.setCoolReduceScore(after);
    }

    @Override
    public String fromId() {
        if (cool_reduce < 0) {
            return "§f冷却缩减 -§c" + String.format("%.1f", Math.abs(cool_reduce * 100)) + "%" + "    ";
        } else {
            return "§f冷却缩减 +§b" + String.format("%.1f", cool_reduce * 100) + "%" + "    ";
        }
    }
}
