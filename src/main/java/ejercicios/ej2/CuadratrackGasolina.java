package ejercicios.ej2;

import java.util.Random;

public class CuadratrackGasolina implements ICuadratrack{

    public int diesel;
    public String tipo = "Gasolina";
    Random rand = new Random();

    public CuadratrackGasolina(int diesel) {

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

