package lab8_rodrigovelasquez;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AdministrarActividades extends Thread {

    private String estado;
    private int duracion;
    private boolean vive;
    private boolean sigue;

    public AdministrarActividades(String estado, int duracion) {
        this.estado = estado;
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    int c = 0;
    @Override
    public void run() {
        while (vive) {
            if (sigue) {
                System.out.println(c);
                c++;
            }
            if (duracion <= 0) {
                vive = false;
            }

            try {
                Thread.sleep(1000);
                duracion -= 1000;
            } catch (InterruptedException ex) {
            }
        }
        estado = "Terminado";
    }

}
