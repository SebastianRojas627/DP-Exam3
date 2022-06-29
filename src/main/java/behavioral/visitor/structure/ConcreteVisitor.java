package behavioral.visitor.structure;
public class ConcreteVisitor implements IVisitor {
    @Override
    public String visitElement1(ConcreteElement1 concreteElement1) {

        // logica para atender el concrete element 1
        concreteElement1.attribute1 = "alg1";
        concreteElement1.attribute2 = "alg1 attrb";
        System.out.println("aplicacndo visitante en Element 1");
        return "aplicacndo visitante en Element 1";
    }

    @Override
    public String visitElement2(ConcreteElement2 concreteElement2) {

        // logica para atender el concrete element 1
        concreteElement2.attribute1 = "alg2";
        concreteElement2.attribute2 = "alg2 attrb2";
        System.out.println("aplicacndo visitante en Element 2");
        return "aplicacndo visitante en Element 2";
    }
}