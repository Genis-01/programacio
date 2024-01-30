package tema7.futbolista;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Futbolista> {
    
    //craa un comparador para nombre
    public int compare(Futbolista futbolista1, Futbolista futbolista2){
        return futbolista1.nombre.compareTo(futbolista2.nombre);
    }
}
