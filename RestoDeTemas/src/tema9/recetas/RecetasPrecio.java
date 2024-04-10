package tema9.recetas;

import java.util.Comparator;

public class RecetasPrecio implements Comparator<Receta>{

    @Override
    public int compare(Receta o1, Receta o2) {
        return  Double.compare(o1.getPrecio(), o2.getPrecio());
    };

}