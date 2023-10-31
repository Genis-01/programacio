package practica_4_2;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        String Entrada;
        String EntradaInvertida = "";
        int LargoNumero;
        boolean incorecta = false;
        boolean CapICua = true;

        Scanner sc = new Scanner(System.in);

        do {
            incorecta = false;
            System.out.println("pon un numero entre 0 y 9999");
            Entrada = sc.nextLine();

            LargoNumero = Entrada.length();
            if (LargoNumero > 4) {
                incorecta = true;
            }

            for (int i = LargoNumero - 1; i >= 0; i--) {
                if (Entrada.charAt(i) < 48 || Entrada.charAt(i) > 57) {
                    incorecta = true;
                    break;
                }
            }   

        } while (incorecta); //pide una eun numero y comprueba si el input es correcto, se repetira asta que el input sea correcto



        for (int i = LargoNumero - 1; i >= 0; i--) {
            EntradaInvertida += Entrada.charAt(i);
        }   //invierte la entrada

        for (int i = LargoNumero - 1; i >= 0; i--) {

            if (Entrada.charAt(i) != EntradaInvertida.charAt(i)) {
                CapICua = false;
                break;
            }
        }   //comprueba si la entrada y la entrada invertida son CapICuaes


        if (CapICua == true) {
            System.out.println("es cap i cua");
        } else {
            System.out.println("no es cap i cua");
        }   //comprueba si es cap i cua y muestra por pantalla el mensaje correspondiente

        sc.close();
    }

}