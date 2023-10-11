package practica341;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    

        int primerTrimestre = 0;
        int segonTrimestre = 0;
        int terseTrimestre = 0;    //declara las variables para guardar los datos
        int notavolleti;
        double notareal;

        Scanner sc = new Scanner(System.in); //declara un escaner

        System.out.println("entra les notes dels 3 trimestres");
        primerTrimestre = sc.nextInt();   
        segonTrimestre = sc.nextInt();
        terseTrimestre = sc.nextInt();      //pide al usuario las notas de los 3 trimestres

        notareal = (double)(primerTrimestre + segonTrimestre + terseTrimestre) / 3;
        notavolleti = (primerTrimestre + segonTrimestre + terseTrimestre) / 3;          //calcula las medias
        
        System.out.println("nota al volleti es: " + notavolleti + " i la nota amb desimals es: " + notareal); //muestra las notas por pantalla
    }
}
