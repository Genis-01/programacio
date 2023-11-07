package practica_4_3;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        int n;
        int j;
        


        Scanner sc = new Scanner(System.in);

        System.out.println("pon la medida del triangulo");
        n = sc.nextInt();   //pide el tamaño del triangulo
        
        j=n;
        for (int i = 0; i < n; i++) {
            
            for (int k = 0; k < j; k++) {
                System.out.print("*");
            }
            j--;
            System.out.println();
        } //crea el triangulo

        sc.close();
    }

} 