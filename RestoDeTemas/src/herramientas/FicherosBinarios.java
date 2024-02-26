package herramientas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class FicherosBinarios {


    public static void escribirFicheroStringToObject(String cadena, String fichero){
        

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(cadena);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String leerFicheroStringToObject(String fichero) {
        String cadena = "";
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            try {
                cadena = (String)ois.readObject();
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }


        } catch (IOException e) {
           System.out.println(e.getMessage());
        }
        return cadena;
    }

    public static void escribirFicheroArrayDuobleToObject(Double arrayDouble[], String fichero){
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(arrayDouble);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void escribirFicheroArrayObjectToObject(Object arrayObjeto[], String fichero){
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(arrayObjeto);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    


}
