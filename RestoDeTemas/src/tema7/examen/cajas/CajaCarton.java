package tema7.examen.cajas;

public class CajaCarton extends Caja{

    public CajaCarton(double ancho, double largo, double alto, String etiqueta) {
        super(ancho, largo, alto, Unidades.CM , etiqueta);
    }

    @Override
    public double getVolumen() {
        return super.getVolumen() * 0.8;
    }

    public double getSuperficie() {
        double caras12 = this.alto * this.ancho;
        double caras34 = this.alto * this.largo;
        double caras56 = this.largo * this.ancho;

        return caras12 + caras34 + caras56;
    }

    @Override
    public String toString() {
        return super.toString() + " /superficie: " + this.getSuperficie() + this.unidad + "2";
    }
    
    
    
}
