package tema6.hora;

public class test {

    public static void main(String[] args) {
        
        // crea un objeto de hora
        Hora hora = new Hora();

        //asigna la hora
        System.out.println(hora.setMinuto(59));
        System.out.println(hora.setHora(24));

        //incrementa la hora en dos minutos
        hora.inc();
        hora.inc();


        //imprime la hora
        System.out.println(hora.toString());
        
    }
}
