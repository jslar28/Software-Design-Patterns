package StructuralPatterns.Facade;

public class Client {
    public static void main(String[] args) {
        String complexResult = (new ComplexSubsystemFacade().getComplexResult());
        System.out.println(complexResult);
    }
}
