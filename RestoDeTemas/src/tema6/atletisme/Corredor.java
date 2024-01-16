package tema6.atletisme;

public class Corredor extends Atleta{
    int velocidad;

    
    public Corredor(String nombre, int edad, int velocidad) {
        super(nombre, edad);
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString() + "\nvelocidad: " + velocidad;
    }

    
}
