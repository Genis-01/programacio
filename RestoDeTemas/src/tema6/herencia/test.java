package tema6.herencia;

public class test {
    public static void main(String[] args) {

        Empleado e = new Empleado("Joan", 453, 4534.2, 75.3, 5000, true);
        Empleado e2 = new Empleado("Joan", 453, 4534.2, 75.3, 5000, true);
    
        System.out.println(e.toString());

        System.out.println(e.equals(e2));
    }
}
