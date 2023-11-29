package tema5.Coche;

public class coche {
    String marca = "opel";
    String matricula = "6811 GGT";
    int caballos = 65;
    int kilometraje = 1000;

    public void arrancar(){
        System.out.println("el coche ha arrancado");
    }
    public void conduce(){
        kilometraje++;
    }
    public void mostrarKilometraje(){
        System.out.println(kilometraje + " Km");
    }

}
