package tema8.deportista;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Deportista implements Serializable {

    String dni;
    String nombre;
    String numero;
    final LocalDate fechaNacimiento;
    Deportes deporte;

    public Deportes getDeporte() {
        return deporte;
    }
    public int getEdad(){
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
    public String getNombre() {
        return nombre;
    }
    


    public Deportista(String dni, String nombre, String numero, LocalDate fechaNacimiento, Deportes deporte) {
        this.dni = dni;
        this.nombre = nombre;
        this.numero = numero;
        this.fechaNacimiento = fechaNacimiento;
        this.deporte = deporte;
    }


    public Deportista(String dni, String nombre, String numero, String fechaNacimiento, Deportes deporte) {
        this.dni = dni;
        this.nombre = nombre;
        this.numero = numero;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatter);
        this.deporte = deporte;
        
    }


    




    @Override
    public String toString() {
        return "DNI: " + dni + ", nombre: " + nombre + ", numero: " + numero + ", edad: " + this.getEdad() + ", deporte: " + this.getDeporte();
    }
}
