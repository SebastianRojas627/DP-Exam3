package ejercicios.ej1;

public interface IVisitor {

    void visitLaPaz(LaPaz laPaz, double cantidad);

    void visitCochabamba(Cochabamba cochabamba, double cantidad);

    void visitSantaCruz(SantaCruz santaCruz, double cantidad);
}
