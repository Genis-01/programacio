package tema5.examen.espectaculoDeMagia;

public class TestEspectaculoMagico {

    public static void main(String[] args) {
        TrucoMagico desaparecer = new TrucoMagico("desaparecer", 5, 2.5);
        TrucoMagico aparecer = new TrucoMagico("aparecer", 9, 5);
        TrucoMagico adivinarCartas = new TrucoMagico("adivinar cartas", 2, 1);
        TrucoMagico explotar = new TrucoMagico("explotar", 10, 5);

        Mago pepe = new Mago("pepe");
        Mago pablo = new Mago("pablo");
        Mago sergio = new Mago("sergio");

        EspectaculoMagico espectaculo = new EspectaculoMagico("espectaculo");

        espectaculo.agregarMago(pepe);
        espectaculo.agregarMago(pablo);
        espectaculo.agregarMago(sergio);

        pepe.hacerTruco(desaparecer);
        pepe.hacerTruco(aparecer);

        pablo.hacerTruco(adivinarCartas);
        pablo.hacerTruco(explotar);

        sergio.hacerTruco(adivinarCartas);
        sergio.hacerTruco(explotar);

        espectaculo.mostrarIngormacion(); 

        desaparecer.info();
        aparecer.info();
        adivinarCartas.info();
        explotar.info();
    }
}
