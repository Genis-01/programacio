package tema9.iterator_I;

import java.util.Iterator;

import herramientas.*;

public class TestTienda {
    static TiendaDeFrutas t = new TiendaDeFrutas();

    public static void main(String[] args) {


        Interfaces.cls();

        anyadir();

        iterar();


        System.out.println("precio totoal " + t.getPrecioTotal());

    }

    public static void anyadir() {
        t.anyadirFruta("manzana", 2.5);
        t.anyadirFruta("pera", 2.5);
        t.anyadirFruta("naranja", 3.0);
        t.anyadirFruta("sandia", 5.0);
        t.anyadirFruta("melon", 4.0);
        t.eliminarFruta("naranja");
    }

    public static void iterar(){
        Iterator<Fruta> it = t.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    
    }
}
