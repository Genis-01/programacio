package tema9.marvel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import herramientas.*;

public class Test {
    static ArrayList<Personaje> personajes = new ArrayList<Personaje>();
    static List<Superpoder> superpoderes = new ArrayList<Superpoder>();
    static Map<Personaje, ArrayList<Superpoder>> supereroe = new HashMap<Personaje, ArrayList<Superpoder>>();
    public static void main(String[] args) {

        Interfaces.cls();

        // personajes.add(new Personaje("Tony Stark", "Ironman"));
        // personajes.add(new Personaje("Peter Parker", "Spiderman"));
        // personajes.add(new Personaje("Bruce Banner", "Hulk"));

        // Funciones.escribirFichero(personajes, "RestoDeTemas\\src\\tema9\\marvel\\personajes.data");
        // System.out.println(1);
        personajes = Funciones.leerFichero("RestoDeTemas\\src\\tema9\\marvel\\personajes.data");
        System.out.println(1);
        
    }
}
