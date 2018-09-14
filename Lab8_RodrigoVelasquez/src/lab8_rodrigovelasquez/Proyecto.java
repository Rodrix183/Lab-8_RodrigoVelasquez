package lab8_rodrigovelasquez;

import java.util.ArrayList;

public class Proyecto {
    private String nombre;
    private int duracion;
    private ArrayList<Actividades>lista_actividades = new ArrayList<>();

    public Proyecto() {
    }

    public Proyecto(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Actividades> getLista_actividades() {
        return lista_actividades;
    }

    public void setLista_actividades(ArrayList<Actividades> lista_actividades) {
        this.lista_actividades = lista_actividades;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
