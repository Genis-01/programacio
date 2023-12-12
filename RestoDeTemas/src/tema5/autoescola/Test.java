package tema5.autoescola;

public class Test {

    

    public static void main(String[] args) {
        Autoescuelas a_sac =new Autoescuelas();

        Alumnos pedro = new Alumnos("pedro", a_sac);

        pedro.hacerExamenPractico();
        pedro.hacerExamenTeorico();
        pedro.comprobarCarnet();
    }
}
