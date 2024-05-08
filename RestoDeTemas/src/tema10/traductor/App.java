package tema10.traductor;

import herramientasOld.*;

import java.util.Scanner;

public class App {
    public static int elegirIdioma(){
        Scanner sc = new Scanner(System.in);
        return Interfaces.menu("elije un idioma",new String[] {"Español","Frances"}, sc );
    }

}
