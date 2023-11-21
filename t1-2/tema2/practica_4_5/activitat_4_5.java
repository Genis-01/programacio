package practica_4_5;

import java.util.Scanner;

public class activitat_4_5 {
    public static void main(String[] args) {
        cls();
        System.out.println(Conversion(PideYScaneaNumeroBinario(CajaDeHastag("escribe un numero en binario"))));
    }

    public static double Conversion(String numero) {
        double decimal = 0;
        for (int i = numero.length() - 1; i >= 0; i--) {
            if (numero.charAt(i) == '1') {
                decimal = decimal + Math.pow(2, numero.length() - 1 - i);
            }
        }
        return decimal;

    }

    public static String PideYScaneaNumeroBinario(String Mensaje) {// muestra el mensaje y devuelve un string con el
                                                                   // numero binario
        String numero;
        System.out.println(Mensaje);
        Scanner sc = new Scanner(System.in);
        numero = sc.nextLine();
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

    public static String CajaDeHastag(String mensaje) {
        String hastag = "";
        for (int i = (mensaje.length() + 4); i > 0; i--) {
            hastag += "#";
        }
        return hastag + "\n# " + mensaje + " #\n" + hastag;
    }

}
