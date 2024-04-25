import java.io.Serializable;

public class Jugador implements IPersona , Serializable {
    String dni;
    String nombre;
    int edad;
    Posicion posicion;
    public Jugador(String dni, String nombre, int edad, Posicion posicion) {
        this.dni = dni;
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

    @Override
    public String toString() {
        String result;
        result = this.dni + " " + this.nombre + " " + this.edad + " " + this.posicion;
        return result;
    }

}
