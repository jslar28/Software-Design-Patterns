package CreationalPatterns.AbstractFactory.AnotherFurnitureExample;

public class VictorianSofa extends Sofa {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a victorian sofa.");
    }

    @Override
    public double getPrice() {
        return 28.30;
    }

}
