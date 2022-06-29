package structural.bridge.structure;

public class ConcreteAbstraction implements IAbstraction {

    private Implementor implementor;

    public ConcreteAbstraction(Implementor implementor) {
        this.implementor = implementor;
    }


    @Override
    public void method1() {
        System.out.println("ConcreteAbstraction>method1");
        this.implementor.operation1();
    }

    @Override
    public void method2() {
        System.out.println("ConcreteAbstraction>method2");
        this.implementor.operation2();
    }
}