package tema3;


import java.util.Arrays;

public class primitiva {
    public static void main(String[] args) {
        int apuesta[] = { 4, 24, 26, 21, 32, 1 };
        int combinacionGanadora[] = { 4, 23, 46, 21, 32, 1 };
        int aciertos = 0;
        Arrays.sort(apuesta);
        Arrays.sort(combinacionGanadora);

        for (int i = 0; i <= combinacionGanadora.length - 1; i++) {
            if (Arrays.binarySearch(apuesta, combinacionGanadora[i]) >= 0) {
                aciertos++;
            }

        }
        System.out.println(aciertos);
    }

}