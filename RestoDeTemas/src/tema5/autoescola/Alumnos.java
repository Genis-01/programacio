package tema5.autoescola;

public class Alumnos {

    String nom;
    int intentsTeoric;
    int intentsPractic;
    boolean teoric;
    boolean practic;
    boolean carnet;
    Autoescuelas autoescuela;

    
    public Alumnos(String nom, Autoescuelas autoescuela ) {
        this.nom = nom;
        this.intentsTeoric = 0;
        this.intentsPractic = 0;
        this.teoric = false;
        this.practic = false;
        this.carnet = false;
        this.autoescuela = autoescuela;
    }

    public void hacerExamenPractico(){
        this.teoric = autoescuela.examenPractico(carnet);
    }
    public void hacerExamenTeorico(){
        this.practic = autoescuela.examenTeorico(carnet);
    }
    public void comprobarCarnet(){
        this.carnet = autoescuela.darCarnet(teoric, practic, carnet);
    }
    
}
