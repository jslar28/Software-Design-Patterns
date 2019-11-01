package CreationalPatterns.AbstractFactory.FurnitureExample;

public class Client {
    public static void main(String[] args) {
        FurnitureFactory factory = ApplicationConfiguration.getFurnitureFactory();

        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        Table table = factory.createTable();

        System.out.println(chair + "\n" + sofa + "\n" + table);
    }
}
