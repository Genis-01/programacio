package tema9.iterator_I;

public class Fruta {

    String nombre;
    Double precio;
    
    public Fruta(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Fruta: " + nombre + ", precio: " + precio;
        }
}
