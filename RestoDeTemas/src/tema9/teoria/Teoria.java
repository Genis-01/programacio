package tema9.teoria;

import java.util.*;


public class Teoria<T> {


    public static void main(String[] args) {
        // ArrayList<String> lista1 = new ArrayList<>();
        // Vector<String> lista2 = new Vector<>();
        // LinkedList<String> lista3 = new LinkedList<>();

        List<String> lista4 = new ArrayList<>();

        //metodos basicos de list
        //add(Object ob) -> lista4.add("hola");
        //add(int pos, Object ob) -> lista4.add(5, "hola"); 
        //get(int pos) -> lista4.get(5);

        lista4.add("hola");
        lista4.add("como");
        lista4.add("estas");

        // Teoria objTest = new Teoria();
        
        // objTest.mostrarElementosLista(lista4);

        // String elementoEliminado = "";
        // elementoEliminado = lista4.remove(1);

        // objTest.mostrarElementosLista(lista4);
        // System.out.println(elementoEliminado);

        

    }

    public void mostrarElementosLista(List<T> lista) {
        for (T string : lista) {
            System.out.println(string);
        }
    }
}
