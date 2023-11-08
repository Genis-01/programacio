package practica_4_4;

import java.util.Scanner;

public class activitat_4_4 {
    public static void main(String[] args) {
        cls();
        System.out.println(DeDecimalABinario(PideYScaneaint("escribe un numero")));// pide un numero lo convierte a
                                                                                   // binario y lo muestra por pantalla
    }

    public static String DeDecimalABinario(int Cociente) {// cambia de decimal a binario
        String NumeroBinario = "";// declara las variables necesarias

        if (Cociente > 1) {

            while (Cociente != 0 && Cociente != 1) {
                NumeroBinario = divisionResto(Cociente) + NumeroBinario;
                Cociente = divisionCociente(Cociente);
            }
            NumeroBinario = Cociente + NumeroBinario; // hace la conversion, pero al hacerla el numero en
                                                                    // birario queda invertido

            return NumeroBinario; // devuelve el numero en binario
        } else if (Cociente == 1) {
            return "1";
        } else {
            return "0";
        } // si el numero es 1 o 0 se salta toda la conversion

    }

    public static int divisionCociente(int dividendo) {// hace una division entre 2 y devuelve el cociente
        return dividendo / 2;
    }

    public static int divisionResto(int dividendo) {// hace una division entre 2 y devuelve el resto

        return dividendo % 2;

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
