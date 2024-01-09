package tema6.hora;

public class test {

    public static void main(String[] args) {
        
        Hora hora = new Hora();

        System.out.println(hora.setMinuto(59));
        System.out.println(hora.setHora(24));
        hora.inc();
        hora.inc();

        System.out.println(hora.toString());
        
    }
}
