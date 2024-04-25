package tema10.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("pedro");
        Cliente c2 = new Cliente("juan");
        Cliente c3 = new Cliente("tomas");
        Cliente c4 = new Cliente("ivan");

        List<Cliente> list = new ArrayList<Cliente>();

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);

        //lambda
        Comparator<Cliente> comp = (o1, o2) -> o1.nombre.compareTo(o2.nombre);


        Collections.sort(list, comp);

        for (Cliente cliente : list) {
            System.out.println(cliente.nombre);
        }
    }
}
