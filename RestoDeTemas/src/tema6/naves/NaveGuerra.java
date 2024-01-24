package tema6.naves;

public class NaveGuerra extends NaveEspacial{

    //declara los atributos
    int numArmas;

    //constructor
    public NaveGuerra(String nombre, int plazas, int numArmas) {
        super(nombre, plazas);
        this.numArmas = numArmas;
    }

    //esta clase hanuncia que la nave ha despegado y muestra quantas armas tiene
    public void despegar() {
        System.out.println("la nave " + this.nombre + " ha despegado con " + this.numArmas + " armas" );
    }

    @Override
    //sobrescribe el toString de la nave espacial para añadir el numero de armas
    public String toString() {
        return "nombre: " + this.nombre + " /plazas: " + this.plazas + " /numero de armas: " + this.numArmas;
    }
}
