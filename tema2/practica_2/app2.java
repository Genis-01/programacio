package practica_2;

public class app2 {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
                System.out.print("tabla " + i + "\t\t");
        }
        System.out.println("\n");
        for (int i = 0; i <= 10; i++) {
            // System.out.println("tabla del " + i);
            for (int j = 0; j <= 10; j++) {

                System.out.print(j + "x" + i + "=" + j * i + "\t\t");
            }
            System.out.println();
        }
    }

}
