package CreationalPatterns.AbstractFactory.AnotherFurnitureExample;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        FurnitureFactory factory = House.getFurnitureStyle();
        ArrayList<Furniture> furniture = new ArrayList<>();
        furniture.add(factory.getProductA());
        furniture.add(factory.getProductB());
        furniture.add(factory.getProductC());

        double totalPrice = 0;
        System.out.println("Furniture count: " + furniture.size());
        for (Furniture f: furniture) {
            if (f instanceof Chair) {
                ((Chair) f).sitOn();
            } else if (f instanceof Sofa) {
                ((Sofa) f).sitOn();
            }
            totalPrice += f.getPrice();
            System.out.println("Price: $" + f.getPrice());;
        }
        System.out.println("Total price: $" + totalPrice);
    }
}
