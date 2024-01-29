package tema7.GestioSocisGimnas;

public interface Entrenador extends Soci {
    public void donarInstruccions(String instruccio);

    public void avaluarRendiment();

    public void realitzarEntrenamentPersonalitzat();

    public static String anunciarNouEntrenador(){
        return "Avui arriba un nou entrenador.";
    }

    default public void realitzarSeguiment(){
        System.out.println("Está haciendo un ejercicio.");
    }
}
