package tema9.marvel;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Funciones {

    public static ArrayList<Personaje> leerFichero(String fichero) {
        ArrayList<Personaje> personajes = new ArrayList<Personaje>(); 
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            try {
                personajes = (ArrayList<Personaje>) ois.readObject(); 
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return personajes; 
    }
}
