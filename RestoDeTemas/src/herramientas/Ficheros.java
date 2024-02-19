package herramientas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ficheros {

    public static String leer(String ruta) {

        //declara el file reader y buffered reader
        FileReader fr = null;
        BufferedReader br = null;

        //declara un string para guardar el contenido del fichero
        String contenidoFichero = "";

        //lee el fichero y lo guarda en una string
        try {
            //inicia el file reader y buffered reader con el fichero
            fr = new FileReader(ruta);
            br = new BufferedReader(fr);
            String linea = br.readLine();

            //lee y guarda en el string todas las lineas
            while (linea != null) {

                contenidoFichero = contenidoFichero + linea + "\n";
                linea = br.readLine();

            }
            fr.close();
            //devuelve un string con el contenido del fichero
            return contenidoFichero;
        //si da algun error lo muestra mor terminal y devuelve null
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    
    public static String leerLinea(String ruta, int numeroLinea) {
        FileReader fr = null;
        BufferedReader br = null;
        String contenidoLinea = "";
        

        try {
            fr = new FileReader(ruta);
            br = new BufferedReader(fr);
            
            for (int i = 0; i < numeroLinea -1 ; i++) {
                br.readLine();
            }

            contenidoLinea = br.readLine();

            fr.close();
            return contenidoLinea;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void escribir(String ruta, String contenido) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(ruta));
            for (int i = 0; i < contenido.length(); i++) {
                bw.write(contenido.charAt(i));
               
            }
            bw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
