package tema6.herencia;

public class persona {

    private String nombre;
    protected int edad;
    public double estatura;
    double peso;

    public persona() {}
    public persona(String nombre, int edad, double estatura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("peso: " + peso);
    }

    
    public String toString() {
        return nombre + " " + edad;
    }
}



/**
 * Empleado
 */

