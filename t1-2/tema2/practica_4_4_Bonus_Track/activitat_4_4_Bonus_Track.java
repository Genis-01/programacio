package practica_4_4_Bonus_Track;

import java.util.Scanner;

public class activitat_4_4_Bonus_Track {
    public static void main(String[] args) {
        cls();
        
        System.out.println(Conversion(PideYScaneaint("escribe un numero")));
        
    }

    public static String Conversion(int numero){
        int cociente;
        int resto;
        String numeroBinarioInverso="";

        if (numero>1) {
            resto=numero%2;
            cociente=numero/2;
            numeroBinarioInverso = resto + numeroBinarioInverso;
            numeroBinarioInverso = Conversion(cociente) + numeroBinarioInverso;
            return numeroBinarioInverso;
        } else {
            numeroBinarioInverso = numero + numeroBinarioInverso;
            return numeroBinarioInverso;
        }
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
