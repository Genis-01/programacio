package practica331;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        

        double celsius = 0;
        double farenheid = 0;                   //declara las variables para guardar los datos

        Scanner sc = new Scanner(System.in);    //declara un escaner

        System.out.println("entra los grados farenheid");
        farenheid = sc.nextDouble();            //pide al usuario un valor para farenheid

        celsius =  ((farenheid - 32) * 5)/9;    //hace los cambios de unidades
        
        System.out.println(farenheid + " farenheid es igual a " + celsius + " centigrados");    //muestra el resultado por pantalla
    }
}
