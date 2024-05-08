package tema8.lectorUsusrio;

import java.io.File;
import java.util.Scanner;
import herramientasOld.Ficheros;

public class ElegirFichero {

     public static void main(String[] args) {

        //crea una variable de tipo String para guardar el nombre del fichero
        String nombreFichero; 

        //pide al usuario el nombre del fichero
        //------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("como se llama el fichero?");
        nombreFichero = sc.nextLine();
        sc.close();
        //------------------------------------------------------------------------------


        File fichero = new File("RestoDeTemas\\src\\tema8\\lectorUsusrio\\" + nombreFichero);
        if (nombreFichero.length() != 0) {

            if (fichero.exists()) {
                System.out.println(Ficheros.leer("RestoDeTemas\\src\\tema8\\lectorUsusrio\\" + nombreFichero));
            }else{
                System.out.println(Ficheros.leer("RestoDeTemas\\src\\tema8\\lectorUsusrio\\prueba.txt"));
            }
        } else {
            System.out.println(Ficheros.leer("RestoDeTemas\\src\\tema8\\lectorUsusrio\\prueba.txt"));
        }
    }
}
