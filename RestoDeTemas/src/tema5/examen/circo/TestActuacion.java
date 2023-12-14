package tema5.examen.circo;

public class TestActuacion {
    public static void main(String[] args) {
        
        Actuacion a = new Actuacion(50);
        System.out.println("Actuacion:  " + a.getNombre());
        System.out.println("Artista:    " + a.getArtista());
        System.out.println("Duracion:   " + a.getDuracion());
        System.out.println("--------------------------------------");


        Actuacion b = new Actuacion("los patos", "pedro");
        System.out.println("Actuacion:  " + b.getNombre());
        System.out.println("Artista:    " + b.getArtista());
        System.out.println("Duracion:   " + b.getDuracion());
        System.out.println("--------------------------------------");
        


        Actuacion c = new Actuacion("los cerdos", "pepe", 120);
        System.out.println("Actuacion:  " + c.getNombre());
        System.out.println("Artista:    " + c.getArtista());
        System.out.println("Duracion:   " + c.getDuracion());
        System.out.println("--------------------------------------");
    }
}
