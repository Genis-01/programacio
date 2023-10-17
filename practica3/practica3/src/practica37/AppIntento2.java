package practica37;

import java.util.Scanner;

public class AppIntento2 {
    public static void main(String[] args) {
    

        boolean lamparaEncufada = false;  // declara las variables
        boolean bombillaFundida = false;
        boolean interruptorEstropeado = true;
        boolean funciona = true;
        String respuesta;
        String pregunta;
        

        Scanner sc = new Scanner(System.in); 

        System.out.println("la lampara esta enchufada");
        lamparaEncufada = sc.nextBoolean();
        
        respuesta= (lamparaEncufada==false)? "enchufar lampara \n": "";

        System.out.print(respuesta);
        System.out.print(pregunta);
        


        

        
    }
}
