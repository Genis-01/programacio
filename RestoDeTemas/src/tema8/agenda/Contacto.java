package tema8.agenda;

public class Contacto {
    String nombre;
    String numero;
    public Contacto(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return nombre + ": " + numero + "\n";

    }

}
