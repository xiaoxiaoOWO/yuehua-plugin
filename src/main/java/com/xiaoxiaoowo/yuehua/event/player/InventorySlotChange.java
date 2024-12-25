package com.xiaoxiaoowo.yuehua.event.player;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.system.Act;
import com.xiaoxiaoowo.yuehua.system.Buff;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import io.papermc.paper.event.player.PlayerInventorySlotChangeEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.util.io.BukkitObjectInputStream;

import java.util.Objects;


public final class InventorySlotChange implements Listener {


    @EventHandler
    public void onInventorySlotChange(PlayerInventorySlotChangeEvent e) {


        int slot = e.getSlot();
        switch (slot) {
            case 0 -> {
                Player player = e.getPlayer();
                Data data = Yuehua.playerData.get(player.getUniqueId());
                if (data == null || data.open) {
                    return;
                }
                int job = data.job;
                switch (job) {
                    case 1 -> {
                        ZhanData zhanData = (ZhanData) data;
                        String id = data.slot0.id;
                        Act.deActZhan(zhanData, id);
                        if (!Objects.equals(id, "null")) {
                            ItemStack old = e.getOldItemStack();
                            //取出镶嵌ID和附灵ID
                            PersistentDataContainer pdcOld = old.getItemMeta().getPersistentDataContainer();
                            String insertIdOld = pdcOld.get(DataContainer.insertid, PersistentDataType.STRING);
                            String enchantIdOld = pdcOld.get(DataContainer.enchantid, PersistentDataType.STRING);
                            //祛除附灵和镶嵌的激活
                            Act.deActFuling(zhanData, enchantIdOld);
                            Act.deActInsert(zhanData, insertIdOld);
                        }

                        ItemStack now = e.getNewItemStack();
                        if (now.getType() == Material.DIAMOND_PICKAXE) {
                            //当槽位和职业都满足时激活
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            if (slot == pdc.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                                if (job == pdc.get(DataContainer.job, PersistentDataType.INTEGER)) {
                                    Act.actZhan(zhanData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                                    //取出镶嵌ID和附灵ID
                                    String insertId = pdc.get(DataContainer.insertid, PersistentDataType.STRING);
                                    String enchantId = pdc.get(DataContainer.enchantid, PersistentDataType.STRING);
                                    //激活附灵和镶嵌
                                    Act.actFuling(zhanData, enchantId);
                                    Act.actInsert(zhanData, insertId);
                                }
                            }
                        }
                    }
                    case 2 -> {
                        GongData gongData = (GongData) data;
                        if (gongData.noAct < GetEntity.world.getGameTime()) {
                            String id = gongData.slot0.id;
                            Act.deActGong(gongData, id);
                            if (!Objects.equals(id, "null")) {
                                ItemStack old = e.getOldItemStack();
                                //取出镶嵌ID和附灵ID
                                PersistentDataContainer pdcOld = old.getItemMeta().getPersistentDataContainer();
                                String insertIdOld = pdcOld.get(DataContainer.insertid, PersistentDataType.STRING);
                                String enchantIdOld = pdcOld.get(DataContainer.enchantid, PersistentDataType.STRING);
                                //祛除附灵和镶嵌的激活
                                Act.deActFuling(gongData, enchantIdOld);
                                Act.deActInsert(gongData, insertIdOld);
                            }

                            ItemStack now = e.getNewItemStack();
                            Material nowType = now.getType();
                            //若要激活
                            if (nowType == Material.BOW || nowType == Material.CROSSBOW) {
                                //当槽位和职业都满足时激活
                                PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                                Act.actGong(gongData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                                //取出镶嵌ID和附灵ID
                                String insertId = pdc.get(DataContainer.insertid, PersistentDataType.STRING);
                                String enchantId = pdc.get(DataContainer.enchantid, PersistentDataType.STRING);
                                //激活附灵和镶嵌
                                Act.actFuling(gongData, enchantId);
                                Act.actInsert(gongData, insertId);
                            }
                        }
                    }
                    case 3 -> {
                        DanData danData = (DanData) data;

                        Act.deActDan(danData, danData.slot0.id);

                        ItemStack now = e.getNewItemStack();
                        if (now.getType() == Material.NETHERITE_PICKAXE) {
                            //当槽位和职业都满足时激活
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            Act.actDan(danData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                        }
                    }
                }
            }


            case 1 -> {
                Player player = e.getPlayer();
                Data data = Yuehua.playerData.get(player.getUniqueId());
                if (data == null || data.open) {
                    return;
                }
                int job = data.job;

                switch (job) {
                    case 1 -> {
                        ZhanData zhanData = (ZhanData) data;
                        String id = data.slot1.id;
                        Act.deActZhan(zhanData, id);
                        if (!Objects.equals(id, "null")) {
                            ItemStack old = e.getOldItemStack();
                            //取出镶嵌ID
                            PersistentDataContainer pdcOld = old.getItemMeta().getPersistentDataContainer();
                            String insertIdOld = pdcOld.get(DataContainer.insertid, PersistentDataType.STRING);
                            //祛除镶嵌的激活
                            Act.deActInsert(zhanData, insertIdOld);
                        }

                        ItemStack now = e.getNewItemStack();
                        if (now.getType() == Material.DIAMOND_PICKAXE) {
                            //当槽位和职业都满足时激活
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            if (slot == pdc.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                                if (job == pdc.get(DataContainer.job, PersistentDataType.INTEGER)) {
                                    Act.actZhan(zhanData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                                    //取出镶嵌ID
                                    String insertId = pdc.get(DataContainer.insertid, PersistentDataType.STRING);
                                    //激活镶嵌
                                    Act.actInsert(zhanData, insertId);
                                }
                            }
                        }
                    }
                    case 2 -> {
                        GongData gongData = (GongData) data;
                        String id = data.slot1.id;
                        Act.deActGong(gongData, id);
                        if (!Objects.equals(id, "null")) {
                            ItemStack old = e.getOldItemStack();
                            //取出镶嵌ID
                            PersistentDataContainer pdcOld = old.getItemMeta().getPersistentDataContainer();
                            String insertIdOld = pdcOld.get(DataContainer.insertid, PersistentDataType.STRING);
                            //祛除镶嵌的激活
                            Act.deActInsert(gongData, insertIdOld);
                        }

                        ItemStack now = e.getNewItemStack();
                        if (now.getType() == Material.DIAMOND_PICKAXE) {
                            //当槽位和职业都满足时激活
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            if (slot == pdc.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                                if (job == pdc.get(DataContainer.job, PersistentDataType.INTEGER)) {
                                    Act.actGong(gongData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                                    //取出镶嵌ID
                                    String insertId = pdc.get(DataContainer.insertid, PersistentDataType.STRING);
                                    //激活镶嵌
                                    Act.actInsert(gongData, insertId);
                                }
                            }
                        }
                    }
                    case 3 -> {
                        DanData danData = (DanData) data;
                        String id = data.slot1.id;
                        Act.deActDan(danData, id);
                        if (!Objects.equals(id, "null")) {
                            ItemStack old = e.getOldItemStack();
                            //取出镶嵌ID
                            PersistentDataContainer pdcOld = old.getItemMeta().getPersistentDataContainer();
                            String insertIdOld = pdcOld.get(DataContainer.insertid, PersistentDataType.STRING);
                            //祛除镶嵌的激活
                            Act.deActInsert(danData, insertIdOld);
                        }

                        ItemStack now = e.getNewItemStack();
                        if (now.getType() == Material.DIAMOND_PICKAXE) {
                            //当槽位和职业都满足时激活
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            if (slot == pdc.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                                if (job == pdc.get(DataContainer.job, PersistentDataType.INTEGER)) {
                                    Act.actDan(danData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                                    //取出镶嵌ID
                                    String insertId = pdc.get(DataContainer.insertid, PersistentDataType.STRING);
                                    //激活镶嵌
                                    Act.actInsert(danData, insertId);
                                }
                            }
                        }
                    }
                }
            }

            case 2 -> {
                Player player = e.getPlayer();
                Data data = Yuehua.playerData.get(player.getUniqueId());
                if (data == null || data.open) {
                    return;
                }
                int job = data.job;

                switch (job) {
                    case 1 -> {
                        ZhanData zhanData = (ZhanData) data;
                        Act.deActZhan(zhanData, data.slot2.id);
                        ItemStack now = e.getNewItemStack();
                        if (now.getType() == Material.DIAMOND_PICKAXE) {
                            //当槽位和职业都满足时激活
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            if (slot == pdc.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                                if (job == pdc.get(DataContainer.job, PersistentDataType.INTEGER)) {
                                    Act.actZhan(zhanData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                                }
                            }
                        }
                    }
                    case 2 -> {
                        GongData gongData = (GongData) data;
                        Act.deActGong(gongData, data.slot2.id);
                        ItemStack now = e.getNewItemStack();
                        if (now.getType() == Material.DIAMOND_PICKAXE) {
                            //当槽位和职业都满足时激活
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            if (slot == pdc.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                                if (job == pdc.get(DataContainer.job, PersistentDataType.INTEGER)) {
                                    Act.actGong(gongData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                                }
                            }
                        }
                    }
                    case 3 -> {
                        DanData danData = (DanData) data;
                        Act.deActDan(danData, data.slot2.id);
                        ItemStack now = e.getNewItemStack();
                        if (now.getType() == Material.DIAMOND_PICKAXE) {
                            //当槽位和职业都满足时激活
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            if (slot == pdc.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                                if (job == pdc.get(DataContainer.job, PersistentDataType.INTEGER)) {
                                    Act.actDan(danData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                                }
                            }
                        }
                    }
                }


            }


            case 3 -> {
                Player player = e.getPlayer();
                Data data = Yuehua.playerData.get(player.getUniqueId());
                if (data == null || data.open) {
                    return;
                }
                int job = data.job;
                if (job != 3) {
                    return;
                }
                DanData danData = (DanData) data;

                Act.deActDan(danData, danData.slot3.id);


                ItemStack now = e.getNewItemStack();
                if (now.getType() == Material.DIAMOND_PICKAXE) {
                    //当槽位和职业都满足时激活
                    PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                    if (slot == pdc.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                        if (job == pdc.get(DataContainer.job, PersistentDataType.INTEGER)) {
                            Act.actDan((DanData) data, pdc.get(DataContainer.id, PersistentDataType.STRING));
                        }
                    }
                }
            }

            case 4 -> {
                Player player = e.getPlayer();
                Data data = Yuehua.playerData.get(player.getUniqueId());
                if (data == null || data.open) {
                    return;
                }
                int job = data.job;
                if (job != 3) {
                    return;
                }
                DanData danData = (DanData) data;
                Act.deActDan(danData, danData.slot4.id);


                ItemStack now = e.getNewItemStack();
                if (now.getType() == Material.DIAMOND_PICKAXE) {
                    //当槽位和职业都满足时激活
                    PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                    if (slot == pdc.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                        if (job == pdc.get(DataContainer.job, PersistentDataType.INTEGER)) {
                            Act.actDan((DanData) data, pdc.get(DataContainer.id, PersistentDataType.STRING));
                        }
                    }
                }
            }

            case 5 -> {
                Player player = e.getPlayer();
                Data data = Yuehua.playerData.get(player.getUniqueId());
                if (data == null || data.open) {
                    return;
                }
                int job = data.job;
                if (job != 3) {
                    return;
                }
                DanData danData = (DanData) data;
                Act.deActDan(danData, danData.slot5.id);


                ItemStack now = e.getNewItemStack();
                if (now.getType() == Material.DIAMOND_PICKAXE) {
                    //当槽位和职业都满足时激活
                    PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                    if (slot == pdc.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                        if (job == pdc.get(DataContainer.job, PersistentDataType.INTEGER)) {
                            Act.actDan((DanData) data, pdc.get(DataContainer.id, PersistentDataType.STRING));
                        }
                    }
                }
            }


            case 8 -> {
                Player player = e.getPlayer();
                Data data = Yuehua.playerData.get(player.getUniqueId());
                if (data == null || data.open) {
                    return;
                }

                Act.deActAll(data, data.slot8.id);

                ItemStack now = e.getNewItemStack();
                if (now.getType() == Material.IRON_PICKAXE) {
                    Act.actAll(data, now.getItemMeta().getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING));
                }
            }

            case 36 -> {
                Player player = e.getPlayer();
                Data data = Yuehua.playerData.get(player.getUniqueId());
                if (data == null || data.open) {
                    return;
                }
                int job = data.job;

                String id = data.slot36.id;

                switch (job) {
                    case 1 -> {
                        ZhanData zhanData = (ZhanData) data;
                        Act.deActZhan(zhanData, id);
                        if (!id.equals("null")) {
                            ItemStack old = e.getOldItemStack();
                            //取出镶嵌ID和附灵ID
                            PersistentDataContainer pdcOld = old.getItemMeta().getPersistentDataContainer();
                            String insertIdOld = pdcOld.get(DataContainer.insertid, PersistentDataType.STRING);
                            String enchantIdOld = pdcOld.get(DataContainer.enchantid, PersistentDataType.STRING);
                            //祛除附灵和镶嵌的激活
                            Act.deActFuling(zhanData, enchantIdOld);
                            Act.deActInsert(zhanData, insertIdOld);
                        }

                        ItemStack now = e.getNewItemStack();
                        //若要激活，不为空即可
                        if (now.getType() != Material.AIR) {
                            //当职业都满足时激活
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            int pdcJob = pdc.get(DataContainer.job, PersistentDataType.INTEGER);
                            if (pdcJob == 0 || pdcJob == job) {
                                Act.actZhan(zhanData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                                //取出镶嵌ID和附灵ID
                                String insertId = pdc.get(DataContainer.insertid, PersistentDataType.STRING);
                                String enchantId = pdc.get(DataContainer.enchantid, PersistentDataType.STRING);
                                //激活附灵和镶嵌
                                Act.actFuling(zhanData, enchantId);
                                Act.actInsert(zhanData, insertId);
                            }
                        }
                    }
                    case 2 -> {
                        GongData gongData = (GongData) data;
                        Act.deActGong(gongData, id);
                        if (!id.equals("null")) {
                            ItemStack old = e.getOldItemStack();
                            //取出镶嵌ID和附灵ID
                            PersistentDataContainer pdcOld = old.getItemMeta().getPersistentDataContainer();
                            String insertIdOld = pdcOld.get(DataContainer.insertid, PersistentDataType.STRING);
                            String enchantIdOld = pdcOld.get(DataContainer.enchantid, PersistentDataType.STRING);
                            //祛除附灵和镶嵌的激活
                            Act.deActFuling(gongData, enchantIdOld);
                            Act.deActInsert(gongData, insertIdOld);
                        }
                        ItemStack now = e.getNewItemStack();
                        //若要激活，不为空即可
                        if (now.getType() != Material.AIR) {
                            //当职业都满足时激活
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            int pdcJob = pdc.get(DataContainer.job, PersistentDataType.INTEGER);
                            if (pdcJob == 0 || pdcJob == job) {
                                Act.actGong(gongData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                                //取出镶嵌ID和附灵ID
                                String insertId = pdc.get(DataContainer.insertid, PersistentDataType.STRING);
                                String enchantId = pdc.get(DataContainer.enchantid, PersistentDataType.STRING);
                                //激活附灵和镶嵌
                                Act.actFuling(gongData, enchantId);
                                Act.actInsert(gongData, insertId);
                            }
                        }
                    }
                    case 3 -> {
                        DanData danData = (DanData) data;
                        Act.deActDan(danData, id);
                        if (!id.equals("null")) {
                            ItemStack old = e.getOldItemStack();
                            //取出镶嵌ID和附灵ID
                            PersistentDataContainer pdcOld = old.getItemMeta().getPersistentDataContainer();
                            String insertIdOld = pdcOld.get(DataContainer.insertid, PersistentDataType.STRING);
                            String enchantIdOld = pdcOld.get(DataContainer.enchantid, PersistentDataType.STRING);
                            //祛除附灵和镶嵌的激活
                            Act.deActFuling(danData, enchantIdOld);
                            Act.deActInsert(danData, insertIdOld);
                        }
                        ItemStack now = e.getNewItemStack();
                        //若要激活，不为空即可
                        if (now.getType() != Material.AIR) {
                            //当职业都满足时激活
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            int pdcJob = pdc.get(DataContainer.job, PersistentDataType.INTEGER);
                            if (pdcJob == 0 || pdcJob == job) {
                                Act.actDan(danData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                                //取出镶嵌ID和附灵ID
                                String insertId = pdc.get(DataContainer.insertid, PersistentDataType.STRING);
                                String enchantId = pdc.get(DataContainer.enchantid, PersistentDataType.STRING);
                                //激活附灵和镶嵌
                                Act.actFuling(danData, enchantId);
                                Act.actInsert(danData, insertId);
                            }
                        }
                    }
                }
            }


            case 37 -> {
                Player player = e.getPlayer();
                Data data = Yuehua.playerData.get(player.getUniqueId());
                if (data == null || data.open) {
                    return;
                }
                int job = data.job;
                String id = data.slot37.id;
                switch (job) {
                    case 1 -> {
                        ZhanData zhanData = (ZhanData) data;
                        Act.deActZhan(zhanData, id);
                        if (!id.equals("null")) {
                            ItemStack old = e.getOldItemStack();
                            //取出镶嵌ID和附灵ID
                            PersistentDataContainer pdcOld = old.getItemMeta().getPersistentDataContainer();
                            String insertIdOld = pdcOld.get(DataContainer.insertid, PersistentDataType.STRING);
                            String enchantIdOld = pdcOld.get(DataContainer.enchantid, PersistentDataType.STRING);
                            //祛除附灵和镶嵌的激活
                            Act.deActFuling(zhanData, enchantIdOld);
                            Act.deActInsert(zhanData, insertIdOld);
                        }
                        ItemStack now = e.getNewItemStack();
                        //若要激活，不为空即可
                        if (now.getType() != Material.AIR) {
                            //当职业都满足时激活
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            int pdcJob = pdc.get(DataContainer.job, PersistentDataType.INTEGER);
                            if (pdcJob == 0 || pdcJob == job) {
                                Act.actZhan(zhanData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                                //取出镶嵌ID和附灵ID
                                String insertId = pdc.get(DataContainer.insertid, PersistentDataType.STRING);
                                String enchantId = pdc.get(DataContainer.enchantid, PersistentDataType.STRING);
                                //激活附灵和镶嵌
                                Act.actFuling(zhanData, enchantId);
                                Act.actInsert(zhanData, insertId);
                            }
                        }
                    }
                    case 2 -> {
                        GongData gongData = (GongData) data;
                        Act.deActGong(gongData, id);
                        if (!id.equals("null")) {
                            ItemStack old = e.getOldItemStack();
                            //取出镶嵌ID和附灵ID
                            PersistentDataContainer pdcOld = old.getItemMeta().getPersistentDataContainer();
                            String insertIdOld = pdcOld.get(DataContainer.insertid, PersistentDataType.STRING);
                            String enchantIdOld = pdcOld.get(DataContainer.enchantid, PersistentDataType.STRING);
                            //祛除附灵和镶嵌的激活
                            Act.deActFuling(gongData, enchantIdOld);
                            Act.deActInsert(gongData, insertIdOld);
                        }
                        ItemStack now = e.getNewItemStack();
                        //若要激活，不为空即可
                        if (now.getType() != Material.AIR) {
                            //当职业都满足时激活
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            int pdcJob = pdc.get(DataContainer.job, PersistentDataType.INTEGER);
                            if (pdcJob == 0 || pdcJob == job) {
                                Act.actGong(gongData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                                //取出镶嵌ID和附灵ID
                                String insertId = pdc.get(DataContainer.insertid, PersistentDataType.STRING);
                                String enchantId = pdc.get(DataContainer.enchantid, PersistentDataType.STRING);
                                //激活附灵和镶嵌
                                Act.actFuling(gongData, enchantId);
                                Act.actInsert(gongData, insertId);
                            }
                        }
                    }
                    case 3 -> {
                        DanData danData = (DanData) data;
                        Act.deActDan(danData, id);
                        if (!id.equals("null")) {
                            ItemStack old = e.getOldItemStack();
                            //取出镶嵌ID和附灵ID
                            PersistentDataContainer pdcOld = old.getItemMeta().getPersistentDataContainer();
                            String insertIdOld = pdcOld.get(DataContainer.insertid, PersistentDataType.STRING);
                            String enchantIdOld = pdcOld.get(DataContainer.enchantid, PersistentDataType.STRING);
                            //祛除附灵和镶嵌的激活
                            Act.deActFuling(danData, enchantIdOld);
                            Act.deActInsert(danData, insertIdOld);
                        }
                        ItemStack now = e.getNewItemStack();
                        //若要激活，不为空即可
                        if (now.getType() != Material.AIR) {
                            //当职业都满足时激活
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            int pdcJob = pdc.get(DataContainer.job, PersistentDataType.INTEGER);
                            if (pdcJob == 0 || pdcJob == job) {
                                Act.actDan(danData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                                //取出镶嵌ID和附灵ID
                                String insertId = pdc.get(DataContainer.insertid, PersistentDataType.STRING);
                                String enchantId = pdc.get(DataContainer.enchantid, PersistentDataType.STRING);
                                //激活附灵和镶嵌
                                Act.actFuling(danData, enchantId);
                                Act.actInsert(danData, insertId);
                            }
                        }
                    }
                }
            }

            case 38 -> {
                Player player = e.getPlayer();
                Data data = Yuehua.playerData.get(player.getUniqueId());
                if (data == null || data.open) {
                    return;
                }
                int job = data.job;

                String id = data.slot38.id;
                switch (job) {
                    case 1 -> {
                        ZhanData zhanData = (ZhanData) data;
                        Act.deActZhan(zhanData, id);
                        if (!id.equals("null")) {
                            ItemStack old = e.getOldItemStack();
                            //取出镶嵌ID和附灵ID
                            PersistentDataContainer pdcOld = old.getItemMeta().getPersistentDataContainer();
                            String insertIdOld = pdcOld.get(DataContainer.insertid, PersistentDataType.STRING);
                            String enchantIdOld = pdcOld.get(DataContainer.enchantid, PersistentDataType.STRING);
                            //祛除附灵和镶嵌的激活
                            Act.deActFuling(zhanData, enchantIdOld);
                            Act.deActInsert(zhanData, insertIdOld);
                        }
                        ItemStack now = e.getNewItemStack();
                        //若要激活，不为空即可
                        if (now.getType() != Material.AIR) {
                            //当职业都满足时激活
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            int pdcJob = pdc.get(DataContainer.job, PersistentDataType.INTEGER);
                            if (pdcJob == 0 || pdcJob == job) {
                                Act.actZhan(zhanData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                                //取出镶嵌ID和附灵ID
                                String insertId = pdc.get(DataContainer.insertid, PersistentDataType.STRING);
                                String enchantId = pdc.get(DataContainer.enchantid, PersistentDataType.STRING);
                                //激活附灵和镶嵌
                                Act.actFuling(zhanData, enchantId);
                                Act.actInsert(zhanData, insertId);
                            }
                        }
                    }
                    case 2 -> {
                        GongData gongData = (GongData) data;
                        Act.deActGong(gongData, id);
                        if (!id.equals("null")) {
                            ItemStack old = e.getOldItemStack();
                            //取出镶嵌ID和附灵ID
                            PersistentDataContainer pdcOld = old.getItemMeta().getPersistentDataContainer();
                            String insertIdOld = pdcOld.get(DataContainer.insertid, PersistentDataType.STRING);
                            String enchantIdOld = pdcOld.get(DataContainer.enchantid, PersistentDataType.STRING);
                            //祛除附灵和镶嵌的激活
                            Act.deActFuling(gongData, enchantIdOld);
                            Act.deActInsert(gongData, insertIdOld);
                        }
                        ItemStack now = e.getNewItemStack();
                        //若要激活，不为空即可
                        if (now.getType() != Material.AIR) {
                            //当职业都满足时激活
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            int pdcJob = pdc.get(DataContainer.job, PersistentDataType.INTEGER);
                            if (pdcJob == 0 || pdcJob == job) {
                                Act.actGong(gongData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                                //取出镶嵌ID和附灵ID
                                String insertId = pdc.get(DataContainer.insertid, PersistentDataType.STRING);
                                String enchantId = pdc.get(DataContainer.enchantid, PersistentDataType.STRING);
                                //激活附灵和镶嵌
                                Act.actFuling(gongData, enchantId);
                                Act.actInsert(gongData, insertId);
                            }
                        }
                    }
                    case 3 -> {
                        DanData danData = (DanData) data;
                        Act.deActDan(danData, id);
                        if (!id.equals("null")) {
                            ItemStack old = e.getOldItemStack();
                            //取出镶嵌ID和附灵ID
                            PersistentDataContainer pdcOld = old.getItemMeta().getPersistentDataContainer();
                            String insertIdOld = pdcOld.get(DataContainer.insertid, PersistentDataType.STRING);
                            String enchantIdOld = pdcOld.get(DataContainer.enchantid, PersistentDataType.STRING);
                            //祛除附灵和镶嵌的激活
                            Act.deActFuling(danData, enchantIdOld);
                            Act.deActInsert(danData, insertIdOld);
                        }
                        ItemStack now = e.getNewItemStack();
                        //若要激活，不为空即可
                        if (now.getType() != Material.AIR) {
                            //当职业都满足时激活
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            int pdcJob = pdc.get(DataContainer.job, PersistentDataType.INTEGER);
                            if (pdcJob == 0 || pdcJob == job) {
                                Act.actDan(danData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                                //取出镶嵌ID和附灵ID
                                String insertId = pdc.get(DataContainer.insertid, PersistentDataType.STRING);
                                String enchantId = pdc.get(DataContainer.enchantid, PersistentDataType.STRING);
                                //激活附灵和镶嵌
                                Act.actFuling(danData, enchantId);
                                Act.actInsert(danData, insertId);
                            }
                        }
                    }
                }
            }

            case 39 -> {
                Player player = e.getPlayer();
                Data data = Yuehua.playerData.get(player.getUniqueId());
                if (data == null || data.open) {
                    return;
                }
                int job = data.job;
                String id = data.slot39.id;
                switch (job) {
                    case 1 -> {
                        ZhanData zhanData = (ZhanData) data;
                        Act.deActZhan(zhanData, id);
                        if (!id.equals("null")) {
                            ItemStack old = e.getOldItemStack();
                            //取出镶嵌ID和附灵ID
                            PersistentDataContainer pdcOld = old.getItemMeta().getPersistentDataContainer();
                            String insertIdOld = pdcOld.get(DataContainer.insertid, PersistentDataType.STRING);
                            String enchantIdOld = pdcOld.get(DataContainer.enchantid, PersistentDataType.STRING);
                            //祛除附灵和镶嵌的激活
                            Act.deActFuling(zhanData, enchantIdOld);
                            Act.deActInsert(zhanData, insertIdOld);
                        }
                        ItemStack now = e.getNewItemStack();
                        //若要激活，不为空即可
                        if (now.getType() != Material.AIR) {
                            //当职业都满足时激活
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            int pdcJob = pdc.get(DataContainer.job, PersistentDataType.INTEGER);
                            if (pdcJob == 0 || pdcJob == job) {
                                Act.actZhan(zhanData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                                //取出镶嵌ID和附灵ID
                                String insertId = pdc.get(DataContainer.insertid, PersistentDataType.STRING);
                                String enchantId = pdc.get(DataContainer.enchantid, PersistentDataType.STRING);
                                //激活附灵和镶嵌
                                Act.actFuling(zhanData, enchantId);
                                Act.actInsert(zhanData, insertId);
                            }
                        }
                    }
                    case 2 -> {
                        GongData gongData = (GongData) data;
                        Act.deActGong(gongData, id);
                        if (!id.equals("null")) {
                            ItemStack old = e.getOldItemStack();
                            //取出镶嵌ID和附灵ID
                            PersistentDataContainer pdcOld = old.getItemMeta().getPersistentDataContainer();
                            String insertIdOld = pdcOld.get(DataContainer.insertid, PersistentDataType.STRING);
                            String enchantIdOld = pdcOld.get(DataContainer.enchantid, PersistentDataType.STRING);
                            //祛除附灵和镶嵌的激活
                            Act.deActFuling(gongData, enchantIdOld);
                            Act.deActInsert(gongData, insertIdOld);
                        }
                        ItemStack now = e.getNewItemStack();
                        //若要激活，不为空即可
                        if (now.getType() != Material.AIR) {
                            //当职业都满足时激活
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            int pdcJob = pdc.get(DataContainer.job, PersistentDataType.INTEGER);
                            if (pdcJob == 0 || pdcJob == job) {
                                Act.actGong(gongData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                                //取出镶嵌ID和附灵ID
                                String insertId = pdc.get(DataContainer.insertid, PersistentDataType.STRING);
                                String enchantId = pdc.get(DataContainer.enchantid, PersistentDataType.STRING);
                                //激活附灵和镶嵌
                                Act.actFuling(gongData, enchantId);
                                Act.actInsert(gongData, insertId);
                            }
                        }
                    }
                    case 3 -> {
                        DanData danData = (DanData) data;
                        Act.deActDan(danData, id);
                        if (!id.equals("null")) {
                            ItemStack old = e.getOldItemStack();
                            //取出镶嵌ID和附灵ID
                            PersistentDataContainer pdcOld = old.getItemMeta().getPersistentDataContainer();
                            String insertIdOld = pdcOld.get(DataContainer.insertid, PersistentDataType.STRING);
                            String enchantIdOld = pdcOld.get(DataContainer.enchantid, PersistentDataType.STRING);
                            //祛除附灵和镶嵌的激活
                            Act.deActFuling(danData, enchantIdOld);
                            Act.deActInsert(danData, insertIdOld);
                        }
                        ItemStack now = e.getNewItemStack();
                        //若要激活，不为空即可
                        if (now.getType() != Material.AIR) {
                            //当职业都满足时激活
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            int pdcJob = pdc.get(DataContainer.job, PersistentDataType.INTEGER);
                            if (pdcJob == 0 || pdcJob == job) {
                                Act.actDan(danData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                                //取出镶嵌ID和附灵ID
                                String insertId = pdc.get(DataContainer.insertid, PersistentDataType.STRING);
                                String enchantId = pdc.get(DataContainer.enchantid, PersistentDataType.STRING);
                                //激活附灵和镶嵌
                                Act.actFuling(danData, enchantId);
                                Act.actInsert(danData, insertId);
                            }
                        }
                    }
                }
            }


            case 40 -> {
                Player player = e.getPlayer();
                Data data = Yuehua.playerData.get(player.getUniqueId());
                if (data == null || data.open) {
                    return;
                }
                int job = data.job;
                ItemStack now = e.getNewItemStack();
                Material nowType = now.getType();
                //副手
                switch (job) {
                    case 1 -> {
                        ZhanData zhanData = (ZhanData) data;
                        Act.deActZhan(zhanData, data.slot40.id);
                        //若要激活
                        if (nowType == Material.SHIELD) {
                            //当槽位和职业都满足时激活
                            Act.actZhan(zhanData, now.getItemMeta().getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING));
                        }
                    }
                    case 2 -> {
                        GongData gongData = (GongData) data;
                        Act.deActGong(gongData, data.slot40.id);
                        if (nowType == Material.GOLDEN_PICKAXE) {
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            if (job == pdc.get(DataContainer.job, PersistentDataType.INTEGER)) {
                                Act.actGong(gongData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                            }
                        }
                    }
                    case 3 -> {
                        DanData danData = (DanData) data;
                        String id = data.slot40.id;
                        Act.deActDan(danData, id);
                        if (!id.equals("null")) {
                            ItemStack old = e.getOldItemStack();
                            //取出镶嵌ID和附灵ID
                            PersistentDataContainer pdcOld = old.getItemMeta().getPersistentDataContainer();
                            String insertIdOld = pdcOld.get(DataContainer.insertid, PersistentDataType.STRING);
                            String enchantIdOld = pdcOld.get(DataContainer.enchantid, PersistentDataType.STRING);
                            //祛除附灵和镶嵌的激活
                            Act.deActFuling(danData, enchantIdOld);
                            Act.deActInsert(danData, insertIdOld);
                        }
                        if (nowType == Material.GOLDEN_PICKAXE) {
                            PersistentDataContainer pdc = now.getItemMeta().getPersistentDataContainer();
                            if (job == pdc.get(DataContainer.job, PersistentDataType.INTEGER)) {
                                Act.actDan(danData, pdc.get(DataContainer.id, PersistentDataType.STRING));
                                //取出镶嵌ID和附灵ID
                                String insertId = pdc.get(DataContainer.insertid, PersistentDataType.STRING);
                                String enchantId = pdc.get(DataContainer.enchantid, PersistentDataType.STRING);
                                //激活附灵和镶嵌
                                Act.actFuling(danData, enchantId);
                                Act.actInsert(danData, insertId);
                            }
                        }
                    }
                }
            }

        }


    }
}


