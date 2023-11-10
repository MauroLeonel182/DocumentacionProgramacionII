package ErlanMauroEntidades;

import java.util.Date;

// Se agrego asistente, es quien agenda los turnos
public class Asistente extends Persona {
    
    public Asistente(){
        this.setId(0);
        this.setApellido("");
        this.setNombres("");
        this.setFechaNacimiento(null);
    }
    
    public Asistente(int id, String apellido, String nombres, Date fechNac){
        super(id, apellido, nombres, fechNac);
    }
}
