package tema6.herencia;

public class Empleado extends tema6.herencia.persona {
    double salario;
    boolean delMes;
    persona p = new persona();


    
    public Empleado(String nombre, int edad, double estatura, double peso, double salario, boolean delMes) {
        super(nombre, edad, estatura, peso);
        this.salario = salario;
        this.delMes = delMes;
    }

    @Override

    void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Salario: " + salario);
        System.out.println("Del Mes: " + (delMes ? "si" : "no"));
        
    }

    @Override
    
    public boolean equals(Object o) {
        Empleado e = (Empleado) o;
        
        boolean salida = false; 

        if (this.getNombre().equals(e.getNombre()) && this.edad == e.edad) {
            salida = true;
        }
        return salida;
    }

    public String toString() {
        return super.toString() + " " + salario;
    }
    
}
