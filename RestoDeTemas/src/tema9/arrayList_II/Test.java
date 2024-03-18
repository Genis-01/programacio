package tema9.arrayList_II;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("naranja");
        list.add("verde");
        list.add("morado");
        list.add("azul");

        for (String color  : list) {
            System.out.println(color);
        }
        System.out.println();

        list.add(0 ,"blanco");
        

        System.out.println(list.get(1));
        System.out.println();

        list.set(1, "negro");

        list.remove(3);

        System.out.println(list.indexOf("azul"));
        System.out.println();


        Collections.sort(list);

        Collections.shuffle(list);

        Collections.reverse(list);

        Collections.swap(list, 0, 1);

        List<String> parte = list.subList(2, 5);

        for (String color  : parte) {
            System.out.println(color);
        }

        list.set(1, "magenta");

        ArrayList<String> copia = list;

        for (String color  : copia) {
            System.out.println(color);
        }

        list.clear();

        for (String color  : list) {
            System.out.println(color);
        }
        


        
        
    }
}
