package practicaz310;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String equip1;
        String equip2;
        String equip3;
        String equip4;
        String ELoSe1;
        String EViSe1;
        String ELoSe2;
        String EViSe2;
        String ELoF;
        String EViF;
        String Ganador;
        int sorteo;
        int ReSeE1P1;
        int ReSeE2P1;
        int ReSeE1P2;
        int ReSeE2P2;
        int ReFELo;
        int ReFEVi;
        int GME1;
        int GME2;
        int GME3;
        int GME4;
        int GRE1;
        int GRE2;
        int GRE3;
        int GRE4; // declara las variables necesarias

        Scanner sc = new Scanner(System.in);

        System.out.println("escribe el nombre del primer equipo");
        equip1 = sc.nextLine();
        System.out.println("escribe el nombre del segundo equipo");
        equip2 = sc.nextLine();
        System.out.println("escribe el nombre del tercer equipo");
        equip3 = sc.nextLine();
        System.out.println("escribe el nombre del cuarto equipo");
        equip4 = sc.nextLine(); // pide al usuario el nombre de los 4 equipos

        sorteo = (int) (Math.random() * 3 + 2);
        ELoSe1 = equip1;
        EViSe1 = (sorteo == 2) ? equip2 : (sorteo == 3) ? equip3 : equip4;
        ELoSe2 = (sorteo == 2) ? equip3 : (sorteo == 3) ? equip4 : equip2;
        EViSe2 = (sorteo == 2) ? equip4 : (sorteo == 3) ? equip2 : equip3; // empareja a los equipos

        ReSeE1P1 = (int) (Math.random() * 10 + 1);
        ReSeE2P1 = (int) (Math.random() * 10 + 1);
        ReSeE1P2 = (int) (Math.random() * 10 + 1);
        ReSeE2P2 = (int) (Math.random() * 10 + 1); // genera los resultados de las semifinales

        ELoF = (ReSeE1P1 >= ReSeE2P1) ? ELoSe1 : EViSe1;
        EViF = (ReSeE1P2 >= ReSeE2P2) ? ELoSe2 : EViSe2;// comprueba los ganadores de las semifinales y
                                                        // los enpareja

        ReFELo = (int) (Math.random() * 10 + 1);
        ReFEVi = (int) (Math.random() * 10 + 1); // genera los resultados de las finales

        GME1 = (ELoSe1 == ELoF) ? ReSeE1P1 + ReFELo : ReSeE1P1;
        GME2 = (EViSe1 == ELoF) ? ReSeE2P1 + ReFELo : ReSeE2P1;

        GME3 = (ELoSe2 == EViF) ? ReSeE1P2 + ReFEVi : ReSeE1P2;
        GME4 = (EViSe2 == EViF) ? ReSeE2P2 + ReFEVi : ReSeE2P2;// calcula los goles anotados por
                                                               // cada equipo

        GRE1 = (ELoSe1 == ELoF) ? ReSeE2P1 + ReFEVi : ReSeE2P1;
        GRE2 = (EViSe1 == ELoF) ? ReSeE1P1 + ReFEVi : ReSeE1P1;

        GRE3 = (ELoSe2 == EViF) ? ReSeE2P2 + ReFELo : ReSeE2P2;
        GRE4 = (EViSe2 == EViF) ? ReSeE1P2 + ReFELo : ReSeE1P2;// calcula los goles recibidos por
                                                               // cada equipo

        Ganador = (ReFELo >= ReFEVi) ? ELoF : EViF;// comprueba que equipo ha ganado

        System.out.println( /*
                             * "\n\n\n\n" +ELoSe1 + "-->" + ReSeE1P1 +" --- "+ EViSe1 + "-->" +
                             * ReSeE2P1 +"   "+ ELoSe2 + "-->" + ReSeE1P2 +" --- "+ EViSe2 +
                             * "-->" + ReSeE2P2 + "\n" +
                             * ELoF + "-->" + ReFELo +" --- "+ EViF + "-->" + ReFEVi +
                             * "\n\n\n" +
                             */ // podria mostrar los resultados de todos los partidos

                "el equipo " + ELoSe1 + " ha marcado " + GME1 + " le han marcado " + GRE1 + "\n\n" +
                        "el equipo " + EViSe1 + " ha marcado " + GME2 + " le han marcado " + GRE2 + "\n\n" +
                        "el equipo " + ELoSe2 + " ha marcado " + GME3 + " le han marcado " + GRE3 + "\n\n" +
                        "el equipo " + EViSe2 + " ha marcado " + GME4 + " le han marcado " + GRE4 + "\n\n\n" +
                        "ha ganado " + Ganador); // imprime los resultados

        sc.close();
    }
}