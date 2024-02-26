package guerra_de_barcos.barcos1_0;

import java.util.Scanner;
import herramientas.*;

public class Juego {

    String filas;
    String colubnas;

    public Juego() {
        this.filas = Ficheros.leerLinea("RestoDeTemas\\src\\guerra_de_barcos\\barcos1_0\\coordenadas", 2);
        this.colubnas = Ficheros.leerLinea("RestoDeTemas\\src\\guerra_de_barcos\\barcos1_0\\coordenadas", 1);

    }

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

    public String pedirX() {
        Scanner sc = new Scanner(System.in);
        String x;

        System.out.println("===================================================");
        System.out.println("elige la colubna en la que quieres colocar el barco");
        System.out.println("===================================================");

        x = sc.nextLine();

        if (x.length() == 1) {
            if (!this.colubnas.contains(x)) {
                System.out.println("la posicion introducida no es valida");
                x = this.pedirX();
                
                
            }
        } else {
            System.out.println("la posicion introducida no es valida");
            x = this.pedirX();
        }
        sc.close();
        return x; 

    }

    public String pediry() {
        Scanner sc = new Scanner(System.in);
        String y;

        System.out.println("================================================");
        System.out.println("elige la fila en la que quieres colocar el barco");
        System.out.println("================================================");

        y = sc.nextLine();

        if (y.length() == 1) {
            if (!this.filas.contains(y)) {
                System.out.println("la posicion introducida no es valida");
                y = this.pediry();
            }
        } else {
            System.out.println("la posicion introducida no es valida");
            y = this.pediry();

        }
        sc.close();
        return y;

    }

    public boolean elegirOrientacion() {
        boolean orientacion;

        Scanner sc = new Scanner(System.in);

        System.out.println("====================");
        System.out.println("elige la orientacion");
        System.out.println("1. vertical");
        System.out.println("2. horizontal");
        System.out.println("====================");

        try {

            switch (sc.nextInt()) {
                case 1:
                    orientacion = true;
                    break;

                case 2:
                    orientacion = false;
                    break;

                default:
                    System.out.println("la opcion introducida no es valida");
                    orientacion = elegirOrientacion();
            }
        } catch (Exception e) {
            System.out.println("la opcion introducida no es valida");
            orientacion = elegirOrientacion();
        }

        sc.close();
        return orientacion;
    }

    public String[] elegirPosicionBarco(Tablero tablero) {

        

        String posicion[] = new String[] { pedirX(), pediry(), };
        return posicion;
    }

    // public void colocarBarco(Tablero tablero) {

    // TipoBarco barco = elegirBarco();

    // }

}
