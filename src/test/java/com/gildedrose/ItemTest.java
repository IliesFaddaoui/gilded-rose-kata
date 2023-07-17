package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemTest {
    @Test
    void checksAndUpdateOfQualityDependingTheSellIn_shouldReduceQuality() {
        Item item = new Item(ItemName.PLUS_5_DEXTERITY_VEST,-1,2);
        item.checksAndUpdateOfQualityDependingTheSellIn();
        assertEquals(1,item.getQuality());
    }

    @Test
    void checksAndUpdateOfQualityDependingTheSellIn_shouldIncreaseQuality() {
        Item item = new Item(ItemName.AGED_BRIE,-1,2);
        item.checksAndUpdateOfQualityDependingTheSellIn();
        assertEquals(3,item.getQuality());
    }

    @Test
    void checksAndUpdateOfQualityDependingTheSellIn_shouldNtReduceQualitySulfura() {
        Item item = new Item(ItemName.SULFURS_HAND_OF_RAGNAROK,-1,2);
        item.checksAndUpdateOfQualityDependingTheSellIn();
        assertEquals(2,item.getQuality());
    }

    @Test
    void checksAndUpdateOfQualityDependingTheSellIn_shouldReduceQualityTo0() {
        Item item = new Item(ItemName.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT,-1,20);
        item.checksAndUpdateOfQualityDependingTheSellIn();
        assertEquals(0,item.getQuality());
    }

    @Test
    void checksAndUpdateOfQualityDependingTheSellIn_shouldNtIncreaseOrReduceQuality() {
        Item item = new Item(ItemName.AGED_BRIE,1,2);
        item.checksAndUpdateOfQualityDependingTheSellIn();
        assertEquals(2,item.getQuality());
    }

    @Test
    void checksAndUpdateOfQualityDependingTheSellIn_shouldNtIncreaseOrReduceQualitySulfuras() {
        Item item = new Item(ItemName.SULFURS_HAND_OF_RAGNAROK,1,2);
        item.checksAndUpdateOfQualityDependingTheSellIn();
        assertEquals(2,item.getQuality());
    }

    @Test
    void checksAndUpdateOfQualityDependingTheItemName_shouldIncreaseBackstageQualityTwice() {
        Item item = new Item(ItemName.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT,1,2);
        item.checksAndUpdateOfQualityDependingTheItemName();
        assertEquals(4,item.getQuality());
    }

    @Test
    void checksAndUpdateOfQualityDependingTheItemName_shouldIncreaseBrieQualityOnce() {
        Item item = new Item(ItemName.AGED_BRIE,1,2);
        item.checksAndUpdateOfQualityDependingTheItemName();
        assertEquals(3,item.getQuality());
    }

    @Test
    void checksAndUpdateOfQualityDependingTheItemName_shouldReduceQualityOnce() {
        Item item = new Item(ItemName.ELIXIR_OF_THE_MONGOOSE,1,2);
        item.checksAndUpdateOfQualityDependingTheItemName();
        assertEquals(1,item.getQuality());
    }

    @Test
    void checksAndUpdateOfSellIn_shouldReduceSellIn() {
        Item item = new Item(ItemName.ELIXIR_OF_THE_MONGOOSE,1,2);
        item.checksAndUpdateOfSellIn();
        assertEquals(0,item.getSellIn());
    }

    @Test
    void checksAndUpdateOfSellIn_shouldNtReduceSellIn() {
        Item item = new Item(ItemName.SULFURS_HAND_OF_RAGNAROK,1,2);
        item.checksAndUpdateOfSellIn();
        assertEquals(1,item.getSellIn());
    }

    @Test
    void checksAndUpdateOfQualityDependingTheSellIn_shouldReduceTwiceQualityAsConjuredItem() {
        Item item = new Item(ItemName.CONJURED_MANA_CAKE,-1,2);
        item.checksAndUpdateOfQualityDependingTheSellIn();
        assertEquals(0,item.getQuality());
    }

    @Test
    void checksAndUpdateOfQualityDependingTheItemName_shouldReduceTwiceAsConjuredItem() {
        Item item = new Item(ItemName.CONJURED_MANA_CAKE,-1,4);
        item.checksAndUpdateOfQualityDependingTheItemName();
        assertEquals(2,item.getQuality());
    }
}
