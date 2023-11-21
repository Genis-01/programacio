package practica_4_6;

import java.util.*;


public class activitat_4_6 {

    public static void main(String[] args) {

        int numero;
        int resto;
        int raiz;
        double resultadoRaiz;


        System.out.println(CajaDeHastag("este programa aprocsima a la raiz cuadrada mas cercana y muestra el resultado y el resto"));

        numero = PideYScaneaint(CajaDeHastag("escribe un numero"));//pide un numero al usuario


        resultadoRaiz = Math.sqrt(numero);
        raiz = numero;
        while (!doubleTieneDecimales(resultadoRaiz)) {
            
            raiz--;
            resultadoRaiz = Math.sqrt(raiz);
            

        }//aproxima a la raiz mas cercana
            
        resto = numero - raiz; //calcula el resto
       
        System.out.println("la raiz mas cercana es: "+raiz+" = "+resultadoRaiz +" y nos queda un resto de: "+resto);//muestra por pantalla toda la informacion

    }

    public static boolean doubleTieneDecimales(double numero){
        int numeroInt = (int)numero;
        if (numero-numeroInt==0) {
            return true;
        }else{
            return false;
        }

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
