package lab8_rodrigovelasquez;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AdministrarActividades extends Thread{

    private String estado;
    private int duracion;

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
    
    
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            
        }
    }
    
    
}
