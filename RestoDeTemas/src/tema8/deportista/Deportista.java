package tema8.deportista;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Deportista implements Serializable {

    String dni; // DNI del deportista
    String nombre; // Nombre del deportista
    String numero; // Número de identificación del deportista
    final LocalDate fechaNacimiento; // Fecha de nacimiento del deportista
    Deportes deporte; // Deporte que practica el deportista

    // Constructor que acepta una fecha de nacimiento como LocalDate
    public Deportista(String dni, String nombre, String numero, LocalDate fechaNacimiento, Deportes deporte) {
        this.dni = dni;
        this.nombre = nombre;
        this.numero = numero;
        this.fechaNacimiento = fechaNacimiento;
        this.deporte = deporte;
    }

    // Constructor que acepta una fecha de nacimiento como String en formato "dd-MM-yyyy"
    public Deportista(String dni, String nombre, String numero, String fechaNacimiento, Deportes deporte) {
        this.dni = dni;
        this.nombre = nombre;
        this.numero = numero;
        // Parsear la cadena de fecha en el formato especificado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatter);
        this.deporte = deporte;
    }

    // Método para obtener el deporte del deportista
    public Deportes getDeporte() {
        return deporte;
    }

    // Método para obtener la edad del deportista
    public int getEdad() {
        // Calcular la diferencia entre la fecha de nacimiento y la fecha actual
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    // Método para obtener el nombre del deportista
    public String getNombre() {
        return nombre;
    }

    // Método toString para representar el objeto como una cadena de texto
    @Override
    public String toString() {
        return "DNI: " + dni + ", nombre: " + nombre + ", numero: " + numero + ", edad: " + this.getEdad() + ", deporte: " + this.getDeporte();
    }
}
