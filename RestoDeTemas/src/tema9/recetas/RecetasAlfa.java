package tema9.recetas;

import java.util.Comparator;

public class RecetasAlfa implements Comparator<Receta> {

    @Override
    public int compare(Receta o1, Receta o2) {
        return o1.nombre.compareTo(o2.nombre);
    }

    
}