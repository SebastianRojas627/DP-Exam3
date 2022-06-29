package structural.bridge.structure;

public class Implementor3 implements Implementor {

    @Override
    public void operation1() {
        System.out.println("Implementor3>operation1");
    }

    @Override
    public void operation2() {
        System.out.println("Implementor3>operation2");
    }
}