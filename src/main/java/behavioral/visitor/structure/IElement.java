package behavioral.visitor.structure;

public interface IElement {

    void accept(IVisitor visitor);
    String method1();
    String method2();
}