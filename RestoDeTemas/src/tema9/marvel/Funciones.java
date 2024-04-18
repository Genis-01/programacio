package tema9.marvel;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import tema5.Persona;





public class Funciones {
    

    public static List<Personaje> leerFichero(String fichero) {
        
        List<Personaje> personas = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            while (true) {
                Personaje persona = (Personaje) ois.readObject();
                personas.add(persona);
            }
        } catch (EOFException e) {
            // Se ha alcanzado el final del archivo
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return personas; // Devuelve la cadena leída desde el archivo
    }

    public static void escribirFichero(ArrayList<Personaje> personajess, String fichero) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(personajess); // Escribe la cadena en el archivo
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Muestra un mensaje en caso de error
        }
    }

}
