package tema9.introduccion;

public class test {
    public static void main(String[] args) {
        Contenedor<Integer> c = new Contenedor<>();

        c.guardar(15);

        Integer i = c.extraerObjeto();

        System.out.println(i);

        Contenedor<String> c2 = new Contenedor<>();

        c2.guardar("hola");

        String j = c2.extraerObjeto();

        System.out.println(j);

        Contenedor<Cliente> c3 = new Contenedor<>();

        Cliente cliente =  new Cliente("41610389P" , "Genis");

        c3.guardar(cliente);

        Cliente cliente2 = c3.extraerObjeto();

        System.out.println(cliente2.toString());


    }
}
