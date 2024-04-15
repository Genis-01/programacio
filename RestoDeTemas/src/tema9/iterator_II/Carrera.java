package tema9.iterator_II;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class Carrera {

    Set<Coche> coches = new TreeSet<Coche>();

    public void anyadirCoche(String nombre, double maxvelocidad){
        coches.add(new Coche(nombre, maxvelocidad));
    }

    public void eliminarCoche(String nombre){
        Iterator<Coche> it = coches.iterator();
        while (it.hasNext()) {
            if (it.next().nombre.equals(nombre)) {
                it.remove();
            }
        }
    }

    public Coche getGanador(){
        Iterator<Coche> it = coches.iterator();
        Coche ganador = new Coche("", 0.0);
        while (it.hasNext()) {
            Coche coche = it.next();
            if (coche.maxvelocidad > ganador.maxvelocidad) {
                ganador = coche;
            }
        }

        return ganador;
    }

    

}
