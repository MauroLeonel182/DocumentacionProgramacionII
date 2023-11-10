package ErlanMauroEntidades;

import java.util.ArrayList;

public class Especialidad {
    
    private int id;
    private String nombre;
    private ArrayList<Turno> turnos;
    
    public Especialidad(){
        this.setId(0);
        this.setNombre("");
        this.setTurnos(new ArrayList<Turno>());
    }
    
    public Especialidad(int id, String nombre, ArrayList<Turno> turList){
        this.setId(id);
        this.setNombre(nombre);
        this.setTurnos(turList);
    }
    
    public Especialidad(int id, String nombre){
        this.setId(id);
        this.setNombre(nombre);
        this.setTurnos(new ArrayList<Turno>());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }
    
    
}
