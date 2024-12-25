package com.xiaoxiaoowo.yuehua.attribute.attributes;

import com.xiaoxiaoowo.yuehua.data.Data;
import org.bukkit.persistence.PersistentDataContainer;

public interface MyAttribute {

    void act(Data data, PersistentDataContainer pdc);

    void deAct(Data data, PersistentDataContainer pdc);

    String fromId();
}
