package tema6.animales;

public class Perro extends Animal{
    String raza;
    boolean domestico;
    boolean carinyoso;

    public Perro(double peso, double estatura, boolean hambre, String raza, boolean domestico, boolean carinyoso) {
        super(peso, estatura, hambre);
        this.raza = raza;
        this.domestico = domestico;
        this.carinyoso = carinyoso;
    }
}
