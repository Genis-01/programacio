package tema6.atletisme;

public class Atleta {
    String nombre;
    int edad;
    


    public Atleta() {
    }

    public Atleta(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString(){
        return "nombre: " + nombre + "\nedad: " + edad;
    }

    @Override
    public boolean equals(Object a){
        return this.toString().equals(a.toString());
    }
    
}
