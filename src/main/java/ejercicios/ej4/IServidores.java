package ejercicios.ej4;

import java.util.Map;

public interface IServidores {

    void addUser(User user);

    void login(User user);

    Map<Integer, User> getUsers();
}
