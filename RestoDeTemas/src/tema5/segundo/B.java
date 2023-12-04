package tema5.segundo;


class B {

    int numeroB;
    private String nombre;
    

    B(int numeroB, String nombre){
        this.numeroB = numeroB;
        this.nombre = nombre;
    }

    void info(){
        System.out.println(numeroB);
        System.out.println(nombre);
    }
}
