package CreationalPatterns.FactoryMethod.Comparison.WithPattern;

public class Client {
    public static void main(String[] args) {
        Factory factory = new AdvancedFactory();
        AbstractClass abstractClass = factory.factoryMethod(1);
    }
}
