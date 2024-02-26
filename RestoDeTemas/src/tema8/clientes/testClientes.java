package tema8.clientes;

public class testClientes {
    public static void main(String[] args) {
        App a = new App();

        
        a.nuevoCliente("41610389P", "pedro", "688336229");
        a.nuevoCliente("41610389P", "juan", "688336229");
        System.out.println(a.toString());
        a.salir();

    }
}
