package tema7.GestioSocisGimnas;

public class Test {
    public static void main(String[] args) {
        MembreGimnas a = new MembreGimnas(true, "genis", "Alto", "Pilates");

        a.avaluarRendiment();
        a.realitzarEntrenamentPersonalitzat();
        a.donarInstruccions("Hacer pesas");
        a.obtenirNom();
        System.out.println(a.assistencia);
        a.registrarAssistencia();
    }
}
