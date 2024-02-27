package tema8.clientes;

import java.util.Scanner;

public class testClientes {
    public static void main(String[] args) {
        App a = new App();
        int opcion;
        boolean b = true;
        Scanner sc = new Scanner(System.in);

        
            System.out.println("1. Añadir cliente\n" +
                    "2. Modificar Datos\n" +
                    "3. Dar de baja cliente\n" +
                    "4. Lista de clientes\n" +
                    "5. Salir");

            try {
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        String dni;
                        String nombre;
                        String numero;

                        System.out.println("escribe el DNI del cliente");
                        dni = sc.nextLine();
                        System.out.println("escribe el nombre del cliente");
                        nombre = sc.nextLine();
                        System.out.println("escribe el numero del cliente");
                        numero = sc.nextLine();

                        a.nuevoCliente(dni, nombre, numero);
                        break;
                    case 2:
                        a.modificarCliente();
                        break;
                    case 3:
                        a.darDeBaja();
                        break;
                    case 4:
                        System.out.println(a.toString());
                        break;
                    case 5:
                        a.salir();
                        break;

                    default:
                        System.out.println("valor invalido");
                        break;
                }
            } catch (Exception e) {
                System.out.println("valor invalido");
            }
            
            
        
        sc.close();
        a.salir();
    }
}
