package com.gildedrose;

public class Item {
    public static final int MIN_VALUE = 0;
    public static final int MAX_QUALITY = 50;
    private final ItemName name;
    private int sellIn;
    private int quality;

    public Item(ItemName name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void checksAndUpdateOfQualityDependingTheSellIn() {
        if (isItemSellInLessThanMinimumValue()) {
            if (!name.equals(ItemName.AGED_BRIE)) {
                reduceQualityOfItemAsSellInNegative();
            } else {
                increaseQuality();
            }
        }
    }

    public void checksAndUpdateOfQualityDependingTheItemName() {
        if (isNotAgedBrieOrBackstagePasses()) {
            reduceQuality();
        } else {
            increaseQuality();
            bonusIncreaseIfBackstageItemWithLessThan11SellIn();
        }
    }

    public void checksAndUpdateOfSellIn() {
        if (!name.equals(ItemName.SULFURS_HAND_OF_RAGNAROK)) {
            sellIn -= 1;
        }
    }

    private void bonusIncreaseIfBackstageItemWithLessThan11SellIn() {
        if (isBackstageItemWithSellInInferiorTo11()) {
            increaseQuality();
        }
    }

    private boolean isBackstageItemWithSellInInferiorTo11() {
        return name.equals(ItemName.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT) && sellIn < 11 && quality < MAX_QUALITY;
    }

    private boolean isNotAgedBrieOrBackstagePasses() {
        return !name.equals(ItemName.AGED_BRIE)
                && !name.equals(ItemName.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT);
    }

    private boolean isQualityNotMinQualityAndNameNotSulfuras() {
        return quality > MIN_VALUE && !name.equals(ItemName.SULFURS_HAND_OF_RAGNAROK);
    }

    private boolean isItemSellInLessThanMinimumValue() {
        return sellIn < MIN_VALUE;
    }
    private void reduceQuality() {
        if (isQualityNotMinQualityAndNameNotSulfuras()) {
            if(ItemName.CONJURED_MANA_CAKE.equals(name)){
                quality -= 2;
            }
            else {
                quality -= 1;
            }
        }
    }

    private void increaseQuality() {
        if (quality < MAX_QUALITY) {
            quality +=1;
        }
    }

    private void reduceQualityOfItemAsSellInNegative() {
        if (!name.equals(ItemName.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
            reduceQuality();
        } else {
            quality = MIN_VALUE;
        }
    }

    @Override
    public String toString() {
        return this.name.getLabel() + ", " + this.sellIn + ", " + this.quality;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }
}
