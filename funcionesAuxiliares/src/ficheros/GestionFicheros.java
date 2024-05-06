package ficheros;

import java.io.*;
import java.util.ArrayList;


public class GestionFicheros {

    public static ArrayList<String> leerFicheroBinario(String fichero) {
        ArrayList<String> cadenas = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {

                cadenas = (ArrayList)ois.readObject();

        } catch (EOFException e) {
        }catch (IOException |ClassNotFoundException e){
            System.out.println("Error al leer el fichero ");
        }
        return cadenas;
    }

    public static void escribirFicheroBinario(String fichero, ArrayList<String> cadenas) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
                oos.writeObject(cadenas);
        }catch (IOException e){
            System.out.println("Error al escribir el fichero ");
        }
    }
}
