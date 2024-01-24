package tema6.circo;

public class PallasoMalabarista extends Malabarista {

    String tipoPallaso;

    public PallasoMalabarista(String nombre, int edad, TipoActuacion tipoActuacion, int numPelotas,
            String tipoPallaso) {
        super(nombre, edad, tipoActuacion, numPelotas);
        this.tipoPallaso = tipoPallaso;
    }

    public void realizarBroma(){
        System.out.println("Me sacaron del grupo de WhatsApp de paracaidismo. Se ve que no caía bien");
    }

    @Override
    public String toString() {
        return super.toString() + "tipo de pallaso " + tipoPallaso;
    
    }
}
