package practica36b;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    

        double nombre = 0;  // declara las variables
        

        Scanner sc = new Scanner(System.in); //declara un escaner

        System.out.println("escriu un nombre");
        nombre = sc.nextDouble();       //pide y guarda el valor en la variable nombre
           
        nombre= Math.abs(nombre);   //calcula el valor absoluto

        
        System.out.println(nombre); //muestra el valor absoluto 
        sc.close();
    }
}
