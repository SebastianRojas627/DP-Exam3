package ejercicios.ej4;

public class User {

    public String nombre;
    public String pwd;
    public int id;

    public User(String nombre, String pwd, int id) {
        this.nombre = nombre;
        this.pwd = pwd;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
