package tema6.atletisme;

public class TestAtletas {
    public static void main(String[] args) {
        Atleta a = new Atleta("juan", 20);
        Corredor c = new Corredor("pedro", 50, 8);
        Corredor c2 = new Corredor("sanchez", 30, 10);
        Saltador s = new Saltador("pepe", 25, 3);
        Saltador s2 = new Saltador("pepe", 25, 3);

        System.out.println(a.toString());
        System.out.println(c.toString());
        System.out.println(s.toString());

        System.out.println(c.equals(c2));
        System.out.println(s.equals(s2));


    }

}
