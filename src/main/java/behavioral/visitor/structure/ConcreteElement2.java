package behavioral.visitor.structure;

public class ConcreteElement2 implements IElement {

    String attribute1;
    String attribute2;

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitElement2(this);
    }

    @Override
    public String method1() {
        return null;
    }

    @Override
    public String method2() {
        return null;
    }
}