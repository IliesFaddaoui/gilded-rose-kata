package com.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new Item(ItemName.PLUS_5_DEXTERITY_VEST, 10, 20), //
                new Item(ItemName.PLUS_5_DEXTERITY_VEST, 0, 20), //
                new Item(ItemName.AGED_BRIE, 0, 0), //
                new Item(ItemName.ELIXIR_OF_THE_MONGOOSE, 5, 7), //
                new Item(ItemName.SULFURS_HAND_OF_RAGNAROK, 0, 80), //
                new Item(ItemName.SULFURS_HAND_OF_RAGNAROK, -1, 80),
                new Item(ItemName.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 15, 20),
                new Item(ItemName.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 10, 49),
                new Item(ItemName.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 5, 47),
                new Item(ItemName.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 0, 47),
                // this conjured item does not work properly yet
                new Item(ItemName.CONJURED_MANA_CAKE, 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.dailyUpdateOfItemsQuality();
        }
    }

}
