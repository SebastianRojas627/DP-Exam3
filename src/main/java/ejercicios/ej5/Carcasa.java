package ejercicios.ej5;

public class Carcasa extends DecoratorCelular {

    public Carcasa(ICelular celular, int precio) {
        super(celular, precio);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Añadiendo carcasa de costo: " + precio);
        setPrecio(precio);
    }

    @Override
    public void setPrecio(int precio) {
        super.setPrecio(precio);
    }
}
