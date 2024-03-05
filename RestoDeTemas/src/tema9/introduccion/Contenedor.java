package tema9.introduccion;

public class Contenedor<T> {
    
    private T miObjeto;

    public Contenedor(){

    }

    void guardar(T nuevo){
        miObjeto = nuevo;
    }

    T extraerObjeto() {
        T aux = miObjeto;
        miObjeto = null;
        return aux;
    }
}
