package ejercicios.ej1;

import java.util.Random;

public class LaPaz implements IDepartament{

    public String nombre = "La Paz";
    public int nroProvincias = 15;
    public int nroHabitantes = 15000;
    public String clima = "Frio";
    public int dieroTurismo = 50;
    Random rand = new Random();

    public LaPaz() {}

    @Override
    public void accept(IVisitor visitor) {

        System.out.println("\nEntrando a La Paz");
        int random = rand.nextInt(500);
        visitor.visitLaPaz(this, random);
    }
}
