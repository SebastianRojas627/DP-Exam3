package structural.adapter.structure;

public class Client {

    public static void main(String[] args) {

        IAdapter elementA = new ElementConcreteA();
        elementA.method1();
        elementA.method2("eynar", "eynar2");

        Adaptee adaptee = new Adaptee();

        IAdapter elementAdapter = new ConcreteAdapter(adaptee);
        elementAdapter.method1();
        elementAdapter.method2("eynar", "eynar2");


    }

}