package tema10.ac3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Test {

    public static void main(String[] args) {
        Function<Integer, Integer> cuadrado = x -> x * x;

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);


        for (Integer numero : transformar(numeros, cuadrado)) {
            System.out.println(numero);
        }
    }

    static <T, V> List<V> transformar(List<T> original, Function<T, V> f) {
        List<V> lista = new ArrayList<>();
        for (T t : original) {
            lista.add(f.apply(t));
        }
        return lista;
    }
}
