package tema6.hora_2;

public class test {

    public static void main(String[] args) {
        
        // crea un objeto de hora
        HoraExacta hora = new HoraExacta();

        //asigna la hora
        System.out.println(hora.setMinuto(59));
        System.out.println(hora.setHora(24));

        //incrementa la hora en dos segundos
        hora.inc();
        hora.inc();
        


        //imprime la hora
        System.out.println(hora.toString());
        
    }
}
