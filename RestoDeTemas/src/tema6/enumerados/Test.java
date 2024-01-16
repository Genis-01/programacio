package tema6.enumerados;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        // DiasSemana padel = DiasSemana.LUNES;

        // System.out.println(padel);

        Scanner sc = new Scanner(System.in);

        String dia = sc.nextLine();

        // System.out.println(dia);

        DiasSemana diaPadel = DiasSemana.valueOf(dia);

        System.out.println(diaPadel);

        sc.close();
    }
}
