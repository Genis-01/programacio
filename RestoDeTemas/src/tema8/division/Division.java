package tema8.division;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
    int divisor, dividendo, cociente;

    
    public Division(int divisor, int dividendo) {
        this.divisor = divisor;
        this.dividendo = dividendo;
    }

    public void dividir(){
        try {
            Scanner scanner = new Scanner(System.in);
            this.dividendo = scanner.nextInt();
            this.cociente = this.divisor / this.dividendo;
            scanner.close();
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }

        

    }

    

}
