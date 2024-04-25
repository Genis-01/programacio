package tema9.examenCorreccion;

public class Jugador implements IPersona {


    private final String DNI;
    private String nombre;
    private int edad;
    private Posicion posicion;


    

    public Jugador(String DNI, String nombre, int edad, Posicion posicion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }

    @Override
    public void setNombre(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNombre'");
    }

    @Override
    public int getEdad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEdad'");
    }

    @Override
    public void setEdad(int edad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEdad'");
    }

    public String getDNI() {
        return DNI;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }


    @Override
    public String toString() {
        return "Nombre: "+ this.nombre + ", edad: " + this.edad + ", posicion: " + this.posicion;
    }
}
