package practica_1;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        String entrada;
        char letra; // declara variables

        Scanner sc = new Scanner(System.in);

        System.out.println("pon una letra");
        entrada = sc.nextLine(); // pide una letra y guarda el input

        entrada = entrada.toLowerCase(); // canbia la entrada a minusculas para no tener q hacer tantas comprobaciones

        letra = entrada.charAt(0); // guarda la primera letra de la entrada en la variable letra

        if (1 == entrada.length() && letra >= 97 && letra <= 122) { // comprueba si la entrada es un solo caracter y si
                                                                    // ese caracter es una letra

            switch (letra) {
                case 'a', 'e', 'i', 'o', 'u' -> {
                    System.out.println("es vocal");
                }

                default -> {
                    System.out.println("es consonant");
                } // si es una letra comprueba si es una vocal o una consonante y inprime lo q es
            }
        } else {
            System.out.println("el input no es corecte"); // si no, avisa de que el valor de la entrada no es correcto
        }

        sc.close();

    }

}
