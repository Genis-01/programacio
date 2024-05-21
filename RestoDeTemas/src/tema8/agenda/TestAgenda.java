package tema8.agenda;

import java.util.Scanner;

public class TestAgenda {

    public static void main(String[] args) {
        Agenda a = new Agenda();
        boolean b = true;
        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Nou contacte\n" +
                    "2. Buscar per nom\n" +
                    "3. Mostrar tots\n" +
                    "4. Sortir");
                    
            try {
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        String nombre;
                        String numero;

                        System.out.println("escribe el nombre del ");
                        nombre = sc.nextLine();
                        System.out.println("escribe el numero del contacto");
                        numero = sc.nextLine();

                        a.nuevoContacto(nombre, numero);
                        break;
                    case 2:
                        System.out.println("escribe la busqueda");
                        System.out.println(a.buscar(sc.nextLine()));

                        System.out.println("intro para ir al menu");
                        sc.nextLine();
                        break;
                    case 3:
                        System.out.println(a.toString());
                        break;
                    case 4:
                        a.salir();
                        break;

                    default:
                        System.out.println("valor invalido");
                        break;
                }

            } catch (Exception e) {
                System.out.println("valor invalido");
            }

        } while (b);
        sc.close();
    }
}
