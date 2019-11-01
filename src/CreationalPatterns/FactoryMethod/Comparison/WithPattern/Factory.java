package CreationalPatterns.FactoryMethod.Comparison.WithPattern;

class Factory {
    AbstractClass factoryMethod(int configuration) {
        return new ConcreteClassOne();
    }
}

class AdvancedFactory extends Factory {
    AbstractClass factoryMethod(int configuration) {
        if (configuration > 0) {
            return new ConcreteClassTwo();
        } else {
            return new ConcreteClassOne();
        }
    }
}
