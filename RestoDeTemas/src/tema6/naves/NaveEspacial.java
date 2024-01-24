package tema6.naves;

abstract public class NaveEspacial {

    //declara los atributos
    String nombre;
    int plazas;

    //constructor
    public NaveEspacial(String nombre, int plazas) {
        this.nombre = nombre;
        this.plazas = plazas;
    }

    //clase abstracta para despegar
    abstract public void despegar();

    //clase que hanuncia que la nave ha aterizado
    public void aterrizar(){
        System.out.println("la nave " + this.nombre + " ha aterrizado");
    }

    
    @Override
    //sobrescribe el toString para que combierta todos los datos de la nave en un string
    public String toString() {
        return "nombre: " + this.nombre + ", plazas: " + this.plazas;
    }

    
    @Override
    //sobrescribe le equals para que compruebe si dos naves son iguales
    public boolean equals(Object obj) {
        
        return this.toString().equals(obj.toString());
    }
}
