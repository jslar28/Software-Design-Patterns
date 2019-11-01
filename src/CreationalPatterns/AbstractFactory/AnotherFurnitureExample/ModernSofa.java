package CreationalPatterns.AbstractFactory.AnotherFurnitureExample;

public class ModernSofa extends Sofa {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern sofa.");
    }

    @Override
    public double getPrice() {
        return 35.00;
    }

}
