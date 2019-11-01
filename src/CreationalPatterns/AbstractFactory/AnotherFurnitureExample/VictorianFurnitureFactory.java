package CreationalPatterns.AbstractFactory.AnotherFurnitureExample;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Furniture getProductA() {
        return new VictorianChair();
    }

    @Override
    public Furniture getProductB() {
        return new VictorianSofa();
    }

    @Override
    public Furniture getProductC() {
        return new VictorianTable();
    }
}
