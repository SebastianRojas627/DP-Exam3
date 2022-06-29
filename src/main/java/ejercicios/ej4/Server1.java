package ejercicios.ej4;

import java.util.HashMap;
import java.util.Map;

public class Server1 implements IServidores{

    public Map<Integer, User> users = new HashMap();
    public String nombre = "Servidor Primos";

    public Server1() {}

    @Override
    public Map<Integer, User> getUsers() {
        return users;
    }

    @Override
    public void addUser(User user) {
        users.put(user.getId(), user);
        System.out.println("Usuario " + user.getNombre() + " registrado");
    }

    @Override
    public void login(User user) {
        users.get(user.id);
        System.out.println("Usuario " + user.getNombre() + " correctamente");
    }
}
