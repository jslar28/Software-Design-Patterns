package BehavioralPatterns.TemplateMethod;

abstract class Dungeon {
    abstract void spawnMobs();
    abstract void spawnBoss();

    void onEnterDungeon() {
        System.out.println("Starting dungeon: " + this.getClass().getSimpleName());
        spawnMobs();
        spawnBoss();
    }
}
