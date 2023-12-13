package tema5.autoescola;

public class Test {

    // Este método es el punto de entrada del programa
    public static void main(String[] args) {
        // Crea una nueva instancia de la clase Autoescuelas
        Autoescuelas a_sac = new Autoescuelas();

        // Crea una nueva instancia de la clase Alumnos con el nombre "pedro" y pasa la instancia de la clase Autoescuelas
        Alumnos pedro = new Alumnos("pedro", a_sac);

        // Hace el examen teórico del estudiante "pedro"
        pedro.hacerExamenTeorico();
        // Hace el examen práctico del estudiante "pedro"
        pedro.hacerExamenPractico();
        // Comprueba si el estudiante "pedro" tiene el carnet
        pedro.comprobarCarnet();
        // Muestra los atributos del estudiante "pedro"
        pedro.mostrarInfo();

    }
}