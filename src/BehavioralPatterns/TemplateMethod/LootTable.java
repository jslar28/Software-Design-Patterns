package BehavioralPatterns.TemplateMethod;

import java.util.ArrayList;

class LootTable {
    ArrayList<String> loot = new ArrayList<>();

    LootTable(int lootFactor) {
        this.setLootTable(lootFactor);
    }

    void setLootTable(int factor) {
        double lootFactor = (float)factor/100;
        if (lootFactor > 0.8) {
            loot.add("Huge Epic Sword");
        }
        if (lootFactor > 0.5) {
            loot.add("Shiny Trinket");
        }
        loot.add("Rusty Dagger");
    }
}
