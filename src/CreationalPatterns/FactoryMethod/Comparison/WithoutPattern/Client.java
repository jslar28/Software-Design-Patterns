package CreationalPatterns.FactoryMethod.Comparison.WithoutPattern;

public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClassOne();
        AbstractClass anotherAbstractClass = new ConcreteClassTwo();
    }
}
