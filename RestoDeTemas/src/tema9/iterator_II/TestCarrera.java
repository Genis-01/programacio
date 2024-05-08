package tema9.iterator_II;



import java.util.Iterator;

import herramientasOld.*;
public class TestCarrera {
    
    static Carrera carrera = new Carrera();
    public static void main(String[] args) {
        Interfaces.cls();
        anyadirParticipantes();
        mostrarParticipantes();
        System.out.println("el ganador es: " + carrera.getGanador().nombre);

        
    }

    public static void anyadirParticipantes(){
        carrera.anyadirCoche("Opel Agila", 160);
        carrera.anyadirCoche("Toyota Corola", 0);
        carrera.anyadirCoche("Honda Civic", 250);
    }

    public static void mostrarParticipantes(){
        Iterator<Coche> it = carrera.coches.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
