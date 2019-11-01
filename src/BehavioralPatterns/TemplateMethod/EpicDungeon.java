package BehavioralPatterns.TemplateMethod;

class EpicDungeon extends Dungeon {
    @Override
    void spawnMobs() {
        System.out.println("Spawn big creatures");
    }

    @Override
    void spawnBoss() {
        System.out.println("Spawn a huge dragon");
    }
}
