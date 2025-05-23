package com.xiaoxiaoowo.yuehua.items.other;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import io.papermc.paper.datacomponent.DataComponentTypes;
import io.papermc.paper.datacomponent.item.Consumable;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.components.FoodComponent;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public final class Food {

    public static final ItemStack xinqitian = new ItemStack(Material.BREAD, 1);
    public static final ItemStack lianxin = new ItemStack(Material.BREAD, 1);

    public static final ItemStack zuanyaun = new ItemStack(Material.BREAD, 1);
    public static final ItemStack wangyuanwai = new ItemStack(Material.BREAD, 1);

    public static final ItemStack zhangzhe = new ItemStack(Material.BREAD, 1);
    public static final ItemStack chendaifu = new ItemStack(Material.BREAD, 1);

    public static final ItemStack baigujin = new ItemStack(Material.BREAD, 1);
    public static final ItemStack penglai = new ItemStack(Material.BREAD, 1);

    //丹药
    public static final ItemStack huixue_0 = new ItemStack(Material.BREAD, 1);
    public static final ItemStack huixue_1 = new ItemStack(Material.BREAD, 1);
    public static final ItemStack huixue_2 = new ItemStack(Material.BREAD, 1);
    public static final ItemStack huixue_3 = new ItemStack(Material.BREAD, 1);
    public static final ItemStack huixue_4 = new ItemStack(Material.BREAD, 1);

    public static final ItemStack jiedu_1 = new ItemStack(Material.BREAD, 1);
    public static final ItemStack jiedu_2 = new ItemStack(Material.BREAD, 1);
    public static final ItemStack jiedu_3 = new ItemStack(Material.BREAD, 1);
    public static final ItemStack jiedu_4 = new ItemStack(Material.BREAD, 1);


    public static final ItemStack SHANSHENZHUFU = new ItemStack(Material.BREAD, 1);
    public static final ItemStack SHENMULING = new ItemStack(Material.BREAD, 1);


    //素食
    public static final ItemStack huluobo = new ItemStack(Material.BREAD, 1);
    public static final ItemStack shuilangniemianren = new ItemStack(Material.APPLE, 1);
    public static final ItemStack baoZi = new ItemStack(Material.BREAD, 1);
    public static final ItemStack kaoDiGua = new ItemStack(Material.BREAD, 1);
    public static final ItemStack xiBing = new ItemStack(Material.BREAD, 1);
    public static final ItemStack foTiaoQiang = new ItemStack(Material.BREAD, 1);


    //海鲜
    public static final ItemStack kaoYu = new ItemStack(Material.BREAD, 1);
    public static final ItemStack kaoGuiYu = new ItemStack(Material.BREAD, 1);
    public static final ItemStack kaoXueYu = new ItemStack(Material.BREAD, 1);
    public static final ItemStack kaoYouYu = new ItemStack(Material.BREAD, 1);
    public static final ItemStack kaoXia = new ItemStack(Material.BREAD, 1);
    public static final ItemStack xieQian = new ItemStack(Material.BREAD, 1);

    //荤菜
    public static final ItemStack kaoJi = new ItemStack(Material.BREAD, 1);
    public static final ItemStack tuRou = new ItemStack(Material.BREAD, 1);
    public static final ItemStack yangTui = new ItemStack(Material.BREAD, 1);
    public static final ItemStack zhuPai = new ItemStack(Material.BREAD, 1);
    public static final ItemStack niuPai = new ItemStack(Material.BREAD, 1);
    public static final ItemStack DADADAJITUI = new ItemStack(Material.BREAD, 1);

    //水果
    public static final ItemStack pinGuo = new ItemStack(Material.APPLE, 1);
    public static final ItemStack xiguapian = new ItemStack(Material.APPLE, 1);
    public static final ItemStack qinpinGuo = new ItemStack(Material.BREAD, 1);
    public static final ItemStack putao = new ItemStack(Material.BREAD, 1);
    public static final ItemStack li = new ItemStack(Material.BREAD, 1);
    public static final ItemStack xiangjiao = new ItemStack(Material.BREAD, 1);
    public static final ItemStack caomei = new ItemStack(Material.BREAD, 1);
    public static final ItemStack bolo = new ItemStack(Material.BREAD, 1);
    //四不像
    public static final ItemStack fengmi = new ItemStack(Material.APPLE, 1);

    //随机箱子，马克波罗
    public static final ItemStack zongZi = new ItemStack(Material.BREAD, 1);
    public static final ItemStack yueBin = new ItemStack(Material.BREAD, 1);
    public static final ItemStack ZhuangYuanYueBin = new ItemStack(Material.BREAD, 1);
    public static final ItemStack DuiTangYueBin = new ItemStack(Material.BREAD, 1);
    public static final ItemStack SanHongYueBin = new ItemStack(Material.BREAD, 1);
    public static final ItemStack xianTao = new ItemStack(Material.BREAD, 1);


    //茶
    public static final ItemStack longjin = new ItemStack(Material.APPLE, 1);
    public static final ItemStack maojian = new ItemStack(Material.APPLE, 1);
    public static final ItemStack tieguanyin = new ItemStack(Material.APPLE, 1);
    public static final ItemStack puer = new ItemStack(Material.APPLE, 1);


    static {

        //32 - 48


        // 蓬莱丹药 - 2.5f
        Consumable.Builder consumablePenglai = Consumable.consumable().consumeSeconds(2.5f);
        penglai.setData(DataComponentTypes.CONSUMABLE, consumablePenglai);

// 白骨精丹药 - 2.5f
        Consumable.Builder consumableBaigujin = Consumable.consumable().consumeSeconds(2.5f);
        baigujin.setData(DataComponentTypes.CONSUMABLE, consumableBaigujin);

// 陈大夫丹药 - 2.5f
        Consumable.Builder consumableChendaifu = Consumable.consumable().consumeSeconds(2.5f);
        chendaifu.setData(DataComponentTypes.CONSUMABLE, consumableChendaifu);

// 长者神力 - 2.5f
        Consumable.Builder consumableZhangzhe = Consumable.consumable().consumeSeconds(2.5f);
        zhangzhe.setData(DataComponentTypes.CONSUMABLE, consumableZhangzhe);

// 王员外丹药 - 2.5f
        Consumable.Builder consumableWangyuanwai = Consumable.consumable().consumeSeconds(2.5f);
        wangyuanwai.setData(DataComponentTypes.CONSUMABLE, consumableWangyuanwai);

// 篆元真人丹药 - 2.5f
        Consumable.Builder consumableZuanyaun = Consumable.consumable().consumeSeconds(2.5f);
        zuanyaun.setData(DataComponentTypes.CONSUMABLE, consumableZuanyaun);

// 炼心丹药 - 1.0f
        Consumable.Builder consumableLianxin = Consumable.consumable().consumeSeconds(1.0f);
        lianxin.setData(DataComponentTypes.CONSUMABLE, consumableLianxin);

// 辛氏抗毒丹 - 1.0f
        Consumable.Builder consumableXinqitian = Consumable.consumable().consumeSeconds(1.0f);
        xinqitian.setData(DataComponentTypes.CONSUMABLE, consumableXinqitian);

// 神木灵 - 2.5f
        Consumable.Builder consumableShenmu = Consumable.consumable().consumeSeconds(2.5f);
        SHENMULING.setData(DataComponentTypes.CONSUMABLE, consumableShenmu);

// 山神祝福 - 2.5f
        Consumable.Builder consumableShanshen = Consumable.consumable().consumeSeconds(2.5f);
        SHANSHENZHUFU.setData(DataComponentTypes.CONSUMABLE, consumableShanshen);

// 解毒丹系列
// 清毒散 - 1.0f
        Consumable.Builder consumableJiedu1 = Consumable.consumable().consumeSeconds(1.0f);
        jiedu_1.setData(DataComponentTypes.CONSUMABLE, consumableJiedu1);

// 解厄丹 - 1.0f
        Consumable.Builder consumableJiedu2 = Consumable.consumable().consumeSeconds(1.0f);
        jiedu_2.setData(DataComponentTypes.CONSUMABLE, consumableJiedu2);

// 太清灵解丹 - 1.0f
        Consumable.Builder consumableJiedu3 = Consumable.consumable().consumeSeconds(1.0f);
        jiedu_3.setData(DataComponentTypes.CONSUMABLE, consumableJiedu3);

// 百炼金元丹 - 1.0f
        Consumable.Builder consumableJiedu4 = Consumable.consumable().consumeSeconds(1.0f);
        jiedu_4.setData(DataComponentTypes.CONSUMABLE, consumableJiedu4);

// 回血丹系列
// 新手治疗丹 - 2.5f
        Consumable.Builder consumableHuixue0 = Consumable.consumable().consumeSeconds(2.5f);
        huixue_0.setData(DataComponentTypes.CONSUMABLE, consumableHuixue0);

// 一般金创药 - 2.5f
        Consumable.Builder consumableHuixue1 = Consumable.consumable().consumeSeconds(2.5f);
        huixue_1.setData(DataComponentTypes.CONSUMABLE, consumableHuixue1);

// 中级回元丹 - 2.5f
        Consumable.Builder consumableHuixue2 = Consumable.consumable().consumeSeconds(2.5f);
        huixue_2.setData(DataComponentTypes.CONSUMABLE, consumableHuixue2);

// 高级痊愈丸 - 2.5f
        Consumable.Builder consumableHuixue3 = Consumable.consumable().consumeSeconds(2.5f);
        huixue_3.setData(DataComponentTypes.CONSUMABLE, consumableHuixue3);

// 九转还魂丹 - 2.5f
        Consumable.Builder consumableHuixue4 = Consumable.consumable().consumeSeconds(2.5f);
        huixue_4.setData(DataComponentTypes.CONSUMABLE, consumableHuixue4);

// 食物系列
// 苹果 - 0.8f
        Consumable.Builder consumablePinguo = Consumable.consumable().consumeSeconds(0.8f);
        pinGuo.setData(DataComponentTypes.CONSUMABLE, consumablePinguo);

// 蜂蜜 - 0.8f
        Consumable.Builder consumableFengmi = Consumable.consumable().consumeSeconds(0.8f);
        fengmi.setData(DataComponentTypes.CONSUMABLE, consumableFengmi);

// 水狼捏面人 - 1.6f
        Consumable.Builder consumableShuilang = Consumable.consumable().consumeSeconds(1.6f);
        shuilangniemianren.setData(DataComponentTypes.CONSUMABLE, consumableShuilang);

// 西瓜片 - 0.8f
        Consumable.Builder consumableXigua = Consumable.consumable().consumeSeconds(0.8f);
        xiguapian.setData(DataComponentTypes.CONSUMABLE, consumableXigua);

// 茶系列 (all 0.8f)
        Consumable.Builder consumableTea = Consumable.consumable().consumeSeconds(0.8f);
        longjin.setData(DataComponentTypes.CONSUMABLE, consumableTea);
        maojian.setData(DataComponentTypes.CONSUMABLE, consumableTea);
        tieguanyin.setData(DataComponentTypes.CONSUMABLE, consumableTea);
        puer.setData(DataComponentTypes.CONSUMABLE, consumableTea);

// 其他食物
// 包子 - 1.6f
        Consumable.Builder consumableBaozi = Consumable.consumable().consumeSeconds(1.6f);
        baoZi.setData(DataComponentTypes.CONSUMABLE, consumableBaozi);

// 烤地瓜 - 1.6f
        Consumable.Builder consumableKaodigua = Consumable.consumable().consumeSeconds(1.6f);
        kaoDiGua.setData(DataComponentTypes.CONSUMABLE, consumableKaodigua);

// 喜饼 - 1.6f
        Consumable.Builder consumableXibing = Consumable.consumable().consumeSeconds(1.6f);
        xiBing.setData(DataComponentTypes.CONSUMABLE, consumableXibing);

// 佛跳墙 - 1.6f
        Consumable.Builder consumableFotiaoqiang = Consumable.consumable().consumeSeconds(1.6f);
        foTiaoQiang.setData(DataComponentTypes.CONSUMABLE, consumableFotiaoqiang);

// 各种烤制食物 (all 1.6f)
        Consumable.Builder consumableKao = Consumable.consumable().consumeSeconds(1.6f);
        kaoYu.setData(DataComponentTypes.CONSUMABLE, consumableKao);
        kaoGuiYu.setData(DataComponentTypes.CONSUMABLE, consumableKao);
        kaoJi.setData(DataComponentTypes.CONSUMABLE, consumableKao);
        kaoXueYu.setData(DataComponentTypes.CONSUMABLE, consumableKao);
        kaoXia.setData(DataComponentTypes.CONSUMABLE, consumableKao);
        kaoYouYu.setData(DataComponentTypes.CONSUMABLE, consumableKao);
        DADADAJITUI.setData(DataComponentTypes.CONSUMABLE, consumableKao);

// 肉类 (all 1.6f)
        Consumable.Builder consumableRou = Consumable.consumable().consumeSeconds(1.6f);
        zhuPai.setData(DataComponentTypes.CONSUMABLE, consumableRou);
        niuPai.setData(DataComponentTypes.CONSUMABLE, consumableRou);
        yangTui.setData(DataComponentTypes.CONSUMABLE, consumableRou);
        tuRou.setData(DataComponentTypes.CONSUMABLE, consumableRou);

// 节日食物 (all 1.6f)
        Consumable.Builder consumableJieri = Consumable.consumable().consumeSeconds(1.6f);
        zongZi.setData(DataComponentTypes.CONSUMABLE, consumableJieri);
        yueBin.setData(DataComponentTypes.CONSUMABLE, consumableJieri);
        ZhuangYuanYueBin.setData(DataComponentTypes.CONSUMABLE, consumableJieri);
        DuiTangYueBin.setData(DataComponentTypes.CONSUMABLE, consumableJieri);
        SanHongYueBin.setData(DataComponentTypes.CONSUMABLE, consumableJieri);

// 海鲜
        Consumable.Builder consumableHaixian = Consumable.consumable().consumeSeconds(1.6f);
        xieQian.setData(DataComponentTypes.CONSUMABLE, consumableHaixian);

// 水果类 (all 0.8f)
        Consumable.Builder consumableFruit = Consumable.consumable().consumeSeconds(0.8f);
        qinpinGuo.setData(DataComponentTypes.CONSUMABLE, consumableFruit);
        putao.setData(DataComponentTypes.CONSUMABLE, consumableFruit);
        li.setData(DataComponentTypes.CONSUMABLE, consumableFruit);
        xiangjiao.setData(DataComponentTypes.CONSUMABLE, consumableFruit);
        caomei.setData(DataComponentTypes.CONSUMABLE, consumableFruit);
        bolo.setData(DataComponentTypes.CONSUMABLE, consumableFruit);

// 仙桃 - 0.8f
        Consumable.Builder consumableXiantao = Consumable.consumable().consumeSeconds(0.8f);
        xianTao.setData(DataComponentTypes.CONSUMABLE, consumableXiantao);

// 蔬菜 - 1.6f
        Consumable.Builder consumableVegetable = Consumable.consumable().consumeSeconds(1.6f);
        huluobo.setData(DataComponentTypes.CONSUMABLE, consumableVegetable);

        penglai.editMeta(meta -> {


            FoodComponent foodComponent = meta.getFood();
            foodComponent.setCanAlwaysEat(true);

            foodComponent.setNutrition(0);
            foodComponent.setSaturation(0.0f);
            meta.setFood(foodComponent);
            meta.setMaxStackSize(1);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "penglaidanyao");
            meta.displayName(Component.text("游龙丹").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
            );
            meta.lore(
                    List.of(
                            Component.text("§f获得无限时长的飞鱼I")
                    )
            );
        });


        baigujin.editMeta(meta -> {

            FoodComponent foodComponent = meta.getFood();
            foodComponent.setCanAlwaysEat(true);

            foodComponent.setNutrition(0);
            foodComponent.setSaturation(0.0f);
            meta.setFood(foodComponent);
            meta.setMaxStackSize(1);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "baigujingdanyao");
            meta.displayName(Component.text("避水丹").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
            );
            meta.lore(
                    List.of(
                            Component.text("§f获得无限时长的水下呼吸")
                    )
            );
        });


        chendaifu.editMeta(meta -> {
            FoodComponent foodComponent = meta.getFood();
            foodComponent.setCanAlwaysEat(true);

            foodComponent.setNutrition(0);
            foodComponent.setSaturation(0.0f);
            meta.setFood(foodComponent);
            meta.setMaxStackSize(1);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "chendaifudanyao");
            meta.displayName(Component.text("陈大夫炼制的丹药").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
            );
            meta.lore(
                    List.of(
                            Component.text("§f获得无限时长的跳跃提升Ⅰ")
                    )
            );
        });


        zhangzhe.editMeta(meta -> {
            FoodComponent foodComponent = meta.getFood();
            foodComponent.setCanAlwaysEat(true);

            foodComponent.setNutrition(0);
            foodComponent.setSaturation(0.0f);
            meta.setFood(foodComponent);
            meta.setMaxStackSize(1);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "zhangzhedanyao");
            meta.displayName(Component.text("长者的神力").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
            );
            meta.lore(
                    List.of(
                            Component.text("§f获得无限时长的速度Ⅰ")
                    )
            );
        });


        wangyuanwai.editMeta(meta -> {
            FoodComponent foodComponent = meta.getFood();
            foodComponent.setCanAlwaysEat(true);

            foodComponent.setNutrition(0);
            foodComponent.setSaturation(0.0f);
            meta.setFood(foodComponent);
            meta.setMaxStackSize(1);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "wangyuanwaidanyao");
            meta.displayName(Component.text("王员外珍藏的宝贵丹药").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
            );
            meta.lore(
                    List.of(
                            Component.text("§f获得无限时长的急迫Ⅰ")
                    )
            );
        });


        zuanyaun.editMeta(meta -> {
            FoodComponent foodComponent = meta.getFood();
            foodComponent.setCanAlwaysEat(true);

            foodComponent.setNutrition(0);
            foodComponent.setSaturation(0.0f);
            meta.setFood(foodComponent);
            meta.setMaxStackSize(1);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "zuanyaundanyao");
            meta.displayName(Component.text("篆元真人炼制的仙丹").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
            );
            meta.lore(
                    List.of(
                            Component.text("§f获得无限时长的力量Ⅰ(等效转化§b4§f进攻属性)")
                    )
            );
        });


        lianxin.editMeta(meta -> {
            FoodComponent foodComponent = meta.getFood();
            foodComponent.setCanAlwaysEat(true);

            foodComponent.setNutrition(0);
            foodComponent.setSaturation(0.0f);
            meta.setFood(foodComponent);
            meta.setMaxStackSize(99);
            meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "lianxin");
            meta.displayName(Component.text("抵抗岩浆的试炼丹药").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
            );
            meta.lore(
                    List.of(
                            Component.text("§f火焰抵抗§b5s")
                    )
            );
        });


        ItemMeta xinqitianMeta = xinqitian.getItemMeta();
        FoodComponent foodComponentxinqitian = xinqitianMeta.getFood();
        foodComponentxinqitian.setCanAlwaysEat(true);

        foodComponentxinqitian.setNutrition(0);
        foodComponentxinqitian.setSaturation(0.0f);
        xinqitianMeta.setFood(foodComponentxinqitian);
        xinqitianMeta.setMaxStackSize(99);
        xinqitianMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xinqitian");
        xinqitianMeta.displayName(
                Component.text("辛氏抗毒丹").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        xinqitianMeta.lore(
                List.of(
                        Component.text("§f抵抗毒素§b5s")
                )
        );
        xinqitian.setItemMeta(xinqitianMeta);

        ItemMeta itemMetaSHENMU = SHENMULING.getItemMeta();
        FoodComponent foodComponentshenmu = itemMetaSHENMU.getFood();
        foodComponentshenmu.setCanAlwaysEat(true);

        foodComponentshenmu.setNutrition(0);
        foodComponentshenmu.setSaturation(0.0f);
        itemMetaSHENMU.setFood(foodComponentshenmu);
        itemMetaSHENMU.setMaxStackSize(1);
        itemMetaSHENMU.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shenmuling");
        itemMetaSHENMU.displayName(
                Component.text("神木灵").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaSHENMU.lore(
                List.of(
                        Component.text("§f获得无限时长的生命提升V")
                )
        );
        SHENMULING.setItemMeta(itemMetaSHENMU);

        ItemMeta itemMetashanshen = SHANSHENZHUFU.getItemMeta();
        FoodComponent foodComponentshanshen = itemMetashanshen.getFood();
        foodComponentshanshen.setCanAlwaysEat(true);

        foodComponentshanshen.setNutrition(0);
        foodComponentshanshen.setSaturation(0.0f);
        itemMetashanshen.setFood(foodComponentshanshen);
        itemMetashanshen.setMaxStackSize(1);
        itemMetashanshen.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shanshenzhufu");
        itemMetashanshen.displayName(
                Component.text("山神祝福").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetashanshen.lore(
                List.of(
                        Component.text("§f获得无限时长的生命恢复I")
                )
        );
        SHANSHENZHUFU.setItemMeta(itemMetashanshen);


        ItemMeta itemMetaJiedu1 = jiedu_1.getItemMeta();
        FoodComponent foodComponentJieDu1 = itemMetaJiedu1.getFood();
        foodComponentJieDu1.setCanAlwaysEat(true);

        foodComponentJieDu1.setNutrition(0);
        foodComponentJieDu1.setSaturation(0.0f);
        itemMetaJiedu1.setFood(foodComponentJieDu1);
        itemMetaJiedu1.setMaxStackSize(99);
        itemMetaJiedu1.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "jiedu1");
        itemMetaJiedu1.displayName(
                Component.text("清毒散").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaJiedu1.lore(
                List.of(
                        ComponentSet.RARE1,
                        Component.text("§f消除中毒")
                )
        );
        jiedu_1.setItemMeta(itemMetaJiedu1);

        ItemMeta itemMetaJiedu2 = jiedu_2.getItemMeta();
        FoodComponent foodComponentJieDu2 = itemMetaJiedu2.getFood();
        foodComponentJieDu2.setCanAlwaysEat(true);

        foodComponentJieDu2.setNutrition(0);
        foodComponentJieDu2.setSaturation(0.0f);
        itemMetaJiedu2.setFood(foodComponentJieDu2);
        itemMetaJiedu2.setMaxStackSize(99);
        itemMetaJiedu2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "jiedu2");
        itemMetaJiedu2.displayName(
                Component.text("解厄丹").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaJiedu2.lore(
                List.of(
                        ComponentSet.RARE2,
                        Component.text("§f消除中毒，凋零")
                )
        );
        jiedu_2.setItemMeta(itemMetaJiedu2);

        ItemMeta itemMetaJiedu3 = jiedu_3.getItemMeta();
        FoodComponent foodComponentJieDu3 = itemMetaJiedu3.getFood();
        foodComponentJieDu3.setCanAlwaysEat(true);

        foodComponentJieDu3.setNutrition(0);
        foodComponentJieDu3.setSaturation(0.0f);
        itemMetaJiedu3.setFood(foodComponentJieDu3);
        itemMetaJiedu3.setMaxStackSize(99);
        itemMetaJiedu3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "jiedu3");
        itemMetaJiedu3.displayName(
                Component.text("太清灵解丹").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaJiedu3.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("§f消除中毒，凋零，失明，黑暗")
                )
        );
        jiedu_3.setItemMeta(itemMetaJiedu3);

        ItemMeta itemMetaJiedu4 = jiedu_4.getItemMeta();
        FoodComponent foodComponentJieDu4 = itemMetaJiedu4.getFood();
        foodComponentJieDu4.setCanAlwaysEat(true);

        foodComponentJieDu4.setNutrition(0);
        foodComponentJieDu4.setSaturation(0.0f);
        itemMetaJiedu4.setFood(foodComponentJieDu4);
        itemMetaJiedu4.setMaxStackSize(99);
        itemMetaJiedu4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "jiedu4");
        itemMetaJiedu4.displayName(
                Component.text("百炼金元丹").color(NamedTextColor.DARK_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaJiedu4.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("§f消除中毒，凋零，失明，黑暗，缓慢，挖掘疲劳，饥饿")
                )
        );
        jiedu_4.setItemMeta(itemMetaJiedu4);

        ItemMeta itemMetaHuixue0 = huixue_0.getItemMeta();
        FoodComponent foodComponenthuixue0 = itemMetaHuixue0.getFood();
        foodComponenthuixue0.setCanAlwaysEat(true);

        foodComponenthuixue0.setNutrition(0);
        foodComponenthuixue0.setSaturation(0.0f);
        itemMetaHuixue0.setFood(foodComponenthuixue0);
        itemMetaHuixue0.setMaxStackSize(99);
        itemMetaHuixue0.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "huixue0");
        itemMetaHuixue0.displayName(
                Component.text("新手治疗丹").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaHuixue0.lore(
                List.of(
                        ComponentSet.RARE1,
                        Component.text("§f回复§b40§f生命")
                )
        );
        huixue_0.setItemMeta(itemMetaHuixue0);


        ItemMeta itemMetaHuixue1 = huixue_1.getItemMeta();
        FoodComponent foodComponenthuixue1 = itemMetaHuixue1.getFood();
        foodComponenthuixue1.setCanAlwaysEat(true);

        foodComponenthuixue1.setNutrition(0);
        foodComponenthuixue1.setSaturation(0.0f);
        itemMetaHuixue1.setFood(foodComponenthuixue1);
        itemMetaHuixue1.setMaxStackSize(99);
        itemMetaHuixue1.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "huixue1");
        itemMetaHuixue1.displayName(
                Component.text("一般金创药").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaHuixue1.lore(
                List.of(
                        ComponentSet.RARE2,
                        Component.text("§f回复§b40+10%§f生命")
                )
        );
        huixue_1.setItemMeta(itemMetaHuixue1);

        ItemMeta itemMetaHuixue2 = huixue_2.getItemMeta();
        FoodComponent foodComponenthuixue2 = itemMetaHuixue2.getFood();
        foodComponenthuixue2.setCanAlwaysEat(true);

        foodComponenthuixue2.setNutrition(0);
        foodComponenthuixue2.setSaturation(0.0f);
        itemMetaHuixue2.setFood(foodComponenthuixue2);
        itemMetaHuixue2.setMaxStackSize(99);
        itemMetaHuixue2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "huixue2");
        itemMetaHuixue2.displayName(
                Component.text("中级回元丹").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaHuixue2.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("§f回复§b120+10%§f生命")
                )
        );
        huixue_2.setItemMeta(itemMetaHuixue2);

        ItemMeta itemMetaHuixue3 = huixue_3.getItemMeta();
        FoodComponent foodComponenthuixue3 = itemMetaHuixue3.getFood();
        foodComponenthuixue3.setCanAlwaysEat(true);

        foodComponenthuixue3.setNutrition(0);
        foodComponenthuixue3.setSaturation(0.0f);
        itemMetaHuixue3.setFood(foodComponenthuixue3);
        itemMetaHuixue3.setMaxStackSize(99);
        itemMetaHuixue3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "huixue3");
        itemMetaHuixue3.displayName(
                Component.text("高级痊愈丸").color(NamedTextColor.DARK_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaHuixue3.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("§f回复§b360+10%§f生命")
                )
        );
        huixue_3.setItemMeta(itemMetaHuixue3);


        ItemMeta itemMetaHuixue4 = huixue_4.getItemMeta();
        FoodComponent foodComponenthuixue4 = itemMetaHuixue4.getFood();
        foodComponenthuixue4.setCanAlwaysEat(true);

        foodComponenthuixue4.setNutrition(0);
        foodComponenthuixue4.setSaturation(0.0f);
        itemMetaHuixue4.setFood(foodComponenthuixue4);
        itemMetaHuixue4.setMaxStackSize(99);
        itemMetaHuixue4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "huixue4");
        itemMetaHuixue4.displayName(
                Component.text("九转还魂丹").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaHuixue4.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("§f回复§b1080+10%§f生命")
                )
        );
        huixue_4.setItemMeta(itemMetaHuixue4);


        ItemMeta itemMeta20 = pinGuo.getItemMeta();
        FoodComponent foodComponent20 = itemMeta20.getFood();
        foodComponent20.setCanAlwaysEat(true);

        foodComponent20.setNutrition(2);
        foodComponent20.setSaturation(1.2f);
        itemMeta20.setFood(foodComponent20);
        itemMeta20.setMaxStackSize(99);
        itemMeta20.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "pinguo");
        itemMeta20.displayName(
                Component.text("苹果").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        pinGuo.setItemMeta(itemMeta20);


        ItemMeta itemMeta21 = fengmi.getItemMeta();
        FoodComponent foodComponent21 = itemMeta21.getFood();
        foodComponent21.setCanAlwaysEat(true);

        foodComponent21.setNutrition(20);
        foodComponent21.setSaturation(12.0f);
        itemMeta21.setFood(foodComponent21);
        itemMeta21.setMaxStackSize(99);
        itemMeta21.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "fengmi");
        itemMeta21.displayName(
                Component.text("蜂蜜").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        fengmi.setItemMeta(itemMeta21);


        ItemMeta itemMeta22 = shuilangniemianren.getItemMeta();
        FoodComponent foodComponent22 = itemMeta22.getFood();
        foodComponent22.setCanAlwaysEat(false);

        foodComponent22.setNutrition(2);
        foodComponent22.setSaturation(1.2f);
        itemMeta22.setFood(foodComponent22);
        itemMeta22.setMaxStackSize(99);
        itemMeta22.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shuilangniemianren");
        itemMeta22.displayName(
                Component.text("水狼捏面人").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        shuilangniemianren.setItemMeta(itemMeta22);


        ItemMeta itemMeta23 = xiguapian.getItemMeta();
        FoodComponent foodComponent23 = itemMeta23.getFood();
        foodComponent23.setCanAlwaysEat(true);

        foodComponent23.setNutrition(3);
        foodComponent23.setSaturation(1.8f);
        itemMeta23.setFood(foodComponent23);
        itemMeta23.setMaxStackSize(99);
        itemMeta23.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xiguapian");
        itemMeta23.displayName(
                Component.text("西瓜片").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        xiguapian.setItemMeta(itemMeta23);


        ItemMeta itemMeta24 = longjin.getItemMeta();
        FoodComponent foodComponent24 = itemMeta24.getFood();
        foodComponent24.setCanAlwaysEat(true);

        foodComponent24.setNutrition(0);
        foodComponent24.setSaturation(0.0f);
        itemMeta24.setFood(foodComponent24);
        itemMeta24.setMaxStackSize(99);
        itemMeta24.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "longjin");
        itemMeta24.displayName(
                Component.text("湖心龙井").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        longjin.setItemMeta(itemMeta24);


        ItemMeta itemMeta25 = maojian.getItemMeta();
        FoodComponent foodComponent25 = itemMeta25.getFood();
        foodComponent25.setCanAlwaysEat(true);

        foodComponent25.setNutrition(0);
        foodComponent25.setSaturation(0.0f);
        itemMeta25.setFood(foodComponent25);
        itemMeta25.setMaxStackSize(99);
        itemMeta25.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "maojian");
        itemMeta25.displayName(
                Component.text("君山银针").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        maojian.setItemMeta(itemMeta25);


        ItemMeta itemMeta26 = tieguanyin.getItemMeta();
        FoodComponent foodComponent26 = itemMeta26.getFood();
        foodComponent26.setCanAlwaysEat(true);

        foodComponent26.setNutrition(0);
        foodComponent26.setSaturation(0.0f);
        itemMeta26.setFood(foodComponent26);
        itemMeta26.setMaxStackSize(99);
        itemMeta26.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "tieguanyin");
        itemMeta26.displayName(
                Component.text("云海大红袍").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        tieguanyin.setItemMeta(itemMeta26);


        ItemMeta itemMeta27 = puer.getItemMeta();
        FoodComponent foodComponent27 = itemMeta27.getFood();
        foodComponent27.setCanAlwaysEat(true);

        foodComponent27.setNutrition(0);
        foodComponent27.setSaturation(0.0f);
        itemMeta27.setFood(foodComponent27);
        itemMeta27.setMaxStackSize(99);
        itemMeta27.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "puer");
        itemMeta27.displayName(
                Component.text("冻顶乌龙").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        puer.setItemMeta(itemMeta27);


        ItemMeta itemMeta = baoZi.getItemMeta();
        FoodComponent foodComponent = itemMeta.getFood();
        foodComponent.setCanAlwaysEat(false);

        foodComponent.setNutrition(4);
        foodComponent.setSaturation(4.8f);
        itemMeta.setFood(foodComponent);
        itemMeta.setMaxStackSize(99);
        itemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "baozi");
        itemMeta.displayName(
                Component.text("包子").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        baoZi.setItemMeta(itemMeta);


        ItemMeta itemMeta2 = kaoDiGua.getItemMeta();
        FoodComponent foodComponent2 = itemMeta2.getFood();
        foodComponent2.setCanAlwaysEat(false);

        foodComponent2.setNutrition(6);
        foodComponent2.setSaturation(7.2f);
        itemMeta2.setFood(foodComponent2);
        itemMeta2.setMaxStackSize(99);
        itemMeta2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "kaodigua");
        itemMeta2.displayName(
                Component.text("烤地瓜").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        kaoDiGua.setItemMeta(itemMeta2);


        ItemMeta itemMeta3 = xiBing.getItemMeta();
        FoodComponent foodComponent3 = itemMeta3.getFood();
        foodComponent3.setCanAlwaysEat(false);

        foodComponent3.setNutrition(8);
        foodComponent3.setSaturation(9.6f);
        itemMeta3.setFood(foodComponent3);
        itemMeta3.setMaxStackSize(99);
        itemMeta3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xibing");
        itemMeta3.displayName(
                Component.text("喜饼").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        xiBing.setItemMeta(itemMeta3);


        ItemMeta itemMeta4 = foTiaoQiang.getItemMeta();
        FoodComponent foodComponent4 = itemMeta4.getFood();
        foodComponent4.setCanAlwaysEat(false);

        foodComponent4.setNutrition(10);
        foodComponent4.setSaturation(12f);
        itemMeta4.setFood(foodComponent4);
        itemMeta4.setMaxStackSize(99);
        itemMeta4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "fotiaoqiang");

        itemMeta4.displayName(
                Component.text("佛跳墙").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        foTiaoQiang.setItemMeta(itemMeta4);


        ItemMeta itemMeta5 = kaoYu.getItemMeta();
        FoodComponent foodComponent5 = itemMeta5.getFood();
        foodComponent5.setCanAlwaysEat(false);

        foodComponent5.setNutrition(2);
        foodComponent5.setSaturation(4.0f);
        itemMeta5.setFood(foodComponent5);
        itemMeta5.setMaxStackSize(99);
        itemMeta5.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "kaoyu");
        itemMeta5.displayName(
                Component.text("烤鱼").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        kaoYu.setItemMeta(itemMeta5);


        ItemMeta itemMeta6 = kaoGuiYu.getItemMeta();
        FoodComponent foodComponent6 = itemMeta6.getFood();
        foodComponent6.setCanAlwaysEat(false);

        foodComponent6.setNutrition(4);
        foodComponent6.setSaturation(8.0f);
        itemMeta6.setFood(foodComponent6);
        itemMeta6.setMaxStackSize(99);
        itemMeta6.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "kaoguiyu");
        itemMeta6.displayName(
                Component.text("烤鲑鱼").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        kaoGuiYu.setItemMeta(itemMeta6);


        ItemMeta itemMeta7 = kaoJi.getItemMeta();
        FoodComponent foodComponent7 = itemMeta7.getFood();
        foodComponent7.setCanAlwaysEat(false);

        foodComponent7.setNutrition(6);
        foodComponent7.setSaturation(9.6f);
        itemMeta7.setFood(foodComponent7);
        itemMeta7.setMaxStackSize(99);
        itemMeta7.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "kaoji");
        itemMeta7.displayName(
                Component.text("烤鸡").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        kaoJi.setItemMeta(itemMeta7);


        ItemMeta itemMeta8 = zhuPai.getItemMeta();
        FoodComponent foodComponent8 = itemMeta8.getFood();
        foodComponent8.setCanAlwaysEat(false);

        foodComponent8.setNutrition(11);
        foodComponent8.setSaturation(17.6f);
        itemMeta8.setFood(foodComponent8);
        itemMeta8.setMaxStackSize(99);
        itemMeta8.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "zhupai");
        itemMeta8.displayName(
                Component.text("猪排").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );

        zhuPai.setItemMeta(itemMeta8);


        ItemMeta itemMeta9 = niuPai.getItemMeta();
        FoodComponent foodComponent9 = itemMeta9.getFood();
        foodComponent9.setCanAlwaysEat(false);

        foodComponent9.setNutrition(12);
        foodComponent9.setSaturation(19.2f);
        itemMeta9.setFood(foodComponent9);
        itemMeta9.setMaxStackSize(99);
        itemMeta9.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "niupai");
        itemMeta9.displayName(
                Component.text("牛排").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        niuPai.setItemMeta(itemMeta9);


        ItemMeta itemMeta10 = yangTui.getItemMeta();
        FoodComponent foodComponent10 = itemMeta10.getFood();
        foodComponent10.setCanAlwaysEat(false);

        foodComponent10.setNutrition(10);
        foodComponent10.setSaturation(16.0f);
        itemMeta10.setFood(foodComponent10);
        itemMeta10.setMaxStackSize(99);
        itemMeta10.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yangtui");
        itemMeta10.displayName(
                Component.text("羊腿").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        yangTui.setItemMeta(itemMeta10);


        ItemMeta itemMeta11 = tuRou.getItemMeta();
        FoodComponent foodComponent11 = itemMeta11.getFood();
        foodComponent11.setCanAlwaysEat(false);

        foodComponent11.setNutrition(8);
        foodComponent11.setSaturation(12.8f);
        itemMeta11.setFood(foodComponent11);
        itemMeta11.setMaxStackSize(99);
        itemMeta11.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "turou");
        itemMeta11.displayName(
                Component.text("兔肉").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        tuRou.setItemMeta(itemMeta11);


        ItemMeta itemMeta12 = zongZi.getItemMeta();
        FoodComponent foodComponent12 = itemMeta12.getFood();
        foodComponent12.setCanAlwaysEat(false);

        foodComponent12.setNutrition(2);
        foodComponent12.setSaturation(2.4f);
        itemMeta12.setFood(foodComponent12);
        itemMeta12.setMaxStackSize(99);
        itemMeta12.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "zongzi");
        itemMeta12.displayName(
                Component.text("粽子").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        zongZi.setItemMeta(itemMeta12);


        ItemMeta itemMeta13 = yueBin.getItemMeta();
        FoodComponent foodComponent13 = itemMeta13.getFood();
        foodComponent13.setCanAlwaysEat(false);

        foodComponent13.setNutrition(2);
        foodComponent13.setSaturation(2.4f);
        itemMeta13.setFood(foodComponent13);
        itemMeta13.setMaxStackSize(99);
        itemMeta13.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yuebin");
        itemMeta13.displayName(
                Component.text("月饼").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
        );
        itemMeta13.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );
        yueBin.setItemMeta(itemMeta13);


        ItemMeta itemMeta14 = ZhuangYuanYueBin.getItemMeta();
        FoodComponent foodComponent14 = itemMeta14.getFood();
        foodComponent14.setCanAlwaysEat(false);

        foodComponent14.setNutrition(2);
        foodComponent14.setSaturation(2.4f);
        itemMeta14.setFood(foodComponent14);
        itemMeta14.setMaxStackSize(99);
        itemMeta14.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "zhuangyuanyuebin");
        itemMeta14.displayName(
                Component.text("状元月饼").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        itemMeta14.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("令人攻击力更加旺盛的神奇月饼").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        ZhuangYuanYueBin.setItemMeta(itemMeta14);


        ItemMeta itemMeta15 = DuiTangYueBin.getItemMeta();
        FoodComponent foodComponent15 = itemMeta15.getFood();
        foodComponent15.setCanAlwaysEat(false);

        foodComponent15.setNutrition(2);
        foodComponent15.setSaturation(2.4f);
        itemMeta15.setFood(foodComponent15);
        itemMeta15.setMaxStackSize(99);
        itemMeta15.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "duitangyuebin");
        itemMeta15.displayName(
                Component.text("对堂月饼").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        itemMeta15.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("令人抵抗力更加旺盛的神奇月饼").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        DuiTangYueBin.setItemMeta(itemMeta15);


        ItemMeta itemMeta16 = SanHongYueBin.getItemMeta();
        FoodComponent foodComponent16 = itemMeta16.getFood();
        foodComponent16.setCanAlwaysEat(false);

        foodComponent16.setNutrition(2);
        foodComponent16.setSaturation(2.4f);
        itemMeta16.setFood(foodComponent16);
        itemMeta16.setMaxStackSize(99);
        itemMeta16.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "sanhongyuebin");
        itemMeta16.displayName(
                Component.text("三红月饼").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        itemMeta16.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("令人生命力更加旺盛的神奇月饼").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        SanHongYueBin.setItemMeta(itemMeta16);


        ItemMeta itemMeta19 = xianTao.getItemMeta();
        FoodComponent foodComponent19 = itemMeta19.getFood();
        foodComponent19.setCanAlwaysEat(true);

        foodComponent19.setNutrition(2);
        foodComponent19.setSaturation(1.2f);
        itemMeta19.setFood(foodComponent19);
        itemMeta19.setMaxStackSize(99);
        itemMeta19.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xiantao");
        itemMeta19.displayName(
                Component.text("仙桃").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        itemMeta19.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("多吃仙桃，延年益寿").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        xianTao.setItemMeta(itemMeta19);


        ItemMeta kaoXueYuItemMeta = kaoXueYu.getItemMeta();
        FoodComponent kaoXueYuFoodComponent = kaoXueYuItemMeta.getFood();
        kaoXueYuFoodComponent.setCanAlwaysEat(false);

        kaoXueYuFoodComponent.setNutrition(6);
        kaoXueYuFoodComponent.setSaturation(12.0f);
        kaoXueYuItemMeta.setFood(kaoXueYuFoodComponent);
        kaoXueYuItemMeta.setMaxStackSize(99);
        kaoXueYuItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "kaoxueyu");
        kaoXueYuItemMeta.displayName(
                Component.text("烤鳕鱼").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        kaoXueYu.setItemMeta(kaoXueYuItemMeta);


        ItemMeta kaoXiaItemMeta = kaoXia.getItemMeta();
        FoodComponent kaoXiaFoodComponent = kaoXiaItemMeta.getFood();
        kaoXiaFoodComponent.setCanAlwaysEat(false);

        kaoXiaFoodComponent.setNutrition(9);
        kaoXiaFoodComponent.setSaturation(18.0f);
        kaoXiaItemMeta.setFood(kaoXiaFoodComponent);
        kaoXiaItemMeta.setMaxStackSize(99);
        kaoXiaItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "kaoxia");
        kaoXiaItemMeta.displayName(
                Component.text("烤虾").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        kaoXia.setItemMeta(kaoXiaItemMeta);


        ItemMeta xieQianItemMeta = xieQian.getItemMeta();
        FoodComponent xieQianFoodComponent = xieQianItemMeta.getFood();
        xieQianFoodComponent.setCanAlwaysEat(false);

        xieQianFoodComponent.setNutrition(10);
        xieQianFoodComponent.setSaturation(20.0f);
        xieQianItemMeta.setFood(xieQianFoodComponent);
        xieQianItemMeta.setMaxStackSize(99);
        xieQianItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xieqian");
        xieQianItemMeta.displayName(
                Component.text("蟹钳").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        xieQian.setItemMeta(xieQianItemMeta);


        ItemMeta kaoYouYuItemMeta = kaoYouYu.getItemMeta();
        FoodComponent kaoYouYuFoodComponent = kaoYouYuItemMeta.getFood();
        kaoYouYuFoodComponent.setCanAlwaysEat(false);

        kaoYouYuFoodComponent.setNutrition(8);
        kaoYouYuFoodComponent.setSaturation(16.0f);
        kaoYouYuItemMeta.setFood(kaoYouYuFoodComponent);
        kaoYouYuItemMeta.setMaxStackSize(99);
        kaoYouYuItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "kaoyouyu");
        kaoYouYuItemMeta.displayName(
                Component.text("烤鱿鱼").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        kaoYouYu.setItemMeta(kaoYouYuItemMeta);


        ItemMeta DADADAJITUIItemMeta = DADADAJITUI.getItemMeta();
        FoodComponent DADADAJITUIFoodComponent = DADADAJITUIItemMeta.getFood();
        DADADAJITUIFoodComponent.setCanAlwaysEat(false);

        DADADAJITUIFoodComponent.setNutrition(13);
        DADADAJITUIFoodComponent.setSaturation(20.8f);
        DADADAJITUIItemMeta.setFood(DADADAJITUIFoodComponent);
        DADADAJITUIItemMeta.setMaxStackSize(99);
        DADADAJITUIItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "dadadajitui");
        DADADAJITUIItemMeta.displayName(
                Component.text("大大大鸡腿").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        DADADAJITUI.setItemMeta(DADADAJITUIItemMeta);


        ItemMeta huluoboItemMeta = huluobo.getItemMeta();
        FoodComponent huluoboFoodComponent = huluoboItemMeta.getFood();
        huluoboFoodComponent.setCanAlwaysEat(false);

        huluoboFoodComponent.setNutrition(2);
        huluoboFoodComponent.setSaturation(2.4f);
        huluoboItemMeta.setFood(huluoboFoodComponent);
        huluoboItemMeta.setMaxStackSize(99);
        huluoboItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "huluobo");
        huluoboItemMeta.displayName(
                Component.text("胡萝卜").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        huluobo.setItemMeta(huluoboItemMeta);


        ItemMeta qinpinGuoItemMeta = qinpinGuo.getItemMeta();
        FoodComponent qinpinGuoFoodComponent = qinpinGuoItemMeta.getFood();
        qinpinGuoFoodComponent.setCanAlwaysEat(true);

        qinpinGuoFoodComponent.setNutrition(4);
        qinpinGuoFoodComponent.setSaturation(2.4f);
        qinpinGuoItemMeta.setFood(qinpinGuoFoodComponent);
        qinpinGuoItemMeta.setMaxStackSize(99);
        qinpinGuoItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qinpinguo");
        qinpinGuoItemMeta.displayName(
                Component.text("青苹果").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        qinpinGuo.setItemMeta(qinpinGuoItemMeta);


        ItemMeta putaoItemMeta = putao.getItemMeta();
        FoodComponent putaoFoodComponent = putaoItemMeta.getFood();
        putaoFoodComponent.setCanAlwaysEat(true);

        putaoFoodComponent.setNutrition(5);
        putaoFoodComponent.setSaturation(3f);
        putaoItemMeta.setFood(putaoFoodComponent);
        putaoItemMeta.setMaxStackSize(99);
        putaoItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "putao");
        putaoItemMeta.displayName(
                Component.text("葡萄").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        putao.setItemMeta(putaoItemMeta);


        ItemMeta liItemMeta = li.getItemMeta();
        FoodComponent liFoodComponent = liItemMeta.getFood();
        liFoodComponent.setCanAlwaysEat(true);

        liFoodComponent.setNutrition(6);
        liFoodComponent.setSaturation(3.6f);
        liItemMeta.setFood(liFoodComponent);
        liItemMeta.setMaxStackSize(99);
        liItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "li");
        liItemMeta.displayName(
                Component.text("梨").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        li.setItemMeta(liItemMeta);


        ItemMeta xiangjiaoItemMeta = xiangjiao.getItemMeta();
        FoodComponent xiangjiaoFoodComponent = xiangjiaoItemMeta.getFood();
        xiangjiaoFoodComponent.setCanAlwaysEat(true);

        xiangjiaoFoodComponent.setNutrition(7);
        xiangjiaoFoodComponent.setSaturation(4.2f);
        xiangjiaoItemMeta.setFood(xiangjiaoFoodComponent);
        xiangjiaoItemMeta.setMaxStackSize(99);
        xiangjiaoItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xiangjiao");
        xiangjiaoItemMeta.displayName(
                Component.text("香蕉").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        xiangjiao.setItemMeta(xiangjiaoItemMeta);


        ItemMeta caomeiItemMeta = caomei.getItemMeta();
        FoodComponent caomeiFoodComponent = caomeiItemMeta.getFood();
        caomeiFoodComponent.setCanAlwaysEat(true);

        caomeiFoodComponent.setNutrition(8);
        caomeiFoodComponent.setSaturation(4.8f);
        caomeiItemMeta.setFood(caomeiFoodComponent);
        caomeiItemMeta.setMaxStackSize(99);
        caomeiItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "caomei");
        caomeiItemMeta.displayName(
                Component.text("草莓").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        caomei.setItemMeta(caomeiItemMeta);


        ItemMeta boloItemMeta = bolo.getItemMeta();
        FoodComponent boloFoodComponent = boloItemMeta.getFood();
        boloFoodComponent.setCanAlwaysEat(true);

        boloFoodComponent.setNutrition(9);
        boloFoodComponent.setSaturation(5.4f);
        boloItemMeta.setFood(boloFoodComponent);
        boloItemMeta.setMaxStackSize(99);
        boloItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "bolo");
        boloItemMeta.displayName(
                Component.text("菠萝").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        bolo.setItemMeta(boloItemMeta);


        bolo.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/31"));
        caomei.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/30"));
        xiangjiao.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/29"));
        li.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/28"));
        putao.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/27"));
        qinpinGuo.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/26"));
        huluobo.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/25"));
        DADADAJITUI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/24"));
        kaoYouYu.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/23"));
        xieQian.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/22"));
        kaoXia.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/21"));
        kaoXueYu.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/20"));
        xianTao.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/19"));
        SanHongYueBin.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/16"));
        DuiTangYueBin.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/15"));
        ZhuangYuanYueBin.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/14"));
        yueBin.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/13"));
        zongZi.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/12"));
        tuRou.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/11"));
        yangTui.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/10"));
        niuPai.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/9"));
        zhuPai.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/8"));
        kaoJi.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/7"));
        kaoGuiYu.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/6"));
        kaoYu.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/5"));
        foTiaoQiang.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/4"));
        xiBing.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/3"));
        kaoDiGua.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/2"));
        baoZi.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/1"));
        puer.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "apple/5"));
        tieguanyin.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "apple/5"));
        maojian.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "apple/5"));
        longjin.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "apple/5"));
        xiguapian.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "apple/4"));
        shuilangniemianren.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "apple/3"));
        fengmi.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "apple/2"));
        pinGuo.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "apple/1"));
        lianxin.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/40"));
        zuanyaun.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/39"));
        wangyuanwai.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/42"));
        zhangzhe.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/44"));
        chendaifu.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/33"));
        baigujin.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/35"));
        penglai.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/48"));
        SHENMULING.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/46"));
        jiedu_4.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/36"));
        jiedu_3.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/36"));
        jiedu_2.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/36"));
        jiedu_1.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/36"));
        xinqitian.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/36"));
        SHANSHENZHUFU.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/41"));
        huixue_4.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/41"));
        huixue_3.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/41"));
        huixue_2.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/41"));
        huixue_1.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/41"));
        huixue_0.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bread/41"));
    }


}
