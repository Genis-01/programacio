package tema8.clientes;

import java.io.Serializable;

public class Cliente implements Serializable {
    String dni;
    String nombre;
    String numero;

    public Cliente(String dni, String nombre, String numero) {
        this.dni = dni;
        this.nombre = nombre;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + ", nombre: " + nombre + ", numero: " + numero;
    }


}
