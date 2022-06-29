package structural.composite.structure;

public class Leaf extends Component {

    public Leaf(String attribute1) {
        super(attribute1);
    }

    @Override
    public void operation() {

        System.out.println("\t\tLeaf > operation" + getAttribute1());
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Component getChild(int position) {
        return null;
    }
}