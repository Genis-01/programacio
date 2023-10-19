package practicaz310;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String equip1;
        String equip2;
        String equip3;
        String equip4;
        int sorteo;
        int resultadoSeE1P1;
        int resultadoSeE2P1;
        int resultadoSeE1P2;
        int resultadoSeE2P2;
        int resultadoSE1;
        int resultadoSE2;
        

        Scanner sc = new Scanner(System.in); 
        
        System.out.println("escribe el nombre del primer equipo");
        equip1 = sc.nextLine();
        System.out.println("escribe el nombre del segundo equipo");
        equip2 = sc.nextLine();
        System.out.println("escribe el nombre del tercer equipo");
        equip3 = sc.nextLine();
        System.out.println("escribe el nombre del cuarto equipo");
        equip4 = sc.nextLine(); //pide al usuario el nombre de los 4 equipos


        sorteo = (int) (Math.random() * 3 + 2);// empareja a los equipos


        resultadoSeE1P1 = (int) (Math.random() * 10 + 1);
        resultadoSeE2P1 = (int) (Math.random() * 10 + 1);
        resultadoSeE1P2 = (int) (Math.random() * 10 + 1);
        resultadoSeE2P2 = (int) (Math.random() * 10 + 1); //genera los resultados de las semifinales

        resultadoSE1 = (resultadoSeE1P1 >= resultadoSeE2P1)? 1: sorteo;
        resultadoSE2 = (resultadoSeE1P2 >= resultadoSeE2P2)? 1: "";


    }
}