package tema10.ac7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Test {



    public static void main(String[] args) {
        Comparator<Client> nombre = Comparator.comparing(client -> client.nombre);

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(new Client("pedro", 20));
        clients.add(new Client("juan", 30));
        clients.add(new Client("maria", 40));

        Stream<Client> stream = clients.stream();

        stream.sorted(nombre).forEach(System.out::println);
    }
}
