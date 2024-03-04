package herramientas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FicherosBinarios {

    // Método para escribir una cadena en un archivo binario
    public static void escribirFicheroStringToObject(String cadena, String fichero) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(cadena); // Escribe la cadena en el archivo
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Muestra un mensaje en caso de error
        }
    }

    // Método para leer una cadena desde un archivo binario
    public static String leerFicheroStringToObject(String fichero) {
        String cadena = ""; // Inicializa una cadena vacía para almacenar el contenido del archivo
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            try {
                cadena = (String) ois.readObject(); // Lee la cadena desde el archivo
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage()); // Muestra un mensaje en caso de error de clase no encontrada
            }
        } catch (IOException e) {
            System.out.println(e.getMessage()); // Muestra un mensaje en caso de error de E/S
        }
        return cadena; // Devuelve la cadena leída desde el archivo
    }

    // Método para escribir un array de números de tipo Double en un archivo binario
    public static void escribirFicheroArrayDuobleToObject(Double arrayDouble[], String fichero) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(arrayDouble); // Escribe el array de números Double en el archivo
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Muestra un mensaje en caso de error
        }
    }

    // Método para escribir un array de objetos en un archivo binario
    public static void escribirFicheroArrayObjectToObject(Object arrayObjeto[], String fichero) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(arrayObjeto); // Escribe el array de objetos en el archivo
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Muestra un mensaje en caso de error
        }
    }
}

