package tema9.marvel;

import java.io.Serializable;

public class Personaje implements Serializable{

    String nombre;
    String alias;
    public Personaje(String nombre, String alias) {
        this.nombre = nombre;
        this.alias = alias;
    }

}
