package tema6.animales;

public class Gato extends Animal{
    String raza;
    boolean domestico;
    boolean miedoso;

    public Gato(double peso, double estatura, boolean hambre, String raza, boolean domestico, boolean miedoso) {
        super(peso, estatura, hambre);
        this.raza = raza;
        this.domestico = domestico;
        this.miedoso = miedoso;
    }
}
