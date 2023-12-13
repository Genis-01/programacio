package tema5.autoescola;

public class Autoescuelas {
    // Este método comprueba si un estudiante tiene el examen teórico y si lo tiene,
    // devuelve true
    public boolean examenTeorico(boolean teoric, boolean carnet) {
        // Si el estudiante tiene el carnet, imprime un mensaje y devuelve true
        if (carnet) {
            System.out.println("el alumno ya tiene el carnet");
            return true;
        }
        // Si el estudiante tiene el examen teórico, imprime un mensaje y devuelve true
        else if (teoric) {
            System.out.println("el alumno ya tiene el teorico");
            return true;
        }
        // De lo contrario, comprueba si el número aleatorio es menor que 0.5. Si es
        // así, devuelve false. En caso contrario, devuelve true
        else {
            if (Math.random() < .5) {
                return false;
            } else {
                return true;
            }

        }
    }

    // Este método comprueba si un estudiante tiene el examen práctico y si lo
    // tiene, devuelve true
    public boolean examenPractico(boolean teoric, boolean practic, boolean carnet) {
        // Si el estudiante tiene el carnet, imprime un mensaje y devuelve true
        if (carnet) {
            System.out.println("el alumno ya tiene el carnet");
            return true;
        }
        // Si el estudiante tiene el examen práctico, imprime un mensaje y devuelve true
        else if (practic) {
            System.out.println("el alumno ya tiene el practico");
            return true;
        }
        // Si el estudiante no tiene el examen teórico, imprime un mensaje y devuelve
        // false
        else if (!teoric) {
            System.out.println("no se puede hacer examen práctico si no tiene teorico");
            return false;
        }
        // De lo contrario, comprueba si el número aleatorio es menor que 0.5. Si es
        // así, devuelve false. En caso contrario, devuelve true
        else {
            if (Math.random() < .5) {
                return false;
            } else {
                return true;
            }

        }
    }

    // Este método comprueba si un estudiante tiene el examen teórico, el examen
    // práctico y si los tiene, devuelve true
    public boolean darCarnet(boolean teoric, boolean practic, boolean carnet) {
        // Si el estudiante ya tiene el carnet, imprime un mensaje y devuelve true
        if (carnet) {
            System.out.println("el alumno ya tiene el carnet");
            return true;
        }
        // De lo contrario, comprueba si el estudiante tiene el examen teórico y el
        // examen práctico. Si los tiene, y ambos están aprobados, imprime un mensaje y
        // devuelve true
        else {
            if (teoric && practic) {
                System.out.println("se le ha dado el carnet al alumno");
                return true;
            }
            // De lo contrario, imprime un mensaje y devuelve false
            else {
                System.out.println("el alumno no tiene el requisito para obtener el carnet");
                return false;
            }
        }
    }
}