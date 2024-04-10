package tema9.recetas;

import java.util.ArrayList;
import java.util.List;
import herramientas.*;


public class TestRecetas {

    public static void main(String[] args) {
        List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
        Interfaces.cls();


        Receta r = new Receta("macarones", 3);

        ingredientes.add(new Ingrediente("macarones", 2.5));
        ingredientes.add(new Ingrediente("almendras", 2.0));
        ingredientes.add(new Ingrediente("patatas", 1.0));

        ingredientes.sort(new IngredientesNum());
        

        for (Ingrediente ingrediente : ingredientes) {
            System.out.println(ingrediente.toString());
        }

        r.anyadirIngrediente(ingredientes, "macarones");
    }



}
