package tema6.animales;

public class Animal {
    double peso;
    double estatura;
    boolean hambre;

    public Animal(double peso, double estatura, boolean hambre) {
        this.peso = peso;
        this.estatura = estatura;
        this.hambre = hambre;
    }
    public void comer() {
        if (this.hambre) {
            this.hambre = false;
        }else {
            System.out.println("no tiene hambre");
        }
    }
}
