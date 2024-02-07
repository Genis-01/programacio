package tema7.examen.jornadaLaboral;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;



public class JornadaLaboral implements Comparable<JornadaLaboral> {
    String dni;
    LocalDateTime entrada;
    LocalDateTime salida;
    public JornadaLaboral(String dni, String entrada, String salida) {
        this.dni = dni;
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime fechasalida  = LocalDateTime.parse(salida, formato);
        LocalDateTime fechaentrada = LocalDateTime.parse(entrada, formato);
        
        this.salida = fechaentrada;
        this.entrada =fechasalida;
    }

    public long minutosTrabajadosJornada() {
        return this.salida.until(this.entrada, ChronoUnit.MINUTES);
    }

    public int compareTo(JornadaLaboral jornada) {

        if (this.dni.equals(jornada.dni)) {
            
            return this.entrada.compareTo(jornada.entrada);
        } else {
            
            return this.dni.compareTo(jornada.dni);
        }

    }

    @Override
    public String toString() {
        return ("DNI: " + dni + " /fecha entrada: " + entrada + " /fecha salida: " + salida + " /minutos trabajados: " + minutosTrabajadosJornada());
    }


}
