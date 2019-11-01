package CreationalPatterns.AbstractFactory.FurnitureExample;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    Table createTable();
}
