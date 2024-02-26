package tema8.arrayDouble;

import java.util.Scanner;
import herramientas.*;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. escribir " + "\n" +
                "2. leer " + "\n");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    int numero;
                    double numeros[];
                    System.out.println("escribe un numero entero");
                    numero = scanner.nextInt();
                    numeros = new double[numero];
                    for (int i = 0; i < args.length; i++) {
                        System.out.println("escribe un numero");
                        numeros[i] = scanner.nextDouble();
                    }



                    FicherosBinarios.escribirFicheroArrayDuobleToObject(numeros, "patata");
                    break;
                case 2:

                    break;
            
                default:
                    break;
            }
        } while (opcion != -1);
        scanner.close();
        
        
        
    }
}
