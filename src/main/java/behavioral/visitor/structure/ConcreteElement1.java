package behavioral.visitor.structure;

public class ConcreteElement1 implements IElement {

    String attribute1;
    String attribute2;

    @Override
    public void accept(IVisitor visitor) {
        // logica
        visitor.visitElement1(this);
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