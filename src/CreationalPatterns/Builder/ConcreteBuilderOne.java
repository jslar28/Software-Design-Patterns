package CreationalPatterns.Builder;

public class ConcreteBuilderOne extends Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.a = 5;
    }

    @Override
    public void buildPartB() {
        product.b = "B1";
    }

    @Override
    void reset() {
        product = new Product();
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
