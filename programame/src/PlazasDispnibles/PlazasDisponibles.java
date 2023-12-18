package PlazasDispnibles;
import java.util.Arrays;
import java.util.Scanner;

public class PlazasDisponibles {

    public static void main(String[] args) {
        
        
        int p, numCasos, europa, asia, africa, aNorte, aSur, aCentro, suma, resta;
        int resultado[] = {};

        

        Scanner leer = new Scanner(System.in);

        numCasos = leer.nextInt();



        for (int i = 0; i < numCasos; i++) {

            p = leer.nextInt();
            europa = leer.nextInt();
            asia = leer.nextInt();
            africa = leer.nextInt();
            aNorte = leer.nextInt();
            aSur = leer.nextInt();
            aCentro = leer.nextInt();

            suma = europa + asia + africa + aNorte + aSur + aCentro;
            resta = p - suma;


            resultado = Arrays.copyOf(resultado, resultado.length + 1);
            resultado[resultado.length - 1] = resta;
        }
        leer.close();

        for ( int t : resultado) {
            System.out.println(t);
        }
    }


}
