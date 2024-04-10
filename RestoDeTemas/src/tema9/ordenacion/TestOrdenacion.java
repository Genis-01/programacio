package tema9.ordenacion;

// import java.util.Set;
// import java.util.TreeSet;

public class TestOrdenacion {

    public static void main(String[] args) {
        // Set<Humano> p = new TreeSet<Humano>();

        // p.add(new Humano("pablo", "sachez", 20));


    }



class Humano implements Comparable<Humano>  {

    private String nombre;
    public String apellido;
    public int edad;

    

    public Humano(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public int compareTo(Humano o) {

        if (this.nombre.compareTo(o.nombre) == 0) {
            return this.apellido.compareTo(o.apellido);
        }
        else{
            return this.nombre.compareTo(o.nombre);
        }
        

    }

    @Override
    public String toString() {
        
        return "nombre: " + nombre + ", apellido; "+ apellido + ", edad: " + edad;
    }



    
}
}
