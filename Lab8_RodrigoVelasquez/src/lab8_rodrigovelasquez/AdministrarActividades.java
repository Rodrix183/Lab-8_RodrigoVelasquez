package lab8_rodrigovelasquez;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AdministrarActividades extends Thread {

    private String estado;
    private int duracion;
    //private JTable tabla;
    private boolean vive;
    private boolean sigue;
    private int pos;
    private DefaultTableModel modelo;

    public AdministrarActividades(String estado, int duracion, DefaultTableModel modelo, int pos) {
        this.estado = estado;
        this.duracion = duracion;
        this.modelo = modelo;
        this.pos = pos;
        vive = true;
        sigue = true;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public void setSigue(boolean sigue) {
        this.sigue = sigue;
    }
    int c = 1;

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

            }

            try {
                Thread.sleep(1000);
                duracion -= 1000;
            } catch (InterruptedException ex) {
            }
        }
        estado = " Terminado";
        JOptionPane.showMessageDialog(null, estado);
        modelo.setValueAt(estado, pos, 5);
    }

}
