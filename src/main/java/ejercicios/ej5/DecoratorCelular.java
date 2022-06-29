package ejercicios.ej5;

public abstract class DecoratorCelular implements ICelular {

    private ICelular celular;
    public int precio;
    public int almacenamiento;

    public DecoratorCelular(ICelular celular, int precio) {
        this.celular = celular;
        this.precio = precio;
    }

    @Override
    public void showInfo() {
        celular.showInfo();
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = this.precio + precio;
    }

    @Override
    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = this.almacenamiento + almacenamiento;
    }
}
