package tema9.marvel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Funciones {
    
    @SuppressWarnings("unchecked")
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

    public static void escribirFichero(ArrayList<Personaje> personajess, String fichero) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(personajess); // Escribe la cadena en el archivo
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Muestra un mensaje en caso de error
        }
    }

}
