package structural.adapter.structure;

public class ElementConcreteA implements IAdapter {

    @Override
    public void method1() {
        System.out.println("ElementConcreteA>method1");
        System.out.println("realizando logica....");
    }

    @Override
    public void method2(String attr1, String attr2) {
        System.out.println("ElementConcreteA>method2: " + attr1 + " " + attr2);
        System.out.println("realizando logica....");
    }
}