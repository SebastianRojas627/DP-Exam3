package ejercicios.ej5;

public class Client {

    public static void main(String[] args) {

        ICelular celular = new Apple(4, 256, "i7", 500);

        celular = new Carcasa(celular, 30);
        celular = new VidrioTemplado(celular, 50);
        celular = new MemoriaExterna(celular, 100, 128);

        celular.showInfo();
    }
}
