package tema3;

public class teoria {

    public static void main(String[] args) {

        // tipo[] nombreArray;
        // tipo nombreArray[];

        // int[] numeros = new int[5];

        // numeros[0] = 3;
        // numeros[1] = 0;
        // numeros[2] = 100;
        // numeros[3] = -12;
        // numeros[4] = 1;


        // int datos[] = {1, -1, 0, 23};

        int[][] matriz = new int[3][4];



        for (int[] padre : matriz) {
            for (int hijo : padre) {
                System.out.println(hijo);
            }
        }
    }
    
    public static void llenarArrayBidimensional(int[][] arrayBidimensional){
    for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[0].length; j++) {
                arrayBidimensional[i][j]=i*j;
                System.out.println(arrayBidimensional[i][j]);
            }
        }
    }

}
