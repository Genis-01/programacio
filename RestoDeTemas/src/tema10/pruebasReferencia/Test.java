package tema10.pruebasReferencia;

import java.util.function.Function;

public class Test {

    public static void main(String[] args) {
        Function<Integer, Integer> f1 = Calculos::cubo;

        Calculos calc = new Calculos();

        Function<Integer, Integer> f2 = calc::cuadrado;
        Integer[] t = {1,2,3,4,5,6,7,8,9,10};
        Double[] c = new Double[t.length];


        Function<Integer, Double> raizCubica = Calculos::raizCubica;

        for (int i = 0; i < t.length; i++) {
            c[i] = raizCubica.apply(t[i]);
        }

        for (Double d : c) {
            System.out.println(d);
        }
        Calculos.aplicar(t, f2);


    }





}
