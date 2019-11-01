package CreationalPatterns.Prototype.AbstractExample;

import java.util.HashMap;

class PrototypeCache {
    private static HashMap<String, AbstractPrototype> cache = new HashMap<>();

    static {
        ConcretePrototypeOne center = new ConcretePrototypeOne();
        center.x = 0;
        center.y = 0;

        ConcretePrototypeOne topLeft = (ConcretePrototypeOne) center.clone();
        topLeft.x = 10;
        topLeft.y = -10;

        ConcretePrototypeTwo topLeft3D = new ConcretePrototypeTwo();
        topLeft3D.x = 10;
        topLeft3D.y = -10;
        topLeft3D.z = 0;

        cache.put("center", center);
        cache.put("top left", topLeft);
        cache.put("top left 3D", topLeft3D);
    }

    static AbstractPrototype getPrototype(String type) {
        AbstractPrototype prototype = cache.get(type);
        if (prototype == null) {
            System.out.println("No prototype of that type cached.");
            return null;
        }
        return (AbstractPrototype) prototype.clone();
    }
}
