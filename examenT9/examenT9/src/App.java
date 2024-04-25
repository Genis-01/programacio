import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class App {
    Map<Integer, Jugador> plantilla = new HashMap<Integer, Jugador>();

    public App() {
        this.plantilla = leerFichero("src\\plantilla.data");
    }
    public void salir(){
        escribirFichero(this.plantilla, "src\\plantilla.data");
    }

    

    public Map<Integer, Jugador> leerFichero(String fichero) {
        Map<Integer, Jugador> hMap = new HashMap<Integer, Jugador>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            try {
                hMap = (Map<Integer, Jugador>) ois.readObject();
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            hMap = new HashMap<Integer, Jugador>();
        }
        return hMap;
    }

    public void escribirFichero(Map<Integer, Jugador> hMap, String fichero){
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(hMap);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
