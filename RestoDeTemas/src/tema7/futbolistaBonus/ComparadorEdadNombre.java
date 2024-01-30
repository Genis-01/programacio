package tema7.futbolistaBonus;

import java.util.Comparator;

public class ComparadorEdadNombre implements Comparator<Futbolista> {
    
    //craa un comparador para edad y nombre
    public int compare(Futbolista futbolista1, Futbolista futbolista2){
        if (futbolista1.edad == futbolista2.edad) {
            return futbolista1.nombre.compareTo(futbolista2.nombre);
        }else{
            return futbolista1.edad - futbolista2.edad;
        }
    }
}
