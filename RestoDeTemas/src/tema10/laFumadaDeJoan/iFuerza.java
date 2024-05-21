package tema10.laFumadaDeJoan;

import numeros.*;

import java.util.ArrayList;

public interface iFuerza {
    static int getNivelMidiclorianos() {
        return 0;
    }

    static void setNivelMidiclorianos() {

    }

    default int estableceNivelMidiclorianos() {
        return Random.numeroInteger(10000, 30000);
         }

         static String getColorSable(){
            String sable;

             ArrayList<String> coloresJedi = new ArrayList<>();
             coloresJedi.add("verde");
             coloresJedi.add("azul");
             coloresJedi.add("morado");
             ArrayList<String> coloresSeth = new ArrayList<>();
             coloresSeth.add("rojo");

             coloresJedi.

            return sable
         }
}
