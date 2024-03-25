package tema9.cleccionesYMapas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Test {

    static HashMap<String , Integer> map = new HashMap<String, Integer>();
    public static void main(String[] args) {
        
        String cadena = "hoolaaaa";
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Dame una cadena o pon 0 para salir del programa: ");
            cadena = sc.nextLine();

            if (map.containsKey(cadena)) {
                System.out.println("Existe en el caché. La cantidad de valores únicos es: " + map.get(cadena));
            } else {
                System.out.println("La cantidad de valores únicos es: " + contarCaracteresUnicos(cadena));
                
            }
        } while (!cadena.equals("0"));
        System.out.println(map.toString());
        sc.close();
    }
    public static int contarCaracteresUnicos(String cadena){
        int longitud = cadena.length();
        HashSet<Character> caracteresUnicos = new HashSet<Character>();
        HashSet<Character> caracteresRepetidos = new HashSet<Character>();
        int resultado;
        for (int i = 0; i < longitud; i++) {
            if (!caracteresUnicos.contains(cadena.charAt(i))) {
                caracteresUnicos.add(cadena.charAt(i));
            }else{
                caracteresRepetidos.add(cadena.charAt(i));
            }
        }
        resultado = caracteresUnicos.size() - caracteresRepetidos.size();
        map.put(cadena, resultado);
        return resultado;
    }
}
