package tema7.examen.jornadaLaboral;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        
        JornadaLaboral [] jornadas  ={
        new JornadaLaboral("41610389P", "21/08/2023 14:45:00", "21/08/2023 20:45:00" ),
        new JornadaLaboral("41610389P", "20/08/2023 14:45:00", "21/08/2023 20:45:00" ),
        new JornadaLaboral("41610489P", "20/08/2023 14:45:00", "21/08/2023 20:45:00" ),
        };
        
        Arrays.sort(jornadas);
        System.out.println("array");
        for (JornadaLaboral jornadaLaboral : jornadas) {
            System.out.println(jornadaLaboral.toString());
        }
    }
}
