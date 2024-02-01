package guerra_de_barcos.barcos1_0;

public class BarcoGuerra extends Barco {

    String casillasNoTocadas [];
    TipoBarco tipoBarco;
    int tamano;
    int tamanos [] = {4,3,2,1};
    

    public BarcoGuerra(String nombre, String[] casillas, String casillasNoTocadas [], TipoBarco tipoBarco) {
        super(nombre, casillas);
        this.casillasNoTocadas = casillasNoTocadas;
        this.tipoBarco = tipoBarco;
        this.tamano = this.tamanos[tipoBarco.ordinal()];
    }

    public String obtenerNombre(){
        return this.nombre;
    }

    public String [] obtenerCasillas(){
        return this.casillas;
    }

    @Override
    public String toString() {
        
        return super.toString() + "/ tipoBarco; " + tipoBarco + " casillasNoTocadas; " + casillasNoTocadas.toString();
    }
}
