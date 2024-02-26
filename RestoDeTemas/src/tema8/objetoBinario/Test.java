package tema8.objetoBinario;


import herramientas.*;

public class Test {

    public static void main(String[] args) {

        String fichero = "cancionPirata.data";
        String cancion = "";

        String estrofa = "con diezcañones por banda, \n";
        estrofa += "viento en popa a toda vela, \n";
        estrofa += "no corta el mar si no vuela, \n";
        estrofa += "un velero bergantin.";

        FicherosBinarios.escribirFicheroStringToObject(estrofa, fichero);

        String fichero2 = "patatas.data";

        String estrofa2 = "soy gay, \n";
        estrofa2 += "menti, \n";
        estrofa2 += "soy rasista, \n";

        FicherosBinarios.escribirFicheroStringToObject(estrofa2, fichero2);

        cancion = FicherosBinarios.leerFicheroStringToObject(fichero);

        System.out.println(cancion);
    }
}
