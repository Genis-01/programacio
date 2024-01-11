package tema6.hora_3;

public class test {

    public static void main(String[] args) {
        
        // crea dos objeto de hora
        HoraExacta hora = new HoraExacta();
        HoraExacta hora2 = new HoraExacta();

        //asigna la hora a los dos objetos 
        System.out.println(hora.setsegundo(52));
        System.out.println(hora.setMinuto(59));
        System.out.println(hora.setHora(24));

        System.out.println(hora2.setsegundo(51));
        System.out.println(hora2.setMinuto(59));
        System.out.println(hora2.setHora(24));
        
        


        //imprime la hora
        System.out.println(hora.equals(hora2));
        
    }
}
