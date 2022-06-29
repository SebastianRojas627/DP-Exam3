package ejercicios.ej1;

public class Client {

    public static void main(String[] args) {

        IVisitor visitor = new Visitor("Federico", 2500, "847951");

        LaPaz laPaz = new LaPaz();
        Cochabamba cochabamba = new Cochabamba();
        SantaCruz santaCruz = new SantaCruz();

        laPaz.accept(visitor);
        cochabamba.accept(visitor);
        santaCruz.accept(visitor);
    }
}
