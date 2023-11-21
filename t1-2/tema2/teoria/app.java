package teoria;

import java.util.Arrays;

public class app {
    public static void main(String[] args) {

        // Estructuras de seleccion
        

            // condicion simple: if

                // if (condition) {
                // instrucciones...
                // }


            // if-else


                // if (condition) {
                //          instrucciones...
                // } else if{
                //          instrucciones...
                // }else{
                //          instrucciones...
                // }


            //switch

                // solo se pueden usar numeros string numeros enteros y variables convertibles en enteros.

                // switch (variable) {
                //     case valor:
                //         instrucciones...
                //         break;
                //     case valor:
                //         instrucciones...
                //         break;
                
                //     default:
                //         instrucciones...
                //         break;
                // }


                //opcion alternativa

                    // switch (variable) {
                    //     case valor ->{
                    //         instrucciones...
                    //     }
                    //     default ->
                    //         instrucciones...
                    // }

        //estructuras de repeticion

            //bucles controlado por condicion: while / do while

                // while se repite mientras la condicion sea cierta, se verifica antes de ejecutarse el codigo
                
                // while (condicion) {
                //        instrucciones...
                // }


            // do-while se repite mientras la condicion sea cierta, se verifica despues de ejecutarse el codigo

                // do {

                // } while (condition);
            

            //bucles controlado por controlador


                // for (int i = 0; i < args.length; i++) {

                //}
            

            //salidas anticipadas: break y continue

                //break: sale del bucle
                
                //continue: se salta la repeticion actual
        
        // bucles anidados

    //funciones 

        //static int numero = 0;
        //public static void 'nombre de la funcion'(){}


    // arrays


    // for each;

        // String [] ciudades = {"barcelona", "madrid", "valencia"};
                    
        // for (String ciudad : ciudades) {
        //     System.out.println("ciudad:" + ciudad);

        // }

    //equals(opject o)

            // int[] numeros = {1,2,3,4};
            // int[] otrosNumeros = {1,2,3,4};

            

            // boolean sonIguales = Arrays.equals(otrosNumeros, numeros);
            
            // System.out.println(sonIguales);
        
    //toString

            // int[] numeros = {1,2,3,4};
            // String arrayComoCadena = Arrays.toString(numeros);
            
            // System.out.println(arrayComoCadena);


    //sort()
            // int[] numeros = {1,5,4,2,3};
            // System.out.println(Arrays.toString(numeros));
            // Arrays.sort(numeros);
            // System.out.println(Arrays.toString(numeros));
    
    //binarySearch
            // int[] numeros = {1,2,3,4,5};
            // int indice = Arrays.binarySearch(numeros, 3);
            // System.out.println(indice);


    //fill()
            // int[] numeros = new int[5];
            // Arrays.fill(numeros, 0);
            // for (int numero : numeros) {
            //     System.out.println(numero);
            // }

    //copyOf()
            // int[] numeros = {1,2,3,4,5};
            // int[] copia = Arrays.copyOf(numeros, 3);

            // for (int numero : copia) {
            //     System.out.println(numero);
            // }

    // copyOfRange
        
            // int[] numeros = {1,2,3,4,5};
            // int[] copia = Arrays.copyOfRange(numeros, 1 ,4);
                    
            // for (int numero : copia) {
            //     System.out.println(numero);
            // }
    }

}
