package CreationalPatterns.AbstractFactory.OwnExample;

public class Client {
    public static void main(String[] args) {
        NPCFactory npcFactory;
        if (args.length > 0 && args[0].toUpperCase().equals("HORDE")) {
             npcFactory = new HostileFactory();
        } else {
            npcFactory = new FriendlyFactory();
        }
        Dungeon dungeon = Dungeon.createDungeon(npcFactory);
        dungeon.spawnNPCs();
    }
}
