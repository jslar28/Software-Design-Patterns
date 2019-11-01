package CreationalPatterns.AbstractFactory.AnotherFurnitureExample;

public class ModernChair extends Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair.");
    }

    @Override
    public double getPrice() {
        return 15.50;
    }
}
