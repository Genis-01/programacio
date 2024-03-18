package tema9.arrayList_II;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // a) Crear un nuevo arrayList, agregar algunos colores e imprimir la colección iterando a través de todos los elementos del arrayList.
        ArrayList<String> list = new ArrayList<String>();
        list.add("naranja");
        list.add("verde");
        list.add("morado");
        list.add("azul");

        for (String color  : list) {
            System.out.println(color);
        }
        System.out.println();

        // b) Insertar un elemento en el arrayList en la primera posición.
        list.add(0 ,"blanco");
        

        // c) Recuperar un elemento (en un índice especificado) del arrayList.
        System.out.println(list.get(1));
        System.out.println();

        // d) Actualizar un elemento del arrayList por otro elemento.
        list.set(1, "negro");

        // e) Quitar el tercer elemento del arrayList.
        list.remove(3);

        // f) Buscar un elemento en concreto en el arrayList.
        System.out.println(list.indexOf("azul"));
        System.out.println();


        // g) Ordenar el arrayList alfabéticamente (método sort).
        Collections.sort(list);

        // h) Mezclar elementos en el arrayList.
        Collections.shuffle(list);

        // i) Invertir elementos en el arrayList.
        Collections.reverse(list);

        // j) Intercambiar dos elementos en el arrayList.
        Collections.swap(list, 0, 1);

        // k) Extraer una parte (rango) del arrayList.
        List<String> parte = list.subList(2, 5);

        for (String color  : parte) {
            System.out.println(color);
        }

        // l) Reemplazar el segundo elemento del ArrayList por otro.
        list.set(1, "magenta");

        // m) Copiar el arrayList en otro.
        ArrayList<String> copia = list;

        for (String color  : copia) {
            System.out.println(color);
        }

        // n) Vaciar el arrayList.
        list.clear();

        // o) Probar si el arrayList está vacío o no.
        for (String color  : list) {
            System.out.println(color);
        }
    }
}


        
    