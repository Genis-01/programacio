package tema6.hora_2;

public class Hora {

    // declara las variables
    int hora;
    int minuto; 


    // asigna un valor a la hora, tiene requisitos
    public boolean setHora(int hora) { 
        if (hora >=0 && hora <= 24) {
            this.hora = hora;
            return true;
        }else{
            return false;
        }
        
    }


    // asigna un valor a la minuto, tiene requisitos
    public boolean setMinuto(int minuto) { 
        if (minuto >=0 && minuto <= 59) {
            this.minuto = minuto;
            return true;
        }else{
            return false;
        }
    }


    //incrementa la hora en un minuto
    public void inc() { 
        if (this.minuto < 59){
            this.minuto++;
        }else{
            this.minuto = 0;
            if (this.hora < 23) {
                this.hora++;
            }else{
                this.hora = 0;
            }
        }
    }

    @Override //le da formato a la hora, listo para imprimir
    public String toString(){ 
        return String.format("%02d", hora) + ":" + String.format("%02d", minuto);
    }

}
