package tema9.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<String>();

        ts.add("Hola");
        ts.add("como");
        ts.add("Requete");
        ts.add("estás");
        ts.add("yo");
        ts.add("bien");

        System.out.println(ts.size());

        if (ts.contains("Requete")) {
            System.out.println("Requete existe en el TreeSet. ");
        }

        ts.remove("Requete");

        for (String valor : ts) {
            System.out.println(valor);
        }

        ts.clear();

        if (ts.size() == 0) {
            System.out.println("El TreeSet está vacío. ");
        } else {
            System.out.println("El TreeSet no está vacío. ");
        }

        String[] treeset = (String[]) ts.toArray(new String[ts.size()]);
        System.out.println("Si está vacío saldrá un 0: " + treeset.length);
    }
}
