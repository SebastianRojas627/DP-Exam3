package ejercicios.ej5;

public class MemoriaExterna extends DecoratorCelular {

    public int almacenamieto;
    public MemoriaExterna(ICelular celular, int precio, int almacenamieto) {
        super(celular, precio);
        this.almacenamieto = almacenamieto;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Añadiendo vidrio templado de costo: " + precio);
        setPrecio(precio);
        setAlmacenamiento(almacenamieto);
    }

    @Override
    public void setPrecio(int precio) {
        super.setPrecio(precio);
    }

    @Override
    public void setAlmacenamiento(int almacenamiento) {
        super.setAlmacenamiento(almacenamiento);
    }
}
