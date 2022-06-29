package ejercicios.ej1;

public class Visitor implements IVisitor {

    public String nombre;
    public double montoDinero;
    public String ci;

    public Visitor(String nombre, double montoDinero, String ci) {

        this.nombre = nombre;
        this.montoDinero = montoDinero;
        this.ci = ci;
    }

    @Override
    public void visitLaPaz(LaPaz laPaz, double cantidad) {
        if (cantidad > montoDinero) {
            System.out.println("No hay suficiente dinero para visitar La Paz");
        } else {
            montoDinero = montoDinero - cantidad;
            System.out.println("Visitando La Paz, se gasto " + cantidad + "bs y ahora se tiene " + montoDinero + "bs");
        }
    }

    @Override
    public void visitCochabamba(Cochabamba cochabamba, double cantidad) {
        if (cantidad > montoDinero) {
            System.out.println("No hay suficiente dinero para visitar Cochabamba");
        } else {
            montoDinero = montoDinero - cantidad;
            System.out.println("Visitando Cochabamba, se gasto " + cantidad + "bs y ahora se tiene " + montoDinero + "bs");
        }
    }

    @Override
    public void visitSantaCruz(SantaCruz santaCruz, double cantidad) {
        if (cantidad > montoDinero) {
            System.out.println("No hay suficiente dinero para visitar Santa Cruz");
        } else {
            montoDinero = montoDinero - cantidad;
            System.out.println("Visitando Santa Cruz, se gasto " + cantidad + "bs y ahora se tiene " + montoDinero + "bs");
        }
    }
}
