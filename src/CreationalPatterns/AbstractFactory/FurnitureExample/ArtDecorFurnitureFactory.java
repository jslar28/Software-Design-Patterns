package CreationalPatterns.AbstractFactory.FurnitureExample;

public class ArtDecorFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecorChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecorSofa();
    }

    @Override
    public Table createTable() {
        return new ArtDecorTable();
    }
}
