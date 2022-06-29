package ejercicios.ej4;

import java.util.Map;

public interface IServidores {

    void addUser(User user);

    void login(int id, String pwd);

    Map<Integer, User> getUsers();
}
