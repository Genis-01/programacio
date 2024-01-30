package tema7.futbolistaBonus;

public class Futbolista implements Comparable<Futbolista> {

    //declara las variables naecesarias
    String dni;
    String nombre;
    int edad;
    int ngoles;

    //un constructor para inicializar el objeto con todos los atributos
    public Futbolista(String dni, String nombre, int edad, int ngoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.ngoles = ngoles;
    }

    //sobrescribe el toString para que muestre todos los atributos de el objeto
    @Override
    public String toString() {
        return "dni: " + dni +" nombre: " + nombre + " edad: " + edad + " numero de goles: " + ngoles;
    }

    //compara si el toString de este objeto es igual al de otro objeto
    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

    //sobrescribe compareTo para que el dni sea el atributo de comparacion por defecto
    @Override
    public int compareTo(Futbolista o) {
        return this.dni.compareTo(o.dni);
    }


}
