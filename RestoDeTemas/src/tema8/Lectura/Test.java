package tema8.Lectura;
// BufferedReader
// InputStreamReader
import java.io.*;
public class Test {
    public static void main(String[] args) {
        String texto = "";
        BufferedReader bf = null;
        FileReader fr = null;
        // Reader

        // FileReader

        try {
            fr = new FileReader("src\\Exemple\\Lectura\\prova.txt");
            bf = new BufferedReader(fr);
            String linia = bf.readLine();
            while (linia != null) {
                texto += linia + "\n";
                linia = bf.readLine();
            }
            // read()
            // close()
            
            int c = fr.read();

            while(c != -1) {
                texto += (char)c;
                c = fr.read();
            }
        } catch (FileNotFoundException e) {
            
            e.getMessage();
        } catch (IOException e) {
            System.out.println("Error de i/o: " + e.getMessage());
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(texto);
    }
}