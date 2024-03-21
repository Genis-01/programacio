package tema9.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(31, "HOLA");
        map.put(25, "ADIÓS");
        map.put(45, "BUENAS");
        map.put(18, "HELLO");
        map.put(99, "CIAO");

        map.replace(45, "KONBANWA");

        System.out.println(map.size());

        map.remove(18);

        System.out.println(map.get(99));

        for (Integer clave : map.keySet()) {
            System.out.println(clave);
        }

        for (String valor : map.values()) {
            System.out.println(valor);
        }

        if (map.containsKey(45)) {
            System.out.println("Existe la clave de índice 45. ");
        }

        map.clear();
    }
}
