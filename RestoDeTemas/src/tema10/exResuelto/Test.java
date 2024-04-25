package tema10.exResuelto;


import java.util.List;
public class Test {
    public static void main(String[] args) {

        
        Saludo<String> saludoNombres = s -> "hola " + s + "!";

        System.out.println(saludoNombres.saludar("juan")+"\n");


        Saludo<Cliente> saludoCliente = c -> "buenos dias " + c.nombre;
        
        System.out.println(saludoCliente.saludar(new Cliente("pedro")) +"\n");

        
        Cliente c1 = new Cliente("pedro");
        Cliente c2 = new Cliente("juan");
        Cliente c3 = new Cliente("bernat");
        Cliente c4 = new Cliente("sergio");

        List<String> saludos = Saludo.saludoGrupo(new Cliente[] {c1, c2, c3, c4});

        for (String string : saludos) {
            System.out.println(string);
        }
    }
}


//implementa un metodo estatico que recibe como parametros un array de tipo generico y un comparador para ese tipo, devuelve el valor maximo de los elementos segun el orden del comparador