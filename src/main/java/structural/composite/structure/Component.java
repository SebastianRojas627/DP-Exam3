package structural.composite.structure;

public abstract class Component {

    private String attribute1;
    private String attribute2;

    public Component(String attribute1) {
        this.attribute1 = attribute1;
        System.out.println("(Constructor)Component > this.attribute1: " + this.attribute1);
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public abstract void operation();

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract Component getChild(int position);
}