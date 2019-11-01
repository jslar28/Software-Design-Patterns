package CreationalPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        Builder[] builders = new Builder[] {
                new ConcreteBuilderOne(), new ConcreteBuilderTwo()
        };

        for (Builder builder: builders) {
            Director director = new Director(builder);
            System.out.println(director.makeProduct().toString());
        }
    }
}
