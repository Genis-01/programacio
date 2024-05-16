package tema10.ac5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Stream;

import numeros.*;


public class Test {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numeros.add(Random.numeroInteger(100,1000));
        }

        Function<Integer, Boolean> de200a800 = num -> num >= 200 && num <= 800;


        Stream<Integer> a1= numeros.stream();
//        a1.filter(Test::esPrimo).forEach(System.out::println);


        System.out.println();

        Stream<Integer> a2= numeros.stream();
//        a2.filter(Test::esPrimo).sorted().forEach(System.out::println);

        System.out.println();

        Stream<Integer> a3= numeros.stream();
//        a3.filter(Test::esPrimo).sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }


    static boolean esPrimo(int n) {
        if (n == 1) {
            return false;
        }else if (n == 2) {
            return true;
        }else if (n > 2) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
