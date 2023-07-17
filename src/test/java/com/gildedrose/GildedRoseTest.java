package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {

    @Test
    void shouldUpdateProperlyItemsAfterDailyChecks() {
        Item[] items = new Item[] {
                new Item(ItemName.PLUS_5_DEXTERITY_VEST, 10, 20), //
                new Item(ItemName.AGED_BRIE, 0, 0), //
                new Item(ItemName.ELIXIR_OF_THE_MONGOOSE, 5, 7), //
                new Item(ItemName.SULFURS_HAND_OF_RAGNAROK, -1, 80),
                new Item(ItemName.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 0, 47),
                new Item(ItemName.CONJURED_MANA_CAKE, 3, 6) };

        GildedRose app = new GildedRose(items);
        app.dailyUpdateOfItemsQuality();
        app.dailyUpdateOfItemsQuality();

        assertEquals(8,app.items[0].getSellIn());
        assertEquals(18,app.items[0].getQuality());

        assertEquals(-2,app.items[1].getSellIn());
        assertEquals(4,app.items[1].getQuality());

        assertEquals(3,app.items[2].getSellIn());
        assertEquals(5,app.items[2].getQuality());

        assertEquals(-1,app.items[3].getSellIn());
        assertEquals(80,app.items[3].getQuality());

        assertEquals(-2,app.items[4].getSellIn());
        assertEquals(0,app.items[4].getQuality());

        assertEquals(1,app.items[5].getSellIn());
        assertEquals(2,app.items[5].getQuality());
    }

}