package tema10.pruebasReferencia;

import java.util.function.Function;

public class Calculos {
    Integer cuadrado (Integer a){
        return a * a;

    }

    static Integer cubo (Integer x){
        return x * x * x;
    }

    static <T> void aplicar(T[] miArray, Function<T,T> m){
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = m.apply(miArray[i]);
        }
    }

    static Double raizCubica(Integer a){
        return Math.pow(a, (double) 1 /3);
    }

//    @Override
//    public String toString() {
//        return
//    }
}

