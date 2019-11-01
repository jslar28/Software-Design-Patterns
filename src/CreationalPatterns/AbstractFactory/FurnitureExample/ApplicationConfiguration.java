package CreationalPatterns.AbstractFactory.FurnitureExample;

class ApplicationConfiguration {
    static FurnitureFactory getFurnitureFactory() {
        // Check some configuration or environment setting here, and return
        // the appropriate factory
        return new VictorianFurnitureFactory();
    }
}
