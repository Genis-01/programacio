package tema10.interfacesFuncionales;

import java.util.function.Function;

public class test {
    public static void main(String[] args) {
        Integer[] numeros = {1,2,3,4,5,6,7,8,9,10};
        Double[] raices = new Double[10];

        Function <Integer, Double> f = x -> Math.sqrt(x);

        transformar(numeros, raices, f);

        for (Double raz : raices) {
            System.out.println(raz);
        }

    }
    static <T, V> V[] transformar(T[] original, V[] transformat, Function<T, V> f) {

        for (int i = 0; i < original.length; i++) {
            transformat[i] = f.apply(original[i]);
        }
        return transformat;

    }
}
