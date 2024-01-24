package tema6.circo;

import java.util.Random;

public class TestCirco {

    public static void main(String[] args) {

        Acrobata a = new Acrobata("pedro", 20, TipoActuacion.ACROBATICO, "trapecio");
        Acrobata a2 = new Acrobata("pedro", 20, TipoActuacion.ACROBATICO, "trapecio");
        Malabarista m = new Malabarista("juan",90, TipoActuacion.MALABARES, 9);
        Malabarista m2 = new Malabarista("juan",90, TipoActuacion.MALABARES, 2);
        PallasoMalabarista p = new PallasoMalabarista("luis", 34, TipoActuacion.PALLASO, 3, "malo");

        System.out.println(a.equals(a2));
        System.out.println(m.equals(m2));

        ArtistaCirco[] Artistas = { a, m, p };

        DiasSemana[] diasSemana = DiasSemana.values();

        String[][] calendarioSemanal = new String[diasSemana.length][Artistas.length];

        Random aleatori = new Random();
        for (int i = 0; i < diasSemana.length; i++) {
            for (int j = 0; j < Artistas.length; j++) {
                if (aleatori.nextBoolean()) {
                    Artistas[j].realizarActuacion();
                    calendarioSemanal[i][j] = Artistas[j].getClass().getSimpleName();
                } else {
                    calendarioSemanal[i][j] = "No actuan";
                }
            }
        }

        // Mostramos el calendario.
        System.out.println("Calendario:");
        System.out.print("      ");
        for (DiasSemana dia : diasSemana) {
            System.out.printf("%-15s", dia);
        }
        System.out.println();
        for (int i = 0; i < Artistas.length; i++) {
            System.out.printf("%-6s", Artistas[i].getClass().getSimpleName());
            for (int j = 0; j < diasSemana.length; j++) {
                System.out.printf("%-15s", calendarioSemanal[j][i]);
            }
            System.out.println();
        }
    }

}
