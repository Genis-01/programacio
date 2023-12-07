

package tema5.compte_Corrent_5;



public class test {

    

    public static void main(String[] args) {


        gestors g1 = new gestors("pedro", "688 33 62 29", 0);

        Compte_Corrent p1 = new Compte_Corrent();
        p1.ingreso(4000);
        p1.sacarDinero(30);
        p1.mostrarInformacion();
        

        Compte_Corrent p2 = new Compte_Corrent("julen", "42610389P", 5000, g1 );
        p2.ingreso(4000);
        p2.sacarDinero(200);
        p2.mostrarInformacion();



        // System.out.println(Compte_Corrent.getBanco());
        // Compte_Corrent.setBanco("pedroSL");
        // System.out.println(Compte_Corrent.getBanco());

        // Compte_Corrent p1 = new Compte_Corrent();
        // p1.ingreso(4000);
        // p1.sacarDinero(30);
        // p1.mostrarInformacion();

        // Compte_Corrent p2 = new Compte_Corrent("julen", "42610389P", 5000);
        // p2.ingreso(4000);
        // p2.sacarDinero(200);
        // p2.mostrarInformacion();

        // Compte_Corrent p3 = new Compte_Corrent("42610386P", 9000);
        // p3.mostrarInformacion();

    }
    
}
