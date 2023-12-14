package tema5.examen.espectaculoDeMagia;

public class TrucoMagico {

    //atributos
    //----------------------------------------------------------------
    private String nombre;
    private int dificultad;
    private double espectacularidad;
    private static int contadorTrucos = 0;
    private double impacto;
    
    

    //constructores
    //----------------------------------------------------------------
    public TrucoMagico(String nombre, int dificultad, double espectacularidad) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.espectacularidad = espectacularidad;
        this.impacto = impacto();

    }
    //----------------------------------------------------------------


    //getters y setters
    //----------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public double getEspectacularidad() {
        return espectacularidad;
    }

    public void setEspectacularidad(double espectacularidad) {
        this.espectacularidad = espectacularidad;
    }

    public static int getContadorTrucos() {
        return contadorTrucos;
    }

    public static void setContadorTrucos(int contadorTrucos) {
        TrucoMagico.contadorTrucos = contadorTrucos;
    }

    public double getImpacto() {
        return impacto;
    }

    public void setImpacto(double impacto) {
        this.impacto = impacto;
    }
    //----------------------------------------------------------------


    //metodos
    //----------------------------------------------------------------
    public double impacto(){
        return this.espectacularidad * this.dificultad;
    }
    
    public void hacerTruco(){
        contadorTrucos++;
    }

    public void info(){
        System.out.println("impacto: " + impacto());
        System.out.println("echo: " + contadorTrucos); 
    }
    //----------------------------------------------------------------
}
