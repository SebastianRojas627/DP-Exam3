package structural.composite.structure;

public class Client {
    public static void main(String[] args) {

        Leaf celular = new Leaf("\t\tcelular1");
        Leaf celular2 = new Leaf("\t\tcelular2");
        Leaf celular3 = new Leaf("\t\tcelular3");
        Leaf celular4 = new Leaf("\t\tcelular4");

        Composite cajaCelular = new Composite("\tcaja celular 1");
        cajaCelular.add(celular);
        cajaCelular.add(celular2);
        cajaCelular.add(celular3);
        cajaCelular.add(celular4);

        Composite cajaCelular2 = new Composite("\tcaja celular 2");
        cajaCelular2.add(new Leaf("\t\tcelular5"));
        cajaCelular2.add(new Leaf("\t\tcelular6"));
        cajaCelular2.add(new Leaf("\t\tcelular7"));
        cajaCelular2.add(new Leaf("\t\tcelular8"));

        Composite contenedorCelular = new Composite("**- contenedor celular 1");
        contenedorCelular.add(cajaCelular);
        contenedorCelular.add(cajaCelular2);

        Composite contenedorCelular2 = new Composite("**- contenedor celular 2");
        contenedorCelular2.add(cajaCelular);
        contenedorCelular2.add(cajaCelular2);


        Composite cargaBarcoCelular = new Composite("Carga Barco Celular");
        cargaBarcoCelular.add(contenedorCelular);
        cargaBarcoCelular.add(contenedorCelular2);

        cargaBarcoCelular.operation();
    }

}