package tema5.compte_Corrent_5;

import java.util.Scanner;

public class Compte_Corrent {

    //crea las variables necesarias
    String dni;
    public static String banco = "caixa";
    public String nombre;
    private double saldo;
    gestors gestor;



    public static Scanner sc = new Scanner(System.in); //declara un scaner


    //constructor predeterminado, daunos valores por defecto
    Compte_Corrent(){
        
        this("Genis", "41610389P", 0);
    }


    //constructor con dni y saldo, al nombre se le da un valor none
    Compte_Corrent(String dni, double saldo){
        
        this("none", dni, saldo);
    }

    // constructor con todos los valores menos gestor
    Compte_Corrent(String nombre, String dni, double saldo){
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldo;
    }

    // constructor con todos los valores
    Compte_Corrent(String nombre, String dni, double saldo, gestors gestor){
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldo;
        this.gestor = gestor;
    }

    //getters y setters
    public static String getBanco() {
        return banco;
    }

    public static void setBanco(String banco) {
        Compte_Corrent.banco = banco;
    }

    
    //un funcion para sacar dinero de la cuenta
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

    //funcion para ingresar dinero en la cuenta
    public void ingreso(double cantidad) {
        
        if (cantidad >= 0) {
            this.saldo += cantidad;

        } else {
            System.out.println("el numero de dinero a ingresar no puede ser negativo");
        }
    }

    //funcion para mostrar toda la informacion, el gestor solo se mostrara si existe
    public void mostrarInformacion() {
        
        System.out.println("DNI: " + this.dni);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Banco: " + banco);
        //comprueba si existe un gestor
        if (gestor!= null) {
            System.out.println("Gestor: " + gestor.getNombre());
        }
        


    }



}