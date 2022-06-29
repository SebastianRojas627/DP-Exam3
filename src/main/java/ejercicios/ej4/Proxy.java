package ejercicios.ej4;

import java.util.Map;

public class Proxy implements IServidores {

    private IServidores primos;
    private IServidores regular;

    public Proxy(IServidores primos, IServidores regular) {

        this.primos = primos;
        this.regular = regular;
    }

    static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    @Override
    public void addUser(User user) {
        if (isPrime(user.getId()) && primos.getUsers().get(user.getId()) == null) {
            primos.addUser(user);
            System.out.println("ID primo, usuario añadido a servidor de primos");
        } else {
            regular.addUser(user);
            System.out.println("ID NO primo, usuario añadido a servidor regular");
        }
    }

    @Override
    public void login(User user) {
        if (isPrime(user.getId())) {
            if(primos.getUsers().get(user.getId()).getPwd().equals(user.getPwd())){
                primos.login(user);
            } else {
                System.out.println("Contraseña incorrecta");
            }
        } else {
            if(regular.getUsers().get(user.getId()).getPwd().equals(user.getPwd())){
                regular.login(user);
            } else {
                System.out.println("Contraseña incorrecta");
            }
        }
    }

    @Override
    public Map<Integer, User> getUsers() {
        return null;
    }
}
