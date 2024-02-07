package guerra_de_barcos.barcos1_0;

import java.util.Scanner;

public class Juego {

    public TipoBarco elegirBarco() {
        int eleccion;

        System.out.println("================================================");
        System.out.println("que tipo de barco quieres?");
        System.out.println();
        System.out.println("1.PORTAAVION");
        System.out.println("2.SUBMARINO");
        System.out.println("3.DESTRUCTORE");
        System.out.println("4.FRAGATA");
        System.out.println("================================================");

        Scanner sc = new Scanner(System.in);
        eleccion = sc.nextInt();
        sc.close();
        switch (eleccion) {
            case 1:
                return TipoBarco.PORTAAVION;

            case 2:
                return TipoBarco.SUBMARINO;
                
            case 3:
                return TipoBarco.DESTRUCTORE;
                
            case 4:
                return TipoBarco.FRAGATA;
                

            default:
                return elegirBarco();
                
        }
    }

    public void elegirPosicionBarco() {
        System.out.println("================================================");
        System.out.println("elige la linea en la que quieres colocar el barco");
        System.out.println("================================================");
        

    }

    public void colocarBarco(Tablero tablero){
        

        TipoBarco barco = elegirBarco();


    }

}
