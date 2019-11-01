package CreationalPatterns.AbstractFactory.AnotherFurnitureExample;

public class House {
    public static FurnitureFactory getFurnitureStyle() {
        return new ModernFurnitureFactory();
    }
}
