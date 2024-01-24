package tema6.naves;

public class TestEspacial {

    public static void main(String[] args) {

        // crea objetos para hacer pruebas
        NaveGuerra guerra1 = new NaveGuerra("X-wing", 1, 4);
        NaveGuerra guerra2 = new NaveGuerra("X-wing", 1, 4);
        NaveGuerra guerra3 = new NaveGuerra("Y-wing", 1, 3);
        NaveExploradora exploradora1 = new NaveExploradora("aurora", 20, TiposPlaneta.HELADO);
        NaveExploradora exploradora2 = new NaveExploradora("aurora", 29, TiposPlaneta.HELADO);
        NaveExploradora exploradora3 = new NaveExploradora("aurora", 29, TiposPlaneta.ROCOSO);


        //despega 4 naves
        guerra1.despegar();
        guerra2.despegar();
        exploradora1.despegar();
        exploradora3.despegar();

        //aterriza 2 naves
        guerra2.aterrizar();
        exploradora2.aterrizar();

        //hace pruebas para ver si los equals de las naves de guera funcionan
        guerra1.equals(guerra2);
        guerra1.equals(guerra3);

        //hace pruebas para ver si los equals de las naves de exploracion funcionan
        exploradora1.equals(exploradora2);
        exploradora1.equals(exploradora3);

        //comprueba si los toString funcionan corectamente
        System.out.println(guerra1.toString());
        System.out.println(guerra3.toString());
        System.out.println(exploradora1.toString());
        System.out.println(exploradora3.toString());
    }

}
