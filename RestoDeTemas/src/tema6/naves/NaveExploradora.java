package tema6.naves;

public class NaveExploradora extends NaveEspacial {

    //declara los atributos
    TiposPlaneta tiposPlaneta;

    //constructor
    public NaveExploradora(String nombre, int plazas, TiposPlaneta tiposPlaneta) {
        super(nombre, plazas);
        this.tiposPlaneta = tiposPlaneta;
    }

    //esta clase hanuncia que la nave ha despegado y muestra de que tipo es el planeta al que se dirige
    public void despegar() {
        System.out.println("la nave " + this.nombre + " ha despegado hacia un planeta de tipos; " + this.tiposPlaneta);
    }

    @Override
    //sobrescribe el toString de la nave espacial para añadir el tipo de planeta
    public String toString() {
        return "nombre: " + this.nombre + " /plazas: " + this.plazas + " /numero de armas: " + this.tiposPlaneta;
    }
}
