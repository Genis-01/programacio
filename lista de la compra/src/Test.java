
import java.util.ArrayList;
import java.util.Scanner;







public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = "";
        String fichero = "listaCompra.data";
        ArrayList<String> listaCompra = new ArrayList<>();

        System.out.println("**************************************************");
        System.out.println("introduce los productos en la lista de la compra");
        System.out.println("(pulse 0 e intro para salir y guardar los cambios");
        System.out.println("**************************************************");

        while (!entrada.trim().equals("0")){
            entrada = sc.nextLine();
            if(entrada.isEmpty()){
                System.out.println(" proporciona un producto que tenga sentido");
            } else if (!entrada.trim().equals("0")) {
                listaCompra.add(entrada);
                System.out.println("hay " + listaCompra.size() + " productos");
            }
        }
        sc.close();

        System.out.println("gracias por utilizar el programa");

        //grabar la lista en un fichero binario.

    }
}
