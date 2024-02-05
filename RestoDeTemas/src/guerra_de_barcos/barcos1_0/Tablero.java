package guerra_de_barcos.barcos1_0;

public class Tablero {
    char tablero [][] = new char [10][10];

    //inicia el tablero escribiendo un valor por defecto a todos los caracteres
    public Tablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = 'o';
            }
        }
    }
    

    
    //muestra por pantalla todo el tablero
    public void mostrar() {
        char ca = 'A';


        System.out.print("     ");
        for (int i = 1; i <= tablero.length; i++) {
            System.out.print(i +"    ");
        }

        System.out.println("\n");

        for (char[] filla : tablero) {
            System.out.print(ca +"    ");
            ca ++;

            for (char c : filla) {
                System.out.print(c + "    ");
            }

            System.out.println("\n");
        }
    }

    

}
