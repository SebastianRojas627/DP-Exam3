package behavioral.visitor.structure;

public class Client {

    public static void main(String[] args) {

        ConcreteVisitor visitorGeneraReports = new ConcreteVisitor();

        ConcreteElement1 element1 = new ConcreteElement1();
        ConcreteElement2 element2 = new ConcreteElement2();

        element1.accept(visitorGeneraReports);
        element2.accept(visitorGeneraReports);


    }
}