package guerra_de_barcos.barcos1_0;

public abstract class Barco implements IBarco{
    //cra los atributos necesarios
    String nombre;
    String casillas [];

    //inicia barco con tosos los atributos
    public Barco(String nombre, String[] casillas) {
        this.nombre = nombre;
        this.casillas = casillas;
    }

    public abstract String obtenerNombre();

    public abstract String [] obtenerCasillas();

    //muestra toda la informacion en un String
    @Override
    public String toString() {
        return "Nombre: " + nombre + "/ casillas: " + casillas;
    }
}
