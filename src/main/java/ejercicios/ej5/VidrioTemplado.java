package ejercicios.ej5;

public class VidrioTemplado extends DecoratorCelular {

    public VidrioTemplado(ICelular celular, int precio) {
        super(celular, precio);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Añadiendo vidrio templado de costo: " + precio);
        setPrecio(precio);
    }

    @Override
    public void setPrecio(int precio) {
        super.setPrecio(precio);
    }
}
