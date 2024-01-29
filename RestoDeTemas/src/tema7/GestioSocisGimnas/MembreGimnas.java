package tema7.GestioSocisGimnas;

public class MembreGimnas implements Entrenador{

    boolean assistencia;
    String nombre;
    String rendiment;
    String entrenamiento;

    MembreGimnas(boolean assistencia, String nombre, String rendiment, String entrenamiento){
        this.assistencia = assistencia;
        this.nombre = nombre;
        this.rendiment = rendiment;
        this.entrenamiento = entrenamiento;
    }

    @Override
    public boolean registrarAssistencia(){
        return assistencia;
    }

    public void realitzarExercici(String exercici){
        System.out.println("Está realizando un ejercicio.");
    }

    public void obtenirNom(){
        System.out.println(nombre);
    }

    public void donarInstruccions(String instruccio){
        System.out.println("Está donant instruccións.");
    }

    public void avaluarRendiment(){
        System.out.println(rendiment);
    }

    public void realitzarEntrenamentPersonalitzat(){
        System.out.println("El entrenamiento personalizado será: " + entrenamiento);
    }

    public static String anunciarNouEntrenador(){
        return "Avui arriba un nou entrenador.";
    }

    public void realitzarSeguiment(){
        System.out.println("Está haciendo un ejercicio.");
    }
}
