package com.xiaoxiaoowo.yuehua.attribute.attributes.jingong;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class Pofa implements MyAttribute {
    public double pofa;

    public Pofa(double pofa) {
        this.pofa = pofa;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
        double after = base + pofa;
        pdc.set(DataContainer.pofa,PersistentDataType.DOUBLE,after);
        data.setPofaScore(after);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
        double after = base - pofa;
        pdc.set(DataContainer.pofa,PersistentDataType.DOUBLE,after);
        data.setPofaScore(after);
    }

    @Override
    public String fromId() {
        if (pofa < 0) {
            return "§f破法 -§c" + String.format("%.1f", Math.abs(pofa * 100))  + "    ";
        } else {
            return "§f破法 +§b" + String.format("%.1f", pofa * 100) + "    ";
        }
    }
}
