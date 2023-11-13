package practica_4_6;

import java.util.*;


public class activitat_4_6 {

    public static void main(String[] args) {

        int numero;
        double resultadoRaiz;

        numero = PideYScaneaint("escribe un numero");

        resultadoRaiz = Math.sqrt(numero);

        System.out.println(resultadoRaiz);

    }

    public static String CajaDeHastag(String mensaje) {
        String hastag = "";
        for (int i = (mensaje.length() + 4); i > 0; i--) {
            hastag += "#";
        }
        return hastag + "\n# " + mensaje + " #\n" + hastag;
    }

    public static int PideYScaneaint(String Mensaje) {// muestra por pantalla un mensaje y devuelve el input del usuario
        // (un numero)
        int numero;
        System.out.println(Mensaje);
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            cls();
            System.out.println("        *********");
            System.out.println("        * ERROR *");
            System.out.println("***************************");
            System.out.println("* el input no es correcto *");
            System.out.println("***************************");
            System.out.println("\n" + Mensaje);
            sc.nextLine();
        }
        numero = sc.nextInt();
        cls();
        sc.close();
        return numero;
    }

    public static void cls() {// limpia la consola
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }

}
