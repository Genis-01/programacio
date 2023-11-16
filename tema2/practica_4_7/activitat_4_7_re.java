package practica_4_7;

import java.util.Scanner;

public class activitat_4_7_re {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double base;
        int exponente;
        double resultado;
        

        
        base = PedirNumeroReal("escribe un numero real");
        
        exponente = PideYScaneaint("escribe un numero senser no negatiu");

        

        resultado = Elevar(base, exponente, base);

        

        System.out.println(resultado);

        sc.close();
    }

    public static double Elevar(double base, int exponente, double a){


        double resultado= a;

        if(exponente>1){

            resultado = a;
            resultado = resultado * base;
            
            exponente--;
            
            resultado = Elevar(base, exponente,resultado);
           
        }else{
            return resultado;
        }
        return resultado;
    }

    public static double PedirNumeroReal(String mensaje) {
        double numero;
        System.out.println(CajaDeHastag(mensaje));
        
        
        while (!sc.hasNextDouble()) {
            cls();
            System.out.println("        *********");
            System.out.println("        * ERROR *");
            System.out.println("***************************");
            System.out.println("* el input no es correcto *");
            System.out.println("***************************");
            System.out.println("\n" + CajaDeHastag(mensaje));
            sc.nextLine();
        }
        numero = sc.nextDouble();
        cls();
        
        return numero;

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
        int numero = -1;
        System.out.println(CajaDeHastag(Mensaje));
        
        while (numero < 0) {

            while (!sc.hasNextInt()) {
                cls();
                System.out.println("        *********");
                System.out.println("        * ERROR *");
                System.out.println("***************************");
                System.out.println("* el input no es correcto *");
                System.out.println("***************************");
                System.out.println("\n" + CajaDeHastag(Mensaje));
                sc.nextLine();
            }
            numero = sc.nextInt();

            cls();
            System.out.println("        *********");
            System.out.println("        * ERROR *");
            System.out.println("***************************");
            System.out.println("* el input no es correcto *");
            System.out.println("***************************");
            System.out.println("\n" + CajaDeHastag(Mensaje));
            sc.nextLine();
        }
        cls();
        
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
