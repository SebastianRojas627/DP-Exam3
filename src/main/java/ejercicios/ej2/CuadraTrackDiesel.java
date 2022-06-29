package ejercicios.ej2;

import java.util.Random;

public class CuadraTrackDiesel implements ICuadratrack{

    public int diesel;
    public String tipo = "Diesel";
    Random rand = new Random();

    public CuadraTrackDiesel(int diesel) {

        this.diesel = diesel;
    }

    @Override
    public void llenarGasolina() {
        System.out.println("\nLlenando Gasolina");
        int random = rand.nextInt(51);
        diesel = random;
        System.out.println("Cantidad de diesel se lleno a " + diesel);
    }

    @Override
    public int getCombustible() {
        int random = rand.nextInt(51);
        return random;
    }
}
