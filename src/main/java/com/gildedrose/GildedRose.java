package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void dailyUpdateOfItemsQuality() {
        for (Item item : items) {
            item.checksAndUpdateOfQualityDependingTheItemName();
            item.checksAndUpdateOfSellIn();
            item.checksAndUpdateOfQualityDependingTheSellIn();
        }
    }

}