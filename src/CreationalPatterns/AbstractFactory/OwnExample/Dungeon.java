package CreationalPatterns.AbstractFactory.OwnExample;

class Dungeon {
    private Boss boss;
    private Guard guard;

    static Dungeon createDungeon(NPCFactory factory) {
        return new Dungeon(factory);
    }

    private Dungeon(NPCFactory factory) {
        this.boss = factory.createBoss();
        this.guard = factory.createGuard();
    }

    void spawnNPCs() {
        boss.activate();
        guard.spawn();
    }
}
