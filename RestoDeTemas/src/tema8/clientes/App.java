package tema8.clientes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;



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

    public void darDeBaja(){
        int c = buscarCliente();
        int j = 0;
        Cliente copia[];
        
        copia = Arrays.copyOf(this.clientes, this.clientes.length - 1);
        for (int i = 0; i < clientes.length; i++) {
            if (i != c) {
                copia[j] = clientes[i];
                j++;
            }
        }
        clientes = copia;
        
    }

    public int buscarCliente(){
        int c = -1;
        String busqueda;
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe el DNI del cliente");
        busqueda = sc.nextLine();
        
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i].dni.equals(busqueda)) {
                c = i;
            }
        }


        if (c == -1) {
            System.out.println("no se ha encontrado el cliente");
            c = buscarCliente();
        }
        sc.close();
        return c;
    }
    public void modificarCliente(){
                int cliente = buscarCliente();
                String nombre;
                String numeo;

                Scanner sc = new Scanner(System.in);

                System.out.println("escrebe el nombre del cliente");
                nombre = sc.nextLine();
                System.out.println("escrebe el nuero del cliente");
                numeo = sc.nextLine();
                sc.close();
                clientes[cliente] = new Cliente(clientes[cliente].dni, nombre, numeo);
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

    public void escribirFicheroArrayObjectToObject(Cliente clientes[], String fichero){
        
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
