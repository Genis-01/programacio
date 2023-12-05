package tema5.compte_Corrent_3;

import java.util.Scanner;

public class Compte_Corrent {
    String dni;
    public String nombre;
    private double saldo;

    public static Scanner sc = new Scanner(System.in);

    Compte_Corrent(){
        
        this("Genis", "41610389P", 0);
    }
    Compte_Corrent(String dni, double saldo){
        
        this("none", dni, saldo);
    }

    Compte_Corrent(String nombre, String dni, double saldo){
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldo;
    }

    public void sacarDinero(double cantidad) {
        

        
        if (cantidad >= 0) {

            if (saldo >= cantidad) {
                this.saldo -= cantidad;
            } else {
                System.out.println("no tienes suficiente saldo");
            }
        } else {
            System.out.println("el numero de dinero a sacar no puede ser negativo");
        }
    }

    public void ingreso(double cantidad) {
        

        
        if (cantidad >= 0) {
            this.saldo += cantidad;

        } else {
            System.out.println("el numero de dinero a ingresar no puede ser negativo");
        }
    }

    public void mostrarInformacion() {
        

        System.out.println("DNI: " + this.dni);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Saldo: " + this.saldo);

    }

    



}
