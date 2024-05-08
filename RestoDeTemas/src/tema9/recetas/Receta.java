package tema9.recetas;

import java.util.List;
import java.util.ArrayList;
import herramientasOld.*;

public class Receta {

    String nombre;
    int comenzales;
    
    List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

    public Receta(String nombre, int comenzales) {
        this.nombre = nombre;
        this.comenzales = comenzales;
    }



    public void anyadirIngrediente(List<Ingrediente> despensa, String ingrediente){
        boolean encontrado = false;
        for (Ingrediente in : despensa) {
            if (in.nombre.equals(ingrediente)) {
                this.ingredientes.add(in);
                encontrado = true;
            }
        }
        if (!encontrado) {
            Interfaces.cls();
            System.out.println("el ingrediente no existe");
        }
    }

    public void eliminarIngrediente(String ingrediente){

        boolean encontrado = false;
        for (Ingrediente in : ingredientes) {
            if (in.nombre.equals(ingrediente)) {
                this.ingredientes.remove(in);
                encontrado = true;
            }
        }
        if (!encontrado) {
            Interfaces.cls();
            System.out.println("el ingrediente no esta en esta receta");
        }
    }

    public Double getPrecioPorPersona(){
        Double precio = 0.0;
        for (Ingrediente ingrediente : this.ingredientes) {
            precio =+ ingrediente.precio;
        }
        return precio;
    }
    
    public Double getPrecio(){
        return this.getPrecioPorPersona() * this.comenzales;
    }

    public int getNumIngredientes(){
        return ingredientes.size();
    }
        

}
