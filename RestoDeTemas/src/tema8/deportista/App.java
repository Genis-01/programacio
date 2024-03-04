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
    public Deportista deportistas[];
    Scanner sc = new Scanner(System.in);

    public App() {
        this.deportistas = leerFicheroArrayObjectToObject("RestoDeTemas\\src\\tema8\\deportista\\Deportistas.data");
    }

    public void altaDeportista(String dni, String nombre, String numero, String fechaNacimiento, Deportes deporte) {
        Deportista copia[];
        copia = Arrays.copyOf(this.deportistas, this.deportistas.length + 1);
        copia[copia.length - 1] = new Deportista(dni, nombre, numero, fechaNacimiento, deporte);
        this.deportistas = copia;
    }

    public void darDeBaja() {
        int c = buscarDeportista();
        int j = 0;
        Deportista copia[];

        copia = Arrays.copyOf(this.deportistas, this.deportistas.length - 1);
        for (int i = 0; i < deportistas.length; i++) {
            if (i != c) {
                copia[j] = deportistas[i];
                j++;
            }
        }
        deportistas = copia;

    }

    public int buscarDeportista() {
        int c = -1;
        String busqueda;

        System.out.println("escribe el DNI del deportista");
        busqueda = sc.nextLine();

        for (int i = 0; i < deportistas.length; i++) {
            if (deportistas[i].dni.equals(busqueda)) {
                c = i;
            }
        }

        if (c == -1) {
            System.out.println("no se ha encontrado el deportista");
            c = buscarDeportista();
        }

        return c;
    }

    public void modificarDeportista() {
        int deportista = buscarDeportista();
        String nombre;
        String numeo;
        Deportes deporte = null;
        int opcion;
        boolean bucle = true;

        System.out.println("escrebe el nombre del deportista");
        nombre = sc.nextLine();
        System.out.println("escrebe el nuero del deportista");
        numeo = sc.nextLine();

        while (bucle) {
            System.out.println("que deporte hace?");
            System.out.println("1. natacion");
            System.out.println("2. remo");
            System.out.println("3. vela");
            System.out.println("4. waterpolo");
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
                        System.out.println("el input es incorrecto");
                        break;
                }
            } catch (Exception e) {
                System.out.println("el input es incorrecto");
            }
        }

        deportistas[deportista] = new Deportista(deportistas[deportista].dni, nombre, numeo,
                deportistas[deportista].fechaNacimiento, deporte);
    }

    public void ordenarNombre() {
        Arrays.sort(deportistas, Comparator.comparing(Deportista::getNombre));
    }

    public void ordenarEdad() {
        Arrays.sort(deportistas, Comparator.comparing(Deportista::getEdad));
    }

    public Deportista[] leerFicheroArrayObjectToObject(String fichero) {
        Deportista arr[] = new Deportista[0];

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            try {
                arr = (Deportista[]) ois.readObject();
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            arr = new Deportista[0];
        }
        return arr;
    }

    public void escribirFicheroArrayObjectToObject(Deportista deportistas[], String fichero) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(deportistas);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void salir() {

        sc.close();
        System.out.println(Arrays.toString(deportistas));

        escribirFicheroArrayObjectToObject(deportistas, "RestoDeTemas\\src\\tema8\\deportista\\Deportistas.data");
        System.exit(0);
    }

    public String capitalizar(String deporte) {
        return Character.toUpperCase(deporte.charAt(0)) + deporte.substring(1);
    }

    @Override
    public String toString() {
        String resultado = "";
        for (Deportista deportista : deportistas) {
            String capitalizado = capitalizar(deportista.getDeporte().name().toLowerCase());
            resultado += deportista.toString().replace(deportista.getDeporte().name(), capitalizado);

        }
        return resultado;
    }

}
