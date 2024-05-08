package tema8.DatosPersona;

import herramientasOld.*;

public class Datostxt {
    
    public static void main(String[] args) {
        String nombre = "genis";
        String edad = "19";

        Ficheros.escribir("RestoDeTemas\\src\\tema8\\DatosPersona\\prueba.txt", nombre + edad);
        
    }


}
