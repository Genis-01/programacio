package tema5.compte_Corrent_3;

public class test {

    

    public static void main(String[] args) {


        

        Compte_Corrent p1 = new Compte_Corrent();
        p1.ingreso(4000);
        p1.sacarDinero(30);
        p1.mostrarInformacion();

        Compte_Corrent p2 = new Compte_Corrent("julen", "42610389P", 5000);
        p2.ingreso(4000);
        p2.sacarDinero(200);
        p2.mostrarInformacion();

        Compte_Corrent p3 = new Compte_Corrent("42610386P", 9000);
        p3.mostrarInformacion();

    }
    
}
