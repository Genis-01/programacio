package ejemplos;

import java.util.Arrays;

public class Split {

    public static void main(String[] args) {
        String cadena = "hola mundo";
        String[] palabras = cadena.split(" ");
        System.out.println(Arrays.toString(palabras));
    }
}