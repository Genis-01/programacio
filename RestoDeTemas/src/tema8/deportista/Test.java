package tema8.deportista;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        App a = new App();
        int opcion;
        boolean b1 = true;
        boolean b2 = true;
        Scanner sc = new Scanner(System.in);

        while (b1) {

            System.out.println("1. Alta\n" +
                    "2. Baja\n" +
                    "3. Modificar datos\n" +
                    "4. Listar por nombre\n" +
                    "5. Listar por edad\n" +
                    "6. Salir");

            try {
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        String dni;
                        String nombre;
                        String numero;
                        String fecha;
                        Deportes deporte = null;
                        int opcion2;

                        System.out.println("escribe el DNI del cliente");
                        dni = sc.nextLine();
                        System.out.println("escribe el nombre del cliente");
                        nombre = sc.nextLine();
                        System.out.println("escribe el numero del cliente");
                        numero = sc.nextLine();
                        System.out.println("escribe la fecha de nacimiento del cliente");
                        fecha = sc.nextLine();

                        while (b2) {
                            System.out.println("que deporte hace?");
                            System.out.println("1. natacion");
                            System.out.println("2. remo");
                            System.out.println("3. vela");
                            System.out.println("4. waterpolo");
                            try {
                                opcion2 = sc.nextInt();

                                switch (opcion2) {
                                    case 1:
                                        deporte = Deportes.NATACION;
                                        b2 = false;
                                        break;
                                    case 2:
                                        deporte = Deportes.REMO;
                                        b2 = false;
                                        break;
                                    case 3:
                                        deporte = Deportes.VELA;
                                        b2 = false;
                                        break;
                                    case 4:
                                        deporte = Deportes.WATERPOLO;
                                        b2 = false;
                                        break;

                                    default:
                                        System.out.println("el input es incorrecto");
                                        break;
                                }
                            } catch (Exception e) {
                                System.out.println("el input es incorrecto");
                            }
                        }

                        a.altaDeportista(dni, nombre, numero, fecha, deporte);
                        break;
                    case 2:
                        a.darDeBaja();
                        break;
                    case 3:
                        a.modificarDeportista();
                        break;
                    case 4:
                        a.ordenarNombre();
                        System.out.println(a.toString());
                        break;
                    case 5:
                        a.ordenarEdad();
                        System.out.println(a.toString());
                        break;
                    case 6:
                        b1 = false;
                        break;

                    default:
                        System.out.println("valor invalido");
                        break;
                }
            } catch (Exception e) {
                System.out.println("valor invalido");
            }

        }

        sc.close();
        a.salir();
    }
}
