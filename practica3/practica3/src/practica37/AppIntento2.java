package practica37;

import java.util.Scanner;

public class AppIntento2 {
    public static void main(String[] args) {

        boolean lamparaEncufada; // declara las variables
        boolean bombillaFundida;
        boolean interruptorEstropeado;
        boolean funciona;
        String solucion;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nla lampara esta enchufada?\n");
        lamparaEncufada = sc.nextBoolean(); // pregunta si la lampara esta enchufada y guarda el estado en la bolean
                                            // lampamparaEnchufada

        solucion = (lamparaEncufada == false) ? "\nenchufa la lampara \nfunciona?\n" : "";
        System.out.print(solucion);
        funciona = (lamparaEncufada == false) ? sc.nextBoolean() : false; // comprueva si la lampara esta enchufada, si
                                                                          // no esta enchufado imprime por pantala la
                                                                          // solucion y pregunta si funciona y guarda la
                                                                          // respuesta en la variable funciona

        solucion = (funciona == false) ? "\nla bombilla esta fundida?\n" : "";
        System.out.print(solucion);
        bombillaFundida = (funciona == false) ? sc.nextBoolean() : false;// comprueba si la lampara funciona no hace
                                                                         // nada si no funciona pregunta al usuario si
                                                                         // la bombilla esta esta fundida y guarda la
                                                                         // respuesta en la variable bombillaFundida

        solucion = (funciona == false) ? (bombillaFundida == true) ? "\ncambiar bombilla \nfunciona?\n" : "" : "";
        System.out.print(solucion);
        funciona = (funciona == false) ? (bombillaFundida == true) ? sc.nextBoolean() : false : true;// comprueba si la lampara funciona no hace nada si no funciona comprueba si

        solucion = (funciona == false) ? "\nel interruptor esta estropeado?\n" : "";
        System.out.print(solucion);
        interruptorEstropeado = (funciona == false) ? sc.nextBoolean() : false;

        solucion = (funciona == false) ? (interruptorEstropeado == true) ? "\ncambiar interuptor \nfunciona?\n" : ""
                : "";
        System.out.print(solucion);
        funciona = (funciona == false) ? (interruptorEstropeado == true) ? sc.nextBoolean() : false : true;

        solucion = (funciona == false) ? "\ncompra una lampara nueva" : "\nproblema resuelto";

        System.out.println(solucion);

        sc.close();
    }
}
