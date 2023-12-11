package tema5.equacions;


public class equa2Grad {
    double a;
    double b;
    double c;



    public equa2Grad(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }



    public double [] resolver(){

        if (b != 0 && c != 0) {

            double paso1;
            double paso2;
            double paso3;
            double paso41;
            double paso42;

            paso1 = (b * b - 4 * a * c);
            paso2 = (2 * a);
            paso3 = Math.sqrt(paso1);
            paso41 = ((-b + paso3) / paso2);
            paso42 = ((-b - paso3) / paso2);

            double[] solucion = {paso41, paso42};

            return solucion;

        } else if (b == 0){
            
            double paso1;
            double paso2;
            
            paso1 = Math.sqrt(-(c/a));
            paso2 = paso1 * -1;

            double[] solucion ={paso1, paso2};

            return solucion;

        } else if (c == 0) {
            
            double[] solucion = {0,-(b/a)};

            return solucion;
        }else {
            
            double[] solucion = {0};

            return solucion;

        }


    }
}
