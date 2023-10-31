package practica37;


public class App {
    public static void main(String[] args) {
    

        boolean lamparaEncufada = false;  // declara las variables
        boolean bombillaFundida = false;
        boolean interruptorEstropeado = true;
        boolean funciona = true;
        
        String respuesta;
        
        

        respuesta=(lamparaEncufada == false)?"enchufar lampara":
            (bombillaFundida ==true)? "cambiar bombilla":
            (interruptorEstropeado ==true)?  "cambiar interuptor":
            "comprar otra lampara";


        System.out.println(respuesta);  

        respuesta=(respuesta== "enchufar lampara")?
            (bombillaFundida ==true)? "cambiar bombilla":
            (interruptorEstropeado ==true)?  "cambiar interuptor":
            "comprar otra lampara": "";

        System.out.println(respuesta);
        
        respuesta=(respuesta== "cambiar bombilla")?
            (interruptorEstropeado ==true)?  "cambiar interuptor":
            "comprar otra lampara": "";
        
        System.out.println(respuesta);

        respuesta=(respuesta== "cambiar interuptor")?
            "": (funciona== false)?
            "comprar otra lampara": "";
        
        System.out.println(respuesta);
        System.out.println("problema resuelto");
    }
}
