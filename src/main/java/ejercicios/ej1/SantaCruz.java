package ejercicios.ej1;

public class SantaCruz implements IDepartament{

    public String nombre = "Santa Cruz";
    public int nroProvincias = 20;
    public int nroHabitantes = 20000;
    public String clima = "Calido";
    public int dieroTurismo = 75;

    public SantaCruz() {}

    @Override
    public void accept(IVisitor visitor) {

        System.out.println("\nEntrando a Santa Cruz");
        double cantidad = nroProvincias * 0.5;
        visitor.visitSantaCruz(this, cantidad);
    }
}
