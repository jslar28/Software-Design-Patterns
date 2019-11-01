package CreationalPatterns.FactoryMethod.WithConcreteCreator;

class NPCFactory {
    NPC createNPC() {
        switch (getRandomInt()) {
            case 1:
                return new Orc();
            case 2:
                return new Villager();
            default:
                return null;

        }
    }

    private int getRandomInt() {
        return (int) (Math.random() * ((2-1) + 1)) + 1;
    }
}
