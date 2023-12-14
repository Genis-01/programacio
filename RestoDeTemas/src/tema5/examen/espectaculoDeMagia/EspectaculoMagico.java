package tema5.examen.espectaculoDeMagia;

import java.util.Arrays;

public class EspectaculoMagico {

    String nombre;
    Mago [] magos = {};

    EspectaculoMagico(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMago(Mago mago) {
        this.magos = Arrays.copyOf(this.magos, this.magos.length + 1);
        this.magos[this.magos.length - 1] = mago;
    }

    public void mostrarIngormacion(){
        for (Mago mago : this.magos) {
            System.out.println(mago.nombre + ":");
            mago.mostrarTrucosRealicados();
        }
    }
}
