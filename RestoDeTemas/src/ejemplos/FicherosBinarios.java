package ejemplos;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import tema5.Persona;
import tema9.marvel.Personaje;

public class FicherosBinarios {

    // Método para escribir una cadena en un archivo binario
    public static void escribirFichero(String aGuardar/* el contenido a guardar va aqui */, String fichero) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(aGuardar); // Escribe la cadena en el archivo
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Muestra un mensaje en caso de error
        }
    }


    public static String /* tipo a leer */ leerFichero(String fichero) {
        String cadena = ""; // variable para guardar el contenido del fichero
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            try {
                cadena = (String /* tipo a leer */ ) ois.readObject(); // Lee la cadena desde el archivo
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage()); // Muestra un mensaje en caso de error de clase no encontrada
            }
        } catch (IOException e) {
            System.out.println(e.getMessage()); // Muestra un mensaje en caso de error de E/S
        }
        return cadena; // Devuelve la cadena leída desde el archivo
    }
    public static List<Personaje> leerArchivoBinario(String fichero){
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
        return personas;
    }


}
