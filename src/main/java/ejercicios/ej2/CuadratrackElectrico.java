package ejercicios.ej2;

import java.util.Random;

public class CuadratrackElectrico implements ICuadratrackElectrico{

    public String tipo = "Electrico";
    public int carga;
    Random rand = new Random();

    public CuadratrackElectrico(int carga) {

        this.carga = carga;
    }

    @Override
    public void cargar() {
        System.out.println("\nCargando bateria");
        int random = rand.nextInt(21);
        carga = random;
        System.out.println("Capacidad de bateria se lleno a " + carga);
    }

    @Override
    public int getCarga() {
        int random = rand.nextInt(21);
        return random;
    }
}
