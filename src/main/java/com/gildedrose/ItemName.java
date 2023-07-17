package com.gildedrose;

public enum ItemName {
    AGED_BRIE("Aged Brie"),
    BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT("Backstage passes to a TAFKAL80ETC concert"),
    SULFURS_HAND_OF_RAGNAROK("Sulfuras, Hand of Ragnaros"),
    ELIXIR_OF_THE_MONGOOSE("Elixir of the Mongoose"),
    PLUS_5_DEXTERITY_VEST("+5 Dexterity Vest"),
    CONJURED_MANA_CAKE("Conjured Mana Cake");

    private final String label;

    public String getLabel() {
        return label;
    }

    ItemName(String label) {
        this.label = label;
    }

}
