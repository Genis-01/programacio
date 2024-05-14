package tema10.ac2;

import java.util.function.Consumer;

public class Test {


    public static void main(String[] args) {
        Cliente [] clientes = {
                new Cliente("pedro", 20),
                new Cliente("juan", 25),
                new Cliente("maria", 30),
                new Cliente("jose", 89),
                new Cliente("monica", 40),
        };
        Consumer<Cliente> printCliente = System.out::println;

        paraCada(clientes, printCliente);
    }



    static <T> void paraCada(T[] arrayP, Consumer<T> c) {
        for (T t : arrayP) {
            c.accept(t);
        }



    }
}
