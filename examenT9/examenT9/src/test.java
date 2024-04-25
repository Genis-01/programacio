
import java.util.Scanner;

public class test {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();

        boolean salir = false;
        while (!salir) {

            int opcion = Interfaces.menu("que quieres hacer?", new String[] { "alta Jugador", "eliminar jugador",
                    "mostrar plantilla completa", "mostrar plantilla una posicion", "salir" }, sc);

            switch (opcion) {
                case 1:
                    int dorsal = pedirDorsal();

                    Plantilla.altaJugador(app.plantilla, dorsal);
                    break;

                    case 3:
                    Plantilla.mostrar(app.plantilla);
                    break;

                    case 5:
                    app.salir();
                    salir = true;
                    break;


                default:
                    break;
            }
        }

        

        

    }

    

    

    public static int pedirDorsal() {
        int dorsal;
        System.out.println("Escribe el dorsal del jugador");
        try {

            dorsal = Integer.parseInt(sc.nextLine());
            Interfaces.cls();
            return dorsal;
        } catch (Exception e) {
            Interfaces.cls();
            System.out.println("el valor no es valido");
            return pedirDorsal();
        }
    }
}
