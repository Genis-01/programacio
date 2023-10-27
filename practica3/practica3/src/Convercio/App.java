package Convercio;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String opcion;
        String mensaje;
        double euros;
        double resultado; // declara las variables necesarias

        Scanner sc = new Scanner(System.in);

        System.out.println(
                "selecciona la opcion A para cambiar de euros a dolares o la B para cambiar de euros a libras esterlinas");
        opcion = sc.nextLine(); // le pide al usuario que elija la opcion A o B y guarda la respuesta en la
                                // variable opcion

        mensaje = (opcion.charAt(0) == 'A') ? "escribe la cantidad de euros que quieres convertir a dolares"
                : (opcion.charAt(0) == 'B') ? "escribe la cantidad de euros que quieres convertir a libras esterlinas"
                        : "la opcion no es valida prueva nuevamente";

        System.out.println(mensaje);
        euros = sc.nextDouble();// le pide al usuario la cantidad de euros que quiere convertir

        resultado = (opcion.charAt(0) == 'A') ? euros * 1.18 : (opcion.charAt(0) == 'B') ? euros * 0.90 : null; // calcula
                                                                                                                // la
                                                                                                                // conversion

        mensaje = (opcion.charAt(0) == 'A') ? euros + " euros son " + resultado + " dolares"
                : (opcion.charAt(0) == 'B') ? euros + " euros son " + resultado + " libras esterlinas" : "";
        System.out.println(mensaje);//muestra el resultado por pantalla si la opcion es correcta

        sc.close();
    }
}
