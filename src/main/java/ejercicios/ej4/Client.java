package ejercicios.ej4;

public class Client {

    public static void main(String[] args) {

        IServidores regular = new Server2();
        IServidores primos = new Server1();

        IServidores proxy = new Proxy(primos, regular);

        User u1 = new User("Diego", "hola", 1);
        User u2 = new User("Manuel", "perro", 2);
        User u3 = new User("Ricardo", "gato", 3);
        User u4 = new User("Sebas", "case", 4);
        User u5 = new User("Mauricio", "casa", 5);
        User u6 = new User("Rodrigo", "mundo", 6);

        proxy.addUser(u1);
        proxy.addUser(u2);
        proxy.addUser(u3);
        proxy.addUser(u4);
        proxy.addUser(u5);
        proxy.addUser(u6);

        proxy.login(3, "gato");
        proxy.login(4, "case");
        proxy.login(1, "sdghs");

    }
}
