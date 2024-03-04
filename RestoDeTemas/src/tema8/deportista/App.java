package tema8.deportista;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public Deportista deportistas[]; // Arreglo de deportistas
    Scanner sc = new Scanner(System.in); // Scanner para entrada del usuario

    // Constructor de la clase
    public App() {
        // Leer los deportistas desde un archivo al iniciar la aplicación
        this.deportistas = leerFicheroArrayObjectToObject("RestoDeTemas\\src\\tema8\\deportista\\Deportistas.data");
    }

    // Método para agregar un nuevo deportista
    public void altaDeportista(String dni, String nombre, String numero, String fechaNacimiento, Deportes deporte) {
        Deportista copia[];
        // Crear una copia del arreglo de deportistas con espacio adicional para el nuevo deportista
        copia = Arrays.copyOf(this.deportistas, this.deportistas.length + 1);
        // Agregar el nuevo deportista a la copia del arreglo
        copia[copia.length - 1] = new Deportista(dni, nombre, numero, fechaNacimiento, deporte);
        // Asignar la copia actualizada al arreglo original
        this.deportistas = copia;
    }

    // Método para dar de baja a un deportista
    public void darDeBaja() {
        int c = buscarDeportista(); // Buscar el deportista a dar de baja
        int j = 0;
        Deportista copia[];

        // Crear una copia del arreglo de deportistas con espacio reducido
        copia = Arrays.copyOf(this.deportistas, this.deportistas.length - 1);
        // Copiar los deportistas excepto el deportista a dar de baja
        for (int i = 0; i < deportistas.length; i++) {
            if (i != c) {
                copia[j] = deportistas[i];
                j++;
            }
        }
        // Actualizar el arreglo de deportistas con la copia reducida
        deportistas = copia;
    }

    // Método para buscar un deportista por DNI
    public int buscarDeportista() {
        int c = -1; // Índice del deportista encontrado
        String busqueda;

        // Solicitar al usuario el DNI del deportista a buscar
        System.out.println("Escribe el DNI del deportista");
        busqueda = sc.nextLine();

        // Recorrer el arreglo de deportistas para buscar el DNI ingresado
        for (int i = 0; i < deportistas.length; i++) {
            if (deportistas[i].dni.equals(busqueda)) {
                c = i; // Almacenar el índice del deportista encontrado
            }
        }

        // Si no se encontró el deportista, solicitar nuevamente el DNI
        if (c == -1) {
            System.out.println("No se ha encontrado el deportista");
            c = buscarDeportista(); // Llamada recursiva para buscar nuevamente
        }

        return c;
    }

    // Método para modificar los datos de un deportista existente
    public void modificarDeportista() {
        int deportista = buscarDeportista(); // Buscar el deportista a modificar
        String nombre;
        String numeo;
        Deportes deporte = null;
        int opcion;
        boolean bucle = true;

        // Solicitar al usuario los nuevos datos del deportista
        System.out.println("Escribe el nombre del deportista");
        nombre = sc.nextLine();
        System.out.println("Escribe el número del deportista");
        numeo = sc.nextLine();

        // Bucle para solicitar el deporte que realiza el deportista
        while (bucle) {
            System.out.println("¿Qué deporte hace?");
            System.out.println("1. Natación");
            System.out.println("2. Remo");
            System.out.println("3. Vela");
            System.out.println("4. Waterpolo");
            try {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        deporte = Deportes.NATACION;
                        bucle = false;
                        break;
                    case 2:
                        deporte = Deportes.REMO;
                        bucle = false;
                        break;
                    case 3:
                        deporte = Deportes.VELA;
                        bucle = false;
                        break;
                    case 4:
                        deporte = Deportes.WATERPOLO;
                        bucle = false;
                        break;
                    default:
                        System.out.println("El input es incorrecto");
                        break;
                }
            } catch (Exception e) {
                System.out.println("El input es incorrecto");
            }
        }

        // Actualizar los datos del deportista en el arreglo
        deportistas[deportista] = new Deportista(deportistas[deportista].dni, nombre, numeo,
                deportistas[deportista].fechaNacimiento, deporte);
    }

    // Método para ordenar los deportistas por nombre
    public void ordenarNombre() {
        Arrays.sort(deportistas, Comparator.comparing(Deportista::getNombre));
    }

    // Método para ordenar los deportistas por edad
    public void ordenarEdad() {
        Arrays.sort(deportistas, Comparator.comparing(Deportista::getEdad));
    }

    // Método para leer un arreglo de deportistas desde un archivo
    public Deportista[] leerFicheroArrayObjectToObject(String fichero) {
        Deportista arr[] = new Deportista[0];

        // Leer el archivo y almacenar los deportistas en un arreglo
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            try {
                arr = (Deportista[]) ois.readObject(); // Leer el objeto del archivo
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            arr = new Deportista[0]; // En caso de error, retornar un arreglo vacío
        }
        return arr;
    }

    // Método para escribir un arreglo de deportistas en un archivo
    public void escribirFicheroArrayObjectToObject(Deportista deportistas[], String fichero) {

        // Escribir el arreglo de deportistas en el archivo
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(deportistas);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Método para realizar acciones de salida y guardar los datos
    public void salir() {
        sc.close(); // Cerrar el Scanner
        System.out.println(Arrays.toString(deportistas)); // Mostrar los deportistas

        // Guardar los deportistas en un archivo antes de salir
        escribirFicheroArrayObjectToObject(deportistas, "RestoDeTemas\\src\\tema8\\deportista\\Deportistas.data");
        System.exit(0); // Salir del programa
    }

    // Método para capitalizar la primera letra de una palabra
    public String capitalizar(String deporte) {
        return Character.toUpperCase(deporte.charAt(0)) + deporte.substring(1);
    }

    // Método para convertir el objeto App a una cadena de texto
    @Override
    public String toString() {
        String resultado = "";
        for (Deportista deportista : deportistas) {
            // Capitalizar el nombre del deporte
            String capitalizado = capitalizar(deportista.getDeporte().name().toLowerCase());
            // Reemplazar el nombre del deporte en la representación del deportista
            resultado += deportista.toString().replace(deportista.getDeporte().name(), capitalizado) + "\n";
        }
        return resultado;
    }
}
