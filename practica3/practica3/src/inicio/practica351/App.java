package practica351;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    

        double costat1 = 0;
        double costat2 = 0;
        double metros4 = 0;
        double metros4Jardi = 0;
        double metros4Casa = 0;
        double preuJardi = 0;
        double preuCasa = 0;
        double preuTotal = 0;   // declara las variables
        

        Scanner sc = new Scanner(System.in); //declara un escaner

        System.out.println("el tamaño de la parcela");
        costat1 = sc.nextDouble();   
        System.out.println("x");
        costat2 = sc.nextDouble();     //pide al usuario el tamaño de la parcela

        metros4 = costat1 * costat2;
        metros4Casa = metros4 * 0.8;
        metros4Jardi = metros4 * 0.2;
        preuCasa = metros4Casa * 100;
        preuJardi = metros4Jardi * 55;
        preuTotal = preuCasa + preuJardi;
        preuTotal = ( metros4Casa>150)? preuTotal * 1.1 : preuTotal ;    //hace los calculos y comprueba si se cumple la condicion del 10%



        
        System.out.println("la parcela costa " + preuTotal + ", " + preuJardi + " de jardi i " + preuCasa + " de zona edificable"); //muestra las notas por pantalla
        sc.close();
    }
}
