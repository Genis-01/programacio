package tema9.examen21_22;

import java.util.Comparator;



public class Procedimiento {

    public static class CompararAlfa implements Comparator<Procedimiento> {

        @Override
        public int compare(Procedimiento o1, Procedimiento o2) {
            return o1.descripcion.compareTo(o2.descripcion);
        }
    
    }

    public static class CompararTiempo implements Comparator<Procedimiento> {

        @Override
        public int compare(Procedimiento o1, Procedimiento o2) {
            return o1.tiempoExecucuion - o2.tiempoExecucuion;
        }
    
    }


    public static int contador = 0;
    int identificador;
    String descripcion;
    int tiempoExecucuion;

    public Procedimiento(String descripcion, int tiempoExecucuion) {
        this.identificador = contador;
        this.descripcion = descripcion;
        this.tiempoExecucuion = tiempoExecucuion;
        contador++;
    }

    @Override
    public String toString() {
        return identificador + ", " + descripcion + ", " + tiempoExecucuion;
    }
}

