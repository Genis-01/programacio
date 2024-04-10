package tema9.recetas;

import java.util.Comparator;

public class RecetasCom implements Comparator<Receta>{

    @Override
    public int compare(Receta o1, Receta o2) {
        return  Integer.compare(o1.comenzales, o2.comenzales);
    };

}