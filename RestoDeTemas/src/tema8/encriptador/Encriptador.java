package tema8.encriptador;


import herramientasOld.Ficheros;


public class Encriptador {
    
    public static void main(String[] args) {

        //define las variables necesarias
        String fichero;
        String ficheroEncriptado = "";
        String abecedario;
        String abecedarioEncriptado;

        //lee el fichero con el mensaje y el fichero con el godigo de encriptacion
        fichero = Ficheros.leer("RestoDeTemas\\src\\tema8\\encriptador\\mensaje.txt");
        abecedario = Ficheros.leerLinea("RestoDeTemas\\src\\tema8\\encriptador\\codec.txt", 1);
        abecedarioEncriptado = Ficheros.leerLinea("RestoDeTemas\\src\\tema8\\encriptador\\codec.txt", 2);

        //recorre todo el mensaje caracter por caracter
        for (int i = 0; i < fichero.length(); i++) {
            boolean encontrado = false;

            //recore el abecedario caracter por caracter
            for (int j = 0; j < abecedario.length(); j++) {
                
                //si el caracter de el mensaje y el de el abecedario coinciden añade el caracter correspondiente al fichero encriptado
                if (fichero.charAt(i) == abecedario.charAt(j)) {
                    ficheroEncriptado += abecedarioEncriptado.charAt(j);
                    encontrado = true;
                }
            }
            //si el caracter no se ha encontrado escribira el caracter sin codificarlo
            if (!encontrado) {
                ficheroEncriptado += fichero.charAt(i);
            }
        }

        //guarda el mensaje codificado en un fichero llamado secteto.txt
        Ficheros.escribir("RestoDeTemas\\src\\tema8\\encriptador\\secreto.txt", ficheroEncriptado);


    }
}