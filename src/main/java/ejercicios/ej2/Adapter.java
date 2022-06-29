package ejercicios.ej2;

import structural.adapter.structure.Adaptee;

public class Adapter implements ICuadratrack{

    private CuadratrackElectrico cuadratrackElectrico;

    public Adapter(CuadratrackElectrico cuadratrackElectrico) {

        this.cuadratrackElectrico = cuadratrackElectrico;
    }

    @Override
    public void llenarGasolina() {
        System.out.println("\nAdapter cuadratrack electrico");
        cuadratrackElectrico.cargar();
    }

    @Override
    public int getCombustible() {
        System.out.println("\nAdapter cuadratrack electrico");
        return cuadratrackElectrico.getCarga();
    }
}
