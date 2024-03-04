package tema8.deportista;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Crear una instancia de la clase App para gestionar los deportistas
        App a = new App();
        int opcion;
        boolean b1 = true; // Variable para controlar el bucle principal
        boolean b2 = true; // Variable para controlar el bucle secundario
        Scanner sc = new Scanner(System.in);

        // Bucle principal que muestra el menú y procesa las opciones
        while (b1) {
            b2 = true; // Restablecer b2 para el bucle secundario
        
            // Mostrar el menú de opciones
            System.out.println("1. Alta\n" +
                    "2. Baja\n" +
                    "3. Modificar datos\n" +
                    "4. Listar por nombre\n" +
                    "5. Listar por edad\n" +
                    "6. Salir");

            try {
                opcion = sc.nextInt(); // Leer la opción seleccionada por el usuario
                sc.nextLine(); // Limpiar el buffer del Scanner
                
                // Procesar la opción seleccionada
                switch (opcion) {
                    case 1: // Alta de un nuevo deportista
                        String dni;
                        String nombre;
                        String numero;
                        String fecha;
                        Deportes deporte = null;
                        int opcion2;

                        // Solicitar los datos del nuevo deportista al usuario
                        System.out.println("Escribe el DNI del deportista");
                        dni = sc.nextLine();
                        System.out.println("Escribe el nombre del deportista");
                        nombre = sc.nextLine();
                        System.out.println("Escribe el número del deportista");
                        numero = sc.nextLine();
                        System.out.println("Escribe la fecha de nacimiento del deportista");
                        fecha = sc.nextLine();

                        // Bucle secundario para solicitar el deporte del nuevo deportista
                        while (b2) {
                            System.out.println("¿Qué deporte hace?");
                            System.out.println("1. Natación");
                            System.out.println("2. Remo");
                            System.out.println("3. Vela");
                            System.out.println("4. Waterpolo");
                            try {
                                opcion2 = sc.nextInt(); // Leer la opción seleccionada por el usuario

                                // Asignar el deporte seleccionado al nuevo deportista
                                switch (opcion2) {
                                    case 1:
                                        deporte = Deportes.NATACION;
                                        b2 = false; // Salir del bucle secundario
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
                                        System.out.println("El input es incorrecto");
                                        break;
                                }
                            } catch (Exception e) {
                                System.out.println("El input es incorrecto");
                            }
                        }

                        // Agregar el nuevo deportista con los datos proporcionados
                        a.altaDeportista(dni, nombre, numero, fecha, deporte);
                        break;
                    case 2: // Baja de un deportista
                        a.darDeBaja();
                        break;
                    case 3: // Modificar datos de un deportista existente
                        a.modificarDeportista();
                        break;
                    case 4: // Listar deportistas ordenados por nombre
                        a.ordenarNombre();
                        System.out.println(a.toString()); // Mostrar la lista de deportistas
                        break;
                    case 5: // Listar deportistas ordenados por edad
                        a.ordenarEdad();
                        System.out.println(a.toString()); // Mostrar la lista de deportistas
                        break;
                    case 6: // Salir del programa
                        b1 = false; // Salir del bucle principal
                        break;
                    default:
                        System.out.println("Valor inválido");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Valor inválido");
            }
        }

        sc.close(); // Cerrar el Scanner
        a.salir(); // Realizar alguna acción de salida (según lo que haga el método salir())
    }
}
