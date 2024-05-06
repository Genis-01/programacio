package tema10.traductor;

import herramientas.*;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class App {
    public static int elegirIdioma(){
        Scanner sc = new Scanner(System.in);
        return Interfaces.menu("elije un idioma",new String[] {"Español","Frances"}, sc );
    }

}
