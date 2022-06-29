package structural.decorator.structure;

public class Client {

    public static void main(String[] args) {
        // notepad
        IComponent component = new ConcreteComponent();
        // plugin PDF
        component = new ConcreteDecorator1(component);
        // plugin IMG
        component = new ConcreteDecorator2(component);

        component.operation();

    }
}