package lab8_rodrigovelasquez;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdministrarActividades extends Thread {

    private String estado;
    private int duracion;
    private boolean vive;
    private boolean sigue;

    public AdministrarActividades(String estado, int duracion) {
        this.estado = estado;
        this.duracion = duracion;
        vive = true;
        sigue = true;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public void setSigue(boolean sigue) {
        this.sigue = sigue;
    }

    
    int c = 0;

    @Override
    public void run() {
        while (vive) {
            //System.out.println("OLABB");
            if (sigue) {
                c++;
                System.out.println(c);
                //c++;
            }
            if (duracion <= 0) {
                vive = false;
//                VentanaPrincipal vp = new VentanaPrincipal();
//                vp.lista_proyectos.get(c).getLista_actividades().get(c).setEstado("Terminado");
//                DefaultTableModel 
            }

            try {
                Thread.sleep(1000);
                duracion -= 1000;
            } catch (InterruptedException ex) {
            }
        }
        //estado = "Terminado";
        JOptionPane.showMessageDialog(null, estado);
    }

}
