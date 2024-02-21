package tema8.agenda;

public class TestAgenda {


    public static void main(String[] args) {
        Agenda a = new Agenda();
        a.nuevoContacto("Julen", "644809334");
        System.out.println(a.toString());
        a.salir();
    }
}
