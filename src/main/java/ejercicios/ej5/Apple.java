package ejercicios.ej5;

public class Apple implements ICelular{

    public int ram;
    public int almacenamiento;
    public String cpu;
    public int precio;

    public Apple(int ram, int almacenamiento, String cpu, int precio) {

        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.cpu = cpu;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }


    @Override
    public void showInfo() {
        System.out.println("\n Celular Apple");
        System.out.println("RAM: " + ram);
        System.out.println("Almacenamiento: " + almacenamiento);
        System.out.println("CPU: " + cpu);
        System.out.println("Precio: " + precio);
    }
}
