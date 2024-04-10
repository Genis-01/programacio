package tema9.recetas;

import java.util.Comparator;

public class IngredientesNum implements Comparator<Ingrediente>{

    @Override
    public int compare(Ingrediente o1, Ingrediente o2) {
        return  Double.compare(o1.precio, o2.precio);
    };

}
