package BehavioralPatterns.TemplateMethod;

class SmallDungeon extends Dungeon {
    @Override
    void spawnMobs() {
        System.out.println("Spawn lesser creatures");
    }

    @Override
    void spawnBoss() {
        System.out.println("Spawn a big guy");
    }
}
