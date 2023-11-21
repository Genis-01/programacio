package practica38;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    

        int nombre = 0;
        int SeNMul7 = 0;
        int falta = 0;
        

        Scanner sc = new Scanner(System.in); //declara un escaner

        System.out.println("escriu un nombre");
        nombre = sc.nextInt();  

        SeNMul7= nombre + (7-(nombre%7));
        falta= SeNMul7- nombre;

        
        
        System.out.println(falta); //muestra las notas por pantalla
        sc.close();
    }
}
