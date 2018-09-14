package lab8_rodrigovelasquez;

import java.util.ArrayList;

public class Actividades {
    private String nombre;
    private int inicio_temp;
    private int duracion;
    private int final_temp;
    private int p_retraso;
    private ArrayList<Actividades> sucesores = new ArrayList<>();
    private ArrayList<Actividades> predecesores = new ArrayList<>();
    private String estado;

    public Actividades() {
    }

    public Actividades(String nombre, int inicio_temp, int duracion, int final_temp, int p_retraso, String estado) {
        this.nombre = nombre;
        this.inicio_temp = inicio_temp;
        this.duracion = duracion;
        this.final_temp = final_temp;
        this.p_retraso = p_retraso;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getInicio_temp() {
        return inicio_temp;
    }

    public void setInicio_temp(int inicio_temp) {
        this.inicio_temp = inicio_temp;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getFinal_temp() {
        return final_temp;
    }

    public void setFinal_temp(int final_temp) {
        this.final_temp = final_temp;
    }

    public int getP_retraso() {
        return p_retraso;
    }

    public void setP_retraso(int p_retraso) {
        this.p_retraso = p_retraso;
    }

    public ArrayList<Actividades> getSucesores() {
        return sucesores;
    }

    public void setSucesores(ArrayList<Actividades> sucesores) {
        this.sucesores = sucesores;
    }

    public ArrayList<Actividades> getPredecesores() {
        return predecesores;
    }

    public void setPredecesores(ArrayList<Actividades> predecesores) {
        this.predecesores = predecesores;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
