package tema9.practicaArrayList;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(20);
        list.add(3);
        list.add(15);
        list.add(13);
        list.add(4);
        list.add(33);
        list.add(41);
        list.add(5);
        list.add(2);

        System.out.println(sumaNumerosPares(list));

        ArrayList<String> list2 = new ArrayList<String>();

        list2.add("hola");
        list2.add("pedro");
        list2.add("genis");
        list2.add("mobiles");

        imprimirPalabrasConLongitudX(list2, 5);
    }

    public static int sumaNumerosPares(ArrayList<Integer> list){
        int sum = 0;
        for (Integer integer : list) {
            if (integer%2==0) {
                sum += integer;
            }
        }
        return sum;
    }

    public static void imprimirPalabrasConLongitudX(ArrayList<String> list, int longitud){
        for (String string : list) {
            if (string.length()==longitud) {
                System.out.println(string);
            }
        }
    }
}
