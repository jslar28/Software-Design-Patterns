package CreationalPatterns.Builder;

abstract class Builder {
    void buildPartA() {}
    void buildPartB() {}
    void buildPartC() {}
    abstract void reset();
    abstract Object getProduct();
}
