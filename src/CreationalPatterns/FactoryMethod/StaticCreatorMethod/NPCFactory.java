package CreationalPatterns.FactoryMethod.StaticCreatorMethod;

public abstract class NPCFactory {
    public static NPC createNPC(String type) {
        System.out.println("helo2");
        switch (type.toUpperCase()) {
            case "VILLAGER":
                return new Villager();
            case "ORC":
                return new Orc();
            default:
                return null;
        }
    }
}
