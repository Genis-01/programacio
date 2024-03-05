package tema9.introduccion;

public class Cliente implements Comparable<Cliente> {
    String dni;
    String nombre;


    public Cliente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }


    @Override
    public int compareTo(Cliente o) {
        
        return this.dni.compareTo(o.dni);
    }
    public int compareToNombre(Cliente o) {
        
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        
        return "dni: " + dni + " nombre: " + nombre;
    }
}
