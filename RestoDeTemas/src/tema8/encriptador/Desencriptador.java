package tema8.encriptador;

import herramientasOld.Ficheros;

public class Desencriptador {

    public static void main(String[] args) {
        String ficheroEncriptado;
        String ficheroDesencriptado = "";
        String abecedarioEncriptado;
        String abecedario;

        //lee el fichero con el mensaje secreto y el fichero con el godigo de encriptacion
        ficheroEncriptado = Ficheros.leer("RestoDeTemas\\src\\tema8\\encriptador\\secreto.txt");
        abecedario = Ficheros.leerLinea("RestoDeTemas\\src\\tema8\\encriptador\\codec.txt", 1);
        abecedarioEncriptado = Ficheros.leerLinea("RestoDeTemas\\src\\tema8\\encriptador\\codec.txt", 2);

        //recorre todo el mensaje caracter por caracter
        for (int i = 0; i < ficheroEncriptado.length(); i++) {
            boolean encontrado = false;

            //recore el abecedario encriptado caracter por caracter
            for (int j = 0; j < abecedarioEncriptado.length(); j++) {

                //si el caracter de el mensaje secreto y el de el abecedario encriptado coinciden añade el caracter correspondiente al fichero desencriptado
                if (ficheroEncriptado.charAt(i) == abecedarioEncriptado.charAt(j)) {
                    ficheroDesencriptado += abecedario.charAt(j);
                    encontrado = true;
                }
            }

            //si el caracter no se ha encontrado escribira el caracter sin descodificarlo
            if (!encontrado) {
                ficheroDesencriptado += ficheroEncriptado.charAt(i);
            }
        }

        //imprime el mensaje descodificado
        System.out.println(ficheroDesencriptado);

    }

}
