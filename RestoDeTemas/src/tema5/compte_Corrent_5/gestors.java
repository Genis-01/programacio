package tema5.compte_Corrent_5;

public class gestors {

    private String nombre;
    private String teleforno;
    double maxImpAut;


    
    
    gestors(String nombre, String telefono){
        this(nombre, telefono, 10000);
    }
    gestors(String nombre, String telefono, double maxImpAut){

        this.nombre = nombre;
        this.teleforno = telefono;
        this.maxImpAut = maxImpAut;
    }


    public String getNombre() {
        return nombre;
    }


    public String getTeleforno() {
        return teleforno;
    }


    public void mostrarInformacion() {
        
        
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Nombre: " + this.teleforno);
        System.out.println("Nombre: " + this.maxImpAut);

    }
}
