package tema7.examen.cajas;

import java.util.Scanner;

public class Caja {
    double ancho;
    double largo;
    double alto;
    Unidades unidad;
    String etiqueta;
    
    public Caja(double ancho, double largo, double alto, Unidades unidad, String etiqueta) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
        this.unidad = unidad;
        setEtiqueta(etiqueta);

        
    }

    public double getVolumen() {
        return ancho * alto * largo;
    }




    public void setEtiqueta(String etiqueta) {
        if (etiqueta != null && etiqueta.length()>30){
            System.out.println("la longitud de la etiqueta no es la adequada, prueba a poner una que este entre 1 y 30 caracteres");
            Scanner scanner = new Scanner(System.in);
            setEtiqueta(scanner.nextLine());
            scanner.close();
        }else{

            this.etiqueta = etiqueta;
        }
    }

    
    public boolean equals(Caja obj) {
        return this.getVolumen() == obj.getVolumen();
    }

    @Override
    public String toString() {
        return "altura: " + this.alto + this.unidad + " /largo: " + this.largo + this.unidad + " /ancho " + this.ancho + this.unidad +" /volumen: " + this.getVolumen() + this.unidad + "3";
    }



}
