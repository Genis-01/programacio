package tema7.futbolistaBonus;


import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        // cra dos objetos del los comparadores
        ComparadorEdadNombre cen = new ComparadorEdadNombre();
        // ComparadorNombre cn = new ComparadorNombre();
        // ComparadorEdad ce = new ComparadorEdad();

        //cra un aray de futbolistas
        Futbolista [] futbolistas = {
            new Futbolista("41610389P", "pablo", 30 , 27),
            new Futbolista("41610390Q", "juan", 20 , 39),
            new Futbolista("41610391R", "daniel", 30 , 28),
            new Futbolista("41610392S", "pau", 19 , 5),
            new Futbolista("41610323T", "marcos", 27 , 18),
        };

        //ordena el array por edad si la edad es la misma ordena por nombre
        Arrays.sort(futbolistas, cen);

        //muestra el array ordenado
        for (Futbolista futbolista : futbolistas) {
            System.out.println(futbolista);
        }
        System.out.println();

        // //ordena el array con el sort por defecto
        // Arrays.sort(futbolistas);

        // //muestra el array ordenado
        // for (Futbolista futbolista : futbolistas) {
        //     System.out.println(futbolista);
        // }
        // System.out.println();

        // //ordena el array con el sort por nombre
        // Arrays.sort(futbolistas, cn);

        // //muestra el array ordenado
        // for (Futbolista futbolista : futbolistas) {
        //     System.out.println(futbolista);
        // }
        // System.out.println();

        // //ordena el array con el sort por edad
        // Arrays.sort(futbolistas, ce);

        // //muestra el array ordenado
        // for (Futbolista futbolista : futbolistas) {
        //     System.out.println(futbolista);
        // }

        

        }
}
