package ejercicios.ej4;

import java.util.HashMap;
import java.util.Map;

public class Server2 implements IServidores{

    public Map<Integer, User> users = new HashMap();
    public String nombre = "Servidor regular";

    public Server2() {}

    @Override
    public Map<Integer, User> getUsers() {
        return users;
    }

    @Override
    public void addUser(User user) {
        users.put(user.getId(), user);
        System.out.println("Usuario registrado");
    }

    @Override
    public void login(User user) {
        users.get(user.id);
        System.out.println("Usuario logeado correctamente");
    }
}
