package com.xiaoxiaoowo.yuehua.guis;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.SQL;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static com.xiaoxiaoowo.yuehua.Yuehua.shichang;

public final class Shichang {
    public static boolean canUse = true;

    public static void initialShiChang() {
        for (int i = 0; i < 100; i++) {
            Inventory inventory = Bukkit.createInventory(null, 54, Component.text("全球市场[第" + (i + 1) + "页]").color(NamedTextColor.AQUA));
            if (i != 99) {
                inventory.setItem(0, Yh.TO_NEXT);
            }
            inventory.setItem(53, Yh.BACK_BEFORE);
            SQL.storeShiChang(i, inventory);
            shichang.set(i, inventory);
        }
    }

    public static void reshapeShichang() {
        canUse = false;

        // 使用 LinkedHashMap 保证插入顺序一致
        Map<String, List<ItemStack>> itemsMap = new LinkedHashMap<>(999);

        // 1. 收集所有物品并按 ID 分组
        for (int pageIndex = 0; pageIndex < shichang.size(); pageIndex++) {
            Inventory page = shichang.get(pageIndex);

            // 判断本页需要跳过哪些槽位
            // 前 99 页（非最后一页）跳过 0、53；最后一页只跳过 53
            int startSlot = (pageIndex < shichang.size() - 1) ? 1 : 0;
            int endSlot = 53;  // 这里固定跳过 53

            for (int slot = startSlot; slot < endSlot; slot++) {
                ItemStack item = page.getItem(slot);
                if (item != null && item.getType() != Material.AIR) {
                    // 获取该物品的 ID
                    String id = item.getPersistentDataContainer()
                            .get(DataContainer.id, PersistentDataType.STRING);
                    if (id == null) {
                        // 如果没有取到 ID，可视情况处理
                        id = "unknown";
                    }
                    // 根据 ID 分组
                    itemsMap.computeIfAbsent(id, k -> new ArrayList<>()).add(item);
                }
            }
        }

        // 2. 清空所有可用槽位上的物品，准备重新摆放
        for (int pageIndex = 0; pageIndex < shichang.size(); pageIndex++) {
            Inventory page = shichang.get(pageIndex);
            int startSlot = (pageIndex < shichang.size() - 1) ? 1 : 0;
            int endSlot = 53;

            for (int slot = startSlot; slot < endSlot; slot++) {
                page.setItem(slot, null);
            }
        }

        // 3. 将分好组的物品按 ID 顺序重新放回市场
        int pageIndex = 0;
        int slotIndex = (pageIndex < shichang.size() - 1) ? 1 : 0; // 当前可用槽位
        for (Map.Entry<String, List<ItemStack>> entry : itemsMap.entrySet()) {
            for (ItemStack item : entry.getValue()) {
                // 如果已经超过现有页数，表示全部空间放满了，直接跳出
                if (pageIndex >= shichang.size()) {
                    return;
                }

                Inventory currentPage = shichang.get(pageIndex);
                currentPage.setItem(slotIndex, item);
                slotIndex++;

                // 如果槽位用完，进入下一页
                if (slotIndex >= 53) {
                    // 切换到下一页
                    pageIndex++;
                    // 如果还有下一页，重置下一个起始槽位
                    if (pageIndex < shichang.size()) {
                        slotIndex = (pageIndex < shichang.size() - 1) ? 1 : 0;
                    }
                }
            }
        }

        canUse = true;
    }
}
