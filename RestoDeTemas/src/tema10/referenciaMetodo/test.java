package tema10.referenciaMetodo;

import java.util.function.Function;

public class test {

    Double numero = 16.00;

    Function<Double, Double> raiz = Math::sqrt;

    Double raizcuadrada = raiz.apply(numero);
}
