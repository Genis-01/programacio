package tema9.iterator_II;

public class Coche implements Comparable<Coche> {
    String nombre;
    double maxvelocidad;
    
    

    public Coche() {
    }



    public Coche(String nombre, double maxvelocidad) {
        this.nombre = nombre;
        this.maxvelocidad = maxvelocidad;
    }

    @Override
    public String toString() {
        return nombre + ", " + maxvelocidad;
    }

    @Override
    public int compareTo(Coche o) {
        
        return this.nombre.compareTo(o.nombre);
    }
}
