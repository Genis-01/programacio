package tema9.recetas;

import java.util.Comparator;

public class IngredientesAlfa implements Comparator<Ingrediente> {

    @Override
    public int compare(Ingrediente o1, Ingrediente o2) {
        return o1.nombre.compareTo(o2.nombre);
    }

    
}
