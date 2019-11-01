package CreationalPatterns.FactoryMethod.WithParameterizedCreator;

public class NPCFactory {
    NPC createNPC(String type) {
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
