package com.xiaoxiaoowo.yuehua.guis.other;

import com.xiaoxiaoowo.yuehua.guis.Yh;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.SQL;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static com.xiaoxiaoowo.yuehua.Yuehua.shichang;

public final class Shichang {
    public static boolean canUse = true;

    public static final Inventory shichangIndex = Bukkit.createInventory(null, 18, Component.text("月华市场索引").color(NamedTextColor.AQUA));

    static {
        ItemStack shichangindex = new ItemStack(Material.YELLOW_DYE);
        shichangindex.setCustomModelData(8);
        ItemMeta itemMeta36 = shichangindex.getItemMeta();
        itemMeta36.displayName(
                Component
                        .text("前往月华市场第1页").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        shichangindex.setItemMeta(itemMeta36);

        ItemStack shichangindex10 = shichangindex.clone();
        shichangindex10.editMeta(meta -> {
            meta.displayName(
                    Component
                            .text("前往月华市场第11页").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
            );
        });

        // 创建 20 的 ItemStack
        ItemStack shichangindex20 = new ItemStack(Material.YELLOW_DYE);
        shichangindex20.setCustomModelData(8);
        ItemMeta itemMeta20 = shichangindex20.getItemMeta();
        itemMeta20.displayName(
                Component
                        .text("前往月华市场第21页").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        shichangindex20.setItemMeta(itemMeta20);

// 创建 30 的 ItemStack
        ItemStack shichangindex30 = shichangindex20.clone();
        shichangindex30.editMeta(meta -> {
            meta.displayName(
                    Component
                            .text("前往月华市场第31页").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
            );
        });

// 创建 40 的 ItemStack
        ItemStack shichangindex40 = shichangindex20.clone();
        shichangindex40.editMeta(meta -> {
            meta.displayName(
                    Component
                            .text("前往月华市场第41页").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
            );
        });

// 创建 50 的 ItemStack
        ItemStack shichangindex50 = shichangindex20.clone();
        shichangindex50.editMeta(meta -> {
            meta.displayName(
                    Component
                            .text("前往月华市场第51页").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
            );
        });

// 创建 60 的 ItemStack
        ItemStack shichangindex60 = shichangindex20.clone();
        shichangindex60.editMeta(meta -> {
            meta.displayName(
                    Component
                            .text("前往月华市场第61页").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
            );
        });

// 创建 70 的 ItemStack
        ItemStack shichangindex70 = shichangindex20.clone();
        shichangindex70.editMeta(meta -> {
            meta.displayName(
                    Component
                            .text("前往月华市场第71页").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
            );
        });

// 创建 80 的 ItemStack
        ItemStack shichangindex80 = shichangindex20.clone();
        shichangindex80.editMeta(meta -> {
            meta.displayName(
                    Component
                            .text("前往月华市场第81页").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
            );
        });

// 创建 90 的 ItemStack
        ItemStack shichangindex90 = shichangindex20.clone();
        shichangindex90.editMeta(meta -> {
            meta.displayName(
                    Component
                            .text("前往月华市场第91页").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
            );
        });


        shichangIndex.setItem(0, shichangindex);
        shichangIndex.setItem(1, shichangindex10);
        shichangIndex.setItem(2, shichangindex20);
        shichangIndex.setItem(3, shichangindex30);
        shichangIndex.setItem(4, shichangindex40);
        shichangIndex.setItem(5, shichangindex50);
        shichangIndex.setItem(6, shichangindex60);
        shichangIndex.setItem(7, shichangindex70);
        shichangIndex.setItem(8, shichangindex80);
        shichangIndex.setItem(9, shichangindex90);

        shichangIndex.setItem(17, Yh.BACK_BEFORE);
    }

    public static void initialShiChang() {
        for (int i = 0; i < 100; i++) {
            Inventory inventory = Bukkit.createInventory(null, 54, Component.text("月华市场[第" + (i + 1) + "页]").color(NamedTextColor.AQUA));
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
