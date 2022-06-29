package behavioral.visitor.structure;

public interface IVisitor {

    String visitElement1(ConcreteElement1 concreteElement1);

    String visitElement2(ConcreteElement2 concreteElement2);
}