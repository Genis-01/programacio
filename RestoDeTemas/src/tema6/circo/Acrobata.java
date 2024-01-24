package tema6.circo;

public class Acrobata extends ArtistaCirco{

    String especialidad;

    public Acrobata(String nombre, int edad, TipoActuacion tipoActuacion, String especialidad) {
        super(nombre, edad, tipoActuacion);
        this.especialidad = especialidad;
    }

    @Override
    public void realizarActuacion() {
        System.out.println("realiza " + this.especialidad);
    }

    @Override
    public String toString() {
        return super.toString() + "especialidad " + this.especialidad;
        
    }



}
