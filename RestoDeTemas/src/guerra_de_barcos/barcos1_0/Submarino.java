package guerra_de_barcos.barcos1_0;

public class Submarino extends BarcoGuerra{

    //añade el atributo sumergido
    boolean sumergido;

    //inicia la clase submarino con todos sus atributos
    public Submarino(String nombre, String[] casillas, String[] casillasNoTocadas, TipoBarco tipoBarco) {
        super(nombre, casillas, casillasNoTocadas, tipoBarco);
    }

    
}
