package tema5.examen.espectaculoDeMagia;

import java.util.Arrays;

public class Mago {

    //atributos
    //----------------------------------------------------------------
    String nombre;
    TrucoMagico [] trucosRealicados = {};
    //----------------------------------------------------------------

    //constructores
    //----------------------------------------------------------------
    public Mago(String nombre) {
        this.nombre = nombre;
    }
    //----------------------------------------------------------------

    //metodos
    //----------------------------------------------------------------
    public void hacerTruco(TrucoMagico truco){
        this.trucosRealicados = Arrays.copyOf(this.trucosRealicados, this.trucosRealicados.length + 1);
        this.trucosRealicados[this.trucosRealicados.length - 1] = truco;
        truco.hacerTruco();
    }

    public void mostrarTrucosRealicados(){
        for (TrucoMagico a : trucosRealicados) {
            System.out.println("        " + a.getNombre());
        }
    }
    //----------------------------------------------------------------

}

    
