package guerra_de_barcos.barcos1_0;

public class Tablero {
    char tablero [][] = new char [10][10];

    public Tablero() {
        for (int i = 0; i < tablero.length -1; i++) {
            for (int j = 0; j < tablero.length -1; j++) {
                tablero[i][j] = 'o';
            }
        }
    }
    

    

    public void mostrar() {
        for (char[] filla : tablero) {
            for (char c : filla) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    

}
