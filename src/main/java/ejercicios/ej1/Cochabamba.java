package ejercicios.ej1;

public class Cochabamba implements IDepartament{

    public String nombre = "Cochabamba";
    public int nroProvincias = 8;
    public int nroHabitantes = 1000;
    public String clima = "Caliente";
    public int dieroTurismo = 25;

    public Cochabamba() {}

    @Override
    public void accept(IVisitor visitor) {

        System.out.println("\nEntrando a Cochabamba");
        double cantidad = nroHabitantes * 0.1;
        visitor.visitCochabamba(this, cantidad);
    }
}
