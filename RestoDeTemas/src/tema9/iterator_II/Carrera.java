package tema9.iterator_II;

import java.util.Set;
import java.util.TreeSet;

public class Carrera {

    Set<Coche> coches = new TreeSet<Coche>();

    public void anyadirCoche(String nombre, double maxvelocidad){
        coches.add(new Coche(nombre, maxvelocidad));
    }

    public void eliminarCoche(String nombre){
        
    }

}
