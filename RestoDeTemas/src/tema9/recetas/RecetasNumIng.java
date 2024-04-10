package tema9.recetas;

import java.util.Comparator;

public class RecetasNumIng implements Comparator<Receta>{

    @Override
    public int compare(Receta o1, Receta o2) {
        return  Integer.compare(o1.getNumIngredientes(), o2.getNumIngredientes());
    };

}
