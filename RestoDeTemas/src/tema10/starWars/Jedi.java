package tema10.starWars;

public class Jedi {
    String nombre;
    SableLaser sableLaser;
    Boolean padawan;
    int nivelFuerza;


    public Jedi(String nombre, SableLaser sableLaser, Boolean padawan, int nivelFuerza) {
        this.nombre = nombre;
        this.sableLaser = sableLaser;
        this.padawan = padawan;
        this.nivelFuerza = nivelFuerza;
    }
}
