package verificacionEntradas;

import java.util.Arrays;
import java.util.Scanner;

public class VerificacionEntradas {
    public static void main(String[] args) {
        int numCasos;
        String entrada;
        int resultado[] = {};
        int resultados[] = {};
        int sumar = 0;

        Scanner leer = new Scanner(System.in);

        numCasos = leer.nextInt();

        for (int i = 0; i < numCasos; i++) {

            entrada = leer.next();
            String[] parts = entrada.split("");

            for (int j = 0; j < entrada.length(); j++) {

                if ((j + 1) % 2 != 0) {
                    int num = Integer.parseInt(parts[j]);

                    int menor = num;

                    if (j == entrada.length()) {
                        
                        for (int k = j ; k < entrada.length(); k++) {

                            if (Integer.parseInt(parts[k]) < menor) {
                                menor = Integer.parseInt(parts[k]);
                            }
                        }
                    }
                    

                    resultado = Arrays.copyOf(resultado, resultado.length + 1);
                    resultado[resultado.length - 1] = num * 3 + menor;

                } else {
                    int num = Integer.parseInt(parts[j]);

                    int mayor = num;

                    if (j == entrada.length()) {
                        
                        for (int k = j; k < 0; k--) {

                            if (Integer.parseInt(parts[k]) > mayor) {
                                mayor = Integer.parseInt(parts[k]);
                            }
                        }
                    }

                    resultado = Arrays.copyOf(resultado, resultado.length + 1);
                    resultado[resultado.length - 1] = num * 2 + mayor;
                }
            }
            for (int n : resultado) {
                sumar = sumar + n;
                
            }
            resultados = Arrays.copyOf(resultados, resultados.length + 1);
            resultados[resultados.length - 1] = sumar;
        }
        for (int n : resultados) {
            System.out.println(n);
        }
    }
}
