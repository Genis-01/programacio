package tema9.teoria;

import java.util.*;


public class Teoria<T> {


    public static void main(String[] args) {
        // ArrayList<String> lista1 = new ArrayList<>();
        // Vector<String> lista2 = new Vector<>();
        // LinkedList<String> lista3 = new LinkedList<>();

        // List<String> lista4 = new ArrayList<>();

        //metodos basicos de list
        //add(Object ob) -> lista4.add("hola");
        //add(int pos, Object ob) -> lista4.add(5, "hola"); 
        //get(int pos) -> lista4.get(5);

        // lista4.add("hola");
        // lista4.add("como");
        // lista4.add("estas");

        // Teoria objTest = new Teoria();
        
        // objTest.mostrarElementosLista(lista4);

        // String elementoEliminado = "";
        // elementoEliminado = lista4.remove(1);

        // objTest.mostrarElementosLista(lista4);
        // System.out.println(elementoEliminado);


        // SET (conjunto)
        // HashSet / TreeSet / LinkedHashSet

        HashSet<String> hs = new HashSet<String>();  
        // TreeSet<String> ts = new TreeSet();
        // LinkedHashSet<String> lhs = new LinkedHashSet();

        // Set<String> shs = new HashSet();
        // Set<String> sts = new TreeSet();
        // Set<String> slhs = new LinkedHashSet();

        // Metosos de SET

        // boolean add(object ob)
        
        // if (hs.add("hola")) {
        //     System.out.println("insertado");
        // }else{
        //     System.out.println("el elemento ya existe");
        // }

        // int size()
        // object remove(object ob)

        //if (hs.remove("hola")){
        //}

        //boolean contains(object ob)
        //void clear()
        // boolean isEmpty()
        // Object[] toArray()
        // int addAll(Collection cole)

        insertar(hs, "hola");
        insertar(hs, "hola");
        insertar(hs, "patatas");
        insertar(hs, "Patatas");
        insertar(hs, "Solicitud");
        insertar(hs, "naranja");
        insertar(hs, "cykas");
        insertar(hs, "blyat");
        

        recoreSet(hs);
    }

    private  static <T> void insertar(Set<T> conjunto, T elemento){
        System.out.println("insertar elemento...");

        esperar(0.5);
        if (conjunto.add(elemento)) {
            System.out.println("elemento insertado"); 
        } else{
            System.out.println("el elemento ya existe");
        }
        
    }

    private static <T> void recoreSet(Set<T> conjunto){

        for (T elemento : conjunto) {
            System.out.println(elemento);
        }
    }

    private static void esperar(double tiempoEspera){
        tiempoEspera = tiempoEspera*1000;
        try {
            Thread.sleep((int) tiempoEspera);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // public void mostrarElementosLista(List<T> lista) {
    //     for (T string : lista) {
    //         System.out.println(string);
    //     }
    // }
}
