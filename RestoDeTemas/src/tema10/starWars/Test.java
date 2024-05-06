package tema10.starWars;

public class Test {

    public static void main(String[] args) {
        Jedi ObiWan = new Jedi("ObiWan", SableLaser.AZUL, false, 1000);
        Jedi Luke = new Jedi("ObiWan", SableLaser.AZUL, false, 10300);
        Jedi Yoda = new Jedi("Yoda", SableLaser.VERDE, false, 2000);
        Jedi Genis = new Jedi("Genis", SableLaser.AZUL, true, 999999999);
    }
}
