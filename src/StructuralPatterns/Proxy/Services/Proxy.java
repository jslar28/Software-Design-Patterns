package StructuralPatterns.Proxy.Services;

public class Proxy implements ServiceInterface {
    private Service realService;

    @Override
    public void operation(boolean allowed) {
        if (allowed) {
            System.out.println("On proxy, before real service operation");
            realService.operation(true);
            System.out.println("On proxy, after real service operation");
        } else {
            try {
                throw new Exception("You're not allowed here");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Proxy() {
        this.realService = new Service();
    }
}
