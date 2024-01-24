package tema6.circo;

public abstract class ArtistaCirco {
    String nombre;
    int edad;
    TipoActuacion tipoActuacion;


    public ArtistaCirco() {
    }

    public ArtistaCirco(String nombre, int edad, TipoActuacion tipoActuacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoActuacion = tipoActuacion;
    }

    abstract public void realizarActuacion();

    @Override
    public boolean equals(Object obj) {
        
        return this.toString().equals(obj.toString());
    }

    @Override
    public String toString() {
        return "nombre: " + this.nombre + ", edad: " + this.edad + ", tipoActuacion: " + this.tipoActuacion;
    
    }
}
