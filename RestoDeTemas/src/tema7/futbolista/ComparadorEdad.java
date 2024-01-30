package tema7.futbolista;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<Futbolista> {
    
    //craa un comparador para edad
    public int compare(Futbolista futbolista1, Futbolista futbolista2){
        return futbolista1.edad - futbolista2.edad;
    }
}
