package tema9.iterator_I;

import java.util.ArrayList;
import java.util.Iterator;

public class TiendaDeFrutas {
    ArrayList<Fruta> frutas = new ArrayList<Fruta>();

    public void anyadirFruta(String nombre, double precio) {
        frutas.add(new Fruta(nombre, precio));
        
    }

    public void eliminarFruta(String fruta) {
        Iterator<Fruta> it = frutas.iterator();
        while (it.hasNext()) {
            if (it.next().nombre.equals(fruta)) {
                it.remove();
            }
        }
    }

    public Double getPrecioTotal(){
        Double precio =0.0;
        for (Fruta fruta : frutas) {
            precio += fruta.precio;
        }
        return precio;
    }

    public Iterator<Fruta> iterator(){
        return frutas.iterator();
    }

    @Override
    public String toString() {
        String mensaje = "";
        for (Fruta fruta : frutas) {
            mensaje += fruta.toString() + "\n";
        }
        return mensaje;
    }

    
}
