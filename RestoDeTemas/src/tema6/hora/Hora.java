package tema6.hora;

public class Hora {
    int hora;
    int minuto;

    public boolean setHora(int hora) {
        if (hora >=0 && hora <= 24) {
            this.hora = hora;
            return true;
        }else{
            return false;
        }
        
    }

    public boolean setMinuto(int minuto) {
        if (minuto >=0 && minuto <= 59) {
            this.minuto = minuto;
            return true;
        }else{
            return false;
        }
    }

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

    public String toString(){
        return String.format("%02d", hora) + ":" + String.format("%02d", minuto);
    }

}
