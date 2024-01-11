package tema6.hora_3;

public class HoraExacta extends Hora {

    // declara la variable para guardar los segundos
    int segundo;

    // asigna un valor a la segundo, tiene requisitos
    public boolean setsegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
            return true;
        } else {
            return false;
        }
    }

    @Override // incrementa la hora en un segundo
    public void inc() {

        if (this.segundo < 59) {
            this.segundo++;
        } else {
            this.segundo = 0;

            if (this.minuto < 59) {
                this.minuto++;

            } else {
                this.minuto = 0;

                if (this.hora < 23) {
                    this.hora++;

                } else {
                    this.hora = 0;
                }
            }
        }

    }

    @Override // le da formato a la hora, listo para imprimir
    public String toString() {
        return String.format("%02d", hora) + ":" + String.format("%02d", minuto) + ":" + String.format("%02d", segundo);
    }

    // comprueba si las dos horas son iguales
    public boolean equals(HoraExacta hora) {
        return (this.hora == hora.hora && this.minuto == hora.minuto && this.segundo < hora.segundo);

    }
}