package ejercicios.ej2;

public class Client {

    public static void main(String[] args) {


        ICuadratrack diesel = new CuadraTrackDiesel(20);
        ICuadratrack especial = new CuadratrackEspecial(46);
        ICuadratrack gasolina = new CuadratrackGasolina(15);

        ICuadratrack electrico = new Adapter(new CuadratrackElectrico(13));

        diesel.llenarGasolina();
        especial.llenarGasolina();
        gasolina.llenarGasolina();
        electrico.llenarGasolina();

        System.out.println(diesel.getCombustible());
        System.out.println(especial.getCombustible());
        System.out.println(gasolina.getCombustible());
        System.out.println(electrico.getCombustible());
    }
}
