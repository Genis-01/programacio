
import java.io.Serializable;

import java.util.Map;
import java.util.Scanner;

public class Plantilla implements Serializable {

    
    

    static Scanner sc = new Scanner(System.in);

    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        plantilla.put(dorsal, pediJugador());
    }

    static void eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        plantilla.remove(dorsal);
    }

    static void mostrar(Map<Integer, Jugador> plantilla) {
        for (Jugador valor  : plantilla.values()) {
            System.out.println(valor.toString());
        }
    }

    static void mostrar(Map<Integer, Jugador> plantilla, String posicion) {
        

    }

    static void editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {

    }

    static Jugador pediJugador() {
        String nombre;
        String dni;
        int edad;
        Posicion posicion;

        Interfaces.cls();
        System.out.println("Escribe le nombre del jugador");
        nombre = sc.nextLine();
        Interfaces.cls();
        System.out.println("Escribe le dni del jugador");
        dni = sc.nextLine();
        edad = pedirEdad();
        posicion = pedirPosicion();

        return new Jugador(dni, nombre, edad, posicion);

    }

    static int pedirEdad() {
        int edad;
        System.out.println("Escribe la edad del jugador");
        try {

            edad = Integer.parseInt(sc.nextLine());
            Interfaces.cls();
            return edad;
        } catch (Exception e) {
            Interfaces.cls();
            System.out.println("el valor no es valido");
            return pedirEdad();
        }
    }

    static Posicion pedirPosicion() {
        int opcion;

        opcion = Interfaces.menu("en que posicion juega el jugador:",
                new String[] { "portero", "defensa", "centrocampista", "delantero" }, sc);

        switch (opcion) {
            case 1:
                return Posicion.PORTERO;

            case 2:
                return Posicion.DEFENSA;

            case 3:
                return Posicion.CENTROCAMPISTA;

            case 4:
                return Posicion.DELANTERO;

            default:
                System.out.println("la posicion no es valida");
                return pedirPosicion();
        }
    }

    

}
