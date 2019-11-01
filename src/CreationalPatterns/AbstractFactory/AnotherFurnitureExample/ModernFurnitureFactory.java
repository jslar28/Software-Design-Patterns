package CreationalPatterns.AbstractFactory.AnotherFurnitureExample;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Furniture getProductA() {
        return new ModernChair();
    }

    @Override
    public Furniture getProductB() {
        return new ModernSofa();
    }

    @Override
    public Furniture getProductC() {
        return new ModernTable();
    }
}
