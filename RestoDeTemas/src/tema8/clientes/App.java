package tema8.clientes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;



public class App {
    Cliente clientes[];

    public App() {

        clientes = leerFicheroArrayObjectToObject("RestoDeTemas\\src\\tema8\\clientes\\clientes.data");
    }

    public void nuevoCliente(String dni, String nombre, String numero) {
        Cliente copia[];
        copia = Arrays.copyOf(this.clientes, this.clientes.length + 1);
        copia[copia.length - 1] = new Cliente(dni, nombre, numero);
        this.clientes = copia;
    }

    public void modificarCliente(String busqueda, String dni, String nombre, String numeo){
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i].dni.equals(busqueda)) {
                clientes[i] = new Cliente(dni, nombre, numeo);
            }
        }
    }

    public Cliente[] leerFicheroArrayObjectToObject(String fichero) {
        Cliente arr[] = new Cliente[0];

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            try {
                arr = (Cliente[]) ois.readObject();
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            arr = new Cliente[0];
        }
        return arr;
    }

    public static void escribirFicheroArrayObjectToObject(Cliente clientes[], String fichero){
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(clientes);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        String stringClientes = "";

        for (Cliente cliente : clientes) {
            stringClientes += cliente.toString() + "\n";
        }
        return stringClientes;
    }

    public void salir() {

        System.out.println(Arrays.toString(clientes));

        escribirFicheroArrayObjectToObject(clientes, "RestoDeTemas\\src\\tema8\\clientes\\clientes.data");
        System.exit(0);
    }

}
