package structural.decorator.structure;

public class ConcreteComponent implements IComponent {

    @Override
    public void operation() {
        System.out.println("ConcreteComponent> operation -> realizando operacion del objeto base");
    }
}