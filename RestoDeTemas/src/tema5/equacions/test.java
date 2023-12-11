package tema5.equacions;

public class test {

    public static void main(String[] args) {

        equa2Grad a = new equa2Grad(6,100,6);

        double [] solucion = a.resolver();

        for (double d : solucion) {
            System.out.println(d);
        }
    }
}
