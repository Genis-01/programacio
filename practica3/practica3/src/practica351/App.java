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
        double preuTotal = 0;
        boolean majorA150;

        Scanner sc = new Scanner(System.in); //declara un escaner

        System.out.println("entra les dos costats");
        costat1 = sc.nextDouble();   
        costat2 = sc.nextDouble();     //pide al usuario las notas de los 3 trimestres

        metros4 = costat1 * costat2;
        metros4Casa = metros4 * 0.8;
        metros4Jardi = metros4 * 0.2;
        preuCasa = metros4Casa * 100;
        preuJardi = metros4Jardi * 55;
        preuTotal = preuCasa + preuJardi;
        majorA150 = (preuTotal >150);



        
        System.out.println("la parcela costa " + preuTotal + ", " + preuJardi + " de jardi i " + preuCasa + " de la casa"); //muestra las notas por pantalla
    }
}
