package arrays2;

import java.util.Scanner;
import java.util.Arrays;

public class arrays2 {
    public static void main(String[] args) {

        String opcion;
        

        String[] personajes = {
                "Luke Skywalker",
                "Darth Vader",
                "Princesa Leia",
                "Han Solo",
                "Yoda"
        };
        for (String personaje : personajes) {
            System.out.println(personaje);
        }
        System.out.println("estos son los personajes en la lista quieres añadir alguno mas? (s/n)");

        Scanner sc = new Scanner(System.in);
        do {

            opcion = sc.nextLine();

            if (opcion.charAt(0) != 's' && opcion.charAt(0) != 'n') {
                cls();
                System.out.println("el imput es incorecto");
                System.out.println("quieres añadir alguno mas? (s/n)");
            }
        } while (opcion.charAt(0) != 's' && opcion.charAt(0) != 'n');

        while (opcion.charAt(0) == 's') {
            personajes = Arrays.copyOf(personajes, personajes.length + 1);
            personajes[personajes.length - 1] = sc.nextLine();
            
            System.out.println("quieres añadir alguno mas? (s/n)");
            do {

                opcion = sc.nextLine();

                if (opcion.charAt(0) != 's' && opcion.charAt(0) != 'n') {
                    cls();
                    System.out.println("el imput es incorecto");
                    System.out.println("quieres añadir alguno mas? (s/n)");
                }
            } while (opcion.charAt(0) != 's' && opcion.charAt(0) != 'n');
        }
        for (String personaje : personajes) {
                System.out.println(personaje);

            }

        sc.close();
    }

    public static String CajaDeHastag(String mensaje) {
        String hastag = "";
        for (int i = (mensaje.length() + 4); i > 0; i--) {
            hastag += "#";
        }
        return hastag + "\n# " + mensaje + " #\n" + hastag;
    }

    public static void cls() {// limpia la consola
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }

}
