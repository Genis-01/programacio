package tema9.recetas;

public class Ingrediente {

    
    String nombre;
    Double precio;
    
    public Ingrediente(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " --> " + precio;
    }

    

    
}
