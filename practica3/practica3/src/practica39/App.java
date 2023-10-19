package practica39;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int numeroRandom = (int) (Math.random() * 100 + 1); // crea un numero random y lo guarda en la variable
        int numeroUser;
        String respuesta;

        //System.out.println(numeroRandom); //mostrar numero 

        Scanner sc = new Scanner(System.in); // declara un escaner

        System.out.println("este juego consiste en adivinar un numero en cuatro intentos.\n\n");

        System.out.println("intenta adivinar el numero!!!");
        numeroUser = sc.nextInt(); // pide un numero al usuario

        respuesta = (numeroRandom != numeroUser) ? "intentalo de nuevo" : "";
        System.out.println(respuesta);
        numeroUser = (numeroRandom != numeroUser) ? sc.nextInt() : numeroUser;// si el numero entrado anteriormente no
                                                                              // es corecto pide otro

        respuesta = (numeroRandom != numeroUser) ? "intentalo de nuevo" : "";
        System.out.println(respuesta);
        numeroUser = (numeroRandom != numeroUser) ? sc.nextInt() : numeroUser;// si el numero entrado anteriormente no
                                                                              // es corecto pide otro

        respuesta = (numeroRandom != numeroUser) ? "intentalo de nuevo" : "";
        System.out.println(respuesta);
        numeroUser = (numeroRandom != numeroUser) ? sc.nextInt() : numeroUser;// si el numero entrado anteriormente no
                                                                              // es corecto pide otro

        respuesta = (numeroRandom == numeroUser) ? "lo has adivinado" : "casi lo consigues";
        System.out.println(respuesta); // comprueba si el numero entrado es corecto y muestra el mensage acorde al
                                       // resultado

        sc.close();
    }
}