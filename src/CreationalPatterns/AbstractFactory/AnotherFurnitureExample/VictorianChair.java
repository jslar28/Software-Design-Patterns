package CreationalPatterns.AbstractFactory.AnotherFurnitureExample;

public class VictorianChair extends Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a victorian chair.");
    }

    @Override
    public double getPrice() {
        return 10.50;
    }
}
