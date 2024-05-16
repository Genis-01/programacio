package tema10.ac6;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        Predicate<Integer> numeroPositivo = numero -> numero >= 0;
        Predicate<Integer> entreMenos10Y10 = numero -> numero > -10 && numero < 10;


        for (int i = 0; i < 40; i++) {
            lista.add(numeros.Random.numeroInteger(-20,20));
        }

        ArrayList<Integer> positivos;

        Stream<Integer> a = lista.stream();
        positivos = a.filter(numeroPositivo).collect(Collectors.toCollection(ArrayList::new));
        positivos.forEach(System.out::println);

        ArrayList<Integer> negativos;

        Stream<Integer> b = lista.stream();
        negativos = b.filter(numeroPositivo.negate()).collect(Collectors.toCollection(ArrayList::new));
        negativos.forEach(System.out::println);

        Stream<Integer> c = lista.stream();
        c.filter(entreMenos10Y10).forEach(System.out::println);

    }
}
