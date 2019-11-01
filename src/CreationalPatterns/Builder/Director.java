package CreationalPatterns.Builder;

class Director {
    private Builder builder;

    Director(Builder builder) {
        this.builder = builder;
    }

    Object makeProduct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getProduct();
    }
}
