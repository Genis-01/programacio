package tema9.arrayList;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();

        lista.add("hello");
        lista.add("world");
        lista.add("evil");
        lista.add("random");
        lista.add("value");
        lista.add("test");

        lista.set(2, "joe");
        
        System.out.println(lista.size());

        lista.remove(2);

        lista.remove("random");

        lista.get(3);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for (String string : lista) {
            System.out.println(string);
        }

        lista.contains("test");

        lista.clear();


    }
}
