package tema6.circo;

public class Malabarista extends ArtistaCirco{

    int numPelotas;

    public Malabarista(String nombre, int edad, TipoActuacion tipoActuacion, int numPelotas) {
        super(nombre, edad, tipoActuacion);
        this.numPelotas = numPelotas;
    }

    @Override
    public void realizarActuacion() {
        System.out.println("realiza malabares con " + this.numPelotas + " pelotas");
    }

    @Override
    public String toString() {
        return super.toString() + "numero de pelotas: " + this.numPelotas;
        
    }





}
