package com.xiaoxiaoowo.yuehua.itemstack.other;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.components.FoodComponent;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public final class Food {


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
    public static final ItemStack BanHeYueBin = new ItemStack(Material.BREAD, 1);
    public static final ItemStack YiHeYueBin = new ItemStack(Material.BREAD, 1);
    public static final ItemStack xianTao = new ItemStack(Material.BREAD, 1);


    //茶
    public static final ItemStack longjin = new ItemStack(Material.APPLE, 1);
    public static final ItemStack maojian = new ItemStack(Material.APPLE, 1);
    public static final ItemStack tieguanyin = new ItemStack(Material.APPLE, 1);
    public static final ItemStack puer = new ItemStack(Material.APPLE, 1);


    static {
        pinGuo.setCustomModelData(1);
        ItemMeta itemMeta20 = pinGuo.getItemMeta();
        FoodComponent foodComponent20 = itemMeta20.getFood();
        foodComponent20.setCanAlwaysEat(true);
        foodComponent20.setEatSeconds(1.0f);
        foodComponent20.setNutrition(2);
        foodComponent20.setSaturation(1.0f);
        itemMeta20.setFood(foodComponent20);
        itemMeta20.setMaxStackSize(99);
        itemMeta20.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "pinguo");
        itemMeta20.displayName(
                Component.text("苹果").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        pinGuo.setItemMeta(itemMeta20);

        fengmi.setCustomModelData(2);
        ItemMeta itemMeta21 = fengmi.getItemMeta();
        FoodComponent foodComponent21 = itemMeta21.getFood();
        foodComponent21.setCanAlwaysEat(true);
        foodComponent21.setEatSeconds(0.1f);
        foodComponent21.setNutrition(10);
        foodComponent21.setSaturation(5.0f);
        itemMeta21.setFood(foodComponent21);
        itemMeta21.setMaxStackSize(99);
        itemMeta21.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "fengmi");
        itemMeta21.displayName(
                Component.text("蜂蜜").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        fengmi.setItemMeta(itemMeta21);

        shuilangniemianren.setCustomModelData(3);
        ItemMeta itemMeta22 = shuilangniemianren.getItemMeta();
        FoodComponent foodComponent22 = itemMeta22.getFood();
        foodComponent22.setCanAlwaysEat(false);
        foodComponent22.setEatSeconds(1.6f);
        foodComponent22.setNutrition(4);
        foodComponent22.setSaturation(3.2f);
        itemMeta22.setFood(foodComponent22);
        itemMeta22.setMaxStackSize(99);
        itemMeta22.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shuilangniemianren");
        itemMeta22.displayName(
                Component.text("水狼捏面人").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        shuilangniemianren.setItemMeta(itemMeta22);

        xiguapian.setCustomModelData(4);
        ItemMeta itemMeta23 = xiguapian.getItemMeta();
        FoodComponent foodComponent23 = itemMeta23.getFood();
        foodComponent23.setCanAlwaysEat(true);
        foodComponent23.setEatSeconds(1.0f);
        foodComponent23.setNutrition(2);
        foodComponent23.setSaturation(1.5f);
        itemMeta23.setFood(foodComponent23);
        itemMeta23.setMaxStackSize(99);
        itemMeta23.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xiguapian");
        itemMeta23.displayName(
                Component.text("西瓜片").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        xiguapian.setItemMeta(itemMeta23);

        longjin.setCustomModelData(5);
        ItemMeta itemMeta24 = longjin.getItemMeta();
        FoodComponent foodComponent24 = itemMeta24.getFood();
        foodComponent24.setCanAlwaysEat(true);
        foodComponent24.setEatSeconds(2.0f);
        foodComponent24.setNutrition(0);
        foodComponent24.setSaturation(0.0f);
        itemMeta24.setFood(foodComponent24);
        itemMeta24.setMaxStackSize(99);
        itemMeta24.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "longjin");
        itemMeta24.displayName(
                Component.text("龙井").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        longjin.setItemMeta(itemMeta24);

        maojian.setCustomModelData(5);
        ItemMeta itemMeta25 = maojian.getItemMeta();
        FoodComponent foodComponent25 = itemMeta25.getFood();
        foodComponent25.setCanAlwaysEat(true);
        foodComponent25.setEatSeconds(2.0f);
        foodComponent25.setNutrition(0);
        foodComponent25.setSaturation(0.0f);
        itemMeta25.setFood(foodComponent25);
        itemMeta25.setMaxStackSize(99);
        itemMeta25.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "maojian");
        itemMeta25.displayName(
                Component.text("毛尖").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        maojian.setItemMeta(itemMeta25);

        tieguanyin.setCustomModelData(5);
        ItemMeta itemMeta26 = tieguanyin.getItemMeta();
        FoodComponent foodComponent26 = itemMeta26.getFood();
        foodComponent26.setCanAlwaysEat(true);
        foodComponent26.setEatSeconds(2.0f);
        foodComponent26.setNutrition(0);
        foodComponent26.setSaturation(0.0f);
        itemMeta26.setFood(foodComponent26);
        itemMeta26.setMaxStackSize(99);
        itemMeta26.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "tieguanyin");
        itemMeta26.displayName(
                Component.text("铁观音").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        tieguanyin.setItemMeta(itemMeta26);

        puer.setCustomModelData(5);
        ItemMeta itemMeta27 = puer.getItemMeta();
        FoodComponent foodComponent27 = itemMeta27.getFood();
        foodComponent27.setCanAlwaysEat(true);
        foodComponent27.setEatSeconds(2.0f);
        foodComponent27.setNutrition(0);
        foodComponent27.setSaturation(0.0f);
        itemMeta27.setFood(foodComponent27);
        itemMeta27.setMaxStackSize(99);
        itemMeta27.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "puer");
        itemMeta27.displayName(
                Component.text("普洱").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        puer.setItemMeta(itemMeta27);


        baoZi.setCustomModelData(1);
        ItemMeta itemMeta = baoZi.getItemMeta();
        FoodComponent foodComponent = itemMeta.getFood();
        foodComponent.setCanAlwaysEat(false);
        foodComponent.setEatSeconds(2f);
        foodComponent.setNutrition(5);
        foodComponent.setSaturation(2.0f);
        itemMeta.setFood(foodComponent);
        itemMeta.setMaxStackSize(99);
        itemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "baozi");
        itemMeta.displayName(
                Component.text("包子").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        baoZi.setItemMeta(itemMeta);

        kaoDiGua.setCustomModelData(2);
        ItemMeta itemMeta2 = kaoDiGua.getItemMeta();
        FoodComponent foodComponent2 = itemMeta2.getFood();
        foodComponent2.setCanAlwaysEat(false);
        foodComponent2.setEatSeconds(2.0f);
        foodComponent2.setNutrition(6);
        foodComponent2.setSaturation(3.0f);
        itemMeta2.setFood(foodComponent2);
        itemMeta2.setMaxStackSize(99);
        itemMeta2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "kaodigua");
        itemMeta2.displayName(
                Component.text("烤地瓜").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        kaoDiGua.setItemMeta(itemMeta2);

        xiBing.setCustomModelData(3);
        ItemMeta itemMeta3 = xiBing.getItemMeta();
        FoodComponent foodComponent3 = itemMeta3.getFood();
        foodComponent3.setCanAlwaysEat(false);
        foodComponent3.setEatSeconds(2.0f);
        foodComponent3.setNutrition(10);
        foodComponent3.setSaturation(6.0f);
        itemMeta3.setFood(foodComponent3);
        itemMeta3.setMaxStackSize(99);
        itemMeta3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xibing");
        itemMeta3.displayName(
                Component.text("喜饼").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        xiBing.setItemMeta(itemMeta3);

        foTiaoQiang.setCustomModelData(4);
        ItemMeta itemMeta4 = foTiaoQiang.getItemMeta();
        FoodComponent foodComponent4 = itemMeta4.getFood();
        foodComponent4.setCanAlwaysEat(false);
        foodComponent4.setEatSeconds(2.0f);
        foodComponent4.setNutrition(15);
        foodComponent4.setSaturation(7.0f);
        itemMeta4.setFood(foodComponent4);
        itemMeta4.setMaxStackSize(99);
        itemMeta4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "fotiaoqiang");

        itemMeta4.displayName(
                Component.text("佛跳墙").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        foTiaoQiang.setItemMeta(itemMeta4);

        kaoYu.setCustomModelData(5);
        ItemMeta itemMeta5 = kaoYu.getItemMeta();
        FoodComponent foodComponent5 = itemMeta5.getFood();
        foodComponent5.setCanAlwaysEat(false);
        foodComponent5.setEatSeconds(1.5f);
        foodComponent5.setNutrition(3);
        foodComponent5.setSaturation(3.0f);
        itemMeta5.setFood(foodComponent5);
        itemMeta5.setMaxStackSize(99);
        itemMeta5.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "kaoyu");
        itemMeta5.displayName(
                Component.text("烤鱼").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        kaoYu.setItemMeta(itemMeta5);

        kaoGuiYu.setCustomModelData(6);
        ItemMeta itemMeta6 = kaoGuiYu.getItemMeta();
        FoodComponent foodComponent6 = itemMeta6.getFood();
        foodComponent6.setCanAlwaysEat(false);
        foodComponent6.setEatSeconds(1.5f);
        foodComponent6.setNutrition(5);
        foodComponent6.setSaturation(5.0f);
        itemMeta6.setFood(foodComponent6);
        itemMeta6.setMaxStackSize(99);
        itemMeta6.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "kaoguiyu");
        itemMeta6.displayName(
                Component.text("烤鲑鱼").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        kaoGuiYu.setItemMeta(itemMeta6);

        kaoJi.setCustomModelData(7);
        ItemMeta itemMeta7 = kaoJi.getItemMeta();
        FoodComponent foodComponent7 = itemMeta7.getFood();
        foodComponent7.setCanAlwaysEat(false);
        foodComponent7.setEatSeconds(2f);
        foodComponent7.setNutrition(3);
        foodComponent7.setSaturation(5.0f);
        itemMeta7.setFood(foodComponent7);
        itemMeta7.setMaxStackSize(99);
        itemMeta7.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "kaoji");
        itemMeta7.displayName(
                Component.text("烤鸡").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        kaoJi.setItemMeta(itemMeta7);

        zhuPai.setCustomModelData(8);
        ItemMeta itemMeta8 = zhuPai.getItemMeta();
        FoodComponent foodComponent8 = itemMeta8.getFood();
        foodComponent8.setCanAlwaysEat(false);
        foodComponent8.setEatSeconds(2f);
        foodComponent8.setNutrition(10);
        foodComponent8.setSaturation(12.0f);
        itemMeta8.setFood(foodComponent8);
        itemMeta8.setMaxStackSize(99);
        itemMeta8.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "zhupai");
        itemMeta8.displayName(
                Component.text("猪排").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );

        zhuPai.setItemMeta(itemMeta8);

        niuPai.setCustomModelData(9);
        ItemMeta itemMeta9 = niuPai.getItemMeta();
        FoodComponent foodComponent9 = itemMeta9.getFood();
        foodComponent9.setCanAlwaysEat(false);
        foodComponent9.setEatSeconds(2f);
        foodComponent9.setNutrition(12);
        foodComponent9.setSaturation(16.0f);
        itemMeta9.setFood(foodComponent9);
        itemMeta9.setMaxStackSize(99);
        itemMeta9.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "niupai");
        itemMeta9.displayName(
                Component.text("牛排").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        niuPai.setItemMeta(itemMeta9);

        yangTui.setCustomModelData(10);
        ItemMeta itemMeta10 = yangTui.getItemMeta();
        FoodComponent foodComponent10 = itemMeta10.getFood();
        foodComponent10.setCanAlwaysEat(false);
        foodComponent10.setEatSeconds(2f);
        foodComponent10.setNutrition(9);
        foodComponent10.setSaturation(12.0f);
        itemMeta10.setFood(foodComponent10);
        itemMeta10.setMaxStackSize(99);
        itemMeta10.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yangtui");
        itemMeta10.displayName(
                Component.text("羊腿").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        yangTui.setItemMeta(itemMeta10);

        tuRou.setCustomModelData(11);
        ItemMeta itemMeta11 = tuRou.getItemMeta();
        FoodComponent foodComponent11 = itemMeta11.getFood();
        foodComponent11.setCanAlwaysEat(false);
        foodComponent11.setEatSeconds(2f);
        foodComponent11.setNutrition(5);
        foodComponent11.setSaturation(8.0f);
        itemMeta11.setFood(foodComponent11);
        itemMeta11.setMaxStackSize(99);
        itemMeta11.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "turou");
        itemMeta11.displayName(
                Component.text("兔肉").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        tuRou.setItemMeta(itemMeta11);

        zongZi.setCustomModelData(12);
        ItemMeta itemMeta12 = zongZi.getItemMeta();
        FoodComponent foodComponent12 = itemMeta12.getFood();
        foodComponent12.setCanAlwaysEat(false);
        foodComponent12.setEatSeconds(10f);
        foodComponent12.setNutrition(2);
        foodComponent12.setSaturation(2.0f);
        itemMeta12.setFood(foodComponent12);
        itemMeta12.setMaxStackSize(99);
        itemMeta12.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "zongzi");
        itemMeta12.displayName(
                Component.text("粽子").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        zongZi.setItemMeta(itemMeta12);


        yueBin.setCustomModelData(13);
        ItemMeta itemMeta13 = yueBin.getItemMeta();
        FoodComponent foodComponent13 = itemMeta13.getFood();
        foodComponent13.setCanAlwaysEat(false);
        foodComponent13.setEatSeconds(10f);
        foodComponent13.setNutrition(2);
        foodComponent13.setSaturation(2.0f);
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

        ZhuangYuanYueBin.setCustomModelData(14);
        ItemMeta itemMeta14 = ZhuangYuanYueBin.getItemMeta();
        FoodComponent foodComponent14 = itemMeta14.getFood();
        foodComponent14.setCanAlwaysEat(false);
        foodComponent14.setEatSeconds(10f);
        foodComponent14.setNutrition(2);
        foodComponent14.setSaturation(2.0f);
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

        DuiTangYueBin.setCustomModelData(15);
        ItemMeta itemMeta15 = DuiTangYueBin.getItemMeta();
        FoodComponent foodComponent15 = itemMeta15.getFood();
        foodComponent15.setCanAlwaysEat(false);
        foodComponent15.setEatSeconds(10f);
        foodComponent15.setNutrition(2);
        foodComponent15.setSaturation(2.0f);
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

        SanHongYueBin.setCustomModelData(16);
        ItemMeta itemMeta16 = SanHongYueBin.getItemMeta();
        FoodComponent foodComponent16 = itemMeta16.getFood();
        foodComponent16.setCanAlwaysEat(false);
        foodComponent16.setEatSeconds(10f);
        foodComponent16.setNutrition(2);
        foodComponent16.setSaturation(2.0f);
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

        BanHeYueBin.setCustomModelData(17);
        ItemMeta itemMeta17 = BanHeYueBin.getItemMeta();
        FoodComponent foodComponent17 = itemMeta17.getFood();
        foodComponent17.setCanAlwaysEat(false);
        foodComponent17.setEatSeconds(100f);
        foodComponent17.setNutrition(2);
        foodComponent17.setSaturation(2.0f);
        itemMeta17.setFood(foodComponent17);
        itemMeta17.setMaxStackSize(99);
        itemMeta17.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "banheyuebin");
        itemMeta17.displayName(
                Component.text("半盒月饼").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        itemMeta17.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("打开获得随机6种月饼").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        BanHeYueBin.setItemMeta(itemMeta17);

        YiHeYueBin.setCustomModelData(18);
        ItemMeta itemMeta18 = YiHeYueBin.getItemMeta();
        FoodComponent foodComponent18 = itemMeta18.getFood();
        foodComponent18.setCanAlwaysEat(false);
        foodComponent18.setEatSeconds(100f);
        foodComponent18.setNutrition(2);
        foodComponent18.setSaturation(2.0f);
        itemMeta18.setFood(foodComponent18);
        itemMeta18.setMaxStackSize(99);
        itemMeta18.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yiheyuebin");
        itemMeta18.displayName(
                Component.text("一盒月饼").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        itemMeta18.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("打开获得随机12种月饼").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        YiHeYueBin.setItemMeta(itemMeta18);


        xianTao.setCustomModelData(19);
        ItemMeta itemMeta19 = xianTao.getItemMeta();
        FoodComponent foodComponent19 = itemMeta19.getFood();
        foodComponent19.setCanAlwaysEat(false);
        foodComponent19.setEatSeconds(10f);
        foodComponent19.setNutrition(2);
        foodComponent19.setSaturation(2.0f);
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

        kaoXueYu.setCustomModelData(20);
        ItemMeta kaoXueYuItemMeta = kaoXueYu.getItemMeta();
        FoodComponent kaoXueYuFoodComponent = kaoXueYuItemMeta.getFood();
        kaoXueYuFoodComponent.setCanAlwaysEat(false);
        kaoXueYuFoodComponent.setEatSeconds(1.5f);
        kaoXueYuFoodComponent.setNutrition(7);
        kaoXueYuFoodComponent.setSaturation(7.0f);
        kaoXueYuItemMeta.setFood(kaoXueYuFoodComponent);
        kaoXueYuItemMeta.setMaxStackSize(99);
        kaoXueYuItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "kaoxueyu");
        kaoXueYuItemMeta.displayName(
                Component.text("烤鳕鱼").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        kaoXueYu.setItemMeta(kaoXueYuItemMeta);

        kaoXia.setCustomModelData(21);
        ItemMeta kaoXiaItemMeta = kaoXia.getItemMeta();
        FoodComponent kaoXiaFoodComponent = kaoXiaItemMeta.getFood();
        kaoXiaFoodComponent.setCanAlwaysEat(false);
        kaoXiaFoodComponent.setEatSeconds(1.5f);
        kaoXiaFoodComponent.setNutrition(10);
        kaoXiaFoodComponent.setSaturation(10.0f);
        kaoXiaItemMeta.setFood(kaoXiaFoodComponent);
        kaoXiaItemMeta.setMaxStackSize(99);
        kaoXiaItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "kaoxia");
        kaoXiaItemMeta.displayName(
                Component.text("烤虾").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        kaoXia.setItemMeta(kaoXiaItemMeta);

        xieQian.setCustomModelData(22);
        ItemMeta xieQianItemMeta = xieQian.getItemMeta();
        FoodComponent xieQianFoodComponent = xieQianItemMeta.getFood();
        xieQianFoodComponent.setCanAlwaysEat(false);
        xieQianFoodComponent.setEatSeconds(1.5f);
        xieQianFoodComponent.setNutrition(15);
        xieQianFoodComponent.setSaturation(15.0f);
        xieQianItemMeta.setFood(xieQianFoodComponent);
        xieQianItemMeta.setMaxStackSize(99);
        xieQianItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xieqian");
        xieQianItemMeta.displayName(
                Component.text("蟹钳").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        xieQian.setItemMeta(xieQianItemMeta);

        kaoYouYu.setCustomModelData(23);
        ItemMeta kaoYouYuItemMeta = kaoYouYu.getItemMeta();
        FoodComponent kaoYouYuFoodComponent = kaoYouYuItemMeta.getFood();
        kaoYouYuFoodComponent.setCanAlwaysEat(false);
        kaoYouYuFoodComponent.setEatSeconds(1.5f);
        kaoYouYuFoodComponent.setNutrition(8);
        kaoYouYuFoodComponent.setSaturation(8.0f);
        kaoYouYuItemMeta.setFood(kaoYouYuFoodComponent);
        kaoYouYuItemMeta.setMaxStackSize(99);
        kaoYouYuItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "kaoyouyu");
        kaoYouYuItemMeta.displayName(
                Component.text("烤鱿鱼").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        kaoYouYu.setItemMeta(kaoYouYuItemMeta);

        DADADAJITUI.setCustomModelData(24);
        ItemMeta DADADAJITUIItemMeta = DADADAJITUI.getItemMeta();
        FoodComponent DADADAJITUIFoodComponent = DADADAJITUIItemMeta.getFood();
        DADADAJITUIFoodComponent.setCanAlwaysEat(false);
        DADADAJITUIFoodComponent.setEatSeconds(2f);
        DADADAJITUIFoodComponent.setNutrition(20);
        DADADAJITUIFoodComponent.setSaturation(20.0f);
        DADADAJITUIItemMeta.setFood(DADADAJITUIFoodComponent);
        DADADAJITUIItemMeta.setMaxStackSize(99);
        DADADAJITUIItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "dadadajitui");
        DADADAJITUIItemMeta.displayName(
                Component.text("大大大鸡腿").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        DADADAJITUI.setItemMeta(DADADAJITUIItemMeta);

        huluobo.setCustomModelData(25);
        ItemMeta huluoboItemMeta = huluobo.getItemMeta();
        FoodComponent huluoboFoodComponent = huluoboItemMeta.getFood();
        huluoboFoodComponent.setCanAlwaysEat(false);
        huluoboFoodComponent.setEatSeconds(1.6f);
        huluoboFoodComponent.setNutrition(3);
        huluoboFoodComponent.setSaturation(1f);
        huluoboItemMeta.setFood(huluoboFoodComponent);
        huluoboItemMeta.setMaxStackSize(99);
        huluoboItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "huluobo");
        huluoboItemMeta.displayName(
                Component.text("胡萝卜").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        huluobo.setItemMeta(huluoboItemMeta);

        qinpinGuo.setCustomModelData(26);
        ItemMeta qinpinGuoItemMeta = qinpinGuo.getItemMeta();
        FoodComponent qinpinGuoFoodComponent = qinpinGuoItemMeta.getFood();
        qinpinGuoFoodComponent.setCanAlwaysEat(true);
        qinpinGuoFoodComponent.setEatSeconds(1f);
        qinpinGuoFoodComponent.setNutrition(3);
        qinpinGuoFoodComponent.setSaturation(1.5f);
        qinpinGuoItemMeta.setFood(qinpinGuoFoodComponent);
        qinpinGuoItemMeta.setMaxStackSize(99);
        qinpinGuoItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qinpinguo");
        qinpinGuoItemMeta.displayName(
                Component.text("青苹果").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        qinpinGuo.setItemMeta(qinpinGuoItemMeta);

        putao.setCustomModelData(27);
        ItemMeta putaoItemMeta = putao.getItemMeta();
        FoodComponent putaoFoodComponent = putaoItemMeta.getFood();
        putaoFoodComponent.setCanAlwaysEat(true);
        putaoFoodComponent.setEatSeconds(1f);
        putaoFoodComponent.setNutrition(4);
        putaoFoodComponent.setSaturation(2f);
        putaoItemMeta.setFood(putaoFoodComponent);
        putaoItemMeta.setMaxStackSize(99);
        putaoItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "putao");
        putaoItemMeta.displayName(
                Component.text("葡萄").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        putao.setItemMeta(putaoItemMeta);

        li.setCustomModelData(28);
        ItemMeta liItemMeta = li.getItemMeta();
        FoodComponent liFoodComponent = liItemMeta.getFood();
        liFoodComponent.setCanAlwaysEat(true);
        liFoodComponent.setEatSeconds(1f);
        liFoodComponent.setNutrition(5);
        liFoodComponent.setSaturation(2.5f);
        liItemMeta.setFood(liFoodComponent);
        liItemMeta.setMaxStackSize(99);
        liItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "li");
        liItemMeta.displayName(
                Component.text("梨").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        li.setItemMeta(liItemMeta);

        xiangjiao.setCustomModelData(29);
        ItemMeta xiangjiaoItemMeta = xiangjiao.getItemMeta();
        FoodComponent xiangjiaoFoodComponent = xiangjiaoItemMeta.getFood();
        xiangjiaoFoodComponent.setCanAlwaysEat(true);
        xiangjiaoFoodComponent.setEatSeconds(1f);
        xiangjiaoFoodComponent.setNutrition(6);
        xiangjiaoFoodComponent.setSaturation(3f);
        xiangjiaoItemMeta.setFood(xiangjiaoFoodComponent);
        xiangjiaoItemMeta.setMaxStackSize(99);
        xiangjiaoItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xiangjiao");
        xiangjiaoItemMeta.displayName(
                Component.text("香蕉").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        xiangjiao.setItemMeta(xiangjiaoItemMeta);

        caomei.setCustomModelData(30);
        ItemMeta caomeiItemMeta = caomei.getItemMeta();
        FoodComponent caomeiFoodComponent = caomeiItemMeta.getFood();
        caomeiFoodComponent.setCanAlwaysEat(true);
        caomeiFoodComponent.setEatSeconds(1f);
        caomeiFoodComponent.setNutrition(7);
        caomeiFoodComponent.setSaturation(3.5f);
        caomeiItemMeta.setFood(caomeiFoodComponent);
        caomeiItemMeta.setMaxStackSize(99);
        caomeiItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "caomei");
        caomeiItemMeta.displayName(
                Component.text("草莓").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        caomei.setItemMeta(caomeiItemMeta);

        bolo.setCustomModelData(31);
        ItemMeta boloItemMeta = bolo.getItemMeta();
        FoodComponent boloFoodComponent = boloItemMeta.getFood();
        boloFoodComponent.setCanAlwaysEat(true);
        boloFoodComponent.setEatSeconds(0.8f);
        boloFoodComponent.setNutrition(10);
        boloFoodComponent.setSaturation(5f);
        boloItemMeta.setFood(boloFoodComponent);
        boloItemMeta.setMaxStackSize(99);
        boloItemMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "bolo");
        boloItemMeta.displayName(
                Component.text("菠萝").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        bolo.setItemMeta(boloItemMeta);

    }


}
