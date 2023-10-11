package practica332;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    

        double centimetros = 0;
        double metros = 220;
        double kilometros = 0;      //declara las variables para guardar los datos

        Scanner sc = new Scanner(System.in); //declara un escaner

        System.out.println("entra los metros");

        metros = sc.nextDouble();   //pide al usuario un valor para metros

        centimetros = metros * 100;
        kilometros = metros / 1000; //hace los cambios de unidades

        
        System.out.println(metros+ " metres són " + centimetros + "centímetres o " + kilometros + " quilòmetres."); //muestra el resultado por pantalla
    }
}
