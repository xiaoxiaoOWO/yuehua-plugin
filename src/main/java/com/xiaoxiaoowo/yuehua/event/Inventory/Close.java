package com.xiaoxiaoowo.yuehua.event.Inventory;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.Act;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.SQL;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import static com.xiaoxiaoowo.yuehua.event.player.InventorySlotChange.BANGDINGID;
import static com.xiaoxiaoowo.yuehua.event.player.InventorySlotChange.checkCanActLevel6;

public final class Close implements Listener {
    @EventHandler
    public void onInventoryClose(InventoryCloseEvent event) {
        String title = event.getView().getOriginalTitle();
        if (title.equals("§b饰品槽")) {


            Inventory inventory = event.getInventory();
            Player player = (Player) event.getPlayer();
            Data data = Yuehua.playerData.get(player.getUniqueId());

            Scheduler.async(
                    () -> SQL.storeShiPin(player.getName(), inventory)
            );

            ItemStack itemStack0 = inventory.getItem(0);
            String oldId0 = data.eSlot0.id;
            if (itemStack0 == null) {
                Act.deActAllEnderChest(data, oldId0);
            } else {
                if (itemStack0.getType() == Material.ARMS_UP_POTTERY_SHERD) {
                    PersistentDataContainer pdc = itemStack0.getItemMeta().getPersistentDataContainer();
                    String newId = pdc.get(DataContainer.id, PersistentDataType.STRING);
                    if (!newId.equals(oldId0)) {
                        Act.deActAllEnderChest(data, oldId0);

                        if (!BANGDINGID.contains(newId) || checkCanActLevel6(player, newId)) {
                            if (pdc.get(DataContainer.slot, PersistentDataType.INTEGER) == 0) {
                                Act.actAllEnderChest(data, newId);
                            }
                        }
                    }
                }
            }


            ItemStack itemStack1 = inventory.getItem(1);
            String oldId1 = data.eSlot1.id;
            if (itemStack1 == null) {
                Act.deActAllEnderChest(data, oldId1);
            } else {
                if (itemStack1.getType() == Material.ARMS_UP_POTTERY_SHERD) {
                    PersistentDataContainer pdc = itemStack1.getItemMeta().getPersistentDataContainer();
                    String newId = pdc.get(DataContainer.id, PersistentDataType.STRING);
                    if (!newId.equals(oldId1)) {
                        Act.deActAllEnderChest(data, oldId1);
                        if (!BANGDINGID.contains(newId) || checkCanActLevel6(player, newId)) {
                            if (pdc.get(DataContainer.slot, PersistentDataType.INTEGER) == 1) {
                                Act.actAllEnderChest(data, newId);
                            }
                        }

                    }
                }
            }

            ItemStack itemStack2 = inventory.getItem(2);
            String oldId2 = data.eSlot2.id;
            if (itemStack2 == null) {
                Act.deActAllEnderChest(data, oldId2);
            } else {
                if (itemStack2.getType() == Material.ARMS_UP_POTTERY_SHERD) {
                    PersistentDataContainer pdc = itemStack2.getItemMeta().getPersistentDataContainer();
                    String newId = pdc.get(DataContainer.id, PersistentDataType.STRING);
                    if (!newId.equals(oldId2)) {
                        Act.deActAllEnderChest(data, oldId2);
                        if (!BANGDINGID.contains(newId) || checkCanActLevel6(player, newId)) {
                            if (pdc.get(DataContainer.slot, PersistentDataType.INTEGER) == 2) {
                                Act.actAllEnderChest(data, newId);
                            }
                        }

                    }
                }
            }

            ItemStack itemStack3 = inventory.getItem(3);
            String oldId3 = data.eSlot3.id;
            if (itemStack3 == null) {
                Act.deActAllEnderChest(data, oldId3);
            } else {
                if (itemStack3.getType() == Material.ARMS_UP_POTTERY_SHERD) {
                    PersistentDataContainer pdc = itemStack3.getItemMeta().getPersistentDataContainer();
                    String newId = pdc.get(DataContainer.id, PersistentDataType.STRING);
                    if (!newId.equals(oldId3)) {
                        Act.deActAllEnderChest(data, oldId3);
                        if (!BANGDINGID.contains(newId) || checkCanActLevel6(player, newId)) {
                            if (pdc.get(DataContainer.slot, PersistentDataType.INTEGER) == 3) {
                                Act.actAllEnderChest(data, newId);
                            }
                        }
                    }
                }
            }

            ItemStack itemStack4 = inventory.getItem(4);
            String oldId4 = data.eSlot4.id;
            if (itemStack4 == null) {
                Act.deActAllEnderChest(data, oldId4);
            } else {
                if (itemStack4.getType() == Material.ARMS_UP_POTTERY_SHERD) {
                    PersistentDataContainer pdc = itemStack4.getItemMeta().getPersistentDataContainer();
                    String newId = pdc.get(DataContainer.id, PersistentDataType.STRING);
                    if (!newId.equals(oldId4)) {
                        Act.deActAllEnderChest(data, oldId4);
                        if (!BANGDINGID.contains(newId) || checkCanActLevel6(player, newId)) {
                            if (pdc.get(DataContainer.slot, PersistentDataType.INTEGER) == 4) {
                                Act.actAllEnderChest(data, newId);
                            }
                        }
                    }
                }
            }

            ItemStack itemStack5 = inventory.getItem(5);
            String oldId5 = data.eSlot5.id;
            if (itemStack5 == null) {
                Act.deActAllEnderChest(data, oldId5);
            } else {
                if (itemStack5.getType() == Material.ARMS_UP_POTTERY_SHERD) {
                    PersistentDataContainer pdc = itemStack5.getItemMeta().getPersistentDataContainer();
                    String newId = pdc.get(DataContainer.id, PersistentDataType.STRING);
                    if (!newId.equals(oldId5)) {
                        Act.deActAllEnderChest(data, oldId5);
                        if (!BANGDINGID.contains(newId) || checkCanActLevel6(player, newId)) {
                            if (pdc.get(DataContainer.slot, PersistentDataType.INTEGER) == 5) {
                                Act.actAllEnderChest(data, newId);
                            }
                        }
                    }
                }
            }

            ItemStack itemStack6 = inventory.getItem(6);
            String oldId6 = data.eSlot6.id;
            if (itemStack6 == null) {
                Act.deActAllEnderChest(data, oldId6);
            } else {
                if (itemStack6.getType() == Material.ARMS_UP_POTTERY_SHERD) {
                    PersistentDataContainer pdc = itemStack6.getItemMeta().getPersistentDataContainer();
                    String newId = pdc.get(DataContainer.id, PersistentDataType.STRING);
                    if (!newId.equals(oldId6)) {
                        Act.deActAllEnderChest(data, oldId6);
                        if (!BANGDINGID.contains(newId) || checkCanActLevel6(player, newId)) {
                            if (pdc.get(DataContainer.slot, PersistentDataType.INTEGER) == 6) {
                                Act.actAllEnderChest(data, newId);
                            }
                        }
                    }
                }
            }

            ItemStack itemStack7 = inventory.getItem(7);
            String oldId7 = data.eSlot7.id;
            if (itemStack7 == null) {
                Act.deActAllEnderChest(data, oldId7);
            } else {
                if (itemStack7.getType() == Material.ARMS_UP_POTTERY_SHERD) {
                    PersistentDataContainer pdc = itemStack7.getItemMeta().getPersistentDataContainer();
                    String newId = pdc.get(DataContainer.id, PersistentDataType.STRING);
                    if (!newId.equals(oldId7)) {
                        Act.deActAllEnderChest(data, oldId7);
                        if (!BANGDINGID.contains(newId) || checkCanActLevel6(player, newId)) {
                            if (pdc.get(DataContainer.slot, PersistentDataType.INTEGER) == 7) {
                                Act.actAllEnderChest(data, newId);
                            }
                        }
                    }
                }
            }


        }
    }
}
