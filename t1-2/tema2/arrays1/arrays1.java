package arrays1;

import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        
        String personajeUsuario;
        boolean coincide = false;

        System.out.println("escribe el nombre de un personaje de  Star Wars");
        Scanner sc = new Scanner(System.in);
        personajeUsuario = sc.nextLine();
        cls();
        sc.close();

        String[] personajes = {
            "Luke Skywalker",
            "Darth Vader",
            "Princesa Leia",
            "Han Solo",
            "Yoda"
            };
        for (String personaje : personajes) {
            if (personaje.equals(personajeUsuario)) {
                coincide = true;
            }
        }
        if (coincide) {
            System.out.println(personajeUsuario+" se ha encontrado");
        }else{
            System.out.println(personajeUsuario+" no se ha encontrado en la lista");
        }

    }

    

    public static String CajaDeHastag(String mensaje) {
        String hastag = "";
        for (int i = (mensaje.length() + 4); i > 0; i--) {
            hastag += "#";
        }
        return hastag + "\n# " + mensaje + " #\n" + hastag;
    }

  
        
        
        
    

    public static void cls() {// limpia la consola
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }

}

    

