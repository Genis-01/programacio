package tema5.autoescola;

public class Alumnos {

    // Atributos de la clase
    String nom;
    int intentsTeoric;
    int intentsPractic;
    boolean teoric;
    boolean practic;
    boolean carnet;
    Autoescuelas autoescuela;

    // Este constructor inicializa los atributos de la clase
    public Alumnos(String nom, int intentsTeoric, int intentsPractic, boolean teoric, boolean practic, boolean carnet,
            Autoescuelas autoescuela) {
        this.nom = nom;
        this.intentsTeoric = intentsTeoric;
        this.intentsPractic = intentsPractic;
        this.teoric = teoric;
        this.practic = practic;
        this.carnet = carnet;
        this.autoescuela = autoescuela;
    }

    // Este constructor inicializa los atributos de la clase, excepto el nombre
    public Alumnos(String nom, Autoescuelas autoescuela) {
        this.nom = nom;
        this.intentsTeoric = 0;
        this.intentsPractic = 0;
        this.teoric = false;
        this.practic = false;
        this.carnet = false;
        this.autoescuela = autoescuela;
    }

    // Este método hace el examen práctico y actualiza los atributos de la clase
    public void hacerExamenPractico() {
        intentsPractic++;
        this.practic = autoescuela.examenPractico(this.teoric, this.practic, this.carnet);

    }

    // Este método hace el examen teórico y actualiza los atributos de la clase
    public void hacerExamenTeorico() {
        System.out.println("hacer examen teorico");
        intentsTeoric++;
        this.teoric = autoescuela.examenTeorico(this.teoric, this.carnet);
    }

    // Este método comprueba si el estudiante tiene el carnet y actualiza los atributos de la clase
    public void comprobarCarnet() {
        this.carnet = autoescuela.darCarnet(this.teoric, this.practic, this.carnet);
    }

    // Este método muestra los atributos de la clase
    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nom);
        System.out.println("Intentos Teorico: " + this.intentsTeoric);
        System.out.println("Intentos Practico: " + this.intentsPractic);
        System.out.println("Teorico: " + this.teoric);
        System.out.println("Practico: " + this.practic);
        System.out.println("Carnet: " + this.carnet);

    }
}