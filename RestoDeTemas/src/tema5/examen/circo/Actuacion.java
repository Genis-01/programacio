package tema5.examen.circo;

public class Actuacion {

    //atributos
    //----------------------------------------------------------------
    private String nombre; // nombre de la actuacion
    private String artista; // nombre de el artista
    private int duracion; // duracion de la actuacion en minutos
    //----------------------------------------------------------------

    
    //constructores
    //----------------------------------------------------------------
    public Actuacion(int duracion) {
        this.nombre = "Presentador";
        this.artista = "presentacion";
        this.duracion = duracion;
    }
    public Actuacion(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = 60;
    }
    public Actuacion(String nombre, String artista, int duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
    }
    //----------------------------------------------------------------


    //getters
    //----------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }
    public String getArtista() {
        return artista;
    }
    public int getDuracion() {
        return duracion;
    }
    //----------------------------------------------------------------


    //metodos
    //----------------------------------------------------------------
    public void mostrarInformacion(){
        System.out.println("Nombre de la actuacion: " + nombre);
        System.out.println("Nombre del artista: "+ artista);
        System.out.println("Duracion de la actuacion" + duracion);
    }
}
