package tema5.autoescola;

public class Autoescuelas {
    public boolean examenTeorico(boolean carnet) {
        if (carnet) {
            System.out.println("el alumno ya tiene el carnet");
            return true;
        } else {
            if (Math.random() == 0) {
                return false;
            } else {
                return true;
            }

        }
    }

    public boolean examenPractico(boolean carnet) {
        if (carnet) {
            System.out.println("el alumno ya tiene el carnet");
            return true;
        } else {
            if (Math.random() == 0) {
                return false;
            } else {
                return true;
            }

        }
    }

    public boolean darCarnet(boolean teoric, boolean practic, boolean carnet) {

        if (carnet) {
            System.out.println("el alumno ya tiene el carnet");
            return true;
        } else {
            if (teoric) {
                if (practic) {
                    System.out.println("se le ha dado el carnet al alumno");
                    return true;
                } else {
                    System.out.println("el alumno no tiene el practico aprobado");
                    return false;
                }

            } else {
                System.out.println("el alumno no tiene el teorico aprobado");
                return false;
            }
        }

    }
}
