package tema5;

public class test {
    public static void main(String[] args) {

        Persona p = new Persona();
        Persona q = new Persona();
        p.nomber = "Joan";
        p.altura = 4.4;
        p.edad = 44;
        
        q.nomber = "Ines";
        q.altura = 1.80;
        q.edad = 23;


        p.saludar();
        p.caminar();
        p.cumpleAnyos();
        
        System.out.println(p.edad);
        System.out.println(q.edad);
    }
}
