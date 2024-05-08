package tema9.examen21_22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import herramientasOld.*;
import tema9.examen21_22.Procedimiento.*;

public class Test {
    static List<Procedimiento> pro = new ArrayList<Procedimiento>();
    static List<Procedimiento> proAlfa = new ArrayList<Procedimiento>();
    static List<Procedimiento> proTiempo = new ArrayList<Procedimiento>();
    static List<String> inicialDescripcion = new ArrayList<String>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Interfaces.cls();
        rellenarInicialDescripcion();
        for (int i = 0; i < 5; i++) {
            pro.add(pedirProcedimiento());
        }
        System.out.println("presiona intro para ejecutar");
        sc.nextLine();
        ejecutar();

        Iterator<Procedimiento> it = pro.iterator();
        while (it.hasNext()) {
            Procedimiento proce = it.next();
            proAlfa.add(proce);
            proTiempo.add(proce);
        }
        pro.clear();
        
        Collections.sort(proAlfa, new CompararAlfa());
        Collections.sort(proTiempo, new CompararTiempo());

        System.out.println(1);
        for (Procedimiento pro : proAlfa){
            System.out.println(pro.toString());
        }
        System.out.println();
        for (Procedimiento pro : proTiempo){
            System.out.println(pro.toString());
        }
    }

    public static void rellenarInicialDescripcion() {
        inicialDescripcion.add("L");
        inicialDescripcion.add("P");
        inicialDescripcion.add("C");
        inicialDescripcion.add("M");
        inicialDescripcion.add("D");
    }

    public static Procedimiento pedirProcedimiento() {
        String descripcion;
        int tiempo;

        System.out.println("escribe la descripcion de el procedimiento");

        descripcion = sc.nextLine();
        if (descripcion.equals(inicialDescripcion.get(Procedimiento.contador))) {
            tiempo = getTiempo();
            Interfaces.cls();
            return new Procedimiento(descripcion, tiempo);
        } else {
            System.out.println("la descripcion no es valida");
            return pedirProcedimiento();
        }
    }

    public static int getTiempo() {
        System.out.println("escribe el tiempo de ejecucion");
        try {
            return Integer.parseInt(sc.nextLine());

        } catch (Exception e) {
            System.out.println("el valor no es valido");
            return getTiempo();
        }
    }

    public static void ejecutar() {
        System.out.println(pro.size());
        for (Procedimiento proced : pro) {
            Interfaces.cls();
            System.out.println("se esta ejecutando " + proced.descripcion);
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(proced.tiempoExecucuion*100);
                    System.out.print("#");
                }
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
